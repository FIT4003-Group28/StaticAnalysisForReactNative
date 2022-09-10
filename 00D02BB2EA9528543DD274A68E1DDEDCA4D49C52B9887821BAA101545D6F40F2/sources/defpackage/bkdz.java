package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bkdz  reason: default package */
/* loaded from: classes3.dex */
public class bkdz implements bkdh {
    private final bkdc a;
    private final String b;
    private final String c;
    private final String d;
    private final Float e;
    private final Integer f;
    private final dgis g;
    private final jic h;
    private final cjtd i;
    private final boolean j;
    private final boolean k;

    public bkdz(gga ggaVar, bkdc bkdcVar, dgiy dgiyVar, ddho ddhoVar, boolean z, boolean z2) {
        String string;
        jic jicVar;
        this.a = bkdcVar;
        this.i = cjtd.a(ddhoVar);
        this.j = z;
        this.k = z2;
        this.b = dgiyVar.b;
        dgiu dgiuVar = dgiyVar.c;
        this.c = (dgiuVar == null ? dgiu.b : dgiuVar).a;
        int a = dgiw.a(dgiyVar.g);
        int i = (a == 0 ? 1 : a) - 1;
        if (i == 1) {
            string = ggaVar.getString(R.string.AVAILABILITY_IN_STOCK);
        } else if (i != 2) {
            string = i != 3 ? "" : ggaVar.getString(R.string.AVAILABILITY_ON_DISPLAY_TO_ORDER);
        } else {
            string = ggaVar.getString(R.string.AVAILABILITY_LIMITED);
        }
        this.d = string;
        dgji dgjiVar = dgiyVar.f;
        this.e = Float.valueOf((dgjiVar == null ? dgji.c : dgjiVar).b);
        dgji dgjiVar2 = dgiyVar.f;
        this.f = Integer.valueOf((dgjiVar2 == null ? dgji.c : dgjiVar2).a);
        dgis dgisVar = dgiyVar.e;
        this.g = dgisVar == null ? dgis.d : dgisVar;
        dggq dggqVar = dgiyVar.d;
        dggqVar = dggqVar == null ? dggq.d : dggqVar;
        dgge dggeVar = dgge.IMAGE_UNKNOWN;
        dggg dgggVar = dggqVar.b;
        dgge b = dgge.b((dgggVar == null ? dggg.d : dgggVar).b);
        int ordinal = (b == null ? dgge.IMAGE_UNKNOWN : b).ordinal();
        if (ordinal == 1) {
            jicVar = new jic(dggqVar.a, ckqc.FULLY_QUALIFIED, 0);
        } else if (ordinal == 8) {
            jicVar = new jic(dggqVar.a, ckqc.FIFE_SMART_CROP, 0);
        } else {
            jicVar = new jic(dggqVar.a, ckqc.FULLY_QUALIFIED, 0);
        }
        this.h = jicVar;
    }

    @Override // defpackage.bkdh
    public String a() {
        return this.b;
    }

    @Override // defpackage.bkdh
    public String b() {
        return this.c;
    }

    @Override // defpackage.bkdh
    public Float c() {
        return this.e;
    }

    @Override // defpackage.bkdh
    public Integer d() {
        return this.f;
    }

    @Override // defpackage.bkdh
    public Boolean e() {
        return Boolean.valueOf(this.j);
    }

    @Override // defpackage.bkdh
    public String f() {
        return this.d;
    }

    @Override // defpackage.bkdh
    public Boolean g() {
        return Boolean.valueOf(this.k);
    }

    @Override // defpackage.bkdh
    public jic h() {
        return this.h;
    }

    @Override // defpackage.bkdh
    public Boolean i() {
        ckqd ckqdVar = h().b;
        if (ckqdVar != null) {
            return Boolean.valueOf(ckqdVar.equals(ckqc.FIFE_SMART_CROP));
        }
        return false;
    }

    @Override // defpackage.bkdh
    public Boolean j() {
        return Boolean.valueOf(bkdc.a(this.g));
    }

    @Override // defpackage.bkdh
    public cqkl k() {
        if (bkdc.a(this.g)) {
            this.a.b(this.g);
        }
        return cqkl.a;
    }

    @Override // defpackage.bkdh
    public cjtd l() {
        return this.i;
    }
}
