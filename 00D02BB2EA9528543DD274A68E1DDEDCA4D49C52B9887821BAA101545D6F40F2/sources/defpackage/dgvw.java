package defpackage;
/* compiled from: PG */
/* renamed from: dgvw  reason: default package */
/* loaded from: classes6.dex */
final class dgvw extends dgtl<Number> {
    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ Number a(dgxe dgxeVar) {
        if (dgxeVar.q() == 9) {
            dgxeVar.j();
            return null;
        }
        try {
            return Long.valueOf(dgxeVar.l());
        } catch (NumberFormatException e) {
            throw new dgtj(e);
        }
    }

    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ void b(dgxg dgxgVar, Number number) {
        dgxgVar.i(number);
    }
}
