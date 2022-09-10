package defpackage;
/* compiled from: PG */
/* renamed from: dgwt  reason: default package */
/* loaded from: classes6.dex */
final class dgwt extends dgtl<Number> {
    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ Number a(dgxe dgxeVar) {
        if (dgxeVar.q() == 9) {
            dgxeVar.j();
            return null;
        }
        try {
            return Short.valueOf((short) dgxeVar.m());
        } catch (NumberFormatException e) {
            throw new dgtj(e);
        }
    }

    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ void b(dgxg dgxgVar, Number number) {
        dgxgVar.i(number);
    }
}
