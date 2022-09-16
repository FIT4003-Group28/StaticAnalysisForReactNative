package defpackage;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: vvn  reason: default package */
/* loaded from: classes4.dex */
public final class vvn implements vvs, vvr {
    public vvs a;
    private final List b = new CopyOnWriteArrayList();

    @Override // defpackage.vvr
    public final void G(Exception exc) {
        synchronized (this.b) {
        }
        for (vvr vvrVar : this.b) {
            vvrVar.G(exc);
        }
    }

    @Override // defpackage.vvr
    public final void I(vvg vvgVar) {
        for (vvr vvrVar : this.b) {
            vvrVar.I(vvgVar);
        }
    }

    public final vvs a(vvs vvsVar) {
        vvs vvsVar2 = this.a;
        if (vvsVar2 != null) {
            vvsVar2.l(this);
        }
        this.a = vvsVar;
        if (vvsVar != null) {
            vvsVar.k(this);
        }
        return vvsVar2;
    }

    @Override // defpackage.vvs
    public final vvg g(long j, boolean z) {
        vvs vvsVar = this.a;
        if (vvsVar != null) {
            return vvsVar.g(j, z);
        }
        return null;
    }

    @Override // defpackage.vvs
    public final vvg i(long j) {
        vvs vvsVar = this.a;
        if (vvsVar != null) {
            return vvsVar.i(j);
        }
        return null;
    }

    @Override // defpackage.vvs
    public final void j() {
    }

    @Override // defpackage.vvs
    public final void k(vvr vvrVar) {
        boolean m;
        synchronized (this.b) {
            this.b.add(vvrVar);
            m = m();
        }
        if (m) {
            vvrVar.q(this);
        }
    }

    @Override // defpackage.vvs
    public final void l(vvr vvrVar) {
        this.b.remove(vvrVar);
    }

    @Override // defpackage.vvs
    public final boolean m() {
        vvs vvsVar = this.a;
        if (vvsVar != null) {
            return vvsVar.m();
        }
        return false;
    }

    @Override // defpackage.vvr
    public final void q(vvs vvsVar) {
        synchronized (this.b) {
        }
        for (vvr vvrVar : this.b) {
            vvrVar.q(this);
        }
    }
}
