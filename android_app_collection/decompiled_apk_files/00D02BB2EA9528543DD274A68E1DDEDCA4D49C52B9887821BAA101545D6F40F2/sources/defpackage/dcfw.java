package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dcfw  reason: default package */
/* loaded from: classes5.dex */
final class dcfw extends dcpd<List> {
    final /* synthetic */ Iterator a;

    public dcfw(Iterator it) {
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            Object[] objArr = new Object[500];
            int i = 0;
            while (i < 500 && this.a.hasNext()) {
                objArr[i] = this.a.next();
                i++;
            }
            for (int i2 = i; i2 < 500; i2++) {
                objArr[i2] = null;
            }
            List unmodifiableList = Collections.unmodifiableList(Arrays.asList(objArr));
            return i == 500 ? unmodifiableList : unmodifiableList.subList(0, i);
        }
        throw new NoSuchElementException();
    }
}
