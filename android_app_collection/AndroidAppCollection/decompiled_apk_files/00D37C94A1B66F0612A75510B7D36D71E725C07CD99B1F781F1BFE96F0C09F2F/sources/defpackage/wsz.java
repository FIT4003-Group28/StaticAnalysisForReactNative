package defpackage;

import com.google.android.libraries.youtube.ads.model.MediaAd;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wsz  reason: default package */
/* loaded from: classes4.dex */
public final class wsz implements ankb {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ PlayerResponseModel c;
    final /* synthetic */ String d;
    final /* synthetic */ MediaAd e;
    final /* synthetic */ wta f;

    public wsz(wta wtaVar, String str, String str2, PlayerResponseModel playerResponseModel, String str3, MediaAd mediaAd) {
        this.f = wtaVar;
        this.a = str;
        this.b = str2;
        this.c = playerResponseModel;
        this.d = str3;
        this.e = mediaAd;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        afus.b(2, 1, "[Control flow] Error resolving WatchNextResponse Future for content video companion opportunity");
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        final WatchNextResponseModel watchNextResponseModel = (WatchNextResponseModel) obj;
        if (watchNextResponseModel == null) {
            return;
        }
        int i = watchNextResponseModel.a.b;
        if ((i & 64) == 0 || (i & 128) == 0 || !((wuk) this.f.c.get()).g().contains(this.a)) {
            return;
        }
        xcb a = xcb.a(this.b, this.c);
        final String str = this.b;
        final PlayerResponseModel playerResponseModel = this.c;
        final String str2 = this.d;
        final String str3 = this.a;
        final MediaAd mediaAd = this.e;
        ((wtm) this.f.b.get()).a(8, a, new wtl() { // from class: wsy
            /* JADX WARN: Removed duplicated region for block: B:20:0x016b  */
            @Override // defpackage.wtl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List a() {
                /*
                    Method dump skipped, instructions count: 367
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.wsy.a():java.util.List");
            }
        });
    }
}
