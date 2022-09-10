package defpackage;
/* compiled from: PG */
/* renamed from: ldi  reason: default package */
/* loaded from: classes7.dex */
public final class ldi<T> extends btrh<T> {
    public ldi(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        ldf ldfVar = (ldf) this.a;
        boolean z = ((amwe) obj).a != amwd.OFF;
        ldh ldhVar = ldfVar.a;
        if (ldhVar.a != z) {
            ldhVar.a = z;
            cqkx.p(ldhVar);
            ldg ldgVar = ldfVar.a.b;
            if (ldgVar == null) {
                return;
            }
            ((kzg) ldgVar).a.i();
        }
    }
}
