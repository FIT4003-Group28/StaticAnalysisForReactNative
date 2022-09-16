package com.google.android.libraries.youtube.innertube.model.player;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerThreedRendererModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.protos.youtube.api.innertube.PlayerThreedRendererOuterClass;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class PlayerResponseModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aalf(18);
    public asaj a;
    public final long b;
    public final VideoStreamingData c;
    public final MutableContext d;
    public aaoa e;
    private PlaybackTrackingModel f;
    private PlayerConfigModel g;
    private atzm h;
    private PlayerResponseModel i;
    private List j;
    private aaod k;
    private aozs l;
    private apax m;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class MutableContext implements Parcelable {
        public static final Parcelable.Creator CREATOR = new aalf(19);
        final HashMap a = new HashMap();
        final HashMap b = new HashMap();
        public final HashMap c = new HashMap();

        public final void a(String str, boolean z) {
            this.a.put(str, Boolean.valueOf(z));
        }

        public final void b(String str, long j) {
            this.b.put(str, Long.valueOf(j));
        }

        public final void c(String str, String str2) {
            this.c.put(str, str2);
        }

        public final boolean d(String str) {
            return this.a.containsKey(str) && ((Boolean) this.a.get(str)).booleanValue();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final long e() {
            if (this.b.containsKey("PLAYER_RESPONSE_SOURCE_KEY")) {
                return ((Long) this.b.get("PLAYER_RESPONSE_SOURCE_KEY")).longValue();
            }
            return 0L;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeMap(this.a);
            parcel.writeMap(this.b);
            parcel.writeMap(this.c);
        }
    }

    public PlayerResponseModel(VideoStreamingData videoStreamingData, PlaybackTrackingModel playbackTrackingModel, PlayerConfigModel playerConfigModel) {
        aopc aopcVar = (aopc) asaj.a.createBuilder();
        aopa createBuilder = asap.a.createBuilder();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(videoStreamingData.d);
        createBuilder.copyOnWrite();
        asap asapVar = (asap) createBuilder.instance;
        asapVar.b |= 4;
        asapVar.e = seconds;
        aopcVar.copyOnWrite();
        asaj asajVar = (asaj) aopcVar.instance;
        asap asapVar2 = (asap) createBuilder.mo39build();
        asapVar2.getClass();
        asajVar.g = asapVar2;
        asajVar.b |= 8;
        this.a = (asaj) aopcVar.mo39build();
        videoStreamingData.getClass();
        this.c = videoStreamingData;
        this.b = videoStreamingData.e;
        playbackTrackingModel.getClass();
        this.f = playbackTrackingModel;
        playerConfigModel.getClass();
        this.g = playerConfigModel;
        this.d = new MutableContext();
    }

    private static final SparseArray M(List list) {
        SparseArray sparseArray = new SparseArray();
        for (aqzx aqzxVar : amxp.t(list)) {
            sparseArray.put(aqzxVar.d, aqzxVar);
        }
        return sparseArray;
    }

    private static final List N(SparseArray sparseArray) {
        ArrayList arrayList = new ArrayList(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            arrayList.add((aqzx) sparseArray.valueAt(i));
        }
        return arrayList;
    }

    public static VideoStreamingData d(aanz aanzVar, asaj asajVar, long j) {
        return e(aanzVar, asajVar, j, null);
    }

    public static VideoStreamingData e(aanz aanzVar, asaj asajVar, long j, String str) {
        PlayerThreedRendererModel playerThreedRendererModel;
        PlayerConfigModel playerConfigModel;
        aanzVar.getClass();
        arzt arztVar = asajVar.i;
        if (arztVar == null) {
            arztVar = arzt.a;
        }
        String str2 = arztVar.f;
        if ((asajVar.b & 16) != 0) {
            asap asapVar = asajVar.g;
            if (asapVar == null) {
                asapVar = asap.a;
            }
            String str3 = asapVar.c;
            long millis = TimeUnit.SECONDS.toMillis(asapVar.e);
            boolean z = asapVar.f;
            boolean z2 = asapVar.i;
            boolean z3 = asapVar.g;
            int i = asapVar.k;
            ataz b = ataz.b(asapVar.j);
            if (b == null) {
                b = ataz.MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_UNKNOWN;
            }
            ataz atazVar = b;
            aunb aunbVar = asajVar.q;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (aunbVar.qn(PlayerThreedRendererOuterClass.playerThreedRenderer)) {
                aunb aunbVar2 = asajVar.q;
                if (aunbVar2 == null) {
                    aunbVar2 = aunb.a;
                }
                playerThreedRendererModel = new PlayerThreedRendererModel(((auby) aunbVar2.qm(PlayerThreedRendererOuterClass.playerThreedRenderer)).b);
            } else {
                playerThreedRendererModel = new PlayerThreedRendererModel();
            }
            PlayerThreedRendererModel playerThreedRendererModel2 = playerThreedRendererModel;
            if ((asajVar.b & 2) == 0) {
                playerConfigModel = PlayerConfigModel.b;
            } else {
                atzv atzvVar = asajVar.e;
                if (atzvVar == null) {
                    atzvVar = atzv.a;
                }
                playerConfigModel = new PlayerConfigModel(atzvVar);
            }
            PlayerConfigModel playerConfigModel2 = playerConfigModel;
            asan asanVar = asajVar.h;
            if (asanVar == null) {
                asanVar = asan.a;
            }
            return aanzVar.a(asanVar, str3, str, millis, j, z, z2, z3, i, atazVar, playerThreedRendererModel2, str2, playerConfigModel2);
        }
        return null;
    }

    public static PlayerResponseModel i() {
        return new PlayerResponseModel(asaj.a, 0L);
    }

    public static PlayerResponseModel j(byte[] bArr, long j) {
        asaj asajVar;
        if (bArr == null || (asajVar = (asaj) aaqp.c(bArr, asaj.a)) == null) {
            return null;
        }
        return new PlayerResponseModel(asajVar, j, aanz.b);
    }

    public final String A() {
        asap asapVar = this.a.g;
        if (asapVar == null) {
            asapVar = asap.a;
        }
        return asapVar.d;
    }

    public final String B() {
        asap asapVar = this.a.g;
        if (asapVar == null) {
            asapVar = asap.a;
        }
        return asapVar.c;
    }

    public final List C() {
        if (this.j == null) {
            this.j = new ArrayList();
            for (asac asacVar : this.a.m) {
                if (asacVar.b == 84813246) {
                    this.j.add((aoyb) asacVar.c);
                }
            }
        }
        return this.j;
    }

    public final void D(aalc aalcVar) {
        aopc aopcVar = (aopc) this.a.mo52toBuilder();
        if ((((asaj) aopcVar.instance).b & 8) == 0) {
            asap asapVar = asap.a;
            aopcVar.copyOnWrite();
            asaj asajVar = (asaj) aopcVar.instance;
            asapVar.getClass();
            asajVar.g = asapVar;
            asajVar.b |= 8;
        }
        asap asapVar2 = this.a.g;
        if (asapVar2 == null) {
            asapVar2 = asap.a;
        }
        aopa mo52toBuilder = asapVar2.mo52toBuilder();
        avhn e = aalcVar.e();
        mo52toBuilder.copyOnWrite();
        asap asapVar3 = (asap) mo52toBuilder.instance;
        e.getClass();
        asapVar3.m = e;
        asapVar3.b |= 262144;
        aopcVar.copyOnWrite();
        asaj asajVar2 = (asaj) aopcVar.instance;
        asap asapVar4 = (asap) mo52toBuilder.mo39build();
        asapVar4.getClass();
        asajVar2.g = asapVar4;
        asajVar2.b |= 8;
        this.a = (asaj) aopcVar.mo39build();
    }

    public final boolean E() {
        return u() != null;
    }

    public final boolean F() {
        VideoStreamingData videoStreamingData = this.c;
        if (videoStreamingData != null) {
            return videoStreamingData.B();
        }
        asap asapVar = this.a.g;
        if (asapVar == null) {
            asapVar = asap.a;
        }
        return asapVar.f;
    }

    public final boolean G() {
        VideoStreamingData videoStreamingData = this.c;
        if (videoStreamingData != null) {
            return videoStreamingData.B() && this.c.G();
        }
        asap asapVar = this.a.g;
        if (asapVar == null) {
            asapVar = asap.a;
        }
        return asapVar.i;
    }

    public final boolean H() {
        VideoStreamingData videoStreamingData = this.c;
        if (videoStreamingData != null) {
            return videoStreamingData.E();
        }
        asap asapVar = this.a.g;
        if (asapVar == null) {
            asapVar = asap.a;
        }
        return asapVar.g;
    }

    public final boolean I() {
        asap asapVar = this.a.g;
        if (asapVar == null) {
            asapVar = asap.a;
        }
        return asapVar.h;
    }

    public final byte[] J() {
        return this.a.v.I();
    }

    public final byte[] K() {
        return this.a.toByteArray();
    }

    public final asaf[] L() {
        return (asaf[]) this.a.u.toArray(new asaf[0]);
    }

    public final int a() {
        asap asapVar = this.a.g;
        if (asapVar == null) {
            asapVar = asap.a;
        }
        return (int) asapVar.e;
    }

    public final aalc b() {
        avhn avhnVar;
        asaj asajVar = this.a;
        if ((asajVar.b & 8) != 0) {
            asap asapVar = asajVar.g;
            if (asapVar == null) {
                asapVar = asap.a;
            }
            avhnVar = asapVar.m;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
        } else {
            avhnVar = null;
        }
        return new aalc(avhnVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlayerResponseModel)) {
            return false;
        }
        PlayerResponseModel playerResponseModel = (PlayerResponseModel) obj;
        return akzj.f(B(), playerResponseModel.B()) && akzj.f(t(), playerResponseModel.t());
    }

    public final PlaybackTrackingModel f() {
        if (this.f == null) {
            asab asabVar = this.a.j;
            if (asabVar == null) {
                asabVar = asab.a;
            }
            this.f = new PlaybackTrackingModel(asabVar);
        }
        return this.f;
    }

    public final PlayerResponseModel g(aanz aanzVar, FormatStreamModel formatStreamModel, FormatStreamModel formatStreamModel2) {
        aopa aopaVar;
        long j = this.b;
        asan asanVar = this.a.h;
        if (asanVar == null) {
            asanVar = asan.a;
        }
        long j2 = asanVar.c;
        aopc aopcVar = (aopc) this.a.mo52toBuilder();
        asaj asajVar = (asaj) aopcVar.instance;
        if ((asajVar.b & 16) != 0) {
            asan asanVar2 = asajVar.h;
            if (asanVar2 == null) {
                asanVar2 = asan.a;
            }
            aopaVar = asanVar2.mo52toBuilder();
        } else {
            aopaVar = null;
        }
        if (aopaVar != null) {
            long max = Math.max(0L, j2);
            aopaVar.copyOnWrite();
            asan asanVar3 = (asan) aopaVar.instance;
            asanVar3.b |= 1;
            asanVar3.c = max;
            SparseArray M = M(Collections.unmodifiableList(asanVar3.e));
            if (formatStreamModel != null) {
                if (!formatStreamModel.A()) {
                    SparseArray M2 = M(Collections.unmodifiableList(((asan) aopaVar.instance).d));
                    M2.put(formatStreamModel.e(), formatStreamModel.a);
                    aopaVar.copyOnWrite();
                    ((asan) aopaVar.instance).d = asan.emptyProtobufList();
                    aopaVar.am(N(M2));
                } else {
                    M.put(formatStreamModel.e(), formatStreamModel.a);
                }
            }
            if (formatStreamModel2 != null) {
                M.put(formatStreamModel2.e(), formatStreamModel2.a);
            }
            aopaVar.copyOnWrite();
            ((asan) aopaVar.instance).e = asan.emptyProtobufList();
            aopaVar.al(N(M));
            asan asanVar4 = (asan) aopaVar.mo39build();
            aopcVar.copyOnWrite();
            asaj asajVar2 = (asaj) aopcVar.instance;
            asanVar4.getClass();
            asajVar2.h = asanVar4;
            asajVar2.b |= 16;
        }
        return new PlayerResponseModel((asaj) aopcVar.mo39build(), j, d(aanzVar, (asaj) aopcVar.mo39build(), j));
    }

    public final PlayerResponseModel h(aanz aanzVar, FormatStreamModel formatStreamModel, FormatStreamModel formatStreamModel2, long j, long j2, boolean z) {
        aopa aopaVar;
        aopc aopcVar = (aopc) this.a.mo52toBuilder();
        asaj asajVar = (asaj) aopcVar.instance;
        if ((asajVar.b & 16) != 0) {
            asan asanVar = asajVar.h;
            if (asanVar == null) {
                asanVar = asan.a;
            }
            aopaVar = asanVar.mo52toBuilder();
        } else {
            aopaVar = null;
        }
        if (aopaVar != null) {
            long max = Math.max(0L, j2);
            aopaVar.copyOnWrite();
            asan asanVar2 = (asan) aopaVar.instance;
            asan asanVar3 = asan.a;
            asanVar2.b |= 1;
            asanVar2.c = max;
            if (!z) {
                aopaVar.copyOnWrite();
                asan asanVar4 = (asan) aopaVar.instance;
                asanVar4.b &= -3;
                asanVar4.g = asan.a.g;
                aopaVar.copyOnWrite();
                asan asanVar5 = (asan) aopaVar.instance;
                asanVar5.b &= -5;
                asanVar5.h = asan.a.h;
            }
            SparseArray sparseArray = new SparseArray();
            SparseArray sparseArray2 = new SparseArray();
            if (formatStreamModel != null) {
                if (formatStreamModel.A()) {
                    sparseArray.put(formatStreamModel.e(), formatStreamModel.a);
                } else {
                    sparseArray2.put(formatStreamModel.e(), formatStreamModel.a);
                }
            } else if (z) {
                int size = ((asan) aopaVar.instance).e.size();
                for (int i = 0; i < size; i++) {
                    aqzx aj = aopaVar.aj(i);
                    if (aanp.d(aj.f)) {
                        sparseArray.put(aj.d, aj);
                    }
                }
                int size2 = ((asan) aopaVar.instance).d.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    aqzx aqzxVar = (aqzx) ((asan) aopaVar.instance).d.get(i2);
                    sparseArray2.put(aqzxVar.d, aqzxVar);
                }
            }
            if (formatStreamModel2 != null) {
                sparseArray.put(formatStreamModel2.e(), formatStreamModel2.a);
            } else if (z) {
                int size3 = ((asan) aopaVar.instance).e.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    aqzx aj2 = aopaVar.aj(i3);
                    if (aanp.c(aj2.f)) {
                        sparseArray.put(aj2.d, aj2);
                    }
                }
            }
            aopaVar.copyOnWrite();
            ((asan) aopaVar.instance).e = asan.emptyProtobufList();
            aopaVar.al(N(sparseArray));
            aopaVar.copyOnWrite();
            ((asan) aopaVar.instance).d = asan.emptyProtobufList();
            aopaVar.am(N(sparseArray2));
            asan asanVar6 = (asan) aopaVar.mo39build();
            aopcVar.copyOnWrite();
            asaj asajVar2 = (asaj) aopcVar.instance;
            asanVar6.getClass();
            asajVar2.h = asanVar6;
            asajVar2.b |= 16;
        }
        return new PlayerResponseModel((asaj) aopcVar.mo39build(), j, d(aanzVar, (asaj) aopcVar.mo39build(), j));
    }

    public final int hashCode() {
        return ((B().hashCode() + 19) * 19) + (t() == null ? 0 : Arrays.hashCode(t().toByteArray()));
    }

    public final PlayerResponseModel k() {
        aoyw aoywVar;
        aoob aoobVar;
        if (this.i == null) {
            Iterator it = this.a.m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aoywVar = null;
                    break;
                }
                asac asacVar = (asac) it.next();
                if (asacVar != null && asacVar.b == 88254013) {
                    aoywVar = (aoyw) asacVar.c;
                    break;
                }
            }
            if (aoywVar != null) {
                if (aoywVar.b == 1) {
                    aoobVar = (aoob) aoywVar.c;
                } else {
                    aoobVar = aoob.b;
                }
                this.i = j(aoobVar.I(), this.b);
            }
        }
        return this.i;
    }

    public final PlayerResponseModel l(aanz aanzVar) {
        asan asanVar;
        aopc aopcVar = (aopc) this.a.mo52toBuilder();
        asaj asajVar = (asaj) aopcVar.instance;
        if ((asajVar.b & 16) != 0) {
            asan asanVar2 = asajVar.h;
            if (asanVar2 == null) {
                asanVar2 = asan.a;
            }
            aopa mo52toBuilder = asanVar2.mo52toBuilder();
            mo52toBuilder.copyOnWrite();
            ((asan) mo52toBuilder.instance).e = asan.emptyProtobufList();
            mo52toBuilder.copyOnWrite();
            ((asan) mo52toBuilder.instance).d = asan.emptyProtobufList();
            asanVar = (asan) mo52toBuilder.mo39build();
        } else {
            asanVar = null;
        }
        if (asanVar == null) {
            aopcVar.copyOnWrite();
            asaj asajVar2 = (asaj) aopcVar.instance;
            asajVar2.h = null;
            asajVar2.b &= -17;
        } else {
            aopcVar.copyOnWrite();
            asaj asajVar3 = (asaj) aopcVar.instance;
            asajVar3.h = asanVar;
            asajVar3.b |= 16;
        }
        aopcVar.copyOnWrite();
        ((asaj) aopcVar.instance).m = asaj.emptyProtobufList();
        return new PlayerResponseModel((asaj) aopcVar.mo39build(), this.b, aanzVar);
    }

    public final aaod m(aanz aanzVar) {
        if (this.k == null) {
            aaod a = aaod.a(t(), this.b, aanzVar);
            if (a == null) {
                return null;
            }
            this.k = a;
        }
        return this.k;
    }

    public final aowh n() {
        asaj asajVar = this.a;
        if ((asajVar.c & 16) != 0) {
            aowh aowhVar = asajVar.I;
            return aowhVar == null ? aowh.a : aowhVar;
        }
        return null;
    }

    public final aoyb o() {
        aoyb aoybVar;
        for (asac asacVar : this.a.m) {
            if (asacVar.b == 84813246) {
                aoybVar = (aoyb) asacVar.c;
            } else {
                aoybVar = aoyb.a;
            }
            int d = aoyt.d(aoybVar.d);
            if (d != 0 && d == 2) {
                return aoybVar;
            }
        }
        return null;
    }

    public final aozs p() {
        if (this.l == null) {
            Iterator it = this.a.m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                asac asacVar = (asac) it.next();
                if (asacVar.b == 97725940) {
                    this.l = (aozs) asacVar.c;
                    break;
                }
            }
        }
        return this.l;
    }

    public final apax q() {
        if (this.m == null) {
            Iterator it = this.a.m.iterator();
            while (true) {
                if (it.hasNext()) {
                    asac asacVar = (asac) it.next();
                    if (asacVar != null && asacVar.b == 89145698) {
                        this.m = (apax) asacVar.c;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return this.m;
    }

    public final apyo r() {
        asaj asajVar = this.a;
        if ((asajVar.c & 8) != 0) {
            apyo apyoVar = asajVar.H;
            return apyoVar == null ? apyo.a : apyoVar;
        }
        return null;
    }

    public final arzt s() {
        asaj asajVar = this.a;
        if ((asajVar.b & 32) != 0) {
            arzt arztVar = asajVar.i;
            return arztVar == null ? arzt.a : arztVar;
        }
        return null;
    }

    public final asaa t() {
        asaa asaaVar = this.a.f;
        return asaaVar == null ? asaa.a : asaaVar;
    }

    public final atse u() {
        asaj asajVar = this.a;
        if ((asajVar.b & 128) != 0) {
            atse atseVar = asajVar.k;
            return atseVar == null ? atse.a : atseVar;
        }
        return null;
    }

    public final atzm v() {
        atzm atzmVar;
        if (this.h == null) {
            arzp arzpVar = this.a.s;
            if (arzpVar == null) {
                arzpVar = arzp.a;
            }
            if (arzpVar.b == 59961494) {
                arzp arzpVar2 = this.a.s;
                if (arzpVar2 == null) {
                    arzpVar2 = arzp.a;
                }
                if (arzpVar2.b == 59961494) {
                    atzmVar = (atzm) arzpVar2.c;
                } else {
                    atzmVar = atzm.a;
                }
                this.h = atzmVar;
            }
        }
        return this.h;
    }

    public final awaj w() {
        asaq asaqVar = this.a.t;
        if (asaqVar == null) {
            asaqVar = asaq.a;
        }
        if (asaqVar.b == 74049584) {
            asaq asaqVar2 = this.a.t;
            if (asaqVar2 == null) {
                asaqVar2 = asaq.a;
            }
            if (asaqVar2.b == 74049584) {
                return (awaj) asaqVar2.c;
            }
            return awaj.a;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zgd.K(this.a, parcel);
        parcel.writeLong(this.b);
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.d, 0);
    }

    public final String x() {
        asaj asajVar = this.a;
        if ((asajVar.b & 524288) != 0) {
            return asajVar.x;
        }
        return null;
    }

    public final String y() {
        asaj asajVar = this.a;
        if ((asajVar.b & 262144) != 0) {
            return asajVar.w;
        }
        return null;
    }

    public final String z() {
        asap asapVar = this.a.g;
        if (asapVar == null) {
            asapVar = asap.a;
        }
        return asapVar.n;
    }

    public final PlayerConfigModel c() {
        PlayerConfigModel playerConfigModel;
        if (this.g == null) {
            asaj asajVar = this.a;
            if ((asajVar.b & 2) == 0) {
                playerConfigModel = PlayerConfigModel.b;
            } else {
                atzv atzvVar = asajVar.e;
                if (atzvVar == null) {
                    atzvVar = atzv.a;
                }
                playerConfigModel = new PlayerConfigModel(atzvVar);
            }
            this.g = playerConfigModel;
        }
        return this.g;
    }

    public PlayerResponseModel(asaj asajVar, long j) {
        this(asajVar, j, aanz.a);
    }

    public PlayerResponseModel(asaj asajVar, long j, VideoStreamingData videoStreamingData) {
        this(asajVar, j, videoStreamingData, new MutableContext());
    }

    public PlayerResponseModel(asaj asajVar, long j, VideoStreamingData videoStreamingData, MutableContext mutableContext) {
        asajVar.getClass();
        this.a = asajVar;
        this.b = j;
        this.c = videoStreamingData;
        this.d = mutableContext;
    }

    public PlayerResponseModel(asaj asajVar, long j, aanz aanzVar) {
        this(asajVar, j, d(aanzVar, asajVar, j));
    }
}
