package defpackage;

import java.util.Iterator;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcko  reason: default package */
/* loaded from: classes5.dex */
public final class dcko extends dcji {
    final /* synthetic */ dckp a;

    public dcko(dckp dckpVar) {
        this.a = dckpVar;
    }

    @Override // defpackage.dcji
    public final Map a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return dcjz.m(this.a.a.J(), new dckn(this));
    }

    @Override // defpackage.dcji, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        dckp dckpVar = this.a;
        dckpVar.a.J().remove(((Map.Entry) obj).getKey());
        return true;
    }
}
