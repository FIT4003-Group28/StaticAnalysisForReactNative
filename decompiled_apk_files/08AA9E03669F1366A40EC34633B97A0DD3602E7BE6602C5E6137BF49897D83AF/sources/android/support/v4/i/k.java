package android.support.v4.i;
/* compiled from: Preconditions.java */
/* loaded from: classes.dex */
public class k {
    public static <T> T a(T t) {
        if (t == null) {
            throw new NullPointerException();
        }
        return t;
    }
}
