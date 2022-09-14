package defpackage;

import java.util.Iterator;
import java.util.Set;
/* compiled from: PG */
/* renamed from: devn  reason: default package */
/* loaded from: classes6.dex */
public final class devn implements devr {
    private final String a;
    private final devo b;

    public devn(Set<devp> set, devo devoVar) {
        this.a = b(set);
        this.b = devoVar;
    }

    private static String b(Set<devp> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<devp> it = set.iterator();
        while (it.hasNext()) {
            devp next = it.next();
            sb.append(next.a());
            sb.append('/');
            sb.append(next.b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public static deow<devr> component() {
        deov builder = deow.builder(devr.class);
        builder.b(depi.setOf(devp.class));
        builder.c(devm.a);
        return builder.a();
    }

    @Override // defpackage.devr
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
