package defpackage;
/* compiled from: PG */
/* renamed from: ycv  reason: default package */
/* loaded from: classes4.dex */
final class ycv implements ydi {
    final /* synthetic */ ycw a;

    public ycv(ycw ycwVar) {
        this.a = ycwVar;
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
    }

    @Override // defpackage.ydi
    public final void c(CharSequence charSequence) {
        this.a.s.d(charSequence.toString());
    }

    @Override // defpackage.ydi
    public final void d() {
    }
}
