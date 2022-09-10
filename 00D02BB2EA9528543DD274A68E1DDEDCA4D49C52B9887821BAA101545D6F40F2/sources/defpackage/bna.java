package defpackage;

import android.graphics.PointF;
/* compiled from: PG */
/* renamed from: bna  reason: default package */
/* loaded from: classes3.dex */
public final class bna implements bms {
    public final String a;
    public final bmp<PointF, PointF> b;
    public final bmi c;
    public final bme d;
    public final boolean e;

    public bna(String str, bmp<PointF, PointF> bmpVar, bmi bmiVar, bme bmeVar, boolean z) {
        this.a = str;
        this.b = bmpVar;
        this.c = bmiVar;
        this.d = bmeVar;
        this.e = z;
    }

    @Override // defpackage.bms
    public final bkk b(bjr bjrVar, bnl bnlVar) {
        return new bkw(bjrVar, bnlVar, this);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32 + String.valueOf(valueOf2).length());
        sb.append("RectangleShape{position=");
        sb.append(valueOf);
        sb.append(", size=");
        sb.append(valueOf2);
        sb.append('}');
        return sb.toString();
    }
}
