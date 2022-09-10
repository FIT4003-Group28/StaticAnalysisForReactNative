package defpackage;

import android.os.Bundle;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bbwb  reason: default package */
/* loaded from: classes3.dex */
public final class bbwb extends ges {
    private static final dcqe ae = dcqe.c("bbwb");
    public bwqv a;
    public bbwa ad = bbwa.NOT_OPENED;
    public bcoz b;
    public bvrb c;
    public ff d;
    public bwrs<bcan> e;
    public boolean f;
    public bbts g;

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof bcpb) {
            return;
        }
        Object[] objArr = new Object[1];
        if (obj == null) {
            obj = "null";
        }
        objArr[0] = obj;
        bvoo.h("Unknown result: %s", objArr);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ak() {
        super.ak();
        this.c.b(new Runnable(this) { // from class: bbvy
            private final bbwb a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final bbwb bbwbVar = this.a;
                if (!bbwbVar.aD) {
                    return;
                }
                if (bbwbVar.ad.equals(bbwa.NOT_OPENED)) {
                    bbwbVar.ad = bbwa.IN_PROGRESS;
                    bvrj.UI_THREAD.c();
                    bvqj.e(bbwbVar.b.a(bbwbVar, bbwbVar.e, bbwbVar.f, bbwbVar.g), new bvqg(bbwbVar) { // from class: bbvz
                        private final bbwb a;

                        {
                            this.a = bbwbVar;
                        }

                        @Override // defpackage.bvqg
                        public final void NU(Object obj) {
                            this.a.ad = ((Boolean) obj).booleanValue() ? bbwa.OPENED : bbwa.NOT_OPENED;
                        }
                    }, bbwbVar.c.h());
                } else if (!bbwbVar.ad.equals(bbwa.OPENED)) {
                } else {
                    bvrj.UI_THREAD.c();
                    bcan c = bbwbVar.e.c();
                    dbsk.s(c);
                    c.a.a(bbwbVar.d, c.p());
                }
            }
        }, bvrj.UI_THREAD);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        if (bundle != null) {
            this.f = bundle.getBoolean("shouldTryToUseLiveCamera", false);
            bbwa bbwaVar = (bbwa) bundle.getSerializable("cameraOpeningState");
            if (bbwaVar == null) {
                bbwaVar = bbwa.NOT_OPENED;
            }
            this.ad = bbwaVar;
            try {
                bwrs<bcan> e = this.a.e(bcan.class, bundle, "photoSelectionContextRef");
                dbsk.s(e);
                this.e = e;
                bbts bbtsVar = (bbts) this.a.d(bbts.class, bundle, "liveCameraOption");
                if (bbtsVar == null) {
                    bbtr k = bbts.k();
                    k.c();
                    bbtsVar = k.a();
                }
                this.g = bbtsVar;
                return;
            } catch (IOException unused) {
                bvoo.h("IOException deserializing item from bundle.", new Object[0]);
                return;
            }
        }
        bvoo.h("Bundle should exist all the time", new Object[0]);
    }

    @Override // defpackage.ges
    @dzsi
    public final ddho p() {
        return null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        this.a.c(bundle, "photoSelectionContextRef", this.e);
        bundle.putBoolean("shouldTryToUseLiveCamera", this.f);
        bundle.putSerializable("cameraOpeningState", this.ad);
    }
}
