package defpackage;
/* compiled from: PG */
/* renamed from: bwd  reason: default package */
/* loaded from: classes2.dex */
final class bwd extends Throwable {
    public bwd() {
        super("Failure occurred while trying to finish a future.");
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
