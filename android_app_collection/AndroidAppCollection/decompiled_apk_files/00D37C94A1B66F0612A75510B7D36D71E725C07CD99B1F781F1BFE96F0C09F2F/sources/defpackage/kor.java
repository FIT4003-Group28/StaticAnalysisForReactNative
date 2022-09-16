package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: kor  reason: default package */
/* loaded from: classes3.dex */
public final class kor {
    public final Context a;
    public View b;
    public View c;
    public TextView d;
    public Animator.AnimatorListener e;
    public Animator.AnimatorListener f;
    public akgc g;
    private final ViewStub h;
    private final SparseArray i = new SparseArray();
    private final Map j = new HashMap();
    private boolean k;

    public kor(Context context, ViewStub viewStub) {
        this.a = context;
        this.h = viewStub;
        d();
    }

    private final void e(View view) {
        if (!this.j.containsKey(view) || this.j.get(view) == null) {
            return;
        }
        Animator animator = (Animator) this.j.get(view);
        animator.removeAllListeners();
        this.j.put(view, null);
        animator.cancel();
    }

    public final void a(View view, int i, Animator.AnimatorListener animatorListener) {
        view.setVisibility(0);
        if (this.i.get(i) == null) {
            this.i.put(i, AnimatorInflater.loadAnimator(this.a, i));
        }
        Animator animator = (Animator) this.i.get(i);
        e(view);
        this.j.put(view, animator);
        animator.setTarget(view);
        animator.removeAllListeners();
        if (animatorListener != null) {
            animator.addListener(animatorListener);
        }
        animator.start();
    }

    public final void b() {
        if (!this.k) {
            return;
        }
        a(this.c, R.animator.video_zoom_snap_threshold_indicator_hide, null);
        this.d.setVisibility(8);
    }

    public final void c() {
        if (this.k) {
            return;
        }
        View inflate = this.h.inflate();
        this.b = inflate;
        this.c = inflate.findViewById(R.id.video_zoom_snap_indicator);
        this.d = (TextView) this.b.findViewById(R.id.video_zoom_title);
        this.e = new kop(this);
        this.f = new koq(this);
        lj.V(this.d, 1);
        this.k = true;
    }

    public final void d() {
        if (!this.k) {
            return;
        }
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        e(this.c);
        e(this.d);
    }
}
