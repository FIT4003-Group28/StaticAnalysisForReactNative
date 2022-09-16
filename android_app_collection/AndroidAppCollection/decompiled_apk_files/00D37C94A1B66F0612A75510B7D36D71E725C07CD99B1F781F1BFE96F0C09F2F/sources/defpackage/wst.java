package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.MediaAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Locale;
/* compiled from: PG */
@wsf(a = xbh.class)
/* renamed from: wst  reason: default package */
/* loaded from: classes4.dex */
public final class wst implements wsg, wlk {
    private String a;
    private long b;
    private final /* synthetic */ int c;

    public wst() {
    }

    public wst(int i) {
        this.c = i;
    }

    @Override // defpackage.wsg
    public final String a() {
        return this.c != 0 ? "0" : "0.0";
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void f(aika aikaVar, PlayerResponseModel playerResponseModel, ajbf ajbfVar, String str, String str2) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void h(int i, String str) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qD(afkn afknVar) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qE(String str) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qF(aijs aijsVar, aijs aijsVar2, int i, int i2, boolean z, boolean z2) {
    }

    @Override // defpackage.wlk
    public final void qG(String str, long j, long j2, long j3, boolean z) {
        int i = this.c;
        this.a = str;
        this.b = j;
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qK(String str, int i) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qM(ahgc ahgcVar) {
    }

    @Override // defpackage.wsg
    public final String b(xac xacVar) {
        if (this.c == 0) {
            if (!TextUtils.equals(((MediaAd) xacVar.c(xbh.class)).l, this.a) || this.b <= 0) {
                return "0.0";
            }
            Locale locale = Locale.US;
            double d = this.b;
            Double.isNaN(d);
            return String.format(locale, "%.1f", Double.valueOf(d / 1000.0d));
        }
        if (TextUtils.equals(((MediaAd) xacVar.c(xbh.class)).l, this.a)) {
            long j = this.b;
            if (j > 0) {
                return Long.toString(j);
            }
        }
        return "0";
    }
}
