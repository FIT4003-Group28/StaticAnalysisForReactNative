package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: datm  reason: default package */
/* loaded from: classes5.dex */
final class datm {
    int a;
    byte[] b;
    int c;
    int d;
    boolean e;
    int f;
    int g;

    public final String toString() {
        return String.format("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", getClass().getSimpleName(), Arrays.toString(this.b), Integer.valueOf(this.f), Boolean.valueOf(this.e), Integer.valueOf(this.a), 0L, Integer.valueOf(this.g), Integer.valueOf(this.c), Integer.valueOf(this.d));
    }
}
