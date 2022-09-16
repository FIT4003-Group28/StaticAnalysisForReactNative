package defpackage;
/* compiled from: PG */
/* renamed from: bbfs  reason: default package */
/* loaded from: classes3.dex */
final class bbfs implements jco {
    final /* synthetic */ bbhq a;

    public bbfs(bbhq bbhqVar) {
        this.a = bbhqVar;
    }

    @Override // defpackage.jco
    public final void a(int i, boolean z) {
        if (z) {
            this.a.m(i);
        }
        this.a.j(i);
    }

    @Override // defpackage.jco
    public final void b(int i) {
        if (i == 0) {
            this.a.k();
        }
    }
}
