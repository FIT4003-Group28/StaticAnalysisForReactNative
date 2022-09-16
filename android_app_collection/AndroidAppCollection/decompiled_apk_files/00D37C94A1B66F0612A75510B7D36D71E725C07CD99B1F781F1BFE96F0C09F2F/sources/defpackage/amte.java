package defpackage;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amte  reason: default package */
/* loaded from: classes.dex */
public final class amte extends amtf {
    final /* synthetic */ Iterable[] a;

    public amte(Iterable[] iterableArr) {
        this.a = iterableArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new amwd(new amtd(this));
    }
}
