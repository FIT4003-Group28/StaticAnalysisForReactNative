package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aiwl  reason: default package */
/* loaded from: classes.dex */
public final class aiwl extends zna {
    @Override // defpackage.zna
    public final void n(Deque deque, Attributes attributes, String str) {
        if ("3".equals(attributes.getValue("format"))) {
            aixz aixzVar = (aixz) deque.peekFirst();
            if (aixzVar == null) {
                return;
            }
            aiya aiyaVar = aixzVar.f;
            if (aiyaVar != null) {
                aixzVar.g(aiyaVar);
            }
        }
        deque.pollFirst();
    }

    @Override // defpackage.zna
    public final void o(Deque deque, Attributes attributes) {
        if ("3".equals(attributes.getValue("format"))) {
            deque.offerFirst(new aixz());
        } else {
            deque.offerFirst(new aixx());
        }
    }
}
