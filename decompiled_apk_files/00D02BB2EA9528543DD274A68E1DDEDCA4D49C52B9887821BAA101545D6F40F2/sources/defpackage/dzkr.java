package defpackage;

import java.util.AbstractCollection;
/* compiled from: PG */
/* renamed from: dzkr  reason: default package */
/* loaded from: classes6.dex */
public abstract class dzkr extends AbstractCollection<Long> implements dzmy {
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public abstract dzna iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final /* bridge */ /* synthetic */ boolean add(Long l) {
        return b(l.longValue());
    }

    @Override // defpackage.dzmy
    public boolean b(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dzmy
    public boolean c(long j) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        return c(((Long) obj).longValue());
    }

    public boolean d(long j) {
        dzna it = iterator();
        while (it.hasNext()) {
            if (j == it.b()) {
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
        return d(((Long) obj).longValue());
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb = new StringBuilder();
        dzna it = iterator();
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
