package defpackage;

import android.content.res.Resources;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: beol  reason: default package */
/* loaded from: classes3.dex */
public abstract class beol implements cqkp {
    private static final dcdn<dgab, bept> a;
    private final crzp<apsi<dbsg<dgac>>> b = new beok(this);
    private final bepv c;
    public final bgyb d;
    public final ff e;
    public final cqhn f;
    protected bwrs<bvrt<benb>> g;
    public final bwrs<ilo> h;
    protected final Executor i;
    @dzsi
    protected dgab j;
    private final beid k;
    private bepu l;

    static {
        dcdg dcdgVar = new dcdg();
        dcdgVar.f(dgab.TRACKING, bept.TURNED_ON);
        dcdgVar.f(dgab.PAUSED, bept.TURN_ON);
        a = dcdgVar.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public beol(ff ffVar, cqhn cqhnVar, bgyb bgybVar, bepv bepvVar, bwrs<bvrt<benb>> bwrsVar, beid beidVar, bwrs<ilo> bwrsVar2, Executor executor) {
        this.e = ffVar;
        this.f = cqhnVar;
        this.d = bgybVar;
        this.c = bepvVar;
        this.g = bwrsVar;
        this.k = beidVar;
        this.h = bwrsVar2;
        this.i = executor;
        this.j = beno.a(bwrsVar2);
    }

    private final void QS(bept beptVar) {
        bepu bepuVar = this.l;
        if (bepuVar == null) {
            bepv bepvVar = this.c;
            bwrs<bvrt<benb>> bwrsVar = this.g;
            beid beidVar = this.k;
            bwrs<ilo> bwrsVar2 = this.h;
            Resources a2 = bepvVar.a.a();
            bepv.a(a2, 1);
            cqhn a3 = bepvVar.b.a();
            bepv.a(a3, 2);
            dxio a4 = ((dxjh) bepvVar.c).a();
            bepv.a(a4, 3);
            bvrb a5 = bepvVar.d.a();
            bepv.a(a5, 4);
            bepv.a(bwrsVar, 5);
            bepv.a(beidVar, 6);
            bepv.a(this, 7);
            bepv.a(bwrsVar2, 8);
            bepv.a(beptVar, 9);
            this.l = new bepu(a2, a3, a4, a5, bwrsVar, beidVar, this, bwrsVar2, beptVar);
        } else {
            bepuVar.a(beptVar);
            cqkx.p(this.l);
        }
        this.l.o();
        cqkx.p(this);
    }

    public void a() {
        crzm<apsi<dbsg<dgac>>> a2 = this.k.a(this.h);
        if (a2 != null) {
            a2.a(this.b, this.i);
        }
    }

    public void b() {
        crzm<apsi<dbsg<dgac>>> a2 = this.k.a(this.h);
        if (a2 != null) {
            a2.c(this.b);
        }
    }

    public void n() {
        dgab dgabVar = this.j;
        if (dgabVar == null || !dgabVar.equals(dgab.PAUSED)) {
            return;
        }
        dcdn<dgab, bept> dcdnVar = a;
        if (!dcdnVar.containsKey(dgab.PAUSED)) {
            return;
        }
        QS(dcdnVar.get(dgab.PAUSED));
    }

    @dzsi
    public dgab o() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void p(dccx<cqix<?>> dccxVar) {
        bepu bepuVar = this.l;
        if (bepuVar == null || !bepuVar.m().booleanValue()) {
            return;
        }
        dccxVar.g(cqgr.fT(new bgxy(), this.l));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void q() {
        dgab a2 = beno.a(this.h);
        dgab dgabVar = this.j;
        if (dgabVar == null || a2 == null || dgabVar.equals(a2)) {
            return;
        }
        r(a2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void r(dgab dgabVar) {
        this.j = dgabVar;
        dcdn<dgab, bept> dcdnVar = a;
        if (dcdnVar.containsKey(dgabVar)) {
            QS(dcdnVar.get(dgabVar));
        }
    }
}
