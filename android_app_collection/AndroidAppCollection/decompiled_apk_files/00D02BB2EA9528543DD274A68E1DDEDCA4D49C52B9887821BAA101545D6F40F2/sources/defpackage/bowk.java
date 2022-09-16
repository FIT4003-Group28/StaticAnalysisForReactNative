package defpackage;
/* compiled from: PG */
/* renamed from: bowk  reason: default package */
/* loaded from: classes3.dex */
final class bowk implements boqu {
    private final bowv a;
    private final bwrs<ilo> b;

    public bowk(bowv bowvVar, bwrs<ilo> bwrsVar) {
        this.a = bowvVar;
        this.b = bwrsVar;
    }

    @Override // defpackage.boqu
    public final void a(bosj bosjVar, boxa boxaVar, cjqm cjqmVar) {
        byee b = bosjVar.b();
        if (b != null) {
            this.a.x = b;
        }
        if (bosjVar.f().booleanValue()) {
            this.a.y = true;
        }
        if (bosjVar.g().booleanValue()) {
            this.a.z = true;
        }
        boxaVar.L(this.a, this.b, cjqmVar);
    }
}
