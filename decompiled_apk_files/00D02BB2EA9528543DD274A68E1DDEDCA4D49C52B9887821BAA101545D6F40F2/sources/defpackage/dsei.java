package defpackage;
/* compiled from: PG */
/* renamed from: dsei  reason: default package */
/* loaded from: classes6.dex */
public final class dsei {
    public static dbyz a(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 1) {
                return dbyz.OPEN;
            }
            return dbyz.CLOSED;
        }
        throw new AssertionError("boundTypeProtoToJava should not have been called for UNBOUND.");
    }
}
