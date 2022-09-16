package com.google.android.apps.gmm.base.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.google.android.apps.gmm.base.activities.GmmSimpleRestartActivity;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class GmmSimpleRestartActivity extends gga implements btss {
    public dxio<efc> k;
    private eed l;

    public final void o(final int i, final int i2, final Intent intent) {
        if (!bvow.d(getApplicationContext(), i)) {
            getApplicationContext().startActivity(intent);
            finish();
        } else if (i2 <= 0) {
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this, i, i2, intent) { // from class: eec
                private final GmmSimpleRestartActivity a;
                private final int b;
                private final int c;
                private final Intent d;

                {
                    this.a = this;
                    this.b = i;
                    this.c = i2;
                    this.d = intent;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.o(this.b, this.c - 1, this.d);
                }
            }, 200L);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gga, defpackage.ff, defpackage.agi, defpackage.iw, android.app.Activity
    public final void onCreate(@dzsi Bundle bundle) {
        super.onCreate(bundle);
        setTheme(2132017610);
        eed eedVar = (eed) btsq.a(eed.class, this);
        this.l = eedVar;
        eedVar.e(this);
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("GmmSimpleRestartActivity.extra_main_pid", -1);
        if (intExtra == -1) {
            bvoo.f(new IllegalStateException("Process ID must be passed in intent."));
        } else if (intExtra == Process.myPid()) {
            bvoo.f(new IllegalStateException("Passed-in process ID must differ from myPid."));
        } else {
            Bundle bundleExtra = intent.getBundleExtra("GmmSimpleRestartActivity.bundle_key");
            if (bundleExtra == null) {
                bvoo.f(new IllegalStateException("Bundle must be provided."));
                return;
            }
            Intent intent2 = (Intent) bundleExtra.getParcelable("GmmSimpleRestartActivity.extra_destination_intent");
            if (intent2 == null) {
                bvoo.f(new IllegalStateException("Destination activity intent must be provided."));
            } else {
                o(intExtra, 10, intent2);
            }
        }
    }

    @Override // defpackage.gga
    protected final void q() {
    }

    @Override // defpackage.gga
    public final efc r() {
        return this.k.a();
    }

    @Override // defpackage.gga
    public final void s() {
    }

    @Override // defpackage.btss
    public final <T extends btsy> T t(Class<T> cls) {
        return cls.cast(this.l);
    }
}
