package defpackage;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcfm  reason: default package */
/* loaded from: classes.dex */
public final class dcfm extends dcbg {
    final /* synthetic */ Iterable a;
    final /* synthetic */ dbsl b;

    public dcfm(Iterable iterable, dbsl dbslVar) {
        this.a = iterable;
        this.b = dbslVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return dcgh.i(this.a.iterator(), this.b);
    }
}
