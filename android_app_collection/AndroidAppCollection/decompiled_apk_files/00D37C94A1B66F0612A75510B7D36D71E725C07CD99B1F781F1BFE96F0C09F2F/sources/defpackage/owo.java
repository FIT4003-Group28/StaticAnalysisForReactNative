package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: owo  reason: default package */
/* loaded from: classes4.dex */
public final class owo extends own {
    final List d;

    public owo(owj owjVar, long j, long j2, int i, long j3, List list, List list2) {
        super(owjVar, j, j2, i, j3, list);
        this.d = list2;
    }

    @Override // defpackage.own
    public final int a(long j) {
        return (this.a + this.d.size()) - 1;
    }

    @Override // defpackage.own
    public final owj c(owm owmVar, int i) {
        return (owj) this.d.get(i - this.a);
    }

    @Override // defpackage.own
    public final boolean d() {
        return true;
    }
}
