package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.sequencer.navigation.AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState;
import com.google.android.libraries.youtube.player.sequencer.state.SequenceNavigatorState;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aiqh  reason: default package */
/* loaded from: classes.dex */
public final class aiqh implements aiql, aiqi, aiqm {
    private final ampt a;
    private final boolean b;
    private final Set c;
    private final String d;
    private int e;
    private boolean f;
    private boolean g;
    private aako h;
    private WatchNextResponseModel i;

    public aiqh(AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState autoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState, ampt amptVar) {
        this.e = 0;
        autoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState.getClass();
        amptVar.getClass();
        this.a = amptVar;
        this.d = autoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState.a;
        this.i = autoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState.b;
        this.f = autoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState.c;
        this.e = autoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState.d;
        this.b = false;
        this.c = new HashSet();
        t();
    }

    private final apzg q() {
        aako aakoVar = this.h;
        if (aakoVar == null || !x(aakoVar.a())) {
            return null;
        }
        return aakoVar.a();
    }

    private final apzg r() {
        aako aakoVar = this.h;
        if (aakoVar == null || !x(aakoVar.b())) {
            return null;
        }
        return aakoVar.b();
    }

    private final apzg s() {
        aako aakoVar = this.h;
        if (aakoVar == null || !x(aakoVar.c())) {
            return null;
        }
        return aakoVar.c();
    }

    private final synchronized void t() {
        WatchNextResponseModel watchNextResponseModel = this.i;
        aako aakoVar = null;
        if (watchNextResponseModel != null && watchNextResponseModel.h != null) {
            boolean z = false;
            this.e = n(this.e) ? this.e : 0;
            boolean z2 = this.f && p();
            this.f = z2;
            aaks aaksVar = watchNextResponseModel.h;
            int i = this.e;
            boolean z3 = i == 1;
            if (i == 2) {
                z = true;
            }
            aakoVar = aaksVar.a(z3, z, z2, this.g);
        }
        if (this.h == aakoVar) {
            return;
        }
        this.h = aakoVar;
        for (aipt aiptVar : this.c) {
            aiptVar.a();
        }
    }

    private final boolean w(PlaybackStartDescriptor playbackStartDescriptor) {
        return playbackStartDescriptor != null && !TextUtils.isEmpty(this.d) && TextUtils.equals(playbackStartDescriptor.k(), this.d);
    }

    private final boolean x(apzg apzgVar) {
        return apzgVar != null && this.a.a(apzgVar);
    }

    @Override // defpackage.aiql
    public final PlaybackStartDescriptor a(aiqk aiqkVar) {
        apzg d;
        aiqj aiqjVar = aiqj.NEXT;
        int ordinal = aiqkVar.e.ordinal();
        if (ordinal == 0) {
            aijl d2 = PlaybackStartDescriptor.d();
            d2.a = s();
            return d2.a();
        } else if (ordinal == 1) {
            aako aakoVar = this.h;
            aijl d3 = PlaybackStartDescriptor.d();
            if (aakoVar != null && (d = aakoVar.d()) != null) {
                d3.a = d;
            }
            return d3.a();
        } else if (ordinal == 2) {
            aijl d4 = PlaybackStartDescriptor.d();
            d4.a = r();
            d4.f = true;
            d4.e = true;
            return d4.a();
        } else if (ordinal == 3) {
            aijl d5 = PlaybackStartDescriptor.d();
            d5.a = q();
            d5.f = true;
            d5.e = true;
            return d5.a();
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

    @Override // defpackage.aiql
    public final aijp b(aiqk aiqkVar) {
        aijp aijpVar = aiqkVar.g;
        return aijpVar == null ? aijp.a : aijpVar;
    }

    @Override // defpackage.aiql
    public final aiqk c(PlaybackStartDescriptor playbackStartDescriptor, aijp aijpVar) {
        if (w(playbackStartDescriptor)) {
            return new aiqk(aiqj.JUMP, playbackStartDescriptor, aijpVar);
        }
        return null;
    }

    @Override // defpackage.aiql
    public final synchronized SequenceNavigatorState d() {
        return new AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState(this.d, this.i, this.f, this.e);
    }

    @Override // defpackage.aiql
    public final synchronized void e(boolean z) {
        this.g = z;
        t();
    }

    @Override // defpackage.aiql
    public final void f(aiqk aiqkVar, PlaybackStartDescriptor playbackStartDescriptor) {
    }

    @Override // defpackage.aiql
    public final void g() {
    }

    @Override // defpackage.aiql
    public final void h(WatchNextResponseModel watchNextResponseModel) {
        this.i = watchNextResponseModel;
        t();
    }

    @Override // defpackage.aiql
    public final boolean i() {
        return true;
    }

    @Override // defpackage.aiql
    public final int j(aiqk aiqkVar) {
        aiqj aiqjVar = aiqj.NEXT;
        int ordinal = aiqkVar.e.ordinal();
        boolean z = false;
        if (ordinal == 0) {
            if (s() != null) {
                z = true;
            }
            return aiqk.a(z);
        } else if (ordinal == 1) {
            aako aakoVar = this.h;
            apzg apzgVar = null;
            if (aakoVar != null && x(aakoVar.d())) {
                apzgVar = aakoVar.d();
            }
            if (apzgVar != null) {
                z = true;
            }
            return aiqk.a(z);
        } else if (ordinal == 2) {
            if (r() != null && this.b) {
                return 2;
            }
            return this.i != null ? 1 : 3;
        } else if (ordinal != 3) {
            return (ordinal == 4 && w(aiqkVar.f)) ? 2 : 1;
        } else {
            if (q() != null) {
                z = true;
            }
            return aiqk.a(z);
        }
    }

    @Override // defpackage.aiql
    public final synchronized void k(aipt aiptVar) {
        this.c.add(aiptVar);
    }

    @Override // defpackage.aiql
    public final synchronized void l(aipt aiptVar) {
        this.c.remove(aiptVar);
    }

    @Override // defpackage.aiqm
    public final synchronized void m(boolean z) {
        this.f = z;
        t();
    }

    @Override // defpackage.aiqi
    public final boolean n(int i) {
        aaks aaksVar;
        WatchNextResponseModel watchNextResponseModel;
        aaks aaksVar2;
        if (i != 1) {
            return i == 2 && (watchNextResponseModel = this.i) != null && (aaksVar2 = watchNextResponseModel.h) != null && aaksVar2.b();
        }
        WatchNextResponseModel watchNextResponseModel2 = this.i;
        return (watchNextResponseModel2 == null || (aaksVar = watchNextResponseModel2.h) == null || !aaksVar.c()) ? false : true;
    }

    @Override // defpackage.aiqm
    public final synchronized boolean o() {
        return this.f;
    }

    @Override // defpackage.aiqm
    public final boolean p() {
        aaks aaksVar;
        WatchNextResponseModel watchNextResponseModel = this.i;
        return (watchNextResponseModel == null || (aaksVar = watchNextResponseModel.h) == null || !aaksVar.d()) ? false : true;
    }

    @Override // defpackage.aiqi
    public final synchronized int u() {
        return this.e;
    }

    @Override // defpackage.aiqi
    public final synchronized void v(int i) {
        this.e = i;
        t();
    }

    public aiqh(String str, boolean z, ampt amptVar) {
        this.e = 0;
        amptVar.getClass();
        this.a = amptVar;
        this.d = str;
        this.b = z;
        this.c = new HashSet();
    }
}
