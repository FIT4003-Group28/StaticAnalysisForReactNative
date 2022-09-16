package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: agso  reason: default package */
/* loaded from: classes.dex */
public final class agso implements aiwj {
    public final afyf a;
    public final agrf b;
    private final aiwj c;
    private final Executor d;
    private final yrj e;

    public agso(aiwj aiwjVar, Executor executor, yrj yrjVar, agrf agrfVar, afyf afyfVar) {
        aiwjVar.getClass();
        this.c = aiwjVar;
        executor.getClass();
        this.d = executor;
        yrjVar.getClass();
        this.e = yrjVar;
        agrfVar.getClass();
        this.b = agrfVar;
        this.a = afyfVar;
    }

    @Override // defpackage.aiwj
    public final void a(final aiwi aiwiVar, final yiw yiwVar) {
        if (!this.e.p() || aiwiVar.a.k()) {
            this.d.execute(new Runnable() { // from class: agsn
                @Override // java.lang.Runnable
                public final void run() {
                    agso agsoVar = agso.this;
                    aiwi aiwiVar2 = aiwiVar;
                    yiw yiwVar2 = yiwVar;
                    try {
                        SubtitleTrack subtitleTrack = aiwiVar2.a;
                        if (subtitleTrack.e() == null) {
                            agvx a = agsoVar.b.a();
                            yix c = yix.c();
                            a.t(subtitleTrack.i(), c);
                            List<SubtitleTrack> list = (List) c.get();
                            if (list != null) {
                                for (SubtitleTrack subtitleTrack2 : list) {
                                    if (subtitleTrack2 != null && TextUtils.equals(subtitleTrack.j(), subtitleTrack2.j()) && TextUtils.equals(subtitleTrack.i(), subtitleTrack2.i())) {
                                        subtitleTrack = subtitleTrack2;
                                        break;
                                    }
                                }
                            }
                            subtitleTrack = null;
                        }
                        if (subtitleTrack == null) {
                            yiwVar2.a(aiwiVar2, new IOException());
                        } else {
                            agsoVar.a.a(new aiwi(subtitleTrack), yiwVar2);
                        }
                    } catch (Exception e) {
                        yiwVar2.a(aiwiVar2, e);
                    }
                }
            });
        } else {
            this.c.a(aiwiVar, yiwVar);
        }
    }

    @Override // defpackage.aiwj
    public final void b(aiwi aiwiVar, yiw yiwVar) {
        this.c.b(aiwiVar, yiwVar);
    }
}
