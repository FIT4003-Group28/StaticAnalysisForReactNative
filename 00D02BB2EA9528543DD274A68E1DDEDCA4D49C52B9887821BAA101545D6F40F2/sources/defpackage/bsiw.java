package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bsiw  reason: default package */
/* loaded from: classes4.dex */
public class bsiw implements bsha, bsgw {
    private static final dcqe e = dcqe.c("bsiw");
    public final dbty<bsgy> a;
    public final dbty<bsgy> b;
    public final dbty<bsgy> c;
    public final eaol d;
    private final Activity g;
    private boolean h = false;
    private String i = "";
    private final dbty<List<bsgy>> f = dbud.a(new dbty(this) { // from class: bsiu
        private final bsiw a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            bsiw bsiwVar = this.a;
            return dcdc.h(bsiwVar.a.a(), bsiwVar.b.a(), bsiwVar.c.a());
        }
    });

    public bsiw(final gga ggaVar, cqat cqatVar) {
        this.g = ggaVar;
        this.d = new eaol(cqatVar.b()).g();
        this.a = dbud.a(new dbty(ggaVar) { // from class: bsir
            private final gga a;

            {
                this.a = ggaVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                Resources resources = this.a.getResources();
                dccx F = dcdc.F();
                for (int i = 1; i <= 20; i++) {
                    F.g(resources.getString(R.string.RESERVATION_PARTY_SIZE_LABEL, Integer.valueOf(i)));
                }
                return new bsja(1, false, F.f(), cjtd.a(dtxp.S));
            }
        });
        this.b = dbud.a(new dbty(this, ggaVar) { // from class: bsis
            private final bsiw a;
            private final gga b;

            {
                this.a = this;
                this.b = ggaVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                bsiw bsiwVar = this.a;
                gga ggaVar2 = this.b;
                eaol eaolVar = bsiwVar.d;
                dccx F = dcdc.F();
                for (int i = 0; i < 60; i++) {
                    F.g(bslk.c(eaolVar, ggaVar2));
                    eaolVar = eaolVar.k(1);
                }
                return new bsja(0, false, F.f(), cjtd.a(dtxp.R));
            }
        });
        this.c = dbud.a(new dbty(this, ggaVar) { // from class: bsit
            private final bsiw a;
            private final gga b;

            {
                this.a = this;
                this.b = ggaVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                bsiw bsiwVar = this.a;
                gga ggaVar2 = this.b;
                eaol eaolVar = bsiwVar.d;
                dccx F = dcdc.F();
                for (int i = 0; i < 48; i++) {
                    F.g(bslk.b(eaolVar, ggaVar2));
                    eaolVar = eaolVar.l(30);
                }
                return new bsja(24, false, F.f(), cjtd.a(dtxp.T));
            }
        });
    }

    private static void b(bsgy bsgyVar, int i) {
        int intValue = bsgyVar.d().intValue();
        if (intValue == i || i < 0) {
            return;
        }
        bsgyVar.c().onValueChange(null, intValue, i);
    }

    private static boolean c(bsgy bsgyVar, int i) {
        return i >= bsgyVar.a().intValue() && i <= bsgyVar.b().intValue();
    }

    @Override // defpackage.bsgw
    /* renamed from: a */
    public String f() {
        return this.g.getResources().getString(R.string.RESERVATION_AVAILABILITY_FILTER_DIALOG_LABEL);
    }

    @Override // defpackage.bsgw
    public CharSequence g() {
        return this.g.getResources().getString(R.string.RESERVATION_AVAILABILITY_PARTNER_DISCLAIMER);
    }

    @Override // defpackage.bsha
    public CharSequence h() {
        return "";
    }

    @Override // defpackage.bsgw
    public Float i() {
        return Float.valueOf(this.f.a().size());
    }

    @Override // defpackage.bsgw
    public List<bsgy> j() {
        return this.f.a();
    }

    @Override // defpackage.bsgw
    @dzsi
    public cjtd k() {
        return cjtd.a(dtxp.Q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c2, code lost:
        if (c(r16.b.a(), r8) == false) goto L20;
     */
    @Override // defpackage.bsha
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(defpackage.bsjm r17) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsiw.m(bsjm):void");
    }

    @Override // defpackage.bsha
    public void n(bsjm bsjmVar) {
        djmu bZ = djmv.c.bZ();
        djnl bZ2 = djnm.e.bZ();
        int intValue = this.a.a().d().intValue() + 1;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        djnm djnmVar = (djnm) bZ2.b;
        djnmVar.a |= 4;
        djnmVar.d = intValue;
        eaol k = this.d.k(this.b.a().d().intValue());
        djju bZ3 = djjv.e.bZ();
        int y = k.y();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        djjv djjvVar = (djjv) bZ3.b;
        djjvVar.a |= 1;
        djjvVar.b = y;
        int z = k.z();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        djjv djjvVar2 = (djjv) bZ3.b;
        djjvVar2.a |= 2;
        djjvVar2.c = z;
        int A = k.A();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        djjv djjvVar3 = (djjv) bZ3.b;
        djjvVar3.a |= 4;
        djjvVar3.d = A;
        djjv bK = bZ3.bK();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        djnm djnmVar2 = (djnm) bZ2.b;
        bK.getClass();
        djnmVar2.b = bK;
        djnmVar2.a |= 1;
        int intValue2 = this.c.a().d().intValue();
        int i = intValue2 / 2;
        int i2 = (intValue2 % 2) * 30;
        dqji bZ4 = dqjj.e.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dqjj dqjjVar = (dqjj) bZ4.b;
        int i3 = dqjjVar.a | 1;
        dqjjVar.a = i3;
        dqjjVar.b = i;
        dqjjVar.a = i3 | 2;
        dqjjVar.c = i2;
        dqjj bK2 = bZ4.bK();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        djnm djnmVar3 = (djnm) bZ2.b;
        bK2.getClass();
        djnmVar3.c = bK2;
        djnmVar3.a |= 2;
        djnm bK3 = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djmv djmvVar = (djmv) bZ.b;
        bK3.getClass();
        djmvVar.b = bK3;
        djmvVar.a = 21;
        bsjmVar.u(20, bZ.bK().bR(), 2);
        this.h = true;
    }

    @Override // defpackage.bsha
    public String q() {
        return this.i;
    }

    @Override // defpackage.bsha
    public String r() {
        return this.g.getResources().getString(R.string.RESERVATION_AVAILABILITY_FILTER_DIALOG_LABEL);
    }

    @Override // defpackage.bsha
    @dzsi
    public cqtd s() {
        return null;
    }

    @Override // defpackage.bsha
    public boolean t() {
        return this.h;
    }

    @Override // defpackage.bsha
    public void u(cqiv cqivVar) {
        if (!dbsj.d(this.i)) {
            cqivVar.a(new bseu(), this);
        }
    }
}
