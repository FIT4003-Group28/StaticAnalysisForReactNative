package defpackage;
/* compiled from: PG */
/* renamed from: bwrf  reason: default package */
/* loaded from: classes.dex */
public final class bwrf<T> {
    public final T a;
    public final boolean b;
    public final int c;

    public bwrf(T t, boolean z, int i) {
        this.a = t;
        this.b = z;
        this.c = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> bwrf<T> b(int i) {
        return new bwrf<>(null, false, i);
    }

    public final void a(ckco ckcoVar) {
        ckcoVar.a(this.c - 1);
    }
}
