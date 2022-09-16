package defpackage;
/* compiled from: PG */
/* renamed from: bgt  reason: default package */
/* loaded from: classes2.dex */
final class bgt implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ bgu b;
    private final /* synthetic */ int c;

    public bgt(bgu bguVar, int i) {
        this.b = bguVar;
        this.a = i;
    }

    public bgt(bgu bguVar, int i, int i2) {
        this.c = i2;
        this.b = bguVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            bhc bhcVar = this.b.b.c.s;
            if (bhcVar == null) {
                return;
            }
            bhcVar.e(this.a);
            return;
        }
        bhc bhcVar2 = this.b.b.c.s;
        if (bhcVar2 == null) {
            return;
        }
        bhcVar2.f(this.a);
    }
}
