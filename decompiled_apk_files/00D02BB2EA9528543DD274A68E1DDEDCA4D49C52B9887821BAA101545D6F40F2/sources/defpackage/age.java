package defpackage;
/* compiled from: PG */
/* renamed from: age  reason: default package */
/* loaded from: classes.dex */
final class age implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ agy b;
    final /* synthetic */ agg c;

    public age(agg aggVar, int i, agy agyVar) {
        this.c = aggVar;
        this.a = i;
        this.b = agyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        agp<?> agpVar;
        agg aggVar = this.c;
        int i = this.a;
        Object obj = this.b.a;
        String str = aggVar.c.get(Integer.valueOf(i));
        if (str == null) {
            return;
        }
        ags<?> agsVar = aggVar.f.get(str);
        if (agsVar == null || (agpVar = agsVar.a) == null) {
            aggVar.h.remove(str);
            aggVar.g.put(str, obj);
            return;
        }
        agpVar.a(obj);
    }
}
