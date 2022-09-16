package defpackage;

import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.mobiledataplan.CellularInfo;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdRequest;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatus;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusResponse;
import com.google.android.gms.mobiledataplan.MdpFlexTimeWindow;
import com.google.android.gms.mobiledataplan.MdpPurchaseOfferResponse;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferResponse;
import com.google.android.gms.mobiledataplan.MdpUpsellPlan;
import com.google.android.gms.mobiledataplan.WalletBalanceInfo;
import com.google.android.gms.mobiledataplan.carriersupport.CarrierSupportChannel;
import com.google.android.gms.mobiledataplan.carriersupport.CarrierSupportInfo;
import com.google.android.gms.mobiledataplan.consent.ConsentAgreementText;
import com.google.android.gms.mobiledataplan.consent.ConsentStatus;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationResponse;
import com.google.android.gms.mobiledataplan.consent.SafeHtml;
import com.google.android.gms.mobiledataplan.payment.PaymentForm;
import com.google.android.gms.mobstore.DeleteFileRequest;
import com.google.android.gms.mobstore.OpenFileDescriptorRequest;
import com.google.android.gms.mobstore.OpenFileDescriptorResponse;
import com.google.android.gms.mobstore.RenameRequest;
import com.google.android.gms.people.internal.MatrixCursorParcelable;
/* compiled from: PG */
/* renamed from: rra  reason: default package */
/* loaded from: classes4.dex */
public final class rra implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public rra() {
    }

    public rra(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new MdpCarrierPlanIdRequest[i];
            case 1:
                return new CellularInfo[i];
            case 2:
                return new MdpCarrierPlanIdResponse[i];
            case 3:
                return new MdpDataPlanStatusResponse[i];
            case 4:
                return new MdpFlexTimeWindow[i];
            case 5:
                return new MdpPurchaseOfferResponse[i];
            case 6:
                return new MdpUpsellOfferResponse[i];
            case 7:
                return new MdpUpsellPlan[i];
            case 8:
                return new WalletBalanceInfo[i];
            case 9:
                return new CarrierSupportChannel[i];
            case 10:
                return new CarrierSupportInfo[i];
            case 11:
                return new ConsentAgreementText[i];
            case 12:
                return new ConsentStatus[i];
            case 13:
                return new GetConsentInformationResponse[i];
            case 14:
                return new SafeHtml[i];
            case 15:
                return new PaymentForm[i];
            case 16:
                return new DeleteFileRequest[i];
            case 17:
                return new OpenFileDescriptorRequest[i];
            case 18:
                return new OpenFileDescriptorResponse[i];
            case 19:
                return new RenameRequest[i];
            default:
                return new MatrixCursorParcelable[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        String str = null;
        MatrixCursor matrixCursor = null;
        Uri uri = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        Uri uri2 = null;
        Uri uri3 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Integer num = null;
        switch (this.a) {
            case 0:
                int Q = tqj.Q(parcel);
                Bundle bundle = null;
                Integer num2 = null;
                Long l = null;
                while (parcel.dataPosition() < Q) {
                    int readInt = parcel.readInt();
                    int M = tqj.M(readInt);
                    if (M == 1) {
                        str = tqj.Y(parcel, readInt);
                    } else if (M == 2) {
                        bundle = tqj.S(parcel, readInt);
                    } else if (M == 3) {
                        num2 = tqj.W(parcel, readInt);
                    } else if (M == 4) {
                        l = tqj.X(parcel, readInt);
                    } else {
                        tqj.ad(parcel, readInt);
                    }
                }
                tqj.ac(parcel, Q);
                return new MdpCarrierPlanIdRequest(str, bundle, num2, l);
            case 1:
                int Q2 = tqj.Q(parcel);
                Integer num3 = null;
                while (parcel.dataPosition() < Q2) {
                    int readInt2 = parcel.readInt();
                    int M2 = tqj.M(readInt2);
                    if (M2 == 1) {
                        num = tqj.W(parcel, readInt2);
                    } else if (M2 == 2) {
                        num3 = tqj.W(parcel, readInt2);
                    } else {
                        tqj.ad(parcel, readInt2);
                    }
                }
                tqj.ac(parcel, Q2);
                return new CellularInfo(num, num3);
            case 2:
                int Q3 = tqj.Q(parcel);
                long j = 0;
                long j2 = 0;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                CarrierSupportInfo carrierSupportInfo = null;
                Integer num4 = null;
                Long l2 = null;
                int i2 = 0;
                while (parcel.dataPosition() < Q3) {
                    int readInt3 = parcel.readInt();
                    switch (tqj.M(readInt3)) {
                        case 1:
                            str5 = tqj.Y(parcel, readInt3);
                            break;
                        case 2:
                            j = tqj.R(parcel, readInt3);
                            break;
                        case 3:
                            str6 = tqj.Y(parcel, readInt3);
                            break;
                        case 4:
                            str7 = tqj.Y(parcel, readInt3);
                            break;
                        case 5:
                            j2 = tqj.R(parcel, readInt3);
                            break;
                        case 6:
                            str8 = tqj.Y(parcel, readInt3);
                            break;
                        case 7:
                            i2 = tqj.O(parcel, readInt3);
                            break;
                        case 8:
                            carrierSupportInfo = (CarrierSupportInfo) tqj.U(parcel, readInt3, CarrierSupportInfo.CREATOR);
                            break;
                        case 9:
                            num4 = tqj.W(parcel, readInt3);
                            break;
                        case 10:
                            l2 = tqj.X(parcel, readInt3);
                            break;
                        default:
                            tqj.ad(parcel, readInt3);
                            break;
                    }
                }
                tqj.ac(parcel, Q3);
                return new MdpCarrierPlanIdResponse(str5, j, str6, str7, j2, str8, i2, carrierSupportInfo, num4, l2);
            case 3:
                int Q4 = tqj.Q(parcel);
                String str9 = null;
                MdpDataPlanStatus[] mdpDataPlanStatusArr = null;
                Bundle bundle2 = null;
                String str10 = null;
                WalletBalanceInfo walletBalanceInfo = null;
                Integer num5 = null;
                Long l3 = null;
                Long l4 = null;
                CellularInfo[] cellularInfoArr = null;
                while (parcel.dataPosition() < Q4) {
                    int readInt4 = parcel.readInt();
                    switch (tqj.M(readInt4)) {
                        case 1:
                            str9 = tqj.Y(parcel, readInt4);
                            break;
                        case 2:
                            mdpDataPlanStatusArr = (MdpDataPlanStatus[]) tqj.ai(parcel, readInt4, MdpDataPlanStatus.CREATOR);
                            break;
                        case 3:
                            bundle2 = tqj.S(parcel, readInt4);
                            break;
                        case 4:
                            str10 = tqj.Y(parcel, readInt4);
                            break;
                        case 5:
                            walletBalanceInfo = (WalletBalanceInfo) tqj.U(parcel, readInt4, WalletBalanceInfo.CREATOR);
                            break;
                        case 6:
                            num5 = tqj.W(parcel, readInt4);
                            break;
                        case 7:
                            l3 = tqj.X(parcel, readInt4);
                            break;
                        case 8:
                            l4 = tqj.X(parcel, readInt4);
                            break;
                        case 9:
                            cellularInfoArr = (CellularInfo[]) tqj.ai(parcel, readInt4, CellularInfo.CREATOR);
                            break;
                        default:
                            tqj.ad(parcel, readInt4);
                            break;
                    }
                }
                tqj.ac(parcel, Q4);
                return new MdpDataPlanStatusResponse(str9, mdpDataPlanStatusArr, bundle2, str10, walletBalanceInfo, num5, l3, l4, cellularInfoArr);
            case 4:
                int Q5 = tqj.Q(parcel);
                String str11 = null;
                String str12 = null;
                while (parcel.dataPosition() < Q5) {
                    int readInt5 = parcel.readInt();
                    int M3 = tqj.M(readInt5);
                    if (M3 == 1) {
                        str4 = tqj.Y(parcel, readInt5);
                    } else if (M3 == 2) {
                        str11 = tqj.Y(parcel, readInt5);
                    } else if (M3 == 3) {
                        str12 = tqj.Y(parcel, readInt5);
                    } else if (M3 == 4) {
                        i = tqj.O(parcel, readInt5);
                    } else {
                        tqj.ad(parcel, readInt5);
                    }
                }
                tqj.ac(parcel, Q5);
                return new MdpFlexTimeWindow(str4, str11, str12, i);
            case 5:
                int Q6 = tqj.Q(parcel);
                long j3 = 0;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                Bundle bundle3 = null;
                Integer num6 = null;
                Long l5 = null;
                while (parcel.dataPosition() < Q6) {
                    int readInt6 = parcel.readInt();
                    switch (tqj.M(readInt6)) {
                        case 1:
                            str13 = tqj.Y(parcel, readInt6);
                            break;
                        case 2:
                            str14 = tqj.Y(parcel, readInt6);
                            break;
                        case 3:
                            str15 = tqj.Y(parcel, readInt6);
                            break;
                        case 4:
                            str16 = tqj.Y(parcel, readInt6);
                            break;
                        case 5:
                            j3 = tqj.R(parcel, readInt6);
                            break;
                        case 6:
                            str17 = tqj.Y(parcel, readInt6);
                            break;
                        case 7:
                            str18 = tqj.Y(parcel, readInt6);
                            break;
                        case 8:
                            bundle3 = tqj.S(parcel, readInt6);
                            break;
                        case 9:
                            num6 = tqj.W(parcel, readInt6);
                            break;
                        case 10:
                            l5 = tqj.X(parcel, readInt6);
                            break;
                        default:
                            tqj.ad(parcel, readInt6);
                            break;
                    }
                }
                tqj.ac(parcel, Q6);
                return new MdpPurchaseOfferResponse(str13, str14, str15, str16, j3, str17, str18, bundle3, num6, l5);
            case 6:
                int Q7 = tqj.Q(parcel);
                String str19 = null;
                String str20 = null;
                String str21 = null;
                String str22 = null;
                MdpUpsellPlan[] mdpUpsellPlanArr = null;
                Bundle bundle4 = null;
                Integer num7 = null;
                Long l6 = null;
                PaymentForm[] paymentFormArr = null;
                while (parcel.dataPosition() < Q7) {
                    int readInt7 = parcel.readInt();
                    switch (tqj.M(readInt7)) {
                        case 1:
                            str19 = tqj.Y(parcel, readInt7);
                            break;
                        case 2:
                            str20 = tqj.Y(parcel, readInt7);
                            break;
                        case 3:
                            str21 = tqj.Y(parcel, readInt7);
                            break;
                        case 4:
                            str22 = tqj.Y(parcel, readInt7);
                            break;
                        case 5:
                            mdpUpsellPlanArr = (MdpUpsellPlan[]) tqj.ai(parcel, readInt7, MdpUpsellPlan.CREATOR);
                            break;
                        case 6:
                            bundle4 = tqj.S(parcel, readInt7);
                            break;
                        case 7:
                            num7 = tqj.W(parcel, readInt7);
                            break;
                        case 8:
                            l6 = tqj.X(parcel, readInt7);
                            break;
                        case 9:
                            paymentFormArr = (PaymentForm[]) tqj.ai(parcel, readInt7, PaymentForm.CREATOR);
                            break;
                        default:
                            tqj.ad(parcel, readInt7);
                            break;
                    }
                }
                tqj.ac(parcel, Q7);
                return new MdpUpsellOfferResponse(str19, str20, str21, str22, mdpUpsellPlanArr, bundle4, num7, l6, paymentFormArr);
            case 7:
                int Q8 = tqj.Q(parcel);
                long j4 = 0;
                long j5 = 0;
                long j6 = 0;
                String str23 = null;
                String str24 = null;
                String str25 = null;
                String str26 = null;
                String str27 = null;
                String str28 = null;
                String str29 = null;
                int i3 = 0;
                while (parcel.dataPosition() < Q8) {
                    int readInt8 = parcel.readInt();
                    switch (tqj.M(readInt8)) {
                        case 1:
                            str23 = tqj.Y(parcel, readInt8);
                            break;
                        case 2:
                            str24 = tqj.Y(parcel, readInt8);
                            break;
                        case 3:
                            str25 = tqj.Y(parcel, readInt8);
                            break;
                        case 4:
                            j4 = tqj.R(parcel, readInt8);
                            break;
                        case 5:
                            str26 = tqj.Y(parcel, readInt8);
                            break;
                        case 6:
                            str27 = tqj.Y(parcel, readInt8);
                            break;
                        case 7:
                            j5 = tqj.R(parcel, readInt8);
                            break;
                        case 8:
                            j6 = tqj.R(parcel, readInt8);
                            break;
                        case 9:
                            str28 = tqj.Y(parcel, readInt8);
                            break;
                        case 10:
                            str29 = tqj.Y(parcel, readInt8);
                            break;
                        case 11:
                            i3 = tqj.O(parcel, readInt8);
                            break;
                        default:
                            tqj.ad(parcel, readInt8);
                            break;
                    }
                }
                tqj.ac(parcel, Q8);
                return new MdpUpsellPlan(str23, str24, str25, j4, str26, str27, j5, j6, str28, str29, i3);
            case 8:
                int Q9 = tqj.Q(parcel);
                long j7 = 0;
                String str30 = null;
                Long l7 = null;
                String str31 = null;
                String str32 = null;
                Long l8 = null;
                Long l9 = null;
                Long l10 = null;
                String str33 = null;
                int i4 = 0;
                while (parcel.dataPosition() < Q9) {
                    int readInt9 = parcel.readInt();
                    switch (tqj.M(readInt9)) {
                        case 1:
                            j7 = tqj.R(parcel, readInt9);
                            break;
                        case 2:
                            str30 = tqj.Y(parcel, readInt9);
                            break;
                        case 3:
                            i4 = tqj.O(parcel, readInt9);
                            break;
                        case 4:
                            l7 = tqj.X(parcel, readInt9);
                            break;
                        case 5:
                            str31 = tqj.Y(parcel, readInt9);
                            break;
                        case 6:
                            str32 = tqj.Y(parcel, readInt9);
                            break;
                        case 7:
                            l8 = tqj.X(parcel, readInt9);
                            break;
                        case 8:
                            l9 = tqj.X(parcel, readInt9);
                            break;
                        case 9:
                            l10 = tqj.X(parcel, readInt9);
                            break;
                        case 10:
                            str33 = tqj.Y(parcel, readInt9);
                            break;
                        default:
                            tqj.ad(parcel, readInt9);
                            break;
                    }
                }
                tqj.ac(parcel, Q9);
                return new WalletBalanceInfo(j7, str30, i4, l7, str31, str32, l8, l9, l10, str33);
            case 9:
                int Q10 = tqj.Q(parcel);
                String str34 = null;
                String str35 = null;
                String str36 = null;
                String str37 = null;
                String str38 = null;
                int i5 = 0;
                while (parcel.dataPosition() < Q10) {
                    int readInt10 = parcel.readInt();
                    switch (tqj.M(readInt10)) {
                        case 1:
                            str34 = tqj.Y(parcel, readInt10);
                            break;
                        case 2:
                            str35 = tqj.Y(parcel, readInt10);
                            break;
                        case 3:
                            str36 = tqj.Y(parcel, readInt10);
                            break;
                        case 4:
                            str37 = tqj.Y(parcel, readInt10);
                            break;
                        case 5:
                            str38 = tqj.Y(parcel, readInt10);
                            break;
                        case 6:
                            i5 = tqj.O(parcel, readInt10);
                            break;
                        default:
                            tqj.ad(parcel, readInt10);
                            break;
                    }
                }
                tqj.ac(parcel, Q10);
                return new CarrierSupportChannel(str34, str35, str36, str37, str38, i5);
            case 10:
                int Q11 = tqj.Q(parcel);
                String str39 = null;
                CarrierSupportChannel[] carrierSupportChannelArr = null;
                while (parcel.dataPosition() < Q11) {
                    int readInt11 = parcel.readInt();
                    int M4 = tqj.M(readInt11);
                    if (M4 == 1) {
                        str3 = tqj.Y(parcel, readInt11);
                    } else if (M4 == 2) {
                        str39 = tqj.Y(parcel, readInt11);
                    } else if (M4 == 3) {
                        carrierSupportChannelArr = (CarrierSupportChannel[]) tqj.ai(parcel, readInt11, CarrierSupportChannel.CREATOR);
                    } else {
                        tqj.ad(parcel, readInt11);
                    }
                }
                tqj.ac(parcel, Q11);
                return new CarrierSupportInfo(str3, str39, carrierSupportChannelArr);
            case 11:
                int Q12 = tqj.Q(parcel);
                SafeHtml safeHtml = null;
                SafeHtml[] safeHtmlArr = null;
                SafeHtml[] safeHtmlArr2 = null;
                String str40 = null;
                String str41 = null;
                String str42 = null;
                String str43 = null;
                int i6 = 0;
                while (parcel.dataPosition() < Q12) {
                    int readInt12 = parcel.readInt();
                    switch (tqj.M(readInt12)) {
                        case 1:
                            safeHtml = (SafeHtml) tqj.U(parcel, readInt12, SafeHtml.CREATOR);
                            break;
                        case 2:
                            safeHtmlArr = (SafeHtml[]) tqj.ai(parcel, readInt12, SafeHtml.CREATOR);
                            break;
                        case 3:
                            safeHtmlArr2 = (SafeHtml[]) tqj.ai(parcel, readInt12, SafeHtml.CREATOR);
                            break;
                        case 4:
                            str40 = tqj.Y(parcel, readInt12);
                            break;
                        case 5:
                            str41 = tqj.Y(parcel, readInt12);
                            break;
                        case 6:
                            str42 = tqj.Y(parcel, readInt12);
                            break;
                        case 7:
                            i6 = tqj.O(parcel, readInt12);
                            break;
                        case 8:
                            str43 = tqj.Y(parcel, readInt12);
                            break;
                        default:
                            tqj.ad(parcel, readInt12);
                            break;
                    }
                }
                tqj.ac(parcel, Q12);
                return new ConsentAgreementText(safeHtml, safeHtmlArr, safeHtmlArr2, str40, str41, str42, i6, str43);
            case 12:
                int Q13 = tqj.Q(parcel);
                while (parcel.dataPosition() < Q13) {
                    int readInt13 = parcel.readInt();
                    if (tqj.M(readInt13) == 1) {
                        i = tqj.O(parcel, readInt13);
                    } else {
                        tqj.ad(parcel, readInt13);
                    }
                }
                tqj.ac(parcel, Q13);
                return new ConsentStatus(i);
            case 13:
                int Q14 = tqj.Q(parcel);
                Long l11 = 0L;
                ConsentStatus consentStatus = null;
                ConsentAgreementText consentAgreementText = null;
                Integer num8 = null;
                Long l12 = null;
                Integer num9 = null;
                while (parcel.dataPosition() < Q14) {
                    int readInt14 = parcel.readInt();
                    switch (tqj.M(readInt14)) {
                        case 1:
                            consentStatus = (ConsentStatus) tqj.U(parcel, readInt14, ConsentStatus.CREATOR);
                            break;
                        case 2:
                            consentAgreementText = (ConsentAgreementText) tqj.U(parcel, readInt14, ConsentAgreementText.CREATOR);
                            break;
                        case 3:
                            l11 = tqj.X(parcel, readInt14);
                            break;
                        case 4:
                            num8 = tqj.W(parcel, readInt14);
                            break;
                        case 5:
                            l12 = tqj.X(parcel, readInt14);
                            break;
                        case 6:
                            num9 = tqj.W(parcel, readInt14);
                            break;
                        default:
                            tqj.ad(parcel, readInt14);
                            break;
                    }
                }
                tqj.ac(parcel, Q14);
                return new GetConsentInformationResponse(consentStatus, consentAgreementText, l11, num8, l12, num9);
            case 14:
                int Q15 = tqj.Q(parcel);
                while (parcel.dataPosition() < Q15) {
                    int readInt15 = parcel.readInt();
                    if (tqj.M(readInt15) == 1) {
                        str2 = tqj.Y(parcel, readInt15);
                    } else {
                        tqj.ad(parcel, readInt15);
                    }
                }
                tqj.ac(parcel, Q15);
                return new SafeHtml(str2);
            case 15:
                int Q16 = tqj.Q(parcel);
                while (parcel.dataPosition() < Q16) {
                    int readInt16 = parcel.readInt();
                    if (tqj.M(readInt16) == 1) {
                        i = tqj.O(parcel, readInt16);
                    } else {
                        tqj.ad(parcel, readInt16);
                    }
                }
                tqj.ac(parcel, Q16);
                return new PaymentForm(i);
            case 16:
                int Q17 = tqj.Q(parcel);
                while (parcel.dataPosition() < Q17) {
                    int readInt17 = parcel.readInt();
                    if (tqj.M(readInt17) == 1) {
                        uri3 = (Uri) tqj.U(parcel, readInt17, Uri.CREATOR);
                    } else {
                        tqj.ad(parcel, readInt17);
                    }
                }
                tqj.ac(parcel, Q17);
                return new DeleteFileRequest(uri3);
            case 17:
                int Q18 = tqj.Q(parcel);
                while (parcel.dataPosition() < Q18) {
                    int readInt18 = parcel.readInt();
                    int M5 = tqj.M(readInt18);
                    if (M5 == 1) {
                        uri2 = (Uri) tqj.U(parcel, readInt18, Uri.CREATOR);
                    } else if (M5 == 2) {
                        i = tqj.O(parcel, readInt18);
                    } else {
                        tqj.ad(parcel, readInt18);
                    }
                }
                tqj.ac(parcel, Q18);
                return new OpenFileDescriptorRequest(uri2, i);
            case 18:
                int Q19 = tqj.Q(parcel);
                while (parcel.dataPosition() < Q19) {
                    int readInt19 = parcel.readInt();
                    if (tqj.M(readInt19) == 1) {
                        parcelFileDescriptor = (ParcelFileDescriptor) tqj.U(parcel, readInt19, ParcelFileDescriptor.CREATOR);
                    } else {
                        tqj.ad(parcel, readInt19);
                    }
                }
                tqj.ac(parcel, Q19);
                return new OpenFileDescriptorResponse(parcelFileDescriptor);
            case 19:
                int Q20 = tqj.Q(parcel);
                Uri uri4 = null;
                while (parcel.dataPosition() < Q20) {
                    int readInt20 = parcel.readInt();
                    int M6 = tqj.M(readInt20);
                    if (M6 == 1) {
                        uri = (Uri) tqj.U(parcel, readInt20, Uri.CREATOR);
                    } else if (M6 == 2) {
                        uri4 = (Uri) tqj.U(parcel, readInt20, Uri.CREATOR);
                    } else {
                        tqj.ad(parcel, readInt20);
                    }
                }
                tqj.ac(parcel, Q20);
                return new RenameRequest(uri, uri4);
            default:
                int readInt21 = parcel.readInt();
                String[] strArr = new String[readInt21];
                parcel.readStringArray(strArr);
                int readInt22 = parcel.readInt();
                MatrixCursor matrixCursor2 = new MatrixCursor(strArr);
                if (readInt21 != 0 || readInt22 != 0) {
                    while (i < readInt22) {
                        matrixCursor2.addRow(parcel.readArray(Object.class.getClassLoader()));
                        i++;
                    }
                    matrixCursor = matrixCursor2;
                }
                return new MatrixCursorParcelable(matrixCursor);
        }
    }
}
