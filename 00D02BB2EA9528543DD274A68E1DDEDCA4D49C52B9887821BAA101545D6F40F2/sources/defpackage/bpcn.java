package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bpcn  reason: default package */
/* loaded from: classes3.dex */
final class bpcn extends bpsk {
    final /* synthetic */ bpcq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpcn(bpcq bpcqVar, bowv bowvVar, bwrs<ilo> bwrsVar, boxa boxaVar, akfa akfaVar, bbtk bbtkVar, bbul bbulVar) {
        super(bowvVar, bwrsVar, boxaVar, akfaVar, bbtkVar, bbulVar);
        this.a = bpcqVar;
    }

    @Override // defpackage.bptp
    public final void a(dwhd dwhdVar) {
        bopt boptVar;
        int a = dwhc.a(dwhdVar.b);
        if (a != 0 && a == 4) {
            bpcq bpcqVar = this.a;
            dnof dnofVar = dwhdVar.c;
            if (dnofVar == null) {
                dnofVar = dnof.b;
            }
            for (dneq dneqVar : dnofVar.a) {
                dqgh b = dqgh.b(dneqVar.a);
                int a2 = dneo.a(dneqVar.b);
                if (a2 != 0 && a2 == 2) {
                    bomu bomuVar = bomu.ADDRESS;
                    int ordinal = b.ordinal();
                    if (ordinal == 1) {
                        bopt boptVar2 = bpcqVar.c;
                        if (boptVar2 != null) {
                            boptVar2.x(true);
                            bpcqVar.c.y(bpcqVar.g.getString(R.string.RAP_INVALID_NAME));
                            cqkx.p(bpcqVar.c);
                        }
                    } else if (ordinal == 6) {
                        bopt boptVar3 = bpcqVar.e;
                        if (boptVar3 != null) {
                            boptVar3.x(true);
                            bpcqVar.e.y(bpcqVar.g.getString(R.string.RAP_INVALID_WEBSITE));
                            cqkx.p(bpcqVar.e);
                        }
                    } else if (ordinal == 18 && (boptVar = bpcqVar.d) != null) {
                        boptVar.x(true);
                        bpcqVar.d.y(bpcqVar.g.getString(R.string.RAP_INVALID_PHONE));
                        cqkx.p(bpcqVar.d);
                    }
                }
            }
        }
    }
}
