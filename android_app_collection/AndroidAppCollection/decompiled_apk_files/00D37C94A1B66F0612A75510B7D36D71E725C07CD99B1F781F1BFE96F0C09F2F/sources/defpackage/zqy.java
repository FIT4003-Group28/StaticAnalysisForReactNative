package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: zqy  reason: default package */
/* loaded from: classes4.dex */
public final class zqy {
    private final zpa a;
    private final int[] c = new int[2];
    private final Rect b = new Rect();

    public zqy(zpa zpaVar) {
        this.a = zpaVar;
    }

    public final void a(View view, MotionEvent motionEvent, View view2, boolean z) {
        boolean z2;
        zoz zozVar;
        int i = 0;
        if (motionEvent.getPointerCount() == 1 && view2.getVisibility() == 0) {
            view2.getGlobalVisibleRect(this.b);
            view2.getLocationOnScreen(this.c);
            Rect rect = this.b;
            int[] iArr = this.c;
            rect.offsetTo(iArr[0], iArr[1]);
            view.getLocationOnScreen(this.c);
            z2 = this.b.contains(((int) motionEvent.getX(0)) + this.c[0], ((int) motionEvent.getY(0)) + this.c[1]);
        } else {
            z2 = false;
        }
        zpa zpaVar = this.a;
        int width = view.getWidth();
        int height = view.getHeight();
        if (motionEvent.getActionMasked() == 6 || motionEvent.getActionMasked() == 5 || motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 1) {
            int actionIndex = (motionEvent.getActionMasked() == 5 || motionEvent.getActionMasked() == 6 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 0) ? motionEvent.getActionIndex() : -1;
            while (i < motionEvent.getPointerCount()) {
                axcc a = axcd.a();
                int pointerId = motionEvent.getPointerId(i);
                a.copyOnWrite();
                axcd.e((axcd) a.instance, pointerId);
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                zpa zpaVar2 = zpaVar;
                double max = Math.max(0.0d, Math.min(x / width, 1.0d));
                double max2 = Math.max(0.0d, Math.min(y / height, 1.0d));
                aopa createBuilder = aotl.a.createBuilder();
                createBuilder.copyOnWrite();
                aotl aotlVar = (aotl) createBuilder.instance;
                aotlVar.b |= 1;
                aotlVar.c = max;
                createBuilder.copyOnWrite();
                aotl aotlVar2 = (aotl) createBuilder.instance;
                aotlVar2.b |= 2;
                aotlVar2.d = max2;
                a.copyOnWrite();
                axcd.f((axcd) a.instance, (aotl) createBuilder.mo39build());
                if (actionIndex == -1) {
                    axcf axcfVar = axcf.MOVE;
                    a.copyOnWrite();
                    axcd.c((axcd) a.instance, axcfVar);
                } else if (i == actionIndex) {
                    if (motionEvent.getActionMasked() == 5 || motionEvent.getActionMasked() == 0) {
                        axcf axcfVar2 = axcf.START;
                        a.copyOnWrite();
                        axcd.c((axcd) a.instance, axcfVar2);
                    } else {
                        axcf axcfVar3 = axcf.END;
                        a.copyOnWrite();
                        axcd.c((axcd) a.instance, axcfVar3);
                    }
                } else {
                    axcf axcfVar4 = axcf.MOVE;
                    a.copyOnWrite();
                    axcd.c((axcd) a.instance, axcfVar4);
                }
                if (motionEvent.getPointerCount() == 1) {
                    a.copyOnWrite();
                    axcd.d((axcd) a.instance, z2);
                }
                axao a2 = axat.a();
                a2.copyOnWrite();
                ((axat) a2.instance).B((axcd) a.mo39build());
                zpaVar2.a.add((axat) a2.mo39build());
                if (z && (zozVar = zpaVar2.c) != null) {
                    zozVar.b();
                }
                i++;
                zpaVar = zpaVar2;
            }
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        StringBuilder sb = new StringBuilder(37);
        sb.append("Can't handle touch event: ");
        sb.append(actionMasked);
        zep.l(sb.toString());
    }
}
