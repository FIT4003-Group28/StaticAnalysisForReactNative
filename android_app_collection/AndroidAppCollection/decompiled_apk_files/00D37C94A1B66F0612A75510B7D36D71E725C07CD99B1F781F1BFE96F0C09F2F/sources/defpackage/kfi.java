package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
/* compiled from: PG */
/* renamed from: kfi  reason: default package */
/* loaded from: classes3.dex */
public final class kfi {
    public final kfb a;
    public final aifs b;
    public final khk c;
    public YouTubeControlsOverlay e;
    public int f;
    public int g;
    public int h;
    public int i;
    public String k;
    public yye l;
    public yye m;
    public yye n;
    public yye o;
    public yye p;
    private final aizn q;
    public int j = 0;
    public final aypf d = new aypf();

    public kfi(kfb kfbVar, aifs aifsVar, aizn aiznVar, khk khkVar) {
        this.a = kfbVar;
        this.b = aifsVar;
        this.q = aiznVar;
        this.c = khkVar;
    }

    public static void b(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = i;
        marginLayoutParams.rightMargin = i2;
    }

    public static boolean c(kfe kfeVar) {
        ControlsOverlayStyle controlsOverlayStyle = kfeVar.m;
        if (controlsOverlayStyle.u) {
            return (kfeVar.e || kfeVar.f) && !kfeVar.c && !ControlsOverlayStyle.a(controlsOverlayStyle) && !kfeVar.g && !kfeVar.h && !kfeVar.i && !kfeVar.j;
        }
        return false;
    }

    public static void d(yye yyeVar, int i) {
        if (yyeVar == null) {
            return;
        }
        yyeVar.d = i;
    }

    public final void a(boolean z) {
        long j;
        if (z) {
            j = this.b.a().toMillis();
        } else {
            j = -this.b.a().toMillis();
        }
        this.q.g(j);
        YouTubeControlsOverlay youTubeControlsOverlay = this.e;
        youTubeControlsOverlay.l.post(youTubeControlsOverlay.F);
    }
}
