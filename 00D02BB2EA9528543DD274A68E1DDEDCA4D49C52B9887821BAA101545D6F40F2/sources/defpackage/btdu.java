package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: btdu  reason: default package */
/* loaded from: classes4.dex */
public abstract class btdu extends aug {
    public cqkj ad;
    public vpd ae;
    public btrm af;
    @dzsi
    public vqy ag;
    @dzsi
    private cqkf<vqy> ai;

    @Override // defpackage.ex, defpackage.fd
    public final void Qi(Context context) {
        dxix.a(this);
        super.Qi(context);
    }

    @Override // defpackage.aug
    public final void aL(boolean z) {
        cqkf<vqy> cqkfVar = this.ai;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
    }

    @Override // defpackage.aug
    public final void aM(qx qxVar) {
        if (!aO()) {
            return;
        }
        if (this.ai == null) {
            this.ai = this.ad.e(new btfb());
        }
        this.ag = aR();
        cqkf<vqy> cqkfVar = this.ai;
        dbsk.s(cqkfVar);
        cqkfVar.e(this.ag);
        cqkf<vqy> cqkfVar2 = this.ai;
        dbsk.s(cqkfVar2);
        qxVar.k(cqkfVar2.c());
        qxVar.o(R.string.SAVE, new btds(this));
        qxVar.l(R.string.CANCEL_BUTTON, new btdt());
    }

    protected abstract boolean aO();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract vux aP();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract vpc aQ();

    protected abstract vqy aR();
}
