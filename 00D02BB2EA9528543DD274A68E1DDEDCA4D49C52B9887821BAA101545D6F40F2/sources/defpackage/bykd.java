package defpackage;
/* compiled from: PG */
/* renamed from: bykd  reason: default package */
/* loaded from: classes4.dex */
final class bykd implements jco {
    final /* synthetic */ byke a;

    public bykd(byke bykeVar) {
        this.a = bykeVar;
    }

    @Override // defpackage.jco
    public final void a(int i, boolean z) {
        dead deadVar;
        if (this.a.c.isEmpty()) {
            return;
        }
        byke bykeVar = this.a;
        byny bynyVar = bykeVar.c;
        int i2 = bynyVar.c;
        bykeVar.c = new byny(bynyVar.b, i);
        this.a.f();
        this.a.h();
        if (!z) {
            return;
        }
        byke bykeVar2 = this.a;
        if (i2 < 0) {
            bvoo.h("Cannot log swipe; no selection before page change", new Object[0]);
        } else if (i < 0) {
            bvoo.h("Cannot log swipe; no selection after page change", new Object[0]);
        } else {
            int i3 = i - i2;
            if (i3 == 0) {
                bvoo.h("Cannot log swipe; selection unchanged by page change", new Object[0]);
                return;
            }
            if (i3 > 0) {
                deadVar = dead.LEFT;
            } else {
                deadVar = dead.RIGHT;
            }
            bykeVar2.b.m(new cjte(deaf.SWIPE, deadVar), bykeVar2.e());
        }
    }

    @Override // defpackage.jco
    public final void b(int i) {
    }
}
