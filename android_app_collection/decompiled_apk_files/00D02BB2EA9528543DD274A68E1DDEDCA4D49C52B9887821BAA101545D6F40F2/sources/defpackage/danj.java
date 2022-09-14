package defpackage;
/* compiled from: PG */
/* renamed from: danj  reason: default package */
/* loaded from: classes5.dex */
public final class danj {
    public static <ResultT> danb<ResultT> a(ResultT resultt) {
        dani daniVar = new dani();
        synchronized (daniVar.a) {
            daniVar.d();
            daniVar.c = true;
            daniVar.d = resultt;
        }
        daniVar.b.b(daniVar);
        return daniVar;
    }

    public static <ResultT> danb<ResultT> b(Exception exc) {
        dani daniVar = new dani();
        synchronized (daniVar.a) {
            daniVar.d();
            daniVar.c = true;
            daniVar.e = exc;
        }
        daniVar.b.b(daniVar);
        return daniVar;
    }
}
