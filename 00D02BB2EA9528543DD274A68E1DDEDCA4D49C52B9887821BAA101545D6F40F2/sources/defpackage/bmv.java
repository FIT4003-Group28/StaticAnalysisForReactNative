package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bmv  reason: default package */
/* loaded from: classes3.dex */
public final class bmv implements bms {
    public final String a;
    public final bmf b;
    public final bmg c;
    public final bmi d;
    public final bmi e;
    public final bme f;
    public final float g;
    public final List<bme> h;
    public final bme i;
    public final boolean j;
    public final int k;
    public final int l;
    public final int m;

    public bmv(String str, int i, bmf bmfVar, bmg bmgVar, bmi bmiVar, bmi bmiVar2, bme bmeVar, int i2, int i3, float f, List<bme> list, bme bmeVar2, boolean z) {
        this.a = str;
        this.k = i;
        this.b = bmfVar;
        this.c = bmgVar;
        this.d = bmiVar;
        this.e = bmiVar2;
        this.f = bmeVar;
        this.l = i2;
        this.m = i3;
        this.g = f;
        this.h = list;
        this.i = bmeVar2;
        this.j = z;
    }

    @Override // defpackage.bms
    public final bkk b(bjr bjrVar, bnl bnlVar) {
        return new bkq(bjrVar, bnlVar, this);
    }
}
