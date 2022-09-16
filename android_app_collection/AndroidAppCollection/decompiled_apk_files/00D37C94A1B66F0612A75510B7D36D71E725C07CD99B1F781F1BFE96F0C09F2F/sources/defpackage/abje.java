package defpackage;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: PG */
/* renamed from: abje  reason: default package */
/* loaded from: classes.dex */
public final class abje {
    public final LinkedList a = new LinkedList();

    public final void a(abjd abjdVar) {
        this.a.add(new WeakReference(abjdVar));
    }

    public final void b(abjd abjdVar, boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            abjd abjdVar2 = (abjd) ((WeakReference) it.next()).get();
            if (abjdVar2 != null && !abjdVar2.equals(abjdVar)) {
                abjdVar2.d(z);
            }
        }
    }
}
