package defpackage;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
/* compiled from: PG */
@Deprecated
/* renamed from: be  reason: default package */
/* loaded from: classes2.dex */
public final class be {
    @Deprecated
    public final Set a;
    @Deprecated
    public final boolean b;
    @Deprecated
    public final int c;

    private be(int i, Set set, boolean z) {
        this.c = i;
        this.a = set;
        this.b = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static be a(String str) {
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
        for (String str2 : bj.e.split(str.substring(7).trim())) {
            if (str2.equals("…") || str2.equals("...")) {
                z = false;
                z2 = true;
            } else if (!z2) {
                String[] split2 = bj.f.split(str2);
                int length = split2.length;
                if (length == 1) {
                    bc bcVar = new bc(split2[0]);
                    b(i, bcVar);
                    linkedHashSet.add(new bd(bcVar, bcVar));
                } else if (length == 2) {
                    bc bcVar2 = new bc(split2[0]);
                    bc bcVar3 = new bc(split2[1]);
                    b(i, bcVar2);
                    b(i, bcVar3);
                    linkedHashSet.add(new bd(bcVar2, bcVar3));
                } else {
                    String valueOf = String.valueOf(str2);
                    throw new IllegalArgumentException(valueOf.length() != 0 ? "Ill-formed number range: ".concat(valueOf) : new String("Ill-formed number range: "));
                }
            } else {
                String valueOf2 = String.valueOf(str2);
                throw new IllegalArgumentException(valueOf2.length() != 0 ? "Can only have … at the end of samples: ".concat(valueOf2) : new String("Can only have … at the end of samples: "));
            }
        }
        return new be(i, Collections.unmodifiableSet(linkedHashSet), z);
    }

    private static void b(int i, bc bcVar) {
        boolean z = false;
        boolean z2 = i == 1;
        if (bcVar.b == 0) {
            z = true;
        }
        if (z2 == z) {
            return;
        }
        String valueOf = String.valueOf(bcVar);
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
        for (bd bdVar : this.a) {
            if (!z) {
                sb.append(",");
            }
            sb.append(' ');
            sb.append(bdVar);
            z = false;
        }
        if (!this.b) {
            sb.append(", …");
        }
        return sb.toString();
    }
}
