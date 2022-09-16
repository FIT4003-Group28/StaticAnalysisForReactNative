package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;
/* compiled from: PG */
/* renamed from: aixh  reason: default package */
/* loaded from: classes.dex */
final class aixh extends zna {
    @Override // defpackage.zna
    public final void n(Deque deque, Attributes attributes, String str) {
        Object peek = deque.peek();
        aixm aixmVar = null;
        if (peek != null && peek.getClass() == aixm.class) {
            aixmVar = (aixm) peek;
        }
        if (aixmVar == null) {
            return;
        }
        long parseLong = Long.parseLong(attributes.getValue("d"));
        aixmVar.b += attributes.getValue("yt:sid") != null ? Long.parseLong(attributes.getValue("yt:sid")) : 0L;
        aiwz aiwzVar = aixmVar.a;
        aixc aixcVar = new aixc(aixmVar.e);
        aiwzVar.e.put(Integer.valueOf(aixcVar.a), aixcVar);
        aixmVar.b += parseLong;
        aixmVar.c += parseLong;
        aixmVar.d += parseLong;
        aixmVar.e++;
    }
}
