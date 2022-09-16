package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahpo  reason: default package */
/* loaded from: classes.dex */
public final class ahpo implements ahjt {
    final /* synthetic */ ahni a;
    final /* synthetic */ ahof b;

    public ahpo(ahni ahniVar, ahof ahofVar) {
        this.a = ahniVar;
        this.b = ahofVar;
    }

    @Override // defpackage.ahjt
    public final void a() {
        ahni ahniVar = this.a;
        boolean z = !ahniVar.h;
        ahniVar.h = z;
        ahof ahofVar = this.b;
        ahofVar.g = z;
        ahmt ahmtVar = ahofVar.b;
        if (ahmtVar.o != z) {
            ahmtVar.o = z;
            if (ahmtVar.n && (ahmtVar.h == aanv.RECTANGULAR_3D || ahmtVar.h == aanv.RECTANGULAR_2D)) {
                ahmtVar.g();
            }
        }
        ahofVar.p();
    }
}
