package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: zsk  reason: default package */
/* loaded from: classes7.dex */
public final class zsk implements cjyu<zfp> {
    public static final dcqe a = dcqe.c("zsk");
    private final zqm b;
    private final cqhn c;
    private final dzsj<String> d;

    public zsk(zqm zqmVar, cqhn cqhnVar, dzsj<String> dzsjVar) {
        this.b = zqmVar;
        this.c = cqhnVar;
        this.d = dzsjVar;
    }

    @Override // defpackage.cjyu
    public final /* bridge */ /* synthetic */ zfp a(Context context, cjzt cjztVar, dtkx dtkxVar, dtlf dtlfVar) {
        zfn zfnVar;
        dtku dtkuVar = dtkxVar.b;
        if (dtkuVar == null) {
            dtkuVar = dtku.p;
        }
        dtjz dtjzVar = dtkuVar.e;
        if (dtjzVar == null) {
            dtjzVar = dtjz.e;
        }
        dwbc dwbcVar = dtjzVar.b;
        if (dwbcVar == null) {
            dwbcVar = dwbc.g;
        }
        dwaa dwaaVar = dwbcVar.b;
        if (dwaaVar == null) {
            dwaaVar = dwaa.g;
        }
        dvzu dvzuVar = dwaaVar.b;
        if (dvzuVar == null) {
            dvzuVar = dvzu.F;
        }
        if (dvzuVar.e.isEmpty()) {
            return null;
        }
        dwbc dwbcVar2 = dtjzVar.b;
        if (dwbcVar2 == null) {
            dwbcVar2 = dwbc.g;
        }
        amsy amsyVar = new amsy(dwbcVar2);
        amve m = amsyVar.m(0);
        amvh[] e = amvj.e(amsyVar, context);
        amvh amvhVar = e[e.length - 1];
        if (m == null) {
            return null;
        }
        dtku dtkuVar2 = dtkxVar.b;
        if (dtkuVar2 == null) {
            dtkuVar2 = dtku.p;
        }
        dtjz dtjzVar2 = dtkuVar2.e;
        if (dtjzVar2 == null) {
            dtjzVar2 = dtjz.e;
        }
        dthb dthbVar = dtjzVar2.c;
        if (dthbVar == null) {
            dthbVar = dthb.F;
        }
        zsj zsjVar = new zsj(cjztVar, dthbVar);
        dtle dtleVar = dtle.INVALID_STYLE;
        dtle b = dtle.b(dtlfVar.b);
        if (b == null) {
            b = dtle.INVALID_STYLE;
        }
        int ordinal = b.ordinal();
        if (ordinal == 37) {
            zfnVar = zfn.CARDUI_DIRECTIONS_SUMMARY_COMPACT;
        } else if (ordinal != 38) {
            bvoo.h("Unknown style for directions item", new Object[0]);
            return null;
        } else {
            zfnVar = zfn.CARDUI_DIRECTIONS_SUMMARY_COMPACT_WITHOUT_DURATION;
        }
        zfn zfnVar2 = zfnVar;
        zqm zqmVar = this.b;
        dqvj c = dqvj.c(m.b().b);
        if (c == null) {
            c = dqvj.DRIVE;
        }
        zql a2 = zqmVar.a(context, zfnVar2, c, m, this.d.a(), 0, amvhVar, null, false, this.c);
        a2.b(zsjVar);
        return a2.a();
    }
}
