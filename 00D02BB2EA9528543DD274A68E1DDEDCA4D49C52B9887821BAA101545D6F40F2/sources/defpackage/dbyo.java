package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dbyo  reason: default package */
/* loaded from: classes5.dex */
final class dbyo extends dcld {
    final /* synthetic */ dbyq a;

    public dbyo(dbyq dbyqVar) {
        this.a = dbyqVar;
    }

    @Override // defpackage.dcld
    public final dclb a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.a.c();
    }
}
