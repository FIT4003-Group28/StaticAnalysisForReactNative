package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dzpd  reason: default package */
/* loaded from: classes6.dex */
public final class dzpd extends dzpc implements Iterator {
    final /* synthetic */ dzpe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzpd(dzpe dzpeVar) {
        super(dzpeVar);
        this.a = dzpeVar;
    }

    public final float b() {
        return this.a.b[a()];
    }

    @Override // java.util.Iterator
    @Deprecated
    public final /* bridge */ /* synthetic */ Object next() {
        return Float.valueOf(this.a.b[a()]);
    }
}
