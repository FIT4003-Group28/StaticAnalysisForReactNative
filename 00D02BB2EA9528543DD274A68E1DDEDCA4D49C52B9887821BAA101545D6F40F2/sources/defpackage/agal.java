package defpackage;

import android.app.Activity;
import android.util.DisplayMetrics;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: agal  reason: default package */
/* loaded from: classes2.dex */
public class agal {
    static final ail<agaj, deig<afzy>> a = new ail<>(2);
    public static final /* synthetic */ int i = 0;
    public final btvo b;
    public final bulo c;
    public final afzs d;
    public final dehq e;
    public final agbr f;
    public final anhk g;
    public final axjh h;
    private final Activity j;
    private final cqat k;
    private final bupu l;
    private final bvjj m;
    private final akpm n;

    public agal(Activity activity, btvo btvoVar, cqat cqatVar, bupu bupuVar, bvjj bvjjVar, bulo buloVar, afzs afzsVar, akpm akpmVar, dehq dehqVar, agbr agbrVar, anhk anhkVar, axjh axjhVar) {
        this.j = activity;
        this.b = btvoVar;
        this.k = cqatVar;
        this.l = bupuVar;
        this.m = bvjjVar;
        this.d = afzsVar;
        this.c = buloVar;
        this.n = akpmVar;
        this.e = dehqVar;
        this.f = agbrVar;
        this.g = anhkVar;
        this.h = axjhVar;
    }

    public final dehn<afzy> a(dirb dirbVar, @dzsi btlu btluVar, agak agakVar, @dzsi dspd dspdVar) {
        deig<afzy> b;
        dsqp dsqpVar = (dsqp) dirbVar.cu(5);
        dsqpVar.bC(dirbVar);
        dira diraVar = (dira) dsqpVar;
        dnwb a2 = this.g.a();
        if (diraVar.c) {
            diraVar.bF();
            diraVar.c = false;
        }
        dirb dirbVar2 = (dirb) diraVar.b;
        dirb dirbVar3 = dirb.l;
        a2.getClass();
        dirbVar2.f = a2;
        dirbVar2.a |= 64;
        dirb dirbVar4 = (dirb) diraVar.bK();
        agaj agajVar = null;
        if (dirbVar4.d.u() && btlu.i(btluVar) == btlt.GOOGLE) {
            dbsk.s(btluVar);
            agajVar = new agaj(btluVar.d, agakVar, dirbVar4.g, dcdc.u(dirbVar4.h));
        }
        if (agajVar != null && (b = a.b(agajVar)) != null && b.isDone()) {
            try {
                if (((afzy) deix.b(b)).c() >= TimeUnit.MILLISECONDS.toSeconds(this.k.e())) {
                    return b;
                }
            } catch (CancellationException | ExecutionException unused) {
            }
        }
        deig<afzy> d = deig.d();
        if (dspdVar == null) {
            dspdVar = this.m.au(bvjk.aP, btluVar);
        }
        if (dspdVar != null && !dspdVar.u()) {
            dsqp dsqpVar2 = (dsqp) dirbVar4.cu(5);
            dsqpVar2.bC(dirbVar4);
            dira diraVar2 = (dira) dsqpVar2;
            if (diraVar2.c) {
                diraVar2.bF();
                diraVar2.c = false;
            }
            dirb dirbVar5 = (dirb) diraVar2.b;
            dspdVar.getClass();
            dirbVar5.a |= 8;
            dirbVar5.e = dspdVar;
            dirbVar4 = (dirb) diraVar2.bK();
        }
        if (agajVar != null && (!this.d.d() || btlu.i(btluVar) == btlt.GOOGLE)) {
            a.c(agajVar, d);
        }
        this.l.a().e = btluVar;
        this.l.c().b(dirbVar4, new agah(this, d, dirbVar4), this.e);
        return d;
    }

    public final void b(dira diraVar) {
        if ((((dirb) diraVar.b).a & 2) == 0) {
            dhjx aa = this.n.aa();
            if (diraVar.c) {
                diraVar.bF();
                diraVar.c = false;
            }
            dirb dirbVar = (dirb) diraVar.b;
            aa.getClass();
            dirbVar.c = aa;
            dirbVar.a |= 2;
        }
        if ((((dirb) diraVar.b).a & 256) == 0) {
            int c = this.b.getLocalStreamParameters().c();
            if (diraVar.c) {
                diraVar.bF();
                diraVar.c = false;
            }
            dirb dirbVar2 = (dirb) diraVar.b;
            dirbVar2.a |= 256;
            dirbVar2.i = c;
        }
        DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
        dhkc bZ = dhkd.d.bZ();
        int i2 = displayMetrics.heightPixels;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhkd dhkdVar = (dhkd) bZ.b;
        dhkdVar.a |= 2;
        dhkdVar.c = i2;
        int i3 = displayMetrics.widthPixels;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhkd dhkdVar2 = (dhkd) bZ.b;
        dhkdVar2.a |= 1;
        dhkdVar2.b = i3;
        dhkd bK = bZ.bK();
        diwc bZ2 = diwd.j.bZ();
        int i4 = akga.a;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        diwd diwdVar = (diwd) bZ2.b;
        int i5 = diwdVar.a | 2;
        diwdVar.a = i5;
        diwdVar.b = i4;
        bK.getClass();
        diwdVar.c = bK;
        diwdVar.a = i5 | 4;
        if (diraVar.c) {
            diraVar.bF();
            diraVar.c = false;
        }
        dirb dirbVar3 = (dirb) diraVar.b;
        diwd bK2 = bZ2.bK();
        bK2.getClass();
        dirbVar3.j = bK2;
        dirbVar3.a |= 1024;
        if (diraVar.c) {
            diraVar.bF();
            diraVar.c = false;
        }
        dirb dirbVar4 = (dirb) diraVar.b;
        dirbVar4.k = 1;
        dirbVar4.a |= 2048;
    }

    public final void c() {
        a.f();
    }
}
