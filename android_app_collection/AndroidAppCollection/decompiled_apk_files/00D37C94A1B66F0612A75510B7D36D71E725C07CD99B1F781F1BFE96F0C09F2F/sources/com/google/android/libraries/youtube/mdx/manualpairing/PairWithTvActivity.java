package com.google.android.libraries.youtube.mdx.manualpairing;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PairWithTvActivity extends addj {
    private int b;

    @Override // defpackage.aczn
    protected final int a() {
        return this.b;
    }

    @Override // defpackage.aczn
    protected final void f(int i, Activity activity) {
        if (i == 0) {
            activity.setTitle(R.string.mdx_pair_with_tv_prefs_title);
        } else if (i == 1) {
            activity.setTitle(R.string.mdx_pref_use_tv_code_title);
        } else if (i == 2) {
            activity.setTitle(R.string.mdx_pref_delete_tv_codes_code_title);
        } else {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Unknown current index ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @Override // defpackage.aczn
    protected final boolean g(int i, dp dpVar) {
        if (i != 0) {
            if (i == 1) {
                return dpVar instanceof adeb;
            }
            if (i == 2) {
                return dpVar instanceof addg;
            }
            return false;
        }
        return dpVar instanceof addv;
    }

    @Override // defpackage.aczn
    protected final boolean h(int i) {
        int i2 = this.b;
        if (i == i2) {
            return false;
        }
        aczo.a(this, PairWithTvActivity.class, i2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aczn, defpackage.dt, defpackage.abp, defpackage.gb, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (getIntent().getExtras() == null || getIntent().getExtras().getInt("useTvCode") != 1) {
            this.b = 0;
        } else {
            this.b = 1;
        }
        super.onCreate(bundle);
        setTheme(true != getIntent().getBooleanExtra("com.google.android.libraries.youtube.mdx.manualpairing.darkTheme", false) ? 2132083220 : 2132083221);
        getSupportActionBar().j(true);
    }

    @Override // defpackage.aczn
    protected final dp b(int i) {
        if (i != 0) {
            if (i == 1) {
                return new adeb();
            }
            if (i == 2) {
                return new addg();
            }
            StringBuilder sb = new StringBuilder(33);
            sb.append("Unknown current index ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        return new addv();
    }
}
