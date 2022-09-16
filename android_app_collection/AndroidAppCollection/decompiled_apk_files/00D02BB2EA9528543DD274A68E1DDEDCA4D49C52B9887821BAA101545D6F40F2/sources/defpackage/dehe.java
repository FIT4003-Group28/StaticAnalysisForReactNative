package defpackage;
/* compiled from: PG */
/* renamed from: dehe  reason: default package */
/* loaded from: classes6.dex */
final class dehe {
    static final String a;
    static final dehc b;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        dehc b2;
        String concat = String.valueOf(dehe.class.getName()).concat("$ClassValueValidator");
        a = concat;
        try {
            b2 = (dehc) Class.forName(concat).getEnumConstants()[0];
        } catch (Throwable unused) {
            b2 = dehf.b();
        }
        b = b2;
    }

    dehe() {
    }
}
