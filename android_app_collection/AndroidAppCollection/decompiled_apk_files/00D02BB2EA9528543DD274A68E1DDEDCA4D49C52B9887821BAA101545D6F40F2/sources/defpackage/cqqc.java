package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqqc  reason: default package */
/* loaded from: classes.dex */
public final class cqqc<K> implements cqqb<K> {
    public K a;

    public final void a() {
        this.a = null;
    }

    public final boolean equals(@dzsi Object obj) {
        return this == obj || ((obj instanceof cqqb) && cqqe.a(this, (cqqb) obj));
    }

    @Override // defpackage.cqqb
    @dzsi
    public final K get() {
        return this.a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }
}
