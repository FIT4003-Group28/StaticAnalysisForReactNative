package defpackage;

import java.lang.Number;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: cpri  reason: default package */
/* loaded from: classes5.dex */
public final class cpri<D extends Number> implements cpru<D> {
    private final boolean a;

    public cpri() {
        this(true);
    }

    public cpri(boolean z) {
        this.a = true;
    }

    @Override // defpackage.cpru
    public final List<String> a(List<D> list) {
        boolean z;
        Iterator<D> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            }
            double doubleValue = it.next().doubleValue();
            if (Math.floor(doubleValue) != doubleValue) {
                z = false;
                break;
            }
        }
        ArrayList b = cpwi.b(list.size());
        for (D d : list) {
            b.add(cprw.a(d, z));
        }
        if (list.size() > 1 && list.get(0).doubleValue() == dcyn.a) {
            b.set(0, "");
        }
        return b;
    }
}
