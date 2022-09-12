package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: alds  reason: default package */
/* loaded from: classes2.dex */
public final class alds implements Iterable<aldp> {
    public final List<aldp> a;

    public alds(List<aldp> list) {
        this.a = list;
    }

    @Override // java.lang.Iterable
    public final Iterator<aldp> iterator() {
        return this.a.iterator();
    }
}
