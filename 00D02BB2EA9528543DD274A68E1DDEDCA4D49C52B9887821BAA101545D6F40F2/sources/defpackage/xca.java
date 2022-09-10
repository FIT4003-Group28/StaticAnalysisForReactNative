package defpackage;
/* compiled from: PG */
/* renamed from: xca  reason: default package */
/* loaded from: classes7.dex */
final class xca implements acyt {
    final /* synthetic */ zut a;
    final /* synthetic */ xcb b;

    public xca(xcb xcbVar, zut zutVar) {
        this.b = xcbVar;
        this.a = zutVar;
    }

    @Override // defpackage.acyt
    public final void a(boolean z) {
        int height = this.a.getHeight();
        zut zutVar = this.a;
        this.b.ad.b((height - zutVar.e) - zutVar.getPaddingTop() != 0);
    }

    @Override // defpackage.acyt
    public final void b(int i) {
    }
}
