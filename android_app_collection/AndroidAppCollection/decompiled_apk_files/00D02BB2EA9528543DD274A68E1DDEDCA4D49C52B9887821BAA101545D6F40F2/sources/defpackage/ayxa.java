package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ayxa  reason: default package */
/* loaded from: classes3.dex */
final class ayxa implements dbrn<View, View> {
    final /* synthetic */ View a;
    final /* synthetic */ ayxb b;

    public ayxa(ayxb ayxbVar, View view) {
        this.b = ayxbVar;
        this.a = view;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ View a(View view) {
        jdi jdiVar;
        View view2 = view;
        ayxb ayxbVar = this.b;
        ArrayList<View> arrayList = new ArrayList<>();
        view2.findViewsWithText(arrayList, ayxbVar.b.getString(R.string.SAVE), 1);
        view2.findViewsWithText(arrayList, ayxbVar.b.getString(R.string.SAVED), 1);
        if (!arrayList.isEmpty()) {
            ayxb ayxbVar2 = this.b;
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            jdo jdoVar = jdo.TOP;
            int width = iArr[0] + (view2.getWidth() / 2);
            int height = iArr[1] + view2.getHeight();
            if (ayxbVar2.b.getResources().getDisplayMetrics().heightPixels - height < 450) {
                jdoVar = jdo.NONE;
                height = iArr[1];
            }
            dbsi a = dbsi.a(jdoVar, new akra(width, height));
            final ayxb ayxbVar3 = this.b;
            View view3 = this.a;
            jdo jdoVar2 = (jdo) a.a;
            akra akraVar = (akra) a.b;
            if (ayxbVar3.e != jdoVar2 || (jdiVar = ayxbVar3.d) == null) {
                jdi jdiVar2 = ayxbVar3.d;
                if (jdiVar2 != null) {
                    jdiVar2.f();
                }
                ayxbVar3.d = new jdi(ayxbVar3.b, jdoVar2, null);
                ayxbVar3.e = jdoVar2;
                cqkf c = ayxbVar3.a.c(new ayxg(), null);
                ayxl ayxlVar = ayxbVar3.c;
                Runnable runnable = new Runnable(ayxbVar3) { // from class: aywz
                    private final ayxb a;

                    {
                        this.a = ayxbVar3;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ayxb ayxbVar4 = this.a;
                        jdi jdiVar3 = ayxbVar4.d;
                        if (jdiVar3 == null || !jdiVar3.b()) {
                            return;
                        }
                        ayxbVar4.d.f();
                    }
                };
                ache a2 = ayxlVar.a.a();
                ayxl.a(a2, 1);
                ayxl.a(runnable, 2);
                c.e(new ayxk(a2, runnable));
                ayxbVar3.d.c(c.c());
                ayxbVar3.d.a(ayxbVar3.b.getResources().getColor(R.color.save_to_place_list_promo_background));
                jdiVar = ayxbVar3.d;
            }
            if (jdiVar.b()) {
                jdiVar.e(akraVar.a, akraVar.b);
            } else {
                jdiVar.d(view3, akraVar.a, akraVar.b);
            }
        }
        return view2;
    }
}
