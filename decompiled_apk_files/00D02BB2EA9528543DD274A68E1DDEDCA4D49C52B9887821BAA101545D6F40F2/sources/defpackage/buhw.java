package defpackage;
/* compiled from: PG */
/* renamed from: buhw  reason: default package */
/* loaded from: classes4.dex */
public final class buhw<T> extends btrh<T> {
    public buhw(Class<?> cls, T t) {
        super(cls, t);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        deig<buab<String>> deigVar;
        buhv buhvVar = (buhv) this.a;
        buhvVar.b = !((btwe) obj).a;
        if (buhvVar.b) {
            buab<String> b = buhvVar.b();
            synchronized (buhvVar) {
                deigVar = buhvVar.a;
            }
            deigVar.j(b);
        }
    }
}
