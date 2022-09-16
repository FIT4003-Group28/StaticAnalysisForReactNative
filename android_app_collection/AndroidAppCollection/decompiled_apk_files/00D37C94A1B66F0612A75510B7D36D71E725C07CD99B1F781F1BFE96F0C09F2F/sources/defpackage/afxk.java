package defpackage;
/* compiled from: PG */
/* renamed from: afxk  reason: default package */
/* loaded from: classes.dex */
final class afxk implements yiw {
    final /* synthetic */ afxl a;

    public afxk(afxl afxlVar) {
        this.a = afxlVar;
    }

    @Override // defpackage.yiw
    public final void a(Object obj, Exception exc) {
        for (yiw yiwVar : this.a.a.f(obj)) {
            yiwVar.a(obj, exc);
        }
    }

    @Override // defpackage.yiw
    public final void b(Object obj, Object obj2) {
        for (yiw yiwVar : this.a.a.f(obj)) {
            yiwVar.b(obj, obj2);
        }
    }
}
