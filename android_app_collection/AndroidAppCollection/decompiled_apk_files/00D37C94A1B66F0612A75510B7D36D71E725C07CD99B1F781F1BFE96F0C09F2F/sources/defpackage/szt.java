package defpackage;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.JSController;
import com.google.android.libraries.elements.interfaces.JSEnvironment;
/* compiled from: PG */
/* renamed from: szt  reason: default package */
/* loaded from: classes4.dex */
public final class szt implements tct {
    public final azqb a;
    public final axnm b;
    private final JSEnvironment c;

    public szt(JSEnvironment jSEnvironment, azqb azqbVar, axnm axnmVar) {
        this.c = jSEnvironment;
        this.a = azqbVar;
        this.b = axnmVar;
    }

    @Override // defpackage.tct
    public final aooq a() {
        return awnq.b;
    }

    @Override // defpackage.tct
    public final /* bridge */ /* synthetic */ aynr b(Object obj, final tcs tcsVar) {
        final awnq awnqVar = (awnq) obj;
        final JSController controller = this.c.getController();
        final awon awonVar = tcsVar.e;
        return aynr.j(new aynt() { // from class: szq
            @Override // defpackage.aynt
            public final void a(aysm aysmVar) {
                byte[] bArr;
                szt sztVar = szt.this;
                JSController jSController = controller;
                tcs tcsVar2 = tcsVar;
                awnq awnqVar2 = awnqVar;
                awon awonVar2 = awonVar;
                if (jSController == null) {
                    throw new ted("JavaScript controller is not provided");
                }
                ampq ampqVar = (ampq) sztVar.a.get();
                if (!ampqVar.h()) {
                    throw new ted("ByteStore is not provided");
                }
                final szs szsVar = new szs(aysmVar);
                szn sznVar = new szn((tcu) sztVar.b.get(), tcsVar2);
                byte[] byteArray = awnqVar2.toByteArray();
                if (awonVar2 != null) {
                    bArr = awonVar2.toByteArray();
                } else {
                    bArr = tea.a;
                }
                jSController.executeFunction(byteArray, bArr, (ByteStore) ampqVar.c(), sznVar, szsVar);
                aysmVar.d(new ayqa() { // from class: szr
                    @Override // defpackage.ayqa
                    public final void a() {
                        szs.this.a = null;
                    }
                });
            }
        });
    }

    @Override // defpackage.tct
    public final /* synthetic */ void c() {
    }
}
