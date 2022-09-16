package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: aori  reason: default package */
/* loaded from: classes.dex */
final class aori extends aonv {
    final aorj a;
    aonx b = b();
    final /* synthetic */ aorl c;

    public aori(aorl aorlVar) {
        this.c = aorlVar;
        this.a = new aorj(aorlVar);
    }

    private final aonx b() {
        if (this.a.hasNext()) {
            return this.a.mo416next().iterator();
        }
        return null;
    }

    @Override // j$.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // defpackage.aonx
    public final byte a() {
        aonx aonxVar = this.b;
        if (aonxVar == null) {
            throw new NoSuchElementException();
        }
        byte a = aonxVar.a();
        if (!this.b.hasNext()) {
            this.b = b();
        }
        return a;
    }
}
