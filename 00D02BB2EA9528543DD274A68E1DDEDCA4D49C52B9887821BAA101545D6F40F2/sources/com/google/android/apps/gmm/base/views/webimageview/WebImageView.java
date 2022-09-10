package com.google.android.apps.gmm.base.views.webimageview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
/* compiled from: PG */
/* loaded from: classes.dex */
public class WebImageView extends ckqg {
    static final cqkv a = new jnt();

    public WebImageView(Context context) {
        this(context, null);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(WebImageView.class, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> b(cqlc<T, jic> cqlcVar, cqmp<T>... cqmpVarArr) {
        cqmj<T> a2 = a(irn.A(), l(cqlcVar));
        a2.f(cqmpVarArr);
        return a2;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> c(cqlc<T, jic> cqlcVar, cqlc<T, Boolean> cqlcVar2, cqmp<T>... cqmpVarArr) {
        cqmj<T> a2 = a(irn.C(cqlcVar2), l(cqlcVar));
        a2.f(cqmpVarArr);
        return a2;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> d(@dzsi jic jicVar, cqmp<T>... cqmpVarArr) {
        return h(jicVar, irh.p(), cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> e(cqlc<T, jic> cqlcVar, cqmp<T>... cqmpVarArr) {
        return i(cqlcVar, cqkz.a(irh.p()), cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> f(@dzsi jic jicVar, cqmp<T>... cqmpVarArr) {
        return h(jicVar, cqrp.d(32.0d), cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> g(cqlc<T, jic> cqlcVar, cqmp<T>... cqmpVarArr) {
        return i(cqlcVar, cqkz.a(cqrp.d(32.0d)), cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> h(@dzsi jic jicVar, cqtv cqtvVar, cqmp<T>... cqmpVarArr) {
        cqmj<T> a2 = jfx.a(cqgr.cd(-2), cqgr.bp(-2), a(k(jicVar), cqgr.ei(ImageView.ScaleType.CENTER_CROP), cqgr.ce(cqtvVar), cqgr.bq(cqtvVar)));
        a2.f(cqmpVarArr);
        return a2;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> i(cqlc<T, jic> cqlcVar, cqlc<T, cqtv> cqlcVar2, cqmp<T>... cqmpVarArr) {
        cqmj<T> a2 = jfx.a(cqgr.cd(-2), cqgr.bp(-2), a(l(cqlcVar), cqgr.ei(ImageView.ScaleType.CENTER_CROP), cqgr.cg(cqlcVar2), cqgr.bs(cqlcVar2)));
        a2.f(cqmpVarArr);
        return a2;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> j(cqlc<T, jic> cqlcVar, cqmp<T>... cqmpVarArr) {
        cqmj<T> a2 = a(l(cqlcVar), cqgr.ce(irh.p()), cqgr.bq(irh.p()), cqgr.ei(ImageView.ScaleType.CENTER_INSIDE));
        a2.f(cqmpVarArr);
        return a2;
    }

    public static <T extends cqkp> cqnf<T> k(@dzsi jic jicVar) {
        return cqjv.i(iug.WEB_IMAGE, jicVar, a);
    }

    public static <T extends cqkp> cqnf<T> l(cqlc<T, jic> cqlcVar) {
        return cqjv.g(iug.WEB_IMAGE, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> m(cqjb<T, jic> cqjbVar) {
        return cqjv.e(iug.WEB_IMAGE, cqjbVar, a);
    }

    public static <T extends cqkp> cqnf<T> n(cqlc<T, jhp> cqlcVar) {
        return cqjv.g(iug.NIGHT_AWARE_WEB_IMAGE, cqlcVar, a);
    }

    public boolean o(@dzsi jic jicVar) {
        if (jicVar == null) {
            t();
            return true;
        }
        jicVar.a(this);
        return true;
    }

    public final void p(@dzsi jhp jhpVar) {
        if (jhpVar == null) {
            t();
        } else {
            (iva.a().booleanValue() ? jhpVar.b : jhpVar.a).a(this);
        }
    }

    public WebImageView(Context context, @dzsi AttributeSet attributeSet) {
        super(context, attributeSet, ((amfj) btsr.a(amfj.class)).qp());
    }

    @Override // android.widget.ImageView
    public void setAlpha(int i) {
        if (cqjh.a) {
            throw new IllegalArgumentException("Don't use alpha directly with BaseWebImageView as this can show a ghost of the placeholder image when the real image loads. Instead use alpha on a parent view. See b/31384619");
        }
        super.setAlpha(i);
    }
}
