package defpackage;

import android.graphics.Path;
/* compiled from: PG */
/* renamed from: cax  reason: default package */
/* loaded from: classes2.dex */
public final class cax implements can {
    public final Path.FillType a;
    public final String b;
    public final bzy c;
    public final cab d;
    public final boolean e;
    private final boolean f;

    public cax(String str, boolean z, Path.FillType fillType, bzy bzyVar, cab cabVar, boolean z2) {
        this.b = str;
        this.f = z;
        this.a = fillType;
        this.c = bzyVar;
        this.d = cabVar;
        this.e = z2;
    }

    @Override // defpackage.can
    public final byc a(bxn bxnVar, cbd cbdVar) {
        return new byg(bxnVar, cbdVar, this);
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
