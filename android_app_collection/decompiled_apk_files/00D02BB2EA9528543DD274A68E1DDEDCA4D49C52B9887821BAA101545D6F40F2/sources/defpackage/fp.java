package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
/* compiled from: PG */
/* renamed from: fp  reason: default package */
/* loaded from: classes.dex */
public final class fp {
    public final fr<?> a;

    private fp(fr<?> frVar) {
        this.a = frVar;
    }

    public static fp a(fr<?> frVar) {
        return new fp(frVar);
    }

    public final gn b() {
        return this.a.e;
    }

    public final View c(View view, String str, Context context, AttributeSet attributeSet) {
        return this.a.e.c.onCreateView(view, str, context, attributeSet);
    }

    public final void d() {
        this.a.e.Q();
    }

    public final Parcelable e() {
        return this.a.e.N();
    }

    public final void f(Parcelable parcelable) {
        fr<?> frVar = this.a;
        if (!(frVar instanceof ax)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        frVar.e.O(parcelable);
    }

    public final void g() {
        this.a.e.R();
    }

    public final void h() {
        this.a.e.S();
    }

    public final void i() {
        this.a.e.T();
    }

    public final void j() {
        this.a.e.U();
    }

    public final void k() {
        this.a.e.V();
    }

    public final void l() {
        this.a.e.W();
    }

    public final void m() {
        this.a.e.X();
    }

    public final void n(Configuration configuration) {
        this.a.e.ab(configuration);
    }

    public final void o() {
        this.a.e.ac();
    }

    public final void p() {
        fr<?> frVar = this.a;
        frVar.e.P(frVar, frVar, null);
    }

    public final void q() {
        this.a.e.at(true);
    }
}
