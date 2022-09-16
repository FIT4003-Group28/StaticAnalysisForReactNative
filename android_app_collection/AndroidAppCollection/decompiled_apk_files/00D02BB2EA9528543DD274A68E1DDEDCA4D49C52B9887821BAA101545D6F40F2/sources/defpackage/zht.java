package defpackage;
/* compiled from: PG */
/* renamed from: zht  reason: default package */
/* loaded from: classes7.dex */
final class zht implements Runnable {
    final /* synthetic */ zhv a;

    public zht(zhv zhvVar) {
        this.a = zhvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zhs zhsVar = new zhs(this);
        zhv zhvVar = this.a;
        bwqv bwqvVar = zhvVar.c;
        bwrs<ilo> bwrsVar = zhvVar.e;
        dbsk.s(bwrsVar);
        bwqvVar.g(bwrsVar, zhsVar);
        bwrs<ilo> bwrsVar2 = this.a.e;
        dbsk.s(bwrsVar2);
        this.a.d.a().k(bwrsVar2);
    }
}
