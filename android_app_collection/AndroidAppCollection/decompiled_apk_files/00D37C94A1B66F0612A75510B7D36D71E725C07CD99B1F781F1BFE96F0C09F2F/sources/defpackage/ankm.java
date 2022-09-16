package defpackage;
/* compiled from: PG */
/* renamed from: ankm  reason: default package */
/* loaded from: classes.dex */
final class ankm {
    static final String a;
    static final ankk b;

    static {
        ankk a2;
        String concat = String.valueOf(ankm.class.getName()).concat("$ClassValueValidator");
        a = concat;
        try {
            a2 = (ankk) ((Enum[]) Class.forName(concat).asSubclass(Enum.class).getEnumConstants())[0];
        } catch (Throwable unused) {
            a2 = ankn.a();
        }
        b = a2;
    }

    ankm() {
    }
}
