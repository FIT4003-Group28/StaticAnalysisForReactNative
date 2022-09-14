package c.e.a.b.d.g;

import java.util.Iterator;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f7 extends c7<FieldDescriptorType, Object> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public f7(int i) {
        super(i, null);
    }

    @Override // c.e.a.b.d.g.c7
    public final void a() {
        if (!b()) {
            if (c() > 0) {
                ((u4) a(0).getKey()).k();
                throw null;
            }
            Iterator it = d().iterator();
            if (it.hasNext()) {
                ((u4) ((Map.Entry) it.next()).getKey()).k();
                throw null;
            }
        }
        super.a();
    }
}
