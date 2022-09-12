package defpackage;

import android.graphics.PointF;
/* compiled from: PG */
/* renamed from: bmr  reason: default package */
/* loaded from: classes3.dex */
public final class bmr implements bms {
    public final String a;
    public final bmp<PointF, PointF> b;
    public final bmi c;
    public final boolean d;
    public final boolean e;

    public bmr(String str, bmp<PointF, PointF> bmpVar, bmi bmiVar, boolean z, boolean z2) {
        this.a = str;
        this.b = bmpVar;
        this.c = bmiVar;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.bms
    public final bkk b(bjr bjrVar, bnl bnlVar) {
        return new bkn(bjrVar, bnlVar, this);
    }
}
