package c.a.a.v;
/* loaded from: classes.dex */
public class h {

    /* renamed from: d  reason: collision with root package name */
    private static String f2446d = "\r";

    /* renamed from: a  reason: collision with root package name */
    private final String f2447a;

    /* renamed from: b  reason: collision with root package name */
    public final float f2448b;

    /* renamed from: c  reason: collision with root package name */
    public final float f2449c;

    public h(String str, float f2, float f3) {
        this.f2447a = str;
        this.f2449c = f3;
        this.f2448b = f2;
    }

    public boolean a(String str) {
        if (this.f2447a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f2447a.endsWith(f2446d)) {
            String str2 = this.f2447a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
