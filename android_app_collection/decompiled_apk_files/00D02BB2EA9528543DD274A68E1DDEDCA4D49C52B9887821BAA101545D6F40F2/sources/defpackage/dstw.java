package defpackage;
/* compiled from: PG */
/* renamed from: dstw  reason: default package */
/* loaded from: classes6.dex */
public final class dstw extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    public dstw() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final dsrm a() {
        return new dsrm(getMessage());
    }
}
