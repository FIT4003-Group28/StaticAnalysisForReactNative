package defpackage;

import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* renamed from: agrf  reason: default package */
/* loaded from: classes2.dex */
public final class agrf extends cqiw<agwt> {
    private final agre a;

    public agrf(agre agreVar) {
        super(agreVar);
        this.a = agreVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<agwt> a() {
        cqnf cd;
        cqmp[] cqmpVarArr = new cqmp[7];
        if (this.a.a()) {
            cd = cqgr.cd(-1);
        } else {
            cd = cqgr.cd(0);
        }
        cqmpVarArr[0] = cd;
        cqmpVarArr[1] = this.a.b() ? cqgr.bp(-1) : cqgr.bp(0);
        cqmpVarArr[2] = cqgr.ca(Float.valueOf(this.a.c()));
        cqmpVarArr[3] = cqgr.bV(cqrp.d(this.a.d()));
        cqmpVarArr[4] = cqgr.bD(cqrp.d(this.a.e()));
        cqmpVarArr[5] = cqgr.bG(cqrp.d(this.a.f()));
        cqmpVarArr[6] = WebImageView.a(cqgr.cd(-1), cqgr.bp(-1), cqgr.ei(ImageView.ScaleType.CENTER_CROP), WebImageView.l(agrc.a));
        return cqgr.fY(cqmpVarArr);
    }
}
