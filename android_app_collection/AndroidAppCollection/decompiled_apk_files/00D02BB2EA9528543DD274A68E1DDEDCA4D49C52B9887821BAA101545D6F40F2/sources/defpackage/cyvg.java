package defpackage;
/* compiled from: PG */
/* renamed from: cyvg  reason: default package */
/* loaded from: classes5.dex */
public final class cyvg<T> {
    public final Object a = new Object();
    public cyvf b = null;
    public cyem<T> c = null;

    public final cyem<T> a(cyem<T> cyemVar) {
        cyem<T> cyemVar2;
        final cyvf cyvfVar = new cyvf(this, cyemVar);
        synchronized (this.a) {
            cyvf cyvfVar2 = this.b;
            if (cyvfVar2 == null) {
                this.b = cyvfVar;
                cyvfVar.c();
            } else {
                cyvfVar2.a = cyvfVar;
                this.b = cyvfVar;
            }
            cyemVar2 = new cyem(cyvfVar) { // from class: cyve
                private final cyvf a;

                {
                    this.a = cyvfVar;
                }

                @Override // defpackage.cyem
                public final void a(Object obj) {
                    this.a.a(obj);
                }
            };
            this.c = cyemVar2;
        }
        return cyemVar2;
    }
}
