package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: bnsz  reason: default package */
/* loaded from: classes.dex */
public final class bnsz {
    final bnsy a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    @dzsi
    public final String g;
    @dzsi
    public final String h;
    @dzsi
    public final String i;

    public bnsz(@dzsi String str, @dzsi String str2, @dzsi String str3, int i, int i2, int i3, int i4, int i5, bnsy bnsyVar) {
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.b = i;
        this.d = i2;
        this.e = i3;
        this.c = i4;
        this.f = i5;
        this.a = bnsyVar;
    }

    public final boolean a(boolean z) {
        bnsy bnsyVar = this.a;
        return z ? bnsyVar.e : bnsyVar.d;
    }

    public final boolean b() {
        return this.d != 0;
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bnsz) {
            bnsz bnszVar = (bnsz) obj;
            if (dbsd.a(this.g, bnszVar.g) && dbsd.a(this.h, bnszVar.h) && dbsd.a(this.i, bnszVar.i) && this.b == bnszVar.b && this.d == bnszVar.d && this.e == bnszVar.e && this.c == bnszVar.c && this.f == bnszVar.f && this.a == bnszVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.g, this.h, this.i, Integer.valueOf(this.b), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.c), Integer.valueOf(this.f), this.a});
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("gpuVendor", this.g);
        b.b("glVersion", this.h);
        b.b("glRenderer", this.i);
        b.f("maxTextureSize", this.b);
        b.f("maxVertexTextureImageUnits", this.d);
        b.f("maxVertexUniformVectors", this.e);
        b.f("maxSupportedLineWidth", this.c);
        b.f("maxVertexAttribs", this.f);
        b.b("nonPowerOfTwoTextureSupport", this.a);
        return b.toString();
    }
}
