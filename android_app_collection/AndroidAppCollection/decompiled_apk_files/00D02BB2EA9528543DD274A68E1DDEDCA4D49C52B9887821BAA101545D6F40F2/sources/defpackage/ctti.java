package defpackage;
/* compiled from: PG */
/* renamed from: ctti  reason: default package */
/* loaded from: classes5.dex */
final class ctti implements dyhp<dxwm> {
    @Override // defpackage.dyhp
    public final /* bridge */ /* synthetic */ dxwm a(byte[] bArr) {
        try {
            return (dxwm) dsqw.cr(dxwm.b, bArr, dsqa.c());
        } catch (dsrm unused) {
            cstl.a("RpcErrorUtils");
            return dxwm.b;
        }
    }

    @Override // defpackage.dyhp
    public final /* bridge */ /* synthetic */ byte[] b(dxwm dxwmVar) {
        return dxwmVar.bS();
    }
}
