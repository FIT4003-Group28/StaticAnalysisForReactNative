package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: dgww  reason: default package */
/* loaded from: classes6.dex */
final class dgww extends dgtl<AtomicBoolean> {
    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ AtomicBoolean a(dgxe dgxeVar) {
        return new AtomicBoolean(dgxeVar.i());
    }

    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ void b(dgxg dgxgVar, AtomicBoolean atomicBoolean) {
        dgxgVar.k(atomicBoolean.get());
    }
}
