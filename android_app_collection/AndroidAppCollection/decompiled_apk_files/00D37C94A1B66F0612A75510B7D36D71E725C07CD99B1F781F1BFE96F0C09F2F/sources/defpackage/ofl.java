package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: ofl  reason: default package */
/* loaded from: classes3.dex */
public final class ofl extends fdm implements ezg {
    private final Activity a;
    private final ezh b;
    private boolean c;

    public ofl(Activity activity, feh fehVar, ezh ezhVar) {
        super(fehVar);
        this.a = activity;
        this.b = ezhVar;
    }

    @Override // defpackage.feg
    public final void kF() {
        this.b.j(this);
    }

    @Override // defpackage.feg
    public final void nr() {
        this.b.i(this);
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pa(ezx ezxVar) {
    }

    @Override // defpackage.ezg
    public final void pb(ezx ezxVar, ezx ezxVar2) {
        boolean b = ezxVar2.b();
        boolean z = true;
        boolean z2 = this.c && ezxVar == ezx.WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED && ezxVar2 == ezx.WATCH_WHILE_MINIMIZED;
        if (b || z2) {
            zag.h(this.a);
        }
        if (ezxVar != ezx.WATCH_WHILE_MAXIMIZED || ezxVar2 != ezx.WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED) {
            z = false;
        }
        this.c = z;
    }
}
