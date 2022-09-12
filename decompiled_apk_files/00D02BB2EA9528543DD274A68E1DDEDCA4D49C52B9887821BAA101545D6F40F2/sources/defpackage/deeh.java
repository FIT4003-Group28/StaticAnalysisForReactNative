package defpackage;
/* compiled from: PG */
/* renamed from: deeh  reason: default package */
/* loaded from: classes6.dex */
class deeh extends Throwable {
    public deeh() {
        super("Failure occurred while trying to finish a future.");
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
