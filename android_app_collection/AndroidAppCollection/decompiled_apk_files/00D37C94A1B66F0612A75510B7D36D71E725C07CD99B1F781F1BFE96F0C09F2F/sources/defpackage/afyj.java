package defpackage;
/* compiled from: PG */
/* renamed from: afyj  reason: default package */
/* loaded from: classes.dex */
final class afyj implements yiw {
    final /* synthetic */ afyk a;
    private final yiw b;

    public afyj(afyk afykVar, yiw yiwVar) {
        this.a = afykVar;
        this.b = yiwVar;
    }

    @Override // defpackage.yiw
    public final void a(Object obj, Exception exc) {
        this.b.a(obj, exc);
    }

    @Override // defpackage.yiw
    public final void b(Object obj, Object obj2) {
        afyk afykVar = this.a;
        afykVar.a.d(obj, new afsk(obj2, afykVar.b.c()));
        this.b.b(obj, obj2);
    }
}
