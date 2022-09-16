package defpackage;

import java.util.Queue;
/* compiled from: PG */
/* renamed from: amwk  reason: default package */
/* loaded from: classes2.dex */
final class amwk implements amwf {
    private final Queue<alyh> a;
    private final int b;

    public amwk(Queue<alyh> queue) {
        this.a = queue;
        this.b = queue.size();
    }

    @Override // defpackage.amwf
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.alyi
    @dzsi
    public final alyh b() {
        return this.a.poll();
    }

    @Override // defpackage.amwf
    public final int c() {
        return this.b;
    }
}
