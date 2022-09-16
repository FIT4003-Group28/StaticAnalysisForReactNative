package defpackage;

import java.util.Iterator;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aodj  reason: default package */
/* loaded from: classes.dex */
public final class aodj implements aodn {
    private final String a;
    private final aodk b;

    public aodj(Set set, aodk aodkVar) {
        this.a = b(set);
        this.b = aodkVar;
    }

    private static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            aodl aodlVar = (aodl) it.next();
            sb.append(aodlVar.a);
            sb.append('/');
            sb.append(aodlVar.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // defpackage.aodn
    public final String a() {
        if (this.b.a().isEmpty()) {
            return this.a;
        }
        String str = this.a;
        String b = b(this.b.a());
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(b).length());
        sb.append(str);
        sb.append(' ');
        sb.append(b);
        return sb.toString();
    }
}
