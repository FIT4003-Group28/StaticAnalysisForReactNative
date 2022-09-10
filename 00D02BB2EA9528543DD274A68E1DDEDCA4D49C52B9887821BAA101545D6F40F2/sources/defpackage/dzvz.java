package defpackage;
/* compiled from: PG */
/* renamed from: dzvz  reason: default package */
/* loaded from: classes6.dex */
public abstract class dzvz extends dzwb implements dzwr {
    public dzvz(Object obj, Class cls) {
        super(obj, cls);
    }

    @Override // defpackage.dzve
    public final Object a(Object obj) {
        return b(obj);
    }

    @Override // defpackage.dzvr
    protected final void f() {
        int i = dzwe.a;
    }

    @Override // defpackage.dzwr
    public final dzwq g() {
        dzwm c = c();
        if (c != this) {
            return ((dzwr) ((dzws) c)).g();
        }
        throw new dzus();
    }
}
