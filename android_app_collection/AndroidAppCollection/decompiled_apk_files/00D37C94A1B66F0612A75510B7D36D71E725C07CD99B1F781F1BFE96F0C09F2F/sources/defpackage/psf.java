package defpackage;

import android.graphics.Bitmap;
import android.text.Layout;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: psf  reason: default package */
/* loaded from: classes4.dex */
public final class psf {
    public CharSequence a;
    public Bitmap b;
    public Layout.Alignment c;
    public Layout.Alignment d;
    public int e;
    public float f;
    public int g;
    public float h;
    public float i;
    public boolean j;
    public int k;
    public int l;
    public float m;
    private float n;
    private int o;
    private int p;
    private float q;

    public psf() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.n = -3.4028235E38f;
        this.o = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.e = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.f = -3.4028235E38f;
        this.g = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.p = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.q = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.i = -3.4028235E38f;
        this.j = false;
        this.k = -16777216;
        this.l = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    }

    public psf(psg psgVar) {
        this.a = psgVar.b;
        this.b = psgVar.e;
        this.c = psgVar.c;
        this.d = psgVar.d;
        this.n = psgVar.f;
        this.o = psgVar.g;
        this.e = psgVar.h;
        this.f = psgVar.i;
        this.g = psgVar.j;
        this.p = psgVar.o;
        this.q = psgVar.p;
        this.h = psgVar.k;
        this.i = psgVar.l;
        this.j = psgVar.m;
        this.k = psgVar.n;
        this.l = psgVar.q;
        this.m = psgVar.r;
    }

    public final psg a() {
        return new psg(this.a, this.c, this.d, this.b, this.n, this.o, this.e, this.f, this.g, this.p, this.q, this.h, this.i, this.j, this.k, this.l, this.m);
    }

    public final void b(float f, int i) {
        this.n = f;
        this.o = i;
    }

    public final void c(float f, int i) {
        this.q = f;
        this.p = i;
    }
}
