package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pus  reason: default package */
/* loaded from: classes7.dex */
public final class pus {
    final /* synthetic */ puy a;

    public pus(puy puyVar) {
        this.a = puyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(amqo amqoVar) {
        boolean z;
        puy puyVar = this.a;
        GmmLocation a = amqoVar.a();
        if (a == null || a.h == null) {
            return;
        }
        puyVar.bC();
        synchronized (puyVar.aT) {
            dtaq f = puyVar.aT.f();
            puyVar.aT.K(a.a());
            z = false;
            if (f == null && puyVar.bE()) {
                z = true;
            }
        }
        if (!z) {
            return;
        }
        dnqh ax = puyVar.aT.ax();
        final vnk vnkVar = puyVar.aT;
        vnkVar.getClass();
        puyVar.bP(11, ax, null, new Runnable(vnkVar) { // from class: pua
            private final vnk a;

            {
                this.a = vnkVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.az();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(ahjy ahjyVar) {
        puy puyVar = this.a;
        if (!ahjyVar.a.a() || !puyVar.bX.d() || !puyVar.aV) {
            if (ahjyVar.a.a() || !puyVar.bE() || !puyVar.aW || puyVar.aU) {
                return;
            }
            puyVar.aW = false;
            puyVar.aS();
            return;
        }
        puyVar.aU = false;
        puyVar.aV = false;
        dnqh ax = puyVar.aT.ax();
        final vnk vnkVar = puyVar.aT;
        vnkVar.getClass();
        puyVar.bP(11, ax, null, new Runnable(vnkVar) { // from class: pub
            private final vnk a;

            {
                this.a = vnkVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.az();
            }
        });
    }
}
