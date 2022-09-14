package defpackage;
/* compiled from: PG */
/* renamed from: bcmh  reason: default package */
/* loaded from: classes3.dex */
public class bcmh implements bclq {
    private final bclj a;
    private final bcly b;

    public bcmh(bclj bcljVar, bcly bclyVar) {
        this.a = bcljVar;
        this.b = bclyVar;
    }

    @Override // defpackage.bclq
    public Integer a() {
        if (!this.b.k().booleanValue()) {
            return 0;
        }
        bclr i = this.b.i();
        bclm bclmVar = (bclm) this.a;
        if (!bclmVar.a.a().k().booleanValue() || !bclmVar.a.a().f().u().a().booleanValue()) {
            double intValue = i.j().intValue();
            double a = this.a.a();
            Double.isNaN(intValue);
            return Integer.valueOf((int) (intValue * a));
        }
        return Integer.valueOf(i.f().intValue() + i.g().intValue() + i.h().intValue());
    }
}
