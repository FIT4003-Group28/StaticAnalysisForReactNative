package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dzos  reason: default package */
/* loaded from: classes6.dex */
public final class dzos extends dzor implements Iterator {
    final /* synthetic */ dzot a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzos(dzot dzotVar) {
        super(dzotVar);
        this.a = dzotVar;
    }

    public final boolean b() {
        return this.a.b[a()];
    }

    @Override // java.util.Iterator
    @Deprecated
    public final /* bridge */ /* synthetic */ Object next() {
        return Boolean.valueOf(this.a.b[a()]);
    }
}
