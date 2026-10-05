package eog.flv.fu;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    private int dp(int value) {
        return (int) (value * getResources().getDisplayMetrics().density + 0.5f);
    }

    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);

        getWindow().setStatusBarColor(Color.rgb(15, 20, 27));
        getWindow().setNavigationBarColor(Color.rgb(15, 20, 27));

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setGravity(Gravity.CENTER);
        root.setPadding(dp(24), dp(24), dp(24), dp(24));
        root.setBackgroundColor(Color.rgb(15, 20, 27));

        // شعار علوي
        TextView badge = new TextView(this);
        badge.setText("KLENCOD JAVA");
        badge.setTextColor(Color.rgb(88, 166, 255));
        badge.setTextSize(12);
        badge.setGravity(Gravity.CENTER);
        badge.setLetterSpacing(0.08f);
        root.addView(badge, new LinearLayout.LayoutParams(-1, dp(30)));

        // العنوان
        TextView title = new TextView(this);
        title.setText("Fobk");
        title.setTextColor(Color.WHITE);
        title.setTextSize(27);
        title.setGravity(Gravity.CENTER);
        title.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        root.addView(title, new LinearLayout.LayoutParams(-1, dp(54)));

        // الوصف
        TextView subtitle = new TextView(this);
        subtitle.setText("مرحباً بك في تطبيقك الأول");
        subtitle.setTextColor(Color.rgb(154, 168, 183));
        subtitle.setTextSize(15);
        subtitle.setGravity(Gravity.CENTER);
        LinearLayout.LayoutParams subtitleParams =
                new LinearLayout.LayoutParams(-1, -2);
        subtitleParams.topMargin = dp(8);
        root.addView(subtitle, subtitleParams);

        // الحالة
        TextView status = new TextView(this);
        status.setText("المشروع جاهز — ابدأ بتعديل MainActivity.java");
        status.setTextColor(Color.rgb(63, 185, 80));
        status.setTextSize(13);
        status.setGravity(Gravity.CENTER);
        LinearLayout.LayoutParams statusParams =
                new LinearLayout.LayoutParams(-1, -2);
        statusParams.topMargin = dp(24);
        root.addView(status, statusParams);

        // زر تجريبي
        final Button button = new Button(this);
        button.setText("اضغط هنا");
        button.setAllCaps(false);
        button.setTextColor(Color.WHITE);
        button.setTextSize(15);

        GradientDrawable buttonBg = new GradientDrawable();
        buttonBg.setColor(Color.rgb(35, 134, 54));
        buttonBg.setCornerRadius(dp(14));
        button.setBackground(buttonBg);
        button.setElevation(dp(2));

        button.setOnClickListener(v ->
                status.setText("أحسنت! ابدأ بكتابة كودك الآن")
        );

        LinearLayout.LayoutParams buttonParams =
                new LinearLayout.LayoutParams(-1, dp(50));
        buttonParams.topMargin = dp(28);
        root.addView(button, buttonParams);

        setContentView(root);
    }
}