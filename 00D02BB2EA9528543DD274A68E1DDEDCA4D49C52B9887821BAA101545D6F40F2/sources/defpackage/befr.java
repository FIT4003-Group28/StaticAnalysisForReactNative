package defpackage;

import defpackage.bega;
/* compiled from: PG */
/* renamed from: befr  reason: default package */
/* loaded from: classes3.dex */
public abstract class befr<T extends bega> implements befz<T> {
    public final T a;
    private final int b;
    private final int c;

    /* JADX INFO: Access modifiers changed from: protected */
    public befr(T t, int i, int i2) {
        this.a = t;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.befz
    public void b(cqiv cqivVar) {
    }

    @Override // defpackage.befz
    public final T c() {
        return this.a;
    }

    @Override // defpackage.befz
    public boolean d() {
        return false;
    }

    @Override // defpackage.befz
    public final int e() {
        return this.b;
    }

    @Override // defpackage.befz
    public final int f() {
        return this.c;
    }
}
