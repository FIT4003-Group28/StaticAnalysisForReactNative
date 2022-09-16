package com.google.android.libraries.youtube.ads.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlaybackTrackingModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class PlayerAd implements Parcelable, aalj, afto {
    protected static final long d = TimeUnit.DAYS.toMillis(3);
    public static final byte[] e = new byte[0];
    public static final /* synthetic */ int o = 0;
    public final String f;
    public final byte[] g;
    public final String h;
    public final String i;
    public final boolean j;
    public final PlayerConfigModel k;
    public final String l;
    public final long m;
    public final VideoAdTrackingModel n;

    /* JADX INFO: Access modifiers changed from: protected */
    public PlayerAd(String str, byte[] bArr, String str2, String str3, boolean z, PlayerConfigModel playerConfigModel, String str4, long j, VideoAdTrackingModel videoAdTrackingModel) {
        str.getClass();
        this.f = str;
        bArr.getClass();
        this.g = bArr;
        this.h = str2;
        str3.getClass();
        this.i = str3;
        this.j = z;
        playerConfigModel.getClass();
        this.k = playerConfigModel;
        this.l = str4;
        this.m = j;
        videoAdTrackingModel.getClass();
        this.n = videoAdTrackingModel;
    }

    public aswg[] C() {
        return null;
    }

    public aalh D() {
        return null;
    }

    public apzg E() {
        return null;
    }

    public final List F() {
        return this.n.c;
    }

    public final List G() {
        return this.n.d;
    }

    public final List H() {
        return this.n.e;
    }

    public final List I() {
        return this.n.f;
    }

    public final List J() {
        return this.n.g;
    }

    public final List K() {
        return this.n.h;
    }

    public final List L() {
        return this.n.i;
    }

    public final List M() {
        return this.n.j;
    }

    public final List N() {
        return this.n.k;
    }

    public final List O() {
        return this.n.l;
    }

    public final List P() {
        return this.n.m;
    }

    public final List Q() {
        return this.n.n;
    }

    public final List R() {
        return this.n.o;
    }

    public final List S() {
        return this.n.s;
    }

    public final List T() {
        return this.n.p;
    }

    public final List U() {
        return this.n.q;
    }

    public final List V() {
        return this.n.r;
    }

    public final List W() {
        return this.n.t;
    }

    public final List X() {
        return this.n.u;
    }

    public final List Y() {
        return this.n.v;
    }

    public final boolean Z(snc sncVar) {
        return sncVar.c() >= this.m;
    }

    @Override // defpackage.aalj
    public final long a() {
        return this.m;
    }

    public boolean aa() {
        return p() > 0;
    }

    @Override // defpackage.aalj
    @Deprecated
    public final boolean b() {
        return false;
    }

    public abstract int c();

    public Uri d() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public VideoStreamingData e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlayerAd)) {
            return false;
        }
        PlayerAd playerAd = (PlayerAd) obj;
        return akzj.f(this.f, playerAd.f) && Arrays.equals(this.g, playerAd.g) && akzj.f(this.h, playerAd.h) && akzj.f(this.i, playerAd.i) && this.j == playerAd.j && akzj.f(this.k, playerAd.k) && akzj.f(this.l, playerAd.l) && this.m == playerAd.m && akzj.f(this.n, playerAd.n);
    }

    public PlaybackTrackingModel f() {
        return null;
    }

    public PlayerResponseModel g() {
        return null;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException("Ad should not be a key.");
    }

    public apax i() {
        return null;
    }

    public arit j() {
        return null;
    }

    public String l() {
        return "";
    }

    public String m() {
        return null;
    }

    public String n() {
        return null;
    }

    public int o() {
        return 1;
    }

    protected int p() {
        return 0;
    }

    public aoyz qP() {
        return null;
    }

    public Uri r() {
        return null;
    }

    public apaj s() {
        return null;
    }

    public apnr t() {
        return null;
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        String str = this.l;
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 1 + String.valueOf(str).length());
        sb.append(simpleName);
        sb.append("_");
        sb.append(str);
        return sb.toString();
    }

    public apoj u() {
        return null;
    }

    public apzg v() {
        return null;
    }

    public auwo w() {
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f);
        parcel.writeByteArray(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.k, 0);
        parcel.writeString(this.l);
        parcel.writeLong(this.m);
    }

    public String x() {
        return "";
    }

    public List y() {
        return Collections.emptyList();
    }

    public List z() {
        return Collections.emptyList();
    }
}
