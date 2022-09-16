package com.google.android.libraries.youtube.innertube.model.media;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class VideoStreamingData implements Parcelable {
    private ave A;
    private aanv B;
    private Integer C;
    private Map D;
    public final asan b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final int g;
    public final ataz h;
    public final PlayerThreedRendererModel i;
    public final String j;
    public final aanm k;
    public final int l;
    public final boolean m;
    public final List n;
    public final List o;
    public final List p;
    public final List q;
    public final List r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final int y;
    public final int z;
    public static final VideoStreamingData a = new VideoStreamingData(asan.a, "", 0L, Long.MAX_VALUE, 0L, 0, ataz.MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_UNKNOWN, new PlayerThreedRendererModel(), "", (aanm) null, 0, false);
    public static final Parcelable.Creator CREATOR = new aalf(14);

    public VideoStreamingData(asan asanVar, String str, long j, long j2, long j3, int i, ataz atazVar, PlayerThreedRendererModel playerThreedRendererModel, String str2, aanm aanmVar, int i2, boolean z) {
        this.C = null;
        asanVar.getClass();
        this.b = asanVar;
        this.c = amps.d(str);
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = i < 0 ? 3 : i;
        this.h = atazVar;
        playerThreedRendererModel.getClass();
        this.i = playerThreedRendererModel;
        str2.getClass();
        this.j = str2;
        this.k = aanmVar;
        this.l = i2;
        this.m = z;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (aqzx aqzxVar : asanVar.d) {
            FormatStreamModel formatStreamModel = new FormatStreamModel(aqzxVar, str, j, z);
            arrayList.add(formatStreamModel);
            arrayList2.add(formatStreamModel);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        Iterator it = asanVar.e.iterator();
        boolean z2 = false;
        int i3 = 3;
        int i4 = 3;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (it.hasNext()) {
            Iterator it2 = it;
            FormatStreamModel formatStreamModel2 = new FormatStreamModel((aqzx) it.next(), str, j, z);
            arrayList.add(formatStreamModel2);
            arrayList3.add(formatStreamModel2);
            if (formatStreamModel2.C()) {
                arrayList4.add(formatStreamModel2);
            } else if (formatStreamModel2.P()) {
                arrayList5.add(formatStreamModel2);
            }
            if (!z5 && formatStreamModel2.z()) {
                z5 = true;
            } else if (!z3 && formatStreamModel2.y()) {
                z3 = true;
            } else if (z4 || !formatStreamModel2.B()) {
                int i5 = 3;
                if (i4 == 3) {
                    if (aank.z().contains(Integer.valueOf(formatStreamModel2.e()))) {
                        i4 = formatStreamModel2.U();
                    } else {
                        i5 = 3;
                        i4 = 3;
                    }
                }
                if (i3 == i5) {
                    i3 = aank.e().contains(Integer.valueOf(formatStreamModel2.e())) ? formatStreamModel2.U() : 3;
                }
            } else {
                z4 = true;
            }
            if (!z2 && formatStreamModel2.Q()) {
                z2 = true;
            }
            z6 |= formatStreamModel2.L();
            boolean z8 = z7;
            z7 = (z8 || !formatStreamModel2.F()) ? z8 : true;
            it = it2;
        }
        this.n = Collections.unmodifiableList(arrayList);
        this.o = Collections.unmodifiableList(arrayList2);
        this.p = Collections.unmodifiableList(arrayList3);
        this.q = Collections.unmodifiableList(arrayList4);
        this.r = Collections.unmodifiableList(arrayList5);
        this.v = z2;
        this.y = i4;
        this.z = i3;
        this.s = z3;
        this.t = z4;
        this.u = z5;
        this.w = z6;
        this.x = z7;
    }

    private static final aanv J(FormatStreamModel formatStreamModel) {
        if (formatStreamModel.V() == 3) {
            return aanv.SPHERICAL;
        }
        if (formatStreamModel.V() == 4) {
            return aanv.SPHERICAL_3D;
        }
        if (formatStreamModel.V() == 5) {
            return aanv.MESH;
        }
        int aP = awwc.aP(formatStreamModel.a.u);
        if (aP == 0 || aP != 2) {
            return aanv.RECTANGULAR_2D;
        }
        return aanv.RECTANGULAR_3D;
    }

    public static String p(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append(((FormatStreamModel) it.next()).e());
            sb.append(".");
        }
        return sb.toString();
    }

    public final boolean A(long j) {
        return j >= this.e;
    }

    public final boolean B() {
        switch (this.l) {
            case 8:
            case 9:
            case 10:
                return true;
            default:
                return false;
        }
    }

    public final boolean C() {
        switch (this.l) {
            case 8:
            case 9:
            case 10:
            case 11:
                return true;
            default:
                return false;
        }
    }

    public final boolean D() {
        for (FormatStreamModel formatStreamModel : this.n) {
            if (!formatStreamModel.J()) {
                return false;
            }
        }
        return !this.n.isEmpty();
    }

    public final boolean E() {
        int i = this.l;
        return i == 6 || i == 11;
    }

    public final boolean F() {
        for (FormatStreamModel formatStreamModel : this.n) {
            if (formatStreamModel.e() != aalx.RAW.bD) {
                return false;
            }
        }
        return !this.n.isEmpty();
    }

    public final boolean G() {
        return this.l != 8;
    }

    public final boolean H() {
        return i().a();
    }

    public final boolean I() {
        return this.l == 10;
    }

    public final synchronized int a(int i) {
        if (i <= 0) {
            i = Integer.MAX_VALUE;
        }
        if (this.C == null) {
            this.C = 0;
            for (FormatStreamModel formatStreamModel : this.r) {
                if (formatStreamModel.f() <= i) {
                    this.C = Integer.valueOf(Math.max(this.C.intValue(), formatStreamModel.f()));
                }
            }
        }
        return this.C.intValue();
    }

    public final int b() {
        FormatStreamModel formatStreamModel;
        if (this.p.isEmpty() || (formatStreamModel = (FormatStreamModel) this.p.get(0)) == null) {
            return 0;
        }
        return formatStreamModel.h();
    }

    public final Uri c() {
        aqxo.y(this.v);
        for (asoo asooVar : this.b.j) {
            ason b = ason.b(asooVar.c);
            if (b == null) {
                b = ason.UNKNOWN;
            }
            if (b == ason.WIDEVINE) {
                return Uri.parse(asooVar.d);
            }
        }
        return null;
    }

    public final Uri d() {
        if (this.b.g.isEmpty()) {
            return null;
        }
        return Uri.parse(this.b.g);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Uri e() {
        if (this.b.l.isEmpty()) {
            return null;
        }
        return Uri.parse(this.b.l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VideoStreamingData) {
            VideoStreamingData videoStreamingData = (VideoStreamingData) obj;
            if (this.d == videoStreamingData.d && this.e == videoStreamingData.e && akzj.f(this.c, videoStreamingData.c) && akzj.f(this.b, videoStreamingData.b) && this.g == videoStreamingData.g && akzj.f(this.i, videoStreamingData.i) && akzj.f(this.j, videoStreamingData.j) && this.l == videoStreamingData.l && this.m == videoStreamingData.m) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public final synchronized ave f(String str) {
        if (this.A == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (FormatStreamModel formatStreamModel : this.p) {
                if (!formatStreamModel.L()) {
                    if (formatStreamModel.C()) {
                        arrayList.add(formatStreamModel.R(str));
                    } else if (formatStreamModel.P()) {
                        arrayList2.add(formatStreamModel.R(str));
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList(2);
            if (!arrayList.isEmpty()) {
                arrayList3.add(new afzp(1, arrayList, Collections.emptyList(), Collections.emptyList(), Collections.emptyList()));
            }
            if (!arrayList2.isEmpty()) {
                arrayList3.add(new afzp(2, arrayList2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList()));
            }
            this.A = new ave(this.d, Collections.singletonList(new bar(arrayList3)));
        }
        return this.A;
    }

    public final FormatStreamModel g(int i) {
        for (FormatStreamModel formatStreamModel : this.n) {
            if (formatStreamModel.e() == i) {
                return formatStreamModel;
            }
        }
        return null;
    }

    public final FormatStreamModel h(int i, String str) {
        for (FormatStreamModel formatStreamModel : this.n) {
            if (formatStreamModel.e() == i && TextUtils.equals(formatStreamModel.w(), str)) {
                return formatStreamModel;
            }
        }
        return null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.e), Integer.valueOf(this.g), this.i, this.j, Integer.valueOf(this.l), Boolean.valueOf(this.m)});
    }

    public final VideoStreamingData j(ampt amptVar) {
        aopa mo52toBuilder = this.b.mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        ((asan) mo52toBuilder.instance).e = asan.emptyProtobufList();
        for (aqzx aqzxVar : this.b.e) {
            if (amptVar.a(aqzxVar)) {
                mo52toBuilder.ak(aqzxVar);
            }
        }
        return new VideoStreamingData((asan) mo52toBuilder.mo39build(), this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
    }

    public final VideoStreamingData k(List list, List list2, aanm aanmVar) {
        aopa mo52toBuilder = this.b.mo52toBuilder();
        mo52toBuilder.al(list);
        mo52toBuilder.copyOnWrite();
        asan asanVar = (asan) mo52toBuilder.instance;
        aopu aopuVar = asanVar.j;
        if (!aopuVar.c()) {
            asanVar.j = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll((Iterable) list2, (List) asanVar.j);
        return new VideoStreamingData((asan) mo52toBuilder.mo39build(), this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, aanmVar, this.l, this.m);
    }

    public final VideoStreamingData l(PlayerConfigModel playerConfigModel) {
        aopa mo52toBuilder = this.b.mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        ((asan) mo52toBuilder.instance).e = asan.emptyProtobufList();
        mo52toBuilder.copyOnWrite();
        asan asanVar = (asan) mo52toBuilder.instance;
        asanVar.b |= 2;
        asanVar.g = "";
        return new VideoStreamingData((asan) mo52toBuilder.mo39build(), this.c, this.d, this.e, B(), false, false, this.g, this.h, this.i, this.j, playerConfigModel);
    }

    public final VideoStreamingData m() {
        return j(zto.c);
    }

    public final VideoStreamingData n() {
        return j(zto.e);
    }

    public final String o() {
        return this.b.k;
    }

    public final synchronized Map q() {
        if (this.D == null) {
            this.D = new HashMap();
            for (FormatStreamModel formatStreamModel : this.p) {
                this.D.put(formatStreamModel.e, formatStreamModel);
            }
        }
        return this.D;
    }

    public final boolean r() {
        for (Integer num : aank.s()) {
            if (u(num.intValue())) {
                return true;
            }
        }
        return false;
    }

    public final boolean s() {
        for (FormatStreamModel formatStreamModel : this.p) {
            if (formatStreamModel.K()) {
                return true;
            }
        }
        return false;
    }

    public final boolean t() {
        return !this.o.isEmpty();
    }

    public final String toString() {
        String p = p(this.n);
        long j = this.d;
        long j2 = this.e;
        int i = this.g;
        String valueOf = String.valueOf(this.i);
        String str = this.j;
        int i2 = this.l;
        boolean z = this.m;
        int length = String.valueOf(p).length();
        StringBuilder sb = new StringBuilder(length + 243 + String.valueOf(valueOf).length() + str.length());
        sb.append("VideoStreamingData(itags=");
        sb.append(p);
        sb.append(" videoDurationMillis=");
        sb.append(j);
        sb.append(" expirationInElapsedTimeMillis=");
        sb.append(j2);
        sb.append(" liveChunkReadahead=");
        sb.append(i);
        sb.append(" playerThreedRenderer=");
        sb.append(valueOf);
        sb.append(" innertubeDrmSessionId=");
        sb.append(str);
        sb.append(" playbackType=");
        sb.append(i2);
        sb.append(" useAverageBitrate=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final boolean u(int i) {
        return g(i) != null;
    }

    public final boolean v() {
        for (Integer num : aank.x()) {
            if (u(num.intValue())) {
                return true;
            }
        }
        return false;
    }

    public final boolean w() {
        return i() == aanv.RECTANGULAR_3D || i() == aanv.SPHERICAL_3D;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zgd.K(this.b, parcel);
        this.i.writeToParcel(parcel, i);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
        parcel.writeInt(this.g);
        parcel.writeSerializable(this.h);
        parcel.writeString(this.j);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m ? 1 : 0);
    }

    public final boolean x() {
        for (FormatStreamModel formatStreamModel : this.n) {
            if (!aank.b().contains(Integer.valueOf(formatStreamModel.e()))) {
                return false;
            }
        }
        return !this.n.isEmpty();
    }

    public final boolean y() {
        int i = this.l;
        return i == 6 || i == 7;
    }

    public final boolean z() {
        int i = this.l;
        return i == 8 || i == 9;
    }

    public final synchronized aanv i() {
        if (this.B == null) {
            if (this.i.a != 1) {
                Iterator it = this.p.iterator();
                while (true) {
                    if (it.hasNext()) {
                        FormatStreamModel formatStreamModel = (FormatStreamModel) it.next();
                        if (J(formatStreamModel) != aanv.RECTANGULAR_2D) {
                            this.B = J(formatStreamModel);
                            break;
                        }
                    } else {
                        Iterator it2 = this.o.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                FormatStreamModel formatStreamModel2 = (FormatStreamModel) it2.next();
                                if (J(formatStreamModel2) != aanv.RECTANGULAR_2D) {
                                    this.B = J(formatStreamModel2);
                                    break;
                                }
                            } else {
                                this.B = aanv.RECTANGULAR_2D;
                                break;
                            }
                        }
                    }
                }
            } else {
                this.B = aanv.RECTANGULAR_3D;
            }
        }
        return this.B;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a9, code lost:
        if (r17.d.size() > 0) goto L35;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VideoStreamingData(defpackage.asan r17, java.lang.String r18, long r19, long r21, boolean r23, boolean r24, boolean r25, int r26, defpackage.ataz r27, com.google.android.libraries.youtube.innertube.model.media.PlayerThreedRendererModel r28, java.lang.String r29, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r30) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData.<init>(asan, java.lang.String, long, long, boolean, boolean, boolean, int, ataz, com.google.android.libraries.youtube.innertube.model.media.PlayerThreedRendererModel, java.lang.String, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel):void");
    }
}
