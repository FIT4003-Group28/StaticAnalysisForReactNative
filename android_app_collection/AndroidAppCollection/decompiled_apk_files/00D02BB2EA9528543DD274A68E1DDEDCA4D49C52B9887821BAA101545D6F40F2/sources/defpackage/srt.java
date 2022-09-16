package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: srt  reason: default package */
/* loaded from: classes7.dex */
public final class srt implements vmb {
    final /* synthetic */ srv a;

    public srt(srv srvVar) {
        this.a = srvVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwaw> btzrVar, btzy btzyVar) {
        qie qieVar;
        srv srvVar = this.a;
        synchronized (srvVar) {
            qieVar = srvVar.l;
            srx w = srvVar.k.w();
            w.d(btzyVar);
            srvVar.k = w.a();
        }
        if (btzyVar.p == bttq.REQUEST_TIMEOUT && qieVar != null) {
            qieVar.a.a();
        }
        srvVar.q(true);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwaw> btzrVar, amsy amsyVar) {
        srf h;
        avtq avtqVar;
        amsy amsyVar2 = amsyVar;
        srv srvVar = this.a;
        deha.q(btzrVar.e.a(), new sru(srvVar), srvVar.h);
        synchronized (srvVar) {
            dwaa dwaaVar = amsyVar2.a.b;
            if (dwaaVar == null) {
                dwaaVar = dwaa.g;
            }
            dvzu dvzuVar = dwaaVar.b;
            if (dvzuVar == null) {
                dvzuVar = dvzu.F;
            }
            dovb b = dovb.b(dvzuVar.j);
            if (b == null) {
                b = dovb.SUCCESS;
            }
            if (b == dovb.SUCCESS) {
                long j = srvVar.o;
                if (j > 0 && j < srvVar.c.e() && (avtqVar = srvVar.n) != null) {
                    srvVar.g.u(avtqVar);
                    srvVar.n = null;
                }
            }
            if (srvVar.j.a().a()) {
                dway dwayVar = amsyVar2.a.f;
                if (dwayVar == null) {
                    dwayVar = dway.d;
                }
                if ((dwayVar.a & 1) != 0) {
                    crdz a = srvVar.j.a();
                    String str = dwayVar.b;
                    String str2 = dwayVar.c;
                    if (!a.a()) {
                        bvoo.h("updateVoicePreferenceInformation() called when VoicePreferenceManager not enabled.", new Object[0]);
                    }
                    a.c = null;
                    a.b.ac(bvjk.eI, str);
                    a.b.ac(bvjk.eJ, str2);
                }
            }
            h = srvVar.h(btzrVar.a, amsyVar2, true);
        }
        if (h != null) {
            srvVar.f.b(h);
        }
    }
}
