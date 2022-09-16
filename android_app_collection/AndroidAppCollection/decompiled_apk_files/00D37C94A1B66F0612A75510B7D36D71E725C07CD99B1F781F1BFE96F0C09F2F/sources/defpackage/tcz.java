package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: tcz  reason: default package */
/* loaded from: classes4.dex */
public final class tcz {
    public View a;
    public Integer b;
    public Integer c;
    public tfd d;
    public ayqh e;
    public Map f;
    public ya g;
    public Boolean h;
    public StringBuilder i;
    public WeakReference j;
    public tee k;
    public amuk l;
    public tdh m;
    public String n;
    public String o;
    public tdz p;
    public AtomicReference q;
    public akcr r;
    private Float s;
    private Boolean t;
    private Boolean u;
    private WeakReference v;
    private Boolean w;

    public tcz() {
    }

    public tcz(tda tdaVar) {
        this.a = tdaVar.b;
        this.b = tdaVar.c;
        this.c = tdaVar.d;
        this.d = tdaVar.e;
        this.e = tdaVar.f;
        this.s = Float.valueOf(tdaVar.g);
        this.t = Boolean.valueOf(tdaVar.h);
        this.f = tdaVar.i;
        this.r = tdaVar.x;
        this.g = tdaVar.j;
        this.u = Boolean.valueOf(tdaVar.k);
        this.h = Boolean.valueOf(tdaVar.l);
        this.i = tdaVar.m;
        this.v = tdaVar.n;
        this.j = tdaVar.o;
        this.k = tdaVar.p;
        this.l = tdaVar.q;
        this.m = tdaVar.r;
        this.n = tdaVar.s;
        this.o = tdaVar.t;
        this.p = tdaVar.u;
        this.w = Boolean.valueOf(tdaVar.v);
        this.q = tdaVar.w;
    }

    public final void b(boolean z) {
        this.w = Boolean.valueOf(z);
    }

    public final void c(float f) {
        this.s = Float.valueOf(f);
    }

    public final void d(awoc awocVar) {
        this.v = awocVar == null ? null : new WeakReference(awocVar);
    }

    public final void e(boolean z) {
        this.t = Boolean.valueOf(z);
    }

    public final void f(boolean z) {
        b(true);
        this.u = Boolean.valueOf(z);
    }

    public final tda a() {
        Float f = this.s;
        if (f == null || this.t == null || this.u == null || this.h == null || this.w == null) {
            StringBuilder sb = new StringBuilder();
            if (this.s == null) {
                sb.append(" imagePrefetchRangeRatio");
            }
            if (this.t == null) {
                sb.append(" useDynamicPropsForStylePropertiesInternal");
            }
            if (this.u == null) {
                sb.append(" useIncrementalMountOnChildrenInternal");
            }
            if (this.h == null) {
                sb.append(" useLegacyVisibleInternal");
            }
            if (this.w == null) {
                sb.append(" couldOverlapWithElementsConfig");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        tda tdaVar = new tda(this.a, this.b, this.c, this.d, this.e, f.floatValue(), this.t.booleanValue(), this.f, this.r, this.g, this.u.booleanValue(), this.h.booleanValue(), this.i, this.v, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.w.booleanValue(), this.q);
        boolean z = true;
        if (tdaVar.u != null && tdaVar.v) {
            z = false;
        }
        aqxo.z(z, "Setting an ElementsConfig overrides other values set on the ConversionContext, like useIncrementalMountOnChildren, useLegacyVisible, and elementsInteractionLogger. Configure them through the ElementsConfig instead of directly on the ConversionContext.");
        return tdaVar;
    }
}
