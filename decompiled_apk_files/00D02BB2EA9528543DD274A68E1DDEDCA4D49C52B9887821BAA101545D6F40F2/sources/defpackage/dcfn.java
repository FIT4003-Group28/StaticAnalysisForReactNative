package defpackage;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcfn  reason: default package */
/* loaded from: classes.dex */
public final class dcfn extends dcbg {
    final /* synthetic */ Iterable a;
    final /* synthetic */ dbrn b;

    public dcfn(Iterable iterable, dbrn dbrnVar) {
        this.a = iterable;
        this.b = dbrnVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return dcgh.l(this.a.iterator(), this.b);
    }
}
