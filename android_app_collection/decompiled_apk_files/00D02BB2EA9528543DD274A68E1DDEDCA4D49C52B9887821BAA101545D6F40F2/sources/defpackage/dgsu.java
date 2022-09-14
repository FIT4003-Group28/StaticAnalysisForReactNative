package defpackage;

import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: dgsu  reason: default package */
/* loaded from: classes6.dex */
final class dgsu extends dgtl<AtomicLong> {
    final /* synthetic */ dgtl a;

    public dgsu(dgtl dgtlVar) {
        this.a = dgtlVar;
    }

    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ AtomicLong a(dgxe dgxeVar) {
        return new AtomicLong(((Number) this.a.a(dgxeVar)).longValue());
    }

    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ void b(dgxg dgxgVar, AtomicLong atomicLong) {
        this.a.b(dgxgVar, Long.valueOf(atomicLong.get()));
    }
}
