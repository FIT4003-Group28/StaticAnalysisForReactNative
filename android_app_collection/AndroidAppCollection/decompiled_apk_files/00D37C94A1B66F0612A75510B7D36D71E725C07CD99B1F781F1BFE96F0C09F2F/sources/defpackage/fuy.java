package defpackage;

import com.google.android.apps.youtube.app.common.ui.bottomui.MealbarPromoController;
/* compiled from: PG */
/* renamed from: fuy  reason: default package */
/* loaded from: classes3.dex */
public final class fuy implements akev {
    final /* synthetic */ atds a;
    final /* synthetic */ MealbarPromoController b;

    public fuy(MealbarPromoController mealbarPromoController, atds atdsVar) {
        this.b = mealbarPromoController;
        this.a = atdsVar;
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void le(Object obj, int i) {
        akff akffVar = (akff) obj;
        MealbarPromoController mealbarPromoController = this.b;
        mealbarPromoController.d = null;
        mealbarPromoController.e = null;
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void lf(Object obj) {
        MealbarPromoController mealbarPromoController = this.b;
        mealbarPromoController.d = this.a;
        mealbarPromoController.e = (akff) obj;
    }
}
