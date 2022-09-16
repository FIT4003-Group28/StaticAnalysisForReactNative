package com.b.a.a.c;

import java.util.BitSet;
import org.spongycastle.asn1.eac.EACTags;
/* compiled from: AllowedCharacters.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final BitSet f1454a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f1455b;

    public a(BitSet bitSet, boolean z) {
        this.f1454a = bitSet;
        this.f1455b = z;
    }

    public boolean a(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= 128) {
                if (!this.f1455b) {
                    return false;
                }
            } else if (!this.f1454a.get(charAt)) {
                return false;
            }
        }
        return true;
    }

    public a a() {
        BitSet bitSet = (BitSet) this.f1454a.clone();
        bitSet.flip(0, 128);
        return new a(bitSet, !this.f1455b);
    }

    public String toString() {
        return a(false);
    }

    public String a(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < 128; i++) {
            if (this.f1454a.get(i)) {
                String str = null;
                char c2 = (char) i;
                if (c2 == '\r') {
                    str = "\\r";
                } else if (c2 != ' ') {
                    switch (c2) {
                        case '\t':
                            str = "\\t";
                            break;
                        case '\n':
                            str = "\\n";
                            break;
                        default:
                            if (i < 32 || i == 127) {
                                if (z) {
                                    break;
                                } else {
                                    str = "(" + i + ")";
                                    break;
                                }
                            }
                            break;
                    }
                } else {
                    str = "<space>";
                }
                sb.append(' ');
                if (str == null) {
                    sb.append(c2);
                } else {
                    sb.append(str);
                }
            }
        }
        sb.append(" ]");
        return sb.toString();
    }

    /* compiled from: AllowedCharacters.java */
    /* renamed from: com.b.a.a.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0031a {

        /* renamed from: a  reason: collision with root package name */
        private final BitSet f1456a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f1457b;

        public C0031a() {
            this.f1456a = new BitSet(128);
            this.f1457b = false;
        }

        public C0031a(a aVar) {
            this.f1456a = (BitSet) aVar.f1454a.clone();
            this.f1457b = aVar.f1455b;
        }

        public C0031a a() {
            this.f1456a.set(0, 128);
            this.f1457b = true;
            return this;
        }

        public C0031a a(int i, int i2) {
            this.f1456a.set(i, i2 + 1);
            return this;
        }

        public C0031a a(String str) {
            a(str, true);
            return this;
        }

        public C0031a a(char c2) {
            this.f1456a.set(c2);
            return this;
        }

        public C0031a b() {
            return a(32, EACTags.NON_INTERINDUSTRY_DATA_OBJECT_NESTING_TEMPLATE);
        }

        public C0031a c() {
            this.f1457b = true;
            return this;
        }

        public C0031a b(String str) {
            a(str, false);
            return this;
        }

        public C0031a b(char c2) {
            this.f1456a.set((int) c2, false);
            return this;
        }

        public a d() {
            return new a(this.f1456a, this.f1457b);
        }

        private void a(String str, boolean z) {
            for (int i = 0; i < str.length(); i++) {
                this.f1456a.set(str.charAt(i), z);
            }
        }
    }
}
