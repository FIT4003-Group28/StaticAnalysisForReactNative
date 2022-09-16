package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aqi  reason: default package */
/* loaded from: classes2.dex */
public final class aqi extends t implements aqo {
    public final int e = 54321;
    public final aqp f;
    public aqj g;
    private apy h;

    public aqi(aqp aqpVar) {
        this.f = aqpVar;
        if (aqpVar.e == null) {
            aqpVar.e = this;
            aqpVar.d = 54321;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @Override // defpackage.s
    protected final void g() {
        if (aqh.b(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("  Starting: ");
            sb.append(this);
        }
        aqp aqpVar = this.f;
        aqpVar.g = true;
        aqpVar.i = false;
        aqpVar.h = false;
        aqn aqnVar = (aqn) aqpVar;
        List list = aqnVar.c;
        if (list != null) {
            aqnVar.b(list);
            return;
        }
        aqpVar.d();
        aqnVar.a = new aqm(aqnVar);
        aqnVar.a();
    }

    @Override // defpackage.s
    protected final void h() {
        if (aqh.b(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("  Stopping: ");
            sb.append(this);
        }
        aqp aqpVar = this.f;
        aqpVar.g = false;
        aqpVar.d();
    }

    @Override // defpackage.s
    public final void j(u uVar) {
        super.j(uVar);
        this.h = null;
        this.g = null;
    }

    public final void n() {
        apy apyVar = this.h;
        aqj aqjVar = this.g;
        if (apyVar == null || aqjVar == null) {
            return;
        }
        super.j(aqjVar);
        e(apyVar, aqjVar);
    }

    public final void o() {
        if (aqh.b(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("  Destroying: ");
            sb.append(this);
        }
        this.f.d();
        this.f.h = true;
        aqj aqjVar = this.g;
        if (aqjVar != null) {
            j(aqjVar);
            if (aqjVar.c) {
                if (aqh.b(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("  Resetting: ");
                    sb2.append(aqjVar.a);
                }
                vgg vggVar = (vgg) aqjVar.b;
                vggVar.a.clear();
                vggVar.a.notifyDataSetChanged();
            }
        }
        aqp aqpVar = this.f;
        aqo aqoVar = aqpVar.e;
        if (aqoVar != null) {
            if (aqoVar == this) {
                aqpVar.e = null;
                aqpVar.i = true;
                aqpVar.g = false;
                aqpVar.h = false;
                aqpVar.j = false;
                return;
            }
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        throw new IllegalStateException("No listener register");
    }

    public final void p(apy apyVar, aqg aqgVar) {
        aqj aqjVar = new aqj(this.f, aqgVar);
        e(apyVar, aqjVar);
        u uVar = this.g;
        if (uVar != null) {
            j(uVar);
        }
        this.h = apyVar;
        this.g = aqjVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.e);
        sb.append(" : ");
        sb.append(this.f.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this.f)));
        sb.append("}}");
        return sb.toString();
    }
}
