package defpackage;

import android.graphics.Path;
/* compiled from: PG */
/* renamed from: cap  reason: default package */
/* loaded from: classes2.dex */
public final class cap implements can {
    public final Path.FillType a;
    public final caa b;
    public final cab c;
    public final cad d;
    public final cad e;
    public final String f;
    public final boolean g;
    public final int h;

    public cap(String str, int i, Path.FillType fillType, caa caaVar, cab cabVar, cad cadVar, cad cadVar2, boolean z) {
        this.h = i;
        this.a = fillType;
        this.b = caaVar;
        this.c = cabVar;
        this.d = cadVar;
        this.e = cadVar2;
        this.f = str;
        this.g = z;
    }

    @Override // defpackage.can
    public final byc a(bxn bxnVar, cbd cbdVar) {
        return new byh(bxnVar, cbdVar, this);
    }
}
