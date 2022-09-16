package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.LabelValue;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.LoyaltyPointsBalance;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import com.google.android.libraries.accountlinking.LinkResponse;
import com.google.android.libraries.lens.sdk.intent.BinderBitmap;
import com.google.android.libraries.lens.sdk.intent.LensImage;
import com.google.android.libraries.lidar.VisibilityChangeEventData;
import com.google.android.libraries.parenttools.youtube.ParentToolsResult;
import com.google.android.libraries.social.licenses.License;
import com.google.android.libraries.social.ui.views.expandingscrollview.ExpandingScrollView;
import com.google.android.libraries.video.editablevideo.EditableVideoEdits;
import com.google.android.libraries.video.media.VideoMetaData;
import com.google.android.libraries.youtube.account.identity.AutoValue_AccountIdentity;
import com.google.android.libraries.youtube.ads.model.AdIntro;
import com.google.android.libraries.youtube.ads.model.AdVideoEnd;
import com.google.android.libraries.youtube.ads.model.ForecastingAd;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: rxi  reason: default package */
/* loaded from: classes4.dex */
public final class rxi implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public rxi() {
    }

    public rxi(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new LabelValueRow[i];
            case 1:
                return new LabelValue[i];
            case 2:
                return new LoyaltyPointsBalance[i];
            case 3:
                return new LoyaltyPoints[i];
            case 4:
                return new TextModuleData[i];
            case 5:
                return new TimeInterval[i];
            case 6:
                return new UriData[i];
            case 7:
                return new WalletObjectMessage[i];
            case 8:
                return new LinkResponse[i];
            case 9:
                return new BinderBitmap[i];
            case 10:
                return new LensImage[i];
            case 11:
                return new VisibilityChangeEventData[i];
            case 12:
                return new ParentToolsResult[i];
            case 13:
                return new License[i];
            case 14:
                return new ExpandingScrollView.SavedState[i];
            case 15:
                return new EditableVideoEdits[i];
            case 16:
                return new VideoMetaData[i];
            case 17:
                return new AutoValue_AccountIdentity[i];
            case 18:
                return new AdIntro[0];
            case 19:
                return new AdVideoEnd[0];
            default:
                return new ForecastingAd[0];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i;
        char c = 65535;
        long j = 0;
        int i2 = 3;
        boolean z = false;
        String str = null;
        switch (this.a) {
            case 0:
                int Q = tqj.Q(parcel);
                ArrayList f = tqn.f();
                String str2 = null;
                while (parcel.dataPosition() < Q) {
                    int readInt = parcel.readInt();
                    int M = tqj.M(readInt);
                    if (M == 2) {
                        str = tqj.Y(parcel, readInt);
                    } else if (M == 3) {
                        str2 = tqj.Y(parcel, readInt);
                    } else if (M == 4) {
                        f = tqj.ab(parcel, readInt, LabelValue.CREATOR);
                    } else {
                        tqj.ad(parcel, readInt);
                    }
                }
                tqj.ac(parcel, Q);
                return new LabelValueRow(str, str2, f);
            case 1:
                int Q2 = tqj.Q(parcel);
                String str3 = null;
                while (parcel.dataPosition() < Q2) {
                    int readInt2 = parcel.readInt();
                    int M2 = tqj.M(readInt2);
                    if (M2 == 2) {
                        str = tqj.Y(parcel, readInt2);
                    } else if (M2 == 3) {
                        str3 = tqj.Y(parcel, readInt2);
                    } else {
                        tqj.ad(parcel, readInt2);
                    }
                }
                tqj.ac(parcel, Q2);
                return new LabelValue(str, str3);
            case 2:
                int Q3 = tqj.Q(parcel);
                long j2 = 0;
                double d = 0.0d;
                String str4 = null;
                String str5 = null;
                int i3 = 0;
                int i4 = -1;
                while (parcel.dataPosition() < Q3) {
                    int readInt3 = parcel.readInt();
                    switch (tqj.M(readInt3)) {
                        case 2:
                            i3 = tqj.O(parcel, readInt3);
                            break;
                        case 3:
                            str4 = tqj.Y(parcel, readInt3);
                            break;
                        case 4:
                            d = tqj.K(parcel, readInt3);
                            break;
                        case 5:
                            str5 = tqj.Y(parcel, readInt3);
                            break;
                        case 6:
                            j2 = tqj.R(parcel, readInt3);
                            break;
                        case 7:
                            i4 = tqj.O(parcel, readInt3);
                            break;
                        default:
                            tqj.ad(parcel, readInt3);
                            break;
                    }
                }
                tqj.ac(parcel, Q3);
                return new LoyaltyPointsBalance(i3, str4, d, str5, j2, i4);
            case 3:
                int Q4 = tqj.Q(parcel);
                LoyaltyPointsBalance loyaltyPointsBalance = null;
                TimeInterval timeInterval = null;
                while (parcel.dataPosition() < Q4) {
                    int readInt4 = parcel.readInt();
                    int M3 = tqj.M(readInt4);
                    if (M3 == 2) {
                        str = tqj.Y(parcel, readInt4);
                    } else if (M3 == 3) {
                        loyaltyPointsBalance = (LoyaltyPointsBalance) tqj.U(parcel, readInt4, LoyaltyPointsBalance.CREATOR);
                    } else if (M3 == 5) {
                        timeInterval = (TimeInterval) tqj.U(parcel, readInt4, TimeInterval.CREATOR);
                    } else {
                        tqj.ad(parcel, readInt4);
                    }
                }
                tqj.ac(parcel, Q4);
                return new LoyaltyPoints(str, loyaltyPointsBalance, timeInterval);
            case 4:
                int Q5 = tqj.Q(parcel);
                String str6 = null;
                while (parcel.dataPosition() < Q5) {
                    int readInt5 = parcel.readInt();
                    int M4 = tqj.M(readInt5);
                    if (M4 == 2) {
                        str = tqj.Y(parcel, readInt5);
                    } else if (M4 == 3) {
                        str6 = tqj.Y(parcel, readInt5);
                    } else {
                        tqj.ad(parcel, readInt5);
                    }
                }
                tqj.ac(parcel, Q5);
                return new TextModuleData(str, str6);
            case 5:
                int Q6 = tqj.Q(parcel);
                long j3 = 0;
                while (parcel.dataPosition() < Q6) {
                    int readInt6 = parcel.readInt();
                    int M5 = tqj.M(readInt6);
                    if (M5 == 2) {
                        j = tqj.R(parcel, readInt6);
                    } else if (M5 == 3) {
                        j3 = tqj.R(parcel, readInt6);
                    } else {
                        tqj.ad(parcel, readInt6);
                    }
                }
                tqj.ac(parcel, Q6);
                return new TimeInterval(j, j3);
            case 6:
                int Q7 = tqj.Q(parcel);
                String str7 = null;
                while (parcel.dataPosition() < Q7) {
                    int readInt7 = parcel.readInt();
                    int M6 = tqj.M(readInt7);
                    if (M6 == 2) {
                        str = tqj.Y(parcel, readInt7);
                    } else if (M6 == 3) {
                        str7 = tqj.Y(parcel, readInt7);
                    } else {
                        tqj.ad(parcel, readInt7);
                    }
                }
                tqj.ac(parcel, Q7);
                return new UriData(str, str7);
            case 7:
                int Q8 = tqj.Q(parcel);
                String str8 = null;
                String str9 = null;
                TimeInterval timeInterval2 = null;
                UriData uriData = null;
                UriData uriData2 = null;
                while (parcel.dataPosition() < Q8) {
                    int readInt8 = parcel.readInt();
                    int M7 = tqj.M(readInt8);
                    if (M7 == 2) {
                        str8 = tqj.Y(parcel, readInt8);
                    } else if (M7 == 3) {
                        str9 = tqj.Y(parcel, readInt8);
                    } else if (M7 == 4) {
                        timeInterval2 = (TimeInterval) tqj.U(parcel, readInt8, TimeInterval.CREATOR);
                    } else if (M7 == 5) {
                        uriData = (UriData) tqj.U(parcel, readInt8, UriData.CREATOR);
                    } else if (M7 == 6) {
                        uriData2 = (UriData) tqj.U(parcel, readInt8, UriData.CREATOR);
                    } else {
                        tqj.ad(parcel, readInt8);
                    }
                }
                tqj.ac(parcel, Q8);
                return new WalletObjectMessage(str8, str9, timeInterval2, uriData, uriData2);
            case 8:
                int Q9 = tqj.Q(parcel);
                while (parcel.dataPosition() < Q9) {
                    int readInt9 = parcel.readInt();
                    int M8 = tqj.M(readInt9);
                    if (M8 == 1) {
                        z = tqj.ae(parcel, readInt9);
                    } else if (M8 == 2) {
                        str = tqj.Y(parcel, readInt9);
                    } else {
                        tqj.ad(parcel, readInt9);
                    }
                }
                tqj.ac(parcel, Q9);
                return new LinkResponse(z, str);
            case 9:
                return new BinderBitmap(parcel);
            case 10:
                return new LensImage(parcel);
            case 11:
                return new VisibilityChangeEventData(parcel);
            case 12:
                usv c2 = ParentToolsResult.c();
                c2.a = parcel.createByteArray();
                int readInt10 = parcel.readInt();
                if (readInt10 == 0) {
                    i2 = 1;
                } else if (readInt10 == 1) {
                    i2 = 2;
                } else if (readInt10 != 2) {
                    i2 = 0;
                }
                c2.b(i2);
                return c2.a();
            case 13:
                return new License(parcel);
            case 14:
                return new ExpandingScrollView.SavedState(parcel);
            case 15:
                return new EditableVideoEdits(parcel);
            case 16:
                return new VideoMetaData(parcel);
            case 17:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                boolean z2 = parcel.readInt() == 1;
                boolean z3 = parcel.readInt() == 1;
                boolean z4 = parcel.readInt() == 1;
                String readString4 = parcel.readString();
                boolean z5 = parcel.readInt() == 1;
                boolean z6 = parcel.readInt() == 1;
                boolean z7 = parcel.readInt() == 1;
                String readString5 = parcel.readString();
                switch (readString5.hashCode()) {
                    case 549064719:
                        if (readString5.equals("GAIA_DELEGATION_TYPE_UNKNOWN")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 1384295528:
                        if (readString5.equals("GAIA_DELEGATION_TYPE_EARLY")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1568883937:
                        if (readString5.equals("GAIA_DELEGATION_TYPE_LATE")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1568956787:
                        if (readString5.equals("GAIA_DELEGATION_TYPE_NONE")) {
                            c = 1;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    i = 1;
                } else if (c == 1) {
                    i = 2;
                } else if (c == 2) {
                    i = 3;
                } else if (c != 3) {
                    throw new IllegalArgumentException();
                } else {
                    i = 4;
                }
                return new AutoValue_AccountIdentity(readString, readString2, readString3, z2, z3, z4, readString4, z5, z6, z7, i, parcel.readString());
            case 18:
                String readString6 = parcel.readString();
                byte[] createByteArray = parcel.createByteArray();
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean z8 = parcel.readByte() != 0;
                parcel.readParcelable(PlayerConfigModel.class.getClassLoader());
                return new AdIntro(readString6, createByteArray, readString7, readString8, z8, parcel.readString(), parcel.readLong(), (PlayerResponseModel) parcel.readParcelable(PlayerResponseModel.class.getClassLoader()));
            case 19:
                String readString9 = parcel.readString();
                byte[] createByteArray2 = parcel.createByteArray();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                boolean z9 = parcel.readByte() != 0;
                PlayerConfigModel playerConfigModel = (PlayerConfigModel) parcel.readParcelable(PlayerConfigModel.class.getClassLoader());
                String readString12 = parcel.readString();
                parcel.readLong();
                try {
                    return new AdVideoEnd(readString9, createByteArray2, readString10, readString11, z9, playerConfigModel, readString12, (apax) zgd.J(parcel, apax.a), (PlayerAd) parcel.readParcelable(PlayerAd.class.getClassLoader()));
                } catch (IllegalArgumentException unused) {
                    zep.b("Failed to read adVideoEndRenderer proto from parcel.");
                    return null;
                }
            default:
                try {
                    return new ForecastingAd(parcel.readString(), parcel.createByteArray(), parcel.readString(), parcel.readString(), parcel.readByte() != 0, (PlayerConfigModel) parcel.readParcelable(PlayerConfigModel.class.getClassLoader()), parcel.readString(), parcel.readLong(), (aqzm) zgd.J(parcel, aqzm.a));
                } catch (IllegalArgumentException unused2) {
                    zep.b("Failed to read forecastingAdRenderer proto from parcel.");
                    return null;
                }
        }
    }
}
