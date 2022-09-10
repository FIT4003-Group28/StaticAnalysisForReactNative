package defpackage;
/* compiled from: PG */
/* renamed from: bbci  reason: default package */
/* loaded from: classes3.dex */
final class bbci implements dbsl<bayj> {
    private final baad a;

    public bbci(baad baadVar) {
        this.a = baadVar;
    }

    @Override // defpackage.dbsl
    public final /* bridge */ /* synthetic */ boolean a(bayj bayjVar) {
        baad baadVar;
        bayj bayjVar2 = bayjVar;
        if (!(bayjVar2 instanceof bbbz) || (baadVar = ((bbbz) bayjVar2).c) == null) {
            return false;
        }
        return baadVar.q() ? baadVar.o() == this.a.o() : baadVar.aa(this.a);
    }
}
