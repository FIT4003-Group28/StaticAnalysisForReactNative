package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cinv  reason: default package */
/* loaded from: classes4.dex */
public class cinv extends cibj implements cinu, chyv {
    private final chrx a;
    private final chxr b;
    private final String c;
    private final chwj d;
    private final boolean e;
    private chyu f;
    private final chyy g;

    public cinv(chyy chyyVar, chrx chrxVar, chxl chxlVar, chwj chwjVar, boolean z) {
        super(chxlVar);
        this.f = chyu.VISIBLE;
        this.a = chrxVar;
        chxr chxrVar = chxlVar.b;
        this.b = chxrVar == null ? chxr.e : chxrVar;
        dwlh dwlhVar = chxlVar.d;
        this.c = (dwlhVar == null ? dwlh.n : dwlhVar).c;
        this.d = chwjVar;
        this.e = z;
        this.g = chyyVar;
    }

    @Override // defpackage.chyv
    public chyu a() {
        return this.f;
    }

    @Override // defpackage.chyv
    public boolean b() {
        return chys.b(this);
    }

    @Override // defpackage.chyv
    public chyw c() {
        return chyw.DEVICE_PHOTO;
    }

    @Override // defpackage.chyv
    public List d() {
        return dcdc.e();
    }

    @Override // defpackage.cinu
    public String e() {
        return this.c;
    }

    @Override // defpackage.cinu
    public String f() {
        return String.valueOf(this.d.c + 1);
    }

    @Override // defpackage.cinu
    public jic g() {
        return new jic(this.d.b, ckqc.FULLY_QUALIFIED, ibm.h(), 0);
    }

    @Override // defpackage.cinu
    public cqkl h() {
        if (this.g.a()) {
            return cqkl.a;
        }
        this.f = chyu.COMPLETED;
        this.a.M(this.b, this.d);
        return cqkl.a;
    }

    @Override // defpackage.cinu
    public cqkl i() {
        if (this.g.a()) {
            return cqkl.a;
        }
        this.f = chyu.DISMISSED;
        this.a.N(this.b, this.d);
        return cqkl.a;
    }

    @Override // defpackage.cinu
    public Boolean j() {
        return Boolean.valueOf(this.e);
    }
}
