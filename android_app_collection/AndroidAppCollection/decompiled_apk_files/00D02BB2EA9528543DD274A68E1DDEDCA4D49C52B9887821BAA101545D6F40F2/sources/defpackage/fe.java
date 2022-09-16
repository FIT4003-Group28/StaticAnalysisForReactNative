package defpackage;

import android.os.Build;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import java.io.PrintWriter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fe  reason: default package */
/* loaded from: classes.dex */
public final class fe extends fr<ff> implements ax, agm, agv, gs {
    final /* synthetic */ ff a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe(ff ffVar) {
        super(ffVar, ffVar, new Handler());
        this.a = ffVar;
    }

    @Override // defpackage.fr, defpackage.fn
    public final boolean MW() {
        Window window = this.a.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.ax
    public final aw NA() {
        return this.a.NA();
    }

    @Override // defpackage.m
    public final k Nh() {
        return this.a.b;
    }

    @Override // defpackage.agm
    public final agl Oj() {
        return this.a.i;
    }

    @Override // defpackage.agv
    public final agu Oq() {
        return this.a.j;
    }

    @Override // defpackage.fr, defpackage.fn
    public final View a(int i) {
        return this.a.findViewById(i);
    }

    @Override // defpackage.fr
    public final LayoutInflater e() {
        return this.a.getLayoutInflater().cloneInContext(this.a);
    }

    @Override // defpackage.fr
    public final void f() {
        this.a.f();
    }

    @Override // defpackage.fr
    public final boolean g(String str) {
        ff ffVar = this.a;
        if (Build.VERSION.SDK_INT >= 23) {
            return ffVar.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    @Override // defpackage.fr
    public final /* bridge */ /* synthetic */ ff i() {
        return this.a;
    }

    @Override // defpackage.gs
    public final void j() {
    }

    @Override // defpackage.fr
    public final void k(PrintWriter printWriter, String[] strArr) {
        this.a.dump("  ", null, printWriter, strArr);
    }

    @Override // defpackage.fr
    public final boolean l() {
        return !this.a.isFinishing();
    }
}
