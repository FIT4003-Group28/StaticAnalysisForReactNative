package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: aazh  reason: default package */
/* loaded from: classes2.dex */
public final class aazh extends ges implements bvvv {
    private static final String d = "aazh";
    public bvts a;
    @dzsi
    public bwce b;
    public boolean c = false;
    @dzsi
    private bvtr e;

    @Override // defpackage.fd
    public final void Qj(@dzsi Bundle bundle) {
        super.Qj(bundle);
        g().j(bundle);
    }

    @Override // defpackage.bvvv
    public final boolean Rl() {
        return false;
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        super.ag(layoutInflater, viewGroup, bundle);
        return g().c;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ak() {
        g().g();
        super.ak();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void al() {
        super.al();
        g().n();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        g().h();
        super.am();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        return g().f();
    }

    public final bvtr g() {
        if (this.e == null) {
            this.e = this.a.a(this.b);
        }
        return this.e;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        g().e(this, this.o, bundle, false);
        super.l(bundle);
        g().o(g().c);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return g().k();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.c = true;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        g().i(bundle);
    }
}
