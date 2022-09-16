package defpackage;
/* compiled from: PG */
/* renamed from: abm  reason: default package */
/* loaded from: classes.dex */
public final class abm implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ acg b;
    final /* synthetic */ acd c;

    public abm(acd acdVar, int i, acg acgVar) {
        this.c = acdVar;
        this.a = i;
        this.b = acgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        abw abwVar;
        acd acdVar = this.c;
        int i = this.a;
        Object obj = this.b.a;
        String str = (String) acdVar.b.get(Integer.valueOf(i));
        if (str == null) {
            return;
        }
        acdVar.d.remove(str);
        acb acbVar = (acb) acdVar.e.get(str);
        if (acbVar == null || (abwVar = acbVar.a) == null) {
            acdVar.g.remove(str);
            acdVar.f.put(str, obj);
            return;
        }
        abwVar.a(obj);
    }
}
