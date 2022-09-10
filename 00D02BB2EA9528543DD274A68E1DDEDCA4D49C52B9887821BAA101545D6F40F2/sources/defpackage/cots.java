package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobstore.RenameRequest;
/* compiled from: PG */
/* renamed from: cots  reason: default package */
/* loaded from: classes5.dex */
final class cots implements cnxk<coty, cpct<Void>> {
    private final RenameRequest a;

    public cots(RenameRequest renameRequest) {
        this.a = renameRequest;
    }

    @Override // defpackage.cnxk
    public final /* bridge */ /* synthetic */ void a(coty cotyVar, cpct<Void> cpctVar) {
        coty cotyVar2 = cotyVar;
        cpct<Void> cpctVar2 = cpctVar;
        try {
            ((cotk) cotyVar2.L()).g(new cotr(cpctVar2), this.a);
        } catch (RemoteException unused) {
            cntf.b(Status.c, null, cpctVar2);
        }
    }
}
