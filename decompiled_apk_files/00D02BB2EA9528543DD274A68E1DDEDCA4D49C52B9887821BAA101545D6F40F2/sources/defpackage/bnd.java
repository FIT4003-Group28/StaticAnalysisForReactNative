package defpackage;

import android.graphics.Path;
/* compiled from: PG */
/* renamed from: bnd  reason: default package */
/* loaded from: classes3.dex */
public final class bnd implements bms {
    public final Path.FillType a;
    public final String b;
    public final bmd c;
    public final bmg d;
    public final boolean e;
    private final boolean f;

    public bnd(String str, boolean z, Path.FillType fillType, bmd bmdVar, bmg bmgVar, boolean z2) {
        this.b = str;
        this.f = z;
        this.a = fillType;
        this.c = bmdVar;
        this.d = bmgVar;
        this.e = z2;
    }

    @Override // defpackage.bms
    public final bkk b(bjr bjrVar, bnl bnlVar) {
        return new bko(bjrVar, bnlVar, this);
    }

    public final String toString() {
        boolean z = this.f;
        StringBuilder sb = new StringBuilder(36);
        sb.append("ShapeFill{color=, fillEnabled=");
        sb.append(z);
        sb.append('}');
        return sb.toString();
    }
}
