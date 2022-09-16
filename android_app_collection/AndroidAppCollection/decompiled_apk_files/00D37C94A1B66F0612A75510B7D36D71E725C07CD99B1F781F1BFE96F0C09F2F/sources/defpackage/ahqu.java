package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ahqu  reason: default package */
/* loaded from: classes.dex */
public final class ahqu implements ahyp, aich, aiaq, ahku {
    private final ViewGroup a;
    private final Context b;
    private ahpx c;
    private boolean d;
    private boolean e;
    private ahyo f;
    private aicg g;
    private aiap h;
    private long j;
    private long k;
    private long l;
    private long m;
    private VideoQuality[] p;
    private int q;
    private boolean r;
    private ControlsState i = ControlsState.b();
    private ControlsOverlayStyle n = ControlsOverlayStyle.a;
    private boolean o = true;

    public ahqu(ViewGroup viewGroup, Context context) {
        this.a = viewGroup;
        this.b = context;
    }

    private final void e() {
        l(this.n);
        pB(this.d);
        nK(this.e);
        o(this.j, this.k, this.l, this.m);
        f(this.i);
        j(this.o);
        pH(this.p, this.q, this.r);
    }

    private final void h(ahpx ahpxVar) {
        this.c = ahpxVar;
        if (ahpxVar != null) {
            ahyo ahyoVar = this.f;
            if (ahyoVar != null) {
                ahpxVar.g = ahyoVar;
            }
            aicg aicgVar = this.g;
            if (aicgVar != null) {
                ahpxVar.h = aicgVar;
            }
            aiap aiapVar = this.h;
            if (aiapVar != null) {
                ahpxVar.i = aiapVar;
            }
            e();
        }
    }

    @Override // defpackage.ahyp
    public final void f(ControlsState controlsState) {
        controlsState.getClass();
        ahpx ahpxVar = this.c;
        if (ahpxVar != null) {
            boolean z = controlsState.b;
            ahpxVar.j = z;
            ahpxVar.b.qS(!z);
            ahpxVar.k();
            ahzb ahzbVar = controlsState.a;
            if (ahzbVar == ahzb.PLAYING) {
                this.c.a();
            } else if (ahzbVar == ahzb.PAUSED) {
                ahpx ahpxVar2 = this.c;
                ahpxVar2.k = false;
                ahpxVar2.e.c(1);
                ahpxVar2.k();
            } else if (ahzbVar == ahzb.ENDED) {
                ahpx ahpxVar3 = this.c;
                ahpxVar3.o = true;
                ahpxVar3.m = true;
                ahpxVar3.k = false;
                ahpxVar3.e.c(3);
                ahpxVar3.k();
            }
        }
        this.i = controlsState;
    }

    @Override // defpackage.ahyp
    public final void i(ahyo ahyoVar) {
        this.f = ahyoVar;
        ahpx ahpxVar = this.c;
        if (ahpxVar != null) {
            ahpxVar.g = ahyoVar;
        }
    }

    @Override // defpackage.ahyp
    public final void j(boolean z) {
        ahpx ahpxVar = this.c;
        if (ahpxVar != null) {
            ahqe ahqeVar = ahpxVar.c.f;
            ahqeVar.m = z;
            ahqeVar.a.d(ahqeVar.a());
        }
        this.o = z;
    }

    @Override // defpackage.ahyp
    public final void l(ControlsOverlayStyle controlsOverlayStyle) {
        ahpx ahpxVar = this.c;
        if (ahpxVar != null) {
            ahqq ahqqVar = ahpxVar.e;
            ahqqVar.a = controlsOverlayStyle;
            ahqqVar.a();
            ahpp ahppVar = ahpxVar.c;
            ahqe ahqeVar = ahppVar.f;
            ahqeVar.k = controlsOverlayStyle;
            ahmj ahmjVar = ahqeVar.a;
            int i = controlsOverlayStyle.q;
            aqxo.p(true);
            ahmjVar.e[0].g(i);
            ahqeVar.a.d(ahqeVar.a());
            boolean b = ControlsOverlayStyle.b(controlsOverlayStyle);
            ahppVar.i = b;
            ahppVar.b.l = !b;
            ahppVar.a.qS(b);
            ahppVar.c();
        }
        this.n = controlsOverlayStyle;
    }

