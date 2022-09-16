package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;
/* compiled from: PG */
/* renamed from: aixe  reason: default package */
/* loaded from: classes.dex */
final class aixe extends zna {
    @Override // defpackage.zna
    public final void o(Deque deque, Attributes attributes) {
        aiwz aiwzVar = new aiwz();
        try {
            Integer.parseInt(attributes.getValue("yt:earliestMediaSequence"));
        } catch (Exception unused) {
        }
        try {
            pcx.h(attributes.getValue("minimumUpdatePeriod"));
        } catch (Exception unused2) {
        }
        deque.push(aiwzVar);
    }
}
