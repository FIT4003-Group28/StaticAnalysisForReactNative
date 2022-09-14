package defpackage;

import java.util.AbstractCollection;
/* compiled from: PG */
/* renamed from: dzoh  reason: default package */
/* loaded from: classes6.dex */
public abstract class dzoh<K> extends AbstractCollection<K> implements dzsf<K> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public abstract dzrn<K> iterator();

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        dzrn<K> it = iterator();
        int size = size();
        sb.append("{");
        boolean z = true;
        while (true) {
            int i = size - 1;
            if (size != 0) {
                if (!z) {
                    sb.append(", ");
                }
                K next = it.next();
                if (this == next) {
                    sb.append("(this collection)");
                } else {
                    sb.append(String.valueOf(next));
                }
                size = i;
                z = false;
            } else {
                sb.append("}");
                return sb.toString();
            }
        }
    }
}
