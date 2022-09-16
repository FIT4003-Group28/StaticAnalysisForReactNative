package defpackage;
/* compiled from: PG */
/* renamed from: chh  reason: default package */
/* loaded from: classes2.dex */
abstract class chh implements Runnable, Comparable {
    private final int a;

    public chh(cfv cfvVar) {
        this.a = cfvVar.ordinal();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i = ((chh) obj).a;
        int i2 = this.a;
        if (i > i2) {
            return -1;
        }
        return i < i2 ? 1 : 0;
    }
}
