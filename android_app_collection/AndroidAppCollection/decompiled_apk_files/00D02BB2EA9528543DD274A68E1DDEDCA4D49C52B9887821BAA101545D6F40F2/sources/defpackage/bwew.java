package defpackage;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bwew  reason: default package */
/* loaded from: classes4.dex */
public final class bwew extends bwdr<bwev> {
    public static final String aw = "bwew";
    public Executor aA;
    private bwid aB;
    public bwie ax;
    public azeg ay;
    public axwi az;

    @Override // defpackage.bwdr
    protected final boolean aK() {
        return this.am.getSharingParameters().c;
    }

    @Override // defpackage.bwdr
    protected final Pair<bwhy, cqnm<bwhz>> aL() {
        return new Pair<>(this.aB, cqgr.fP(new bwgq(), cqkz.a(this.aB), new cqmp[0]));
    }

    @Override // defpackage.bwdr
    @dzsi
    protected final bwdp<?> aM() {
        if (!((bwev) this.at).e) {
            return null;
        }
        return new bwdf(this.ay, new azec());
    }

    @Override // defpackage.bwdr
    public final Class<bwev> aO() {
        return bwev.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bwdr
    public final /* bridge */ /* synthetic */ dehn<bwev> aS(bwev bwevVar) {
        final bwev bwevVar2 = bwevVar;
        if (!this.ay.a().booleanValue()) {
            return deha.a(bwevVar2);
        }
        ProgressDialog progressDialog = new ProgressDialog(H(), 0);
        progressDialog.setMessage(H().getString(R.string.CREATING_LINK));
        progressDialog.setCancelable(false);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.show();
        deig d = deig.d();
        deha.q(deew.h(deew.g(deew.h(deew.g(degp.q(this.az.h(bwevVar2.f)), new defg(this) { // from class: bweq
            private final bwew a;

            {
                this.a = this;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                baad baadVar = (baad) obj;
                axwi axwiVar = this.a.az;
                dbsk.s(baadVar);
                return axwiVar.m(baadVar, dpqn.WRITABLE_ENTITY_LIST);
            }
        }, dege.a), new dbrn() { // from class: bwer
            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                baad baadVar = (baad) obj;
                bwdt bwdtVar = new bwdt(baadVar.v());
                bwdtVar.d = 12;
                bwdtVar.c = axyk.b(baadVar, true);
                return bwdtVar.a();
            }
        }, dege.a), new defg() { // from class: bwes
            @Override // defpackage.defg
            public final dehn a(Object obj) {
                return deha.a((bwdu) obj);
            }
        }, dege.a), new dbrn(bwevVar2) { // from class: bwet
            private final bwev a;

            {
                this.a = bwevVar2;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                bwev bwevVar3 = this.a;
                return new bwev((bweo) obj, bwevVar3.f, true, bwevVar3.e, bwevVar3.b, bwevVar3.c);
            }
        }, dege.a), new bweu(d, progressDialog), this.aA);
        return d;
    }

    @Override // defpackage.bwdr, defpackage.ex, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        this.ay.c(((bwev) this.at).g);
        this.aB = this.ax.a();
    }
}
