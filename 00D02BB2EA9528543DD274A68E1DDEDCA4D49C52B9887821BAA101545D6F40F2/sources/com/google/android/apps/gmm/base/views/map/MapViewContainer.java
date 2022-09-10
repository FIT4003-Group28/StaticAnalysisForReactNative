package com.google.android.apps.gmm.base.views.map;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.gmm.base.views.map.MapViewContainer;
import com.google.android.apps.maps.R;
import java.util.Collections;
import java.util.Set;
/* compiled from: PG */
/* loaded from: classes.dex */
public class MapViewContainer extends FrameLayout {
    static final cqkv a = new jgt();
    static final Set<MapViewContainer> b;
    static final jgs c;
    @dzsi
    public akox d;
    public int e;
    @dzsi
    public cryz<akox> f;
    public akps g;
    public dmqc h;
    public dmqc i;
    public int j;
    public dmlo k;
    @dzsi
    public Float l;
    private boolean m;
    @dzsi
    private akqq n;
    @dzsi
    private akpp o;
    private boolean p;
    @dzsi
    private alad q;
    private final btrm r;
    private final hwe s;
    private final SparseArray<Bitmap> t;
    @dzsi
    private hwb u;

    static {
        Set<MapViewContainer> l = dcnm.l();
        b = l;
        c = new jgs(Collections.unmodifiableSet(l));
    }

