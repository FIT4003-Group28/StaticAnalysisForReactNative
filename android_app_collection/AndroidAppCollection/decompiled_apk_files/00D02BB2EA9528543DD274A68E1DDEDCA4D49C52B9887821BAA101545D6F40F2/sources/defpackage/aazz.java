package defpackage;

import android.app.Activity;
import android.view.View;
/* compiled from: PG */
/* renamed from: aazz  reason: default package */
/* loaded from: classes2.dex */
public class aazz extends aakq implements aazo {
    public final bfia a;
    private final gfw b;
    private final akoi c;
    private final View.OnAttachStateChangeListener d;
    private final aaku e;
    private final aazw f;
    private final aazr g;
    private final aklj h;
    private final abac i;
    private String j = "";

    public aazz(dbty<View> dbtyVar, gfw gfwVar, akoi akoiVar, bfib bfibVar, aaku aakuVar, aazw aazwVar, aazr aazrVar, aklj akljVar, abac abacVar) {
        this.b = gfwVar;
        this.e = aakuVar;
        this.f = aazwVar;
        this.g = aazrVar;
        this.h = akljVar;
        this.i = abacVar;
        this.c = akoiVar;
        Activity activity = (Activity) ((dxjd) bfibVar.a).a;
        bfib.a(activity, 1);
        eeu a = bfibVar.b.a();
        bfib.a(a, 2);
        dzsj<glj> dzsjVar = bfibVar.c;
        jkf a2 = bfibVar.d.a();
        bfib.a(a2, 4);
        bfib.a(bfibVar.e.a(), 5);
        bfib.a(bfibVar.f.a(), 6);
        bfib.a(dbtyVar, 7);
        bfib.a(akoiVar, 8);
        this.a = new bfia(activity, a, dzsjVar, a2, dbtyVar, akoiVar, null, null, null);
        this.d = new aazy(this);
        View a3 = dbtyVar.a();
        a3.setOnTouchListener(new aazx(a3));
    }

    @Override // defpackage.aazo
    public bfkk b() {
        return this.c;
    }

    @Override // defpackage.aakq, defpackage.aakt
    public Boolean c() {
        return true;
    }

    @Override // defpackage.aazo
    public View.OnAttachStateChangeListener d() {
        return this.d;
    }

    @Override // defpackage.aazo
    public cjtd e() {
        cjta b = cjtd.b();
        b.d = dtxo.bY;
        b.g(this.j);
        return b.a();
    }

    public void f() {
        this.e.c();
        cqkx.p(this);
    }

    public jbk g() {
        return this.f;
    }

    public void h(diwb diwbVar) {
        cqix<? extends cqkp> cqixVar;
        boolean z;
        ditt dittVar = diwbVar.e;
        if (dittVar == null) {
            dittVar = ditt.n;
        }
        this.j = dittVar.b;
        this.c.e(diwbVar);
        akoi akoiVar = this.c;
        if ((diwbVar.a & 2097152) != 0) {
            akhm akhmVar = new akhm();
            aklj akljVar = this.h;
            dhti dhtiVar = diwbVar.s;
            if (dhtiVar == null) {
                dhtiVar = dhti.f;
            }
            cqixVar = cqgr.fT(akhmVar, akljVar.a(dhtiVar, this.j));
        } else {
            cqixVar = null;
        }
        akoiVar.I(cqixVar);
        divk divkVar = diwbVar.w;
        if (divkVar == null) {
            divkVar = divk.b;
        }
        if (divkVar.a) {
            dive diveVar = diwbVar.v;
            if (diveVar == null) {
                diveVar = dive.d;
            }
            if (diveVar.a.size() > 0) {
                akoi akoiVar2 = this.c;
                aakp aakpVar = new aakp();
                abac abacVar = this.i;
                gfw gfwVar = this.b;
                gga a = abacVar.a.a();
                abac.a(a, 1);
                cqhn a2 = abacVar.b.a();
                abac.a(a2, 2);
                cqhu a3 = abacVar.c.a();
                abac.a(a3, 3);
                bvjj a4 = abacVar.d.a();
                abac.a(a4, 4);
                dxio a5 = ((dxjh) abacVar.e).a();
                abac.a(a5, 5);
                dxio a6 = ((dxjh) abacVar.f).a();
                abac.a(a6, 6);
                akfa a7 = abacVar.g.a();
                abac.a(a7, 7);
                jlp a8 = abacVar.h.a();
                abac.a(a8, 8);
                abac.a(gfwVar, 9);
                abac.a(diwbVar, 10);
                akoiVar2.J(cqgr.fT(aakpVar, new abab(a, a2, a3, a4, a5, a6, a7, a8, gfwVar, diwbVar)));
            } else {
                akoi akoiVar3 = this.c;
                aaju aajuVar = new aaju();
                aazr aazrVar = this.g;
                String str = diwbVar.c;
                dxio a9 = ((dxjh) aazrVar.a).a();
                z = true;
                aazr.a(a9, 1);
                aazr.a(str, 2);
                akoiVar3.J(cqgr.fT(aajuVar, new aazq(a9, str)));
                this.a.a();
                this.c.Pq(z);
                this.e.e(diwbVar);
                this.f.b(diwbVar);
                cqkx.p(this);
            }
        }
        z = true;
        this.a.a();
        this.c.Pq(z);
        this.e.e(diwbVar);
        this.f.b(diwbVar);
        cqkx.p(this);
    }

    public void i(jjn jjnVar) {
        this.f.c(jjnVar);
    }

    public void j() {
        cqkx.p(this);
    }
}
