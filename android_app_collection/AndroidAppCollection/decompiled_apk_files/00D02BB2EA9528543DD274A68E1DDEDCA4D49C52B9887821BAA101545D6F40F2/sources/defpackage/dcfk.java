package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dcfk  reason: default package */
/* loaded from: classes5.dex */
public final class dcfk extends dcbg {
    final /* synthetic */ Iterable a;

    public dcfk(Iterable iterable) {
        this.a = iterable;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new dcfv(this.a);
    }

    @Override // defpackage.dcbg
    public final String toString() {
        return String.valueOf(this.a.toString()).concat(" (cycled)");
    }
}
