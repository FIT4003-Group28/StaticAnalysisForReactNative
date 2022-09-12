package defpackage;
/* compiled from: PG */
/* renamed from: btd  reason: default package */
/* loaded from: classes4.dex */
abstract class btd implements Runnable, Comparable<btd> {
    private final int a;

    public btd(bro broVar) {
        this.a = broVar.ordinal();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(btd btdVar) {
        int i = btdVar.a;
        int i2 = this.a;
        if (i > i2) {
            return -1;
        }
        return i < i2 ? 1 : 0;
    }
}
