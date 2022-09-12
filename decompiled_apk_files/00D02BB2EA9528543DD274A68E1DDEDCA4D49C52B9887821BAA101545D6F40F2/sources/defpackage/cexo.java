package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cexo  reason: default package */
/* loaded from: classes4.dex */
public final class cexo implements cqfd {
    final /* synthetic */ cexq a;

    public cexo(cexq cexqVar) {
        this.a = cexqVar;
    }

    @Override // defpackage.cqfd
    public final boolean a(View view) {
        int i;
        float f;
        cexq cexqVar = this.a;
        if (cexqVar.k == 1) {
            View o = cqkx.o(cexqVar);
            TextView textView = o != null ? (TextView) cqkx.e(o, cepm.a, TextView.class) : null;
            if (textView == null) {
                cexqVar.k = 5;
                cqkx.p(cexqVar);
            } else if (textView.getLayout().getLineBottom(textView.getLineCount() - 1) + textView.getPaddingTop() + textView.getPaddingBottom() > textView.getHeight()) {
                textView.getHeight();
                cexqVar.k = 5;
                cqkx.p(cexqVar);
            } else {
                cexqVar.e = textView.getHeight() + cexqVar.c;
                cexqVar.f = textView.getWidth();
                cexqVar.k = 2;
            }
        }
        if (cexqVar.k != 5) {
            int i2 = cexqVar.a.getResources().getConfiguration().orientation;
            if (i2 != cexqVar.d) {
                cexqVar.k = 2;
                cexqVar.d = i2;
            }
            int i3 = cexqVar.k;
            if (i3 != 4) {
                if (i3 == 3) {
                    cexqVar.k = 4;
                } else {
                    View o2 = cqkx.o(cexqVar);
                    View o3 = cqkx.o(cexqVar.b);
                    if (o3 == null || o2 == null) {
                        cexqVar.k = 5;
                    } else {
                        Rect rect = new Rect();
                        o2.getGlobalVisibleRect(rect);
                        Rect rect2 = new Rect();
                        if (!o3.getGlobalVisibleRect(rect2)) {
                            cexqVar.k = 5;
                        } else {
                            float exactCenterX = rect2.exactCenterX();
                            if (rect2.bottom + cexqVar.e > rect.bottom) {
                                cexqVar.j = true;
                                i = rect2.top - cexqVar.e;
                            } else {
                                cexqVar.j = false;
                                i = rect2.bottom;
                            }
                            float f2 = i - rect.top;
                            cexqVar.g = f2;
                            if (f2 < 0.0f) {
                                int i4 = rect.top;
                                int i5 = rect.bottom;
                                int i6 = rect2.top;
                                int i7 = rect2.bottom;
                                cexqVar.k = 5;
                            } else {
                                int NR = ibn.o().NR(cexqVar.a);
                                int i8 = NR + NR;
                                if (cexqVar.f + i8 > rect.width()) {
                                    rect.width();
                                    cexqVar.k = 5;
                                } else {
                                    float f3 = cexqVar.f / 2.0f;
                                    float f4 = NR;
                                    if (exactCenterX + f3 + f4 > rect.right) {
                                        f = (rect.right - cexqVar.f) - i8;
                                        cexqVar.h = f;
                                    } else {
                                        f = (exactCenterX - f3) - f4;
                                        cexqVar.h = f;
                                    }
                                    cexqVar.h = Math.max(f - rect.left, 0.0f);
                                    cexqVar.i = (((exactCenterX - (cexqVar.c / 2.0f)) - rect.left) - cexqVar.h) - f4;
                                    int NR2 = ibn.k().NR(cexqVar.a);
                                    float f5 = cexqVar.i;
                                    if (f5 < NR2 || f5 + cexqVar.c > cexqVar.f - NR2) {
                                        cexqVar.k = 5;
                                    } else {
                                        cexqVar.k = 3;
                                    }
                                }
                            }
                        }
                    }
                }
                cqkx.p(cexqVar);
            }
        }
        return true;
    }
}
