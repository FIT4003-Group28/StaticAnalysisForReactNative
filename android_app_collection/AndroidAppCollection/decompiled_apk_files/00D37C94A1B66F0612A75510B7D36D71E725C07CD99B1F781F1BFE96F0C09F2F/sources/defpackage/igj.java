package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.watch.player.ReelSequenceNavigator$ReelSequenceNavigatorState;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.sequencer.state.SequenceNavigatorState;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: igj  reason: default package */
/* loaded from: classes3.dex */
public final class igj implements aiql, ifv {
    artv a;
    private final Set b = new HashSet();
    private final aafd c;

    public igj(aafd aafdVar, byte[] bArr) {
        this.c = aafdVar;
        aafdVar.c(this);
    }

    private final synchronized void m() {
        for (aipt aiptVar : this.b) {
            aiptVar.a();
        }
    }

    @Override // defpackage.aiql
    public final PlaybackStartDescriptor a(aiqk aiqkVar) {
        aiqj aiqjVar = aiqj.NEXT;
        int ordinal = aiqkVar.e.ordinal();
        if (ordinal == 0) {
            artv artvVar = this.a;
            if (artvVar == null || (artvVar.b & 8) == 0) {
                return null;
            }
            aijl d = PlaybackStartDescriptor.d();
            apzg apzgVar = this.a.f;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            d.a = apzgVar;
            return d.a();
        } else if (ordinal == 1) {
            artv artvVar2 = this.a;
            if (artvVar2 == null || (artvVar2.b & 16) == 0) {
                return null;
            }
            aijl d2 = PlaybackStartDescriptor.d();
            apzg apzgVar2 = this.a.g;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            d2.a = apzgVar2;
            return d2.a();
        } else if (ordinal == 2) {
            String valueOf = String.valueOf(aiqkVar.e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
            sb.append("Unsupported Autoplay navigation type: ");
            sb.append(valueOf);
            throw new UnsupportedOperationException(sb.toString());
        } else if (ordinal == 4) {
            return aiqkVar.f;
        } else {
            String valueOf2 = String.valueOf(aiqkVar.e);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 29);
            sb2.append("Unsupported navigation type: ");
            sb2.append(valueOf2);
            throw new UnsupportedOperationException(sb2.toString());
        }
    }

    @Override // defpackage.ifv
    public final void aR() {
    }

    @Override // defpackage.ifv
    public final void aT(long j, artv artvVar, boolean z) {
        this.a = artvVar;
        m();
    }

    @Override // defpackage.ifv
    public final void aV(long j, apzg apzgVar, artv artvVar, int i) {
    }

    @Override // defpackage.ifv
    public final void aW(apzg apzgVar) {
    }

    @Override // defpackage.aiql
    public final aijp b(aiqk aiqkVar) {
        return aijp.a;
    }

    @Override // defpackage.ifv
    public final void bm(String str) {
    }

    @Override // defpackage.aiql
    public final aiqk c(PlaybackStartDescriptor playbackStartDescriptor, aijp aijpVar) {
        return new aiqk(aiqj.JUMP, playbackStartDescriptor, aijpVar);
    }

    @Override // defpackage.aiql
    public final SequenceNavigatorState d() {
        return new ReelSequenceNavigator$ReelSequenceNavigatorState(this.a);
    }

    @Override // defpackage.aiql
    public final void e(boolean z) {
    }

    @Override // defpackage.aiql
    public final void f(aiqk aiqkVar, PlaybackStartDescriptor playbackStartDescriptor) {
    }

    @Override // defpackage.aiql
    public final void g() {
        this.c.d(this);
    }

    @Override // defpackage.aiql
    public final void h(WatchNextResponseModel watchNextResponseModel) {
    }

    @Override // defpackage.aiql
    public final boolean i() {
        return false;
    }

    @Override // defpackage.aiql
    public final int j(aiqk aiqkVar) {
        aiqj aiqjVar = aiqj.NEXT;
        int ordinal = aiqkVar.e.ordinal();
        boolean z = false;
        if (ordinal == 0) {
            artv artvVar = this.a;
            if (artvVar != null && (artvVar.b & 8) != 0) {
                z = true;
            }
            return aiqk.a(z);
        } else if (ordinal != 1) {
            return ordinal != 4 ? 1 : 2;
        } else {
            artv artvVar2 = this.a;
            if (artvVar2 != null && (artvVar2.b & 16) != 0) {
                z = true;
            }
            return aiqk.a(z);
        }
    }

    @Override // defpackage.aiql
    public final void k(aipt aiptVar) {
        this.b.add(aiptVar);
    }

    @Override // defpackage.aiql
    public final void l(aipt aiptVar) {
        this.b.remove(aiptVar);
    }
}
