package defpackage;
/* compiled from: PG */
/* renamed from: anlv  reason: default package */
/* loaded from: classes.dex */
public final class anlv extends RuntimeException {
    public anlv(String str) {
        super(str);
    }

    public anlv(Throwable th) {
        super("Failed to read input", th);
    }
}
