package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bhli  reason: default package */
/* loaded from: classes3.dex */
public final class bhli implements bwrr<ilo> {
    final /* synthetic */ bhlk a;

    public bhli(bhlk bhlkVar) {
        this.a = bhlkVar;
    }

    @Override // defpackage.bwrr
    public final /* bridge */ /* synthetic */ void PV(@dzsi ilo iloVar) {
        bhlk bhlkVar;
        boolean z;
        this.a.a().clearAnimation();
        if (bhlk.d(iloVar)) {
            bhlkVar = this.a;
            z = true;
        } else {
            bhlkVar = this.a;
            z = false;
        }
        bhlkVar.b(z, false);
        cqkf<jad> cqkfVar = this.a.f;
        if (cqkfVar == null || cqkfVar.d() == null) {
            return;
        }
        jad d = this.a.f.d();
        dbsk.s(d);
        cqkx.p(d);
    }
}
