package defpackage;
/* compiled from: PG */
/* renamed from: asbk  reason: default package */
/* loaded from: classes2.dex */
public final class asbk<T> extends btrh<T> {
    private final int d;

    public asbk(int i, Class<?> cls, T t) {
        super(cls, t);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            crmk crmkVar = (crmk) obj;
            ((asbj) this.a).d = true;
            return;
        }
        ((asbj) this.a).c((crmh) obj);
    }
}
