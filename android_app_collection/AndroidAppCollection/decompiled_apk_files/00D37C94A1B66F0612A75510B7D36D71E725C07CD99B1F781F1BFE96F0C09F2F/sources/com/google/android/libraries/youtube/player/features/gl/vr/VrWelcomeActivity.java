package com.google.android.libraries.youtube.player.features.gl.vr;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.gl.vr.VrWelcomeActivity;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class VrWelcomeActivity extends ahsf {
    public yve b;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, defpackage.abp, defpackage.gb, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.vr_welcome_activity);
        ((TextView) findViewById(R.id.link)).setMovementMethod(LinkMovementMethod.getInstance());
        findViewById(R.id.continue_button).setOnClickListener(new View.OnClickListener() { // from class: ahsw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final VrWelcomeActivity vrWelcomeActivity = VrWelcomeActivity.this;
                ylx.n(vrWelcomeActivity, vrWelcomeActivity.b.b(ahja.e), aclb.m, new zdt() { // from class: ahsx
                    @Override // defpackage.zdt
                    public final void a(Object obj) {
                        Void r2 = (Void) obj;
                        VrWelcomeActivity.this.finish();
                    }
                });
            }
        });
    }
}
