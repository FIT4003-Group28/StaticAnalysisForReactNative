package defpackage;

import java.util.AbstractList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aops  reason: default package */
/* loaded from: classes.dex */
public final class aops extends AbstractList {
    private final List a;
    private final aopr b;

    public aops(List list, aopr aoprVar) {
        this.a = list;
        this.b = aoprVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.b.convert(this.a.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
