package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.ads.model.InstreamAdImpl;
import com.google.android.libraries.youtube.ads.model.LocalVideoAd;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.ads.model.RemoteVideoAd;
import com.google.android.libraries.youtube.ads.model.SurveyAd;
import com.google.android.libraries.youtube.ads.model.SurveyQuestionRendererModel;
import com.google.android.libraries.youtube.ads.model.ThrottledAd;
import com.google.android.libraries.youtube.ads.model.VideoAdTrackingModel;
import com.google.android.libraries.youtube.ads.model.VideoTrackingAd;
import com.google.android.libraries.youtube.edit.audioswap.model.CategorySelection;
import com.google.android.libraries.youtube.edit.audioswap.model.FeaturedTrackSelection;
import com.google.android.libraries.youtube.edit.audioswap.model.OnDeviceTrackSelection;
import com.google.android.libraries.youtube.edit.audioswap.model.Track;
import com.google.android.libraries.youtube.edit.camera.CameraView;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import com.google.android.libraries.youtube.edit.common.RecordingInfo;
import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import com.google.android.libraries.youtube.infocards.factories.InfoCardCollection;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.android.libraries.youtube.innertube.model.SearchResponseModel;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.ads.AdBreakRendererModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: xcg  reason: default package */
/* loaded from: classes4.dex */
public final class xcg implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public xcg() {
    }

    public xcg(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new InstreamAdImpl[i];
            case 1:
                return new InstreamAdBreak[i];
            case 2:
                return new LocalVideoAd[0];
            case 3:
                return new RemoteVideoAd[i];
            case 4:
                return new SurveyAd[0];
            case 5:
                return new SurveyQuestionRendererModel[i];
            case 6:
                return new ThrottledAd[0];
            case 7:
                return new VideoAdTrackingModel[i];
            case 8:
                return new VideoTrackingAd[0];
            case 9:
                return new CategorySelection[i];
            case 10:
                return new FeaturedTrackSelection[i];
            case 11:
                return new OnDeviceTrackSelection[i];
            case 12:
                return new Track[i];
            case 13:
                return new CameraView.SavedState[i];
            case 14:
                return new DeviceLocalFile[i];
            case 15:
                return new RecordingInfo[i];
            case 16:
                return new FilterMapTable$FilterDescriptor[i];
            case 17:
                return new InfoCardCollection[i];
            case 18:
                return new BrowseResponseModel[i];
            case 19:
                return new SearchResponseModel[i];
            default:
                return new WatchNextResponseModel[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        apzg apzgVar;
        asib asibVar;
        switch (this.a) {
            case 0:
                return new InstreamAdImpl((PlayerAd) parcel.readParcelable(PlayerAd.class.getClassLoader()));
            case 1:
                AdBreakRendererModel adBreakRendererModel = (AdBreakRendererModel) parcel.readParcelable(AdBreakRendererModel.class.getClassLoader());
                int readInt = parcel.readInt();
                boolean z = parcel.readInt() == 1;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                byte[] bArr = new byte[parcel.readInt()];
                parcel.readByteArray(bArr);
                return new InstreamAdBreak(adBreakRendererModel, readInt, z, readString, readString2, readString3, bArr);
            case 2:
                String readString4 = parcel.readString();
                byte[] createByteArray = parcel.createByteArray();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                boolean z2 = parcel.readByte() != 0;
                parcel.readParcelable(PlayerConfigModel.class.getClassLoader());
                try {
                    return new LocalVideoAd(readString4, createByteArray, readString5, readString6, z2, parcel.readString(), parcel.readLong(), (avwu) zgd.J(parcel, avwu.a), (PlayerResponseModel) parcel.readParcelable(PlayerResponseModel.class.getClassLoader()));
                } catch (IllegalArgumentException unused) {
                    zep.b("Failed to read videoAdRenderer proto from parcel.");
                    return null;
                }
            case 3:
                String readString7 = parcel.readString();
                byte[] createByteArray2 = parcel.createByteArray();
                parcel.readString();
                parcel.readString();
                parcel.readByte();
                parcel.readParcelable(PlayerConfigModel.class.getClassLoader());
                String readString8 = parcel.readString();
                long readLong = parcel.readLong();
                boolean z3 = parcel.readInt() != 0;
                int readInt2 = parcel.readInt();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                aalh a = aalh.a(parcel.readString());
                Uri uri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
                PlayerResponseModel playerResponseModel = (PlayerResponseModel) parcel.readParcelable(PlayerResponseModel.class.getClassLoader());
                try {
                    apzgVar = (apzg) zgd.J(parcel, apzg.a);
                } catch (IllegalArgumentException unused2) {
                    zep.b("Failed to read closeCommand from parcel.");
                    apzgVar = null;
                }
                try {
                    asibVar = (asib) zgd.J(parcel, asib.a);
                } catch (IllegalArgumentException unused3) {
                    zep.b("Failed to read instreamAdPlayerOverlayRenderer from parcel.");
                    asibVar = null;
                }
                return new RemoteVideoAd(z3, readInt2, readLong, readString8, readString9, readString7, readString10, createByteArray2, a, uri, playerResponseModel, apzgVar, asibVar);
            case 4:
                String readString11 = parcel.readString();
                byte[] createByteArray3 = parcel.createByteArray();
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                boolean z4 = parcel.readByte() != 0;
                PlayerConfigModel playerConfigModel = (PlayerConfigModel) parcel.readParcelable(PlayerConfigModel.class.getClassLoader());
                String readString14 = parcel.readString();
                parcel.readLong();
                try {
                    return new SurveyAd(readString11, createByteArray3, readString12, readString13, z4, playerConfigModel, readString14, (avcu) zgd.J(parcel, avcu.a));
                } catch (IllegalArgumentException unused4) {
                    zep.b("Failed to read surveyAdRenderer proto from parcel.");
                    return null;
                }
            case 5:
                return new SurveyQuestionRendererModel((avct) zgd.J(parcel, avct.a));
            case 6:
                return new ThrottledAd(parcel.readString(), parcel.createByteArray(), parcel.readString(), parcel.readString(), parcel.readByte() != 0, (PlayerConfigModel) parcel.readParcelable(PlayerConfigModel.class.getClassLoader()), parcel.readString(), parcel.readLong());
            case 7:
                try {
                    return new VideoAdTrackingModel((apai) zgd.J(parcel, apai.a));
                } catch (IllegalArgumentException unused5) {
                    return null;
                }
            case 8:
                try {
                    return new VideoTrackingAd(parcel.readString(), parcel.createByteArray(), parcel.readString(), parcel.readByte() != 0, (PlayerConfigModel) parcel.readParcelable(PlayerConfigModel.class.getClassLoader()), parcel.readInt(), (avww) zgd.J(parcel, avww.a));
                } catch (IllegalArgumentException unused6) {
                    zep.b("Failed to read videoAdTrackingRenderer proto from parcel.");
                    return null;
                }
            case 9:
                return new CategorySelection(parcel);
            case 10:
                return new FeaturedTrackSelection(parcel);
            case 11:
                return new OnDeviceTrackSelection(parcel);
            case 12:
                return new Track(parcel);
            case 13:
                return new CameraView.SavedState(parcel);
            case 14:
                znd i = DeviceLocalFile.i();
                i.e(parcel.readLong());
                i.h((Uri) parcel.readParcelable(Uri.class.getClassLoader()));
                i.b(parcel.readString());
                i.a = parcel.readString();
                i.g(parcel.readLong());
                i.c(parcel.readLong());
                i.f(parcel.readLong());
                i.d(parcel.readInt());
                return i.a();
            case 15:
                return new RecordingInfo(parcel);
            case 16:
                return new FilterMapTable$FilterDescriptor(parcel);
            case 17:
                try {
                    return new InfoCardCollection((arit) aphq.g(parcel, arit.a, aoos.b()));
                } catch (aopx unused7) {
                    return null;
                }
            case 18:
                arlt arltVar = (arlt) aaqp.b(parcel, arlt.a);
                if (arltVar != null) {
                    return new BrowseResponseModel(arltVar);
                }
                return null;
            case 19:
                try {
                    return new SearchResponseModel((asbz) aaqp.b(parcel, asbz.a));
                } catch (IllegalArgumentException unused8) {
                    return null;
                }
            default:
                try {
                    return new WatchNextResponseModel((asgt) aaqp.b(parcel, asgt.a));
                } catch (aopx unused9) {
                    return null;
                }
        }
    }
}
