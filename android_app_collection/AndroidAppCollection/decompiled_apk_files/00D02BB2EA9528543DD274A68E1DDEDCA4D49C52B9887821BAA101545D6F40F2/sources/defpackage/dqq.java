package defpackage;
/* compiled from: PG */
/* renamed from: dqq  reason: default package */
/* loaded from: classes6.dex */
public final class dqq<T> implements dxio<T> {
    public dbsg<T> a = dbpy.a;
    private final dbty<T> b;

    public dqq(dbty<T> dbtyVar) {
        this.b = dbtyVar;
    }

    @Override // defpackage.dxio
    public final T a() {
        if (!this.a.a()) {
            T a = this.b.a();
            dbsk.s(a);
            this.a = dbsg.i(a);
        }
        return this.a.b();
    }
}
