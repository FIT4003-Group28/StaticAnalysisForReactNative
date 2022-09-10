package defpackage;

import java.util.BitSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbqy  reason: default package */
/* loaded from: classes.dex */
public final class dbqy extends dbrb {
    final dbrb a;
    final dbrb b;

    public dbqy(dbrb dbrbVar, dbrb dbrbVar2) {
        this.a = dbrbVar;
        dbsk.s(dbrbVar2);
        this.b = dbrbVar2;
    }

    @Override // defpackage.dbrb
    public final boolean b(char c) {
        return this.a.b(c) || this.b.b(c);
    }

    @Override // defpackage.dbrb
    public final void l(BitSet bitSet) {
        this.a.l(bitSet);
        this.b.l(bitSet);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18 + String.valueOf(valueOf2).length());
        sb.append("CharMatcher.or(");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
