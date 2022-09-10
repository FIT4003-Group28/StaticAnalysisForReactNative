package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fez  reason: default package */
/* loaded from: classes6.dex */
final class fez implements dxis {
    final /* synthetic */ ftt a;

    public fez(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        smz smzVar = (smz) obj;
        smzVar.aT = this.a.gK();
        ckcw rU = this.a.eW.a.rU();
        dxjg.e(rU);
        smzVar.aU = rU;
        dxjg.e(this.a.eW.a.tr());
        smzVar.aV = this.a.wq();
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        smzVar.aW = tp;
        smzVar.aY = this.a.lw();
        smzVar.ad = this.a.gK();
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        smzVar.ae = tr;
        smzVar.af = this.a.kk();
        this.a.eW.ih();
        dxjg.e(this.a.eW.a.sU());
        Context gK = this.a.gK();
        wcw ih = this.a.eW.ih();
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        smzVar.ah = new smx(gK, ih, sU);
    }
}
