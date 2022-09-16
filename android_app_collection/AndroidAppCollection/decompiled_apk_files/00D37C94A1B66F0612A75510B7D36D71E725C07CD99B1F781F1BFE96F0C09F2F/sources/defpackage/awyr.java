package defpackage;
/* compiled from: PG */
/* renamed from: awyr  reason: default package */
/* loaded from: classes2.dex */
public final class awyr extends Exception {
    public final awyq a;

    public awyr(awyq awyqVar, String str) {
        this(awyqVar, str, null);
    }

    public final boolean a() {
        return this.a.g;
    }

    public awyr(awyq awyqVar, String str, Throwable th) {
        super(str, th);
        this.a = awyqVar;
    }

    public awyr(awyq awyqVar, Throwable th) {
        this(awyqVar, null, th);
    }
}
