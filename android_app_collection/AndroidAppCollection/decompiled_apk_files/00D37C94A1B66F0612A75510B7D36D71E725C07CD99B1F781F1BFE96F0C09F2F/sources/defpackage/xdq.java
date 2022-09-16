package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.ads.model.RemoteVideoAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: xdq  reason: default package */
/* loaded from: classes4.dex */
public final class xdq {
    public boolean a;
    public int b;
    public long c;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public byte[] h = PlayerAd.e;
    public aalh i = aalh.UNKNOWN;
    public Uri j;
    public PlayerResponseModel k;
    public apzg l;
    public asib m;

    public final RemoteVideoAd a() {
        return new RemoteVideoAd(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
    }
}
