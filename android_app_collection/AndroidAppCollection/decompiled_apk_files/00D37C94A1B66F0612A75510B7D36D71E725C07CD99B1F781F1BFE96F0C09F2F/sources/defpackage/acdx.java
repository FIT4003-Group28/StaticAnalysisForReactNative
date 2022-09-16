package defpackage;

import com.google.android.libraries.youtube.livecreation.screencast.ScreencastHostService;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: acdx  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class acdx implements Runnable {
    public final /* synthetic */ ScreencastHostService a;
    private final /* synthetic */ int b;

    public /* synthetic */ acdx(ScreencastHostService screencastHostService) {
        this.a = screencastHostService;
    }

    public /* synthetic */ acdx(ScreencastHostService screencastHostService, int i) {
        this.b = i;
        this.a = screencastHostService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            ScreencastHostService screencastHostService = this.a;
            if (screencastHostService.q.e()) {
                return;
            }
            screencastHostService.h.execute(new acdx(screencastHostService, 1));
        } else if (i == 1) {
            ScreencastHostService screencastHostService2 = this.a;
            screencastHostService2.o.g(false);
            screencastHostService2.o.j(acfg.ERROR, screencastHostService2.getString(R.string.screencast_pause_error));
        } else if (i == 2) {
            ScreencastHostService screencastHostService3 = this.a;
            screencastHostService3.o.g(true);
            screencastHostService3.o.j(acfg.ERROR, screencastHostService3.getString(R.string.screencast_resume_error));
        } else {
            ScreencastHostService screencastHostService4 = this.a;
            if (screencastHostService4.q.g()) {
                return;
            }
            screencastHostService4.h.execute(new acdx(screencastHostService4, 2));
        }
    }
}
