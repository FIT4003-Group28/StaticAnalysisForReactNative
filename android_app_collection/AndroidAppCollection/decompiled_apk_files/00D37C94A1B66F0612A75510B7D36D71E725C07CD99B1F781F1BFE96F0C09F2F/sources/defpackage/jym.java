package defpackage;

import com.google.android.apps.youtube.app.player.controls.ReportVideoController;
/* compiled from: PG */
/* renamed from: jym  reason: default package */
/* loaded from: classes3.dex */
public final class jym implements afwa {
    final /* synthetic */ asgn a;
    final /* synthetic */ ReportVideoController b;

    public jym(ReportVideoController reportVideoController, asgn asgnVar) {
        this.b = reportVideoController;
        this.a = asgnVar;
    }

    @Override // defpackage.afwa
    public final void a() {
    }

    @Override // defpackage.afwa
    public final void b() {
        this.b.h(this.a);
    }

    @Override // defpackage.afwa
    public final void c(Exception exc) {
        this.b.c.e(exc);
    }
}
