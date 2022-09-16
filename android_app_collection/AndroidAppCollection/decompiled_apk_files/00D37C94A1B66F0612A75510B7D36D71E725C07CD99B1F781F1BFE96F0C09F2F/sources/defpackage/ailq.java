package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ailq  reason: default package */
/* loaded from: classes.dex */
public final class ailq implements aimk {
    final /* synthetic */ aimk a;
    final /* synthetic */ acvg b;
    final /* synthetic */ ailu c;

    public ailq(ailu ailuVar, aimk aimkVar, acvg acvgVar) {
        this.c = ailuVar;
        this.a = aimkVar;
        this.b = acvgVar;
    }

    @Override // defpackage.aimk
    public final void a(int i) {
        if (this.c.p == null) {
            boolean z = this.c.q != null;
            boolean z2 = this.c.r;
            StringBuilder sb = new StringBuilder(171);
            sb.append("About to send VIDEO_WATCH_LOADED but do not have a currentPlayerResponse. WatchNext set: ");
            sb.append(z);
            sb.append(", initialShouldJoinWatchNextResponseOfSequence: ");
            sb.append(z2);
            sb.append(", requestPlayback: ");
            sb.append(ailu.m(i));
            zep.b(sb.toString());
        } else {
            this.c.l(aijx.VIDEO_WATCH_LOADED);
        }
        this.a.a(i);
    }

    @Override // defpackage.aimk
    public final void b(aikd aikdVar) {
        this.a.b(aikdVar);
    }

    @Override // defpackage.aimk
    public final void c() {
        this.a.c();
    }

    @Override // defpackage.aimk
    public final void d(PlayerResponseModel playerResponseModel) {
        this.a.d(playerResponseModel);
        ailu ailuVar = this.c;
        ailuVar.g(playerResponseModel, ailuVar.o, this.b);
    }

    @Override // defpackage.aimk
    public final void e() {
        this.a.e();
    }

    @Override // defpackage.aimk
    public final void f(aikd aikdVar) {
        this.a.f(aikdVar);
    }

    @Override // defpackage.aimk
    public final void g(WatchNextResponseModel watchNextResponseModel) {
        this.a.g(watchNextResponseModel);
        ailu ailuVar = this.c;
        ailuVar.q = watchNextResponseModel;
        PlaybackStartDescriptor playbackStartDescriptor = ailuVar.o;
        if (playbackStartDescriptor == null) {
            return;
        }
        if (TextUtils.isEmpty(playbackStartDescriptor.l())) {
            aijl e = playbackStartDescriptor.e();
            e.n = watchNextResponseModel.b;
            ailuVar.o = e.a();
        }
        aijl d = PlaybackStartDescriptor.d();
        d.a = watchNextResponseModel.c;
        ailuVar.n = d.a();
        ails ailsVar = ailuVar.f;
        if (ailsVar == null) {
            return;
        }
        ailsVar.a(watchNextResponseModel);
    }
}
