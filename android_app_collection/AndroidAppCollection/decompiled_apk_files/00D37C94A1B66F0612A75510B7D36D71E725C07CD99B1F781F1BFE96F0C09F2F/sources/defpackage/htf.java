package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.StickerCatalogRendererOuterClass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: htf  reason: default package */
/* loaded from: classes3.dex */
public final class htf extends xo implements htd {
    public static final Object d = new Object();
    private final HandlerThread A;
    private final acth B;
    public final Handler e;
    public final hsq h;
    public final hub i;
    public final hrd j;
    public final hun k;
    public final hut l;
    public final hvl m;
    public final hvd n;
    public final hvh o;
    public final hta p;
    public final hux q;
    public final hvk r;
    public dp s;
    public htk t;
    public boolean v;
    public hrm w;
    public final hvl x;
    private final Context y;
    private final int z;
    public final List f = new ArrayList();
    public final Set g = Collections.synchronizedSet(new HashSet());
    public int u = 4;

    public htf(Context context, hsq hsqVar, hub hubVar, hrd hrdVar, hut hutVar, hvl hvlVar, hvl hvlVar2, hvd hvdVar, hvh hvhVar, acth acthVar, hux huxVar, hta htaVar, final hvk hvkVar, hun hunVar, byte[] bArr) {
        this.y = context;
        this.h = hsqVar;
        this.i = hubVar;
        this.j = hrdVar;
        this.k = hunVar;
        this.l = hutVar;
        this.m = hvlVar;
        this.x = hvlVar2;
        this.n = hvdVar;
        this.o = hvhVar;
        this.B = acthVar;
        this.p = htaVar;
        this.q = huxVar;
        this.r = hvkVar;
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.z = point.x;
        this.e = new Handler(context.getMainLooper());
        HandlerThread handlerThread = new HandlerThread("htf");
        this.A = handlerThread;
        handlerThread.start();
        new Handler(handlerThread.getLooper());
        hvkVar.c.execute(new Runnable() { // from class: hvi
            @Override // java.lang.Runnable
            public final void run() {
                hvk hvkVar2 = hvk.this;
                ylr.b();
                hvkVar2.a = new znh(hvkVar2.b, 1, zny.c, zny.g, hvkVar2.d);
            }
        });
    }

    @Override // defpackage.htd
    public final acti a() {
        return this.B.oi();
    }

    @Override // defpackage.xo
    public final int b() {
        return this.f.size();
    }

    @Override // defpackage.xo
    public final int c(int i) {
        if (((aunb) this.f.get(i)).qn(StickerCatalogRendererOuterClass.dynamicStickerRenderer)) {
            int e = aqvb.e(((auzh) ((aunb) this.f.get(i)).qm(StickerCatalogRendererOuterClass.dynamicStickerRenderer)).c);
            if (e == 0) {
                e = 1;
            }
            return e - 1;
        }
        return CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    }

    @Override // defpackage.htd
    public final void d(Runnable runnable) {
        this.e.postAtTime(runnable, d, SystemClock.uptimeMillis());
    }

    @Override // defpackage.htd
    public final void e(Uri uri) {
        htk htkVar;
        this.g.remove(uri);
        if (!this.g.isEmpty() || (htkVar = this.t) == null) {
            return;
        }
        htkVar.aK(false);
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ yo f(ViewGroup viewGroup, int i) {
        View inflate;
        yo hrkVar;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        int i2 = this.z / this.u;
        if (i == Integer.MIN_VALUE) {
            inflate = from.inflate(R.layout.sticker_cell, viewGroup, false);
            inflate.getLayoutParams().height = i2;
            inflate.getLayoutParams().width = i2;
            hrkVar = new hrk(inflate, this, this.q, this.s);
        } else if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 7 || i == 8 || i == 9) {
            inflate = from.inflate(R.layout.sticker_catalog_dynamic_sticker_container, viewGroup, false);
            inflate.getLayoutParams().height = i2;
            inflate.getLayoutParams().width = i2;
            hrkVar = new hsc(inflate, this, this.q, this.s);
        } else {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Unexpected view type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i == 3 && Build.VERSION.SDK_INT == 28) {
            inflate.setLayerType(1, null);
        }
        return hrkVar;
    }

    @Override // defpackage.htd
    public final void g(aunb aunbVar) {
        e(hve.b(aunbVar));
        int indexOf = this.f.indexOf(aunbVar);
        this.f.remove(aunbVar);
        n(indexOf);
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ void o(yo yoVar, int i) {
        hte hteVar = (hte) yoVar;
        hteVar.x = (aunb) this.f.get(i);
        hteVar.E();
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ void p(yo yoVar) {
        ((hte) yoVar).F();
    }
}
