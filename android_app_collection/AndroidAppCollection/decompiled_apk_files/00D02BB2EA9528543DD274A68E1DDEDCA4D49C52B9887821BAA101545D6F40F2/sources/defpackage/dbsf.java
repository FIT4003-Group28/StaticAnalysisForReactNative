package defpackage;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbsf  reason: default package */
/* loaded from: classes5.dex */
public final class dbsf implements Iterable {
    final /* synthetic */ Iterable a;

    public dbsf(Iterable iterable) {
        this.a = iterable;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new dbse(this);
    }
}
