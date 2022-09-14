package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobstore.DeleteFileRequest;
/* compiled from: PG */
/* renamed from: coto  reason: default package */
/* loaded from: classes5.dex */
final class coto implements cnxk<coty, cpct<Void>> {
    private final DeleteFileRequest a;

    public coto(DeleteFileRequest deleteFileRequest) {
        this.a = deleteFileRequest;
    }

    @Override // defpackage.cnxk
    public final /* bridge */ /* synthetic */ void a(coty cotyVar, cpct<Void> cpctVar) {
        coty cotyVar2 = cotyVar;
        cpct<Void> cpctVar2 = cpctVar;
        try {
            ((cotk) cotyVar2.L()).f(new cotn(cpctVar2), this.a);
        } catch (RemoteException unused) {
            cntf.b(Status.c, null, cpctVar2);
        }
    }
}
