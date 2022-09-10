package defpackage;

import android.os.Bundle;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cavk  reason: default package */
/* loaded from: classes4.dex */
public final class cavk extends itb implements cavs {
    public final gga a;
    private final Executor b;
    private final akfa c;
    private final buva d;

    public cavk(gga ggaVar, buva buvaVar, Executor executor, akfa akfaVar) {
        this.a = ggaVar;
        this.d = buvaVar;
        this.b = executor;
        this.c = akfaVar;
    }

    @Override // defpackage.cavs
    public final void e(@dzsi String str) {
        if (dbsj.d(str)) {
            btlu j = this.c.j();
            if (j == null || j.f != btlt.GOOGLE || dbsj.d(j.j())) {
                return;
            }
            str = j.j();
        }
        dbsk.m(!dbsj.d(str), "obfuscatedGaiaId must have been set.");
        dwtj dwtjVar = (dwtj) dwtm.l.bZ();
        dbsk.s(str);
        if (dwtjVar.c) {
            dwtjVar.bF();
            dwtjVar.c = false;
        }
        dwtm dwtmVar = (dwtm) dwtjVar.b;
        str.getClass();
        dwtmVar.a |= 1;
        dwtmVar.b = str;
        dkfz dkfzVar = dkfz.c;
        if (dwtjVar.c) {
            dwtjVar.bF();
            dwtjVar.c = false;
        }
        dwtm dwtmVar2 = (dwtm) dwtjVar.b;
        dkfzVar.getClass();
        dwtmVar2.h = dkfzVar;
        dwtmVar2.a |= 64;
        this.d.b((dwtm) dwtjVar.bK(), new cavj(this), this.b);
    }

    @Override // defpackage.cavs
    public final void f(cawy cawyVar) {
        gga ggaVar = this.a;
        cavi caviVar = new cavi();
        caviVar.aJ();
        Bundle bundle = new Bundle();
        bundle.putByteArray("contribution_stats_page", cawyVar.bS());
        caviVar.B(bundle);
        ggaVar.D(caviVar);
    }
}
