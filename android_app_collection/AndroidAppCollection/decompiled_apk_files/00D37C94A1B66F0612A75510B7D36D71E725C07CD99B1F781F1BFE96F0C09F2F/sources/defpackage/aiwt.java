package defpackage;

import java.util.Deque;
import org.chromium.net.PrivateKeyType;
import org.xml.sax.Attributes;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aiwt  reason: default package */
/* loaded from: classes.dex */
public final class aiwt extends zna {
    @Override // defpackage.zna
    public final void n(Deque deque, Attributes attributes, String str) {
        aixz aixzVar = (aixz) deque.peekFirst();
        if (aixzVar == null) {
            return;
        }
        aiyc aiycVar = new aiyc(aixzVar.c(aiwv.b(attributes, 0, "p")));
        aiycVar.b = aiwv.b(attributes, 0, "id");
        aiycVar.c = aiwv.h(attributes, new String[]{"i"});
        aiycVar.d = aiwv.h(attributes, new String[]{"u"});
        aiycVar.e = aiwv.h(attributes, new String[]{"b"});
        aiycVar.f = aiwv.b(attributes, 1, "of");
        aiycVar.g = aiwv.b(attributes, 100, "sz");
        aiycVar.h = aiwv.b(attributes, 0, "et");
        aiycVar.n = aiwv.g(attributes, "#000000", "ec");
        aiycVar.i = aiwv.b(attributes, 0, "fs");
        aiycVar.j = aiwv.g(attributes, "#FFFFFF", "fc");
        aiycVar.k = aiwv.b(attributes, PrivateKeyType.INVALID, "fo");
        aiycVar.l = aiwv.g(attributes, "#000000", "bc");
        aiycVar.m = aiwv.b(attributes, PrivateKeyType.INVALID, "bo");
        aixzVar.a.put(Integer.valueOf(aiycVar.b), aiycVar);
    }
}
