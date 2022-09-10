package defpackage;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: bytl  reason: default package */
/* loaded from: classes4.dex */
public final class bytl extends gga implements btss {
    static final String k = String.valueOf(bytl.class.getCanonicalName()).concat("EXTRA_BAN_NOTIFICATION_PREFERENCES");
    public gdo l;
    public efc m;
    private bytm n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void p(Application application, bysu bysuVar) {
        Intent intent = new Intent();
        intent.putExtra(k, bysuVar.a);
        intent.setClass(application, bytl.class);
        intent.setFlags(536870912);
    }

    public final void o() {
        bysu h = bysu.h(getIntent().getExtras().getBundle(k));
        byts bytsVar = new byts();
        bytsVar.B(h.a);
        D(bytsVar);
    }

    @Override // defpackage.gga, defpackage.ff, defpackage.agi, defpackage.iw, android.app.Activity
    public final void onCreate(@dzsi Bundle bundle) {
        bytm bytmVar = (bytm) btsq.a(bytm.class, this);
        this.n = bytmVar;
        bytmVar.xD(this);
        super.onCreate(bundle);
        if (bundle == null) {
            o();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ff, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        affw.a(intent, this, new Runnable(this) { // from class: bytk
            private final bytl a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.o();
            }
        });
    }

    @Override // defpackage.gga, defpackage.rb, defpackage.ff, android.app.Activity
    public final void onStart() {
        super.onStart();
        this.l.a();
    }

    @Override // defpackage.gga, defpackage.rb, defpackage.ff, android.app.Activity
    public final void onStop() {
        this.l.d();
        super.onStop();
    }

    @Override // defpackage.gga
    protected final void q() {
    }

    @Override // defpackage.gga
    public final efc r() {
        return this.m;
    }

    @Override // defpackage.gga
    public final void s() {
    }

    @Override // defpackage.btss
    public final <T extends btsy> T t(Class<T> cls) {
        return cls.cast(this.n);
    }
}
