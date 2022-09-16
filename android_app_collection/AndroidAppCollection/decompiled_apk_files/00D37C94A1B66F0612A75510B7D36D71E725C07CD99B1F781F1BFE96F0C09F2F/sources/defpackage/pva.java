package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.AdDataParcel;
import com.google.android.gms.ads.internal.client.AdErrorParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.AdValueParcel;
import com.google.android.gms.ads.internal.client.AdapterResponseInfoParcel;
import com.google.android.gms.ads.internal.client.AppOpenAdOptionsParcel;
import com.google.android.gms.ads.internal.client.IconAdOptionsParcel;
import com.google.android.gms.ads.internal.client.SearchAdRequestParcel;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.initialization.MediationConfigurationParcel;
import com.google.android.gms.ads.internal.instream.InstreamAdConfigurationParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
/* compiled from: PG */
/* renamed from: pva  reason: default package */
/* loaded from: classes4.dex */
public final class pva implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public pva() {
    }

    public pva(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new DefaultTrackSelector$SelectionOverride[i];
            case 1:
                return new DefaultTrackSelector$Parameters[i];
            case 2:
                return new TrackSelectionParameters[i];
            case 3:
                return new FlexboxLayout.LayoutParams[i];
            case 4:
                return new FlexboxLayoutManager.LayoutParams[i];
            case 5:
                return new FlexboxLayoutManager.SavedState[i];
            case 6:
                return new AdManagerAdViewOptions[i];
            case 7:
                return new PublisherAdViewOptions[i];
            case 8:
                return new AdDataParcel[i];
            case 9:
                return new AdErrorParcel[i];
            case 10:
                return new AdSizeParcel[i];
            case 11:
                return new AdValueParcel[i];
            case 12:
                return new AdapterResponseInfoParcel[i];
            case 13:
                return new AppOpenAdOptionsParcel[i];
            case 14:
                return new IconAdOptionsParcel[i];
            case 15:
                return new SearchAdRequestParcel[i];
            case 16:
                return new VideoOptionsParcel[i];
            case 17:
                return new NativeAdOptionsParcel[i];
            case 18:
                return new MediationConfigurationParcel[i];
            case 19:
                return new InstreamAdConfigurationParcel[i];
            default:
                return new RewardItemParcel[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        IBinder iBinder = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        IBinder iBinder2 = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        int i4 = 0;
        boolean z3 = false;
        switch (this.a) {
            case 0:
                return new DefaultTrackSelector$SelectionOverride(parcel);
            case 1:
                return new DefaultTrackSelector$Parameters(parcel);
            case 2:
                return new TrackSelectionParameters(parcel);
            case 3:
                return new FlexboxLayout.LayoutParams(parcel);
            case 4:
                return new FlexboxLayoutManager.LayoutParams(parcel);
            case 5:
                return new FlexboxLayoutManager.SavedState(parcel);
            case 6:
                int Q = tqj.Q(parcel);
                while (parcel.dataPosition() < Q) {
                    int readInt = parcel.readInt();
                    int M = tqj.M(readInt);
                    if (M == 1) {
                        z = tqj.ae(parcel, readInt);
                    } else if (M == 2) {
                        iBinder = tqj.T(parcel, readInt);
                    } else {
                        tqj.ad(parcel, readInt);
                    }
                }
                tqj.ac(parcel, Q);
                return new AdManagerAdViewOptions(z, iBinder);
            case 7:
                int Q2 = tqj.Q(parcel);
                IBinder iBinder3 = null;
                while (parcel.dataPosition() < Q2) {
                    int readInt2 = parcel.readInt();
                    int M2 = tqj.M(readInt2);
                    if (M2 == 1) {
                        z3 = tqj.ae(parcel, readInt2);
                    } else if (M2 == 2) {
                        iBinder2 = tqj.T(parcel, readInt2);
                    } else if (M2 == 3) {
                        iBinder3 = tqj.T(parcel, readInt2);
                    } else {
                        tqj.ad(parcel, readInt2);
                    }
                }
                tqj.ac(parcel, Q2);
                return new PublisherAdViewOptions(z3, iBinder2, iBinder3);
            case 8:
                int Q3 = tqj.Q(parcel);
                String str6 = null;
                while (parcel.dataPosition() < Q3) {
                    int readInt3 = parcel.readInt();
                    int M3 = tqj.M(readInt3);
                    if (M3 == 1) {
                        str5 = tqj.Y(parcel, readInt3);
                    } else if (M3 == 2) {
                        str6 = tqj.Y(parcel, readInt3);
                    } else {
                        tqj.ad(parcel, readInt3);
                    }
                }
                tqj.ac(parcel, Q3);
                return new AdDataParcel(str5, str6);
            case 9:
                int Q4 = tqj.Q(parcel);
                String str7 = null;
                String str8 = null;
                AdErrorParcel adErrorParcel = null;
                IBinder iBinder4 = null;
                int i5 = 0;
                while (parcel.dataPosition() < Q4) {
                    int readInt4 = parcel.readInt();
                    int M4 = tqj.M(readInt4);
                    if (M4 == 1) {
                        i5 = tqj.O(parcel, readInt4);
                    } else if (M4 == 2) {
                        str7 = tqj.Y(parcel, readInt4);
                    } else if (M4 == 3) {
                        str8 = tqj.Y(parcel, readInt4);
                    } else if (M4 == 4) {
                        adErrorParcel = (AdErrorParcel) tqj.U(parcel, readInt4, AdErrorParcel.CREATOR);
                    } else if (M4 == 5) {
                        iBinder4 = tqj.T(parcel, readInt4);
                    } else {
                        tqj.ad(parcel, readInt4);
                    }
                }
                tqj.ac(parcel, Q4);
                return new AdErrorParcel(i5, str7, str8, adErrorParcel, iBinder4);
            case 10:
                int Q5 = tqj.Q(parcel);
                String str9 = null;
                AdSizeParcel[] adSizeParcelArr = null;
                int i6 = 0;
                int i7 = 0;
                boolean z4 = false;
                int i8 = 0;
                int i9 = 0;
                boolean z5 = false;
                boolean z6 = false;
                boolean z7 = false;
                boolean z8 = false;
                boolean z9 = false;
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                while (parcel.dataPosition() < Q5) {
                    int readInt5 = parcel.readInt();
                    switch (tqj.M(readInt5)) {
                        case 2:
                            str9 = tqj.Y(parcel, readInt5);
                            break;
                        case 3:
                            i6 = tqj.O(parcel, readInt5);
                            break;
                        case 4:
                            i7 = tqj.O(parcel, readInt5);
                            break;
                        case 5:
                            z4 = tqj.ae(parcel, readInt5);
                            break;
                        case 6:
                            i8 = tqj.O(parcel, readInt5);
                            break;
                        case 7:
                            i9 = tqj.O(parcel, readInt5);
                            break;
                        case 8:
                            adSizeParcelArr = (AdSizeParcel[]) tqj.ai(parcel, readInt5, AdSizeParcel.CREATOR);
                            break;
                        case 9:
                            z5 = tqj.ae(parcel, readInt5);
                            break;
                        case 10:
                            z6 = tqj.ae(parcel, readInt5);
                            break;
                        case 11:
                            z7 = tqj.ae(parcel, readInt5);
                            break;
                        case 12:
                            z8 = tqj.ae(parcel, readInt5);
                            break;
                        case 13:
                            z9 = tqj.ae(parcel, readInt5);
                            break;
                        case 14:
                            z10 = tqj.ae(parcel, readInt5);
                            break;
                        case 15:
                            z11 = tqj.ae(parcel, readInt5);
                            break;
                        case 16:
                            z12 = tqj.ae(parcel, readInt5);
                            break;
                        default:
                            tqj.ad(parcel, readInt5);
                            break;
                    }
                }
                tqj.ac(parcel, Q5);
                return new AdSizeParcel(str9, i6, i7, z4, i8, i9, adSizeParcelArr, z5, z6, z7, z8, z9, z10, z11, z12);
            case 11:
                int Q6 = tqj.Q(parcel);
                long j = 0;
                String str10 = null;
                int i10 = 0;
                int i11 = 0;
                while (parcel.dataPosition() < Q6) {
                    int readInt6 = parcel.readInt();
                    int M5 = tqj.M(readInt6);
                    if (M5 == 1) {
                        i10 = tqj.O(parcel, readInt6);
                    } else if (M5 == 2) {
                        i11 = tqj.O(parcel, readInt6);
                    } else if (M5 == 3) {
                        str10 = tqj.Y(parcel, readInt6);
                    } else if (M5 == 4) {
                        j = tqj.R(parcel, readInt6);
                    } else {
                        tqj.ad(parcel, readInt6);
                    }
                }
                tqj.ac(parcel, Q6);
                return new AdValueParcel(i10, i11, str10, j);
            case 12:
                int Q7 = tqj.Q(parcel);
                long j2 = 0;
                String str11 = null;
                AdErrorParcel adErrorParcel2 = null;
                Bundle bundle = null;
                while (parcel.dataPosition() < Q7) {
                    int readInt7 = parcel.readInt();
                    int M6 = tqj.M(readInt7);
                    if (M6 == 1) {
                        str11 = tqj.Y(parcel, readInt7);
                    } else if (M6 == 2) {
                        j2 = tqj.R(parcel, readInt7);
                    } else if (M6 == 3) {
                        adErrorParcel2 = (AdErrorParcel) tqj.U(parcel, readInt7, AdErrorParcel.CREATOR);
                    } else if (M6 == 4) {
                        bundle = tqj.S(parcel, readInt7);
                    } else {
                        tqj.ad(parcel, readInt7);
                    }
                }
                tqj.ac(parcel, Q7);
                return new AdapterResponseInfoParcel(str11, j2, adErrorParcel2, bundle);
            case 13:
                int Q8 = tqj.Q(parcel);
                while (parcel.dataPosition() < Q8) {
                    int readInt8 = parcel.readInt();
                    if (tqj.M(readInt8) == 2) {
                        i4 = tqj.O(parcel, readInt8);
                    } else {
                        tqj.ad(parcel, readInt8);
                    }
                }
                tqj.ac(parcel, Q8);
                return new AppOpenAdOptionsParcel(i4);
            case 14:
                int Q9 = tqj.Q(parcel);
                while (parcel.dataPosition() < Q9) {
                    int readInt9 = parcel.readInt();
                    if (tqj.M(readInt9) == 2) {
                        i3 = tqj.O(parcel, readInt9);
                    } else {
                        tqj.ad(parcel, readInt9);
                    }
                }
                tqj.ac(parcel, Q9);
                return new IconAdOptionsParcel(i3);
            case 15:
                int Q10 = tqj.Q(parcel);
                while (parcel.dataPosition() < Q10) {
                    int readInt10 = parcel.readInt();
                    if (tqj.M(readInt10) == 15) {
                        str4 = tqj.Y(parcel, readInt10);
                    } else {
                        tqj.ad(parcel, readInt10);
                    }
                }
                tqj.ac(parcel, Q10);
                return new SearchAdRequestParcel(str4);
            case 16:
                int Q11 = tqj.Q(parcel);
                boolean z13 = false;
                boolean z14 = false;
                while (parcel.dataPosition() < Q11) {
                    int readInt11 = parcel.readInt();
                    int M7 = tqj.M(readInt11);
                    if (M7 == 2) {
                        z2 = tqj.ae(parcel, readInt11);
                    } else if (M7 == 3) {
                        z13 = tqj.ae(parcel, readInt11);
                    } else if (M7 == 4) {
                        z14 = tqj.ae(parcel, readInt11);
                    } else {
                        tqj.ad(parcel, readInt11);
                    }
                }
                tqj.ac(parcel, Q11);
                return new VideoOptionsParcel(z2, z13, z14);
            case 17:
                int Q12 = tqj.Q(parcel);
                VideoOptionsParcel videoOptionsParcel = null;
                int i12 = 0;
                boolean z15 = false;
                int i13 = 0;
                boolean z16 = false;
                int i14 = 0;
                boolean z17 = false;
                int i15 = 0;
                while (parcel.dataPosition() < Q12) {
                    int readInt12 = parcel.readInt();
                    switch (tqj.M(readInt12)) {
                        case 1:
                            i12 = tqj.O(parcel, readInt12);
                            break;
                        case 2:
                            z15 = tqj.ae(parcel, readInt12);
                            break;
                        case 3:
                            i13 = tqj.O(parcel, readInt12);
                            break;
                        case 4:
                            z16 = tqj.ae(parcel, readInt12);
                            break;
                        case 5:
                            i14 = tqj.O(parcel, readInt12);
                            break;
                        case 6:
                            videoOptionsParcel = (VideoOptionsParcel) tqj.U(parcel, readInt12, VideoOptionsParcel.CREATOR);
                            break;
                        case 7:
                            z17 = tqj.ae(parcel, readInt12);
                            break;
                        case 8:
                            i15 = tqj.O(parcel, readInt12);
                            break;
                        default:
                            tqj.ad(parcel, readInt12);
                            break;
                    }
                }
                tqj.ac(parcel, Q12);
                return new NativeAdOptionsParcel(i12, z15, i13, z16, i14, videoOptionsParcel, z17, i15);
            case 18:
                int Q13 = tqj.Q(parcel);
                Bundle bundle2 = null;
                while (parcel.dataPosition() < Q13) {
                    int readInt13 = parcel.readInt();
                    int M8 = tqj.M(readInt13);
                    if (M8 == 1) {
                        str3 = tqj.Y(parcel, readInt13);
                    } else if (M8 == 2) {
                        bundle2 = tqj.S(parcel, readInt13);
                    } else {
                        tqj.ad(parcel, readInt13);
                    }
                }
                tqj.ac(parcel, Q13);
                return new MediationConfigurationParcel(str3, bundle2);
            case 19:
                int Q14 = tqj.Q(parcel);
                int i16 = 0;
                int i17 = 0;
                while (parcel.dataPosition() < Q14) {
                    int readInt14 = parcel.readInt();
                    int M9 = tqj.M(readInt14);
                    if (M9 == 1) {
                        i16 = tqj.O(parcel, readInt14);
                    } else if (M9 == 2) {
                        str2 = tqj.Y(parcel, readInt14);
                    } else if (M9 == 3) {
                        i17 = tqj.O(parcel, readInt14);
                    } else if (M9 == 1000) {
                        i2 = tqj.O(parcel, readInt14);
                    } else {
                        tqj.ad(parcel, readInt14);
                    }
                }
                tqj.ac(parcel, Q14);
                return new InstreamAdConfigurationParcel(i2, i16, str2, i17);
            default:
                int Q15 = tqj.Q(parcel);
                while (parcel.dataPosition() < Q15) {
                    int readInt15 = parcel.readInt();
                    int M10 = tqj.M(readInt15);
                    if (M10 == 2) {
                        str = tqj.Y(parcel, readInt15);
                    } else if (M10 == 3) {
                        i = tqj.O(parcel, readInt15);
                    } else {
                        tqj.ad(parcel, readInt15);
                    }
                }
                tqj.ac(parcel, Q15);
                return new RewardItemParcel(str, i);
        }
    }
}
