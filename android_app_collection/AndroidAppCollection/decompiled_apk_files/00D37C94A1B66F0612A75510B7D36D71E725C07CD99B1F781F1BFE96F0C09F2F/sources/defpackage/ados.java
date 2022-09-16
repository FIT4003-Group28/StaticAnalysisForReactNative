package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: ados  reason: default package */
/* loaded from: classes.dex */
public abstract class ados implements adrm {
    public static final String a = zep.a("MDX.BaseSessionRecoverer");
    public final bhd b;
    public final yrj c;
    public final yni d;
    public final Handler e;
    public final ador f;
    public final boolean g;
    public int h;
    public adnw i;
    public boolean j;
    private final bgo k;
    private final adgc l;
    private final Handler.Callback m;
    private adpv n;
    private final int o;
    private final kt p = new adop(this);

    public ados(bhd bhdVar, bgo bgoVar, adgc adgcVar, yrj yrjVar, yni yniVar, int i, boolean z) {
        adoq adoqVar = new adoq(this);
        this.m = adoqVar;
        ylr.c();
        this.b = bhdVar;
        this.k = bgoVar;
        this.l = adgcVar;
        this.c = yrjVar;
        this.d = yniVar;
        this.o = i;
        this.g = z;
        this.e = new Handler(Looper.getMainLooper(), adoqVar);
        this.f = new ador(this);
    }

    private final void i() {
        ylr.c();
        a();
        this.d.m(this.f);
        this.j = false;
        this.n = null;
        this.b.r(this.p);
        this.e.removeCallbacksAndMessages(null);
        this.l.K(this);
    }

    protected abstract void a();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b(bhc bhcVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(bhc bhcVar) {
        boolean z = true;
        if (this.h != 1) {
            z = false;
        }
        aqxo.y(z);
        this.h = 4;
        adpv adpvVar = this.n;
        if (adpvVar != null) {
            adnw adnwVar = adpvVar.a.d;
            if (adnwVar == null) {
                zep.m(adpy.a, "mdxSessionInRecovery is null when onRecoverCompleted() is called, abort.");
                adpvVar.a.f(3);
            } else if (!adgl.c(bhcVar.c, adnwVar.d)) {
                zep.m(adpy.a, "recovered route id does not match previously stored in progress route id, abort");
                adpvVar.a.f(3);
            } else {
                adpvVar.a.f = bhcVar.c;
                adpvVar.a.e = adnwVar;
                bhd.l(bhcVar);
                adpvVar.a.f(4);
            }
        }
        i();
    }

    @Override // defpackage.adrm
    public final void d() {
        ylr.c();
        if (this.h != 1) {
            return;
        }
        this.h = 3;
        i();
    }

    @Override // defpackage.adrm
    public final boolean e(adnt adntVar) {
        ylr.c();
        adnw adnwVar = this.i;
        if (adnwVar != null && this.h == 1 && adntVar.o().i == this.o) {
            return adew.f(adntVar.k()).equals(adnwVar.d);
        }
        return false;
    }

    @Override // defpackage.adrm
    public final void f(adnw adnwVar, adpv adpvVar) {
        ylr.c();
        adpvVar.getClass();
        this.n = adpvVar;
        this.h = 1;
        this.b.p(this.k, this.p);
        this.i = adnwVar;
        this.l.P(this);
        this.e.sendEmptyMessage(1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g() {
        boolean z = true;
        if (this.h != 1) {
            z = false;
        }
        aqxo.y(z);
        this.h = 2;
        adpv adpvVar = this.n;
        if (adpvVar != null) {
            adpvVar.a.e();
        }
        i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h() {
        if (!this.e.hasMessages(1)) {
            this.e.sendEmptyMessageDelayed(1, 1000L);
        }
    }
}
