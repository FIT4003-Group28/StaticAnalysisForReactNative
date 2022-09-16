package com.google.android.libraries.youtube.mdx.tvsignin;

import android.os.Bundle;
import android.text.TextUtils;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class TvSignInActivity extends adum {
    public String b;
    public String c;
    public String d;
    public int e;
    private boolean f;

    @Override // defpackage.aczn
    protected final int a() {
        return this.f ? 1 : 0;
    }

    @Override // defpackage.aczn
    protected final boolean g(int i, dp dpVar) {
        if (i != 0) {
            if (i == 1) {
                return dpVar instanceof aduw;
            }
            return false;
        }
        return dpVar instanceof adtx;
    }

    @Override // defpackage.aczn
    protected final boolean h(int i) {
        if (i == 0 || this.f) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.libraries.youtube.mdx.tvsignin.keyNotifyProgressApi", true);
        aczo.b(this, TvSignInActivity.class, 0, bundle);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aczn, defpackage.dt, defpackage.abp, defpackage.gb, android.app.Activity
    public final void onCreate(Bundle bundle) {
        this.b = getIntent().getStringExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyAuthCode");
        String stringExtra = getIntent().getStringExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyScreenId");
        stringExtra.getClass();
        this.c = stringExtra;
        this.e = getIntent().getIntExtra("com.google.android.libraries.youtube.mdx.tvsignin.requestType", -1);
        String stringExtra2 = getIntent().getStringExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyAccountEmail");
        this.d = stringExtra2;
        boolean z = false;
        if (stringExtra2 != null && !TextUtils.isEmpty(stringExtra2)) {
            z = true;
        }
        this.f = z;
        super.onCreate(bundle);
    }

    @Override // defpackage.aczn
    protected final dp b(int i) {
        if (i != 0) {
            if (i == 1) {
                return new aduw();
            }
            StringBuilder sb = new StringBuilder(33);
            sb.append("Unknown current index ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        return new adtx();
    }
}
