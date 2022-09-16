package ezvcard.util;

import java.util.BitSet;
/* compiled from: CharacterBitSet.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final BitSet f5610a = new BitSet(128);

    /* renamed from: b  reason: collision with root package name */
    private final String f5611b;

    public b(String str) {
        this.f5611b = str;
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if ((i < str.length() + (-2) ? str.charAt(i + 1) : (char) 0) == '-') {
                i += 2;
                char charAt2 = str.charAt(i);
                if (charAt > charAt2) {
                    charAt2 = charAt;
                    charAt = charAt2;
                }
                this.f5610a.set(charAt, charAt2 + 1);
            } else {
                this.f5610a.set(charAt);
            }
            i++;
        }
    }

    public int hashCode() {
        return this.f5610a.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f5610a.equals(((b) obj).f5610a);
    }

    public String toString() {
        return this.f5611b;
    }
}
