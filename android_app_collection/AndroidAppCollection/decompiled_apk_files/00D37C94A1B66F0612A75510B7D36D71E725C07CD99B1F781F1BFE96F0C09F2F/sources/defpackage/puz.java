package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.accessibility.CaptioningManager;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: puz  reason: default package */
/* loaded from: classes4.dex */
public final class puz extends pvl {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final SparseArray f;
    public final SparseBooleanArray g;

    @Deprecated
    public puz() {
        this.f = new SparseArray();
        this.g = new SparseBooleanArray();
        b();
    }

    private final void b() {
        this.a = true;
        this.b = true;
        this.c = true;
        this.d = true;
        this.e = true;
    }

    public final DefaultTrackSelector$Parameters a() {
        return new DefaultTrackSelector$Parameters(this);
    }

    public puz(Context context) {
        CaptioningManager captioningManager;
        int i = pxi.a;
        if ((pxi.a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.o = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.n = amuk.r(locale.toLanguageTag());
            }
        }
        Point q = pxi.q(context);
        int i2 = q.x;
        int i3 = q.y;
        this.h = i2;
        this.i = i3;
        this.j = true;
        this.f = new SparseArray();
        this.g = new SparseBooleanArray();
        b();
    }
}
