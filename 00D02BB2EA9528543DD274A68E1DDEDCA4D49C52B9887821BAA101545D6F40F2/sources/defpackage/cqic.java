package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: cqic  reason: default package */
/* loaded from: classes.dex */
public final class cqic<T extends cqkp> extends View {
    public cqmj<T> a;
    public boolean b;
    @dzsi
    public cqmm<?, T> c;

    public cqic(Context context, @dzsi AttributeSet attributeSet) {
        super(context, attributeSet);
        setVisibility(8);
        setWillNotDraw(true);
    }

    @SafeVarargs
    public static <T extends cqkp> cqnj<T> a(final Boolean bool, cqmp<T>... cqmpVarArr) {
        cqjb cqjbVar = new cqjb(bool) { // from class: cqni
            private final Boolean a;

            {
                this.a = bool;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                return (Boolean) cqjv.a(this.a, cqkpVar, context);
            }
        };
        boolean z = false;
        if (!cqny.b(bool) && !bool.booleanValue()) {
            z = true;
        }
        return new cqnj<>(cqjbVar, z, true, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqnj<T> b(cqjb<T, Boolean> cqjbVar, cqmp<T>... cqmpVarArr) {
        return cqnj.a(cqjbVar, true, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqnj<T> c(final cqlc<T, Boolean> cqlcVar, cqmp<T>... cqmpVarArr) {
        return cqnj.a(new cqjb(cqlcVar) { // from class: cqhx
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                return (Boolean) this.a.a(cqkpVar);
            }
        }, true, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqnj<T> d(Boolean bool, cqmp<T>... cqmpVarArr) {
        return a(cqjv.u(bool), cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqnj<T> e(final cqjb<T, Boolean> cqjbVar, cqmp<T>... cqmpVarArr) {
        return cqnj.a(new cqjb(cqjbVar) { // from class: cqhy
            private final cqjb a;

            {
                this.a = cqjbVar;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                return Boolean.valueOf(!((Boolean) this.a.a(cqkpVar, context)).booleanValue());
            }
        }, true, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqnj<T> f(final cqlc<T, Boolean> cqlcVar, cqmp<T>... cqmpVarArr) {
        return cqnj.a(new cqjb(cqlcVar) { // from class: cqhz
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                return Boolean.valueOf(!((Boolean) this.a.a(cqkpVar)).booleanValue());
            }
        }, true, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqnj<T> g(final cqlc<T, Boolean> cqlcVar, cqmp<T>... cqmpVarArr) {
        return cqnj.a(new cqjb(cqlcVar) { // from class: cqia
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                return Boolean.valueOf(!((Boolean) this.a.a(cqkpVar)).booleanValue());
            }
        }, false, cqmpVarArr);
    }

    @Override // android.view.View
    protected final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setStubbedViewNode(cqmj<T> cqmjVar, boolean z, @dzsi cqmm<?, T> cqmmVar) {
        this.a = cqmjVar;
        this.b = z;
        this.c = cqmmVar;
    }
}
