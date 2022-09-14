package defpackage;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
/* compiled from: PG */
@Deprecated
/* renamed from: cz  reason: default package */
/* loaded from: classes5.dex */
public final class cz {
    @Deprecated
    public final Set<cy> a;
    @Deprecated
    public final boolean b;
    @Deprecated
    public final int c;

    private cz(int i, Set<cy> set, boolean z) {
        this.c = i;
        this.a = set;
        this.b = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cz a(String str) {
        int i;
        String[] split;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (str.startsWith("integer")) {
            i = 1;
        } else if (!str.startsWith("decimal")) {
            throw new IllegalArgumentException("Samples must start with 'integer' or 'decimal'");
        } else {
            i = 2;
        }
        boolean z = true;
        boolean z2 = false;
        for (String str2 : de.f.split(str.substring(7).trim())) {
            if (str2.equals("…") || str2.equals("...")) {
                z = false;
                z2 = true;
            } else if (z2) {
                String valueOf = String.valueOf(str2);
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Can only have … at the end of samples: ".concat(valueOf) : new String("Can only have … at the end of samples: "));
            } else {
                String[] split2 = de.g.split(str2);
                int length = split2.length;
                if (length == 1) {
                    cx cxVar = new cx(split2[0]);
                    b(i, cxVar);
                    linkedHashSet.add(new cy(cxVar, cxVar));
                } else if (length != 2) {
                    String valueOf2 = String.valueOf(str2);
                    throw new IllegalArgumentException(valueOf2.length() != 0 ? "Ill-formed number range: ".concat(valueOf2) : new String("Ill-formed number range: "));
                } else {
                    cx cxVar2 = new cx(split2[0]);
                    cx cxVar3 = new cx(split2[1]);
                    b(i, cxVar2);
                    b(i, cxVar3);
                    linkedHashSet.add(new cy(cxVar2, cxVar3));
                }
            }
        }
        return new cz(i, Collections.unmodifiableSet(linkedHashSet), z);
    }

    private static void b(int i, cx cxVar) {
        boolean z = false;
        boolean z2 = i == 1;
        if (cxVar.b == 0) {
            z = true;
        }
        if (z2 == z) {
            return;
        }
        String valueOf = String.valueOf(cxVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("Ill-formed number range: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    @Deprecated
    public final String toString() {
        StringBuilder sb = new StringBuilder("@");
        boolean z = true;
        sb.append((this.c != 1 ? "DECIMAL" : "INTEGER").toLowerCase(Locale.ENGLISH));
        for (cy cyVar : this.a) {
            if (!z) {
                sb.append(",");
            }
            sb.append(' ');
            sb.append(cyVar);
            z = false;
        }
        if (!this.b) {
            sb.append(", …");
        }
        return sb.toString();
    }
}
