package defpackage;

import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import com.google.android.libraries.video.media.VideoMetaData;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
/* compiled from: PG */
/* renamed from: vvm  reason: default package */
/* loaded from: classes4.dex */
public final class vvm implements vvl {
    public final VideoMetaData a;
    final /* synthetic */ vvo d;
    private vvf j;
    private int e = -1;
    private int f = -1;
    private int g = -1;
    private int h = -1;
    private final vvn k = new vvn();
    public final vvn b = new vvn();
    public final vvn c = new vvn();
    private PriorityBlockingQueue i = new PriorityBlockingQueue(10);

    public vvm(vvo vvoVar, VideoMetaData videoMetaData) {
        this.d = vvoVar;
        this.a = videoMetaData;
        e();
    }

    @Override // defpackage.vvl
    public final synchronized vvs a() {
        return this.k;
    }

    @Override // defpackage.vvl
    public final synchronized vvs b() {
        return this.b;
    }

    public final vvi c() {
        vvi vviVar = (vvi) this.c.a;
        if (vviVar == null) {
            vviVar = new vvi(this.a);
            this.c.a(vviVar);
        }
        aqxo.y(this.a.equals(vviVar.a));
        return vviVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(vvb vvbVar) {
        this.i.add(vvbVar);
    }

    public final synchronized void e() {
        int max;
        float f;
        int i;
        int i2;
        int i3;
        vvo vvoVar = this.d;
        if (vvoVar.d && vvoVar.e && vvoVar.g != null) {
            boolean z = false;
            aqxo.y(vvoVar.c != null);
            int dimensionPixelSize = this.d.c.getResources().getDimensionPixelSize(R.dimen.thumbnail_long_edge);
            float a = this.a.a();
            if (a <= 1.0f) {
                dimensionPixelSize = (int) (dimensionPixelSize * a);
            }
            int round = Math.round(dimensionPixelSize / a);
            if (dimensionPixelSize != this.e || round != this.f) {
                this.e = dimensionPixelSize;
                this.f = round;
                aqxo.y(dimensionPixelSize > 0 && round > 0);
                long j = this.e * this.f * 4;
                Runtime runtime = Runtime.getRuntime();
                long maxMemory = (runtime.maxMemory() - runtime.totalMemory()) + runtime.freeMemory();
                vvi vviVar = (vvi) this.c.a;
                if (vviVar != null) {
                    synchronized (vviVar.b) {
                        Iterator it = vviVar.b.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            Bitmap b = ((vvg) it.next()).b();
                            if (b != null) {
                                i += b.getByteCount();
                            }
                        }
                    }
                    maxMemory += i;
                }
                double d = maxMemory;
                Double.isNaN(d);
                int max2 = (int) (Math.max(0L, Math.min((long) (d * 0.2d), maxMemory - 201326592)) / j);
                DisplayMetrics displayMetrics = this.d.c.getResources().getDisplayMetrics();
                if (this.d.h) {
                    max = displayMetrics.widthPixels;
                } else {
                    max = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int max3 = (int) Math.max(1.0d, Math.floor(f / Math.round((this.e * this.d.c.getResources().getDimensionPixelSize(R.dimen.video_trim_view_thumbnail_height)) / this.f)));
                this.g = max3;
                this.g = Math.min(max3, this.a.h());
                this.h = Math.max(0, Math.min(Math.min((int) Math.ceil((((float) this.a.g) / 1000000.0f) * 4.0f), this.a.h()), Math.min((int) (max / (this.d.c.getResources().getDisplayMetrics().density * 4.0f)), max2 - this.g)));
                f();
            }
            vvi c = c();
            if (this.i != null) {
                z = true;
            }
            aqxo.y(z);
            if (((vvc) this.k.a) == null && (i3 = this.g) > 0) {
                vvc vvcVar = new vvc(vvo.f(this.a, i3), c, "Overview", 100);
                d(vvcVar);
                this.k.a(vvcVar);
            }
            if (((vvc) this.b.a) == null && (i2 = this.h) > 0) {
                vvc vvcVar2 = new vvc(vvo.f(this.a, i2), vuu.b, c, "Seek Preview", 0);
                d(vvcVar2);
                this.b.a(vvcVar2);
            }
            if (this.j != null) {
                return;
            }
            aqxo.y(true);
            vvo vvoVar2 = this.d;
            vvf vvfVar = new vvf(vvoVar2.c, this.a, this.e, this.f, this.i, vvoVar2.a, vvoVar2.b, vvoVar2.g);
            this.j = vvfVar;
            vvfVar.start();
        }
    }

    public final synchronized void f() {
        g();
        vvs a = this.k.a(null);
        if (a != null) {
            a.j();
        }
        vvs a2 = this.b.a(null);
        if (a2 != null) {
            a2.j();
        }
        this.i.clear();
        this.i = new PriorityBlockingQueue(10);
        vvs a3 = this.c.a(null);
        if (a3 != null) {
            a3.j();
        }
    }

    public final synchronized void g() {
        if (this.j != null) {
            aqxo.y(true);
            this.j.a();
            this.j = null;
        }
    }
}
