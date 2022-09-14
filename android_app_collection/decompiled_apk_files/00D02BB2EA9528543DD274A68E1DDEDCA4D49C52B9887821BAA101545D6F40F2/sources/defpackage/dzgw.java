package defpackage;

import java.util.AbstractCollection;
/* compiled from: PG */
/* renamed from: dzgw  reason: default package */
/* loaded from: classes6.dex */
public abstract class dzgw extends AbstractCollection<Boolean> implements dzgz {
    public boolean a(boolean z) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final /* bridge */ /* synthetic */ boolean add(Boolean bool) {
        bool.booleanValue();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: b */
    public abstract dzos iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        return a(((Boolean) obj).booleanValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        dzos it = iterator();
        while (it.hasNext()) {
            if (booleanValue == it.b()) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        dzos it = iterator();
        int size = size();
        sb.append("{");
        boolean z = true;
        while (true) {
            int i = size - 1;
            if (size != 0) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(String.valueOf(it.b()));
                z = false;
                size = i;
            } else {
                sb.append("}");
                return sb.toString();
            }
        }
    }
}
