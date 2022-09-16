package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: bqte  reason: default package */
/* loaded from: classes4.dex */
public final class bqte extends gen {
    public bqth a;
    public cqkj b;
    @dzsi
    private bqsx c;

    @Override // defpackage.ges
    public final void Nv() {
        ((bqtf) btsx.b(bqtf.class, this)).de(this);
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf c = this.b.c(new bqod(), null);
        bqsx bqsxVar = this.c;
        dbsk.s(bqsxVar);
        c.e(bqsxVar);
        return c.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        return new gdf((Context) J(), false);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        gga a = this.a.a.a();
        bqth.a(a);
        this.c = new bqtg(a);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxs.af;
    }
}
