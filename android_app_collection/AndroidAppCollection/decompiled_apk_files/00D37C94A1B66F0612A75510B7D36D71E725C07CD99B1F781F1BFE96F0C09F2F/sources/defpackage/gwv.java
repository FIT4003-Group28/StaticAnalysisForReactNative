package defpackage;

import com.google.android.libraries.youtube.edit.camera.MultiSegmentCameraProgressIndicator;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: gwv  reason: default package */
/* loaded from: classes3.dex */
final class gwv implements hhm {
    final /* synthetic */ gxk a;

    public gwv(gxk gxkVar) {
        this.a = gxkVar;
    }

    @Override // defpackage.hhm
    public final void a(int[] iArr) {
        gvi gviVar;
        hew hewVar;
        MultiSegmentCameraProgressIndicator multiSegmentCameraProgressIndicator = this.a.aC;
        if (multiSegmentCameraProgressIndicator != null) {
            if (iArr != null) {
                for (int i : iArr) {
                    aqxo.p(i >= 0);
                }
            }
            multiSegmentCameraProgressIndicator.e = iArr;
            multiSegmentCameraProgressIndicator.b = 0;
            multiSegmentCameraProgressIndicator.c = -1;
            multiSegmentCameraProgressIndicator.d = true;
            multiSegmentCameraProgressIndicator.postInvalidate();
        }
        this.a.aq.d = hho.d(iArr);
        gxk gxkVar = this.a;
        if (gxkVar.aY && (hewVar = gxkVar.aj) != null) {
            hewVar.h = hho.d(iArr);
            if (hewVar.e && hewVar.d) {
                hewVar.d();
            }
        }
        gxk gxkVar2 = this.a;
        hho hhoVar = gxkVar2.aq;
        if (hhoVar.d > gxkVar2.c && hhoVar.c != gxkVar2.d) {
            gwj.a(gxkVar2.aD, gxkVar2.aw.getResources().getString(R.string.shorts_selected_duration_title, Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.a.d))), this.a.aw);
            gxk gxkVar3 = this.a;
            gxkVar3.aL(gxkVar3.d);
        }
        this.a.aU();
        gxk gxkVar4 = this.a;
        if (!gxkVar4.aW || (gviVar = gxkVar4.aF) == null) {
            return;
        }
        gviVar.d(true);
    }

    @Override // defpackage.hhm
    public final void b(int i) {
        this.a.aO(i);
    }

    @Override // defpackage.hhm
    public final void c(boolean z) {
        boolean e = gyq.e(this.a.aJ, z);
        this.a.aJ.setVisibility(true != z ? 4 : 0);
        if (e) {
            gxk gxkVar = this.a;
            if (!gxkVar.aU) {
                return;
            }
            gyo b = gxkVar.ax.b(acuo.b(96650));
            b.h(z);
            b.g();
        }
    }

    @Override // defpackage.hhm
    public final void d(boolean z) {
        gwk gwkVar = this.a.az;
        gwkVar.a();
        gwkVar.c(z, gyy.a(gwkVar.a));
    }
}
