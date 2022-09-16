package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobstore.OpenFileDescriptorRequest;
import com.google.android.gms.mobstore.OpenFileDescriptorResponse;
/* compiled from: PG */
/* renamed from: cotq  reason: default package */
/* loaded from: classes5.dex */
final class cotq implements cnxk<coty, cpct<OpenFileDescriptorResponse>> {
    private final OpenFileDescriptorRequest a;

    public cotq(OpenFileDescriptorRequest openFileDescriptorRequest) {
        this.a = openFileDescriptorRequest;
    }

    @Override // defpackage.cnxk
    public final /* bridge */ /* synthetic */ void a(coty cotyVar, cpct<OpenFileDescriptorResponse> cpctVar) {
        coty cotyVar2 = cotyVar;
        cpct<OpenFileDescriptorResponse> cpctVar2 = cpctVar;
        try {
            ((cotk) cotyVar2.L()).e(new cotp(cpctVar2), this.a);
        } catch (RemoteException unused) {
            cntf.b(Status.c, null, cpctVar2);
        }
    }
}
