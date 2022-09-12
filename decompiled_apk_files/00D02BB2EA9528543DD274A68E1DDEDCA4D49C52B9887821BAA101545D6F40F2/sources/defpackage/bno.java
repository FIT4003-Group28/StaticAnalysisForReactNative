package defpackage;

import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bno  reason: default package */
/* loaded from: classes3.dex */
public final class bno {
    public final List<bms> a;
    public final bis b;
    public final String c;
    public final long d;
    public final long e;
    public final String f;
    public final List<bmw> g;
    public final bmo h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final float m;
    public final int n;
    public final int o;
    public final bmm p;
    public final bmn q;
    public final bme r;
    public final List<bpt<Float>> s;
    public final boolean t;
    public final int u;
    public final int v;

    public bno(List<bms> list, bis bisVar, String str, long j, int i, long j2, String str2, List<bmw> list2, bmo bmoVar, int i2, int i3, int i4, float f, float f2, int i5, int i6, bmm bmmVar, bmn bmnVar, List<bpt<Float>> list3, int i7, bme bmeVar, boolean z) {
        this.a = list;
        this.b = bisVar;
        this.c = str;
        this.d = j;
        this.u = i;
        this.e = j2;
        this.f = str2;
        this.g = list2;
        this.h = bmoVar;
        this.i = i2;
        this.j = i3;
        this.k = i4;
        this.l = f;
        this.m = f2;
        this.n = i5;
        this.o = i6;
        this.p = bmmVar;
        this.q = bmnVar;
        this.s = list3;
        this.v = i7;
        this.r = bmeVar;
        this.t = z;
    }

    public final String a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.c);
        sb.append("\n");
        bno d = this.b.d(this.e);
        if (d != null) {
            sb.append("\t\tParents: ");
            sb.append(d.c);
            bno d2 = this.b.d(d.e);
            while (d2 != null) {
                sb.append("->");
                sb.append(d2.c);
                d2 = this.b.d(d2.e);
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!this.g.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(this.g.size());
            sb.append("\n");
        }
        if (this.i != 0 && this.j != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(this.i), Integer.valueOf(this.j), Integer.valueOf(this.k)));
        }
        if (!this.a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (bms bmsVar : this.a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(bmsVar);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return a("");
    }
}
