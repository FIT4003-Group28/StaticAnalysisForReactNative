package com.google.android.libraries.youtube.account.verification.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.youtube.R;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PhoneVerificationActivity extends wii {
    public aafo b;
    public azqb c;

    @Override // defpackage.abp, android.app.Activity
    public final void onBackPressed() {
        ((wiy) this.c.get()).aG();
    }

    @Override // defpackage.dt, defpackage.abp, defpackage.gb, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ProtoParsers$InternalDontUse protoParsers$InternalDontUse;
        super.onCreate(bundle);
        setContentView(R.layout.phone_verification_activity);
        if (getIntent().hasExtra("command")) {
            try {
                Intent intent = getIntent();
                apzg apzgVar = apzg.a;
                aoos b = aoos.b();
                Parcelable parcelableExtra = intent.getParcelableExtra("command");
                if (parcelableExtra instanceof Bundle) {
                    Bundle bundle2 = (Bundle) parcelableExtra;
                    bundle2.setClassLoader(ProtoParsers$InternalDontUse.class.getClassLoader());
                    protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) bundle2.getParcelable("protoparsers");
                } else {
                    protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) parcelableExtra;
                }
                this.b.a((apzg) aphq.h(protoParsers$InternalDontUse, apzgVar, b));
            } catch (aopx e) {
                zep.d("Failed to parse command from intent", e);
            }
        }
    }
}
