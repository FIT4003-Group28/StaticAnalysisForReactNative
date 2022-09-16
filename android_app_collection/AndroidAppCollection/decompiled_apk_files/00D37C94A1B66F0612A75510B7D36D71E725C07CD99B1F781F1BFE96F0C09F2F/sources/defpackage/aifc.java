package defpackage;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.sequencer.state.SequenceNavigatorState;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aifc  reason: default package */
/* loaded from: classes.dex */
public final class aifc implements aiql, aiqi, aiqm {
    private static final String b = zep.a("PQSN");
    public final aiep a;
    private final aifg c;
    private final Set d;
    private final aifb e;
    private int f;

    public aifc(aiep aiepVar, aifg aifgVar) {
        aiepVar.getClass();
        this.a = aiepVar;
        this.c = aifgVar;
        this.d = new HashSet();
        aifb aifbVar = new aifb(this);
        this.e = aifbVar;
        aifbVar.e();
        aifgVar.b = new WeakReference(this);
    }

    private final Object r() {
        this.e.f();
        return this.c.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(boolean z) {
        int j = j(aiqk.b);
        int j2 = j(aiqk.a);
        int u = u();
        boolean o = o();
        int i = 0;
        int i2 = (j == 2 ? 1 : 0) | (j2 == 2 ? 2 : 0) | (u == 1 ? 4 : 0) | (u == 2 ? 8 : 0);
        if (true == o) {
            i = 16;
        }
        int i3 = i2 | i;
        if (this.f != i3 || z) {
            this.f = i3;
            for (aipt aiptVar : this.d) {
                aiptVar.a();
            }
        }
    }

    private final void t(Object obj, boolean z) {
        this.e.e();
        this.c.c(obj);
        s(z);
    }

    @Override // defpackage.aiql
    public final PlaybackStartDescriptor a(aiqk aiqkVar) {
        Object r = r();
        PlaybackStartDescriptor d = this.a.d(aiqkVar);
        boolean z = false;
        t(r, false);
        if (d == null) {
            String str = b;
            String name = aiqkVar.e.name();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 41);
            sb.append("getNavigationDescriptor for ");
            sb.append(name);
            sb.append("returned NULL");
            zep.m(str, sb.toString());
            return null;
        }
        if (aiqkVar.e == aiqj.AUTOPLAY || aiqkVar.e == aiqj.AUTONAV) {
            z = true;
        }
        aijl e = d.e();
        e.f = z;
        e.e = z;
        return e.a();
    }

    @Override // defpackage.aiql
    public final aijp b(aiqk aiqkVar) {
        return this.a.t();
    }

    @Override // defpackage.aiql
    public final aiqk c(PlaybackStartDescriptor playbackStartDescriptor, aijp aijpVar) {
        return this.a.a(playbackStartDescriptor, aijpVar);
    }

    @Override // defpackage.aiql
    public final SequenceNavigatorState d() {
        return null;
    }

    @Override // defpackage.aiql
    public final void e(boolean z) {
        s(false);
    }

    @Override // defpackage.aiql
    public final void f(aiqk aiqkVar, PlaybackStartDescriptor playbackStartDescriptor) {
        Object r = r();
        this.a.h(aiqkVar, playbackStartDescriptor);
        t(r, false);
    }

    @Override // defpackage.aiql
    public final void g() {
        this.e.f();
        aifg aifgVar = this.c;
        WeakReference weakReference = aifgVar.b;
        if (weakReference == null || akzj.f(this, weakReference.get())) {
            aifgVar.b = null;
        }
    }

    @Override // defpackage.aiql
    public final void h(WatchNextResponseModel watchNextResponseModel) {
        Object r = r();
        this.a.i(watchNextResponseModel);
        t(r, true);
    }

    @Override // defpackage.aiql
    public final boolean i() {
        return false;
    }

    @Override // defpackage.aiql
    public final int j(aiqk aiqkVar) {
        return this.a.o(aiqkVar);
    }

    @Override // defpackage.aiql
    public final void k(aipt aiptVar) {
        this.d.add(aiptVar);
    }

    @Override // defpackage.aiql
    public final void l(aipt aiptVar) {
        this.d.remove(aiptVar);
    }

    @Override // defpackage.aiqm
    public final void m(boolean z) {
        if (p()) {
            aiep aiepVar = this.a;
            if (!(aiepVar instanceof aiqm)) {
                return;
            }
            ((aiqm) aiepVar).m(z);
            s(false);
        }
    }

    @Override // defpackage.aiqi
    public final boolean n(int i) {
        aiep aiepVar = this.a;
        return (aiepVar instanceof aiqi) && ((aiqi) aiepVar).n(i);
    }

    @Override // defpackage.aiqm
    public final boolean o() {
        if (p()) {
            aiep aiepVar = this.a;
            return (aiepVar instanceof aiqm) && ((aiqm) aiepVar).o();
        }
        return false;
    }

    @Override // defpackage.aiqm
    public final boolean p() {
        aiep aiepVar = this.a;
        return (aiepVar instanceof aiqm) && ((aiqm) aiepVar).p();
    }

    @Override // defpackage.aiqi
    public final int u() {
        aiep aiepVar = this.a;
        if (aiepVar instanceof aiqi) {
            return ((aiqi) aiepVar).u();
        }
        return 0;
    }

    @Override // defpackage.aiqi
    public final void v(int i) {
        if (n(i)) {
            aiep aiepVar = this.a;
            if (!(aiepVar instanceof aiqi)) {
                return;
            }
            ((aiqi) aiepVar).v(i);
            s(false);
        }
    }
}
