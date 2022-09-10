package defpackage;
/* compiled from: PG */
/* renamed from: arkv  reason: default package */
/* loaded from: classes2.dex */
public final class arkv<T> extends btrh<T> {
    public arkv(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        arku arkuVar = (arku) this.a;
        bvkb bvkbVar = (bvkb) obj;
        arkuVar.b = true;
        dld dldVar = arkuVar.a;
        dldVar.x = true;
        dldVar.c();
        atlq atlqVar = arkuVar.c;
        arkuVar.c = null;
        if (atlqVar != null) {
            arkuVar.i(atlqVar);
        }
    }
}
