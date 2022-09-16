package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.ads.AdBreakRendererModel;
import com.google.android.libraries.youtube.innertube.model.ads.AdBreakResponseModel;
import com.google.android.libraries.youtube.innertube.model.ads.Survey;
import com.google.android.libraries.youtube.innertube.model.ads.SurveyQuestion;
import com.google.android.libraries.youtube.innertube.model.ads.VastAd;
import com.google.android.libraries.youtube.innertube.model.ads.VastInfoCard;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerThreedRendererModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.LoggingUrlModel;
import com.google.android.libraries.youtube.innertube.model.player.PlaybackLoggingPayloadModel;
import com.google.android.libraries.youtube.innertube.model.player.PlaybackTrackingModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.TrackingUrlModel;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: aalf  reason: default package */
/* loaded from: classes.dex */
public final class aalf implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public aalf() {
    }

    public aalf(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new AdBreakResponseModel[i];
            case 1:
                return new AdBreakRendererModel[i];
            case 2:
                return new Survey[i];
            case 3:
                return new SurveyQuestion[i];
            case 4:
                return new VastAd[i];
            case 5:
                return new VastAd.ProgressPing[i];
            case 6:
                return new VastInfoCard[i];
            case 7:
                return new VastInfoCard.InfoCardAction[i];
            case 8:
                return new VastInfoCard.InfoCardApp[i];
            case 9:
                return new VastInfoCard.InfoCardTrackingEvent[i];
            case 10:
                return new FormatStreamModel[i];
            case 11:
                return new PlayerConfigModel[i];
            case 12:
                return new PlayerThreedRendererModel[i];
            case 13:
                return new VideoQuality[i];
            case 14:
                return new VideoStreamingData[i];
            case 15:
                return new LoggingUrlModel[i];
            case 16:
                return new PlaybackLoggingPayloadModel[i];
            case 17:
                return new PlaybackTrackingModel[i];
            case 18:
                return new PlayerResponseModel[i];
            case 19:
                return new PlayerResponseModel.MutableContext[i];
            default:
                return new TrackingUrlModel[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        asan asanVar = null;
        switch (this.a) {
            case 0:
                try {
                    try {
                        return new AdBreakResponseModel((arkq) aphq.g(parcel, arkq.a, aoos.b()), parcel.readLong());
                    } catch (aopx e) {
                        throw new RuntimeException(e);
                    }
                } catch (RuntimeException unused) {
                    return null;
                }
            case 1:
                try {
                    return new AdBreakRendererModel((aoyb) zgd.J(parcel, aoyb.a));
                } catch (IllegalArgumentException unused2) {
                    return null;
                }
            case 2:
                return new Survey((osc) zgd.J(parcel, osc.a));
            case 3:
                try {
                    return new SurveyQuestion((osd) zgd.J(parcel, osd.a));
                } catch (IllegalArgumentException unused3) {
                    return null;
                }
            case 4:
                List e2 = VastAd.e(parcel);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                byte[] createByteArray = parcel.createByteArray();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                aalh aalhVar = (aalh) Enum.valueOf(aalh.class, parcel.readString());
                String readString10 = parcel.readString();
                int readInt = parcel.readInt();
                PlayerResponseModel playerResponseModel = (PlayerResponseModel) parcel.readParcelable(PlayerResponseModel.class.getClassLoader());
                VideoStreamingData videoStreamingData = (VideoStreamingData) parcel.readParcelable(VideoStreamingData.class.getClassLoader());
                PlaybackTrackingModel playbackTrackingModel = (PlaybackTrackingModel) parcel.readParcelable(PlaybackTrackingModel.class.getClassLoader());
                PlayerConfigModel playerConfigModel = (PlayerConfigModel) parcel.readParcelable(PlayerConfigModel.class.getClassLoader());
                ParcelableMessageLite parcelableMessageLite = (ParcelableMessageLite) parcel.readParcelable(ParcelableMessageLite.class.getClassLoader());
                atzm atzmVar = parcelableMessageLite != null ? (atzm) parcelableMessageLite.a(atzm.a) : null;
                Uri uri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
                List e3 = VastAd.e(parcel);
                List e4 = VastAd.e(parcel);
                List e5 = VastAd.e(parcel);
                List e6 = VastAd.e(parcel);
                ArrayList arrayList = new ArrayList();
                atzm atzmVar2 = atzmVar;
                parcel.readTypedList(arrayList, VastAd.ProgressPing.CREATOR);
                List unmodifiableList = Collections.unmodifiableList(arrayList);
                List e7 = VastAd.e(parcel);
                List e8 = VastAd.e(parcel);
                List e9 = VastAd.e(parcel);
                List e10 = VastAd.e(parcel);
                List e11 = VastAd.e(parcel);
                List e12 = VastAd.e(parcel);
                List e13 = VastAd.e(parcel);
                List e14 = VastAd.e(parcel);
                List e15 = VastAd.e(parcel);
                List e16 = VastAd.e(parcel);
                List e17 = VastAd.e(parcel);
                List e18 = VastAd.e(parcel);
                List e19 = VastAd.e(parcel);
                List e20 = VastAd.e(parcel);
                List e21 = VastAd.e(parcel);
                List e22 = VastAd.e(parcel);
                Uri uri2 = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
                Uri uri3 = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
                boolean z = parcel.readInt() == 1;
                long readLong = parcel.readLong();
                int readInt2 = parcel.readInt();
                boolean z2 = parcel.readInt() == 1;
                aphd aphdVar = (aphd) zgd.J(parcel, aphd.a);
                arit aritVar = (arit) zgd.J(parcel, arit.a);
                long readLong2 = parcel.readLong();
                boolean z3 = parcel.readInt() == 1;
                boolean z4 = parcel.readInt() == 1;
                Uri uri4 = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
                VastAd vastAd = (VastAd) parcel.readParcelable(VastAd.class.getClassLoader());
                VastAd vastAd2 = (VastAd) parcel.readParcelable(VastAd.class.getClassLoader());
                ArrayList arrayList2 = new ArrayList();
                parcel.readStringList(arrayList2);
                boolean z5 = z4;
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    arrayList3.add((aali) Enum.valueOf(aali.class, arrayList2.get(i)));
                    i++;
                    size = size;
                    arrayList2 = arrayList2;
                }
                List unmodifiableList2 = Collections.unmodifiableList(arrayList3);
                ArrayList arrayList4 = new ArrayList();
                parcel.readTypedList(arrayList4, VastInfoCard.CREATOR);
                List unmodifiableList3 = Collections.unmodifiableList(arrayList4);
                Survey survey = (Survey) parcel.readParcelable(Survey.class.getClassLoader());
                List e23 = VastAd.e(parcel);
                List e24 = VastAd.e(parcel);
                List e25 = VastAd.e(parcel);
                boolean z6 = parcel.readInt() == 1;
                String readString11 = parcel.readString();
                return new VastAd(e2, readString, readString2, readString3, readString4, readString5, createByteArray, readString6, readString7, readString8, readString9, aalhVar, readString10, readInt, playerResponseModel, videoStreamingData, playbackTrackingModel, playerConfigModel, atzmVar2, uri, e3, e4, e5, e6, unmodifiableList, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20, e21, e22, uri2, uri3, z, readLong, readInt2, z2, aphdVar, aritVar, readLong2, z3, z5, uri4, vastAd, vastAd2, unmodifiableList2, unmodifiableList3, survey, e23, e24, e25, z6, TextUtils.isEmpty(readString11) ? null : Pattern.compile(readString11), parcel.createByteArray());
            case 5:
                return new VastAd.ProgressPing(parcel.readInt(), parcel.readInt() == 1, (Uri) parcel.readParcelable(Uri.class.getClassLoader()));
            case 6:
                int readInt3 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList();
                parcel.readTypedList(arrayList5, VastInfoCard.InfoCardAction.CREATOR);
                List unmodifiableList4 = Collections.unmodifiableList(arrayList5);
                ArrayList arrayList6 = new ArrayList();
                parcel.readTypedList(arrayList6, VastInfoCard.InfoCardTrackingEvent.CREATOR);
                return new VastInfoCard(readInt3, unmodifiableList4, Collections.unmodifiableList(arrayList6), (VastInfoCard.InfoCardApp) parcel.readParcelable(VastInfoCard.InfoCardApp.class.getClassLoader()));
            case 7:
                String readString12 = parcel.readString();
                ArrayList arrayList7 = new ArrayList();
                parcel.readTypedList(arrayList7, Uri.CREATOR);
                return new VastInfoCard.InfoCardAction(parcel.readInt(), (Uri) parcel.readParcelable(Uri.class.getClassLoader()), readString12, Collections.unmodifiableList(arrayList7));
            case 8:
                return new VastInfoCard.InfoCardApp(parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(Uri.class.getClassLoader()), parcel.readString(), parcel.readInt() == 1, parcel.readFloat(), (Uri) parcel.readParcelable(Uri.class.getClassLoader()), parcel.readInt());
            case 9:
                return new VastInfoCard.InfoCardTrackingEvent(parcel.readInt(), (Uri) parcel.readParcelable(Uri.class.getClassLoader()));
            case 10:
                aqzx aqzxVar = (aqzx) zgd.J(parcel, aqzx.b);
                aqzxVar.getClass();
                return new FormatStreamModel(aqzxVar, parcel.readString(), parcel.readLong(), zgd.L(parcel));
            case 11:
                try {
                    return new PlayerConfigModel((atzv) zgd.J(parcel, atzv.a));
                } catch (IllegalArgumentException unused4) {
                    return PlayerConfigModel.b;
                }
            case 12:
                return new PlayerThreedRendererModel(parcel.readInt());
            case 13:
                return new VideoQuality(parcel.readInt(), parcel.readString(), parcel.readInt() == 1);
            case 14:
                try {
                    asanVar = (asan) zgd.J(parcel, asan.a);
                } catch (IllegalArgumentException e26) {
                    zep.d("Error reading streaming data", e26);
                }
                if (asanVar == null) {
                    asanVar = asan.a;
                }
                asan asanVar2 = asanVar;
                PlayerThreedRendererModel playerThreedRendererModel = (PlayerThreedRendererModel) PlayerThreedRendererModel.CREATOR.createFromParcel(parcel);
                String readString13 = parcel.readString();
                long readLong3 = parcel.readLong();
                long readLong4 = parcel.readLong();
                long readLong5 = parcel.readLong();
                int readInt4 = parcel.readInt();
                ataz atazVar = (ataz) parcel.readSerializable();
                String readString14 = parcel.readString();
                if (readString14 == null) {
                    readString14 = "";
                }
                String str = readString14;
                VideoStreamingData videoStreamingData2 = VideoStreamingData.a;
                int readInt5 = parcel.readInt();
                boolean L = zgd.L(parcel);
                if (atazVar == null) {
                    atazVar = ataz.MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_UNKNOWN;
                }
                return new VideoStreamingData(asanVar2, readString13, readLong3, readLong4, readLong5, readInt4, atazVar, playerThreedRendererModel, str, (aanm) null, readInt5, L);
            case 15:
                return new LoggingUrlModel((ors) zgd.J(parcel, ors.a));
            case 16:
                aoob aoobVar = (aoob) parcel.readSerializable();
                int readInt6 = parcel.readInt();
                aopa createBuilder = auam.a.createBuilder();
                createBuilder.copyOnWrite();
                auam auamVar = (auam) createBuilder.instance;
                aoobVar.getClass();
                auamVar.b = 1 | auamVar.b;
                auamVar.c = aoobVar;
                createBuilder.copyOnWrite();
                auam auamVar2 = (auam) createBuilder.instance;
                auamVar2.b |= 2;
                auamVar2.d = readInt6;
                return new PlaybackLoggingPayloadModel((auam) createBuilder.mo39build());
            case 17:
                try {
                    byte[] bArr = new byte[parcel.readInt()];
                    parcel.readByteArray(bArr);
                    return new PlaybackTrackingModel((asab) aopi.parseFrom(asab.a, bArr));
                } catch (aopx unused5) {
                    return new PlaybackTrackingModel();
                }
            case 18:
                asaj asajVar = (asaj) aaqp.b(parcel, asaj.a);
                if (asajVar != null) {
                    return new PlayerResponseModel(asajVar, parcel.readLong(), (VideoStreamingData) parcel.readParcelable(VideoStreamingData.class.getClassLoader()), (PlayerResponseModel.MutableContext) parcel.readParcelable(PlayerResponseModel.MutableContext.class.getClassLoader()));
                }
                return null;
            case 19:
                PlayerResponseModel.MutableContext mutableContext = new PlayerResponseModel.MutableContext();
                HashMap readHashMap = parcel.readHashMap(Boolean.class.getClassLoader());
                if (readHashMap != null) {
                    for (Map.Entry entry : readHashMap.entrySet()) {
                        mutableContext.a((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
                    }
                }
                HashMap readHashMap2 = parcel.readHashMap(Long.class.getClassLoader());
                if (readHashMap2 != null) {
                    for (Map.Entry entry2 : readHashMap2.entrySet()) {
                        mutableContext.b((String) entry2.getKey(), ((Long) entry2.getValue()).longValue());
                    }
                }
                HashMap readHashMap3 = parcel.readHashMap(String.class.getClassLoader());
                if (readHashMap3 != null) {
                    for (Map.Entry entry3 : readHashMap3.entrySet()) {
                        mutableContext.c((String) entry3.getKey(), (String) entry3.getValue());
                    }
                }
                return mutableContext;
            default:
                return new TrackingUrlModel((osa) zgd.J(parcel, osa.a));
        }
    }
}
