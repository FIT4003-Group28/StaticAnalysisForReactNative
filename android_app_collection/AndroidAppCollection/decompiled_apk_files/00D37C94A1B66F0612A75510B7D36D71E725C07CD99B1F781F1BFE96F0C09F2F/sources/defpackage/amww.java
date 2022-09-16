package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: amww  reason: default package */
/* loaded from: classes.dex */
final class amww extends amwv {
    final /* synthetic */ amwx a;

    public amww(amwx amwxVar) {
        this.a = amwxVar;
    }

    @Override // defpackage.amwv
    public final Map a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.a.a();
    }
}
