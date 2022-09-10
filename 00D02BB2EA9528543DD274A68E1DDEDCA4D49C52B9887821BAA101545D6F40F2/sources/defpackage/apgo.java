package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: apgo  reason: default package */
/* loaded from: classes2.dex */
public final class apgo implements acnw {
    final /* synthetic */ apgq a;

    public apgo(apgq apgqVar) {
        this.a = apgqVar;
    }

    @Override // defpackage.acnw
    public final void a(int i, int i2, boolean z, boolean z2) {
        this.a.j();
        if (i2 < 0 || i2 >= apgq.b.length) {
            bvoo.h("unexpected tab index: %s", Integer.valueOf(i2));
        } else {
            if (z2) {
                this.a.e.i(cjtd.a(apgq.c[i2]));
            }
            this.a.d.b(apgq.b[i2]);
        }
        apgq apgqVar = this.a;
        apgqVar.f.b = apgqVar.i();
    }
}
