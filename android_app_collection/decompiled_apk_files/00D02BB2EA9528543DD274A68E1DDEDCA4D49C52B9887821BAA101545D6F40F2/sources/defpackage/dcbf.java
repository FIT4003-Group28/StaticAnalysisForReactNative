package defpackage;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcbf  reason: default package */
/* loaded from: classes.dex */
public final class dcbf extends dcbg {
    final /* synthetic */ Iterable[] a;

    public dcbf(Iterable[] iterableArr) {
        this.a = iterableArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return dcgh.h(new dcbe(this, this.a.length));
    }
}
