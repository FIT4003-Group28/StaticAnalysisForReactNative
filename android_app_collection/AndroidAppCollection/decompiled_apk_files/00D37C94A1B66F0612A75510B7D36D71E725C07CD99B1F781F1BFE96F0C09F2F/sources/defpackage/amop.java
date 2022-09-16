package defpackage;

import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amop  reason: default package */
/* loaded from: classes.dex */
public final class amop extends amoy {
    private final char[] a;

    public amop(CharSequence charSequence) {
        char[] charArray = charSequence.toString().toCharArray();
        this.a = charArray;
        Arrays.sort(charArray);
    }

    @Override // defpackage.amoy
    public final boolean b(char c) {
        return Arrays.binarySearch(this.a, c) >= 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
        for (char c : this.a) {
            sb.append(amoy.d(c));
        }
        sb.append("\")");
        return sb.toString();
    }
}
