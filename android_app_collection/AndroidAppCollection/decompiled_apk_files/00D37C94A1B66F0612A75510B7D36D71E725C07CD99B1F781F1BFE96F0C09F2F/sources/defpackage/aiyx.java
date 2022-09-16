package defpackage;

import android.content.Context;
import android.view.accessibility.CaptioningManager;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aiyx  reason: default package */
/* loaded from: classes.dex */
public final class aiyx {
    public final aitm a;
    public final aacz b;
    private final Context c;
    private final Set d;
    private CaptioningManager e;
    private aiyw f;

    public aiyx(Context context, aitm aitmVar, aacz aaczVar) {
        aitmVar.getClass();
        this.a = aitmVar;
        context.getClass();
        this.c = context;
        this.d = new HashSet();
        this.b = aaczVar;
    }

    private final CaptioningManager g() {
        if (this.e == null) {
            this.e = (CaptioningManager) this.c.getSystemService("captioning");
        }
        return this.e;
    }

    public final float a() {
        return g().getFontScale();
    }

    public final SubtitlesStyle b() {
        return new SubtitlesStyle(g().getUserStyle(), this.b);
    }

    public final synchronized void c(float f) {
        for (aiyq aiyqVar : this.d) {
            aiyqVar.n(f);
        }
    }

    public final synchronized void d(SubtitlesStyle subtitlesStyle) {
        for (aiyq aiyqVar : this.d) {
            aiyqVar.o(subtitlesStyle);
        }
    }

    public final synchronized void e(aiyq aiyqVar) {
        if (this.d.isEmpty()) {
            this.f = new aiyw(this);
            g().addCaptioningChangeListener(this.f);
        }
        this.d.add(aiyqVar);
    }

    public final synchronized void f(aiyq aiyqVar) {
        this.d.remove(aiyqVar);
        if (this.d.isEmpty()) {
            g().removeCaptioningChangeListener(this.f);
        }
    }
}
