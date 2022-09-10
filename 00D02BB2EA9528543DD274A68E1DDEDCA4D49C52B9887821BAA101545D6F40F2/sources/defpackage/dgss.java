package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dgss  reason: default package */
/* loaded from: classes6.dex */
public final class dgss extends dgtl<Number> {
    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ Number a(dgxe dgxeVar) {
        if (dgxeVar.q() == 9) {
            dgxeVar.j();
            return null;
        }
        return Double.valueOf(dgxeVar.k());
    }

    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ void b(dgxg dgxgVar, Number number) {
        Number number2 = number;
        if (number2 == null) {
            dgxgVar.f();
            return;
        }
        dgsx.a(number2.doubleValue());
        dgxgVar.i(number2);
    }
}
