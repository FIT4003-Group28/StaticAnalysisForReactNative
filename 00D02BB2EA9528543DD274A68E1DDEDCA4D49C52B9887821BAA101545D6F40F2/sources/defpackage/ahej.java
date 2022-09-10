package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ahej  reason: default package */
/* loaded from: classes2.dex */
class ahej implements agzm {
    final /* synthetic */ aheo a;
    private int b;
    private boolean c;

    public ahej(aheo aheoVar) {
        this.a = aheoVar;
    }

    @Override // defpackage.agzm
    public Integer a() {
        return Integer.valueOf(this.b);
    }

    @Override // defpackage.agzm
    public CharSequence b() {
        Resources resources = this.a.a.getResources();
        int i = this.b;
        return resources.getQuantityString(R.plurals.LOCALSTREAM_FOLLOWED_AREA_COUNT_TEXT, i, Integer.valueOf(i));
    }

    @Override // defpackage.agzm
    public cqtd c() {
        return cqrt.h(2131232419, ibm.p());
    }

    @Override // defpackage.agzm
    public CharSequence d() {
        return this.a.a.getString(R.string.LOCALSTREAM_FOLLOW_MANAGEMENT_PAGE_TITLE);
    }

    @Override // defpackage.agzm
    public cjtd e() {
        cjta b = cjtd.b();
        b.d = dtxu.bq;
        if (this.c) {
            ddzf bZ = ddzg.t.bZ();
            ddyt bZ2 = ddyu.i.bZ();
            int i = this.b;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddyu ddyuVar = (ddyu) bZ2.b;
            ddyuVar.a |= 1;
            ddyuVar.b = i;
            ddyu bK = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddzg ddzgVar = (ddzg) bZ.b;
            bK.getClass();
            ddzgVar.k = bK;
            ddzgVar.b |= 1;
            b.r(bZ.bK());
        }
        return b.a();
    }

    @Override // defpackage.agzm
    public cqkl f(View view) {
        this.a.c.a().k();
        return cqkl.a;
    }

    @Override // defpackage.agzm
    public void g() {
    }

    @Override // defpackage.agzm
    public void h(int i) {
        bvrj.UI_THREAD.c();
        this.b = i;
        this.c = true;
        cqkx.p(this.a);
    }

    @Override // defpackage.agzm
    public void i(boolean z) {
        this.a.k(false);
    }
}
