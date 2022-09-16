package defpackage;

import com.google.android.libraries.youtube.ads.model.MediaAd;
/* compiled from: PG */
/* renamed from: wwc  reason: default package */
/* loaded from: classes4.dex */
public final class wwc {
    public final aadd a;
    public final wvw b;

    public wwc(aadd aaddVar, wvw wvwVar) {
        this.a = aaddVar;
        this.b = wvwVar;
    }

    public static long a(MediaAd mediaAd, int i) {
        aqxo.p(true);
        return ((mediaAd.c() * 1000) * i) / 4;
    }
}
