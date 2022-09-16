package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.accessibility.CaptioningManager;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: keh  reason: default package */
/* loaded from: classes3.dex */
public final class keh extends fdm implements ezg, aiwa {
    public final aiwb a;
    public final aiyx b;
    private final aiau c;
    private final CaptioningManager d;
    private final Context e;
    private final ezh f;
    private boolean g;
    private SubtitlesStyle h;
    private SubtitleTrack i;
    private Runnable j;

    public keh(Context context, CaptioningManager captioningManager, aiwb aiwbVar, aiyx aiyxVar, aiau aiauVar, feh fehVar, ezh ezhVar) {
        super(fehVar);
        this.e = context;
        this.c = aiauVar;
        this.b = aiyxVar;
        this.d = captioningManager;
        this.f = ezhVar;
        this.a = aiwbVar;
        aiwbVar.j.add(this);
    }

    @Override // defpackage.aiwa
    public final void a() {
        this.i = this.a.m;
        Runnable runnable = this.j;
        if (runnable != null) {
            runnable.run();
            this.j = null;
        }
    }

    @Override // defpackage.feg
    public final void kF() {
        this.f.j(this);
    }

    @Override // defpackage.feg
    public final void nr() {
        this.f.i(this);
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pa(ezx ezxVar) {
    }

    @Override // defpackage.ezg
    public final void pb(ezx ezxVar, ezx ezxVar2) {
        CaptioningManager captioningManager;
        if (!ezxVar.d() || ezxVar2.d()) {
            if (!ezxVar.d() && ezxVar2.d()) {
                this.j = null;
            }
        } else {
            Runnable runnable = new Runnable() { // from class: keg
                @Override // java.lang.Runnable
                public final void run() {
                    keh kehVar = keh.this;
                    if (!((Boolean) ylx.g(kehVar.b.a.b(), 1L, TimeUnit.SECONDS, false)).booleanValue()) {
                        kehVar.a.g(null, false);
                    }
                }
            };
            this.j = runnable;
            if (this.i != null) {
                runnable.run();
                this.j = null;
                this.i = null;
            }
        }
        if (!ezxVar2.d() || (captioningManager = this.d) == null || captioningManager.isEnabled()) {
            if (!this.g) {
                return;
            }
            this.c.i(this.b.b());
            this.c.g(this.b.a());
            this.c.h(0, 0);
            this.g = false;
            return;
        }
        this.c.g(1.0f);
        aiau aiauVar = this.c;
        if (this.h == null) {
            Resources resources = this.e.getResources();
            Resources.Theme theme = this.e.getTheme();
            this.h = new SubtitlesStyle(gw.a(resources, R.color.inline_muted_subtitles_background, theme), gw.a(resources, R.color.inline_muted_subtitles_window, theme), gw.a(resources, R.color.inline_muted_subtitles_edge, theme), 5, gw.a(resources, R.color.inline_muted_subtitles_text, theme), 8);
        }
        aiauVar.i(this.h);
        this.c.h(this.e.getResources().getDimensionPixelOffset(R.dimen.inline_muted_subtitles_padding), 0);
        this.g = true;
    }
}
