package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: coip  reason: default package */
/* loaded from: classes5.dex */
public final class coip implements cogh {
    private final coig a;

    public coip(coig coigVar) {
        this.a = coigVar;
    }

    @Override // defpackage.cogh
    public final cpcq<Void> a() {
        cpct cpctVar = new cpct();
        try {
            this.a.e(new coio(cpctVar));
        } catch (RemoteException e) {
            cpctVar.d(new cnob(new Status(8, dbue.g(e))));
        }
        return cpctVar.a;
    }
}
