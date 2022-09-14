package defpackage;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzsa  reason: default package */
/* loaded from: classes6.dex */
public final class dzsa extends dzoc<dzof> implements dzrv {
    final /* synthetic */ dzsb a;

    public dzsa(dzsb dzsbVar) {
        this.a = dzsbVar;
    }

    @Override // defpackage.dzoc, defpackage.dznw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a */
    public final dzrn<dzof> iterator() {
        return new dzrz(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        return this.a.containsKey(key) && this.a.get(key) == entry.getValue();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int c = this.a.c(key);
        if (c != -1) {
            dzsb dzsbVar = this.a;
            if (value == dzsbVar.b[c]) {
                int i = (dzsbVar.c - c) - 1;
                Object[] objArr = dzsbVar.a;
                int i2 = c + 1;
                System.arraycopy(objArr, i2, objArr, c, i);
                Object[] objArr2 = this.a.b;
                System.arraycopy(objArr2, i2, objArr2, c, i);
                dzsb.f(this.a);
                dzsb dzsbVar2 = this.a;
                Object[] objArr3 = dzsbVar2.a;
                int i3 = dzsbVar2.c;
                objArr3[i3] = null;
                dzsbVar2.b[i3] = null;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.c;
    }
}
