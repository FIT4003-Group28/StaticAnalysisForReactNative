package c.e.b.p;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class d {

    /* renamed from: b  reason: collision with root package name */
    private static volatile d f4886b;

    /* renamed from: a  reason: collision with root package name */
    private final Set<f> f4887a = new HashSet();

    d() {
    }

    public static d b() {
        d dVar = f4886b;
        if (dVar == null) {
            synchronized (d.class) {
                dVar = f4886b;
                if (dVar == null) {
                    dVar = new d();
                    f4886b = dVar;
                }
            }
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<f> a() {
        Set<f> unmodifiableSet;
        synchronized (this.f4887a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f4887a);
        }
        return unmodifiableSet;
    }
}
