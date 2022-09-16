package defpackage;
/* compiled from: PG */
/* renamed from: ampf  reason: default package */
/* loaded from: classes.dex */
public abstract class ampf implements ampg {
    private transient ampf a;

    protected abstract Object a(Object obj);

    @Override // defpackage.ampg
    @Deprecated
    public final Object apply(Object obj) {
        return d(obj);
    }

    protected abstract Object b(Object obj);

    public Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        Object a = a(obj);
        a.getClass();
        return a;
    }

    public Object d(Object obj) {
        if (obj == null) {
            return null;
        }
        Object b = b(obj);
        b.getClass();
        return b;
    }

    public final ampf e() {
        ampf ampfVar = this.a;
        if (ampfVar == null) {
            ampe ampeVar = new ampe(this);
            this.a = ampeVar;
            return ampeVar;
        }
        return ampfVar;
    }
}
