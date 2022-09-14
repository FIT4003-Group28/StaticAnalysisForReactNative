package defpackage;
/* compiled from: PG */
/* renamed from: dgwu  reason: default package */
/* loaded from: classes6.dex */
final class dgwu extends dgtl<Number> {
    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ Number a(dgxe dgxeVar) {
        if (dgxeVar.q() == 9) {
            dgxeVar.j();
            return null;
        }
        try {
            return Integer.valueOf(dgxeVar.m());
        } catch (NumberFormatException e) {
            throw new dgtj(e);
        }
    }

    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ void b(dgxg dgxgVar, Number number) {
        dgxgVar.i(number);
    }
}
