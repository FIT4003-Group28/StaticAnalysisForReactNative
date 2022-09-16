package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dssx  reason: default package */
/* loaded from: classes6.dex */
final class dssx extends dsot {
    final dssz a;
    dsox b = b();
    final /* synthetic */ dstb c;

    public dssx(dstb dstbVar) {
        this.c = dstbVar;
        this.a = new dssz(dstbVar);
    }

    private final dsox b() {
        if (this.a.hasNext()) {
            return this.a.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // defpackage.dsox
    public final byte a() {
        dsox dsoxVar = this.b;
        if (dsoxVar == null) {
            throw new NoSuchElementException();
        }
        byte a = dsoxVar.a();
        if (!this.b.hasNext()) {
            this.b = b();
        }
        return a;
    }
}
