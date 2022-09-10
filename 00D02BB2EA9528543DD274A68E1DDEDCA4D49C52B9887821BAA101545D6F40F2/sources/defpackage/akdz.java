package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akdz  reason: default package */
/* loaded from: classes2.dex */
public final class akdz implements Runnable {
    public final WeakReference<akea> a;
    public final bvjj b;
    public final btlu c;
    public final ccie d;
    public final dxio<ckcw> e;
    public boolean f = true;
    public final AtomicInteger g = new AtomicInteger(0);

    public akdz(akea akeaVar, btlu btluVar, ccie ccieVar, dxio<ckcw> dxioVar) {
        this.a = new WeakReference<>(akeaVar);
        this.c = btluVar;
        this.b = akeaVar.c;
        this.d = ccieVar;
        this.e = dxioVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dukl bK;
        if (this.a.get() != null) {
            akea akeaVar = this.a.get();
            if (akeaVar == null) {
                bK = null;
            } else {
                dwvc bZ = dwvd.l.bZ();
                bZ.bC(akeaVar.e.f());
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dwvd dwvdVar = (dwvd) bZ.b;
                dwvdVar.a |= 8;
                dwvdVar.c = true;
                dwvd dwvdVar2 = (dwvd) bZ.b;
                dwvdVar2.a |= 32;
                dwvdVar2.d = true;
                dwvd dwvdVar3 = (dwvd) bZ.b;
                dwvdVar3.a |= 1024;
                dwvdVar3.e = true;
                dwvd dwvdVar4 = (dwvd) bZ.b;
                dwvdVar4.a |= 4096;
                dwvdVar4.g = true;
                dwvd dwvdVar5 = (dwvd) bZ.b;
                dwvdVar5.a |= 8192;
                dwvdVar5.h = true;
                dwvd dwvdVar6 = (dwvd) bZ.b;
                dwvdVar6.a |= 16384;
                dwvdVar6.i = true;
                dwvd dwvdVar7 = (dwvd) bZ.b;
                dwvdVar7.a |= 262144;
                dwvdVar7.k = true;
                dwvd dwvdVar8 = (dwvd) bZ.b;
                dwvdVar8.a |= 131072;
                dwvdVar8.j = true;
                dwvb dwvbVar = (dwvb) this.b.N(bvjk.ga, this.c, (dssr) dwvb.e.cu(7), dwvb.e);
                if ((dwvbVar.a & 1) != 0) {
                    dspd dspdVar = dwvbVar.b;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dwvd dwvdVar9 = (dwvd) bZ.b;
                    dspdVar.getClass();
                    dwvdVar9.a |= 1;
                    dwvdVar9.b = dspdVar;
                }
                dukk bZ2 = dukl.d.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dukl duklVar = (dukl) bZ2.b;
                dwvd bK2 = bZ.bK();
                bK2.getClass();
                duklVar.b = bK2;
                duklVar.a |= 1;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dukl duklVar2 = (dukl) bZ2.b;
                duklVar2.a |= 2;
                duklVar2.c = true;
                bK = bZ2.bK();
            }
            if (bK == null) {
                return;
            }
            akdy akdyVar = new akdy(this);
            if (this.g.incrementAndGet() > 2) {
                bvoo.i(new IllegalStateException(String.format("Number of AppStartRequest retries exceeded the max limit: %s", 2)));
                return;
            }
            akea akeaVar2 = this.a.get();
            dbsk.s(akeaVar2);
            bujk bujkVar = akeaVar2.f;
            bujkVar.a().e = this.c;
            bujkVar.c().a(bK, akdyVar, bvrj.UI_THREAD);
        }
    }
}
