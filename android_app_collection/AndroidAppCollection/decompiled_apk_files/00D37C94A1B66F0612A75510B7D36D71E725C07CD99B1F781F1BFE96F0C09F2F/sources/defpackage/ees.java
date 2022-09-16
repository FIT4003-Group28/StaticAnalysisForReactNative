package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
/* compiled from: PG */
/* renamed from: ees  reason: default package */
/* loaded from: classes3.dex */
public abstract class ees extends eea {
    public egi a;
    public Handler b;
    public edw c;
    public aadd d;
    public ykv e;
    public ampq f;
    public yxe g;
    public efz h;
    public efc i;
    public aacz j;

    protected int f() {
        throw null;
    }

    protected int g() {
        throw null;
    }

    protected int h() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Intent i() {
        Intent intent = new Intent(getIntent());
        intent.setComponent(new ComponentName(this, j()));
        intent.putExtra("alias", getClass().getName());
        intent.setFlags(g());
        return intent;
    }

    protected abstract Class j();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(Intent intent) {
        startActivity(intent);
        overridePendingTransition(17432576, 17432577);
        finish();
    }

    protected boolean l(boolean z) {
        throw null;
    }

    protected boolean m() {
        throw null;
    }

    protected void n() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vih, defpackage.dt, defpackage.abp, defpackage.gb, android.app.Activity
    public void onCreate(Bundle bundle) {
        c();
        this.g.h(1);
        emn.D(this);
        super.onCreate(bundle);
        this.e.a();
        int f = f();
        this.c.b(f);
        this.h.f(f);
        if (eog.bh(this.j)) {
            this.i.a.c(new efb(f));
        }
        asxp asxpVar = this.d.a().e;
        if (asxpVar == null) {
            asxpVar = asxp.a;
        }
        if (asxpVar.ak) {
            l(true);
            k((Intent) ((azqb) ((ampv) this.f).a).get());
        } else {
            egi egiVar = this.a;
            Intent i = i();
            n();
            Intent b = egiVar.b(i);
            if (b != null) {
                l(true);
                k(b);
            } else if (l(false)) {
                if (h() == 0) {
                    k(i());
                } else {
                    this.b.postDelayed(new Runnable() { // from class: eer
                        @Override // java.lang.Runnable
                        public final void run() {
                            ees eesVar = ees.this;
                            eesVar.k(eesVar.i());
                        }
                    }, h());
                }
            } else if (m()) {
                overridePendingTransition(17432576, 17432577);
                finish();
            }
        }
        this.e.a();
        this.g.d(1);
    }
}
