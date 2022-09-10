package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cebj  reason: default package */
/* loaded from: classes4.dex */
public class cebj implements cebf {
    public final dwfl a;
    private final jic b;
    private final jht c;
    private final bbtm d;
    private final cebe e;
    private final String f;
    private final boolean g;
    private final cjtd h;

    public cebj(bbtm bbtmVar, String str, int i, int i2, final bwrs<ilo> bwrsVar, cebe cebeVar, final dxio<afha> dxioVar, final gga ggaVar, final bwqv bwqvVar, final btvo btvoVar) {
        this.d = bbtmVar;
        dwfi bZ = dwfl.w.bZ();
        String a = bbtmVar.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwfl dwflVar = (dwfl) bZ.b;
        a.getClass();
        dwflVar.a |= 128;
        dwflVar.h = a;
        int i3 = dsna.e(bbtmVar.a()) ? 2 : 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwfl dwflVar2 = (dwfl) bZ.b;
        dwflVar2.i = i3;
        dwflVar2.a |= 256;
        String e = bbtmVar.e();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwfl dwflVar3 = (dwfl) bZ.b;
        e.getClass();
        dwflVar3.a |= 32;
        dwflVar3.g = e;
        String A = bbtmVar.A();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwfl dwflVar4 = (dwfl) bZ.b;
        A.getClass();
        dwflVar4.a |= 4;
        dwflVar4.d = A;
        dfxs B = bbtmVar.B();
        if (B != null) {
            dfvw dfvwVar = B.e;
            if ((dfvwVar == null ? dfvw.b : dfvwVar).a.size() > 0) {
                dfvw dfvwVar2 = B.e;
                dfyc dfycVar = (dfvwVar2 == null ? dfvw.b : dfvwVar2).a.get(0);
                dwfg bZ2 = dwfh.d.bZ();
                dszq dszqVar = dfycVar.b;
                String str2 = (dszqVar == null ? dszq.c : dszqVar).b;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dwfh dwfhVar = (dwfh) bZ2.b;
                str2.getClass();
                dwfhVar.a |= 1;
                dwfhVar.b = str2;
                dnpp bZ3 = dnpq.g.bZ();
                String str3 = dfycVar.d;
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dnpq dnpqVar = (dnpq) bZ3.b;
                str3.getClass();
                dnpqVar.a |= 16;
                dnpqVar.e = str3;
                dszq dszqVar2 = dfycVar.b;
                String str4 = (dszqVar2 == null ? dszq.c : dszqVar2).b;
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dnpq dnpqVar2 = (dnpq) bZ3.b;
                str4.getClass();
                dnpqVar2.a |= 8;
                dnpqVar2.d = str4;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dwfh dwfhVar2 = (dwfh) bZ2.b;
                dnpq bK = bZ3.bK();
                bK.getClass();
                dwfhVar2.c = bK;
                dwfhVar2.a |= 2;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dwfl dwflVar5 = (dwfl) bZ.b;
                dwfh bK2 = bZ2.bK();
                bK2.getClass();
                dwflVar5.k = bK2;
                dwflVar5.a |= 1024;
            }
        }
        dwfl bK3 = bZ.bK();
        this.a = bK3;
        this.e = cebeVar;
        cjta b = cjtd.b();
        b.d = dtxy.lR;
        b.g(str);
        this.h = b.a();
        this.b = new jic(bbtmVar.z().toString(), jfv.b(bK3), irg.e(), 0);
        jhu h = jhv.h();
        jhm jhmVar = new jhm();
        jhmVar.a = ggaVar.getString(R.string.REPORT_A_PROBLEM);
        jhmVar.b = ggaVar.getString(R.string.REPORT_A_PROBLEM);
        jhmVar.f = cjtd.a(dtya.dK);
        jhmVar.d(new View.OnClickListener(this, ggaVar, bwrsVar, bwqvVar, btvoVar, dxioVar) { // from class: cebh
            private final cebj a;
            private final gga b;
            private final bwrs c;
            private final bwqv d;
            private final btvo e;
            private final dxio f;

            {
                this.a = this;
                this.b = ggaVar;
                this.c = bwrsVar;
                this.d = bwqvVar;
                this.e = btvoVar;
                this.f = dxioVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cebj cebjVar = this.a;
                gga ggaVar2 = this.b;
                bwrs bwrsVar2 = this.c;
                bwqv bwqvVar2 = this.d;
                btvo btvoVar2 = this.e;
                dxio dxioVar2 = this.f;
                dwfl dwflVar6 = cebjVar.a;
                ilo iloVar = (ilo) bwrsVar2.c();
                dbsk.s(iloVar);
                bdjk.w(ggaVar2, dwflVar6, iloVar, bwqvVar2, btvoVar2, dxioVar2);
            }
        });
        h.d(jhmVar.c());
        this.c = h.b();
        if (!bbtmVar.e().isEmpty()) {
            this.g = false;
            this.f = bbtmVar.e();
            return;
        }
        this.g = true;
        this.f = ggaVar.getResources().getQuantityString(R.plurals.PHOTO_INDEX_IN_LIST, i2, Integer.valueOf(i + 1), Integer.valueOf(i2));
    }

    @Override // defpackage.cebf
    public jic a() {
        return this.b;
    }

    @Override // defpackage.cebf
    public cqkl b() {
        this.e.a();
        return cqkl.a;
    }

    @Override // defpackage.cebf
    public Float c() {
        return (Float) this.d.E().h(cebi.a).c(Float.valueOf(0.75f));
    }

    @Override // defpackage.cebf
    public String d() {
        return this.f;
    }

    @Override // defpackage.cebf
    public Boolean e() {
        return Boolean.valueOf(this.g);
    }

    public boolean equals(@dzsi Object obj) {
        if (!(obj instanceof cebj)) {
            return false;
        }
        return dbsd.a(this.d, ((cebj) obj).d);
    }

    @Override // defpackage.cebf
    public jht f() {
        return this.c;
    }

    @Override // defpackage.cebf
    public cjtd g() {
        return this.h;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.d});
    }
}
