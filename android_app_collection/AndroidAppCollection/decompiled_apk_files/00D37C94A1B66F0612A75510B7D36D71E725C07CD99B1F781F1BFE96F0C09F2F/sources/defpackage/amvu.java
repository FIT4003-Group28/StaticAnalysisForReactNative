package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: amvu  reason: default package */
/* loaded from: classes.dex */
public final class amvu extends amtf {
    final /* synthetic */ Iterable a;
    final /* synthetic */ ampt b;

    public amvu(Iterable iterable, ampt amptVar) {
        this.a = iterable;
        this.b = amptVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return arey.i(this.a.iterator(), this.b);
    }
}
