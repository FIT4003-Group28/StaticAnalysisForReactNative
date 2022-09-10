package defpackage;
/* compiled from: PG */
/* renamed from: ckvc  reason: default package */
/* loaded from: classes4.dex */
public final class ckvc<T> extends btrh<T> {
    public ckvc(Class<?> cls, T t) {
        super(cls, t);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        ckuz ckuzVar = (ckuz) this.a;
        srf srfVar = (srf) obj;
        qbm qbmVar = srfVar.b;
        ckux remove = ckuzVar.a.c.remove(srfVar.a);
        if (remove == null) {
            return;
        }
        synchronized (ckuzVar.a.b) {
            ckvb ckvbVar = ckuzVar.a;
            int i = ckvbVar.e - 1;
            ckvbVar.e = i;
            if (i == 0) {
                ckvbVar.a.a(ckvbVar.f);
            }
            ckvbVar.a();
        }
        if (qbmVar.o()) {
            remove.a(qbmVar.j());
        } else {
            remove.a(null);
        }
    }
}
