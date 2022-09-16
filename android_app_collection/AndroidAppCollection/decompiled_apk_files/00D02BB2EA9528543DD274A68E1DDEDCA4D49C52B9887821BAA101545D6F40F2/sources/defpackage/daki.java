package defpackage;
/* compiled from: PG */
/* renamed from: daki  reason: default package */
/* loaded from: classes5.dex */
public final class daki extends RuntimeException {
    public daki(String str) {
        super(str);
    }

    public daki(Throwable th) {
        super("Failed to initialize FileStorage", th);
    }
}
