package c.a.a.y;

import android.util.Log;
import c.a.a.j;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class c implements j {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f2686a = new HashSet();

    @Override // c.a.a.j
    public void a(String str) {
        a(str, null);
    }

    @Override // c.a.a.j
    public void a(String str, Throwable th) {
        if (f2686a.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        f2686a.add(str);
    }

    @Override // c.a.a.j
    public void b(String str) {
        b(str, null);
    }

    public void b(String str, Throwable th) {
        if (c.a.a.c.f2199a) {
            Log.d("LOTTIE", str, th);
        }
    }
}
