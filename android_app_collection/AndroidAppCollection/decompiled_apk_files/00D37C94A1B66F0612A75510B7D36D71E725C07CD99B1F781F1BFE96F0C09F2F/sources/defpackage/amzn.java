package defpackage;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amzn  reason: default package */
/* loaded from: classes.dex */
public final class amzn extends amwx {
    final Iterable a;
    final /* synthetic */ amzp b;

    public amzn(amzp amzpVar, Iterable iterable) {
        this.b = amzpVar;
        this.a = iterable;
    }

    @Override // defpackage.amwx
    public final Iterator a() {
        return this.a.iterator();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj instanceof amxt) {
            amxt amxtVar = (amxt) obj;
            amzo amzoVar = (amzo) this.b.a.get(amxtVar.b);
            if (amzoVar != null && amzoVar.a.equals(amxtVar)) {
                return amzoVar.b;
            }
            return null;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.b.a.size();
    }
}
