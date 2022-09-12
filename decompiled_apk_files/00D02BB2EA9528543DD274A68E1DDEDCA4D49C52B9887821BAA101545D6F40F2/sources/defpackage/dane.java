package defpackage;
/* compiled from: PG */
/* renamed from: dane  reason: default package */
/* loaded from: classes5.dex */
public final class dane<ResultT> {
    public final dani<ResultT> a = new dani<>();

    public final void a(Exception exc) {
        dani<ResultT> daniVar = this.a;
        synchronized (daniVar.a) {
            if (daniVar.c) {
                return;
            }
            daniVar.c = true;
            daniVar.e = exc;
            daniVar.b.b(daniVar);
        }
    }

    public final void b(ResultT resultt) {
        dani<ResultT> daniVar = this.a;
        synchronized (daniVar.a) {
            if (daniVar.c) {
                return;
            }
            daniVar.c = true;
            daniVar.d = resultt;
            daniVar.b.b(daniVar);
        }
    }
}
