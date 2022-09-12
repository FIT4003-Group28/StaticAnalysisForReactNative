package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: eaoj  reason: default package */
/* loaded from: classes6.dex */
public final class eaoj {
    static final char[] a = new char[0];
    public final eaod b;
    public char[] c;
    public int d;
    public int e;
    public boolean f = false;
    public int g;
    public char[] h;
    public int i;
    public String j;
    public char[] k;
    private ArrayList<char[]> l;

    public eaoj(eaod eaodVar) {
        this.b = eaodVar;
    }

    public final void a(char[] cArr, int i, int i2) {
        this.j = null;
        this.k = null;
        this.c = cArr;
        this.d = i;
        this.e = i2;
        if (this.f) {
            c();
        }
    }

    public final char[] b(int i) {
        return this.b.d(eaoc.TEXT_BUFFER, i);
    }

    public final void c() {
        this.f = false;
        this.l.clear();
        this.g = 0;
        this.i = 0;
    }

    public final int d() {
        if (this.d >= 0) {
            return this.e;
        }
        char[] cArr = this.k;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.j;
        return str != null ? str.length() : this.g + this.i;
    }

    public final int e() {
        int i = this.d;
        if (i >= 0) {
            return i;
        }
        return 0;
    }

    public final char[] f() {
        if (this.d >= 0) {
            return this.c;
        }
        char[] cArr = this.k;
        if (cArr != null) {
            return cArr;
        }
        String str = this.j;
        if (str == null) {
            return !this.f ? this.h : h();
        }
        char[] charArray = str.toCharArray();
        this.k = charArray;
        return charArray;
    }

    public final String g() {
        if (this.j == null) {
            char[] cArr = this.k;
            if (cArr != null) {
                this.j = new String(cArr);
            } else {
                int i = this.d;
                String str = "";
                if (i >= 0) {
                    int i2 = this.e;
                    if (i2 <= 0) {
                        this.j = str;
                        return str;
                    }
                    str = new String(this.c, i, i2);
                } else {
                    int i3 = this.g;
                    int i4 = this.i;
                    if (i3 != 0) {
                        StringBuilder sb = new StringBuilder(i3 + i4);
                        ArrayList<char[]> arrayList = this.l;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                char[] cArr2 = this.l.get(i5);
                                sb.append(cArr2, 0, cArr2.length);
                            }
                        }
                        sb.append(this.h, 0, this.i);
                        this.j = sb.toString();
                    } else if (i4 != 0) {
                        str = new String(this.h, 0, i4);
                    }
                }
                this.j = str;
            }
        }
        return this.j;
    }

    public final char[] h() {
        int i;
        char[] cArr = this.k;
        if (cArr == null) {
            String str = this.j;
            if (str != null) {
                cArr = str.toCharArray();
            } else {
                int i2 = this.d;
                if (i2 >= 0) {
                    int i3 = this.e;
                    if (i3 <= 0) {
                        cArr = a;
                    } else {
                        char[] cArr2 = new char[i3];
                        System.arraycopy(this.c, i2, cArr2, 0, i3);
                        cArr = cArr2;
                    }
                } else {
                    int d = d();
                    if (d <= 0) {
                        cArr = a;
                    } else {
                        cArr = new char[d];
                        ArrayList<char[]> arrayList = this.l;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            i = 0;
                            for (int i4 = 0; i4 < size; i4++) {
                                char[] cArr3 = this.l.get(i4);
                                int length = cArr3.length;
                                System.arraycopy(cArr3, 0, cArr, i, length);
                                i += length;
                            }
                        } else {
                            i = 0;
                        }
                        System.arraycopy(this.h, 0, cArr, i, this.i);
                    }
                }
            }
            this.k = cArr;
        }
        return cArr;
    }

    public final char[] i() {
        if (this.d >= 0) {
            m(1);
        } else {
            char[] cArr = this.h;
            if (cArr == null) {
                this.h = b(0);
            } else if (this.i >= cArr.length) {
                n(1);
            }
        }
        return this.h;
    }

    public final char[] j() {
        this.d = -1;
        this.i = 0;
        this.e = 0;
        this.c = null;
        this.j = null;
        this.k = null;
        if (this.f) {
            c();
        }
        char[] cArr = this.h;
        if (cArr == null) {
            char[] b = b(0);
            this.h = b;
            return b;
        }
        return cArr;
    }

    public final char[] k() {
        if (this.l == null) {
            this.l = new ArrayList<>();
        }
        this.f = true;
        this.l.add(this.h);
        int length = this.h.length;
        this.g += length;
        char[] cArr = new char[Math.min(length + (length >> 1), 262144)];
        this.i = 0;
        this.h = cArr;
        return cArr;
    }

    public final char[] l() {
        char[] cArr = this.h;
        int length = cArr.length;
        char[] cArr2 = new char[length == 262144 ? 262145 : Math.min(262144, (length >> 1) + length)];
        this.h = cArr2;
        System.arraycopy(cArr, 0, cArr2, 0, length);
        return this.h;
    }

    public final void m(int i) {
        int i2 = this.e;
        this.e = 0;
        char[] cArr = this.c;
        this.c = null;
        int i3 = this.d;
        this.d = -1;
        int i4 = i + i2;
        char[] cArr2 = this.h;
        if (cArr2 == null || i4 > cArr2.length) {
            this.h = b(i4);
        }
        if (i2 > 0) {
            System.arraycopy(cArr, i3, this.h, 0, i2);
        }
        this.g = 0;
        this.i = i2;
    }

    public final void n(int i) {
        if (this.l == null) {
            this.l = new ArrayList<>();
        }
        char[] cArr = this.h;
        this.f = true;
        this.l.add(cArr);
        int i2 = this.g;
        int length = cArr.length;
        this.g = i2 + length;
        int i3 = length >> 1;
        if (i3 >= i) {
            i = i3;
        }
        this.i = 0;
        this.h = new char[Math.min(262144, length + i)];
    }

    public final String toString() {
        return g();
    }
}
