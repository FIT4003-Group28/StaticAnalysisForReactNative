package defpackage;

import android.content.IntentFilter;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.AddListenerRequest;
/* compiled from: PG */
/* renamed from: cphi  reason: default package */
/* loaded from: classes5.dex */
public final class cphi<T> extends cphn<Status> {
    public static final /* synthetic */ int a = 0;
    private T k;
    private cnsd<T> l;
    private final cpjf m;

    /* JADX WARN: Multi-variable type inference failed */
    public cphi(GoogleApiClient googleApiClient, Object obj, cnsd cnsdVar, cpjf cpjfVar) {
        super(googleApiClient);
        cnwc.a(obj);
        this.k = obj;
        cnwc.a(cnsdVar);
        this.l = cnsdVar;
        this.m = cpjfVar;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(cpjw cpjwVar) {
        cpjw cpjwVar2 = cpjwVar;
        cpjf cpjfVar = this.m;
        T t = this.k;
        cnsd cnsdVar = (cnsd<T>) this.l;
        IntentFilter[] intentFilterArr = cpjfVar.a;
        cpja<cpgo> cpjaVar = cpjwVar2.a;
        cpjy<cpgo> cpjyVar = new cpjy<>(intentFilterArr);
        cnwc.a(cnsdVar);
        cpjyVar.a = cnsdVar;
        synchronized (cpjaVar.a) {
            if (cpjaVar.a.get(t) != null) {
                c(new Status(4001));
            } else {
                cpjaVar.a.put(t, cpjyVar);
                try {
                    ((cpiy) cpjwVar2.L()).g(new cpiz(cpjaVar.a, t, this), new AddListenerRequest(cpjyVar));
                } catch (RemoteException e) {
                    cpjaVar.a.remove(t);
                    throw e;
                }
            }
        }
        this.k = null;
        this.l = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ cnom d(Status status) {
        this.k = null;
        this.l = null;
        return status;
    }
}
