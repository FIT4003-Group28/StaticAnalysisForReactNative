package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: cmwg  reason: default package */
/* loaded from: classes5.dex */
final class cmwg extends fr<cmwh> implements ax, agm {
    final /* synthetic */ cmwh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmwg(cmwh cmwhVar, Context context) {
        super(null, context, new cojb());
        this.a = cmwhVar;
    }

    @Override // defpackage.fr, defpackage.fn
    public final boolean MW() {
        Window Nr = this.a.Nr();
        return (Nr == null || Nr.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.ax
    public final aw NA() {
        return this.a.NA();
    }

    @Override // defpackage.m
    public final k Nh() {
        return this.a.y;
    }

    @Override // defpackage.agm
    public final agl Oj() {
        return this.a.x;
    }

    @Override // defpackage.fr, defpackage.fn
    public final View a(int i) {
        return this.a.C(i);
    }

    @Override // defpackage.fr
    public final LayoutInflater e() {
        return this.a.Ok().cloneInContext(this.a.Ol());
    }

    @Override // defpackage.fr
    public final void f() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.fr
    public final /* bridge */ /* synthetic */ cmwh i() {
        return this.a;
    }

    @Override // defpackage.fr
    public final void k(PrintWriter printWriter, String[] strArr) {
        this.a.z("  ", null, printWriter, strArr);
    }

    @Override // defpackage.fr
    public final boolean l() {
        return !this.a.F();
    }
}
