package defpackage;

import android.util.Pair;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsController;
/* compiled from: PG */
/* renamed from: fuk  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fuk implements ayqb {
    public final /* synthetic */ HatsController a;
    private final /* synthetic */ int b;

    public /* synthetic */ fuk(HatsController hatsController) {
        this.a = hatsController;
    }

    public /* synthetic */ fuk(HatsController hatsController, int i) {
        this.b = i;
        this.a = hatsController;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        avda avdaVar;
        if (this.b == 0) {
            HatsController hatsController = this.a;
            ahhj ahhjVar = (ahhj) obj;
            if (hatsController.b == null) {
                hatsController.f = ahhjVar;
                return;
            }
            wxq wxqVar = wxq.AD_INTERRUPT_ACQUIRED;
            aijw aijwVar = aijw.PLAYBACK_PENDING;
            aika aikaVar = aika.NEW;
            int ordinal = ahhjVar.b().ordinal();
            if (ordinal != 5) {
                if (ordinal != 7 || !HatsController.p(hatsController.b.e)) {
                    return;
                }
                hatsController.j(hatsController.b.d(ahhjVar.d()));
                return;
            } else if (!HatsController.m(hatsController.b.e)) {
                return;
            } else {
                hatsController.j(hatsController.b.d(ahhjVar.d()));
                return;
            }
        }
        HatsController hatsController2 = this.a;
        Pair pair = (Pair) obj;
        if (hatsController2.b == null) {
            return;
        }
        boolean z = false;
        if (((ajff) pair.first).c() != null && ((ajff) pair.first).c().F()) {
            z = true;
        }
        ahhx ahhxVar = (ahhx) pair.second;
        ahhx ahhxVar2 = hatsController2.d;
        if (ahhxVar2 != null && ahhxVar2.i().equals(ahhxVar.i())) {
            long g = ahhxVar.g() - hatsController2.d.g();
            if (g > 0 && g < 5000) {
                hatsController2.g += g;
            }
        } else {
            hatsController2.g = 0L;
        }
        hatsController2.d = ahhxVar;
        avdu avduVar = hatsController2.b.e;
        float f = ((float) ahhxVar.f()) / 1000.0f;
        avdq avdqVar = avduVar.c;
        if (avdqVar == null) {
            avdqVar = avdq.a;
        }
        float f2 = Float.MAX_VALUE;
        for (avcz avczVar : avdqVar.l) {
            if (avczVar.b == 2) {
                int i = ((avda) avczVar.c).b;
                if (i > 0) {
                    f2 = Math.min(i, f2);
                }
                if (avczVar.b == 2) {
                    avdaVar = (avda) avczVar.c;
                } else {
                    avdaVar = avda.a;
                }
                float f3 = avdaVar.c;
                if (!z && f3 > 0.0f && f > 0.0f) {
                    f2 = Math.min(f3 * f, f2);
                }
            }
        }
        if (f2 >= Float.MAX_VALUE) {
            f2 = 0.0f;
        }
        if (f2 <= 0.0f || ((float) (hatsController2.g / 1000)) <= f2) {
            return;
        }
        hatsController2.j(hatsController2.b.d(ahhxVar.i()));
    }
}