    public MapViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = 0;
        this.m = true;
        this.g = akps.NORMAL;
        this.h = dmqc.LEGEND_STYLE_UNDEFINED;
        this.i = dmqc.LEGEND_STYLE_UNDEFINED;
        this.j = -1;
        this.n = null;
        this.o = null;
        this.k = dmlo.BOTTOM;
        this.t = new SparseArray<>();
        this.r = ((btri) btsr.a(btri.class)).rz();
        this.s = ((hwf) btsq.c(hwf.class, context)).wi();
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(MapViewContainer.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> b(cqlc<T, akqq> cqlcVar) {
        return cqjv.g(iug.PIN_LAT_LNG, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> c(akps akpsVar) {
        return cqjv.i(iug.PIN_TYPE, akpsVar, a);
    }

    public static <T extends cqkp> cqnf<T> d(cqlc<T, Integer> cqlcVar) {
        return cqjv.g(iug.PIN_ICON_RESOURCE_ID, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> e(dmlo dmloVar) {
        return cqjv.i(iug.PIN_ANCHOR_POINT, dmloVar, a);
    }

    public static <T extends cqkp> cqnf<T> f(Boolean bool) {
        return cqjv.i(iug.SET_INTERACTIVE, bool, a);
    }

    public static <T extends cqkp> cqnf<T> g(Float f) {
        return cqjv.i(iug.MAP_ZOOM_LEVEL, f, a);
    }

    public static <T extends cqkp> cqnf<T> m() {
        return cqjv.i(iug.PIN_ICON_RESOURCE_ID, Integer.valueOf((int) R.drawable.spotlight_pinlet_dot), a);
    }

    private final void p() {
        akox l;
        alae alaeVar;
        alae alaeVar2;
        alae alaeVar3;
        if (this.o == null || this.n == null || (l = l()) == null) {
            return;
        }
        if (this.l == null) {
            akqq akqqVar = this.n;
            dbsk.s(akqqVar);
            l.p(akyt.g(akqqVar));
            return;
        }
        akqq akqqVar2 = this.n;
        dbsk.s(akqqVar2);
        float floatValue = this.l.floatValue();
        int width = getWidth();
        int height = getHeight();
        akpp akppVar = this.o;
        if (akppVar != null) {
            akpd akpdVar = (akpd) akppVar;
            if (akpdVar.c != null && width != 0 && height != 0) {
                dbsk.s(akppVar);
                Bitmap bitmap = akpdVar.c;
                dbsk.s(bitmap);
                float width2 = bitmap.getWidth();
                float height2 = bitmap.getHeight();
                akps akpsVar = akps.NORMAL;
                dmlo dmloVar = dmlo.CENTER;
                switch (this.k.ordinal()) {
                    case 0:
                        alaeVar2 = new alae(0.0f, height2 / height);
                        alaeVar = alaeVar2;
                        break;
                    case 1:
                        alaeVar3 = new alae(width2 / width, height2 / height);
                        alaeVar = alaeVar3;
                        break;
                    case 2:
                        alaeVar3 = new alae((-width2) / width, height2 / height);
                        alaeVar = alaeVar3;
                        break;
                    case 3:
                        alaeVar2 = new alae(0.0f, (height2 + height2) / height);
                        alaeVar = alaeVar2;
                        break;
                    case 4:
                        alaeVar3 = new alae(width2 / width, (height2 + height2) / height);
                        alaeVar = alaeVar3;
                        break;
                    case 5:
                        alaeVar3 = new alae((-width2) / width, (height2 + height2) / height);
                        alaeVar = alaeVar3;
                        break;
                    case 6:
                        alaeVar = alae.a;
                        break;
                    case 7:
                        alaeVar = new alae(width2 / width, 0.0f);
                        break;
                    case 8:
                        alaeVar = new alae((-width2) / width, 0.0f);
                        break;
                    default:
                        alaeVar = alae.a;
                        break;
                }
                l.p(akyt.k(akqqVar2, floatValue, alaeVar));
            }
        }
        alaeVar = alae.a;
        l.p(akyt.k(akqqVar2, floatValue, alaeVar));
    }

    private final void q() {
        hwb hwbVar = this.u;
        if (hwbVar != null) {
            this.s.j(hwbVar);
            this.u = null;
        }
        this.n = null;
        this.o = null;
    }

    public final void h(final hwd hwdVar) {
        int i = this.e;
        boolean z = false;
        if (i == 1 || i == 2) {
            if (getChildCount() == 1) {
                z = true;
            }
            dbsk.l(z);
        } else if (this.d != null) {
            this.e = 1;
            i(hwdVar);
        } else if (hwdVar == null) {
            dbsk.l(false);
        } else {
            this.e = 2;
            if (!i(hwdVar)) {
                this.e = 3;
            }
            if (hwdVar.n() == null) {
                dbsk.l(false);
            } else if (this.f != null) {
                if (this.e == 3) {
                    z = true;
                }
                dbsk.l(z);
            } else {
                cryz<akox> d = bvqj.d(hwdVar.n(), new bvqg(this, hwdVar) { // from class: jgr
                    private final MapViewContainer a;
                    private final hwd b;

                    {
                        this.a = this;
                        this.b = hwdVar;
                    }

                    @Override // defpackage.bvqg
                    public final void NU(Object obj) {
                        MapViewContainer mapViewContainer = this.a;
                        hwd hwdVar2 = this.b;
                        mapViewContainer.d = (akox) obj;
                        mapViewContainer.f = null;
                        int i2 = mapViewContainer.e;
                        boolean z2 = true;
                        if (i2 == 3) {
                            mapViewContainer.e = 1;
                            mapViewContainer.i(hwdVar2);
                        } else if (i2 == 2) {
                            mapViewContainer.e = 1;
                            mapViewContainer.j(hwdVar2);
                        } else {
                            if (1 != (i2 ^ 1)) {
                                z2 = false;
                            }
                            dbsk.l(z2);
                        }
                    }
                }, dege.a);
                this.f = d;
                int i2 = this.e;
                if (i2 == 1) {
                    dbsk.l(d.d());
                    this.f = null;
                    return;
                }
                dbsk.l(i2 == 3 || i2 == 2);
                cryz<akox> cryzVar = this.f;
                if (cryzVar != null && !cryzVar.d()) {
                    z = true;
                }
                dbsk.l(z);
            }
        }
    }

    public final boolean i(hwd hwdVar) {
        ViewGroup viewGroup = null;
        View k = hwdVar != null ? hwdVar.k() : null;
        if (k != null) {
            viewGroup = (ViewGroup) k.getParent();
        }
        if (viewGroup == this) {
            return true;
        }
        removeAllViews();
        setBackgroundResource(0);
        if (k != null) {
            if (viewGroup instanceof MapViewContainer) {
                ((MapViewContainer) viewGroup).k(k);
            } else if (viewGroup != null) {
                viewGroup.removeView(k);
            }
            addView(k);
        } else {
            dbsk.l(false);
        }
        if (this.e == 1) {
            j(hwdVar);
        }
        return k != null;
    }

    public final void j(hwd hwdVar) {
        akox akoxVar;
        boolean z = true;
        if (this.e != 1) {
            z = false;
        }
        dbsk.l(z);
        n(Boolean.valueOf(this.m));
        if (hwdVar.l() && (akoxVar = this.d) != null) {
            this.q = akoxVar.n();
        } else {
            this.q = null;
        }
        o(this.n);
    }

    public final void k(View view) {
        alad aladVar;
        akox akoxVar;
        int i = this.e;
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        dbsk.l(z);
        q();
        if (view instanceof TextureView) {
            int width = getWidth();
            int height = getHeight();
            do {
                width /= 2;
                height /= 2;
            } while (width * height * 4 >= 2097152);
            setBackgroundDrawable(new BitmapDrawable(getContext().getResources(), ((TextureView) view).getBitmap(width, height)));
        }
        if (this.p && (aladVar = this.q) != null && (akoxVar = this.d) != null) {
            akoxVar.p(akyt.e(aladVar));
        }
        this.d = null;
        removeAllViews();
        this.e = 0;
    }

    @dzsi
    public final akox l() {
        akox akoxVar;
        if (this.e != 1 || (akoxVar = this.d) == null || !akoxVar.i()) {
            return null;
        }
        return this.d;
    }

    public final void n(Boolean bool) {
        aliw J;
        akox l = l();
        if (l != null && (J = l.J()) != null) {
            J.a(bool.booleanValue());
        }
        this.m = bool.booleanValue();
    }

    public final void o(@dzsi akqq akqqVar) {
        akpp p;
        if (akqqVar == null) {
            q();
            return;
        }
        this.n = akqqVar;
        akps akpsVar = akps.NORMAL;
        dmlo dmloVar = dmlo.CENTER;
        int ordinal = this.g.ordinal();
        if (ordinal == 7) {
            Bitmap bitmap = this.t.get(this.j);
            if (bitmap == null) {
                bitmap = BitmapFactory.decodeResource(getContext().getResources(), this.j);
                this.t.put(this.j, bitmap);
            }
            p = akpp.p(akqqVar, true, 1, bitmap);
        } else if (ordinal == 9) {
            p = akpp.q(akqqVar, this.h, this.i);
        } else {
            p = akpp.m(akqqVar, this.g);
        }
        this.o = p;
        if (l() == null) {
            return;
        }
        hwe hweVar = this.s;
        akpp akppVar = this.o;
        dbsk.s(akppVar);
        this.u = hweVar.i(akppVar, false);
        p();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b.add(this);
        this.r.b(c);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b.remove(this);
        this.r.b(c);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.m) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.n == null || this.g != akps.CUSTOM_ICON || this.k == dmlo.BOTTOM) {
            return;
        }
        p();
    }

    public void setRestoreCameraOnDetach(boolean z) {
        this.p = z;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            super.setVisibility(i);
            this.r.b(c);
        }
    }
}
