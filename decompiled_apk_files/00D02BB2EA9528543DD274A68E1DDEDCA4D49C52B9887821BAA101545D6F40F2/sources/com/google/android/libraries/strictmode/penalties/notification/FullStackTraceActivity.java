package com.google.android.libraries.strictmode.penalties.notification;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class FullStackTraceActivity extends Activity {
    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ScrollView scrollView = new ScrollView(this);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        scrollView.addView(linearLayout);
        if (getIntent().hasExtra("com.google.android.libraries.strictmode.EXTRA_SIMPLE_TEXT")) {
            TextView textView = new TextView(this);
            textView.setGravity(1);
            textView.setText("Simple stack trace");
            textView.setTextSize(2, 18.0f);
            linearLayout.addView(textView);
            TextView textView2 = new TextView(this);
            textView2.setMovementMethod(new ScrollingMovementMethod());
            textView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            textView2.setPadding(0, 0, 0, 40);
            textView2.setText(getIntent().getStringExtra("com.google.android.libraries.strictmode.EXTRA_SIMPLE_TEXT"));
            textView2.setTextIsSelectable(true);
            textView2.setTypeface(Typeface.create("monospace", 0));
            textView2.setTextSize(9.0f);
            linearLayout.addView(textView2);
        }
        TextView textView3 = new TextView(this);
        textView3.setText("Full stack trace");
        textView3.setGravity(1);
        textView3.setTextSize(2, 18.0f);
        linearLayout.addView(textView3);
        TextView textView4 = new TextView(this);
        textView4.setMovementMethod(new ScrollingMovementMethod());
        textView4.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        textView4.setTextIsSelectable(true);
        textView4.setTypeface(Typeface.create("monospace", 0));
        textView4.setTextSize(9.0f);
        linearLayout.addView(textView4);
        setContentView(scrollView);
        if (getIntent().hasExtra("android.intent.extra.TEXT")) {
            textView4.setText(getIntent().getStringExtra("android.intent.extra.TEXT"));
            return;
        }
        throw new IllegalArgumentException("Missing text.");
    }
}
