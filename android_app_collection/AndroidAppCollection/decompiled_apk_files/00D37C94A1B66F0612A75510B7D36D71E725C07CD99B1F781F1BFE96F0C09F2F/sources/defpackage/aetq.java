package defpackage;
/* compiled from: PG */
/* renamed from: aetq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aetq implements Runnable {
    public final /* synthetic */ aett a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ aetq(aett aettVar, int i) {
        this.a = aettVar;
        this.b = i;
    }

    public /* synthetic */ aetq(aett aettVar, int i, int i2) {
        this.c = i2;
        this.a = aettVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            aett aettVar = this.a;
            aettVar.a.c(this.b);
        } else if (i == 1) {
            aett aettVar2 = this.a;
            aettVar2.a.b(this.b);
        } else {
            aett aettVar3 = this.a;
            aettVar3.a.x(this.b);
        }
    }
}
