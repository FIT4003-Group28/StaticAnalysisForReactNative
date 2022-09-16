package defpackage;
/* compiled from: PG */
/* renamed from: ahaj  reason: default package */
/* loaded from: classes.dex */
final class ahaj implements afjk {
    final /* synthetic */ ahak a;
    private final /* synthetic */ int b;

    public ahaj(ahak ahakVar) {
        this.a = ahakVar;
    }

    public ahaj(ahak ahakVar, int i) {
        this.b = i;
        this.a = ahakVar;
    }

    @Override // defpackage.afjk
    public final void a(Exception exc) {
    }

    @Override // defpackage.afjk
    public final void b(int i) {
    }

    @Override // defpackage.afjk
    public final void c(long j) {
        int i = this.b;
        if (i == 0) {
            this.a.f = j;
        } else if (i == 1) {
            this.a.e = j;
        } else if (i != 2) {
            this.a.h = j;
        } else {
            this.a.g = j;
        }
    }
}
