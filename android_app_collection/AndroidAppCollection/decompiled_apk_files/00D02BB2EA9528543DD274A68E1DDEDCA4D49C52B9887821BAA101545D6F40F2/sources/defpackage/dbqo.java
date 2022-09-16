package defpackage;

import java.util.BitSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbqo  reason: default package */
/* loaded from: classes.dex */
public final class dbqo extends dbqn {
    private final char a;
    private final char b;

    public dbqo(char c, char c2) {
        dbsk.a(c2 >= c);
        this.a = c;
        this.b = c2;
    }

    @Override // defpackage.dbrb
    public final boolean b(char c) {
        return this.a <= c && c <= this.b;
    }

    @Override // defpackage.dbrb
    public final void l(BitSet bitSet) {
        bitSet.set(this.a, this.b + 1);
    }

    public final String toString() {
        String u = dbrb.u(this.a);
        String u2 = dbrb.u(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(u).length() + 27 + String.valueOf(u2).length());
        sb.append("CharMatcher.inRange('");
        sb.append(u);
        sb.append("', '");
        sb.append(u2);
        sb.append("')");
        return sb.toString();
    }
}
