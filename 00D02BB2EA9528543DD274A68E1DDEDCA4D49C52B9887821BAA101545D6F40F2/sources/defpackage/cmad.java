package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cmad  reason: default package */
/* loaded from: classes5.dex */
public final class cmad implements clzw {
    final /* synthetic */ cmaf a;
    private final cmnj b = new cmnj(new byte[4]);

    public cmad(cmaf cmafVar) {
        this.a = cmafVar;
    }

    @Override // defpackage.clzw
    public final void a(cmnv cmnvVar, clup clupVar, cmaj cmajVar) {
    }

    @Override // defpackage.clzw
    public final void b(cmnk cmnkVar) {
        if (cmnkVar.l() == 0 && (cmnkVar.l() & 128) != 0) {
            cmnkVar.h(6);
            int d = cmnkVar.d() / 4;
            for (int i = 0; i < d; i++) {
                cmnkVar.i(this.b, 4);
                int j = this.b.j(16);
                this.b.h(3);
                if (j == 0) {
                    this.b.h(13);
                } else {
                    int j2 = this.b.j(13);
                    if (this.a.c.get(j2) == null) {
                        cmaf cmafVar = this.a;
                        cmafVar.c.put(j2, new clzx(new cmae(cmafVar, j2)));
                        this.a.g++;
                    }
                }
            }
            this.a.c.remove(0);
        }
    }
}
