package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nqq  reason: default package */
/* loaded from: classes7.dex */
public final class nqq extends cqtd {
    final /* synthetic */ cqrp a;
    final /* synthetic */ dbsg b;
    final /* synthetic */ nsd c;
    final /* synthetic */ dbsg d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nqq(Object[] objArr, cqrp cqrpVar, dbsg dbsgVar, nsd nsdVar, dbsg dbsgVar2) {
        super(objArr);
        this.a = cqrpVar;
        this.b = dbsgVar;
        this.c = nsdVar;
        this.d = dbsgVar2;
    }

    @Override // defpackage.cqtd
    public final Drawable a(final Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke(this.a.e(context), ((cqss) this.b.c(nql.aN)).b(context));
        nsd nsdVar = this.c;
        ArrayList arrayList = new ArrayList();
        nqc nqcVar = (nqc) nsdVar;
        dcdc i = dcdc.i(nqcVar.a, nqcVar.b, nqcVar.c, nqcVar.d);
        int size = i.size();
        for (int i2 = 0; i2 < size; i2++) {
            Float valueOf = Float.valueOf(((cqrp) i.get(i2)).a(context));
            arrayList.add(valueOf);
            arrayList.add(valueOf);
        }
        dbsk.m(arrayList.size() == 8, "Should be 2x4 corner radii.");
        gradientDrawable.setCornerRadii(dece.d(arrayList));
        final ArrayList arrayList2 = new ArrayList();
        bvor.a(this.d, new mw(arrayList2, context) { // from class: nqp
            private final ArrayList a;
            private final Context b;

            {
                this.a = arrayList2;
                this.b = context;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                this.a.add(((cqtd) obj).a(this.b));
            }
        });
        arrayList2.add(gradientDrawable);
        return new LayerDrawable((Drawable[]) arrayList2.toArray(new Drawable[0]));
    }
}
