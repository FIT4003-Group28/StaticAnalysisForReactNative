package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.TimelineSeekBar;
/* compiled from: PG */
/* renamed from: hcj  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hcj implements ayqb {
    public final /* synthetic */ TimelineSeekBar a;
    private final /* synthetic */ int b;

    public /* synthetic */ hcj(TimelineSeekBar timelineSeekBar, int i) {
        this.b = i;
        this.a = timelineSeekBar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            TimelineSeekBar timelineSeekBar = this.a;
            Boolean bool = (Boolean) obj;
            if (timelineSeekBar.e.i()) {
                timelineSeekBar.g();
                return;
            }
            timelineSeekBar.removeCallbacks(timelineSeekBar.d);
            timelineSeekBar.c();
        } else if (i == 1) {
            TimelineSeekBar timelineSeekBar2 = this.a;
            if (((Boolean) obj).booleanValue()) {
                timelineSeekBar2.c.setMax((int) timelineSeekBar2.e.b());
                timelineSeekBar2.g();
                return;
            }
            timelineSeekBar2.removeCallbacks(timelineSeekBar2.d);
        } else {
            this.a.f(((Long) obj).longValue());
        }
    }
}
