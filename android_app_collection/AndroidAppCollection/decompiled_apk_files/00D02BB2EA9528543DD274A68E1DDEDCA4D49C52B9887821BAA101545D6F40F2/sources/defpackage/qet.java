package defpackage;
/* compiled from: PG */
/* renamed from: qet  reason: default package */
/* loaded from: classes7.dex */
public final class qet<T> extends btrh<T> {
    public qet(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        qes qesVar = (qes) this.a;
        bxev bxevVar = (bxev) obj;
        boolean isEmpty = bxevVar.c.isEmpty();
        String str = bxevVar.b;
        boolean z = true;
        boolean z2 = str != null && str.isEmpty();
        if (!isEmpty || z2) {
            z = false;
        }
        qesVar.b.p(dcdc.r(bxevVar.c), z);
        cqkx.p(qesVar.b);
    }
}
