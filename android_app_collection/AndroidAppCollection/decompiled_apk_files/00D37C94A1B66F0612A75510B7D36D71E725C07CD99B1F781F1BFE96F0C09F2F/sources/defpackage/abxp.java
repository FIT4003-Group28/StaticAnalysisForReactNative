package defpackage;

import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: abxp  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class abxp implements abtu {
    public final /* synthetic */ abyk a;
    private final /* synthetic */ int b;

    public /* synthetic */ abxp(abyk abykVar) {
        this.a = abykVar;
    }

    public /* synthetic */ abxp(abyk abykVar, int i) {
        this.b = i;
        this.a = abykVar;
    }

    @Override // defpackage.abtu
    public final void a(int i) {
        if (this.b != 0) {
            abyk abykVar = this.a;
            if (!abykVar.U || !abykVar.j.k()) {
                return;
            }
            if (i != 7 && i != 9) {
                if (i == 37) {
                    abykVar.k.e();
                    abykVar.j.m();
                    return;
                }
                switch (i) {
                    case 12:
                    case 19:
                        break;
                    case 13:
                    case 15:
                        abykVar.g.d(0, abykVar.R, abykVar.u.getString(R.string.lc_error_video_quality_good), true);
                        return;
                    case 14:
                        zep.b("Capture video quality is poor. Video is likely unusable.");
                        abykVar.g.d(2, abykVar.R, abykVar.u.getString(R.string.lc_error_video_quality_poor), false);
                        return;
                    case 16:
                    case 18:
                        if (!abykVar.w()) {
                            return;
                        }
                        abykVar.g.d(0, abykVar.Q, abykVar.u.getString(R.string.lc_error_audio_quality_good), true);
                        return;
                    case 17:
                        zep.b("Capture audio frame rate is poor. Audio is likely unusable.");
                        if (!abykVar.w() || !abykVar.j.l()) {
                            return;
                        }
                        abykVar.g.d(2, abykVar.Q, abykVar.u.getString(R.string.lc_error_audio_quality_poor), false);
                        return;
                    default:
                        switch (i) {
                            case 28:
                            case 30:
                                abykVar.g.d(0, abykVar.S, abykVar.u.getString(R.string.lc_error_video_quality_good), true);
                                return;
                            case 29:
                                zep.b("ABR controller video quality is poor. Video is likely unusable.");
                                abykVar.g.d(2, abykVar.S, abykVar.u.getString(R.string.lc_error_video_quality_poor), false);
                                return;
                            default:
                                StringBuilder sb = new StringBuilder(26);
                                sb.append("Capture error: ");
                                sb.append(i);
                                zep.b(sb.toString());
                                abykVar.h(i);
                                return;
                        }
                }
            }
            abykVar.u(true, true);
            zep.b("Codec or communication error during capture. Offering retry.");
            if (abykVar.j.l()) {
                abykVar.j.e(5);
                return;
            } else {
                abykVar.j.m();
                return;
            }
        }
        abyk abykVar2 = this.a;
        if (!abykVar2.d.d() || !abxb.c(i)) {
            return;
        }
        abykVar2.t.removeCallbacks(new abxm(abykVar2, 1));
        abykVar2.a();
    }
}
