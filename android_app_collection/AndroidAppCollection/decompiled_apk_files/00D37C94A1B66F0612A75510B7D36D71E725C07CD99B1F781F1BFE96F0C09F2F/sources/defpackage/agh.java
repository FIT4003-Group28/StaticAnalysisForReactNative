package defpackage;
/* compiled from: PG */
/* renamed from: agh  reason: default package */
/* loaded from: classes.dex */
class agh extends Throwable {
    public agh() {
        super("Failure occurred while trying to finish a future.");
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
