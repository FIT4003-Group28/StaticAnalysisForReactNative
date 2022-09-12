package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: sef  reason: default package */
/* loaded from: classes7.dex */
public class sef extends sbw implements sap {
    private static final dcqe a = dcqe.c("sef");

    public sef(Application application, cqhn cqhnVar, domy domyVar, CharSequence charSequence, @dzsi cqtd cqtdVar, @dzsi cqkn<sap> cqknVar, boolean z, CharSequence charSequence2, boolean z2, @dzsi cqkn<sap> cqknVar2) {
        super(application, domyVar, charSequence, cqtdVar, cqknVar, z, charSequence2, z2, cqknVar2);
    }

    @Override // defpackage.sbw
    @dzsi
    public rzk D() {
        domy domyVar = domy.UNKNOWN_TRAVEL_MODE;
        int ordinal = z().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                bvoo.h("TravelMode.TRANSIT not supported, use %s instead.", sgl.class.getName());
                return null;
            } else if (ordinal == 3) {
                return rzk.e();
            } else {
                bvoo.h("Unsupported travel mode: %s", z());
                return null;
            }
        }
        return rzk.d();
    }

    @Override // defpackage.sap
    public Boolean h() {
        return true;
    }

    @Override // defpackage.sap
    public Boolean k() {
        return false;
    }
}
