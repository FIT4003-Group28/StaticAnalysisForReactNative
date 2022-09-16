package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.player.YouTubePlayerViewNotForReflection;
/* compiled from: PG */
/* renamed from: ofh  reason: default package */
/* loaded from: classes3.dex */
public final class ofh implements fej, nxd {
    private final Rect a = new Rect();
    private final Rect b = new Rect();
    private final jvo c;
    private final nzy d;

    public ofh(jvo jvoVar, nzy nzyVar) {
        this.c = jvoVar;
        this.d = nzyVar;
    }

    private static void b(nxe nxeVar, Rect rect) {
        Rect v = nxeVar.v();
        Rect t = nxeVar.t();
        rect.set(v);
        rect.offset(-t.left, -t.top);
    }

    @Override // defpackage.fej
    public final void g(View view) {
        b(this.d.c(), this.a);
        view.layout(this.a.left, this.a.top, this.a.right, this.a.bottom);
    }

    @Override // defpackage.fej
    public final void h(View view) {
        Rect v = this.d.c().v();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(v.width(), 1073741824), 0, layoutParams.width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(v.height(), 1073741824), 0, layoutParams.height));
    }

    @Override // defpackage.nxd
    public final void ph(nxe nxeVar) {
        YouTubePlayerViewNotForReflection youTubePlayerViewNotForReflection;
        b(nxeVar, this.b);
        if (!this.a.equals(this.b) && (youTubePlayerViewNotForReflection = ((jwi) this.c.get()).aT) != null) {
            youTubePlayerViewNotForReflection.requestLayout();
        }
    }
}
