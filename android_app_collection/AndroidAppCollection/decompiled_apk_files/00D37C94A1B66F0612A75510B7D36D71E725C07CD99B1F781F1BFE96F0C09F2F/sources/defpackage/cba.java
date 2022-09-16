package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cba  reason: default package */
/* loaded from: classes2.dex */
public final class cba implements can {
    public final String a;
    public final bzz b;
    public final List c;
    public final bzy d;
    public final cab e;
    public final bzz f;
    public final float g;
    public final boolean h;
    public final int i;
    public final int j;

    public cba(String str, bzz bzzVar, List list, bzy bzyVar, cab cabVar, bzz bzzVar2, int i, int i2, float f, boolean z) {
        this.a = str;
        this.b = bzzVar;
        this.c = list;
        this.d = bzyVar;
        this.e = cabVar;
        this.f = bzzVar2;
        this.i = i;
        this.j = i2;
        this.g = f;
        this.h = z;
    }

    @Override // defpackage.can
    public final byc a(bxn bxnVar, cbd cbdVar) {
        return new byr(bxnVar, cbdVar, this);
    }
}
