package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.MediaAd;
import com.google.android.libraries.youtube.ads.model.RemoteVideoAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: xij  reason: default package */
/* loaded from: classes4.dex */
public final class xij implements Runnable {
    final /* synthetic */ MediaAd a;
    final /* synthetic */ yix b;
    final /* synthetic */ xik c;

    public xij(xik xikVar, MediaAd mediaAd, yix yixVar) {
        this.c = xikVar;
        this.a = mediaAd;
        this.b = yixVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (TextUtils.isEmpty(((RemoteVideoAd) this.a).c)) {
            this.b.b(this.a.l, null);
            return;
        }
        ailf a = this.c.a.a(this.a);
        try {
            xik xikVar = this.c;
            aijl d = PlaybackStartDescriptor.d();
            d.a = aikb.f(((RemoteVideoAd) this.a).c, "", -1, 0.0f);
            xikVar.c = a.b(d.a(), this.a.l, -1, null, false, aijp.a);
            this.b.b(this.a.l, (PlayerResponseModel) this.c.c.get(2L, TimeUnit.SECONDS));
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
            this.c.c.cancel(true);
            this.b.a(this.a.l, new ExecutionException("Failed to get adPlayerResponse for mdx", e));
        }
    }
}
