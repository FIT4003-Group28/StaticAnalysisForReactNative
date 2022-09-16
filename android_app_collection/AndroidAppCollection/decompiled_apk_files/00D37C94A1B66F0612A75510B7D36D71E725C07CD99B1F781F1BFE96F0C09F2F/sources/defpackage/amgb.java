package defpackage;
/* compiled from: PG */
/* renamed from: amgb  reason: default package */
/* loaded from: classes.dex */
public final class amgb implements bqm {
    final /* synthetic */ amfd a;

    public amgb(amfd amfdVar) {
        this.a = amfdVar;
    }

    @Override // defpackage.bqm
    public final void a(Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }

    @Override // defpackage.bqm
    public final void b(long j, Runnable runnable) {
        this.a.postDelayed(runnable, j);
    }
}
