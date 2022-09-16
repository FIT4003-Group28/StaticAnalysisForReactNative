package com.google.android.libraries.youtube.innertube.model.player;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class PlaybackTrackingModel implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private static final Set l;
    private static final Set m;
    public final TrackingUrlModel a;
    public final TrackingUrlModel b;
    public final TrackingUrlModel c;
    public final TrackingUrlModel d;
    public final TrackingUrlModel e;
    public final List f;
    public final List g;
    public final int h;
    public final int[] i;
    public final Vss3ConfigModel j;
    public final asab k;
    private final LoggingUrlModel n;

    static {
        HashSet hashSet = new HashSet();
        l = hashSet;
        hashSet.add(aaoc.CPN);
        HashSet hashSet2 = new HashSet();
        m = hashSet2;
        hashSet2.add(aaoc.MS);
        CREATOR = new aalf(17);
    }

    public PlaybackTrackingModel() {
        this(null);
    }

    public static PlaybackTrackingModel a(byte[] bArr) {
        if (bArr != null) {
            try {
                return new PlaybackTrackingModel((asab) aopi.parseFrom(asab.a, bArr));
            } catch (aopx unused) {
            }
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PlaybackTrackingModel)) {
            return false;
        }
        PlaybackTrackingModel playbackTrackingModel = (PlaybackTrackingModel) obj;
        return akzj.f(this.b, playbackTrackingModel.b) && akzj.f(this.c, playbackTrackingModel.c) && akzj.f(this.d, playbackTrackingModel.d) && akzj.f(this.n, playbackTrackingModel.n) && akzj.f(this.e, playbackTrackingModel.e) && akzj.f(this.f, playbackTrackingModel.f) && akzj.f(this.g, playbackTrackingModel.g) && akzj.f(this.a, playbackTrackingModel.a) && this.h == playbackTrackingModel.h && Arrays.equals(this.i, playbackTrackingModel.i);
    }

    public final int hashCode() {
        TrackingUrlModel trackingUrlModel = this.b;
        int i = 0;
        int hashCode = ((trackingUrlModel != null ? trackingUrlModel.hashCode() : 0) + 31) * 31;
        TrackingUrlModel trackingUrlModel2 = this.c;
        int hashCode2 = (hashCode + (trackingUrlModel2 != null ? trackingUrlModel2.hashCode() : 0)) * 31;
        TrackingUrlModel trackingUrlModel3 = this.d;
        int hashCode3 = (hashCode2 + (trackingUrlModel3 != null ? trackingUrlModel3.hashCode() : 0)) * 31;
        LoggingUrlModel loggingUrlModel = this.n;
        int hashCode4 = (hashCode3 + (loggingUrlModel != null ? loggingUrlModel.hashCode() : 0)) * 31;
        TrackingUrlModel trackingUrlModel4 = this.e;
        int hashCode5 = (hashCode4 + (trackingUrlModel4 != null ? trackingUrlModel4.hashCode() : 0)) * 31;
        TrackingUrlModel trackingUrlModel5 = this.a;
        if (trackingUrlModel5 != null) {
            i = trackingUrlModel5.hashCode();
        }
        return (((((hashCode5 + i) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] byteArray = this.k.toByteArray();
        parcel.writeInt(byteArray.length);
        parcel.writeByteArray(byteArray);
    }

    public PlaybackTrackingModel(asab asabVar) {
        TrackingUrlModel trackingUrlModel;
        TrackingUrlModel trackingUrlModel2;
        TrackingUrlModel trackingUrlModel3;
        LoggingUrlModel loggingUrlModel;
        TrackingUrlModel trackingUrlModel4;
        TrackingUrlModel trackingUrlModel5;
        int i;
        asabVar = asabVar == null ? asab.a : asabVar;
        this.k = asabVar;
        Vss3ConfigModel vss3ConfigModel = null;
        if (asabVar == null || (asabVar.b & 1) == 0) {
            trackingUrlModel = null;
        } else {
            aswi aswiVar = asabVar.c;
            trackingUrlModel = new TrackingUrlModel(aswiVar == null ? aswi.a : aswiVar);
        }
        this.b = trackingUrlModel;
        if (asabVar == null || (asabVar.b & 2) == 0) {
            trackingUrlModel2 = null;
        } else {
            aswi aswiVar2 = asabVar.d;
            trackingUrlModel2 = new TrackingUrlModel(aswiVar2 == null ? aswi.a : aswiVar2);
        }
        this.c = trackingUrlModel2;
        if (asabVar == null || (asabVar.b & 4) == 0) {
            trackingUrlModel3 = null;
        } else {
            aswi aswiVar3 = asabVar.e;
            trackingUrlModel3 = new TrackingUrlModel(aswiVar3 == null ? aswi.a : aswiVar3);
        }
        this.d = trackingUrlModel3;
        if (asabVar == null || (asabVar.b & 32768) == 0) {
            loggingUrlModel = null;
        } else {
            aswg aswgVar = asabVar.o;
            loggingUrlModel = new LoggingUrlModel(aswgVar == null ? aswg.a : aswgVar);
        }
        this.n = loggingUrlModel;
        if (asabVar == null || (asabVar.b & 32) == 0) {
            trackingUrlModel4 = null;
        } else {
            aswi aswiVar4 = asabVar.i;
            trackingUrlModel4 = new TrackingUrlModel(aswiVar4 == null ? aswi.a : aswiVar4);
        }
        this.e = trackingUrlModel4;
        if (asabVar == null || (asabVar.b & 16384) == 0) {
            trackingUrlModel5 = null;
        } else {
            aswi aswiVar5 = asabVar.n;
            trackingUrlModel5 = new TrackingUrlModel(aswiVar5 == null ? aswi.a : aswiVar5);
        }
        this.a = trackingUrlModel5;
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        if (asabVar != null && (asabVar.b & 16) != 0) {
            aswi aswiVar6 = asabVar.h;
            arrayList.add(new TrackingUrlModel(aswiVar6 == null ? aswi.a : aswiVar6, l));
        }
        if (asabVar != null && (asabVar.b & 64) != 0) {
            aswi aswiVar7 = asabVar.j;
            arrayList.add(new TrackingUrlModel(aswiVar7 == null ? aswi.a : aswiVar7, m));
        }
        if (asabVar != null && (asabVar.b & 128) != 0) {
            aswi aswiVar8 = asabVar.k;
            arrayList.add(new TrackingUrlModel(aswiVar8 == null ? aswi.a : aswiVar8, m));
        }
        if (asabVar != null && (asabVar.b & 256) != 0) {
            aswi aswiVar9 = asabVar.l;
            arrayList.add(new TrackingUrlModel(aswiVar9 == null ? aswi.a : aswiVar9));
        }
        if (asabVar != null && (asabVar.b & 512) != 0) {
            aswi aswiVar10 = asabVar.m;
            arrayList.add(new TrackingUrlModel(aswiVar10 == null ? aswi.a : aswiVar10));
        }
        if (asabVar != null && asabVar.f.size() != 0) {
            this.i = almu.y(asabVar.f);
        } else {
            this.i = null;
        }
        if (asabVar == null || (i = asabVar.g) <= 0) {
            this.h = 0;
        } else {
            this.h = i;
        }
        this.g = new ArrayList();
        if (asabVar != null && !asabVar.p.isEmpty()) {
            for (auam auamVar : asabVar.p) {
                this.g.add(new PlaybackLoggingPayloadModel(auamVar));
            }
        }
        if (asabVar != null && (asabVar.b & 262144) != 0) {
            awcg awcgVar = asabVar.q;
            vss3ConfigModel = new Vss3ConfigModel(awcgVar == null ? awcg.a : awcgVar);
        }
        this.j = vss3ConfigModel;
    }
}
