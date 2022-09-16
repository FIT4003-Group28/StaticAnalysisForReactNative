package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
/* compiled from: PG */
/* renamed from: sam  reason: default package */
/* loaded from: classes4.dex */
final class sam implements View.OnHoverListener {
    final /* synthetic */ saq a;

    public sam(saq saqVar) {
        this.a = saqVar;
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        int i;
        int action = motionEvent.getAction();
        int i2 = -4;
        if (action != 7) {
            if (action == 9) {
                saq saqVar = this.a;
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(32768);
                obtain.setEnabled(true);
                saqVar.b.onPopulateAccessibilityEvent(obtain);
                obtain.setPackageName(saqVar.b.getContext().getPackageName());
                obtain.setSource(saqVar.b);
                saqVar.b.getParent().requestSendAccessibilityEvent(saqVar.b, obtain);
                if (saqVar.h == sap.EXPLORE) {
                    saqVar.b.removeCallbacks(saqVar.a);
                }
                return true;
            } else if (action != 10) {
                return false;
            } else {
                saq saqVar2 = this.a;
                if (saqVar2.h != sap.EXPLORE) {
                    return false;
                }
                int i3 = saqVar2.k;
                if (i3 != -1 && i3 != -4) {
                    saqVar2.a(65536, i3);
                    saqVar2.k = -4;
                    saqVar2.a(32768, -4);
                }
                saqVar2.b.postDelayed(saqVar2.a, saqVar2.d);
                return true;
            }
        }
        saq saqVar3 = this.a;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (saqVar3.h == sap.EXPLORE) {
            if (x > saqVar3.g) {
                int width = saqVar3.b.getWidth();
                float f = saqVar3.g;
                if (x < width - f && y > f && y < saqVar3.b.getHeight() - saqVar3.g) {
                    sba sbaVar = null;
                    float f2 = Float.MAX_VALUE;
                    int i4 = -1;
                    int i5 = 0;
                    for (sbc sbcVar : saqVar3.c) {
                        sba f3 = sbcVar.f(x, y);
                        if (f3 != null) {
                            float f4 = f3.b;
                            if (f4 < f2) {
                                i4 = i5;
                                sbaVar = f3;
                                f2 = f4;
                            }
                        }
                        i5++;
                    }
                    i2 = sbaVar == null ? -1 : saq.f(i4, ((Integer) sbaVar.c.c.get(sbaVar.a)).intValue());
                }
            }
            if (i2 != -1 && i2 != (i = saqVar3.k)) {
                saqVar3.a(65536, i);
                saqVar3.k = i2;
                saqVar3.a(32768, i2);
                return true;
            }
        }
        return false;
    }
}
