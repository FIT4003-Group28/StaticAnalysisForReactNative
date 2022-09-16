package defpackage;

import com.google.android.libraries.youtube.livecreation.screencast.ScreencastHostService;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: acdw  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class acdw {
    public final /* synthetic */ ScreencastHostService a;

    public /* synthetic */ acdw(ScreencastHostService screencastHostService) {
        this.a = screencastHostService;
    }

    public final void a(String str) {
        ScreencastHostService screencastHostService = this.a;
        ((vpg) screencastHostService.l.g.get()).b(str);
        if (str.equals("SUCCESS") || screencastHostService.j.a() <= 0) {
            return;
        }
        screencastHostService.k();
        screencastHostService.o.i(R.string.screencast_capture_active_error);
    }
}
