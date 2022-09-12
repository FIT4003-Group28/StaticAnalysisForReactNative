package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: dgwv  reason: default package */
/* loaded from: classes6.dex */
final class dgwv extends dgtl<AtomicInteger> {
    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ AtomicInteger a(dgxe dgxeVar) {
        try {
            return new AtomicInteger(dgxeVar.m());
        } catch (NumberFormatException e) {
            throw new dgtj(e);
        }
    }

    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ void b(dgxg dgxgVar, AtomicInteger atomicInteger) {
        dgxgVar.g(atomicInteger.get());
    }
}
