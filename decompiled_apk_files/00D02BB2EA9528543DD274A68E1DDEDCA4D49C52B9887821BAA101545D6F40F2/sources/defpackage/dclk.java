package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dclk  reason: default package */
/* loaded from: classes5.dex */
final class dclk extends dcbs<Map.Entry> {
    final /* synthetic */ dclm a;

    public dclk(dclm dclmVar) {
        this.a = dclmVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dcbs, defpackage.dcbh
    /* renamed from: a */
    public final Set<Map.Entry> b() {
        return this.a.a.entrySet();
    }

    @Override // defpackage.dcbh, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return new dclj(b().iterator());
    }

    @Override // defpackage.dcbh, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return e();
    }

    @Override // defpackage.dcbh, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) dclq.e(this, tArr);
    }
}
