package defpackage;

import java.util.Arrays;
import java.util.BitSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbqj  reason: default package */
/* loaded from: classes.dex */
public final class dbqj extends dbrb {
    private final char[] a;

    public dbqj(CharSequence charSequence) {
        char[] charArray = charSequence.toString().toCharArray();
        this.a = charArray;
        Arrays.sort(charArray);
    }

    @Override // defpackage.dbrb
    public final boolean b(char c) {
        return Arrays.binarySearch(this.a, c) >= 0;
    }

    @Override // defpackage.dbrb
    public final void l(BitSet bitSet) {
        for (char c : this.a) {
            bitSet.set(c);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
        for (char c : this.a) {
            sb.append(dbrb.u(c));
        }
        sb.append("\")");
        return sb.toString();
    }
}
