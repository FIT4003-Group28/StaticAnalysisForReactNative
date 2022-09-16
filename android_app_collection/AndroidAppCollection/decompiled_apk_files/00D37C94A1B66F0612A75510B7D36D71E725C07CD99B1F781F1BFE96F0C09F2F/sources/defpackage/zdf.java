package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import java.util.IdentityHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: zdf  reason: default package */
/* loaded from: classes4.dex */
public final class zdf extends TouchDelegate {
    private final Map a;
    private TouchDelegate b;

    public zdf(View view, TouchDelegate touchDelegate) {
        super(new Rect(), view);
        IdentityHashMap identityHashMap = new IdentityHashMap();
        this.a = identityHashMap;
        if (!(touchDelegate instanceof zdf)) {
            this.b = touchDelegate;
            return;
        }
        zdf zdfVar = (zdf) touchDelegate;
        this.b = zdfVar.b;
        identityHashMap.putAll(zdfVar.a);
    }

    public static void b(View view, View view2, TouchDelegate touchDelegate) {
        zdf zdfVar;
        view.getClass();
        view2.getClass();
        TouchDelegate touchDelegate2 = view.getTouchDelegate();
        if (touchDelegate2 instanceof zdf) {
            zdfVar = (zdf) touchDelegate2;
        } else {
            zdfVar = new zdf(view, touchDelegate2);
        }
        aqxo.y(!(touchDelegate instanceof zdf));
        zdfVar.a.put(view2, touchDelegate);
        if (touchDelegate == zdfVar.b) {
            zdfVar.b = null;
        }
        if (touchDelegate2 != zdfVar) {
            view.setTouchDelegate(zdfVar);
        }
    }

    private static boolean c(MotionEvent motionEvent, TouchDelegate touchDelegate) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        boolean onTouchEvent = touchDelegate.onTouchEvent(obtain);
        obtain.recycle();
        return onTouchEvent;
    }

    public final void a(View view) {
        this.a.remove(view);
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TouchDelegate touchDelegate = this.b;
        boolean c = touchDelegate != null ? c(motionEvent, touchDelegate) : false;
        for (TouchDelegate touchDelegate2 : this.a.values()) {
            c |= c(motionEvent, touchDelegate2);
        }
        return c;
    }
}
