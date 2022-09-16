package defpackage;

import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: csiq  reason: default package */
/* loaded from: classes5.dex */
public final class csiq implements csgc, csio {
    public final ddxz a;
    public final List<csip> b;
    public final List<cshb> c;
    public final SparseIntArray d;
    private final dcdc<cshb> e;

    public csiq(ddxz ddxzVar, List<csip> list, List<cshb> list2, SparseIntArray sparseIntArray, List<cshb> list3, SparseIntArray sparseIntArray2) {
        this.a = ddxzVar;
        this.b = Collections.unmodifiableList(list);
        this.c = Collections.unmodifiableList(list2);
        this.d = sparseIntArray;
        Collections.unmodifiableList(list3);
        boolean z = true;
        dbsk.b(!list.isEmpty(), "Must have at least one graft");
        dbsk.b((list2.size() == sparseIntArray.size() && list3.size() == sparseIntArray2.size()) ? z : false, "All children must have a parent specified.");
        this.e = dcdc.f(csin.b(list.iterator().next()));
        for (csip csipVar : list) {
            dbsk.a(csin.b(csipVar).equals(this.e.get(0)));
        }
    }

    @Override // defpackage.csio
    public final List<cshb> a() {
        return this.e;
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
