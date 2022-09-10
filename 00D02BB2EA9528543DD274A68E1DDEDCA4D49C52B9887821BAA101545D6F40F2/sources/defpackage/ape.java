package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: ape  reason: default package */
/* loaded from: classes2.dex */
public final class ape<D> extends z<D> {
    public final int g;
    public final Bundle h;
    public final apl<D> i;
    public apf<D> j;
    private m k;
    private apl<D> l;

    public ape(int i, Bundle bundle, apl<D> aplVar, apl<D> aplVar2) {
        this.g = i;
        this.h = bundle;
        this.i = aplVar;
        this.l = aplVar2;
        if (aplVar.h == null) {
            aplVar.h = this;
            aplVar.b = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.v
    public final void d(aa<? super D> aaVar) {
        super.d(aaVar);
        this.k = null;
        this.j = null;
    }

    @Override // defpackage.z, defpackage.v
    public final void g(D d) {
        super.g(d);
        apl<D> aplVar = this.l;
        if (aplVar != null) {
            aplVar.m();
            this.l = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.v
    public final void i() {
        if (api.d(2)) {
            String str = "  Starting: " + this;
        }
        this.i.h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.v
    public final void j() {
        if (api.d(2)) {
            String str = "  Stopping: " + this;
        }
        this.i.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final apl<D> m(m mVar, apc<D> apcVar) {
        apf<D> apfVar = new apf<>(this.i, apcVar);
        b(mVar, apfVar);
        apf<D> apfVar2 = this.j;
        if (apfVar2 != null) {
            d(apfVar2);
        }
        this.k = mVar;
        this.j = apfVar;
        return this.i;
    }

    public final void n() {
        m mVar = this.k;
        apf<D> apfVar = this.j;
        if (mVar == null || apfVar == null) {
            return;
        }
        super.d(apfVar);
        b(mVar, apfVar);
    }

    public final apl<D> o(boolean z) {
        if (api.d(3)) {
            String str = "  Destroying: " + this;
        }
        this.i.f();
        apl<D> aplVar = this.i;
        aplVar.e = true;
        aplVar.l();
        apf<D> apfVar = this.j;
        if (apfVar != null) {
            d(apfVar);
            if (z && apfVar.c) {
                if (api.d(2)) {
                    String str2 = "  Resetting: " + apfVar.a;
                }
                apfVar.b.c();
            }
        }
        apl<D> aplVar2 = this.i;
        ape<D> apeVar = aplVar2.h;
        if (apeVar != null) {
            if (apeVar == this) {
                aplVar2.h = null;
                if ((apfVar == null || apfVar.c) && !z) {
                    return aplVar2;
                }
                aplVar2.m();
                return this.l;
            }
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        throw new IllegalStateException("No listener register");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.g);
        sb.append(" : ");
        sb.append(this.i.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this.i)));
        sb.append("}}");
        return sb.toString();
    }
}
