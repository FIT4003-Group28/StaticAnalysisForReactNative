package defpackage;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dmuq  reason: default package */
/* loaded from: classes.dex */
public final class dmuq implements Iterable<dmum> {
    final /* synthetic */ dmut a;

    public dmuq(dmut dmutVar) {
        this.a = dmutVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<dmum> iterator() {
        dmvv<dmum> dmvvVar = this.a.d;
        ((dmup) dmvvVar).a = 0;
        return dmvvVar;
    }
}
