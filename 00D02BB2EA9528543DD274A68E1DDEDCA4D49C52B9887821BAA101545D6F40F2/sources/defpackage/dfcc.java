package defpackage;
/* compiled from: PG */
/* renamed from: dfcc  reason: default package */
/* loaded from: classes6.dex */
final class dfcc {
    public final dyjb a;
    public final int b;

    private dfcc(int i, dyjb dyjbVar) {
        this.b = i;
        this.a = dyjbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dfcc a(int i) {
        dbsk.l(true);
        return new dfcc(i, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dfcc b(int i, dyjb dyjbVar) {
        if (i != 4) {
            i = 5;
        }
        dbsk.l(true);
        dbsk.s(dyjbVar);
        return new dfcc(i, dyjbVar);
    }
}
