package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: afdg  reason: default package */
/* loaded from: classes2.dex */
public final class afdg extends ges {
    public cqkj a;
    public efg b;
    public dxio<akfa> c;
    private cqkf<cqkp> d;
    private cqkf<afbh> e;
    private boolean f;

    public static afdg g(boolean z) {
        afdg afdgVar = new afdg();
        afdgVar.f = z;
        return afdgVar;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        if (this.f) {
            this.d.e(null);
        } else {
            this.e.e(null);
        }
        super.Qe();
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f) {
            cqkf<cqkp> c = this.a.c(new afbd(), null);
            this.d = c;
            return c.c();
        }
        cqkf<afbh> c2 = this.a.c(new afbg(), null);
        this.e = c2;
        return c2.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        if (this.f) {
            this.d.e(cqkp.T);
        } else {
            this.e.e(new afbi(this.c));
        }
        efg efgVar = this.b;
        egj egjVar = new egj(this);
        egjVar.w(this.P);
        egjVar.af(true);
        egjVar.ag(null);
        efgVar.a(egjVar.a());
    }
}
