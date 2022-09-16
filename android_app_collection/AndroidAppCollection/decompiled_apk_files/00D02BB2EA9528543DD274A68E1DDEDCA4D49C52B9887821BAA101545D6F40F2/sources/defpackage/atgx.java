package defpackage;

import android.view.View;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: atgx  reason: default package */
/* loaded from: classes2.dex */
public final class atgx implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ atna b;
    final /* synthetic */ View c;
    final /* synthetic */ atnj d;
    final /* synthetic */ View e;
    final /* synthetic */ View f;
    final /* synthetic */ View g;

    public atgx(List list, atna atnaVar, View view, atnj atnjVar, View view2, View view3, View view4) {
        this.a = list;
        this.b = atnaVar;
        this.c = view;
        this.d = atnjVar;
        this.e = view2;
        this.f = view3;
        this.g = view4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int intValue;
        for (cqjz cqjzVar : this.a) {
            cqjzVar.j();
        }
        if (this.b.ak().booleanValue()) {
            intValue = (int) cqsg.f(ird.b(), Float.valueOf(-1.0f)).a(this.c.getContext());
        } else {
            intValue = this.d.f().intValue();
        }
        float f = intValue;
        this.e.setTranslationY(f);
        View view = this.e;
        view.setPadding(view.getPaddingLeft(), this.e.getPaddingTop(), this.e.getPaddingRight(), -intValue);
        this.f.setTranslationY(f);
        this.g.setTranslationY(f);
    }
}
