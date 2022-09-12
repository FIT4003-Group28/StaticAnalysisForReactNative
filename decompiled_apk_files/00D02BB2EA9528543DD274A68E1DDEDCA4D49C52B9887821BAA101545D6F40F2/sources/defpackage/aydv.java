package defpackage;
/* compiled from: PG */
/* renamed from: aydv  reason: default package */
/* loaded from: classes3.dex */
public class aydv implements aydj {
    private dpre a;
    private aydk b;

    public aydv(dpre dpreVar, aydk aydkVar) {
        this.a = dpreVar;
        this.b = aydkVar;
    }

    @Override // defpackage.aydj
    public String a() {
        return this.a.b;
    }

    @Override // defpackage.aydj
    public Boolean b() {
        return Boolean.valueOf(this.b == aydk.OWNER);
    }

    @Override // defpackage.aydj
    public jic c() {
        return new jic(this.a.c, ckqc.FIFE_MONOGRAM_CIRCLE_CROP, 2131232998);
    }

    @Override // defpackage.aydj
    public void d(dpre dpreVar, aydk aydkVar) {
        this.a = dpreVar;
        this.b = aydkVar;
    }
}
