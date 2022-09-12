package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aqz  reason: default package */
/* loaded from: classes2.dex */
public final class aqz {
    public boolean a = false;
    private List<aqn> b;

    public final ara a() {
        return new ara(this.b, this.a);
    }

    public final void b(aqn aqnVar) {
        if (aqnVar != null) {
            List<aqn> list = this.b;
            if (list == null) {
                this.b = new ArrayList();
            } else if (list.contains(aqnVar)) {
                throw new IllegalArgumentException("route descriptor already added");
            }
            this.b.add(aqnVar);
            return;
        }
        throw new IllegalArgumentException("route must not be null");
    }
}
