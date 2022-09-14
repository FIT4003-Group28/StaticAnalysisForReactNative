package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bicz  reason: default package */
/* loaded from: classes3.dex */
public final class bicz implements axxd {
    final /* synthetic */ boolean a;
    final /* synthetic */ bidk b;

    public bicz(bidk bidkVar, boolean z) {
        this.b = bidkVar;
        this.a = z;
    }

    @Override // defpackage.axxd
    public final void a(boolean z) {
        bvrj.UI_THREAD.d();
        if (z) {
            axwb x = this.b.b.x();
            ilo c = this.b.f.c();
            dbsk.s(c);
            List<azvo> d = x.d(c);
            ilo c2 = this.b.f.c();
            dbsk.s(c2);
            ily g = c2.g();
            g.C = d;
            this.b.f.d(g.d());
            if (!this.a) {
                return;
            }
            this.b.d.b(new bicy(this), bvrj.UI_THREAD);
        }
    }
}
