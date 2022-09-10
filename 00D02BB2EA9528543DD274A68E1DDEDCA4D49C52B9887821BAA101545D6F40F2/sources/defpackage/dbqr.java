package defpackage;

import java.util.BitSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbqr  reason: default package */
/* loaded from: classes5.dex */
public final class dbqr extends dbqn {
    private final char a;
    private final char b;

    public dbqr(char c, char c2) {
        this.a = c;
        this.b = c2;
    }

    @Override // defpackage.dbrb
    public final boolean b(char c) {
        return c == this.a || c == this.b;
    }

    @Override // defpackage.dbrb
    public final void l(BitSet bitSet) {
        bitSet.set(this.a);
        bitSet.set(this.b);
    }

    public final String toString() {
        String u = dbrb.u(this.a);
        String u2 = dbrb.u(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(u).length() + 21 + String.valueOf(u2).length());
        sb.append("CharMatcher.anyOf(\"");
        sb.append(u);
        sb.append(u2);
        sb.append("\")");
        return sb.toString();
    }
}
