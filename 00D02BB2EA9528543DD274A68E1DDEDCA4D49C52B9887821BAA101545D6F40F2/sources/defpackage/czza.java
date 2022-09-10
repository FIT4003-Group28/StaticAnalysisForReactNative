package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: czza  reason: default package */
/* loaded from: classes5.dex */
public abstract class czza implements daad {
    public final ExtendedFloatingActionButton a;
    public czur b;
    private final Context c;
    private final ArrayList<Animator.AnimatorListener> d = new ArrayList<>();
    private final czyy e;
    private czur f;

    public czza(ExtendedFloatingActionButton extendedFloatingActionButton, czyy czyyVar) {
        this.a = extendedFloatingActionButton;
        this.c = extendedFloatingActionButton.getContext();
        this.e = czyyVar;
    }

    public final czur a() {
        czur czurVar = this.b;
        if (czurVar != null) {
            return czurVar;
        }
        if (this.f == null) {
            this.f = czur.g(this.c, i());
        }
        czur czurVar2 = this.f;
        nb.b(czurVar2);
        return czurVar2;
    }

    @Override // defpackage.daad
    public final List<Animator.AnimatorListener> b() {
        return this.d;
    }

    @Override // defpackage.daad
    public void c(Animator animator) {
        czyy czyyVar = this.e;
        Animator animator2 = czyyVar.a;
        if (animator2 != null) {
            animator2.cancel();
        }
        czyyVar.a = animator;
    }

    @Override // defpackage.daad
    public void d() {
        this.e.a();
    }

    @Override // defpackage.daad
    public void e() {
        this.e.a();
    }

    @Override // defpackage.daad
    public AnimatorSet f() {
        return g(a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final AnimatorSet g(czur czurVar) {
        ArrayList arrayList = new ArrayList();
        if (czurVar.b("opacity")) {
            arrayList.add(czurVar.e("opacity", this.a, View.ALPHA));
        }
        if (czurVar.b("scale")) {
            arrayList.add(czurVar.e("scale", this.a, View.SCALE_Y));
            arrayList.add(czurVar.e("scale", this.a, View.SCALE_X));
        }
        if (czurVar.b("width")) {
            arrayList.add(czurVar.e("width", this.a, ExtendedFloatingActionButton.o));
        }
        if (czurVar.b("height")) {
            arrayList.add(czurVar.e("height", this.a, ExtendedFloatingActionButton.p));
        }
        if (czurVar.b("paddingStart")) {
            arrayList.add(czurVar.e("paddingStart", this.a, ExtendedFloatingActionButton.q));
        }
        if (czurVar.b("paddingEnd")) {
            arrayList.add(czurVar.e("paddingEnd", this.a, ExtendedFloatingActionButton.r));
        }
        if (czurVar.b("labelOpacity")) {
            arrayList.add(czurVar.e("labelOpacity", this.a, new czyz(this, Float.class)));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        czun.a(animatorSet, arrayList);
        return animatorSet;
    }
}
