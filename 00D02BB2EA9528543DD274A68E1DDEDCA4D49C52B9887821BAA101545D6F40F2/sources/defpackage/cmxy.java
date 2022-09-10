package defpackage;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.google.android.gms.car.CarWindowManagerLayoutParams;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.InputFocusChangedEvent;
/* compiled from: PG */
/* renamed from: cmxy  reason: default package */
/* loaded from: classes.dex */
public interface cmxy extends IInterface {
    void A(cmxz cmxzVar);

    void b(int i, DrawingSpec drawingSpec, Intent intent, Bundle bundle);

    void c(Intent intent);

    void d(int i, MotionEvent motionEvent);

    void e(boolean z);

    void f();

    void g();

    void h();

    void i();

    void j(int i);

    void k(int i);

    void l(DrawingSpec drawingSpec);

    void m(boolean z, boolean z2);

    void n(IBinder iBinder);

    void o(InputFocusChangedEvent inputFocusChangedEvent);

    void p(CarWindowManagerLayoutParams carWindowManagerLayoutParams);

    void q(Rect rect);

    void r(int i, DrawingSpec drawingSpec, Intent intent, Configuration configuration, Bundle bundle);

    void s();

    void t(int i, int i2, DrawingSpec drawingSpec, Intent intent, Configuration configuration, Bundle bundle);

    void u(KeyEvent keyEvent);

    void v();

    void w();

    void x();

    void y(int i, DrawingSpec drawingSpec, Configuration configuration);

    void z(cmxz cmxzVar, cmxn cmxnVar);
}
