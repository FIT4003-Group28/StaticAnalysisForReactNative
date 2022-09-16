package defpackage;

import com.google.android.apps.youtube.app.watch.navigation.WatchHistoryPreviousNextController;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
/* compiled from: PG */
/* renamed from: nua  reason: default package */
/* loaded from: classes3.dex */
public final class nua implements aizx, aizw {
    public final apjk a;
    final /* synthetic */ WatchHistoryPreviousNextController b;

    public nua(WatchHistoryPreviousNextController watchHistoryPreviousNextController, apjk apjkVar) {
        this.b = watchHistoryPreviousNextController;
        this.a = apjkVar;
    }

    private final void e(aiqk aiqkVar, Runnable runnable) {
        if (!this.a.d || !this.b.b.j()) {
            if (this.a.e && this.b.b.k()) {
                ntw ntwVar = this.b.b;
                ntwVar.d();
                PlaybackStartDescriptor playbackStartDescriptor = (PlaybackStartDescriptor) ntwVar.b.mo416next();
                for (jwg jwgVar : ntwVar.a) {
                    jwgVar.a.aH(playbackStartDescriptor, jwgVar.a.aE.c(5));
                }
                return;
            }
            WatchHistoryPreviousNextController watchHistoryPreviousNextController = this.b;
            if (!watchHistoryPreviousNextController.e) {
                if (!((aire) watchHistoryPreviousNextController.d.get()).i(aiqkVar)) {
                    return;
                }
                if (runnable != null) {
                    runnable.run();
                }
                ((aire) this.b.d.get()).a(aiqkVar);
                return;
            }
            apjk apjkVar = this.a;
            if ((apjkVar.b & 1) == 0) {
                return;
            }
            aafo aafoVar = watchHistoryPreviousNextController.a;
            apzg apzgVar = apjkVar.c;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, null);
            return;
        }
        ntw ntwVar2 = this.b.b;
        ntwVar2.d();
        PlaybackStartDescriptor playbackStartDescriptor2 = (PlaybackStartDescriptor) ntwVar2.b.previous();
        for (jwg jwgVar2 : ntwVar2.a) {
            jwgVar2.a.an.k();
            jwgVar2.a.aH(playbackStartDescriptor2, jwgVar2.a.aE.c(6));
        }
    }

    @Override // defpackage.aizw
    public final void a() {
        e(aiqk.a, new Runnable() { // from class: ntz
            @Override // java.lang.Runnable
            public final void run() {
                nua nuaVar = nua.this;
                if ((nuaVar.a.b & 1) != 0) {
                    ntw ntwVar = nuaVar.b.b;
                    aijl d = PlaybackStartDescriptor.d();
                    apzg apzgVar = nuaVar.a.c;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    d.a = apzgVar;
                    ntwVar.f(d.a(), false);
                }
            }
        });
    }

    @Override // defpackage.aizx
    public final void b() {
        e(aiqk.b, null);
    }

    @Override // defpackage.aizw
    public final boolean c() {
        return f(aiqk.a);
    }

    @Override // defpackage.aizx
    public final boolean d() {
        return f(aiqk.b);
    }

    private final boolean f(aiqk aiqkVar) {
        WatchHistoryPreviousNextController watchHistoryPreviousNextController = this.b;
        if (watchHistoryPreviousNextController.e) {
            if ((this.a.b & 1) != 0) {
                return true;
            }
        } else if (((aire) watchHistoryPreviousNextController.d.get()).i(aiqkVar)) {
            return true;
        }
        apjk apjkVar = this.a;
        if (apjkVar.d) {
            return this.b.b.j();
        }
        if (!apjkVar.e) {
            return false;
        }
        return this.b.b.k();
    }
}
