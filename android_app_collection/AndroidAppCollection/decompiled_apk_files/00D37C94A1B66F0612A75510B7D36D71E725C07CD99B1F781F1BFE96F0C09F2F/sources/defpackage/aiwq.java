package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aiwq  reason: default package */
/* loaded from: classes.dex */
public final class aiwq extends zna {
    @Override // defpackage.zna
    public final void n(Deque deque, Attributes attributes, String str) {
        aixz aixzVar = (aixz) deque.peekFirst();
        if (aixzVar == null) {
            return;
        }
        aiyd aiydVar = new aiyd();
        aiydVar.b = aiwv.b(attributes, 0, "id");
        aiydVar.g = aixzVar.c(aiwv.b(attributes, 0, "p"));
        aiydVar.c = aiwv.d(attributes, 0L, "t");
        aiydVar.d = aiwv.d(attributes, Long.MAX_VALUE, "d");
        aiydVar.e = aixzVar.e(aiwv.b(attributes, 0, "wp"));
        aiydVar.f = aixzVar.f(aiwv.b(attributes, 0, "ws"));
        aiydVar.h = aiwv.b(attributes, 0, "rc");
        aiydVar.i = aiwv.b(attributes, 0, "cc");
        aixzVar.d.put(Integer.valueOf(aiydVar.b), aiydVar);
    }
}
