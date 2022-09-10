package defpackage;

import android.view.View;
import java.io.PrintWriter;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: lmk  reason: default package */
/* loaded from: classes7.dex */
public final class lmk extends nor {
    private static final cjsz c = new cjsz(dtxm.bJ);
    @dzsi
    public lmq a;
    final Runnable b;
    private final cqkj d;
    private final kdg e;
    private final zcr f;
    private final dbty<dcdc<ldm>> g;
    private final lmm h;
    private final not i;
    private final asmp j;
    private final ArrayList<akra> k;
    private final lxf l;
    private final cqkf<lmn> m;
    private final lwq n;
    private final lmr o;
    private final kxs p;

    public lmk(cqkj cqkjVar, kdg kdgVar, zcr zcrVar, dbty<dcdc<ldm>> dbtyVar, lmm lmmVar, cjqy cjqyVar, cjqq cjqqVar, not notVar, kxu kxuVar, asmp asmpVar, lxf lxfVar, lwq lwqVar, lmr lmrVar) {
        super(cjqyVar, cjqqVar);
        this.b = new lmj(this);
        this.d = cqkjVar;
        this.e = kdgVar;
        this.f = zcrVar;
        this.g = dbtyVar;
        dcdc<ldm> a = dbtyVar.a();
        dbsk.l(!a.isEmpty());
        this.h = lmmVar;
        this.i = notVar;
        this.j = asmpVar;
        this.l = lxfVar;
        this.n = lwqVar;
        this.o = lmrVar;
        this.k = new ArrayList<>(a.size());
        int size = a.size();
        for (int i = 0; i < size; i++) {
            ldm ldmVar = a.get(i);
            if (ldmVar.o() != null) {
                this.k.add(akra.f(ldmVar.o()));
            }
        }
        cqkf<lmn> d = cqkjVar.d(new lmi(), notVar.a(), false);
        this.m = d;
        View c2 = d.c();
        kxn k = kxo.k();
        k.k();
        this.p = new kxs(c2, k, kxuVar);
    }

    @Override // defpackage.nor, defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        printWriter.println(String.valueOf(str).concat("DestinationListOverlay:"));
    }

    @Override // defpackage.nor, defpackage.non
    public final void a() {
        ((cov) this.m.c().findViewById(lmi.a)).a.setFadeLastItem(true);
        lmr lmrVar = this.o;
        zcr zcrVar = this.f;
        dbty<dcdc<ldm>> dbtyVar = this.g;
        lmm lmmVar = this.h;
        cqkj cqkjVar = this.d;
        lmr.a(zcrVar, 1);
        lmr.a(dbtyVar, 2);
        lmr.a(lmmVar, 3);
        lmr.a(cqkjVar, 4);
        cqhn a = lmrVar.a.a();
        lmr.a(a, 5);
        myg a2 = lmrVar.b.a();
        lmr.a(a2, 6);
        btvo a3 = lmrVar.c.a();
        lmr.a(a3, 7);
        lmq lmqVar = new lmq(zcrVar, dbtyVar, lmmVar, cqkjVar, a, a2, a3);
        this.a = lmqVar;
        this.m.e(lmqVar);
        this.n.p().as(this.b);
    }

    @Override // defpackage.non
    @dzsi
    public final noq b() {
        s(c);
        this.e.f(kdc.MAP_BUTTONS_DISABLED);
        this.l.l(true);
        asmp asmpVar = this.j;
        ArrayList<akra> arrayList = this.k;
        asmpVar.p(arrayList, false, false, arrayList.size(), true);
        this.p.a();
        return this;
    }

    @Override // defpackage.noq
    public final View d() {
        return this.m.c();
    }

    @Override // defpackage.nor, defpackage.non
    public final void e() {
        this.p.b();
        this.j.v();
        this.j.x();
        this.e.f(kdc.MAP_INTERACTION_AND_BUTTONS_ENABLED);
        this.l.l(false);
        t();
    }

    @Override // defpackage.nor, defpackage.non
    public final void f() {
        this.m.e(null);
        this.a = null;
        this.n.p().at(this.b);
    }

    @Override // defpackage.non
    public final String g() {
        return "DestinationListOverlay";
    }

    @Override // defpackage.noq
    public final void j(noe noeVar) {
        this.i.b(noeVar, this.m.c());
    }
}
