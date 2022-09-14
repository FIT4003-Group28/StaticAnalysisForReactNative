package c.a.a;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private boolean f2296a = false;

    /* renamed from: b  reason: collision with root package name */
    private final Set<b> f2297b = new a.e.b();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, c.a.a.y.f> f2298c = new HashMap();

    /* loaded from: classes.dex */
    class a implements Comparator<androidx.core.util.d<String, Float>> {
        a(o oVar) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(androidx.core.util.d<String, Float> dVar, androidx.core.util.d<String, Float> dVar2) {
            float floatValue = dVar.f1594b.floatValue();
            float floatValue2 = dVar2.f1594b.floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(float f2);
    }

    public o() {
        new a(this);
    }

    public void a(String str, float f2) {
        if (!this.f2296a) {
            return;
        }
        c.a.a.y.f fVar = this.f2298c.get(str);
        if (fVar == null) {
            fVar = new c.a.a.y.f();
            this.f2298c.put(str, fVar);
        }
        fVar.a(f2);
        if (!str.equals("__container")) {
            return;
        }
        for (b bVar : this.f2297b) {
            bVar.a(f2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        this.f2296a = z;
    }
}
