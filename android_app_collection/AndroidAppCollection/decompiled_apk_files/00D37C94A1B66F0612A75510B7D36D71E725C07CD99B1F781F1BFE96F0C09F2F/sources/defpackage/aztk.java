package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: aztk  reason: default package */
/* loaded from: classes2.dex */
public final class aztk {
    public static final boolean a(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static final int b(char c) {
        return Character.digit((int) c, 10);
    }

    public static List c(aztg aztgVar) {
        ArrayList arrayList = new ArrayList();
        Iterator a = aztgVar.a();
        while (a.hasNext()) {
            arrayList.add(a.next());
        }
        int size = arrayList.size();
        return size != 0 ? size != 1 ? arrayList : azqn.a(arrayList.get(0)) : azqp.a;
    }

    public final synchronized void d() {
    }
}
