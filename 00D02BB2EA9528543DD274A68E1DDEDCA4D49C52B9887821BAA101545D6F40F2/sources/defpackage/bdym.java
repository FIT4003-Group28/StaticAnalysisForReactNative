package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bdym  reason: default package */
/* loaded from: classes3.dex */
public final class bdym {
    public static final cqtv a = cqsg.f(cqrp.f(14.0d), Float.valueOf(0.7f));
    public final Activity b;
    public final btvo c;
    public final abfa d;
    public final bego e;
    public final bdwp f;

    public bdym(Activity activity, btvo btvoVar, abfa abfaVar, bego begoVar, bdwp bdwpVar) {
        this.b = activity;
        this.c = btvoVar;
        this.d = abfaVar;
        this.e = begoVar;
        this.f = bdwpVar;
    }

    public static final Integer c(View view, cqjg cqjgVar) {
        View a2 = cqhu.a(view, cqjgVar);
        if (a2 == null || a2.getVisibility() == 8) {
            return 0;
        }
        return Integer.valueOf(a2.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Integer a(ilo iloVar) {
        int X;
        int i = 0;
        if (!this.e.a(iloVar)) {
            View findViewById = this.f.findViewById(R.id.header);
            if (findViewById != null) {
                i = findViewById.getHeight();
            }
            bnjo bnjoVar = this.f.i;
            if (findViewById != null && bnjoVar != null && (bnjoVar instanceof bdyk)) {
                bdyk bdykVar = (bdyk) bnjoVar;
                if (bdykVar.U().booleanValue()) {
                    X = bdykVar.W();
                } else if (bdykVar.V().booleanValue()) {
                    X = bdykVar.X();
                }
                i += X;
            }
            return Integer.valueOf(i);
        } else if (!this.d.b() || !iloVar.o) {
            View b = b();
            if (b != null) {
                if (b.getMeasuredWidth() != this.f.getWidth()) {
                    b.measure(View.MeasureSpec.makeMeasureSpec(this.f.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                }
                i = b.getMeasuredHeight();
            }
            bnjo bnjoVar2 = this.f.i;
            if (bnjoVar2 != null && bnjoVar2.o().z().booleanValue()) {
                i += jmj.a(this.f.getContext(), 102);
            }
            return Integer.valueOf(i);
        } else {
            return Integer.valueOf((int) (bvsc.a(this.b) * this.c.getPlaceSheetParameters().p()));
        }
    }

    @dzsi
    public final View b() {
        bnjo bnjoVar = this.f.i;
        if (bnjoVar == null) {
            return null;
        }
        return this.f.findViewById(true != bnjoVar.af().booleanValue() ? R.id.business_place_card : R.id.geocode_place_card);
    }
}
