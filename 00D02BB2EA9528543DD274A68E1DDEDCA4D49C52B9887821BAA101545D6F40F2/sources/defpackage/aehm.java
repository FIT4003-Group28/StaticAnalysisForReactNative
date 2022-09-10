package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: aehm  reason: default package */
/* loaded from: classes2.dex */
public final class aehm extends gen {
    public cqkj a;
    public aehp b;
    @dzsi
    aehl c;
    @dzsi
    private cqkf<aehl> d;

    public static aehm g(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("display_personalization_disclaimer", z);
        aehm aehmVar = new aehm();
        aehmVar.B(bundle);
        return aehmVar;
    }

    @Override // defpackage.ges
    public final void Nv() {
        ((aehn) btsx.b(aehn.class, this)).bP(this);
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<aehl> e = this.a.e(new aehk());
        this.d = e;
        e.e(this.c);
        return this.d.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        cqkf<aehl> cqkfVar = this.d;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            this.d = null;
        }
        this.c = null;
        super.am();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        gdf gdfVar = new gdf((Context) J(), false);
        gdfVar.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        return gdfVar;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        boolean z = this.o.getBoolean("display_personalization_disclaimer");
        if (this.c == null) {
            aehp aehpVar = this.b;
            duul a = aehpVar.a.a();
            aehp.a(a, 1);
            dxio a2 = ((dxjh) aehpVar.b).a();
            aehp.a(a2, 2);
            aehp.a(this, 3);
            this.c = new aeho(a, a2, this, z);
        }
    }

    @Override // defpackage.ges
    @dzsi
    public final ddho p() {
        return dtxr.cb;
    }
}
