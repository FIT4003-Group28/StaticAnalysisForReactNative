package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: csir  reason: default package */
/* loaded from: classes5.dex */
public final class csir implements csgc, csio {
    public final ddxz a;
    public final List<cshb> b;
    public final csgw c;
    public final long d;

    public csir(ddxz ddxzVar, List<cshb> list, csgw csgwVar, long j) {
        this.a = ddxzVar;
        this.b = list;
        this.c = csgwVar;
        this.d = j;
    }

    @Override // defpackage.csio
    public final List<cshb> a() {
        return this.b;
    }

    @Override // defpackage.csio
    public final cshb b() {
        return csin.b(this);
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        ddxx ddxxVar = csin.b(this).c;
        if (ddxxVar == null) {
            ddxxVar = ddxx.j;
        }
        b.f("rootVeId", ddxxVar.d);
        ddxx ddxxVar2 = csin.a(this).c;
        if (ddxxVar2 == null) {
            ddxxVar2 = ddxx.j;
        }
        b.f("targetVeId", ddxxVar2.d);
        return b.toString();
    }
}
