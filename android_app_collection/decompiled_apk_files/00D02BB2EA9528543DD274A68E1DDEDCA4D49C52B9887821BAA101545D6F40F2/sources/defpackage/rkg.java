package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: rkg  reason: default package */
/* loaded from: classes7.dex */
public class rkg {
    private static final dcfg<dndr, qjm, rkh> a;
    private final Activity b;
    private final btvo c;
    private final qjk d;
    private final dxio<bvjj> e;
    private final cqat f;

    static {
        dcfg dcfgVar;
        ArrayList<dcot> a2 = dchl.a();
        dcfe.a(dndr.HOME, qjm.STALE, rkh.STALE_HOME, a2);
        dcfe.a(dndr.HOME, qjm.VAGUE, rkh.VAGUE_HOME, a2);
        dcfe.a(dndr.WORK, qjm.STALE, rkh.STALE_WORK, a2);
        dcfe.a(dndr.WORK, qjm.VAGUE, rkh.VAGUE_WORK, a2);
        int size = a2.size();
        if (size == 0) {
            dcfgVar = dcnt.b;
        } else if (size == 1) {
            dcot dcotVar = (dcot) dcft.c(a2);
            dcfgVar = new dcno(dcotVar.a(), dcotVar.b(), dcotVar.c());
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            dcdc q = dcdc.q(a2);
            for (dcot dcotVar2 : a2) {
                linkedHashSet.add(dcotVar2.a());
                linkedHashSet2.add(dcotVar2.b());
            }
            dcfgVar = dcmv.v(q, dcep.K(linkedHashSet), dcep.K(linkedHashSet2));
        }
        a = dcfgVar;
    }

    public rkg(Activity activity, btvo btvoVar, qjk qjkVar, dxio<bvjj> dxioVar, cqat cqatVar) {
        this.b = activity;
        this.c = btvoVar;
        this.d = qjkVar;
        this.e = dxioVar;
        this.f = cqatVar;
    }

    private final boolean b(long j) {
        return c(j, bvjk.ig, d().m);
    }

    private final boolean c(long j, bvjk bvjkVar, long j2) {
        long w = this.e.a().w(bvjkVar, 0L);
        return w == 0 || w + TimeUnit.DAYS.toMillis(j2) < j;
    }

    private final dktt d() {
        dktt dkttVar = this.c.getPassiveAssistParameters().a().am;
        return dkttVar == null ? dktt.z : dkttVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
        if (r2 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a9, code lost:
        if (r3 != null) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.rkf a(defpackage.qvb r14) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rkg.a(qvb):rkf");
    }
}
