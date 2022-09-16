package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.watch.navigation.WatchHistoryListIterator;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.state.PlaybackServiceState;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: PG */
/* renamed from: ntw  reason: default package */
/* loaded from: classes3.dex */
public final class ntw implements nub, ntx {
    public final Set a = new CopyOnWriteArraySet();
    public WatchHistoryListIterator b = new WatchHistoryListIterator((byte[]) null);
    private final azqb d;
    private PlaybackServiceState e;
    private boolean f;
    private final aacz g;

    public ntw(azqb azqbVar, aacz aaczVar) {
        this.d = azqbVar;
        this.g = aaczVar;
    }

    private final boolean n(PlaybackServiceState playbackServiceState) {
        PlaybackStartDescriptor playbackStartDescriptor;
        PlaybackStartDescriptor a = a();
        if (a == null) {
            return false;
        }
        airr airrVar = (airr) this.d.get();
        if (airrVar.N(a)) {
            nwp.b(a, airrVar);
            return true;
        }
        String k = a.k();
        if (playbackServiceState == null || TextUtils.isEmpty(k) || !TextUtils.equals(k, airrVar.p()) || (playbackStartDescriptor = playbackServiceState.a) == null) {
            return false;
        }
        this.b.set(playbackStartDescriptor);
        if (airrVar.N(playbackStartDescriptor)) {
            nwp.b(playbackStartDescriptor, airrVar);
            return true;
        }
        return false;
    }

    final PlaybackStartDescriptor a() {
        if (this.b.d()) {
            return null;
        }
        return (PlaybackStartDescriptor) this.b.c;
    }

    @Override // defpackage.nub
    public final void b() {
        this.b.a();
    }

    @Override // defpackage.nub
    public final void c() {
        this.b.c();
        this.b.b();
    }

    public final void d() {
        n(null);
    }

    @Override // defpackage.nub
    public final void e(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        WatchHistoryListIterator watchHistoryListIterator = (WatchHistoryListIterator) bundle.getParcelable("watch_history_list_iterator");
        if (watchHistoryListIterator == null) {
            this.e = null;
            return;
        }
        this.b = watchHistoryListIterator;
        this.e = (PlaybackServiceState) bundle.getParcelable("playback_service_state");
    }

    @Override // defpackage.nub
    public final void f(PlaybackStartDescriptor playbackStartDescriptor, boolean z) {
        String k = playbackStartDescriptor.k();
        PlaybackStartDescriptor a = a();
        String k2 = a != null ? a.k() : null;
        if (TextUtils.isEmpty(k) || !TextUtils.equals(k, k2)) {
            if (z) {
                b();
            } else {
                d();
                this.b.b();
            }
            WatchHistoryListIterator watchHistoryListIterator = this.b;
            if (!watchHistoryListIterator.d()) {
                watchHistoryListIterator.a.offerFirst(watchHistoryListIterator.c);
            }
            watchHistoryListIterator.c = playbackStartDescriptor;
        }
    }

    @Override // defpackage.nub
    public final void g(Bundle bundle) {
        bundle.putParcelable("watch_history_list_iterator", this.b);
        bundle.putParcelable("playback_service_state", c ? this.e : null);
    }

    @Override // defpackage.nub
    public final void h(boolean z) {
        PlaybackServiceState l;
        if (a() == null) {
            return;
        }
        airr airrVar = (airr) this.d.get();
        if (z) {
            l = airrVar.k();
        } else {
            l = airrVar.l(true);
        }
        if (true != n(l)) {
            l = null;
        }
        this.e = l;
    }

    @Override // defpackage.nub
    public final void i(boolean z) {
        this.f = z;
    }

    public final boolean j() {
        return this.b.hasPrevious();
    }

    public final boolean k() {
        return this.b.hasNext();
    }

    @Override // defpackage.ntx
    public final void l(jwg jwgVar) {
        this.a.add(jwgVar);
    }

    @Override // defpackage.nub
    public final void m(jwd jwdVar) {
        PlaybackStartDescriptor a = a();
        if (a == null) {
            return;
        }
        if (!this.f) {
            asxj asxjVar = this.g.b().e;
            if (asxjVar == null) {
                asxjVar = asxj.a;
            }
            if (asxjVar.W) {
                return;
            }
        }
        a.p(true);
        jwdVar.a.aK(a, this.e);
        this.e = null;
    }
}
