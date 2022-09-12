package defpackage;
/* compiled from: PG */
/* renamed from: acof  reason: default package */
/* loaded from: classes2.dex */
final class acof implements bbb {
    final /* synthetic */ acoi a;
    private int b;
    private boolean c;

    public acof(acoi acoiVar) {
        this.a = acoiVar;
    }

    @Override // defpackage.bbb
    public final void a(int i, float f, int i2) {
        this.a.X(i, f, true, this.c);
    }

    @Override // defpackage.bbb
    public final void b(int i) {
        if (this.b == 0) {
            this.a.X(i, 0.0f, true, this.c);
        }
    }

    @Override // defpackage.bbb
    public final void c(int i) {
        boolean z = true;
        if (i != 1) {
            if (this.b == 0 && i == 2) {
                z = false;
            }
            this.b = i;
        }
        this.c = z;
        this.b = i;
    }
}
