package android.arch.lifecycle;
/* compiled from: PG */
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements l {
    private final Object a;
    private final b b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.a = obj;
        this.b = d.a.b(obj.getClass());
    }

    @Override // defpackage.l
    public final void MV(m mVar, i iVar) {
        b bVar = this.b;
        Object obj = this.a;
        b.a(bVar.a.get(iVar), mVar, iVar, obj);
        b.a(bVar.a.get(i.ON_ANY), mVar, iVar, obj);
    }
}
