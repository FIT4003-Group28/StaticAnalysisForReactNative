package defpackage;
/* compiled from: PG */
/* renamed from: aiq  reason: default package */
/* loaded from: classes2.dex */
class aiq extends Throwable {
    public aiq() {
        super("Failure occurred while trying to finish a future.");
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
