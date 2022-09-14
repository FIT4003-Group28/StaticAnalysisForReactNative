package defpackage;
/* compiled from: PG */
/* renamed from: bmdz  reason: default package */
/* loaded from: classes3.dex */
public class bmdz implements bmea {
    private final begg a;

    public bmdz(begg beggVar) {
        this.a = beggVar;
    }

    @Override // defpackage.bmea
    public final void a(bwrs<ilo> bwrsVar, @dzsi dwfl dwflVar) {
        ilo c;
        if (dwflVar == null || (c = bwrsVar.c()) == null) {
            return;
        }
        begg beggVar = this.a;
        begj begjVar = new begj();
        begjVar.b(c);
        begjVar.c = jjn.EXPANDED;
        begjVar.n = true;
        begjVar.c(false);
        beggVar.o(begjVar, false, null);
    }
}
