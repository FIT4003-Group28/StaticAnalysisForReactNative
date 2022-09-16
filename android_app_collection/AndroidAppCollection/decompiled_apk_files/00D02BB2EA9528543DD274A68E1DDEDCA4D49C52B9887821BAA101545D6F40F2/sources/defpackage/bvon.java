package defpackage;
/* compiled from: PG */
/* renamed from: bvon  reason: default package */
/* loaded from: classes.dex */
public final class bvon extends RuntimeException {
    private final String a;
    private final Object[] b;

    public bvon(String str, Object... objArr) {
        this.a = str;
        this.b = objArr;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return bvoo.b(this.a, this.b);
    }
}
