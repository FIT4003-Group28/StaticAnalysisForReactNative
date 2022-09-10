package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: cpon  reason: default package */
/* loaded from: classes5.dex */
final class cpon implements View.OnHoverListener {
    final /* synthetic */ cpor a;

    public cpon(cpor cporVar) {
        this.a = cporVar;
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        int i;
        int action = motionEvent.getAction();
        int i2 = -4;
        if (action != 7) {
            if (action == 9) {
                cpor cporVar = this.a;
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(32768);
                obtain.setEnabled(true);
                cporVar.b.onPopulateAccessibilityEvent(obtain);
                obtain.setPackageName(cporVar.b.getContext().getPackageName());
                obtain.setSource(cporVar.b);
                cporVar.b.getParent().requestSendAccessibilityEvent(cporVar.b, obtain);
                if (cporVar.i == cpoq.EXPLORE) {
                    cporVar.b.removeCallbacks(cporVar.a);
                }
                return true;
            } else if (action != 10) {
                return false;
            } else {
                cpor cporVar2 = this.a;
                if (cporVar2.i != cpoq.EXPLORE) {
                    return false;
                }
                int i3 = cporVar2.l;
                if (i3 != -1 && i3 != -4) {
                    cporVar2.c(ImageMetadata.CONTROL_AE_ANTIBANDING_MODE, i3);
                    cporVar2.l = -4;
                    cporVar2.c(32768, -4);
                }
                cporVar2.b.postDelayed(cporVar2.a, cporVar2.e);
                return true;
            }
        }
        cpor cporVar3 = this.a;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (cporVar3.i == cpoq.EXPLORE) {
            if (x > cporVar3.h) {
                int width = cporVar3.b.getWidth();
                float f = cporVar3.h;
                if (x < width - f && y > f && y < cporVar3.b.getHeight() - cporVar3.h) {
                    cppb cppbVar = null;
                    float f2 = Float.MAX_VALUE;
                    int i4 = -1;
                    int i5 = 0;
                    for (cpoy cpoyVar : cporVar3.d) {
                        cppb c = cpoyVar.c();
                        if (c != null && c.b() < f2) {
                            f2 = c.b();
                            i4 = i5;
                            cppbVar = c;
                        }
                        i5++;
                    }
                    i2 = cppbVar == null ? -1 : cpor.e(i4, cppbVar.a());
                }
            }
            if (i2 != -1 && i2 != (i = cporVar3.l)) {
                cporVar3.c(ImageMetadata.CONTROL_AE_ANTIBANDING_MODE, i);
                cporVar3.l = i2;
                cporVar3.c(32768, i2);
                return true;
            }
        }
        return false;
    }
}
