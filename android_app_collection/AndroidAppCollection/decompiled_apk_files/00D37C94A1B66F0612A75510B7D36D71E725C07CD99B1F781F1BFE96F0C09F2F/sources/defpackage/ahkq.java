package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: ahkq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ahkq implements Runnable {
    public final /* synthetic */ ahkv a;
    private final /* synthetic */ int b;

    public /* synthetic */ ahkq(ahkv ahkvVar) {
        this.a = ahkvVar;
    }

    public /* synthetic */ ahkq(ahkv ahkvVar, int i) {
        this.b = i;
        this.a = ahkvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                this.a.j();
                return;
            }
            ahkv ahkvVar = this.a;
            Handler handler = ahkvVar.t;
            if (handler != null) {
                handler.obtainMessage(3).sendToTarget();
            }
            ahop ahopVar = ahkvVar.u;
            if (ahopVar == null) {
                return;
            }
            ahso ahsoVar = (ahso) ahopVar;
            ahsoVar.c();
            ahsm ahsmVar = ahsoVar.e;
            if (ahsmVar == null) {
                return;
            }
            ahsmVar.b(false);
            return;
        }
        ahkv ahkvVar2 = this.a;
        if (ahkvVar2.n != null) {
            if (ahkvVar2.w) {
                ahkvVar2.c();
            }
            ahob ahobVar = ahkvVar2.p;
            if (ahobVar != null) {
                ahobVar.k(ahkvVar2.w);
            }
            ahof ahofVar = ahkvVar2.n;
            boolean z = ahkvVar2.w;
            ahmt ahmtVar = ahofVar.b;
            if (ahmtVar.n != z) {
                ahmtVar.n = z;
                if (ahmtVar.h == aanv.RECTANGULAR_3D || ahmtVar.h == aanv.RECTANGULAR_2D) {
                    ahmtVar.g();
                }
                ahmtVar.h();
            }
            ahofVar.j = true;
        }
        ahkl ahklVar = ahkvVar2.k;
        if (ahklVar == null) {
            return;
        }
        ahklVar.j(ahkvVar2.w);
    }
}
