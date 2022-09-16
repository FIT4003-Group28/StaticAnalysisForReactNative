package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* compiled from: PG */
/* renamed from: allj  reason: default package */
/* loaded from: classes.dex */
public final class allj implements kj {
    final /* synthetic */ alll a;
    final /* synthetic */ aljd b;

    public allj(aljd aljdVar, alll alllVar) {
        this.b = aljdVar;
        this.a = alllVar;
    }

    @Override // defpackage.kj
    public final mb a(View view, mb mbVar) {
        aljd aljdVar = this.b;
        alll alllVar = new alll(this.a);
        aljdVar.b.j = mbVar.f();
        int e = lj.e(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        BottomSheetBehavior bottomSheetBehavior = aljdVar.b;
        if (bottomSheetBehavior.f) {
            bottomSheetBehavior.i = mbVar.c();
            paddingBottom = alllVar.d + aljdVar.b.i;
        }
        if (aljdVar.b.g) {
            paddingLeft = (e == 1 ? alllVar.c : alllVar.a) + mbVar.d();
        }
        if (aljdVar.b.h) {
            paddingRight = (e == 1 ? alllVar.a : alllVar.c) + mbVar.e();
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        if (aljdVar.a) {
            aljdVar.b.e = mbVar.h().e;
        }
        BottomSheetBehavior bottomSheetBehavior2 = aljdVar.b;
        if (bottomSheetBehavior2.f || aljdVar.a) {
            bottomSheetBehavior2.J();
        }
        return mbVar;
    }
}
