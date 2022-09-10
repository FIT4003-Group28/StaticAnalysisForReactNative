package defpackage;
/* compiled from: PG */
/* renamed from: cvzl  reason: default package */
/* loaded from: classes5.dex */
final class cvzl<T> extends cwjw<T> {
    private final cwjw<T> a;
    private final cvzn b;

    public cvzl(cwjw<T> cwjwVar, cvzn cvznVar) {
        this.a = cwjwVar;
        this.b = cvznVar;
    }

    @Override // defpackage.cwjw, defpackage.cwjx
    public final void a(T t, dtgb dtgbVar) {
        if (!this.b.a) {
            this.a.a(t, dtgbVar);
        }
    }

    @Override // defpackage.cwjx
    public final void b(dtgb dtgbVar) {
        if (!this.b.a) {
            this.a.b(dtgbVar);
        }
    }
}
