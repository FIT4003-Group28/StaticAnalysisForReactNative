package defpackage;
/* compiled from: PG */
/* renamed from: iuc  reason: default package */
/* loaded from: classes3.dex */
public final class iuc implements abea {
    private final boolean a;
    private final boolean b;
    private final axnm c;
    private final axnm d;

    public iuc(aacz aaczVar, axnm axnmVar, gpu gpuVar, axnm axnmVar2) {
        this.a = eog.aH(aaczVar);
        this.b = gpuVar.a();
        this.c = axnmVar;
        this.d = axnmVar2;
    }

    @Override // defpackage.abea
    public final void nq(abed abedVar) {
        aopa createBuilder = asge.a.createBuilder();
        boolean z = true;
        if (this.a) {
            boolean b = ((grx) this.c.get()).b();
            createBuilder.copyOnWrite();
            asge asgeVar = (asge) createBuilder.instance;
            asgeVar.b = 1 | asgeVar.b;
            asgeVar.c = b;
            z = false;
        }
        if (this.b) {
            boolean c = ((gps) this.d.get()).c();
            createBuilder.copyOnWrite();
            asge asgeVar2 = (asge) createBuilder.instance;
            asgeVar2.b |= 2;
            asgeVar2.d = c;
        } else if (z) {
            return;
        }
        abedVar.A = (asge) createBuilder.mo39build();
    }
}
