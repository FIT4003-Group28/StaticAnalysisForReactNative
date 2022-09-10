package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: atbr  reason: default package */
/* loaded from: classes2.dex */
public final class atbr<T> extends btrh<T> {
    private final int d;

    public atbr(Class<?> cls, T t) {
        super(cls, t);
        this.d = 1;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        String string;
        if (this.d != 0) {
            final atbo atboVar = (atbo) this.a;
            crmk crmkVar = (crmk) obj;
            if (!atboVar.a.g.a) {
                return;
            }
            dqvj dqvjVar = crmkVar.b.a().h;
            if (dqvjVar != dqvj.DRIVE && dqvjVar != dqvj.TWO_WHEELER) {
                return;
            }
            atboVar.a.aA.a(new Runnable(atboVar) { // from class: atbn
                private final atbo a;

                {
                    this.a = atboVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.aR();
                }
            }, bvrj.UI_THREAD, atbq.e);
            return;
        }
        atbo atboVar2 = (atbo) this.a;
        alhb alhbVar = (alhb) obj;
        Resources Rn = atboVar2.a.Rn();
        afwm afwmVar = afwm.TRAFFIC;
        int ordinal = alhbVar.a.ordinal();
        if (ordinal == 0) {
            string = Rn.getString(R.string.LAYER_TRAFFIC);
        } else if (ordinal == 1) {
            string = Rn.getString(R.string.LAYER_BICYCLING);
        } else if (ordinal == 2) {
            string = Rn.getString(R.string.LAYER_PUBLIC_TRANSIT);
        } else if (ordinal == 3) {
            string = Rn.getString(R.string.LAYER_SATELLITE);
        } else if (ordinal != 4) {
            afwm afwmVar2 = alhbVar.a;
            string = null;
        } else {
            string = Rn.getString(R.string.LAYERS_TERRAIN);
        }
        if (string == null) {
            return;
        }
        final gga ggaVar = atboVar2.a.aE;
        final String string2 = Rn.getString(R.string.OFFLINE_LAYER_NOT_AVAILABLE, string);
        atboVar2.a.aA.b(new Runnable(ggaVar, string2) { // from class: atbm
            private final gga a;
            private final String b;

            {
                this.a = ggaVar;
                this.b = string2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                gga ggaVar2 = this.a;
                ckos.a(ggaVar2.findViewById(16908290), this.b, 0).c();
            }
        }, bvrj.UI_THREAD);
    }

    public atbr(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = 0;
    }
}
