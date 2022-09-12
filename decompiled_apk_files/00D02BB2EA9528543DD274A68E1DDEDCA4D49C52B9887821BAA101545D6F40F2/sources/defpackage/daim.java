package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: daim  reason: default package */
/* loaded from: classes5.dex */
public final class daim extends daij {
    final /* synthetic */ dair b;

    public daim(dair dairVar) {
        this.b = dairVar;
    }

    @Override // defpackage.daij
    public final void a() {
        dair dairVar = this.b;
        if (dairVar.j != 0) {
            dairVar.b.c("Unbind from service.", new Object[0]);
            dair dairVar2 = this.b;
            dairVar2.a.unbindService(dairVar2.i);
            this.b.e = false;
            dair dairVar3 = this.b;
            dairVar3.j = null;
            dairVar3.i = null;
        }
    }
}
