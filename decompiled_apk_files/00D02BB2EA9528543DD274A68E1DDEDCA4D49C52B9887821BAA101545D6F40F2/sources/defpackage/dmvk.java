package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dmvk  reason: default package */
/* loaded from: classes.dex */
final class dmvk implements Iterable<dmum> {
    final /* synthetic */ dmvl a;

    public dmvk(dmvl dmvlVar) {
        this.a = dmvlVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<dmum> iterator() {
        dmvv<dmum> dmvvVar = this.a.c;
        ((dmvj) dmvvVar).a = 0;
        return dmvvVar;
    }
}
