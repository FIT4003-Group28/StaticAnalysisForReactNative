package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: nfp  reason: default package */
/* loaded from: classes7.dex */
public final class nfp extends cqiw<nga> {
    private final boolean a;

    public nfp(boolean z) {
        super(Boolean.valueOf(z));
        this.a = z;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, nga ngaVar, Context context, cqiv cqivVar) {
        nfm nfmVar;
        ngi ngiVar;
        nga ngaVar2 = ngaVar;
        int size = ngaVar2.b().size();
        int i2 = 0;
        for (nfz nfzVar : ngaVar2.b()) {
            int i3 = i2 + 1;
            boolean z = i2 != size + (-1);
            cqkp cqkpVar = nfzVar.a;
            int i4 = nfzVar.b - 1;
            if (i4 == 1) {
                nfmVar = new nfm(new nfq());
                ngiVar = new ngi((ngb) cqkpVar, z);
            } else if (i4 == 2) {
                nfmVar = new nfm(new nfr());
                ngiVar = new ngi((ngc) cqkpVar, z);
            } else if (i4 == 3) {
                nfmVar = new nfm(new nfs());
                ngiVar = new ngi((ngd) cqkpVar, z);
            } else if (i4 == 4) {
                nfmVar = new nfm(new nfn());
                ngiVar = new ngi((nfw) cqkpVar, z);
            } else if (i4 != 5) {
                nfmVar = new nfm(new nft());
                ngiVar = new ngi((ngh) cqkpVar, z);
            } else {
                nfmVar = new nfm(new nfo());
                ngiVar = new ngi((nfw) cqkpVar, z);
            }
            cqivVar.a(nfmVar, ngiVar);
            i2 = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<nga> a() {
        Integer valueOf = Integer.valueOf((int) R.id.settings_dialog_setting_list);
        return nqk.a(cqgr.ce(nqo.am), cqgr.bp(-2), cqgr.bA(nqo.Q), nsc.y(nsc.m(valueOf), nsc.r(true), cqgr.cd(-1), cqgr.bp(-1), cqgr.bw(17), nqk.i(Boolean.valueOf(this.a), B().d(), B().f(), B().c(), B().e(), B().a(), new cqmp[0]), nrj.a(cqgr.aR(valueOf), cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-1), cqgr.bV(nqo.O), nrj.e(0), nrj.g(true), cqgr.ck(C()))));
    }
}
