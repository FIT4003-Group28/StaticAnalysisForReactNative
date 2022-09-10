package defpackage;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcbd  reason: default package */
/* loaded from: classes5.dex */
public final class dcbd extends dcbg {
    final /* synthetic */ Iterable a;

    public dcbd(Iterable iterable) {
        this.a = iterable;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return dcgh.h(dcgh.l(this.a.iterator(), dcft.x()));
    }
}
