package defpackage;
/* compiled from: PG */
/* renamed from: bhu  reason: default package */
/* loaded from: classes3.dex */
final class bhu extends Throwable {
    public bhu() {
        super("Failure occurred while trying to finish a future.");
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
