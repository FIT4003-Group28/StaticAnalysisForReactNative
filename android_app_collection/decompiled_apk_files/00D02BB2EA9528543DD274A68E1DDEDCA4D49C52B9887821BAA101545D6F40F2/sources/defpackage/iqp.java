package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: iqp  reason: default package */
/* loaded from: classes6.dex */
public final class iqp implements bwrr<ilo> {
    final /* synthetic */ iqq a;
    private final bwrs<ilo> b;
    private final int c;

    public iqp(iqq iqqVar, int i, bwrs<ilo> bwrsVar) {
        this.a = iqqVar;
        this.c = i;
        this.b = bwrsVar;
    }

    @Override // defpackage.bwrr
    public final /* bridge */ /* synthetic */ void PV(@dzsi ilo iloVar) {
        ilo iloVar2 = iloVar;
        if (iloVar2 == null || !iloVar2.f) {
            return;
        }
        this.a.a.u(cjtx.c(this.c, iloVar2, iloVar2.bX().n.size() > 0));
        bwqv.t(this.b, this);
    }
}
