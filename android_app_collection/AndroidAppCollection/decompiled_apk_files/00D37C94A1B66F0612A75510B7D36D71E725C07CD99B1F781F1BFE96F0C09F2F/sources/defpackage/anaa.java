package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: anaa  reason: default package */
/* loaded from: classes.dex */
final class anaa extends anas {
    public anaa(Class cls) {
        super("group_by", cls, true);
    }

    @Override // defpackage.anas
    public final void a(Iterator it, anar anarVar) {
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                anarVar.a(this.a, next);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            sb.append(next);
            do {
                sb.append(',');
                sb.append(it.next());
            } while (it.hasNext());
            String str = this.a;
            sb.append(']');
            anarVar.a(str, sb.toString());
        }
    }
}
