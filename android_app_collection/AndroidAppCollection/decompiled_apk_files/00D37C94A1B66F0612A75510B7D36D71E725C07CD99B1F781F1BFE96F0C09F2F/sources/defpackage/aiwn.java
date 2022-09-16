package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aiwn  reason: default package */
/* loaded from: classes.dex */
public final class aiwn extends zna {
    @Override // defpackage.zna
    public final void n(Deque deque, Attributes attributes, String str) {
        deque.pollFirst();
    }

    @Override // defpackage.zna
    public final void o(Deque deque, Attributes attributes) {
        deque.offerFirst(new aixx());
    }
}
