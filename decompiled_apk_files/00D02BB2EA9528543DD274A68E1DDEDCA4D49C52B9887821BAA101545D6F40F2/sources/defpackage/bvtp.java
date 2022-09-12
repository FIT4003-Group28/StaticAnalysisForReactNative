package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: bvtp  reason: default package */
/* loaded from: classes4.dex */
public final class bvtp extends gen implements gfw, bvvt, bvvv {
    public static final String a = "bvtp";
    public bvts b;
    @dzsi
    public bwce c;
    @dzsi
    private bvtr d;

    @Override // defpackage.fd
    public final void Qj(@dzsi Bundle bundle) {
        super.Qj(bundle);
        g().j(bundle);
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        g().l(obj);
    }

    @Override // defpackage.bvvv
    public final boolean Rl() {
        return false;
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        return g().c;
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
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
        if (this.d == null) {
            this.d = this.b.a(this.c);
        }
        return this.d;
    }

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        bvtn bvtnVar = new bvtn(this, J());
        bvtnVar.setOnShowListener(new bvto(this));
        return bvtnVar;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        g().d(this, this.o, bundle);
        super.l(bundle);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return g().k();
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        g().i(bundle);
    }
}
