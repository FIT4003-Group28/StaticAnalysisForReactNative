package defpackage;
/* compiled from: PG */
/* renamed from: afxn  reason: default package */
/* loaded from: classes.dex */
final class afxn implements yiw {
    final /* synthetic */ afxo a;
    private final yiw b;

    public afxn(afxo afxoVar, yiw yiwVar) {
        this.a = afxoVar;
        this.b = yiwVar;
    }

    @Override // defpackage.yiw
    public final void a(Object obj, Exception exc) {
        this.b.a(obj, exc);
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        afsk afskVar = (afsk) obj2;
        this.a.a.d(obj, afskVar);
        this.b.b(obj, afskVar.a);
    }
}
