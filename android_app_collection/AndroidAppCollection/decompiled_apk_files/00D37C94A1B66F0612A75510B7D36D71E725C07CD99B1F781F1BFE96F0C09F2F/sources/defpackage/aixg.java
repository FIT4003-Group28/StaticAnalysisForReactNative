package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;
/* compiled from: PG */
/* renamed from: aixg  reason: default package */
/* loaded from: classes.dex */
final class aixg extends zna {
    @Override // defpackage.zna
    public final void n(Deque deque, Attributes attributes, String str) {
        deque.pop();
    }

    @Override // defpackage.zna
    public final void o(Deque deque, Attributes attributes) {
        aiwz b = aixn.b(deque);
        if (b == null) {
            return;
        }
        aixm aixmVar = new aixm(b);
        aixmVar.c = b.a;
        aixmVar.d = Long.parseLong(attributes.getValue("presentationTimeOffset"));
        aixmVar.b = b.b;
        aixmVar.e = Integer.parseInt(attributes.getValue("startNumber"));
        deque.push(aixmVar);
    }
}
