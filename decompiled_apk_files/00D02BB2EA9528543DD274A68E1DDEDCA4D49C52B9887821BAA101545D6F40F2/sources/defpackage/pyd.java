package defpackage;

import com.google.android.apps.maps.R;
import java.io.IOException;
import java.util.LinkedList;
/* compiled from: PG */
/* renamed from: pyd  reason: default package */
/* loaded from: classes7.dex */
final class pyd extends pyg {
    final /* synthetic */ LinkedList a;
    final /* synthetic */ qcd b;
    final /* synthetic */ pyh c;

    public pyd(pyh pyhVar, LinkedList linkedList, qcd qcdVar) {
        this.c = pyhVar;
        this.a = linkedList;
        this.b = qcdVar;
    }

    @Override // defpackage.pyg, defpackage.amwy
    public final void a(int i) {
        this.c.n().c();
        if (i != 1) {
            if (i == 4) {
                this.c.l(this.b);
                final pyh pyhVar = this.c;
                pyhVar.c.b(new Runnable(pyhVar) { // from class: pxt
                    private final pyh a;

                    {
                        this.a = pyhVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        pyh pyhVar2 = this.a;
                        bvrj.BACKGROUND_THREADPOOL.c();
                        try {
                            pyhVar2.b.c();
                        } catch (IOException unused) {
                        }
                    }
                }, bvrj.BACKGROUND_THREADPOOL);
                this.c.k(R.string.SAVE_ROUTE_SUCCESS_TILES_NOT_OFFLINEABLE_TOAST);
                return;
            }
            this.c.m(this.b);
            this.c.k(R.string.SAVE_ROUTE_TILE_PIN_FAILED_TOAST);
        } else if (!this.a.isEmpty()) {
            pyh pyhVar2 = this.c;
            LinkedList linkedList = this.a;
            qcd qcdVar = this.b;
            pyhVar2.o().a();
            try {
                pyhVar2.b.e(5, linkedList, new pye(pyhVar2, qcdVar), akry.SATELLITE);
            } catch (IOException unused) {
                linkedList.size();
                try {
                    pyhVar2.b.c();
                } catch (IOException unused2) {
                }
                pyhVar2.m(qcdVar);
                pyhVar2.k(R.string.SAVE_ROUTE_TILE_PIN_FAILED_TOAST);
            }
        } else {
            this.c.l(this.b);
            this.c.k(R.string.SAVE_ROUTE_SUCCESS_TOAST);
        }
    }
}
