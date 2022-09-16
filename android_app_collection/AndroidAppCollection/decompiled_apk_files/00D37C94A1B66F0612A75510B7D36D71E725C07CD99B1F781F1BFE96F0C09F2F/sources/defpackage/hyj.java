package defpackage;

import com.google.protos.youtube.api.innertube.SectionListRendererOuterClass;
import com.google.protos.youtube.api.innertube.ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: hyj  reason: default package */
/* loaded from: classes3.dex */
public final class hyj implements aafl {
    private final hyx a;

    public hyj(hyx hyxVar) {
        this.a = hyxVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        auqh auqhVar;
        aunb aunbVar;
        if (apzgVar.qn(ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.showReelsCommentsOverlayCommand)) {
            if (((ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand) apzgVar.qm(ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.showReelsCommentsOverlayCommand)).b == 1) {
                ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand showReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand = (ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand) apzgVar.qm(ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.showReelsCommentsOverlayCommand);
                if (showReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.b == 1) {
                    aunbVar = (aunb) showReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.c;
                } else {
                    aunbVar = aunb.a;
                }
                auqhVar = (auqh) aunbVar.qm(SectionListRendererOuterClass.sectionListRenderer);
            } else {
                auqhVar = null;
            }
            final hyx hyxVar = this.a;
            if (hyxVar.h.ap() || hyxVar.i != null) {
                return;
            }
            hyxVar.f.A(hyxVar.e.oi());
            hyxVar.g.h();
            hyxVar.d.c();
            hyxVar.g.K(new aakw(auqhVar));
            hyxVar.i = hyxVar.a.getSupportFragmentManager().l();
            hyxVar.i.v(new Runnable() { // from class: hyw
                @Override // java.lang.Runnable
                public final void run() {
                    hyx.this.i = null;
                }
            });
            hyxVar.h.aH(hyxVar.i, hyxVar.b, "REEL_COMMENT_VIEW_TAG");
            hyxVar.c.a();
            hyxVar.g.l();
        }
    }
}
