package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aiwm  reason: default package */
/* loaded from: classes.dex */
public final class aiwm extends zna {
    @Override // defpackage.zna
    public final void n(Deque deque, Attributes attributes, String str) {
        String f;
        float f2;
        aixx aixxVar = (aixx) deque.peekFirst();
        if (aixxVar == null || (f = aiwv.f(attributes, "start")) == null) {
            return;
        }
        int c = aiwv.c(Float.parseFloat(f));
        String[] strArr = {"dur"};
        int i = 0;
        while (true) {
            f2 = 5.0f;
            if (i > 0) {
                break;
            }
            String value = attributes.getValue(strArr[i]);
            if (value != null) {
                f2 = zgh.a(value, 5.0f);
                break;
            }
            i++;
        }
        aixxVar.c(0, str.replaceAll("\n", "<br/>"), c, aiwv.c(f2) + c);
    }
}
