package com.google.android.gms.gmscompliance.ui;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.gmscompliance.ui.UncertifiedDeviceActivity;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class UncertifiedDeviceActivity extends oa {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, defpackage.abp, defpackage.gb, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (TextUtils.isEmpty("glif_v3_light")) {
            i = 0;
        } else {
            if (alxj.a == null) {
                alxi alxiVar = new alxi();
                alxiVar.a = 2132083544;
                alxiVar.b();
                alxj.a = alxiVar.a();
            }
            alxi alxiVar2 = new alxi(alxj.a);
            alxiVar2.a = 0;
            alxiVar2.b();
            i = true != alxiVar2.a().d ? 2132083551 : 2132083550;
        }
        if (i != 0) {
            setTheme(i);
        }
        Window window = getWindow();
        ancy ancyVar = alwp.a;
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.systemUiVisibility &= -5635;
        window.setAttributes(attributes);
        alwo alwoVar = new alwo();
        alwoVar.b = window;
        alwoVar.c = 3;
        alwoVar.d.run();
        TypedArray obtainStyledAttributes = obtainStyledAttributes(new int[]{16843857, 16843858});
        int color = obtainStyledAttributes.getColor(0, 0);
        int color2 = obtainStyledAttributes.getColor(1, 0);
        window.setStatusBarColor(color);
        window.setNavigationBarColor(color2);
        obtainStyledAttributes.recycle();
        setContentView(R.layout.auth_uncertified_activity_v2);
        if (getIntent().getBooleanExtra("overrideNavBarColor", false)) {
            getWindow().setNavigationBarColor(ake.d(this, R.color.play_protect_auth_navigation_bar_color));
        }
        veg.c((TextView) findViewById(R.id.play_protect_body_text), LinkMovementMethod.getInstance());
        Button button = (Button) findViewById(R.id.goToWebsiteButton);
        if (button != null) {
            String stringExtra = getIntent().getStringExtra("customCtaText");
            final Intent intent = (Intent) getIntent().getParcelableExtra("ctaIntent");
            if (TextUtils.isEmpty(stringExtra) || intent == null) {
                button.setVisibility(4);
            } else {
                final Bundle bundleExtra = getIntent().getBundleExtra("ctaIntentOptions");
                button.setText(stringExtra);
                button.setOnClickListener(new View.OnClickListener() { // from class: rds
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        UncertifiedDeviceActivity.this.startActivity(intent, bundleExtra);
                    }
                });
            }
        }
        TextView textView = (TextView) findViewById(R.id.play_protect_custom_body_text);
        if (textView != null) {
            String stringExtra2 = getIntent().getStringExtra("customBodyText");
            if (TextUtils.isEmpty(stringExtra2)) {
                textView.setVisibility(4);
            } else {
                textView.setText(hy.r(stringExtra2));
                veg.c(textView, LinkMovementMethod.getInstance());
                final Intent intent2 = (Intent) getIntent().getParcelableExtra("customBodyTextOnClickIntent");
                if (intent2 != null) {
                    textView.setOnClickListener(new View.OnClickListener() { // from class: rdr
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            UncertifiedDeviceActivity.this.startActivity(intent2);
                        }
                    });
                }
            }
        }
        Button button2 = (Button) findViewById(R.id.finishButton);
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: rdq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UncertifiedDeviceActivity.this.finish();
                }
            });
        }
    }
}
