package defpackage;

import defpackage.agxb;
/* compiled from: PG */
/* renamed from: agxa  reason: default package */
/* loaded from: classes2.dex */
public final class agxa<V extends agxb> {
    public final agwz<V> a;
    public final V b;

    public agxa(agwz<V> agwzVar, V v) {
        this.a = agwzVar;
        this.b = v;
    }

    public static <V extends agxb> agxa<V> a(agwz<V> agwzVar, V v) {
        return new agxa<>(agwzVar, v);
    }
}
