package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: amvv  reason: default package */
/* loaded from: classes.dex */
public final class amvv extends amtf {
    final /* synthetic */ Iterable a;
    final /* synthetic */ ampg b;

    public amvv(Iterable iterable, ampg ampgVar) {
        this.a = iterable;
        this.b = ampgVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return arey.l(this.a.iterator(), this.b);
    }
}
