package defpackage;
/* compiled from: PG */
/* renamed from: dgvx  reason: default package */
/* loaded from: classes6.dex */
final class dgvx extends dgtl<Number> {
    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ Number a(dgxe dgxeVar) {
        int q = dgxeVar.q();
        int i = q - 1;
        if (q != 0) {
            if (i == 5 || i == 6) {
                return new dgun(dgxeVar.h());
            }
            if (i == 8) {
                dgxeVar.j();
                return null;
            }
            throw new dgtj("Expecting number, got: " + ((Object) dgxf.a(q)));
        }
        throw null;
    }

    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ void b(dgxg dgxgVar, Number number) {
        dgxgVar.i(number);
    }
}
