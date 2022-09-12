package defpackage;

import java.text.Format;
/* compiled from: PG */
/* renamed from: cp  reason: default package */
/* loaded from: classes5.dex */
final class cp {
    final int a;
    final String b;
    final Number c;
    final double d;
    int e;
    Format f;
    String g;
    boolean h;

    public cp(int i, String str, Number number, double d) {
        this.a = i;
        this.b = str;
        if (d == dcyn.a) {
            this.c = number;
        } else {
            this.c = Double.valueOf(number.doubleValue() - d);
        }
        this.d = d;
    }

    public final String toString() {
        throw new AssertionError("PluralSelectorContext being formatted, rather than its number");
    }
}
