package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcjm  reason: default package */
/* loaded from: classes5.dex */
public final class dcjm extends dcbs<Map.Entry> {
    final /* synthetic */ dcjo a;

    public dcjm(dcjo dcjoVar) {
        this.a = dcjoVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dcbs, defpackage.dcbh
    /* renamed from: a */
    public final Set<Map.Entry> b() {
        return this.a.c;
    }

    @Override // defpackage.dcbh, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return new dcjl(this, this.a.c.iterator());
    }
}
