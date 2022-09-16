package defpackage;

import android.util.SparseIntArray;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: tni  reason: default package */
/* loaded from: classes4.dex */
public final class tni implements tlp, tng {
    private final angg a;
    private final List b;
    private final List c;
    private final SparseIntArray d;
    private final List e;
    private final SparseIntArray f;
    private final amuk g;

    public tni(angg anggVar, List list, List list2, SparseIntArray sparseIntArray, List list3, SparseIntArray sparseIntArray2) {
        this.a = anggVar;
        this.b = Collections.unmodifiableList(list);
        this.c = Collections.unmodifiableList(list2);
        this.d = sparseIntArray;
        this.e = Collections.unmodifiableList(list3);
        this.f = sparseIntArray2;
        boolean z = true;
        aqxo.q(!list.isEmpty(), "Must have at least one graft");
        aqxo.q((list2.size() == sparseIntArray.size() && list3.size() == sparseIntArray2.size()) ? z : false, "All children must have a parent specified.");
        this.g = amuk.r(tnk.d((tnh) list.get(0)));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aqxo.p(tnk.d((tnh) it.next()).equals(this.g.get(0)));
        }
    }

    @Override // defpackage.tng
    public /* synthetic */ tmh a() {
        return tnk.d(this);
    }

    @Override // defpackage.tng
    public List b() {
        return this.g;
    }

    public SparseIntArray c() {
        return this.d;
    }

    public /* synthetic */ tmh d() {
        return tnk.e(this);
    }

    public angg e() {
        return this.a;
    }

    public List f() {
        return this.b;
    }

    public List g() {
        return this.c;
    }

    public String toString() {
        ampp c = akzj.c(this);
        angf angfVar = a().d;
        if (angfVar == null) {
            angfVar = angf.a;
        }
        c.e("rootVeId", angfVar.d);
        angf angfVar2 = d().d;
        if (angfVar2 == null) {
            angfVar2 = angf.a;
        }
        c.e("targetVeId", angfVar2.d);
        return c.toString();
    }
}
