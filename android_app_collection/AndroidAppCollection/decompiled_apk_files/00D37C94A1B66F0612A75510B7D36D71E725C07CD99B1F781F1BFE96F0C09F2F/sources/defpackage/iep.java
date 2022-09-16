package defpackage;

import android.view.View;
import com.google.protos.youtube.api.innertube.ReelVodLinkRendererOuterClass;
/* compiled from: PG */
/* renamed from: iep  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class iep implements View.OnClickListener {
    public final /* synthetic */ iet a;
    private final /* synthetic */ int b;

    public /* synthetic */ iep(iet ietVar) {
        this.a = ietVar;
    }

    public /* synthetic */ iep(iet ietVar, int i) {
        this.b = i;
        this.a = ietVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ico icoVar;
        aulr aJ;
        aumc aumcVar;
        switch (this.b) {
            case 0:
                this.a.b();
                return;
            case 1:
                this.a.b();
                return;
            case 2:
                ier ierVar = this.a.o;
                if (ierVar == null || (aJ = (icoVar = (ico) ierVar).aJ()) == null || (aJ.b & 128) == 0) {
                    return;
                }
                aunb aunbVar = aJ.j;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                if (aunbVar.qn(ReelVodLinkRendererOuterClass.reelVodLinkRenderer)) {
                    aunb aunbVar2 = aJ.j;
                    if (aunbVar2 == null) {
                        aunbVar2 = aunb.a;
                    }
                    aumcVar = (aumc) aunbVar2.qm(ReelVodLinkRendererOuterClass.reelVodLinkRenderer);
                } else {
                    aumcVar = null;
                }
                if (aumcVar == null) {
                    return;
                }
                int i = aumcVar.b;
                if ((i & 16) == 0) {
                    return;
                }
                if ((i & 64) != 0) {
                    icoVar.aH().H(3, new acte(aumcVar.h), null);
                }
                aafo aafoVar = icoVar.aC;
                apzg apzgVar = aumcVar.g;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar.c(apzgVar, null);
                return;
            case 3:
                this.a.e();
                return;
            case 4:
                this.a.d();
                return;
            case 5:
                this.a.c.bl();
                return;
            case 6:
                this.a.j();
                return;
            default:
                iet ietVar = this.a;
                if (ietVar.i.d()) {
                    ietVar.i.a();
                    return;
                } else {
                    ietVar.i.b();
                    return;
                }
        }
    }
}
