package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
/* compiled from: PG */
/* renamed from: wvg  reason: default package */
/* loaded from: classes4.dex */
public final class wvg implements wvs, wlk, wlj, wuj, wuh {
    public final azqb a;
    public final azqb b;
    private final azqb f;
    private final azqb g;
    public final xei c = new xei();
    final Map d = new HashMap();
    public final Set e = new HashSet();
    private String h = "";
    private long i = -1;

    public wvg(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.f = azqbVar3;
        this.g = azqbVar4;
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void f(aika aikaVar, PlayerResponseModel playerResponseModel, ajbf ajbfVar, String str, String str2) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void h(int i, String str) {
    }

    @Override // defpackage.wuj
    public final void i(xdu xduVar) {
        if (!xduVar.a.isEmpty()) {
            this.e.remove(xduVar.a);
        }
    }

    @Override // defpackage.wuh
    public final void j(xdu xduVar) {
        if (!xduVar.a.isEmpty()) {
            this.e.add(xduVar.a);
        }
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qD(afkn afknVar) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qE(String str) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qF(aijs aijsVar, aijs aijsVar2, int i, int i2, boolean z, boolean z2) {
    }

    @Override // defpackage.wlk
    public final void qG(String str, long j, long j2, long j3, boolean z) {
        tjt l;
        this.h = str;
        this.i = j;
        if (!this.d.containsKey(str)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Queue queue = (Queue) this.d.get(str);
        while (true) {
            if (queue.isEmpty() || j < ((xcz) queue.peek()).d.a) {
                break;
            }
            xcz xczVar = (xcz) queue.poll();
            if (!xczVar.b) {
                wwf.a(null, "VideoTimeEventTriggerAdapter: VideoTimeEvent trigger should only be triggered once");
            } else if (this.c.e(xczVar.a)) {
                xeh a = this.c.a(xczVar.a);
                if (((xcz) a.b).g && (l = ((wlg) this.g.get()).l(j)) != null) {
                    a = new xeh(a, xac.b(new xad(l)));
                }
                arrayList.add(a);
            } else {
                wwf.a(null, "Ping migration VideoTimeEventTriggerAdapter: bundle map doesn't contain the activated trigger");
                break;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((wvr) this.a.get()).q(arrayList);
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qK(String str, int i) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qM(ahgc ahgcVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c5 A[Catch: wlb -> 0x0119, TryCatch #0 {wlb -> 0x0119, blocks: (B:25:0x009f, B:29:0x00bf, B:31:0x00c5, B:33:0x00cb, B:41:0x0109, B:42:0x0110, B:43:0x0111, B:44:0x0118), top: B:53:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0111 A[Catch: wlb -> 0x0119, TryCatch #0 {wlb -> 0x0119, blocks: (B:25:0x009f, B:29:0x00bf, B:31:0x00c5, B:33:0x00cb, B:41:0x0109, B:42:0x0110, B:43:0x0111, B:44:0x0118), top: B:53:0x009f }] */
    @Override // defpackage.wvs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void qN(int r18, defpackage.xek r19, defpackage.xdu r20, defpackage.xci r21) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wvg.qN(int, xek, xdu, xci):void");
    }

    @Override // defpackage.wvs
    public final void qO(xek xekVar) {
        xeh b = this.c.b(xekVar.c());
        if (b == null) {
            return;
        }
        ajbf ajbfVar = (ajbf) b.c.d(xbw.class);
        ajbg ajbgVar = (ajbg) ((wmn) this.f.get()).a.remove(xekVar.c());
        if (ajbgVar != null && ajbfVar != null && ajbfVar.d() != null) {
            ajbfVar.d().i(ajbgVar);
        }
        if (!(xekVar instanceof xcz)) {
            return;
        }
        this.d.remove(((xcz) xekVar).c);
    }
}
