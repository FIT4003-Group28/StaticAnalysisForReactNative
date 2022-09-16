package defpackage;
/* compiled from: PG */
/* renamed from: anye  reason: default package */
/* loaded from: classes.dex */
public final class anye implements aoaf {
    private static final Object a = new Object();
    private volatile Object b = a;
    private volatile aoaf c;

    public anye(aoaf aoafVar) {
        this.c = aoafVar;
    }

    @Override // defpackage.aoaf
    public final Object a() {
        Object obj = this.b;
        Object obj2 = a;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.b;
                if (obj == obj2) {
                    obj = this.c.a();
                    this.b = obj;
                    this.c = null;
                }
            }
        }
        return obj;
    }
}
