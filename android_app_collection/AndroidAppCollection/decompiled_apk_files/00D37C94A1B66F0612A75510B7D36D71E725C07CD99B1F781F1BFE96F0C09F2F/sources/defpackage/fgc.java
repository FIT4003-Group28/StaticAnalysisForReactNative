package defpackage;

import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: fgc  reason: default package */
/* loaded from: classes3.dex */
public final class fgc {
    public final aynx a;

    public fgc(final yzm yzmVar, ghs ghsVar) {
        this.a = aynx.e(yzmVar.d(), ghsVar.c, new aypx() { // from class: fgb
            @Override // defpackage.aypx
            public final Object a(Object obj, Object obj2) {
                int i;
                int i2;
                int i3;
                yzm yzmVar2 = yzm.this;
                zaw zawVar = (zaw) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                Rect rect = new Rect();
                if (yzmVar2.m()) {
                    rect.set(zawVar.a.a);
                } else if (yzmVar2.l()) {
                    yzr yzrVar = zawVar.a;
                    yzg yzgVar = yzrVar.b;
                    int i4 = 0;
                    if (!yzgVar.a.isEmpty()) {
                        int b = yzgVar.b();
                        int d = yzgVar.d();
                        i3 = yzgVar.c();
                        i = yzgVar.a();
                        i4 = d;
                        i2 = b;
                    } else {
                        i = 0;
                        i2 = 0;
                        i3 = 0;
                    }
                    Rect rect2 = yzrVar.d;
                    if (booleanValue) {
                        i2 = Math.max(rect2.left, i2);
                        i4 = Math.max(rect2.top, i4);
                        i3 = Math.max(rect2.right, i3);
                        i = Math.max(rect2.bottom, i);
                    }
                    rect.set(new Rect(i2, i4, i3, i));
                }
                return rect;
            }
        });
    }
}
