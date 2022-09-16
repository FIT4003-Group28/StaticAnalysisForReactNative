package defpackage;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.sequencer.navigation.VideoIdsSequenceNavigator$VideoIdsSequenceNavigatorState;
import com.google.android.libraries.youtube.player.sequencer.state.SequenceNavigatorState;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aiqn  reason: default package */
/* loaded from: classes.dex */
public final class aiqn implements aiql, aiqi {
    private final PlaybackStartDescriptor a;
    private final String[] b;
    private final Set c;
    private int d;
    private int e;

    public aiqn(PlaybackStartDescriptor playbackStartDescriptor) {
        this.a = playbackStartDescriptor;
        this.b = x(playbackStartDescriptor);
        this.e = playbackStartDescriptor.b();
        this.c = new HashSet();
    }

    private final PlaybackStartDescriptor m(int i, boolean z) {
        int max = Math.max(0, Math.min(i, this.b.length - 1));
        if (max != i) {
            StringBuilder sb = new StringBuilder(80);
            sb.append("Out of bounds access of video IDs list. Index ");
            sb.append(i);
            sb.append(" bounded to ");
            sb.append(max);
            afus.b(1, 10, sb.toString());
        }
        aijl d = PlaybackStartDescriptor.d();
        d.a = aikb.f(this.b[max], "", -1, 0.0f);
        d.f = z;
        d.e = z;
        return d.a();
    }

    private final synchronized PlaybackStartDescriptor o(boolean z) {
        if (!s()) {
            afus.b(1, 10, "Attempting to advance to non-existent video.");
            return null;
        }
        r((u() != 1 || !w()) ? this.e + 1 : 0);
        return m(this.e, z);
    }

    private final synchronized PlaybackStartDescriptor p() {
        int max;
        if (!t()) {
            afus.b(1, 10, "Attempting to go to prior video of the first video.");
            return null;
        }
        if (u() != 1 || this.e > 0) {
            max = Math.max(0, this.e - 1);
        } else {
            max = this.b.length - 1;
        }
        r(max);
        return m(this.e, false);
    }

    private final synchronized void q() {
        for (aipt aiptVar : this.c) {
            aiptVar.a();
        }
    }

    private final synchronized void r(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        q();
    }

    private final synchronized boolean s() {
        if (u() != 1) {
            if (w()) {
                return false;
            }
        }
        return true;
    }

    private final synchronized boolean t() {
        if (u() != 1) {
            if (this.e <= 0) {
                return false;
            }
        }
        return true;
    }

    private final boolean w() {
        return this.e >= this.b.length + (-1);
    }

    private static String[] x(PlaybackStartDescriptor playbackStartDescriptor) {
        List m = playbackStartDescriptor.m();
        return m == null ? new String[0] : (String[]) m.toArray(new String[0]);
    }

    @Override // defpackage.aiql
    public final PlaybackStartDescriptor a(aiqk aiqkVar) {
        aiqj aiqjVar = aiqj.NEXT;
        int ordinal = aiqkVar.e.ordinal();
        boolean z = true;
        if (ordinal != 0) {
            if (ordinal == 1) {
                return p();
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    afus.b(1, 10, "Autonav unsupported by VideoIdsSequenceNavigator.");
                    return null;
                } else if (ordinal == 4) {
                    return aiqkVar.f;
                } else {
                    String valueOf = String.valueOf(aiqkVar.e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
                    sb.append("Unsupported navigation type: ");
                    sb.append(valueOf);
                    throw new UnsupportedOperationException(sb.toString());
                }
            }
        }
        if (aiqkVar.e != aiqj.AUTOPLAY) {
            z = false;
        }
        return o(z);
    }

    @Override // defpackage.aiql
    public final aijp b(aiqk aiqkVar) {
        return aijp.a;
    }

    @Override // defpackage.aiql
    public final aiqk c(PlaybackStartDescriptor playbackStartDescriptor, aijp aijpVar) {
        return new aiqk(aiqj.JUMP, playbackStartDescriptor, aijpVar);
    }

    @Override // defpackage.aiql
    public final SequenceNavigatorState d() {
        return new VideoIdsSequenceNavigator$VideoIdsSequenceNavigatorState(this.a, this.e);
    }

    @Override // defpackage.aiql
    public final void e(boolean z) {
    }

    @Override // defpackage.aiql
    public final void f(aiqk aiqkVar, PlaybackStartDescriptor playbackStartDescriptor) {
    }

    @Override // defpackage.aiql
    public final void g() {
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
        if (ordinal != 0) {
            if (ordinal == 1) {
                return aiqk.a(t());
            }
            if (ordinal != 2) {
                return ordinal != 3 ? ordinal != 4 ? 1 : 2 : aiqk.a(false);
            }
        }
        return aiqk.a(s());
    }

    @Override // defpackage.aiql
    public final synchronized void k(aipt aiptVar) {
        this.c.add(aiptVar);
    }

    @Override // defpackage.aiql
    public final synchronized void l(aipt aiptVar) {
        this.c.remove(aiptVar);
    }

    @Override // defpackage.aiqi
    public final /* synthetic */ boolean n(int i) {
        return i == 1;
    }

    @Override // defpackage.aiqi
    public final synchronized int u() {
        return this.d;
    }

    @Override // defpackage.aiqi
    public final synchronized void v(int i) {
        boolean t = t();
        boolean s = s();
        this.d = i;
        if (t == t() && s == s()) {
            return;
        }
        q();
    }

    public aiqn(VideoIdsSequenceNavigator$VideoIdsSequenceNavigatorState videoIdsSequenceNavigator$VideoIdsSequenceNavigatorState) {
        PlaybackStartDescriptor playbackStartDescriptor = videoIdsSequenceNavigator$VideoIdsSequenceNavigatorState.a;
        this.a = playbackStartDescriptor;
        this.b = x(playbackStartDescriptor);
        this.e = videoIdsSequenceNavigator$VideoIdsSequenceNavigatorState.b;
        this.c = new HashSet();
    }
}
