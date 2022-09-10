package defpackage;

import defpackage.acl;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: tj  reason: default package */
/* loaded from: classes7.dex */
public abstract class tj<T, VH extends acl> extends abg<VH> {
    public final th<T> a;
    private final ti e;

    /* JADX INFO: Access modifiers changed from: protected */
    public tj(tc<T> tcVar) {
        ti tiVar = new ti();
        this.e = tiVar;
        th<T> thVar = new th<>(new tm(this), tcVar);
        this.a = thVar;
        thVar.a(tiVar);
    }

    public void a(List<T> list) {
        th<T> thVar = this.a;
        int i = thVar.f + 1;
        thVar.f = i;
        List<T> list2 = thVar.d;
        if (list == list2) {
            return;
        }
        List<T> list3 = thVar.e;
        if (list == null) {
            int size = list2.size();
            thVar.d = null;
            thVar.e = Collections.emptyList();
            thVar.a.b(0, size);
            thVar.b();
        } else if (list2 == null) {
            thVar.d = list;
            thVar.e = Collections.unmodifiableList(list);
            thVar.a.a(0, list.size());
            thVar.b();
        } else {
            thVar.b.a.execute(new tf(thVar, list2, list, i));
        }
    }

    public final T b(int i) {
        return this.a.e.get(i);
    }

    @Override // defpackage.abg
    public final int c() {
        return this.a.e.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public tj(tt<T> ttVar) {
        ti tiVar = new ti();
        this.e = tiVar;
        th<T> thVar = new th<>(new tm(this), new tb(ttVar).a());
        this.a = thVar;
        thVar.a(tiVar);
    }
}
