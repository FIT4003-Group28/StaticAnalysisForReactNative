package defpackage;

import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: PG */
/* renamed from: yrd  reason: default package */
/* loaded from: classes4.dex */
public final class yrd {
    private final yrh a;
    private long b = 0;

    public yrd(yrh yrhVar) {
        new CopyOnWriteArraySet();
        this.a = yrhVar;
    }

    public final synchronized void a(long j) {
        this.b = j;
    }

    public final boolean b() {
        return this.b == 0 || this.a.a() < this.b;
    }
}
