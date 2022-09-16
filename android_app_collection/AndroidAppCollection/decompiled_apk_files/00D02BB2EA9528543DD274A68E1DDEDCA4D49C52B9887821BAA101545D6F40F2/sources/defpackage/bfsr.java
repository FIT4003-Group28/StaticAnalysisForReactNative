package defpackage;

import android.app.Activity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bfsr  reason: default package */
/* loaded from: classes3.dex */
public final class bfsr implements bfst {
    public final Activity a;
    public final dxio<cqkj> b;
    public final btvo c;
    public final bfsv d;
    public final bfsq e;
    @dzsi
    public dqxc f;
    @dzsi
    public czwe g;

    public bfsr(Activity activity, btvo btvoVar, dxio<cqkj> dxioVar, bfsv bfsvVar, bfsq bfsqVar) {
        this.a = activity;
        this.b = dxioVar;
        this.c = btvoVar;
        this.d = bfsvVar;
        this.e = bfsqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dbsg<dqxc> a() {
        return dbsg.j(this.f);
    }

    public final void b() {
        czwe czweVar = this.g;
        if (czweVar != null) {
            czweVar.dismiss();
        }
    }
}
