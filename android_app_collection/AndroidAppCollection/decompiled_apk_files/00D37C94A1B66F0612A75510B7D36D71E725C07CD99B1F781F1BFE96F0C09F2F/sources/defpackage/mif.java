package defpackage;

import java.util.Iterator;
import java.util.Set;
/* compiled from: PG */
/* renamed from: mif  reason: default package */
/* loaded from: classes3.dex */
public final class mif implements ajws {
    private final Set a;

    public mif(Set set) {
        this.a = amvn.p(set);
    }

    @Override // defpackage.ajws
    public final Object a(Object obj) {
        Iterator it = this.a.iterator();
        Object obj2 = obj;
        while (it.hasNext() && (obj2 = ((ajws) it.next()).a(obj2)) == obj) {
        }
        return obj2;
    }
}
