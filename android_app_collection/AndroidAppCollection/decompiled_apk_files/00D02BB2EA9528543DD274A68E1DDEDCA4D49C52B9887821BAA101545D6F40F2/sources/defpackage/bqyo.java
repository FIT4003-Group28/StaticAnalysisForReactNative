package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bqyo  reason: default package */
/* loaded from: classes4.dex */
public final class bqyo extends bqyh {
    public ArrayList<dmzp> a;
    private final bqxq f;
    private final ArrayList<bqyo> g;
    private final boolean h;
    private final String i;
    private final int j;

    public bqyo(bqxq bqxqVar, akra akraVar, akra akraVar2, boolean z, String str, int i) {
        super(akraVar, akraVar2);
        this.g = new ArrayList<>(1);
        this.a = null;
        this.f = bqxqVar;
        this.h = z;
        this.i = str;
        this.j = i;
    }

    @Override // defpackage.bqyh
    public final List<bqyo> e() {
        if (this.a != null) {
            ArrayList arrayList = new ArrayList(this.g);
            ArrayList<dmzp> arrayList2 = this.a;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                bqyo h = this.f.h(arrayList2.get(i));
                if (h != null) {
                    arrayList.add(h);
                }
            }
            return arrayList;
        }
        return this.g;
    }

    @Override // defpackage.bqyh
    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // defpackage.bqyh
    public final List<? extends bqyo> f() {
        if (this.a != null) {
            ArrayList arrayList = new ArrayList(this.g);
            ArrayList<dmzp> arrayList2 = this.a;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(this.f.h(arrayList2.get(i)));
            }
            return arrayList;
        }
        return this.g;
    }

    @Override // defpackage.bqyh
    public final boolean g() {
        return this.h;
    }

    @Override // defpackage.bqyh
    public final boolean h(bqyh bqyhVar) {
        if (!(bqyhVar instanceof bqyo)) {
            return false;
        }
        bqyo bqyoVar = (bqyo) bqyhVar;
        if (this.h != bqyoVar.h || this.j != bqyoVar.j) {
            return false;
        }
        String str = this.i;
        if (str == null && bqyoVar.i == null) {
            return true;
        }
        return str != null && str.equals(bqyoVar.i);
    }

    @Override // defpackage.bqyh
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(bqyo bqyoVar) {
        this.g.add(bqyoVar);
    }

    public final void n() {
        ArrayList<dmzp> arrayList = this.a;
        if (arrayList != null) {
            arrayList.trimToSize();
        }
        this.g.trimToSize();
    }
}
