package defpackage;
/* compiled from: PG */
/* renamed from: crzu  reason: default package */
/* loaded from: classes.dex */
final class crzu<V> implements dbty<V> {
    V a;

    public crzu(V v) {
        this.a = v;
    }

    @Override // defpackage.dbty
    public final synchronized V a() {
        return this.a;
    }

    public final synchronized void b(V v) {
        this.a = v;
    }
}
