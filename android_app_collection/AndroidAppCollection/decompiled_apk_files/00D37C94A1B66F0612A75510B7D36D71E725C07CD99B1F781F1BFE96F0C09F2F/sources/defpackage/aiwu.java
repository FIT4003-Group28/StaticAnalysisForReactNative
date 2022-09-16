package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aiwu  reason: default package */
/* loaded from: classes.dex */
public final class aiwu extends zna {
    @Override // defpackage.zna
    public final void n(Deque deque, Attributes attributes, String str) {
        aixx aixxVar = (aixx) deque.peekFirst();
        if (aixxVar == null) {
            return;
        }
        int b = aiwv.b(attributes, 0, "w", "win");
        String f = aiwv.f(attributes, "t", "start");
        if (f == null) {
            return;
        }
        int parseInt = Integer.parseInt(f);
        int b2 = aiwv.b(attributes, 0, "d", "dur");
        String replaceAll = str.replaceAll("\n", "<br/>");
        if (aiwv.f(attributes, "append") == null) {
            aixxVar.c(b, replaceAll, parseInt, b2 + parseInt);
        } else {
            aixxVar.b(b).c(replaceAll, parseInt, b2 + parseInt);
        }
    }
}
