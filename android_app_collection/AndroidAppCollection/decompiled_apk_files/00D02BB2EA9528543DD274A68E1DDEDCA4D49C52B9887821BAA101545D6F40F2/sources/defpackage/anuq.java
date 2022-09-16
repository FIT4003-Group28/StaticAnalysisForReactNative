package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: anuq  reason: default package */
/* loaded from: classes2.dex */
final class anuq implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ View a;
    final /* synthetic */ anut b;

    public anuq(anut anutVar, View view) {
        this.b = anutVar;
        this.a = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (this.b.ay.a()) {
            final anut anutVar = this.b;
            if (!anutVar.aw.m().q(anutVar.ay.b(), new dbty(anutVar) { // from class: anuo
                private final anut a;

                {
                    this.a = anutVar;
                }

                @Override // defpackage.dbty
                public final Object a() {
                    anut anutVar2 = this.a;
                    return Integer.valueOf(aobf.d(anutVar2.av, anutVar2.ax).a());
                }
            })) {
                return true;
            }
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
            return false;
        }
        dbsg<View> aR = this.b.aR();
        if (aR.a()) {
            this.b.d.b(aR.b());
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        return false;
    }
}
