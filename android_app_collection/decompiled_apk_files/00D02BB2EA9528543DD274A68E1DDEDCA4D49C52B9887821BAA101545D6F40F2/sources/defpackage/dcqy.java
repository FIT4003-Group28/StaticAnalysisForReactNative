package defpackage;
/* compiled from: PG */
/* renamed from: dcqy  reason: default package */
/* loaded from: classes.dex */
public class dcqy<T> {
    public final String a;
    public final long b;
    private final Class<? extends T> c;

    /* JADX INFO: Access modifiers changed from: protected */
    public dcqy(String str, Class<? extends T> cls) {
        if (!str.isEmpty()) {
            if (!dcuj.c(str.charAt(0))) {
                throw new IllegalArgumentException(str.length() != 0 ? "identifier must start with an ASCII letter: ".concat(str) : new String("identifier must start with an ASCII letter: "));
            }
            for (int i = 1; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!dcuj.c(charAt) && ((charAt < '0' || charAt > '9') && charAt != '_')) {
                    throw new IllegalArgumentException(str.length() != 0 ? "identifier must contain only ASCII letters, digits or underscore: ".concat(str) : new String("identifier must contain only ASCII letters, digits or underscore: "));
                }
            }
            this.a = str;
            this.c = cls;
            int identityHashCode = System.identityHashCode(this);
            long j = 0;
            for (int i2 = 0; i2 < 5; i2++) {
                j |= 1 << (identityHashCode & 63);
                identityHashCode >>>= 6;
            }
            this.b = j;
            return;
        }
        throw new IllegalArgumentException("identifier must not be empty");
    }

    public static <T> dcqy<T> b(String str, Class<? extends T> cls) {
        return new dcqy<>(str, cls);
    }

    public void a(T t, dcqx dcqxVar) {
        dcqxVar.a(this.a, t);
    }

    public final T c(Object obj) {
        return this.c.cast(obj);
    }

    public final String toString() {
        String name = getClass().getName();
        String str = this.a;
        String name2 = this.c.getName();
        int length = String.valueOf(name).length();
        StringBuilder sb = new StringBuilder(length + 3 + str.length() + String.valueOf(name2).length());
        sb.append(name);
        sb.append("/");
        sb.append(str);
        sb.append("[");
        sb.append(name2);
        sb.append("]");
        return sb.toString();
    }
}
