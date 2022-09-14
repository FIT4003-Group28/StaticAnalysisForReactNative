package defpackage;

import java.util.AbstractCollection;
/* compiled from: PG */
/* renamed from: dzhr  reason: default package */
/* loaded from: classes6.dex */
public abstract class dzhr extends AbstractCollection<Float> implements dzhs {
    public boolean a(float f) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final /* bridge */ /* synthetic */ boolean add(Float f) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: b */
    public abstract dzpd iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        return a(((Float) obj).floatValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        float floatValue = ((Float) obj).floatValue();
        dzpd it = iterator();
        while (it.hasNext()) {
            if (floatValue == it.b()) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        dzpd it = iterator();
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