    @Override // defpackage.aiaq
    public final void nK(boolean z) {
        ahpx ahpxVar = this.c;
        if (ahpxVar != null) {
            ahqq ahqqVar = ahpxVar.e;
            ahqqVar.c = z;
            ahqqVar.a();
        }
        this.e = z;
    }

    @Override // defpackage.ahyp
    public final void nN(CharSequence charSequence) {
    }

    @Override // defpackage.ahyp
    public final void nO(boolean z) {
    }

    @Override // defpackage.ahyp
    public final void nP(Map map) {
    }

    @Override // defpackage.ahyp
    public final void nf() {
    }

    @Override // defpackage.ahyp
    public final void ng() {
        this.n = ControlsOverlayStyle.a;
        this.i = ControlsState.b();
        e();
    }

    @Override // defpackage.ahyp
    public final void nh(String str, boolean z) {
    }

    @Override // defpackage.ahyp
    public final void ni(boolean z) {
    }

    @Override // defpackage.ahyp
    public final void nj(boolean z) {
    }

    @Override // defpackage.ahyp
    public final void ny() {
        o(0L, 0L, 0L, 0L);
    }

    @Override // defpackage.ahyp
    public final void o(long j, long j2, long j3, long j4) {
        float f;
        ahpx ahpxVar = this.c;
        if (ahpxVar != null) {
            ahpp ahppVar = ahpxVar.c;
            ahppVar.h = j3;
            ahlr ahlrVar = ahppVar.b;
            boolean c = ahfa.c(j, j3);
            if (ahlrVar.e != c) {
                ahlrVar.e = c;
                ahlrVar.d();
            }
            ahnh ahnhVar = ahppVar.a;
            String i = zgh.i(j / 1000);
            String i2 = zgh.i(j3 / 1000);
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i2).length());
            sb.append(i);
            sb.append("/");
            sb.append(i2);
            ahnhVar.y(sb.toString());
            ahqe ahqeVar = ahppVar.f;
            if (j3 <= 0) {
                zep.b("Cannot have a negative time for video duration!");
            } else {
                ahqeVar.g = j3;
                long j5 = j4 > j3 ? j3 : j4;
                ahqeVar.h = j2;
                long j6 = j3 - j2;
                if (j6 <= 0) {
                    float[] fArr = ahqeVar.e;
                    fArr[0] = 1.0f;
                    fArr[1] = 0.0f;
                    f = 1.0f;
                } else {
                    float[] fArr2 = ahqeVar.e;
                    float f2 = (float) j6;
                    long j7 = j5;
                    fArr2[0] = ((float) (j - j2)) / f2;
                    fArr2[1] = j7 > j ? ((float) (j7 - j)) / f2 : 0.0f;
                    float f3 = fArr2[0];
                    f = 1.0f;
                    if (f3 > 1.0f) {
                        f3 = 1.0f;
                    }
                    fArr2[0] = f3;
                    float f4 = fArr2[1];
                    if (f4 > 1.0f) {
                        f4 = 1.0f;
                    }
                    fArr2[1] = f4;
                }
                float[] fArr3 = ahqeVar.e;
                fArr3[2] = (f - fArr3[0]) - fArr3[1];
                ahqeVar.a.g(fArr3);
                float f5 = ahqeVar.e[0];
                if (f5 < 0.0f || f5 > 1.01d) {
                    StringBuilder sb2 = new StringBuilder(38);
                    sb2.append("percentWidth invalid - ");
                    sb2.append(f5);
                    zep.b(sb2.toString());
                }
                ahqeVar.c.n(ahqeVar.a.h * (f5 - ahqeVar.j), 0.0f, 0.0f);
                ahqeVar.j = f5;
            }
        }
        this.j = j;
        this.k = j2;
        this.l = j3;
        this.m = j4;
    }

    @Override // defpackage.ahyp
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.ahyp
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.aiaq
    public final void pB(boolean z) {
        ahpx ahpxVar = this.c;
        if (ahpxVar != null) {
            ahqq ahqqVar = ahpxVar.e;
            ahqqVar.b = z;
            ahqqVar.a();
        }
        this.d = z;
    }

    @Override // defpackage.aiaq
    public final void pD(aiap aiapVar) {
        this.h = aiapVar;
        ahpx ahpxVar = this.c;
        if (ahpxVar != null) {
            ahpxVar.i = aiapVar;
        }
    }

    @Override // defpackage.aich
    public final void pG(boolean z) {
    }

    @Override // defpackage.aich
    public final void pH(VideoQuality[] videoQualityArr, int i, boolean z) {
        int length;
        if (videoQualityArr == null || i < 0 || (length = videoQualityArr.length) == 0) {
            return;
        }
        ahpx ahpxVar = this.c;
        if (ahpxVar != null) {
            String str = videoQualityArr[i].b;
            int i2 = length - 1;
            String str2 = videoQualityArr[i2].b;
            boolean z2 = i == i2;
            ahlk ahlkVar = ahpxVar.c.e;
            ahlkVar.h = str;
            ahlkVar.i = str2;
            ahlkVar.e = z2;
            if (ahlkVar.g) {
                ahlkVar.g = z2;
            }
            ahlkVar.a();
        }
        this.p = videoQualityArr;
        this.q = i;
        this.r = z;
    }

    @Override // defpackage.ahyp
    public final void pI() {
    }

    @Override // defpackage.ahyp
    public final void pJ() {
    }

    @Override // defpackage.aich
    public final void q(aicg aicgVar) {
        this.g = aicgVar;
        ahpx ahpxVar = this.c;
        if (ahpxVar != null) {
            ahpxVar.h = aicgVar;
        }
    }

    @Override // defpackage.ahku
    public final void qT(ahof ahofVar, ahob ahobVar) {
        ahpw ahpwVar = new ahpw(this.a, this.b, ahofVar, ahobVar);
        ahno ahnoVar = new ahno(ahpwVar.b.clone(), ahpwVar.f.b);
        ahnoVar.n(0.0f, 14.0f, 0.0f);
        ahpx ahpxVar = ahpwVar.a;
        ahpxVar.f = ahnoVar;
        ahpxVar.q(ahnoVar);
        ahpp ahppVar = new ahpp(ahpwVar.g, (AudioManager) ahpwVar.d.getSystemService("audio"), ahpwVar.e, ahpwVar.f.b, ahpwVar.b.clone(), new ahpu(ahpwVar.a), new ahpt(ahpwVar));
        ahppVar.n(0.0f, ahom.a(-60.0f), 0.0f);
        ahppVar.a(ahpwVar.f.h);
        ahpx ahpxVar2 = ahpwVar.a;
        ahpxVar2.c = ahppVar;
        ahpxVar2.q(ahppVar);
        ahqq ahqqVar = new ahqq(ahpwVar.g, ahpwVar.b.clone(), new ahpv(ahpwVar), ahpwVar.e);
        ahqqVar.n(0.0f, 7.0f, 0.0f);
        ahpx ahpxVar3 = ahpwVar.a;
        ahpxVar3.e = ahqqVar;
        ahpxVar3.q(ahqqVar);
        ahpx ahpxVar4 = ahpwVar.a;
        ahpxVar4.q = ahpwVar.e.k;
        ahjp ahjpVar = new ahjp(ahpwVar.c, ahpwVar.d, ahpxVar4.a, ahpwVar.b.clone(), ahpwVar.e.a.c(), 10.5f, true);
        ahjpVar.n(0.0f, 7.0f, 0.0f);
        ahjpVar.qS(true);
        ahpx ahpxVar5 = ahpwVar.a;
        ahpxVar5.b = ahjpVar;
        ahpxVar5.q(ahjpVar);
        ahpwVar.e.a(ahpwVar.a);
        ahpwVar.e.c(ahpwVar.a);
        ahob ahobVar2 = ahpwVar.f;
        ahpx ahpxVar6 = ahpwVar.a;
        ahobVar2.f = ahpxVar6;
        ahobVar2.h(ahpxVar6.n);
        ahob ahobVar3 = ahpwVar.f;
        ahpx ahpxVar7 = ahpwVar.a;
        ahobVar3.i = ahpxVar7;
        ahobVar3.j = ahpxVar7;
        h(ahpxVar7);
        ahobVar.d(ahpxVar7);
    }

    @Override // defpackage.ahku
    public final void qU() {
        h(null);
    }

    @Override // defpackage.ahyp
    public final /* synthetic */ void x() {
        ahfo.a(this);
    }

    @Override // defpackage.ahyp
    public final void y(auad auadVar, boolean z) {
    }
}
