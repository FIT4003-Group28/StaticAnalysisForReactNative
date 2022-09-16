package defpackage;

import java.io.DataInput;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: balx  reason: default package */
/* loaded from: classes2.dex */
public final class balx {
    final balv a;
    final String b;
    final int c;

    public balx(balv balvVar, String str, int i) {
        this.a = balvVar;
        this.b = str;
        this.c = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static balx c(DataInput dataInput) {
        return new balx(new balv((char) dataInput.readUnsignedByte(), dataInput.readUnsignedByte(), dataInput.readByte(), dataInput.readUnsignedByte(), dataInput.readBoolean(), (int) banl.e(dataInput)), dataInput.readUTF(), (int) banl.e(dataInput));
    }

    public final long a(long j, int i, int i2) {
        balv balvVar = this.a;
        char c = balvVar.a;
        if (c == 'w') {
            i += i2;
        } else if (c != 's') {
            i = 0;
        }
        long j2 = i;
        long j3 = j + j2;
        bajl bajlVar = bajl.n;
        long a = balvVar.a(bajlVar, bajlVar.h.e(bajlVar.h.h(bajlVar.l.h(j3, balvVar.b), 0), Math.min(balvVar.f, 86399999)));
        if (balvVar.d != 0) {
            a = balvVar.c(bajlVar, a);
            if (a <= j3) {
                a = balvVar.c(bajlVar, balvVar.a(bajlVar, bajlVar.l.h(bajlVar.m.e(a, 1), balvVar.b)));
            }
        } else if (a <= j3) {
            a = balvVar.a(bajlVar, bajlVar.m.e(a, 1));
        }
        return a - j2;
    }

    public final long b(long j, int i, int i2) {
        balv balvVar = this.a;
        char c = balvVar.a;
        if (c == 'w') {
            i += i2;
        } else if (c != 's') {
            i = 0;
        }
        long j2 = i;
        long j3 = j + j2;
        bajl bajlVar = bajl.n;
        long b = balvVar.b(bajlVar, bajlVar.h.e(bajlVar.h.h(bajlVar.l.h(j3, balvVar.b), 0), balvVar.f));
        if (balvVar.d != 0) {
            b = balvVar.c(bajlVar, b);
            if (b >= j3) {
                b = balvVar.c(bajlVar, balvVar.b(bajlVar, bajlVar.l.h(bajlVar.m.e(b, -1), balvVar.b)));
            }
        } else if (b >= j3) {
            b = balvVar.b(bajlVar, bajlVar.m.e(b, -1));
        }
        return b - j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof balx) {
            balx balxVar = (balx) obj;
            if (this.c == balxVar.c && this.b.equals(balxVar.b) && this.a.equals(balxVar.a)) {
                return true;
            }
        }
        return false;
    }
}
