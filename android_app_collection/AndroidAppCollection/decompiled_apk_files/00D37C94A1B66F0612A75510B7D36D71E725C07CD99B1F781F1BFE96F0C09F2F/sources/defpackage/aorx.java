package defpackage;
/* compiled from: PG */
/* renamed from: aorx  reason: default package */
/* loaded from: classes.dex */
public final class aorx extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    public aorx() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final aopx a() {
        return new aopx(getMessage());
    }
}
