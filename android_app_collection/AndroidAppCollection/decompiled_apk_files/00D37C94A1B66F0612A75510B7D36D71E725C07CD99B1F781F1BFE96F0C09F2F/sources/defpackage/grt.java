package defpackage;

import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.util.LruCache;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: grt  reason: default package */
/* loaded from: classes3.dex */
public final class grt extends xo implements aihq {
    public aihr d;
    public int e;
    public long f;
    public final int j;
    public int k;
    public boolean m;
    private final WeakReference o;
    public long g = 0;
    public final amtb h = amtb.a(((int) Math.ceil(6.0d)) + 4);
    public final LruCache i = new LruCache(((int) Math.ceil(6.0d)) + 4);
    public int l = 0;
    public boolean n = false;

    public grt(RecyclerView recyclerView, aihr aihrVar, long j, int i, boolean z) {
        this.m = false;
        this.o = new WeakReference(recyclerView);
        this.d = aihrVar;
        this.f = j;
        this.e = i;
        aihrVar.b(this);
        this.j = gre.a(recyclerView.getContext());
        this.m = z;
    }

    private final synchronized void A(int i) {
        this.h.add(Integer.valueOf(i));
        if (this.h.size() == 1) {
            B();
        }
    }

    private final synchronized void B() {
        if (!this.h.isEmpty()) {
            int intValue = ((Integer) this.h.peek()).intValue();
            if (this.n) {
                this.d.k(z(intValue) + this.g, intValue);
                return;
            }
            this.d.k(z(intValue), intValue);
        }
    }

    private final long z(int i) {
        if (!this.m) {
            if (b() != 0) {
                return (this.f * i) / b();
            }
            return 0L;
        }
        int i2 = this.e;
        if (i2 != 0) {
            return (this.f * i) / i2;
        }
        return 0L;
    }

    @Override // defpackage.xo
    public final int b() {
        return this.m ? this.e + 2 : this.e;
    }

    @Override // defpackage.xo
    public final int c(int i) {
        if (this.m) {
            return (i == 0 || i == b() + (-1)) ? 1 : 0;
        }
        return 0;
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ yo f(ViewGroup viewGroup, int i) {
        ViewGroup.LayoutParams layoutParams;
        int width = viewGroup.getWidth() / ((int) Math.ceil(6.0d));
        this.k = width;
        if (i == 0 || !this.m) {
            layoutParams = new ViewGroup.LayoutParams(width, zew.i(viewGroup.getResources().getDisplayMetrics(), 66));
        } else {
            layoutParams = new ViewGroup.LayoutParams(this.j, zew.i(viewGroup.getResources().getDisplayMetrics(), 66));
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(layoutParams);
        return new gru(frameLayout);
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ void o(yo yoVar, int i) {
        gru gruVar = (gru) yoVar;
        if (!this.m || (i != 0 && i != b() - 1)) {
            if (this.m) {
                i = Math.max(i - 1, 0);
            }
            Bitmap bitmap = (Bitmap) this.i.get(Integer.valueOf(i));
            if (bitmap == null || bitmap.isRecycled()) {
                A(i);
                int i2 = gru.v;
                gruVar.t.setImageBitmap(null);
                gruVar.t.setVisibility(4);
                gruVar.u.setVisibility(0);
                return;
            }
            int i3 = gru.v;
            gruVar.t.setImageBitmap(bitmap);
            gruVar.t.setVisibility(0);
            gruVar.u.setVisibility(4);
            return;
        }
        int i4 = gru.v;
        gruVar.t.setImageBitmap(null);
        gruVar.t.setVisibility(4);
        gruVar.u.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int w() {
        if (this.m) {
            int i = this.k;
            int b = b();
            int i2 = this.j;
            return (i * (b - 2)) + i2 + i2;
        }
        return this.k * b();
    }

    @Override // defpackage.aihq
    public final void x(int i, int i2) {
        RecyclerView recyclerView;
        this.l++;
        this.h.remove(Integer.valueOf(i));
        if (i2 == 4 && this.l < 30 && (recyclerView = (RecyclerView) this.o.get()) != null) {
            recyclerView.postDelayed(new grs(this, i, 1), this.l * 100);
        }
        B();
    }

    @Override // defpackage.aihq
    public final void y(aiht aihtVar, int i) {
        this.l = 0;
        amtb amtbVar = this.h;
        Integer valueOf = Integer.valueOf(i);
        amtbVar.remove(valueOf);
        if (aihtVar == null || i < 0) {
            return;
        }
        if (!aihtVar.a.equals(this.i.get(valueOf))) {
            this.i.put(valueOf, aihtVar.a.copy(Bitmap.Config.ARGB_8888, false));
            RecyclerView recyclerView = (RecyclerView) this.o.get();
            if (recyclerView == null || !recyclerView.av()) {
                ok(i);
            } else {
                recyclerView.post(new grs(this, i));
            }
        }
        B();
    }
}
