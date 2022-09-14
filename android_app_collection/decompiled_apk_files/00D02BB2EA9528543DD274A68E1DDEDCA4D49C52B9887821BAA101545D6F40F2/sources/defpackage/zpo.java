package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zpo  reason: default package */
/* loaded from: classes7.dex */
public final class zpo implements acnw {
    final /* synthetic */ zpp a;

    public zpo(zpp zppVar) {
        this.a = zppVar;
    }

    @Override // defpackage.acnw
    public final void a(int i, int i2, boolean z, boolean z2) {
        if (i2 < 0 || i2 >= this.a.b.size()) {
            bvoo.h("Directions tab selected with invalid index %d (out of %d)", Integer.valueOf(i2), Integer.valueOf(this.a.b.size()));
            return;
        }
        zpm zpmVar = this.a.b.get(i2);
        this.a.e = zpmVar.h();
        zpp zppVar = this.a;
        dqvj dqvjVar = zppVar.e;
        if (!z2) {
            return;
        }
        if (!z) {
            cjqm cjqmVar = cjqm.a;
            ddho i3 = zpmVar.i();
            if (i3 != null) {
                cjqmVar = zppVar.d.j(cjql.a, cjtd.a(i3));
            } else {
                bvoo.h("Directions tab with null veType", new Object[0]);
            }
            dnqh b = yys.b(cjqmVar);
            zpp zppVar2 = this.a;
            qbr qbrVar = zppVar2.c;
            if (qbrVar == null) {
                return;
            }
            qbrVar.g(zppVar2.e, b);
            return;
        }
        zppVar.f.b(new zpn(this, dqvjVar), bvrj.UI_THREAD);
    }
}
