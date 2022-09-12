package defpackage;
/* compiled from: PG */
/* renamed from: bxtm  reason: default package */
/* loaded from: classes4.dex */
final class bxtm implements axub {
    final /* synthetic */ bxtn a;

    public bxtm(bxtn bxtnVar) {
        this.a = bxtnVar;
    }

    @Override // defpackage.axub
    public final void a(@dzsi azvc azvcVar) {
        if (azvcVar != null) {
            azva azvaVar = ((azvd) azvcVar).a;
            try {
                bxto bxtoVar = this.a.a;
                if (!bxtoVar.l) {
                    bxtoVar.n.add(azvaVar);
                } else {
                    azva d = bxtoVar.d(azvaVar);
                    if (d != null) {
                        bxtoVar.o.remove(d);
                    }
                    bxtoVar.o.add(azvaVar);
                }
                bxtoVar.a();
            } catch (NullPointerException e) {
                bvoo.f(e);
            }
        }
    }

    @Override // defpackage.axub
    public final void b() {
    }
}
