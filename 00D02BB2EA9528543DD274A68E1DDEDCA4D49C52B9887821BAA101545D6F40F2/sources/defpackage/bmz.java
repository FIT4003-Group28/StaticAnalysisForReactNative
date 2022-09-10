package defpackage;

import android.graphics.PointF;
/* compiled from: PG */
/* renamed from: bmz  reason: default package */
/* loaded from: classes3.dex */
public final class bmz implements bms {
    public final String a;
    public final bme b;
    public final bmp<PointF, PointF> c;
    public final bme d;
    public final bme e;
    public final bme f;
    public final bme g;
    public final bme h;
    public final boolean i;
    public final int j;

    public bmz(String str, int i, bme bmeVar, bmp<PointF, PointF> bmpVar, bme bmeVar2, bme bmeVar3, bme bmeVar4, bme bmeVar5, bme bmeVar6, boolean z) {
        this.a = str;
        this.j = i;
        this.b = bmeVar;
        this.c = bmpVar;
        this.d = bmeVar2;
        this.e = bmeVar3;
        this.f = bmeVar4;
        this.g = bmeVar5;
        this.h = bmeVar6;
        this.i = z;
    }

    @Override // defpackage.bms
    public final bkk b(bjr bjrVar, bnl bnlVar) {
        return new bkv(bjrVar, bnlVar, this);
    }
}
