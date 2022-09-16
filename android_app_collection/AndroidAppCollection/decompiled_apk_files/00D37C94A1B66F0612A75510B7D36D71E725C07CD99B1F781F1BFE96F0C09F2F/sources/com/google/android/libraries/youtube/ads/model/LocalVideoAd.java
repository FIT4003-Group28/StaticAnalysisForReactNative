package com.google.android.libraries.youtube.ads.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlaybackTrackingModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.protos.youtube.api.innertube.BrandInteractionRendererOuterClass;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.SkipAdRendererOuterClass;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class LocalVideoAd extends VideoAd {
    public static final Parcelable.Creator CREATOR = new xcg(2);
    public static final xdk a = new xcs();
    public final avwu b;
    public final PlayerResponseModel c;

    @Deprecated
    public LocalVideoAd(InstreamAdBreak instreamAdBreak, PlayerConfigModel playerConfigModel, String str, avwu avwuVar, aanz aanzVar, aaqp aaqpVar, long j) {
        this(instreamAdBreak.f, instreamAdBreak.i, instreamAdBreak.h, instreamAdBreak.g, instreamAdBreak.e, str, q(ab(avwuVar, aanzVar, aaqpVar, playerConfigModel), avwuVar, j, instreamAdBreak.e), avwuVar, ab(avwuVar, aanzVar, aaqpVar, playerConfigModel));
    }

    private static PlayerResponseModel ab(avwu avwuVar, aanz aanzVar, aaqp aaqpVar, PlayerConfigModel playerConfigModel) {
        apaa apaaVar = avwuVar.f;
        if (apaaVar == null) {
            apaaVar = apaa.a;
        }
        if (apaaVar.b.size() != 0) {
            apaa apaaVar2 = avwuVar.f;
            if (apaaVar2 == null) {
                apaaVar2 = apaa.a;
            }
            PlayerResponseModel b = xda.b(aanzVar, apaaVar2, playerConfigModel);
            if (b != null) {
                return b;
            }
        }
        asaj asajVar = (asaj) aaqpVar.a(avwuVar.e.I(), asaj.a);
        if (asajVar == null) {
            afus.b(1, 1, "AdBreakRenderer path ad playerResponse cannot be deserialized.");
            asajVar = asaj.a;
        }
        return new PlayerResponseModel(asajVar, 0L, aanzVar);
    }

    public static long q(PlayerResponseModel playerResponseModel, avwu avwuVar, long j, boolean z) {
        long j2;
        if (!z) {
            VideoStreamingData videoStreamingData = playerResponseModel.c;
            if (videoStreamingData != null) {
                long j3 = videoStreamingData.e;
                if (j3 != Long.MAX_VALUE) {
                    return j3 + j;
                }
            }
            return Long.MAX_VALUE;
        }
        apad apadVar = avwuVar.j;
        if (apadVar == null) {
            apadVar = apad.a;
        }
        apac apacVar = apadVar.c;
        if (apacVar == null) {
            apacVar = apac.a;
        }
        if ((apacVar.b & 1) != 0) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            apad apadVar2 = avwuVar.j;
            if (apadVar2 == null) {
                apadVar2 = apad.a;
            }
            apac apacVar2 = apadVar2.c;
            if (apacVar2 == null) {
                apacVar2 = apac.a;
            }
            atpz atpzVar = apacVar2.c;
            if (atpzVar == null) {
                atpzVar = atpz.a;
            }
            j2 = timeUnit.toMillis(atpzVar.c);
        } else {
            j2 = d;
        }
        return j + j2;
    }

    public final boolean A() {
        avwu avwuVar = this.b;
        if (avwuVar.c == 23) {
            return ((Boolean) avwuVar.d).booleanValue();
        }
        return false;
    }

    public final boolean B() {
        avwu avwuVar = this.b;
        if (avwuVar.c == 20) {
            return ((Boolean) avwuVar.d).booleanValue();
        }
        return false;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final aswg[] C() {
        avwu avwuVar = this.b;
        if ((avwuVar.b & 256) != 0) {
            apad apadVar = avwuVar.j;
            if (apadVar == null) {
                apadVar = apad.a;
            }
            return (aswg[]) apadVar.b.toArray(new aswg[0]);
        }
        return null;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final int c() {
        return this.c.a();
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final Uri d() {
        List list;
        if (e() == null || (list = e().n) == null) {
            return null;
        }
        if (list.isEmpty()) {
            afus.b(1, 1, "Received non-null videoStreamingData object with empty list of format streams");
            return null;
        }
        return ((FormatStreamModel) list.get(0)).d;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final VideoStreamingData e() {
        return this.c.c;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final boolean equals(Object obj) {
        if (!(obj instanceof LocalVideoAd)) {
            return false;
        }
        LocalVideoAd localVideoAd = (LocalVideoAd) obj;
        return super.equals(localVideoAd) && akzj.f(this.b, localVideoAd.b) && akzj.f(this.c, localVideoAd.c);
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final PlaybackTrackingModel f() {
        return this.c.f();
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final PlayerResponseModel g() {
        return this.c;
    }

    @Override // defpackage.afto
    public final /* bridge */ /* synthetic */ aftn h() {
        return new xcs(this);
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final apax i() {
        return this.c.q();
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final arit j() {
        arja arjaVar = this.c.a.r;
        if (arjaVar == null) {
            arjaVar = arja.a;
        }
        if (arjaVar.b == 61737181) {
            arja arjaVar2 = this.c.a.r;
            if (arjaVar2 == null) {
                arjaVar2 = arja.a;
            }
            if (arjaVar2.b == 61737181) {
                return (arit) arjaVar2.c;
            }
            return arit.a;
        }
        return null;
    }

    @Override // com.google.android.libraries.youtube.ads.model.MediaAd
    public final asib k() {
        avws avwsVar = this.b.l;
        if (avwsVar == null) {
            avwsVar = avws.a;
        }
        if (avwsVar.b == 106875026) {
            return (asib) avwsVar.c;
        }
        return null;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final String m() {
        return this.j ? "" : this.c.x();
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final String n() {
        return this.c.B();
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final int o() {
        apad apadVar = this.b.j;
        if (apadVar == null) {
            apadVar = apad.a;
        }
        apac apacVar = apadVar.c;
        if (apacVar == null) {
            apacVar = apac.a;
        }
        if ((apacVar.b & 1) != 0) {
            apad apadVar2 = this.b.j;
            if (apadVar2 == null) {
                apadVar2 = apad.a;
            }
            apac apacVar2 = apadVar2.c;
            if (apacVar2 == null) {
                apacVar2 = apac.a;
            }
            atpz atpzVar = apacVar2.c;
            if (atpzVar == null) {
                atpzVar = atpz.a;
            }
            return atpzVar.b;
        }
        return 1;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    protected final int p() {
        return this.b.g;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final aoyz qP() {
        avwu avwuVar = this.b;
        if ((avwuVar.b & 32768) != 0) {
            aoyz aoyzVar = avwuVar.p;
            return aoyzVar == null ? aoyz.a : aoyzVar;
        }
        return null;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final Uri r() {
        apzg apzgVar = this.b.i;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        avvk avvkVar = (avvk) apzgVar.qm(UrlEndpointOuterClass.urlEndpoint);
        if (avvkVar.c.isEmpty()) {
            return null;
        }
        return Uri.parse(avvkVar.c);
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final apaj s() {
        apaj apajVar = this.b.o;
        return apajVar == null ? apaj.a : apajVar;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final apnr t() {
        asib k = k();
        if (k != null) {
            aunb aunbVar = k.d;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (!aunbVar.qn(BrandInteractionRendererOuterClass.brandInteractionRenderer)) {
                return null;
            }
            aunb aunbVar2 = k.d;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            return (apnr) aunbVar2.qm(BrandInteractionRendererOuterClass.brandInteractionRenderer);
        }
        return null;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final apoj u() {
        asib k = k();
        if (k != null) {
            aunb aunbVar = k.h;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (!aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
                return null;
            }
            aunb aunbVar2 = k.h;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            return (apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer);
        }
        return null;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final apzg v() {
        avwu avwuVar = this.b;
        if ((avwuVar.b & 64) != 0) {
            apzg apzgVar = avwuVar.i;
            return apzgVar == null ? apzg.a : apzgVar;
        }
        return null;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final auwo w() {
        asib k = k();
        if (k == null || (k.b & 1) == 0) {
            return null;
        }
        aunb aunbVar = k.c;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        return (auwo) ajjh.l(aunbVar, SkipAdRendererOuterClass.skipAdRenderer);
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        zgd.K(this.b, parcel);
        parcel.writeParcelable(this.c, 0);
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final String x() {
        return this.b.m;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final List y() {
        return this.b.n;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final List z() {
        return this.b.k;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LocalVideoAd(java.lang.String r14, byte[] r15, java.lang.String r16, java.lang.String r17, boolean r18, java.lang.String r19, long r20, defpackage.avwu r22, com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r23) {
        /*
            r13 = this;
            r11 = r13
            r12 = r22
            com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r6 = r23.c()
            com.google.android.libraries.youtube.ads.model.VideoAdTrackingModel r10 = new com.google.android.libraries.youtube.ads.model.VideoAdTrackingModel
            int r0 = r12.b
            r0 = r0 & 8
            if (r0 == 0) goto L16
            apai r0 = r12.h
            if (r0 != 0) goto L18
            apai r0 = defpackage.apai.a
            goto L18
        L16:
            apai r0 = defpackage.apai.a
        L18:
            r10.<init>(r0)
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r7 = r19
            r8 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10)
            r22.getClass()
            r11.b = r12
            r23.getClass()
            r0 = r23
            r11.c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.ads.model.LocalVideoAd.<init>(java.lang.String, byte[], java.lang.String, java.lang.String, boolean, java.lang.String, long, avwu, com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel):void");
    }
}
