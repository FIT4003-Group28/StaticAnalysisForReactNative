package defpackage;

import java.util.Collections;
/* compiled from: PG */
/* renamed from: blr  reason: default package */
/* loaded from: classes3.dex */
public final class blr<K, A> extends blc<K, A> {
    private final A e;

    public blr(bpv<A> bpvVar) {
        this(bpvVar, null);
    }

    @Override // defpackage.blc
    public final void c() {
        if (this.d != null) {
            super.c();
        }
    }

    @Override // defpackage.blc
    public final float g() {
        return 1.0f;
    }

    @Override // defpackage.blc
    public final A h() {
        return this.d.b(this.e);
    }

    @Override // defpackage.blc
    public final A i(bpt<K> bptVar, float f) {
        return h();
    }

    public blr(bpv<A> bpvVar, A a) {
        super(Collections.emptyList());
        this.d = bpvVar;
        this.e = a;
    }
}
