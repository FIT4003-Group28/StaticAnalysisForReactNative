package defpackage;
/* compiled from: PG */
/* renamed from: asvs  reason: default package */
/* loaded from: classes2.dex */
public final class asvs<T> extends btrh<T> {
    private final int d;

    public asvs(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            asvq asvqVar = (asvq) this.a;
            asvqVar.j = ((alid) obj).c;
            asvqVar.f(asvqVar.getContext());
            return;
        }
        asvq asvqVar2 = (asvq) this.a;
        if (!((alhw) obj).a.equals(alje.LAST_FINGER_UP)) {
            return;
        }
        asvqVar2.h = null;
        asvqVar2.g(null);
    }
}
