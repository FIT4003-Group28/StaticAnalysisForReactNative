package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: ampk  reason: default package */
/* loaded from: classes.dex */
final class ampk extends ampm {
    final /* synthetic */ ampm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ampk(ampm ampmVar, ampm ampmVar2) {
        super(ampmVar2);
        this.a = ampmVar;
    }

    @Override // defpackage.ampm
    public final void a(Appendable appendable, Iterator it) {
        it.getClass();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                appendable.append(ampm.g(next));
                break;
            }
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            if (next2 != null) {
                appendable.append(this.a.b);
                appendable.append(ampm.g(next2));
            }
        }
    }
}
