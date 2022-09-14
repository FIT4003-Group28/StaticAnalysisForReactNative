package defpackage;
/* compiled from: PG */
/* renamed from: apsi  reason: default package */
/* loaded from: classes2.dex */
public abstract class apsi<T> {
    public static <T> apsi<T> c(int i, T t) {
        apsd apsdVar = new apsd();
        if (t != null) {
            apsdVar.a = t;
            apsdVar.b = i;
            String str = "";
            if (apsdVar.a == null) {
                str = str.concat(" value");
            }
            if (str.isEmpty()) {
                return new apse(apsdVar.b, apsdVar.a);
            }
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        throw new NullPointerException("Null value");
    }

    public abstract T a();

    public abstract int b();
}
