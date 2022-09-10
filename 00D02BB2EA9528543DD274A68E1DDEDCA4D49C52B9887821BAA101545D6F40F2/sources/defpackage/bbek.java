package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
import com.google.android.gms.udc.UdcCacheResponse;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bbek  reason: default package */
/* loaded from: classes3.dex */
public final class bbek {
    private static final dcdc<bzqb> c = dcdc.f(bzqb.WEB_AND_APP_ACTIVITY);
    private static final int[] d = {bzqb.WEB_AND_APP_ACTIVITY.d};
    private static final dcqe e = dcqe.c("bbek");
    public final gga a;
    public final dxio<bbdv> b;
    private final bzqc f;
    private final bzqa g;
    private final cjxd h;
    private final Executor i;
    private bbej j = bbej.a;

    public bbek(gga ggaVar, dxio<bbdv> dxioVar, bzqc bzqcVar, bzqa bzqaVar, cjxd cjxdVar, Executor executor) {
        this.a = ggaVar;
        this.b = dxioVar;
        this.f = bzqcVar;
        this.g = bzqaVar;
        this.h = cjxdVar;
        this.i = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f(UdcCacheResponse udcCacheResponse) {
        for (UdcCacheResponse.UdcSetting udcSetting : udcCacheResponse.a) {
            if (udcSetting.b == 3) {
                return false;
            }
        }
        return true;
    }

    public static void i(bwrs<ilo> bwrsVar, int i) {
        ilo c2 = bwrsVar.c();
        dbsk.s(c2);
        dvyw h = c2.h();
        dsqp dsqpVar = (dsqp) h.cu(5);
        dsqpVar.bC(h);
        dvya dvyaVar = (dvya) dsqpVar;
        dqbi dqbiVar = h.bg;
        if (dqbiVar == null) {
            dqbiVar = dqbi.g;
        }
        dsqp dsqpVar2 = (dsqp) dqbiVar.cu(5);
        dsqpVar2.bC(dqbiVar);
        dqbf dqbfVar = (dqbf) dsqpVar2;
        if (dqbfVar.c) {
            dqbfVar.bF();
            dqbfVar.c = false;
        }
        dqbi dqbiVar2 = (dqbi) dqbfVar.b;
        dqbiVar2.d = i - 1;
        int i2 = dqbiVar2.a | 2;
        dqbiVar2.a = i2;
        dqbiVar2.a = i2 & (-2);
        dqbiVar2.b = 0.0f;
        if (dvyaVar.c) {
            dvyaVar.bF();
            dvyaVar.c = false;
        }
        dvyw dvywVar = (dvyw) dvyaVar.b;
        dqbi bK = dqbfVar.bK();
        bK.getClass();
        dvywVar.bg = bK;
        dvywVar.d |= 16384;
        ily g = c2.g();
        g.E(dvyaVar.bK());
        bwrsVar.d(g.d());
    }

    public final dehn<UdcCacheResponse> a() {
        cjxd cjxdVar = this.h;
        if (cjxdVar == null || !cjxdVar.b()) {
            return deha.c();
        }
        return this.f.a(c);
    }

    public final void b(final bwrs<ilo> bwrsVar, @dzsi bbej bbejVar) {
        bbdt bbdtVar;
        ilo c2 = bwrsVar.c();
        if (c2 != null) {
            bbdtVar = this.b.a().D(c2);
        } else {
            bbdtVar = bbdt.NOT_PRESENT;
        }
        if (bbejVar != null) {
            this.j = bbejVar;
        }
        bbdt bbdtVar2 = bbdt.LOW_CONFIDENCE;
        switch (bbdtVar.ordinal()) {
            case 0:
                this.b.a().e(bwrsVar);
                c();
                return;
            case 1:
                this.b.a().H(false);
                this.b.a().e(bwrsVar);
                c();
                return;
            case 2:
            case 8:
                bvoo.h("(personal-score): Reached invalid state: %s", bbdtVar.toString());
                c();
                return;
            case 3:
                bbejVar.a();
                c();
                return;
            case 4:
                e(R.string.PERSONAL_SCORE_UNSUPPORTED_USER_MESSAGE);
                c();
                return;
            case 5:
            case 12:
                deha.q(a(), g(new bvqg(this, bwrsVar) { // from class: bbec
                    private final bbek a;
                    private final bwrs b;

                    {
                        this.a = this;
                        this.b = bwrsVar;
                    }

                    @Override // defpackage.bvqg
                    public final void NU(Object obj) {
                        bbek bbekVar = this.a;
                        bwrs<ilo> bwrsVar2 = this.b;
                        if (bbek.f((UdcCacheResponse) obj)) {
                            bbek.i(bwrsVar2, 2);
                            bbekVar.b.a().H(false);
                            bbekVar.b.a().e(bwrsVar2);
                            bbekVar.c();
                            return;
                        }
                        bbekVar.h();
                    }
                }), dege.a);
                return;
            case 6:
                this.b.a().f(new bbee(this));
                return;
            case 7:
                this.b.a().e(bwrsVar);
                c();
                return;
            case 9:
            case 11:
                e(R.string.GENERIC_ERROR_MESSAGE);
                c();
                return;
            case 10:
                i(bwrsVar, 3);
                this.b.a().e(bwrsVar);
                c();
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.j = bbej.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        this.j.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(final int i) {
        this.i.execute(new Runnable(this, i) { // from class: bbeb
            private final bbek a;
            private final int b;

            {
                this.a = this;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bbek bbekVar = this.a;
                Toast.makeText(bbekVar.a, this.b, 1).show();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final degu<UdcCacheResponse> g(bvqg<UdcCacheResponse> bvqgVar) {
        return new bbef(this, bvqgVar);
    }

    public final void h() {
        this.g.a(d, new bbeh(this), "personal_score_setup");
    }
}
