package defpackage;

import java.util.AbstractCollection;
/* compiled from: PG */
/* renamed from: dzia  reason: default package */
/* loaded from: classes6.dex */
public abstract class dzia extends AbstractCollection<Integer> implements dzkc {
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public abstract dzkd iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final /* bridge */ /* synthetic */ boolean add(Integer num) {
        return b(num.intValue());
    }

    public boolean b(int i) {
        throw new UnsupportedOperationException();
    }

    public boolean c(int i) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        return c(((Integer) obj).intValue());
    }

    public boolean d(int i) {
        dzkd it = iterator();
        while (it.hasNext()) {
            if (i == it.a()) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        return d(((Integer) obj).intValue());
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb = new StringBuilder();
        dzkd it = iterator();
        int size = size();
        sb.append("{");
        boolean z = true;
        while (true) {
            int i = size - 1;
            if (size != 0) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(String.valueOf(it.a()));
                z = false;
                size = i;
            } else {
                sb.append("}");
                return sb.toString();
            }
        }
    }
}
