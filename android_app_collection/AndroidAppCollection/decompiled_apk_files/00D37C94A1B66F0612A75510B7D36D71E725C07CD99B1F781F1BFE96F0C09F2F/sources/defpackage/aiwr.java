package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aiwr  reason: default package */
/* loaded from: classes.dex */
public final class aiwr extends zna {
    @Override // defpackage.zna
    public final void n(Deque deque, Attributes attributes, String str) {
        aiye aiyeVar;
        aixz aixzVar = (aixz) deque.peekFirst();
        if (aixzVar == null) {
            return;
        }
        int b = aiwv.b(attributes, 0, "wp");
        if (b != 0) {
            aiyeVar = new aiye(aixzVar.e(b));
        } else {
            aiyeVar = new aiye();
        }
        aiyeVar.b = aiwv.b(attributes, 0, "id");
        aiyeVar.c = aiwv.a(aiwv.b(attributes, 7, "ap"));
        aiyeVar.d = aiwv.b(attributes, 100, "av");
        aiyeVar.e = aiwv.b(attributes, 50, "ah");
        aiyeVar.f = aiwv.b(attributes, 0, "rc");
        aiyeVar.g = aiwv.b(attributes, 0, "cc");
        aixzVar.c.put(Integer.valueOf(aiyeVar.b), aiyeVar);
    }
}
