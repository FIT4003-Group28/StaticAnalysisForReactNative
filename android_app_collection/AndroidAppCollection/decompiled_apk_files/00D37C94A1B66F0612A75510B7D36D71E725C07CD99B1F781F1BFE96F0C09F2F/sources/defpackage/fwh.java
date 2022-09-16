package defpackage;

import com.google.android.apps.youtube.app.common.ui.bottomui.MealbarPromoController;
import com.google.protos.youtube.api.innertube.ShowMealbarActionOuterClass$ShowMealbarAction;
import java.util.Map;
/* compiled from: PG */
/* renamed from: fwh  reason: default package */
/* loaded from: classes3.dex */
public final class fwh implements aafl {
    private final MealbarPromoController a;
    private final acth b;

    public fwh(MealbarPromoController mealbarPromoController, acth acthVar) {
        this.a = mealbarPromoController;
        this.b = acthVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (!apzgVar.qn(ShowMealbarActionOuterClass$ShowMealbarAction.showMealbarAction)) {
            return;
        }
        ShowMealbarActionOuterClass$ShowMealbarAction showMealbarActionOuterClass$ShowMealbarAction = (ShowMealbarActionOuterClass$ShowMealbarAction) apzgVar.qm(ShowMealbarActionOuterClass$ShowMealbarAction.showMealbarAction);
        auvk auvkVar = showMealbarActionOuterClass$ShowMealbarAction.b;
        if (auvkVar == null) {
            auvkVar = auvk.a;
        }
        if ((auvkVar.b & 1) == 0) {
            return;
        }
        auvk auvkVar2 = showMealbarActionOuterClass$ShowMealbarAction.b;
        if (auvkVar2 == null) {
            auvkVar2 = auvk.a;
        }
        atds atdsVar = auvkVar2.c;
        if (atdsVar == null) {
            atdsVar = atds.a;
        }
        this.a.h(atdsVar, this.b.oi());
    }
}
