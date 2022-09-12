package com.google.android.apps.gmm.base.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class GmmRestartActivity extends gga implements btss {
    public efw k;
    public dxio<efc> l;
    private eeb m;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gga, defpackage.ff, defpackage.agi, defpackage.iw, android.app.Activity
    public final void onCreate(@dzsi Bundle bundle) {
        super.onCreate(bundle);
        setTheme(2132017610);
        eeb eebVar = (eeb) btsq.a(eeb.class, this);
        this.m = eebVar;
        eebVar.d(this);
        efw efwVar = this.k;
        Intent intent = efwVar.f.a().getIntent();
        int intExtra = intent.getIntExtra("IncognitoIntent.main_pid", -1);
        boolean booleanExtra = intent.getBooleanExtra("IncognitoIntent.incognito_state", false);
        if (intExtra == -1) {
            bvoo.f(new IllegalStateException("Process ID must be passed in intent."));
            intExtra = -1;
        }
        if (intExtra == Process.myPid()) {
            bvoo.f(new IllegalStateException("Passed-in process ID must differ from myPid."));
        }
        if (intExtra != -1) {
            Process.killProcess(intExtra);
        }
        efwVar.a = intent.hasExtra("IncognitoIntent.intent_to_reprocess") ? (Intent) intent.getParcelableExtra("IncognitoIntent.intent_to_reprocess") : null;
        Intent intent2 = efwVar.a;
        ((ckcn) efwVar.c.a().a(ckfn.b)).a();
        efwVar.c(intExtra, booleanExtra, 10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gga, defpackage.rb, defpackage.ff, android.app.Activity
    public final void onDestroy() {
        efw efwVar = this.k;
        efwVar.c.a().h();
        efwVar.e.a().m(bvjk.m, false);
        efwVar.f.a().getIntent().getBooleanExtra("IncognitoIntent.incognito_state", false);
        super.onDestroy();
    }

    @Override // defpackage.gga
    protected final void q() {
    }

    @Override // defpackage.gga
    public final efc r() {
        return this.l.a();
    }

    @Override // defpackage.gga
    public final void s() {
    }

    @Override // defpackage.btss
    public final <T extends btsy> T t(Class<T> cls) {
        return cls.cast(this.m);
    }
}
