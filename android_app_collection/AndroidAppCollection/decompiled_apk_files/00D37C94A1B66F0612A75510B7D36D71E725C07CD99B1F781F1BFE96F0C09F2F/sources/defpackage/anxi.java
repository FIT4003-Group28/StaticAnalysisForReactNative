package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.firebase.appindexing.internal.ActionImpl;
/* compiled from: PG */
/* renamed from: anxi  reason: default package */
/* loaded from: classes.dex */
public final class anxi extends qvy implements qtu {
    protected rvh a;
    final /* synthetic */ ActionImpl[] e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anxi(ActionImpl[] actionImplArr) {
        super(null, false, 9004);
        this.e = actionImplArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qvy
    public final /* bridge */ /* synthetic */ void a(qsi qsiVar, rvh rvhVar) {
        this.a = rvhVar;
        qhk qhkVar = (qhk) ((qhm) qsiVar).D();
        qhn qhnVar = new qhn(this);
        ActionImpl[] actionImplArr = this.e;
        Parcel pv = qhkVar.pv();
        dve.i(pv, qhnVar);
        pv.writeTypedArray(actionImplArr, 0);
        qhkVar.px(7, pv);
    }

    @Override // defpackage.qtu
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        Status status = (Status) obj;
        if (status.c()) {
            this.a.b(null);
        } else {
            this.a.a(ancv.m(status, "User Action indexing error, please try again."));
        }
    }

    public anxi() {
        super(null, false, 9004);
    }
}
