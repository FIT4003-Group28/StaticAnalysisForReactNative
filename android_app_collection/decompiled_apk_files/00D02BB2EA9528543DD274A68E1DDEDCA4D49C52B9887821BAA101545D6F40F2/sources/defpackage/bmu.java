package defpackage;

import android.graphics.Path;
/* compiled from: PG */
/* renamed from: bmu  reason: default package */
/* loaded from: classes3.dex */
public final class bmu implements bms {
    public final Path.FillType a;
    public final bmf b;
    public final bmg c;
    public final bmi d;
    public final bmi e;
    public final String f;
    public final boolean g;
    public final int h;

    public bmu(String str, int i, Path.FillType fillType, bmf bmfVar, bmg bmgVar, bmi bmiVar, bmi bmiVar2, boolean z) {
        this.h = i;
        this.a = fillType;
        this.b = bmfVar;
        this.c = bmgVar;
        this.d = bmiVar;
        this.e = bmiVar2;
        this.f = str;
        this.g = z;
    }

    @Override // defpackage.bms
    public final bkk b(bjr bjrVar, bnl bnlVar) {
        return new bkp(bjrVar, bnlVar, this);
    }
}
