package c.d.h.a.a.i;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final List<b> f2931a;

    public a(b... bVarArr) {
        this.f2931a = new ArrayList(bVarArr.length);
        Collections.addAll(this.f2931a, bVarArr);
    }

    public synchronized void a(b bVar) {
        this.f2931a.add(bVar);
    }

    @Override // c.d.h.a.a.i.b
    public synchronized void a(String str, int i, boolean z, String str2) {
        int size = this.f2931a.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f2931a.get(i2);
            if (bVar != null) {
                try {
                    bVar.a(str, i, z, str2);
                } catch (Exception e2) {
                    c.d.d.e.a.b("ForwardingImageOriginListener", "InternalListener exception in onImageLoaded", e2);
                }
            }
        }
    }

    public synchronized void b(b bVar) {
        this.f2931a.remove(bVar);
    }
}
