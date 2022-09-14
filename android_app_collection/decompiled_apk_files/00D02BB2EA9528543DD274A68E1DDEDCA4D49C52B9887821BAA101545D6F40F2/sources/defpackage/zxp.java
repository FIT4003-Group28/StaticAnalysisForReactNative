package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: zxp  reason: default package */
/* loaded from: classes7.dex */
public final class zxp extends fd {
    public cqkj a;
    public zys b;
    private zyt c;
    private cqkf<zyt> d;

    @Override // defpackage.fd
    public final void Qi(Context context) {
        dxix.a(this);
        super.Qi(context);
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<zyt> c = this.a.c(new zyr(), null);
        this.d = c;
        c.e(this.c);
        return this.d.c();
    }

    @Override // defpackage.fd
    public final void am() {
        super.am();
        this.d.e(null);
    }

    @Override // defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        zyu zyuVar = new zyu(this.b);
        this.c = zyuVar;
        zyuVar.a(bundle);
    }

    @Override // defpackage.fd
    public final void t(Bundle bundle) {
        zyt zytVar = this.c;
        if (zytVar != null) {
            zytVar.b(bundle);
        }
    }
}
