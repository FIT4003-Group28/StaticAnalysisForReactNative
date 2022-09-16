package com.google.android.libraries.youtube.innertube.model.ads;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlaybackTrackingModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class VastAd implements Parcelable, InstreamAd, afto, aalj {
    public static final Parcelable.Creator CREATOR;
    public static final String a;
    public final amuk A;
    public final amuk B;
    public final amuk C;
    public final amuk D;
    public final amuk E;
    public final amuk F;
    public final amuk G;
    public final amuk H;
    public final amuk I;

    /* renamed from: J  reason: collision with root package name */
    public final amuk f165J;
    public final amuk K;
    public final amuk L;
    public final amuk M;
    public final amuk N;
    public final Uri O;
    public final Uri P;
    public final boolean Q;
    public final long R;
    public final int S;
    public final boolean T;
    public final aphd U;
    public final arit V;
    public final Uri W;
    public final VastAd X;
    public final VastAd Y;
    public final long Z;
    public final boolean aa;
    public final boolean ab;
    public final amuk ac;
    public final Survey ad;
    public final boolean ae;
    public final amuk af;
    public final amuk ag;
    public final amuk ah;
    public final Pattern ai;
    public final byte[] aj;
    private final String ak;
    private final VideoStreamingData al;
    private final boolean am;
    private final amuk an;
    public final amuk b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final byte[] h;
    public final String i;
    public final String j;
    public final String k;
    public final aalh l;
    public final String m;
    public final int n;
    public final PlayerResponseModel o;
    public final PlaybackTrackingModel p;
    public final PlayerConfigModel q;
    public final atzm r;
    public final Uri s;
    public final amuk t;
    public final amuk u;
    public final amuk v;
    public final amuk w;
    public final amuk x;
    public final amuk y;
    public final amuk z;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class ProgressPing implements Parcelable, afto {
        public static final Parcelable.Creator CREATOR = new aalf(5);
        public static final aalq a = new aalq();
        public final int b;
        public final boolean c;
        public final Uri d;

        public ProgressPing(int i, boolean z, Uri uri) {
            this.b = i;
            this.c = z;
            this.d = uri;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ProgressPing)) {
                return false;
            }
            ProgressPing progressPing = (ProgressPing) obj;
            return this.b == progressPing.b && akzj.f(Boolean.valueOf(this.c), Boolean.valueOf(progressPing.c)) && akzj.f(this.d, progressPing.d);
        }

        @Override // defpackage.afto
        public final /* bridge */ /* synthetic */ aftn h() {
            return new aalq(this);
        }

        public final int hashCode() {
            return ((((((getClass().hashCode() + 527) * 31) + this.b) * 31) + (this.c ? 1 : 0)) * 31) + this.d.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeInt(this.c ? 1 : 0);
            parcel.writeParcelable(this.d, 0);
        }
    }

    static {
        new VastAd();
        String num = Integer.toString(2);
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 5);
        sb.append(num);
        sb.append("_2_15");
        a = sb.toString();
        CREATOR = new aalf(4);
    }

    private VastAd() {
        this.b = amuk.q();
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.ak = null;
        this.j = null;
        this.k = null;
        this.l = aalh.UNKNOWN;
        this.m = null;
        this.n = 0;
        this.o = null;
        this.al = null;
        this.p = new PlaybackTrackingModel();
        this.q = PlayerConfigModel.b;
        this.r = null;
        this.s = null;
        this.t = amuk.q();
        this.u = amuk.q();
        this.v = amuk.q();
        this.w = amuk.q();
        this.x = amuk.q();
        this.y = amuk.q();
        this.z = amuk.q();
        this.A = amuk.q();
        this.B = amuk.q();
        this.C = amuk.q();
        this.D = amuk.q();
        this.E = amuk.q();
        this.F = amuk.q();
        this.G = amuk.q();
        this.H = amuk.q();
        this.I = amuk.q();
        this.f165J = amuk.q();
        this.K = amuk.q();
        this.L = amuk.q();
        this.M = amuk.q();
        this.N = amuk.q();
        this.O = null;
        this.P = null;
        this.Q = true;
        this.R = 0L;
        this.S = -1;
        this.T = false;
        this.U = null;
        this.V = null;
        this.Z = 0L;
        this.aa = false;
        this.ab = false;
        this.W = null;
        this.am = false;
        this.X = null;
        this.Y = null;
        p();
        o();
        n();
        this.an = amuk.q();
        this.ac = amuk.q();
        this.ad = null;
        this.af = amuk.q();
        this.ag = amuk.q();
        this.ah = amuk.q();
        this.ae = false;
        this.ai = null;
        this.aj = null;
    }

    public static List e(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readTypedList(arrayList, Uri.CREATOR);
        return Collections.unmodifiableList(arrayList);
    }

    private static amuk q(List list) {
        return list == null ? amuk.q() : amuk.o(list);
    }

    @Override // defpackage.aalj
    public final long a() {
        return this.R;
    }

    @Override // defpackage.aalj
    public final boolean b() {
        return this.ab;
    }

    @Override // com.google.android.libraries.youtube.innertube.model.ads.InstreamAd
    public final int c() {
        throw null;
    }

    @Override // com.google.android.libraries.youtube.innertube.model.ads.InstreamAd
    public final Uri d() {
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof VastAd)) {
            return false;
        }
        VastAd vastAd = (VastAd) obj;
        return akzj.f(this.c, vastAd.c) && akzj.f(this.d, vastAd.d) && akzj.f(this.e, vastAd.e) && akzj.f(this.f, vastAd.f) && akzj.f(this.g, vastAd.g) && Arrays.equals(this.h, vastAd.h) && akzj.f(this.i, vastAd.i) && akzj.f(this.ak, vastAd.ak) && akzj.f(this.j, vastAd.j) && akzj.f(this.k, vastAd.k) && akzj.f(this.l, vastAd.l) && akzj.f(this.m, vastAd.m) && akzj.f(this.o, vastAd.o) && akzj.f(this.al, vastAd.al) && akzj.f(this.p, vastAd.p) && akzj.f(this.q, vastAd.q) && akzj.f(this.s, vastAd.s) && this.n == vastAd.n && this.Q == vastAd.Q && this.R == vastAd.R && this.S == vastAd.S && akzj.f(this.b, vastAd.b) && akzj.f(this.t, vastAd.t) && akzj.f(this.u, vastAd.u) && akzj.f(this.v, vastAd.v) && akzj.f(this.w, vastAd.w) && akzj.f(this.x, vastAd.x) && akzj.f(this.y, vastAd.y) && akzj.f(this.z, vastAd.z) && akzj.f(this.A, vastAd.A) && akzj.f(this.B, vastAd.B) && akzj.f(this.C, vastAd.C) && akzj.f(this.D, vastAd.D) && akzj.f(this.E, vastAd.E) && akzj.f(this.F, vastAd.F) && akzj.f(this.G, vastAd.G) && akzj.f(this.H, vastAd.H) && akzj.f(this.I, vastAd.I) && akzj.f(this.f165J, vastAd.f165J) && akzj.f(this.K, vastAd.K) && akzj.f(this.L, vastAd.L) && akzj.f(this.M, vastAd.M) && akzj.f(this.N, vastAd.N) && akzj.f(this.O, vastAd.O) && akzj.f(this.P, vastAd.P) && akzj.f(this.W, vastAd.W) && akzj.f(this.X, vastAd.X) && akzj.f(this.Y, vastAd.Y) && this.aa == vastAd.aa && this.ab == vastAd.ab && akzj.f(this.an, vastAd.an) && akzj.f(this.ac, vastAd.ac) && akzj.f(this.ad, vastAd.ad) && akzj.f(this.r, vastAd.r) && akzj.f(this.af, vastAd.af) && akzj.f(this.ag, vastAd.ag) && akzj.f(this.ah, vastAd.ah) && this.ae == vastAd.ae && akzj.f(this.ai, vastAd.ai) && Arrays.equals(this.aj, vastAd.aj);
    }

    @Override // com.google.android.libraries.youtube.innertube.model.ads.InstreamAd
    public final aalh f() {
        throw null;
    }

    @Override // com.google.android.libraries.youtube.innertube.model.ads.InstreamAd
    public final String g() {
        throw null;
    }

    @Override // defpackage.afto
    public final /* bridge */ /* synthetic */ aftn h() {
        return new aalp(this);
    }

    public final int hashCode() {
        return 0;
    }

    @Override // com.google.android.libraries.youtube.innertube.model.ads.InstreamAd
    public final String i() {
        throw null;
    }

    @Override // com.google.android.libraries.youtube.innertube.model.ads.InstreamAd
    public final String j() {
        throw null;
    }

    @Override // com.google.android.libraries.youtube.innertube.model.ads.InstreamAd
    public final boolean k(snc sncVar) {
        throw null;
    }

    @Override // com.google.android.libraries.youtube.innertube.model.ads.InstreamAd
    public final boolean l() {
        throw null;
    }

    @Override // com.google.android.libraries.youtube.innertube.model.ads.InstreamAd
    public final boolean m() {
        throw null;
    }

    public final void n() {
        LinkedList linkedList = new LinkedList();
        for (VastAd vastAd = this; vastAd != null; vastAd = vastAd.Y) {
            String str = vastAd.j;
            if (str == null) {
                str = "";
            }
            linkedList.offerFirst(str);
        }
        TextUtils.join(",", linkedList);
    }

    public final void o() {
        LinkedList linkedList = new LinkedList();
        for (VastAd vastAd = this; vastAd != null; vastAd = vastAd.Y) {
            String str = vastAd.k;
            if (str == null) {
                str = "";
            }
            linkedList.offerFirst(str);
        }
        TextUtils.join(",", linkedList);
    }

    public final void p() {
        LinkedList linkedList = new LinkedList();
        for (VastAd vastAd = this; vastAd != null; vastAd = vastAd.Y) {
            linkedList.offerFirst(Long.valueOf(vastAd.Z));
        }
        TextUtils.join(",", linkedList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeByteArray(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.ak);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l.toString());
        parcel.writeString(this.m);
        parcel.writeInt(this.n);
        parcel.writeParcelable(this.o, 0);
        parcel.writeParcelable(this.al, 0);
        parcel.writeParcelable(this.p, 0);
        parcel.writeParcelable(this.q, 0);
        parcel.writeParcelable(new ParcelableMessageLite(this.r), 0);
        parcel.writeParcelable(this.s, 0);
        parcel.writeTypedList(this.t);
        parcel.writeTypedList(this.u);
        parcel.writeTypedList(this.v);
        parcel.writeTypedList(this.w);
        parcel.writeTypedList(this.x);
        parcel.writeTypedList(this.y);
        parcel.writeTypedList(this.z);
        parcel.writeTypedList(this.A);
        parcel.writeTypedList(this.B);
        parcel.writeTypedList(this.D);
        parcel.writeTypedList(this.E);
        parcel.writeTypedList(this.F);
        parcel.writeTypedList(this.G);
        parcel.writeTypedList(this.H);
        parcel.writeTypedList(this.I);
        parcel.writeTypedList(this.f165J);
        parcel.writeTypedList(this.K);
        parcel.writeTypedList(this.L);
        parcel.writeTypedList(this.M);
        parcel.writeTypedList(this.N);
        parcel.writeTypedList(this.C);
        parcel.writeParcelable(this.O, 0);
        parcel.writeParcelable(this.P, 0);
        parcel.writeInt(this.Q ? 1 : 0);
        parcel.writeLong(this.R);
        parcel.writeInt(this.S);
        parcel.writeInt(this.T ? 1 : 0);
        aphd aphdVar = this.U;
        if (aphdVar == null) {
            aphdVar = aphd.a;
        }
        zgd.K(aphdVar, parcel);
        arit aritVar = this.V;
        if (aritVar == null) {
            aritVar = arit.a;
        }
        zgd.K(aritVar, parcel);
        parcel.writeLong(this.Z);
        parcel.writeInt(this.aa ? 1 : 0);
        parcel.writeInt(this.ab ? 1 : 0);
        parcel.writeParcelable(this.W, 0);
        parcel.writeParcelable(this.X, 0);
        parcel.writeParcelable(this.Y, 0);
        amuk<aali> amukVar = this.an;
        ArrayList arrayList = new ArrayList();
        for (aali aaliVar : amukVar) {
            arrayList.add(aaliVar.name());
        }
        parcel.writeStringList(arrayList);
        parcel.writeTypedList(this.ac);
        parcel.writeParcelable(this.ad, 0);
        parcel.writeTypedList(this.af);
        parcel.writeTypedList(this.ag);
        parcel.writeTypedList(this.ah);
        parcel.writeInt(this.ae ? 1 : 0);
        Pattern pattern = this.ai;
        parcel.writeString(pattern == null ? "" : pattern.pattern());
        parcel.writeByteArray(this.aj);
    }

    public final String toString() {
        if (!this.am) {
            String str = this.j;
            String str2 = this.c;
            String str3 = this.k;
            int length = String.valueOf(str).length();
            StringBuilder sb = new StringBuilder(length + 48 + String.valueOf(str2).length() + String.valueOf(str3).length());
            sb.append("VastAd: [vastAdId=");
            sb.append(str);
            sb.append(", adVideoId=");
            sb.append(str2);
            sb.append(", vastAdSystem = ");
            sb.append(str3);
            sb.append("]");
            return sb.toString();
        }
        String valueOf = String.valueOf(this.W);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 29);
        sb2.append("VastAd Wrapper: [wrapperUri=");
        sb2.append(valueOf);
        sb2.append("]");
        return sb2.toString();
    }

    public VastAd(List list, String str, String str2, String str3, String str4, String str5, byte[] bArr, String str6, String str7, String str8, String str9, aalh aalhVar, String str10, int i, PlayerResponseModel playerResponseModel, VideoStreamingData videoStreamingData, PlaybackTrackingModel playbackTrackingModel, PlayerConfigModel playerConfigModel, atzm atzmVar, Uri uri, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, List list22, Uri uri2, Uri uri3, boolean z, long j, int i2, boolean z2, aphd aphdVar, arit aritVar, long j2, boolean z3, boolean z4, Uri uri4, VastAd vastAd, VastAd vastAd2, List list23, List list24, Survey survey, List list25, List list26, List list27, boolean z5, Pattern pattern, byte[] bArr2) {
        this.b = q(list);
        this.c = str;
        this.d = str2;
        arit aritVar2 = null;
        this.e = str3 != null ? str3 : vastAd2 != null ? vastAd2.e : null;
        this.f = str4 != null ? str4 : vastAd2 != null ? vastAd2.f : null;
        this.g = str5 != null ? str5 : vastAd2 != null ? vastAd2.g : null;
        this.h = bArr;
        this.i = str6;
        this.ak = str7;
        this.j = str8;
        this.k = str9;
        this.l = aalhVar;
        this.m = str10;
        this.n = i;
        this.o = playerResponseModel;
        this.al = videoStreamingData;
        playbackTrackingModel.getClass();
        this.p = playbackTrackingModel;
        playerConfigModel.getClass();
        this.q = playerConfigModel;
        this.r = atzmVar;
        this.s = uri;
        this.t = q(list2);
        this.u = q(list3);
        this.v = q(list4);
        this.w = q(list5);
        this.x = q(list6);
        this.y = q(list7);
        this.z = q(list8);
        this.A = q(list9);
        this.B = q(list10);
        this.C = q(list22);
        this.D = q(list11);
        this.E = q(list12);
        this.F = q(list13);
        this.G = q(list14);
        this.H = q(list15);
        this.I = q(list16);
        this.f165J = q(list17);
        this.K = q(list18);
        this.L = q(list19);
        this.M = q(list20);
        this.N = q(list21);
        this.O = uri2;
        this.P = uri3;
        this.Q = z;
        this.R = j;
        this.S = i2;
        this.T = z2;
        aphd aphdVar2 = aphdVar;
        boolean z6 = true;
        this.U = true == aphd.a.equals(aphdVar2) ? null : aphdVar2;
        this.V = true != arit.a.equals(aritVar) ? aritVar : aritVar2;
        this.Z = j2;
        this.aa = z3;
        this.ab = z4;
        this.W = uri4;
        this.am = uri4 == null ? false : z6;
        this.X = vastAd;
        this.Y = vastAd2;
        p();
        o();
        n();
        this.an = q(list23);
        this.ac = q(list24);
        this.ad = survey;
        this.af = q(list25);
        this.ag = q(list26);
        this.ah = q(list27);
        this.ae = z5;
        this.ai = pattern;
        this.aj = bArr2;
    }
}
