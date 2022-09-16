package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: caq  reason: default package */
/* loaded from: classes2.dex */
public final class caq implements can {
    public final String a;
    public final caa b;
    public final cab c;
    public final cad d;
    public final cad e;
    public final bzz f;
    public final float g;
    public final List h;
    public final bzz i;
    public final boolean j;
    public final int k;
    public final int l;
    public final int m;

    public caq(String str, int i, caa caaVar, cab cabVar, cad cadVar, cad cadVar2, bzz bzzVar, int i2, int i3, float f, List list, bzz bzzVar2, boolean z) {
        this.a = str;
        this.k = i;
        this.b = caaVar;
        this.c = cabVar;
        this.d = cadVar;
        this.e = cadVar2;
        this.f = bzzVar;
        this.l = i2;
        this.m = i3;
        this.g = f;
        this.h = list;
        this.i = bzzVar2;
        this.j = z;
    }

    @Override // defpackage.can
    public final byc a(bxn bxnVar, cbd cbdVar) {
        return new byi(bxnVar, cbdVar, this);
    }
}
