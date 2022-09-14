package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dbry  reason: default package */
/* loaded from: classes5.dex */
public final class dbry {
    public final dbrz a;
    public final String b;

    public dbry(dbrz dbrzVar, String str) {
        this.a = dbrzVar;
        dbsk.s(str);
        this.b = str;
    }

    public final String a(Map<?, ?> map) {
        Iterator<? extends Map.Entry<?, ?>> it = map.entrySet().iterator();
        StringBuilder sb = new StringBuilder();
        b(sb, it);
        return sb.toString();
    }

    public final void b(StringBuilder sb, Iterator<? extends Map.Entry<?, ?>> it) {
        try {
            if (!it.hasNext()) {
                return;
            }
            Map.Entry<?, ?> next = it.next();
            sb.append(this.a.a(next.getKey()));
            sb.append((CharSequence) this.b);
            sb.append(this.a.a(next.getValue()));
            while (it.hasNext()) {
                sb.append((CharSequence) this.a.c);
                Map.Entry<?, ?> next2 = it.next();
                sb.append(this.a.a(next2.getKey()));
                sb.append((CharSequence) this.b);
                sb.append(this.a.a(next2.getValue()));
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
