package defpackage;

import java.util.ArrayList;
import java.util.Deque;
import org.xml.sax.Attributes;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aiwp  reason: default package */
/* loaded from: classes.dex */
public final class aiwp extends zna {
    @Override // defpackage.zna
    public final void n(Deque deque, Attributes attributes, String str) {
        aiyf f;
        aixz aixzVar = (aixz) deque.peekFirst();
        if (aixzVar == null) {
            return;
        }
        aiyc aiycVar = aixzVar.g;
        aiyd d = aixzVar.d(aiwv.b(attributes, 0, "w"));
        aiye e = d != null ? d.e : aixzVar.e(aiwv.b(attributes, 0, "wp"));
        if (d != null) {
            f = d.f;
        } else {
            f = aixzVar.f(aiwv.b(attributes, 0, "ws"));
        }
        aiya aiyaVar = new aiya();
        aiyaVar.e = aiycVar;
        aiyaVar.a = aiwv.d(attributes, 0L, "t");
        aiyaVar.b = aiwv.d(attributes, 0L, "d");
        if (d == null) {
            d = aiyd.a;
        }
        aiyaVar.c = d;
        aiyaVar.d = aiwv.h(attributes, new String[]{"a"});
        aiyaVar.f = e;
        aiyaVar.g = f;
        aiyaVar.h = aiwv.b(attributes, 0, "rc");
        aiyaVar.i = aiwv.b(attributes, 0, "cc");
        String a = aiycVar.a();
        String replaceAll = str.replaceAll("\n", "<br/>");
        String b = aiycVar.b();
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + String.valueOf(replaceAll).length() + String.valueOf(b).length());
        sb.append(a);
        sb.append(replaceAll);
        sb.append(b);
        aiyaVar.k = sb.toString();
        aiya aiyaVar2 = aixzVar.f;
        if (aiyaVar2 != null) {
            if (aiyaVar2.b == 0) {
                aiyaVar2.b = aiyaVar.a - aiyaVar2.a;
            }
            aixzVar.g(aiyaVar2);
        }
        aixzVar.f = aiyaVar;
        aiyaVar.j = aixzVar.e;
        aixzVar.e = new ArrayList();
        aixzVar.g = aiyc.a;
    }

    @Override // defpackage.zna
    public final void o(Deque deque, Attributes attributes) {
        aiyc c;
        aixz aixzVar = (aixz) deque.peekFirst();
        if (aixzVar == null) {
            return;
        }
        aiyd d = aixzVar.d(aiwv.b(attributes, 0, "w"));
        String value = attributes.getValue("p");
        if (value != null) {
            c = aixzVar.c(zgh.b(value, 0));
        } else {
            c = d != null ? d.g : aixzVar.c(0);
        }
        aixzVar.g = c;
    }
}
