package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bni  reason: default package */
/* loaded from: classes3.dex */
public final class bni implements bms {
    public final String a;
    public final bme b;
    public final List<bme> c;
    public final bmd d;
    public final bmg e;
    public final bme f;
    public final float g;
    public final boolean h;
    public final int i;
    public final int j;

    public bni(String str, bme bmeVar, List<bme> list, bmd bmdVar, bmg bmgVar, bme bmeVar2, int i, int i2, float f, boolean z) {
        this.a = str;
        this.b = bmeVar;
        this.c = list;
        this.d = bmdVar;
        this.e = bmgVar;
        this.f = bmeVar2;
        this.i = i;
        this.j = i2;
        this.g = f;
        this.h = z;
    }

    @Override // defpackage.bms
    public final bkk b(bjr bjrVar, bnl bnlVar) {
        return new bkz(bjrVar, bnlVar, this);
    }
}
