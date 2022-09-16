package defpackage;
/* compiled from: PG */
/* renamed from: anht  reason: default package */
/* loaded from: classes.dex */
class anht extends Throwable {
    public anht() {
        super("Failure occurred while trying to finish a future.");
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
