package c.e.b.p;

import com.google.firebase.components.d;
import com.google.firebase.components.n;
import java.util.Iterator;
import java.util.Set;
/* loaded from: classes.dex */
public class c implements h {

    /* renamed from: a  reason: collision with root package name */
    private final String f4884a;

    /* renamed from: b  reason: collision with root package name */
    private final d f4885b;

    c(Set<f> set, d dVar) {
        this.f4884a = a(set);
        this.f4885b = dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ h a(com.google.firebase.components.e eVar) {
        return new c(eVar.b(f.class), d.b());
    }

    private static String a(Set<f> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb.append(next.a());
            sb.append('/');
            sb.append(next.b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public static com.google.firebase.components.d<h> b() {
        d.b a2 = com.google.firebase.components.d.a(h.class);
        a2.a(n.d(f.class));
        a2.a(b.a());
        return a2.b();
    }

    @Override // c.e.b.p.h
    public String a() {
        if (this.f4885b.a().isEmpty()) {
            return this.f4884a;
        }
        return this.f4884a + ' ' + a(this.f4885b.a());
    }
}
