package defpackage;

import android.graphics.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: lai  reason: default package */
/* loaded from: classes7.dex */
public final class lai {
    public final View a;
    public final jzp b;
    public final kcy c;
    public final GestureDetector d;
    public final GestureDetector e;
    public boolean f;
    public boolean g;
    public long h;
    @dzsi
    public kzj i;
    private final Matrix j;
    private final GestureDetector.OnGestureListener k;
    private final GestureDetector.OnGestureListener l;

    public lai(View view, jzp jzpVar, kcy kcyVar) {
        Matrix matrix = new Matrix();
        this.j = matrix;
        lag lagVar = new lag(this);
        this.k = lagVar;
        lah lahVar = new lah(this);
        this.l = lahVar;
        dbsk.s(view);
        this.a = view;
        if (jzpVar.i() != 0 && jzpVar.j() != 0) {
            matrix.setScale(512.0f / jzpVar.i(), 512.0f / jzpVar.j());
        }
        dbsk.s(jzpVar);
        this.b = jzpVar;
        this.c = kcyVar;
        this.d = new GestureDetector(view.getContext(), lagVar);
        this.e = new GestureDetector(view.getContext(), lahVar);
    }

    public final boolean a(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.g = true;
            this.h = motionEvent.getDownTime();
            this.f = false;
        } else if (this.f) {
            return true;
        } else {
            if (motionEvent.getAction() == 1) {
                this.g = false;
            }
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.transform(this.j);
        return this.a.dispatchTouchEvent(obtain);
    }

    public final void b(@dzsi kzj kzjVar) {
        boolean z = true;
        boolean z2 = this.i == null;
        if (kzjVar != null) {
            z = false;
        }
        dbsk.l(z2 ^ z);
        this.i = kzjVar;
    }
}
