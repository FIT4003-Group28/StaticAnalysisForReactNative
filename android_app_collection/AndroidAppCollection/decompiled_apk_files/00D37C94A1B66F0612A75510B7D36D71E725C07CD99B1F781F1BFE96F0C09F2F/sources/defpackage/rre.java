package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusResponse;
import com.google.android.gms.mobiledataplan.MdpPurchaseOfferResponse;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferResponse;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationResponse;
/* compiled from: PG */
/* renamed from: rre  reason: default package */
/* loaded from: classes4.dex */
public class rre extends dvd implements IInterface {
    public rre() {
        super("com.google.android.gms.mobiledataplan.internal.IMobileDataPlanCallbacks");
    }

    public void a(Status status, MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                a((Status) dve.a(parcel, Status.CREATOR), (MdpCarrierPlanIdResponse) dve.a(parcel, MdpCarrierPlanIdResponse.CREATOR));
                return true;
            case 2:
                Status status = (Status) dve.a(parcel, Status.CREATOR);
                MdpDataPlanStatusResponse mdpDataPlanStatusResponse = (MdpDataPlanStatusResponse) dve.a(parcel, MdpDataPlanStatusResponse.CREATOR);
                throw new UnsupportedOperationException();
            case 3:
                Status status2 = (Status) dve.a(parcel, Status.CREATOR);
                MdpUpsellOfferResponse mdpUpsellOfferResponse = (MdpUpsellOfferResponse) dve.a(parcel, MdpUpsellOfferResponse.CREATOR);
                throw new UnsupportedOperationException();
            case 4:
                Status status3 = (Status) dve.a(parcel, Status.CREATOR);
                MdpPurchaseOfferResponse mdpPurchaseOfferResponse = (MdpPurchaseOfferResponse) dve.a(parcel, MdpPurchaseOfferResponse.CREATOR);
                throw new UnsupportedOperationException();
            case 5:
                Status status4 = (Status) dve.a(parcel, Status.CREATOR);
                throw new UnsupportedOperationException();
            case 6:
                Status status5 = (Status) dve.a(parcel, Status.CREATOR);
                GetConsentInformationResponse getConsentInformationResponse = (GetConsentInformationResponse) dve.a(parcel, GetConsentInformationResponse.CREATOR);
                throw new UnsupportedOperationException();
            case 7:
                Status status6 = (Status) dve.a(parcel, Status.CREATOR);
                throw new UnsupportedOperationException();
            default:
                return false;
        }
    }
}
