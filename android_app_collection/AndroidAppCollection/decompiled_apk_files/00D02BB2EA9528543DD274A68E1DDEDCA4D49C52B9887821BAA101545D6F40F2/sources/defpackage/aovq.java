package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: aovq  reason: default package */
/* loaded from: classes2.dex */
final class aovq implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ View a;
    final /* synthetic */ aovt b;

    public aovq(aovt aovtVar, View view) {
        this.b = aovtVar;
        this.a = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (this.b.aQ == aowo.DAY && this.b.aC.a()) {
            aovt aovtVar = this.b;
            if (!aovtVar.az.m().q(aovtVar.aC.b(), aovo.a)) {
                return true;
            }
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
            return false;
        } else if (this.b.aQ != aowo.DAY) {
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        } else {
            aovt aovtVar2 = this.b;
            dbsg<View> bn = aovtVar2.bn(aovtVar2.aA.c());
            if (bn.a()) {
                this.b.am.b(bn.b());
                this.a.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            return false;
        }
    }
}
