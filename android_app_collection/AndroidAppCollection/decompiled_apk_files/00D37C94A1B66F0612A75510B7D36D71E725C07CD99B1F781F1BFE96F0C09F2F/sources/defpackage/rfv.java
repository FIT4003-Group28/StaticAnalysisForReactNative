package defpackage;

import com.google.android.gms.location.internal.LocationRequestUpdateData;
/* compiled from: PG */
/* renamed from: rfv  reason: default package */
/* loaded from: classes4.dex */
public final class rfv implements qvo {
    public boolean a = true;
    final /* synthetic */ qvd b;

    protected rfv() {
    }

    public rfv(qvd qvdVar) {
        this.b = qvdVar;
    }

    @Override // defpackage.qvo
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        rgr rgrVar = (rgr) obj;
        if (this.a) {
            rvh rvhVar = (rvh) obj2;
            rfs rfsVar = new rfs(rvhVar);
            try {
                qvb qvbVar = this.b.b;
                if (qvbVar == null) {
                    return;
                }
                rgq rgqVar = rgrVar.b;
                rgqVar.e.a();
                synchronized (rgqVar.d) {
                    rga rgaVar = (rga) rgqVar.d.remove(qvbVar);
                    if (rgaVar != null) {
                        rgaVar.a();
                        rgqVar.e.b().a(LocationRequestUpdateData.a(rgaVar, rfsVar));
                    }
                }
            } catch (RuntimeException e) {
                rvhVar.c(e);
            }
        }
    }
}
