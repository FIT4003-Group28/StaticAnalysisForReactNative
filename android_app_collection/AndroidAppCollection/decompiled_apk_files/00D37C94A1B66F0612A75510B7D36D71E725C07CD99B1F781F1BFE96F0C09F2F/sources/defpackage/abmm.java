package defpackage;
/* compiled from: PG */
/* renamed from: abmm  reason: default package */
/* loaded from: classes.dex */
final class abmm implements ydi {
    final /* synthetic */ abmo a;

    public abmm(abmo abmoVar) {
        this.a = abmoVar;
    }

    @Override // defpackage.ydi
    public final CharSequence a(ashu ashuVar) {
        asqo asqoVar;
        asqo asqoVar2;
        if (ashuVar.b == 136403337) {
            asqoVar = (asqo) ashuVar.c;
        } else {
            asqoVar = asqo.a;
        }
        if ((asqoVar.b & 1) != 0) {
            if (ashuVar.b == 136403337) {
                asqoVar2 = (asqo) ashuVar.c;
            } else {
                asqoVar2 = asqo.a;
            }
            arag aragVar = asqoVar2.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            return ajgl.b(aragVar);
        }
        return null;
    }

    @Override // defpackage.ydi
    public final void b() {
        this.a.n(false);
    }

    @Override // defpackage.ydi
    public final void c(CharSequence charSequence) {
        this.a.i(charSequence);
    }

    @Override // defpackage.ydi
    public final void d() {
        this.a.j();
    }
}
