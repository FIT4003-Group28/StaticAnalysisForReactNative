package defpackage;

import android.os.Parcel;
/* compiled from: PG */
/* renamed from: qjq  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class qjq implements qvo {
    public final /* synthetic */ qjz a;
    public final /* synthetic */ String b;
    public final /* synthetic */ qjh c;
    private final /* synthetic */ int d;

    public /* synthetic */ qjq(qjz qjzVar, String str, qjh qjhVar) {
        this.a = qjzVar;
        this.b = str;
        this.c = qjhVar;
    }

    public /* synthetic */ qjq(qjz qjzVar, qjh qjhVar, String str, int i) {
        this.d = i;
        this.a = qjzVar;
        this.c = qjhVar;
        this.b = str;
    }

    @Override // defpackage.qvo
    public final void a(Object obj, Object obj2) {
        if (this.d == 0) {
            qjz qjzVar = this.a;
            String str = this.b;
            qjh qjhVar = this.c;
            qpk qpkVar = (qpk) obj;
            qjzVar.l();
            ((qpp) qpkVar.D()).f(str);
            if (qjhVar != null) {
                qpp qppVar = (qpp) qpkVar.D();
                Parcel pv = qppVar.pv();
                pv.writeString(str);
                qppVar.py(11, pv);
            }
            ((rvh) obj2).b(null);
            return;
        }
        qjz qjzVar2 = this.a;
        qjh qjhVar2 = this.c;
        String str2 = this.b;
        qpk qpkVar2 = (qpk) obj;
        qjzVar2.l();
        if (qjhVar2 != null) {
            ((qpp) qpkVar2.D()).f(str2);
        }
        ((rvh) obj2).b(null);
    }
}
