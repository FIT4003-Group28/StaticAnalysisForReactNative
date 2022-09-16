package defpackage;

import java.util.Deque;
import org.chromium.net.PrivateKeyType;
import org.xml.sax.Attributes;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aiws  reason: default package */
/* loaded from: classes.dex */
public final class aiws extends zna {
    @Override // defpackage.zna
    public final void n(Deque deque, Attributes attributes, String str) {
        aixz aixzVar = (aixz) deque.peekFirst();
        if (aixzVar == null) {
            return;
        }
        int b = aiwv.b(attributes, 0, "ws");
        aiyf aiyfVar = b != 0 ? new aiyf(aixzVar.f(b)) : new aiyf();
        aiyfVar.b = aiwv.b(attributes, 0, "id");
        aiyfVar.c = aiwv.b(attributes, 0, "mh");
        aiyfVar.d = aiwv.b(attributes, 2, "ju");
        aiyfVar.e = aiwv.b(attributes, 0, "pd");
        aiyfVar.f = aiwv.b(attributes, 3, "sd");
        aiyfVar.g = aiwv.b(attributes, 0, "wfc");
        aiyfVar.h = aiwv.b(attributes, PrivateKeyType.INVALID, "wfo");
        aiyfVar.i = aiwv.b(attributes, 0, "wbt");
        aiyfVar.j = aiwv.b(attributes, 16777215, "wbc");
        aixzVar.b.put(Integer.valueOf(aiyfVar.b), aiyfVar);
    }
}
