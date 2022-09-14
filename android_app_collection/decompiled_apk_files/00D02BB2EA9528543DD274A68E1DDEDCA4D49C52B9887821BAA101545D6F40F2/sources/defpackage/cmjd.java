package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.accessibility.CaptioningManager;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride;
import java.util.Locale;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cmjd  reason: default package */
/* loaded from: classes5.dex */
public final class cmjd extends cmjp {
    private int d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private int j;
    private int k;
    private boolean l;
    private int m;
    private int n;
    private boolean o;
    private boolean p;
    private final SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> q;
    private final SparseBooleanArray r;

    @Deprecated
    public cmjd() {
        b();
        this.q = new SparseArray<>();
        this.r = new SparseBooleanArray();
    }

    private final void b() {
        this.d = Integer.MAX_VALUE;
        this.e = Integer.MAX_VALUE;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = true;
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.l = true;
        this.m = Integer.MAX_VALUE;
        this.n = Integer.MAX_VALUE;
        this.o = true;
        this.p = true;
    }

    public final DefaultTrackSelector$Parameters a() {
        return new DefaultTrackSelector$Parameters(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.a, this.m, this.n, this.o, this.b, this.c, this.p, this.q, this.r);
    }

    public cmjd(Context context) {
        CaptioningManager captioningManager;
        if (cmny.a >= 19 && ((cmny.a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled())) {
            this.c = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.b = dcdc.f(cmny.p(locale));
            }
        }
        b();
        this.q = new SparseArray<>();
        this.r = new SparseBooleanArray();
        Point Y = cmny.Y(context);
        int i = Y.x;
        int i2 = Y.y;
        this.j = i;
        this.k = i2;
        this.l = true;
    }
}
