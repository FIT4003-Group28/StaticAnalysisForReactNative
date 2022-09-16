package defpackage;

import java.io.DataInput;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eavd  reason: default package */
/* loaded from: classes6.dex */
public final class eavd {
    final eavb a;
    final String b;
    final int c;

    public eavd(eavb eavbVar, String str, int i) {
        this.a = eavbVar;
        this.b = str;
        this.c = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static eavd a(DataInput dataInput) {
        return new eavd(new eavb((char) dataInput.readUnsignedByte(), dataInput.readUnsignedByte(), dataInput.readByte(), dataInput.readUnsignedByte(), dataInput.readBoolean(), (int) eave.b(dataInput)), dataInput.readUTF(), (int) eave.b(dataInput));
    }

    public final long b(long j, int i, int i2) {
        eavb eavbVar = this.a;
        char c = eavbVar.a;
        if (c == 'w') {
            i += i2;
        } else if (c != 's') {
            i = 0;
        }
        long j2 = i;
        long j3 = j + j2;
        earp earpVar = earp.E;
        long a = eavbVar.a(earpVar, earpVar.i.k(earpVar.i.p(earpVar.y.p(j3, eavbVar.b), 0), eavbVar.f));
        if (eavbVar.d != 0) {
            a = eavbVar.c(earpVar, a);
            if (a <= j3) {
                a = eavbVar.c(earpVar, eavbVar.a(earpVar, earpVar.y.p(earpVar.z.k(a, 1), eavbVar.b)));
            }
        } else if (a <= j3) {
            a = eavbVar.a(earpVar, earpVar.z.k(a, 1));
        }
        return a - j2;
    }

    public final long c(long j, int i, int i2) {
        eavb eavbVar = this.a;
        char c = eavbVar.a;
        if (c == 'w') {
            i += i2;
        } else if (c != 's') {
            i = 0;
        }
        long j2 = i;
        long j3 = j + j2;
        earp earpVar = earp.E;
        long b = eavbVar.b(earpVar, earpVar.i.k(earpVar.i.p(earpVar.y.p(j3, eavbVar.b), 0), eavbVar.f));
        if (eavbVar.d != 0) {
            b = eavbVar.c(earpVar, b);
            if (b >= j3) {
                b = eavbVar.c(earpVar, eavbVar.b(earpVar, earpVar.y.p(earpVar.z.k(b, -1), eavbVar.b)));
            }
        } else if (b >= j3) {
            b = eavbVar.b(earpVar, earpVar.z.k(b, -1));
        }
        return b - j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eavd) {
            eavd eavdVar = (eavd) obj;
            if (this.c == eavdVar.c && this.b.equals(eavdVar.b) && this.a.equals(eavdVar.a)) {
                return true;
            }
        }
        return false;
    }
}
