package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dynb  reason: default package */
/* loaded from: classes6.dex */
public final class dynb extends dynv {
    public final dygz a;
    public final dyfo b = dyfo.a();
    final /* synthetic */ dync c;

    public dynb(dync dyncVar, dygz dygzVar) {
        this.c = dyncVar;
        this.a = dygzVar;
    }

    @Override // defpackage.dynv, defpackage.dyls
    public final void e(dyjb dyjbVar) {
        super.e(dyjbVar);
        synchronized (this.c.a) {
            dync dyncVar = this.c;
            if (dyncVar.e != null) {
                boolean remove = dyncVar.g.remove(this);
                if (!this.c.a() && remove) {
                    dync dyncVar2 = this.c;
                    dyncVar2.b.b(dyncVar2.d);
                    dync dyncVar3 = this.c;
                    if (dyncVar3.h != null) {
                        dyncVar3.b.b(dyncVar3.e);
                        this.c.e = null;
                    }
                }
            }
        }
        this.c.b.a();
    }
}
