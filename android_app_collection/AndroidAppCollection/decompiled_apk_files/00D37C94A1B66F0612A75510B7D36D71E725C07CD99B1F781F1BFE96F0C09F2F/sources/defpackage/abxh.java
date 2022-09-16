package defpackage;

import com.google.android.libraries.youtube.livecreation.screencast.ScreencastHostService;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: abxh  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class abxh implements abtv {
    public final /* synthetic */ abyk a;
    public final /* synthetic */ abyc b;
    private final /* synthetic */ int c;

    public /* synthetic */ abxh(abyk abykVar, abyc abycVar) {
        this.a = abykVar;
        this.b = abycVar;
    }

    public /* synthetic */ abxh(abyk abykVar, abyc abycVar, int i) {
        this.c = i;
        this.a = abykVar;
        this.b = abycVar;
    }

    @Override // defpackage.abtv
    public final void a(int i) {
        if (this.c != 0) {
            abyk abykVar = this.a;
            abyc abycVar = this.b;
            if (i != 0) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Capture pause error: ");
                sb.append(i);
                zep.b(sb.toString());
                if (abykVar.U) {
                    abykVar.g.d(2, abykVar.P, abykVar.u.getString(R.string.lc_error_pause_resume_failed), false);
                }
            }
            ScreencastHostService screencastHostService = ((aceg) abycVar).a;
            if (i == 0) {
                screencastHostService.o.j(acfg.DEFAULT, screencastHostService.getString(R.string.screencast_stream_paused));
                screencastHostService.r.b = true;
                return;
            }
            screencastHostService.o.g(false);
            screencastHostService.o.j(acfg.ERROR, screencastHostService.getString(R.string.screencast_pause_error));
            return;
        }
        abyk abykVar2 = this.a;
        abyc abycVar2 = this.b;
        if (i != 0) {
            StringBuilder sb2 = new StringBuilder(33);
            sb2.append("Capture resume error: ");
            sb2.append(i);
            zep.b(sb2.toString());
            if (abykVar2.U) {
                abykVar2.g.d(2, abykVar2.P, abykVar2.u.getString(R.string.lc_error_pause_resume_failed), false);
            }
        }
        ScreencastHostService screencastHostService2 = ((aceg) abycVar2).a;
        if (i == 0) {
            screencastHostService2.o.j(acfg.DEFAULT, screencastHostService2.getString(R.string.screencast_stream_resumed));
            screencastHostService2.r.b = false;
            return;
        }
        screencastHostService2.o.g(true);
        screencastHostService2.o.j(acfg.ERROR, screencastHostService2.getString(R.string.screencast_resume_error));
    }
}
