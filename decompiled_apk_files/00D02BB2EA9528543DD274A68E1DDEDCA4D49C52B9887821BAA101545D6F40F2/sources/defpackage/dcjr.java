package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcjr  reason: default package */
/* loaded from: classes5.dex */
final class dcjr extends dcji {
    final /* synthetic */ dcjs a;

    public dcjr(dcjs dcjsVar) {
        this.a = dcjsVar;
    }

    @Override // defpackage.dcji
    public final Map a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return this.a.a();
    }
}
