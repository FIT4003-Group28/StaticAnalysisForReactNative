package defpackage;
/* compiled from: PG */
/* renamed from: daip  reason: default package */
/* loaded from: classes5.dex */
final class daip extends daij {
    final /* synthetic */ daiq b;

    public daip(daiq daiqVar) {
        this.b = daiqVar;
    }

    @Override // defpackage.daij
    public final void a() {
        dair dairVar = this.b.a;
        dairVar.b.c("unlinkToDeath", new Object[0]);
        dairVar.j.asBinder().unlinkToDeath(dairVar.h, 0);
        dair dairVar2 = this.b.a;
        dairVar2.j = null;
        dairVar2.e = false;
    }
}
