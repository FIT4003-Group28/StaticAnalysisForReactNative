package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: asdf  reason: default package */
/* loaded from: classes2.dex */
public final class asdf extends gen {
    public cqkj a;
    public btrm b;
    public gfq c;
    public bvrb d;
    public atbs e;
    private final asde g = new asde(this);

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        return this.a.c(new asgz(), null).c();
    }

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        return new gdf((Context) J(), true);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxy.cY;
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        btrm btrmVar = this.b;
        asde asdeVar = this.g;
        dceq a = dcet.a();
        a.b(crih.class, new asdg(crih.class, asdeVar, bvrj.UI_THREAD));
        btrmVar.g(asdeVar, a.a());
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void u() {
        this.b.a(this.g);
        super.u();
    }
}
