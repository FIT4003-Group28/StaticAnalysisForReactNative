package defpackage;
/* compiled from: PG */
/* renamed from: afeq  reason: default package */
/* loaded from: classes.dex */
final class afeq {
    public final afes a;
    public final int b;
    private final int c;
    private final int d;

    public afeq(afes afesVar, int i, int i2, int i3) {
        this.a = afesVar;
        this.c = i;
        this.b = i2;
        this.d = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(afer aferVar) {
        aferVar.c = this.a;
        int i = this.c;
        if (i != 0) {
            aferVar.b = i;
        }
        aferVar.a = this.d;
    }
}
