package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dmus  reason: default package */
/* loaded from: classes6.dex */
public final class dmus implements Iterable<dmuo> {
    final /* synthetic */ dmut a;

    public dmus(dmut dmutVar) {
        this.a = dmutVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<dmuo> iterator() {
        dmvv<dmuo> dmvvVar = this.a.e;
        ((dmur) dmvvVar).a = 0;
        return dmvvVar;
    }
}
