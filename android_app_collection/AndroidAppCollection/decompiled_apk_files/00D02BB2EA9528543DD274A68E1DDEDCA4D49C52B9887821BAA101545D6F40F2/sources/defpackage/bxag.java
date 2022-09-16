package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
/* compiled from: PG */
/* renamed from: bxag  reason: default package */
/* loaded from: classes4.dex */
public final class bxag extends gen {
    public cqkj a;
    public bxct b;
    private bxcb c;
    private cqkf<bxcb> d;

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        this.d.e(null);
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<bxcb> e = this.a.e(new bwxb());
        this.d = e;
        e.e(this.c);
        return this.d.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        Dialog i = super.i(bundle);
        Window window = i.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(17170445);
        }
        return i;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        bxct bxctVar = this.b;
        ff ffVar = (ff) ((dxjd) bxctVar.a).a;
        bxct.a(ffVar, 1);
        cqhn a = bxctVar.b.a();
        bxct.a(a, 2);
        bxcr a2 = bxctVar.c.a();
        bxct.a(a2, 3);
        begg a3 = bxctVar.d.a();
        bxct.a(a3, 4);
        huc a4 = bxctVar.e.a();
        bxct.a(a4, 5);
        bxcu a5 = bxctVar.f.a();
        bxct.a(a5, 6);
        bxcs bxcsVar = new bxcs(ffVar, a, a2, a3, a4, a5);
        this.c = bxcsVar;
        bxcsVar.a();
    }

    @Override // defpackage.ges
    @dzsi
    public final ddho p() {
        return dtyb.em;
    }
}
