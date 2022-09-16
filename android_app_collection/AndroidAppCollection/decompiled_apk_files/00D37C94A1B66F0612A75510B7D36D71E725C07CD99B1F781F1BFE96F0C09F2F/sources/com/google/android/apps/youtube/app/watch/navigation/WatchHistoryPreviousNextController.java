package com.google.android.apps.youtube.app.watch.navigation;

import com.google.android.apps.youtube.app.common.player.PlaybackLoopShuffleMonitor;
import com.google.android.apps.youtube.app.watch.navigation.WatchHistoryPreviousNextController;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class WatchHistoryPreviousNextController extends fdm implements fea, f, ynl {
    public final aafo a;
    public final ntw b;
    public final PlaybackLoopShuffleMonitor c;
    public final azqb d;
    public boolean e;
    private final boolean f;
    private final aias g;
    private final aizu h;
    private final yni i;
    private final airw j;
    private aypg k;
    private WeakReference l;

    public WatchHistoryPreviousNextController(feh fehVar, aafo aafoVar, ntw ntwVar, aias aiasVar, PlaybackLoopShuffleMonitor playbackLoopShuffleMonitor, aacz aaczVar, aizu aizuVar, yni yniVar, airw airwVar, azqb azqbVar) {
        super(fehVar);
        this.a = aafoVar;
        this.b = ntwVar;
        this.g = aiasVar;
        this.c = playbackLoopShuffleMonitor;
        this.h = aizuVar;
        this.i = yniVar;
        this.j = airwVar;
        this.d = azqbVar;
        this.f = eog.aq(aaczVar);
    }

    private final nua i(apjh apjhVar) {
        if (apjhVar.b == 114177671) {
            return new nua(this, (apjk) apjhVar.c);
        }
        return null;
    }

    private final void j() {
        aako aakoVar;
        nua nuaVar;
        WeakReference weakReference = this.l;
        nua nuaVar2 = null;
        if (weakReference == null || weakReference.get() == null) {
            aakoVar = null;
        } else {
            aaks aaksVar = (aaks) this.l.get();
            PlaybackLoopShuffleMonitor playbackLoopShuffleMonitor = this.c;
            int i = playbackLoopShuffleMonitor.a;
            boolean z = true;
            boolean z2 = i == 1;
            if (i != 2) {
                z = false;
            }
            aakoVar = aaksVar.a(z2, z, playbackLoopShuffleMonitor.b, false);
        }
        if (aakoVar != null) {
            apjh apjhVar = aakoVar.a.i;
            if (apjhVar == null) {
                apjhVar = apjh.a;
            }
            nuaVar2 = i(apjhVar);
            apjh apjhVar2 = aakoVar.a.g;
            if (apjhVar2 == null) {
                apjhVar2 = apjh.a;
            }
            nuaVar = i(apjhVar2);
        } else {
            nuaVar = null;
        }
        this.g.d(nuaVar2);
        this.g.c(nuaVar);
        this.h.c(nuaVar2);
        this.h.b(nuaVar);
    }

    @Override // defpackage.fea
    public final void g(int i, boolean z) {
        j();
    }

    public final void h(ahhm ahhmVar) {
        aaks aaksVar;
        if (ahhmVar.c().b(aijx.VIDEO_WATCH_LOADED)) {
            WatchNextResponseModel a = ahhmVar.a();
            WeakReference weakReference = null;
            if (a != null && (aaksVar = a.h) != null) {
                weakReference = new WeakReference(aaksVar);
            }
            this.l = weakReference;
            j();
        }
    }

    @Override // defpackage.feg
    public final void kF() {
        this.e = false;
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                h((ahhm) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahhm.class};
    }

    @Override // defpackage.f, defpackage.g
    public final void lc(apy apyVar) {
        if (this.f) {
            this.k = this.j.ao().I().G(aypa.a()).aa(new ayqb() { // from class: nty
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    WatchHistoryPreviousNextController.this.h((ahhm) obj);
                }
            }, npy.e);
        } else {
            this.i.g(this);
        }
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        if (this.f) {
            azof.f((AtomicReference) this.k);
            this.k = null;
        } else {
            this.i.m(this);
        }
        this.g.d(null);
        this.g.c(null);
        this.h.c(null);
        this.h.b(null);
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.feg
    public final void nr() {
        this.e = true;
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }
}
