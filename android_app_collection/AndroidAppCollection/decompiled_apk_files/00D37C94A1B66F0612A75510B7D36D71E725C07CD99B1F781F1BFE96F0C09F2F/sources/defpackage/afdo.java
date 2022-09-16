package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afdo  reason: default package */
/* loaded from: classes.dex */
public final class afdo implements aemh {
    public final aekw a;
    public final aekw b;

    public afdo(aekw aekwVar, aekw aekwVar2) {
        afms.a(aekwVar);
        this.a = aekwVar;
        afms.a(aekwVar2);
        this.b = aekwVar2;
    }

    @Override // defpackage.aemh
    public final void a(aent aentVar, int i) {
        if (i - 1 != 0) {
            this.a.m(aentVar.d, aentVar.e, aentVar.j, aentVar.b);
        } else {
            this.b.m(aentVar.d, aentVar.e, aentVar.j, aentVar.b);
        }
    }
}
