package defpackage;

import android.app.Application;
import android.graphics.Point;
import android.view.View;
import android.view.WindowManager;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bdcy  reason: default package */
/* loaded from: classes3.dex */
public class bdcy extends brwd implements bdao {
    public final gga a;
    public final befw b;
    public final dqhw c;
    public final bwrs<ilo> d;
    public final aaaf e;
    @dzsi
    public aaae f;
    private final bbtq i;
    private final bdcs j;
    private final begg k;
    private final View.OnAttachStateChangeListener l;
    private final bwrr<ilo> m;
    @dzsi
    private dkee n;

    public bdcy(final ilo iloVar, bbtq bbtqVar, Application application, bvjj bvjjVar, dxio<akfa> dxioVar, bfgx bfgxVar, gga ggaVar, ahjq ahjqVar, bwqv bwqvVar, brvm brvmVar, aeqg aeqgVar, bmmq bmmqVar, bdct bdctVar, akox akoxVar, befw befwVar, bfhu bfhuVar, bnjv bnjvVar, final begg beggVar, brwc brwcVar, aaaf aaafVar, bruu bruuVar) {
        super(application, bvjjVar, dxioVar, aeqgVar, bmmqVar, bfhuVar, brwcVar.a(new Runnable(iloVar, beggVar) { // from class: bdcu
            private final ilo a;
            private final begg b;

            {
                this.a = iloVar;
                this.b = beggVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bdcy.t(this.a, this.b);
            }
        }), bfgxVar, ahjqVar, bnjvVar.a(iloVar), null, new Runnable(iloVar, beggVar) { // from class: bdcv
            private final ilo a;
            private final begg b;

            {
                this.a = iloVar;
                this.b = beggVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bdcy.t(this.a, this.b);
            }
        }, bbtqVar.a(), null, null, false, null, null, bbtqVar.a(), bruuVar);
        Point point;
        this.l = new bdcw(this);
        bdcx bdcxVar = new bdcx(this);
        this.m = bdcxVar;
        this.a = ggaVar;
        this.i = bbtqVar;
        bdct.a(iloVar, 1);
        bdct.a(bbtqVar, 2);
        bnjv a = bdctVar.a.a();
        bdct.a(a, 3);
        dzsj<axwy> dzsjVar = bdctVar.b;
        dzsj<bbut> dzsjVar2 = bdctVar.c;
        axyp a2 = bdctVar.d.a();
        bdct.a(a2, 6);
        this.j = new bdcs(iloVar, bbtqVar, a, dzsjVar, dzsjVar2, a2);
        this.b = befwVar;
        bwrs<ilo> a3 = bwrs.a(iloVar);
        this.d = a3;
        dqhu bZ = dqhw.g.bZ();
        float f = ggaVar.getResources().getDisplayMetrics().density;
        dhkc bZ2 = dhkd.d.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dhkd dhkdVar = (dhkd) bZ2.b;
        dhkdVar.a |= 2;
        dhkdVar.c = 156;
        ((WindowManager) ggaVar.getSystemService("window")).getDefaultDisplay().getRealSize(new Point());
        int min = Math.min((int) (point.x / f), (int) (2048.0f / f));
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dhkd dhkdVar2 = (dhkd) bZ2.b;
        dhkdVar2.a |= 1;
        dhkdVar2.b = min;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqhw dqhwVar = (dqhw) bZ.b;
        dhkd bK = bZ2.bK();
        bK.getClass();
        dqhwVar.b = bK;
        dqhwVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqhw dqhwVar2 = (dqhw) bZ.b;
        dqhwVar2.a |= 2;
        dqhwVar2.c = f;
        int i = bgeh.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqhw dqhwVar3 = (dqhw) bZ.b;
        int i2 = i - 1;
        if (i != 0) {
            dqhwVar3.e = i2;
            dqhwVar3.a |= 8;
            int i3 = bgei.a(akoxVar, akoxVar.aa()).b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dqhw dqhwVar4 = (dqhw) bZ.b;
            dqhwVar4.a |= 4;
            dqhwVar4.d = i3;
            this.c = bZ.bK();
            this.e = aaafVar;
            this.k = beggVar;
            bwqvVar.f(a3, bdcxVar, false);
            return;
        }
        throw null;
    }

    public static void t(ilo iloVar, begg beggVar) {
        begj begjVar = new begj();
        begjVar.b(iloVar);
        begjVar.c = jjn.EXPANDED;
        begjVar.n = true;
        beggVar.o(begjVar, false, null);
    }

    @Override // defpackage.brwd, defpackage.brvd
    public void QR(bwrs<ilo> bwrsVar) {
        super.QR(bwrsVar);
        this.j.l(bwrsVar);
        ilo c = bwrsVar.c();
        if (c != null) {
            dkee b = dkee.b(c.h().bl);
            if (b == null) {
                b = dkee.UNKNOWN_VIEW_TYPE;
            }
            this.n = b;
        }
    }

    @Override // defpackage.bdao
    public bdan a() {
        return this.j;
    }

    @Override // defpackage.brvd
    public Boolean d() {
        return false;
    }

    @Override // defpackage.brvd
    public cqtv e() {
        return cqrp.d(102.0d);
    }

    @Override // defpackage.brvd
    public Boolean f() {
        return Boolean.valueOf(dbsj.d(A().ak()));
    }

    @Override // defpackage.brvd
    public Boolean g() {
        return Boolean.valueOf(!dbsj.d(A().ak()));
    }

    @Override // defpackage.brwd
    protected final float h() {
        return 2.14748365E9f;
    }

    @Override // defpackage.brwd
    @dzsi
    protected final dkee i() {
        return this.n;
    }

    @Override // defpackage.jbt
    public void j(cqiv cqivVar) {
        cqivVar.a(new bcxv(), this);
    }

    @Override // defpackage.bdao
    public cjtd l() {
        ddho b = this.i.b();
        cjta c = cjtd.c(A().b());
        c.d = b;
        return c.a();
    }

    @Override // defpackage.bdao
    @dzsi
    public jic n() {
        ilo c = this.d.c();
        if (c != null) {
            for (dqhr dqhrVar : c.h().ap) {
                dqhw dqhwVar = dqhrVar.c;
                if (dqhwVar == null) {
                    dqhwVar = dqhw.g;
                }
                if (dqhwVar.equals(this.c)) {
                    return new jic(dqhrVar.b, ckqc.FULLY_QUALIFIED, 0);
                }
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.bdao
    public cqkl o() {
        ilo c = this.d.c();
        if (c != null) {
            begj begjVar = new begj();
            begjVar.b(c);
            begjVar.c = jjn.COLLAPSED;
            begjVar.n = true;
            this.k.o(begjVar, false, null);
        }
        return cqkl.a;
    }

    @Override // defpackage.bdao
    public CharSequence r() {
        ilo c = this.d.c();
        return c != null ? String.format(this.a.getString(R.string.LIGHTBOX_STATIC_MAP_CONTENT_DESCRIPTION), c.n()) : "";
    }

    @Override // defpackage.brwd, defpackage.brvd
    @dzsi
    public View.OnAttachStateChangeListener s() {
        return this.l;
    }
}
