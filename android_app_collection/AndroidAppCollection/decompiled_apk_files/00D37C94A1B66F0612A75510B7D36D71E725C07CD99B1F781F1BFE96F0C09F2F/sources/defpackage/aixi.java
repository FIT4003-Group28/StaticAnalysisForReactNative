package defpackage;

import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import org.xml.sax.Attributes;
/* compiled from: PG */
/* renamed from: aixi  reason: default package */
/* loaded from: classes.dex */
final class aixi extends zna {
    final /* synthetic */ HashMap a;

    public aixi(HashMap hashMap) {
        this.a = hashMap;
    }

    @Override // defpackage.zna
    public final void n(Deque deque, Attributes attributes, String str) {
        Integer num = (Integer) this.a.get(attributes.getValue("mimeType"));
        if (num != null) {
            boolean z = true;
            if (num.intValue() != 1 && num.intValue() != 2) {
                return;
            }
            aixl a = aixn.a(deque, true);
            aiwz b = aixn.b(deque);
            if (a == null || b == null) {
                return;
            }
            aixa aixaVar = a.b;
            if (!b.c && aixaVar.a != 1) {
                z = false;
            }
            b.c = z;
            ((List) b.f.get(aixaVar.a)).add(aixaVar);
        }
    }

    @Override // defpackage.zna
    public final void o(Deque deque, Attributes attributes) {
        aiwz b;
        Integer num = (Integer) this.a.get(attributes.getValue("mimeType"));
        if (num != null) {
            boolean z = true;
            if ((num.intValue() != 1 && num.intValue() != 2) || (b = aixn.b(deque)) == null) {
                return;
            }
            if (num.intValue() != 1) {
                z = false;
            }
            b.c = z;
            deque.push(new aixl(b, ((Integer) b.e.firstKey()).intValue(), new aixa(num.intValue(), attributes.getValue("lang"))));
        }
    }
}
