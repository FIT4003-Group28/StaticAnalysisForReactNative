package defpackage;
/* compiled from: PG */
/* renamed from: albb  reason: default package */
/* loaded from: classes2.dex */
final class albb {
    final aktd a;
    final int b;
    final int c;

    public albb(aktd aktdVar, int i, int i2) {
        this.a = aktdVar;
        this.b = Math.max(i, 0);
        this.c = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(int i) {
        return this.b <= i && i < this.c;
    }
}
