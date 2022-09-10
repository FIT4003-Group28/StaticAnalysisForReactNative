package defpackage;

import android.graphics.RectF;
import android.support.v7.widget.RecyclerView;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bcky  reason: default package */
/* loaded from: classes3.dex */
public class bcky extends abx {
    private static final Interpolator a = eho.a(0.6f, 0.0f, 1.0f, 1.0f);
    private final bckx b;
    private final cqjg c;

    public bcky(cqjg cqjgVar, bckx bckxVar) {
        this.b = bckxVar;
        this.c = cqjgVar;
    }

    @Override // defpackage.abx
    public void a(RecyclerView recyclerView, int i, int i2) {
        if (this.b.a(recyclerView, i2)) {
            return;
        }
        float f = i2;
        final ArrayList arrayList = new ArrayList();
        cqkx.h(recyclerView, this.c, bxbx.class, new dbrn(arrayList) { // from class: bckw
            private final List a;

            {
                this.a = arrayList;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return Boolean.valueOf(this.a.add((bxbx) obj));
            }
        });
        RectF b = cknv.b(recyclerView);
        float f2 = arrayList.size() > 2 ? 30.0f : 60.0f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            bxbx bxbxVar = (bxbx) arrayList.get(i3);
            if (bxbxVar != null) {
                RectF b2 = cknv.b(bxbxVar);
                float height = b2.height() / b.height();
                float f3 = 0.5f * height;
                float centerY = (b2.centerY() - b.top) / b.height();
                float f4 = -1.0f;
                if ((-f3) < centerY && centerY < f3) {
                    f4 = (centerY + f3) / height;
                } else if (f3 <= centerY && centerY <= 1.0f - f3) {
                    f4 = 1.0f;
                } else if (1.0f - f3 < centerY) {
                    float f5 = f3 + 1.0f;
                    if (centerY < f5) {
                        f4 = (f5 - centerY) / height;
                    }
                }
                if (f4 >= 0.0f) {
                    float height2 = f2 / b.height();
                    float interpolation = a.getInterpolation(f4);
                    float f6 = (height2 * interpolation) + (height2 * 0.1f * (1.0f - interpolation));
                    bwuj f7 = bxbxVar.f();
                    if (f7 != null) {
                        dhkb dhkbVar = f7.c().c;
                        if (dhkbVar == null) {
                            dhkbVar = dhkb.e;
                        }
                        float f8 = dhkbVar.b + (f6 * f);
                        dhkb dhkbVar2 = f7.c().c;
                        if (dhkbVar2 == null) {
                            dhkbVar2 = dhkb.e;
                        }
                        f7.a(f8, dhkbVar2.c);
                    }
                }
            }
        }
    }
}
