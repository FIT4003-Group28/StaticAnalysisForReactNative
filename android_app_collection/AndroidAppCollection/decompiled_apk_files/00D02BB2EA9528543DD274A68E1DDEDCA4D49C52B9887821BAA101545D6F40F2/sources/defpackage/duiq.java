package defpackage;
/* compiled from: PG */
/* renamed from: duiq  reason: default package */
/* loaded from: classes6.dex */
public final class duiq extends Exception {
    public final duip a;

    public duiq(duip duipVar, String str) {
        this(duipVar, str, null);
    }

    public final boolean a() {
        return this.a.g;
    }

    public duiq(duip duipVar, String str, Throwable th) {
        super(str, th);
        this.a = duipVar;
    }

    public duiq(duip duipVar, Throwable th) {
        this(duipVar, null, th);
    }
}
