package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: azdo  reason: default package */
/* loaded from: classes2.dex */
public final class azdo implements Iterable {
    final ayok a;
    final int b;

    public azdo(ayok ayokVar, int i) {
        this.a = ayokVar;
        this.b = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        azdn azdnVar = new azdn(this.b);
        this.a.az(azdnVar);
        return azdnVar;
    }
}
