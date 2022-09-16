package defpackage;

import java.util.Collection;
import java.util.Set;
/* compiled from: PG */
/* renamed from: amzq  reason: default package */
/* loaded from: classes.dex */
final class amzq extends amtg implements Set {
    final Collection a;

    public amzq(Collection collection) {
        this.a = collection;
    }

    @Override // defpackage.amtg
    protected final Collection b() {
        return this.a;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return amyv.j(this, obj);
    }

    @Override // defpackage.amtg, defpackage.amtj
    protected final /* bridge */ /* synthetic */ Object g() {
        return this.a;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return amyv.b(this);
    }
}
