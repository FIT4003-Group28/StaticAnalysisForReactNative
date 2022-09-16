package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: coiu  reason: default package */
/* loaded from: classes5.dex */
public final class coiu implements cogg {
    private final coif a;

    public coiu(coif coifVar) {
        this.a = coifVar;
    }

    @Override // defpackage.cogg
    public final cpcq<Void> a() {
        cpct cpctVar = new cpct();
        try {
            this.a.j(new coit(cpctVar));
        } catch (RemoteException e) {
            cpctVar.d(new cnob(new Status(8, dbue.g(e))));
        }
        return cpctVar.a;
    }
}
