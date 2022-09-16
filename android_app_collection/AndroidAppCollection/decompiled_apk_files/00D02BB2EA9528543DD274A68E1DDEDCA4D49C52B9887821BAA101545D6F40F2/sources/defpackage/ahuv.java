package defpackage;
/* compiled from: PG */
/* renamed from: ahuv  reason: default package */
/* loaded from: classes2.dex */
public final class ahuv<T> extends btrh<T> {
    public ahuv(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        ahut ahutVar = (ahut) this.a;
        btvr btvrVar = (btvr) obj;
        if (!ahutVar.a.w()) {
            return;
        }
        ahuu ahuuVar = ahutVar.a;
        boolean z = ahuuVar.a;
        boolean e = ahuuVar.e();
        if (!z && e) {
            ahutVar.a.f();
        } else if (!z || e) {
        } else {
            ahutVar.a.i();
        }
    }
}
