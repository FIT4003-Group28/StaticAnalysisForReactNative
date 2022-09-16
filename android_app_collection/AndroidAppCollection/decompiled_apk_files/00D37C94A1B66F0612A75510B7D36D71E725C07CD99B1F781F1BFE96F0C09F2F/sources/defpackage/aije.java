package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aije  reason: default package */
/* loaded from: classes.dex */
public final class aije extends afmw {
    final /* synthetic */ aijf a;

    public aije(aijf aijfVar) {
        this.a = aijfVar;
    }

    @Override // defpackage.amqo
    public final /* bridge */ /* synthetic */ Object get() {
        aijf aijfVar = this.a;
        afmu afmuVar = aijfVar.f;
        afmv b = aijfVar.b();
        afmv afmvVar = new afmv(b.c, b.d, this.a.s());
        return (afmvVar.c == -1 || afmvVar.d == -1) ? (afmuVar == null || !afmuVar.E()) ? afmv.a : new afmv(afmuVar.rQ(), afmuVar.rP(), this.a.s()) : afmvVar;
    }
}
