package defpackage;

import android.view.View;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: nff  reason: default package */
/* loaded from: classes7.dex */
public final class nff extends nor {
    public final nga a;
    public final Runnable b;
    private final Executor c;
    private final crzm<jzq> d;
    private final not e;
    private final lxh f;
    private final kdg g;
    private final cqkf<nga> h;
    private final kxs i;
    @dzsi
    private final cjsz j;
    private final dcdc<nfz> k;
    private final crzp<jzq> l;
    private final kdh m;
    private final jty n;

    public nff(cqkj cqkjVar, Executor executor, crzm crzmVar, not notVar, kxu kxuVar, lxh lxhVar, kdg kdgVar, Runnable runnable, Runnable runnable2, CharSequence charSequence, boolean z, dcdc dcdcVar, jty jtyVar, cjqy cjqyVar, cjqq cjqqVar, cjsz cjszVar, cjtd cjtdVar, cjtd cjtdVar2) {
        super(cjqyVar, cjqqVar);
        this.l = new nfd(this);
        this.m = new nfe(this);
        this.c = executor;
        this.d = crzmVar;
        this.e = notVar;
        this.f = lxhVar;
        this.g = kdgVar;
        this.j = cjszVar;
        this.n = jtyVar;
        this.b = runnable;
        this.k = dcdcVar;
        cqkf<nga> d = cqkjVar.d(new nfp(z), notVar.a(), false);
        this.h = d;
        this.a = new ngs(charSequence, runnable, runnable2, dcdcVar, cjtdVar, cjtdVar2);
        View c = d.c();
        kxn k = kxo.k();
        k.k();
        this.i = new kxs(c, k, kxuVar);
    }

    @Override // defpackage.nor, defpackage.non
    public final void a() {
        this.h.e(this.a);
    }

    @Override // defpackage.non
    @dzsi
    public final noq b() {
        this.d.d(this.l, this.c);
        this.n.setKeyInterceptor(this.m);
        this.f.a();
        this.i.a();
        this.g.f(kdc.MAP_BUTTONS_DISABLED);
        cjsz cjszVar = this.j;
        if (cjszVar != null) {
            s(cjszVar);
        }
        return this;
    }

    @Override // defpackage.noq
    public final View d() {
        return this.h.c();
    }

    @Override // defpackage.nor, defpackage.non
    public final void e() {
        dcdc<nfz> dcdcVar = this.k;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            nfz nfzVar = dcdcVar.get(i);
            if (nfzVar.b == 6) {
                cqkp cqkpVar = nfzVar.a;
                if (cqkpVar instanceof nfw) {
                    ((nfw) cqkpVar).e();
                }
            }
        }
        this.g.f(kdc.MAP_INTERACTION_AND_BUTTONS_ENABLED);
        t();
        this.i.b();
        this.f.b();
        this.n.a();
        this.d.c(this.l);
    }

    @Override // defpackage.nor, defpackage.non
    public final void f() {
        this.h.e(null);
    }

    @Override // defpackage.non
    public final String g() {
        return "SettingsDialogOverlayWithView";
    }

    @Override // defpackage.noq
    public final void j(noe noeVar) {
        this.e.b(noeVar, this.h.c());
    }
}
