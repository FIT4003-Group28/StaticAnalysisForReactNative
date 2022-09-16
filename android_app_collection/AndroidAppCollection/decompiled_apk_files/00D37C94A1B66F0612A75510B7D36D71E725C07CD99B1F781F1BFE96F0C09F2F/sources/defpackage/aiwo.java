package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aiwo  reason: default package */
/* loaded from: classes.dex */
public final class aiwo extends zna {
    @Override // defpackage.zna
    public final void n(Deque deque, Attributes attributes, String str) {
        aiyc aiycVar;
        aixz aixzVar = (aixz) deque.peekFirst();
        if (aixzVar == null) {
            return;
        }
        String value = attributes.getValue("p");
        if (value != null) {
            aiycVar = aixzVar.c(zgh.b(value, 0));
        } else {
            aiycVar = aixzVar.g;
        }
        aiyb aiybVar = new aiyb();
        aiybVar.a = aiwv.b(attributes, 0, "t");
        aiwv.b(attributes, 0, "ac");
        String a = aiycVar.a();
        String replaceAll = str.replaceAll("\n", "<br/>");
        String b = aiycVar.b();
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + String.valueOf(replaceAll).length() + String.valueOf(b).length());
        sb.append(a);
        sb.append(replaceAll);
        sb.append(b);
        aiybVar.b = sb.toString();
        aixzVar.e.add(aiybVar);
    }
}
