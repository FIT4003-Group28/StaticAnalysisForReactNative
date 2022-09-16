package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: aivy  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aivy implements ayqb {
    public final /* synthetic */ aiwb a;
    private final /* synthetic */ int b;

    public /* synthetic */ aivy(aiwb aiwbVar) {
        this.a = aiwbVar;
    }

    public /* synthetic */ aivy(aiwb aiwbVar, int i) {
        this.b = i;
        this.a = aiwbVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        SubtitleTrack c;
        int i = this.b;
        if (i == 0) {
            aiwb aiwbVar = this.a;
            if (((ahgk) obj).a()) {
                return;
            }
            aitl a = aiwbVar.c.a();
            a.b(null);
            a.b = "";
            ylx.m(a.a(), aiuv.c);
        } else if (i != 1) {
            if (i == 2) {
                aiwb aiwbVar2 = this.a;
                aiwbVar2.r = ((ahic) obj).a();
                aiwbVar2.s = false;
                return;
            }
            this.a.r = ((ahic) obj).a();
        } else {
            aiwb aiwbVar3 = this.a;
            aiyi aiyiVar = aiwbVar3.n;
            FormatStreamModel e = ((aesr) obj).e();
            if (aiyiVar == null || e == null || e.q().isEmpty()) {
                return;
            }
            String q = e.q();
            Iterator it = aiyiVar.a.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                atzq atzqVar = (atzq) it.next();
                if (TextUtils.equals(q, atzqVar.c)) {
                    aiyiVar.b = atzqVar;
                    break;
                }
            }
            SubtitleTrack subtitleTrack = aiwbVar3.m;
            if (subtitleTrack != null && subtitleTrack.l()) {
                aiwbVar3.m = null;
            }
            SubtitleTrack subtitleTrack2 = aiwbVar3.m;
            if (subtitleTrack2 != null && (c = aiyiVar.c(subtitleTrack2.c())) != null) {
                aiwbVar3.m = c;
            }
            aiwbVar3.h(aiwbVar3.m, false);
        }
    }
}
