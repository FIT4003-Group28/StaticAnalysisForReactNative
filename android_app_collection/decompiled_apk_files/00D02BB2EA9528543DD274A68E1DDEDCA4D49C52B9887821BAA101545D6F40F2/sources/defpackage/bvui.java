package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: bvui  reason: default package */
/* loaded from: classes4.dex */
public final class bvui extends ges implements bvvv {
    private static final String e = "bvui";
    public bvts a;
    @dzsi
    public bwce b;
    public boolean c;
    public boolean d;
    @dzsi
    private bvtr f;

    private final bvtr q() {
        if (this.f == null) {
            this.f = this.a.a(this.b);
        }
        return this.f;
    }

    @Override // defpackage.fd
    public final void Qj(@dzsi Bundle bundle) {
        super.Qj(bundle);
        q().j(bundle);
    }

    @Override // defpackage.bvvv
    public final boolean Rl() {
        return false;
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        super.ag(layoutInflater, viewGroup, bundle);
        return q().c;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ak() {
        q().g();
        super.ak();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void al() {
        super.al();
        q().n();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        q().h();
        super.am();
        this.c = true;
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        return q().f();
    }

    @dzsi
    public final bvxh g() {
        bvtr bvtrVar = this.f;
        return bvtrVar == null ? this.b : bvtrVar.a;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        q().e(this, this.o, bundle, false);
        super.l(bundle);
        q().o(q().c);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return q().k();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.d = true;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        q().i(bundle);
    }
}
