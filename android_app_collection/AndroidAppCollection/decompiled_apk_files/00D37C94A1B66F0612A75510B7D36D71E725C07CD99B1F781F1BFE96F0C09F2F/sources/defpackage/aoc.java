package defpackage;

import android.graphics.Typeface;
/* compiled from: PG */
/* renamed from: aoc  reason: default package */
/* loaded from: classes.dex */
public final class aoc {
    public final char[] a;
    public final aob b;
    public final Typeface c;
    public final bmq d;

    aoc() {
        this.c = null;
        this.d = null;
        this.b = new aob(1024);
        this.a = new char[0];
    }

    public aoc(Typeface typeface, bmq bmqVar) {
        this.c = typeface;
        this.d = bmqVar;
        this.b = new aob(1024);
        int e = bmqVar.e();
        this.a = new char[e + e];
        int e2 = bmqVar.e();
        for (int i = 0; i < e2; i++) {
            anq anqVar = new anq(this, i);
            Character.toChars(anqVar.c(), this.a, i + i);
            hz.c(anqVar.b() > 0, "invalid metadata codepoint length");
            this.b.b(anqVar, 0, anqVar.b() - 1);
        }
    }
}
