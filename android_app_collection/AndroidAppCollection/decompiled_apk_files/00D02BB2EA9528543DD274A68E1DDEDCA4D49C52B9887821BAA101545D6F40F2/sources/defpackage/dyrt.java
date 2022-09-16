package defpackage;
/* compiled from: PG */
/* renamed from: dyrt  reason: default package */
/* loaded from: classes6.dex */
final class dyrt extends dyps {
    final /* synthetic */ dyrx a;
    final /* synthetic */ dysz b;

    public dyrt(dyrx dyrxVar, dysz dyszVar) {
        this.a = dyrxVar;
        this.b = dyszVar;
    }

    @Override // defpackage.dyps
    public final void a(dyfl dyflVar) {
        dyrz dyrzVar = this.a.i;
        if (dyflVar.a == dyfk.TRANSIENT_FAILURE || dyflVar.a == dyfk.IDLE) {
            dyrzVar.m.c();
            dyrzVar.o();
            dyrzVar.p();
        }
        dbsk.m(true, "listener is null");
        this.b.a(dyflVar);
    }
}
