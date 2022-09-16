package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import com.google.android.youtube.R;
import j$.util.Optional;
import j$.util.function.Consumer;
/* compiled from: PG */
/* renamed from: kmk  reason: default package */
/* loaded from: classes3.dex */
public final class kmk extends aihh implements ahwy {
    public final azpx a;
    public Optional b;
    public float c;
    private final View g;
    private final ffo h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final Rect m;
    private final Point n;
    private final ahwz o;
    private final int p;
    private final boolean q;
    private final boolean r;
    private Optional s;
    private boolean t;
    private View u;
    private View v;
    private View w;

    public kmk(ViewStub viewStub, View view, ffo ffoVar, aihr aihrVar, ahwz ahwzVar, aign aignVar, kce kceVar, aacz aaczVar) {
        super(viewStub, aihrVar);
        this.g = view;
        this.h = ffoVar;
        this.o = ahwzVar;
        this.n = new Point();
        this.m = new Rect();
        this.a = azpm.e();
        this.s = Optional.empty();
        this.b = Optional.empty();
        asxj asxjVar = aaczVar.b().e;
        boolean z = (asxjVar == null ? asxj.a : asxjVar).bE;
        this.q = z;
        asxj asxjVar2 = aaczVar.b().e;
        boolean z2 = (asxjVar2 == null ? asxj.a : asxjVar2).cI;
        this.r = z2;
        this.i = view.getResources().getDimensionPixelOffset(R.dimen.inline_scrubbed_preview_horizontal_margin);
        this.j = view.getResources().getDimensionPixelOffset(R.dimen.inline_scrubbed_preview_vertical_margin);
        this.k = view.getResources().getDimensionPixelOffset(R.dimen.inline_scrubbed_preview_vertical_margin_extended);
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        asxj asxjVar3 = aaczVar.b().e;
        this.l = zew.i(displayMetrics, (asxjVar3 == null ? asxj.a : asxjVar3).ax);
        this.p = view.getResources().getDimensionPixelSize(R.dimen.inline_scrubbed_preview_vertical_dismiss_offset);
        aignVar.a(new kmj(this));
        if (z) {
            kceVar.h.add(new kmh(this));
        }
        if (z2) {
            ahwzVar.g.b.A().n().Z(new kmi(this));
        }
    }

    private static float i(float f, float f2) {
        return (f * Math.abs(f2 + 0.0f)) + 0.0f;
    }

    @Override // defpackage.ahwy
    public final /* synthetic */ void c(aicb aicbVar, boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aihh
    public final aihj d() {
        Optional empty;
        ViewStub viewStub;
        if (this.e == null && (viewStub = this.d) != null) {
            this.e = (aihj) viewStub.inflate();
            this.d = null;
        }
        final aihj aihjVar = this.e;
        if (!this.t) {
            TextView textView = (TextView) aihjVar.findViewById(R.id.chapter_title);
            if (textView != null) {
                this.s = Optional.of(new yye(textView, null));
                this.o.i(aicb.CHAPTER, this);
            }
            if (this.r) {
                empty = Optional.ofNullable((TextView) aihjVar.findViewById(R.id.timed_decoration));
            } else {
                empty = Optional.empty();
            }
            empty.ifPresent(new Consumer() { // from class: kmg
                @Override // j$.util.function.Consumer
                public final void accept(Object obj) {
                    kmk.this.b = Optional.of(new yye((TextView) obj, null));
                }

                @Override // j$.util.function.Consumer
                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return consumer.getClass();
                }
            });
            if (this.l > 0) {
                this.u = aihjVar.findViewById(R.id.thumbnail_container);
                this.w = aihjVar.findViewById(R.id.close_icon);
                this.v = aihjVar.findViewById(R.id.timestamp);
                View findViewById = aihjVar.findViewById(R.id.thumbnail);
                textView.setMaxWidth(findViewById.getLayoutParams().width + this.l);
                zgd.t(textView, zgd.r(-2), ViewGroup.LayoutParams.class);
                zgd.t(aihjVar.findViewById(R.id.text_container), zgd.r(-2), ViewGroup.LayoutParams.class);
                textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: kme
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        kmk.this.e(aihjVar);
                    }
                });
                empty.ifPresent(new kho(findViewById, 2));
            }
            this.t = true;
        }
        return aihjVar;
    }

    @Override // defpackage.aihh
    public final void e(aihj aihjVar) {
        TimelineMarker[] m;
        this.h.j(this.n);
        int width = aihjVar.getWidth() / 2;
        int i = this.i;
        int width2 = this.g.getWidth() - this.i;
        int i2 = this.n.y;
        int i3 = (this.r && (m = this.o.m(aicb.HEATMAP_MARKER)) != null && m.length > 0) ? this.k : this.j;
        int max = Math.max(i + width, Math.min(this.n.x, width2 - width)) - width;
        aihjVar.setX(max);
        aihjVar.setY((i2 - i3) - aihjVar.getHeight());
        if (this.s.isPresent() && this.l > 0) {
            int width3 = this.u.getWidth() / 2;
            int max2 = Math.max(i + width3, Math.min(this.n.x, width2 - width3));
            float x = this.u.getX();
            float f = (max2 - width3) - max;
            this.u.setX(f);
            View view = this.v;
            view.setX(view.getX() - (x - f));
        }
        if (this.q) {
            float i4 = 1.0f - i(this.c, 0.3f);
            aihjVar.setScaleY(i4);
            aihjVar.setScaleX(i4);
            aihjVar.setY(aihjVar.getY() + ((int) i(this.c, this.p)));
            this.w.setAlpha(this.c);
            float i5 = 1.0f - i(this.c, 1.0f);
            this.v.setAlpha(i5);
            this.s.ifPresent(new kmf(i5));
        }
        aihjVar.getGlobalVisibleRect(this.m);
        this.a.c(this.m);
    }

    @Override // defpackage.ahwy
    public final void nD(TimelineMarker timelineMarker, TimelineMarker timelineMarker2, aicb aicbVar, int i) {
        if (aicbVar == aicb.CHAPTER && this.s.isPresent()) {
            CharSequence charSequence = timelineMarker2 == null ? null : timelineMarker2.e;
            ((TextView) ((yye) this.s.get()).b).setText(charSequence);
            ((yye) this.s.get()).a(!TextUtils.isEmpty(charSequence), false);
        }
    }

    @Override // defpackage.ahwy
    public final /* synthetic */ void nw(aicb aicbVar) {
    }
}
