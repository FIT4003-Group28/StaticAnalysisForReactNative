package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.ui.PlayerView;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
/* compiled from: PG */
/* renamed from: hfv  reason: default package */
/* loaded from: classes3.dex */
public final class hfv implements hfx, hez {
    private final airr a;
    private final aire b;
    private final Context c;
    private final aijc d = new aijc(new hfu(), aijd.a, aijd.a, aijd.a);
    private final hfn e;
    private long f;
    private PlayerView g;

    public hfv(Context context, airw airwVar, hfn hfnVar) {
        this.a = airwVar.E();
        this.b = airwVar.D();
        this.c = context;
        this.e = hfnVar;
    }

    @Override // defpackage.hfx
    public final void a(long j) {
        this.f = j;
        this.a.V(j);
        if (!this.a.d()) {
            this.a.b();
        }
    }

    @Override // defpackage.hfx
    public final void b() {
        this.a.a();
        this.e.i(this.f);
        PlayerView playerView = this.g;
        if (playerView != null) {
            playerView.setVisibility(8);
        }
    }

    @Override // defpackage.hfx
    public final void c() {
        PlaybackStartDescriptor playbackStartDescriptor;
        PlayerView playerView = this.g;
        if (playerView != null) {
            this.a.x(playerView.c, this.d);
            this.g.setVisibility(0);
        } else {
            this.a.x(new PlayerView(this.c).c, this.d);
        }
        ShortsCreationSelectedTrack a = this.e.a();
        if (a != null) {
            aopa createBuilder = awel.a.createBuilder();
            String k = a.k();
            createBuilder.copyOnWrite();
            awel awelVar = (awel) createBuilder.instance;
            awelVar.b |= 1;
            awelVar.c = k;
            String i = a.i();
            if (i != null) {
                createBuilder.copyOnWrite();
                awel awelVar2 = (awel) createBuilder.instance;
                awelVar2.b |= 512;
                awelVar2.k = i;
            }
            aopc aopcVar = (aopc) apzg.a.createBuilder();
            aopcVar.e(WatchEndpointOuterClass.watchEndpoint, (awel) createBuilder.mo39build());
            aijl d = PlaybackStartDescriptor.d();
            d.a = (apzg) aopcVar.mo39build();
            d.d();
            d.k = a.a();
            playbackStartDescriptor = d.a();
        } else {
            playbackStartDescriptor = null;
        }
        if (playbackStartDescriptor != null) {
            this.b.d(playbackStartDescriptor);
        }
    }

    @Override // defpackage.hfx
    public final void d(long j) {
        ajbf n = this.a.n();
        if (n != null) {
            long b = n.b();
            long j2 = this.f;
            if (b < j + j2) {
                return;
            }
            this.a.V(j2);
        }
    }

    @Override // defpackage.hfx
    public final void e() {
        this.a.a();
    }

    @Override // defpackage.hfx
    public final void f(PlayerView playerView) {
        this.g = playerView;
    }

    @Override // defpackage.hfx
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // defpackage.hez
    public final long j() {
        ajbf n = this.a.n();
        return n != null ? n.b() : this.f;
    }
}
