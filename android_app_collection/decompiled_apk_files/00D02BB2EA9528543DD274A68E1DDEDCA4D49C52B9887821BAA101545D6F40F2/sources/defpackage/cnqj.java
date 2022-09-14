package defpackage;

import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cnqj  reason: default package */
/* loaded from: classes.dex */
final class cnqj extends cnqo {
    final /* synthetic */ cnqp a;
    private final Map<cnnz, cnqg> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnqj(cnqp cnqpVar, Map<cnnz, cnqg> map) {
        super(cnqpVar);
        this.a = cnqpVar;
        this.c = map;
    }

    @Override // defpackage.cnqo
    public final void a() {
        coza cozaVar;
        cnvi cnviVar = new cnvi(this.a.d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (cnnz cnnzVar : this.c.keySet()) {
            if (!cnnzVar.t() || this.c.get(cnnzVar).a) {
                arrayList2.add(cnnzVar);
            } else {
                arrayList.add(cnnzVar);
            }
        }
        int i = -1;
        int i2 = 0;
        if (arrayList.isEmpty()) {
            int size = arrayList2.size();
            while (i2 < size) {
                i = cnviVar.a(this.a.c, (cnnz) arrayList2.get(i2));
                i2++;
                if (i == 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList.size();
            while (i2 < size2) {
                i = cnviVar.a(this.a.c, (cnnz) arrayList.get(i2));
                i2++;
                if (i != 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            ConnectionResult connectionResult = new ConnectionResult(i, null);
            cnqp cnqpVar = this.a;
            cnqpVar.a.o(new cnqh(this, cnqpVar, connectionResult));
            return;
        }
        cnqp cnqpVar2 = this.a;
        if (cnqpVar2.f && (cozaVar = cnqpVar2.e) != null) {
            cozaVar.g();
        }
        for (cnnz cnnzVar2 : this.c.keySet()) {
            cnqg cnqgVar = this.c.get(cnnzVar2);
            if (!cnnzVar2.t() || cnviVar.a(this.a.c, cnnzVar2) == 0) {
                cnnzVar2.n(cnqgVar);
            } else {
                cnqp cnqpVar3 = this.a;
                cnqpVar3.a.o(new cnqi(cnqpVar3, cnqgVar));
            }
        }
    }
}
