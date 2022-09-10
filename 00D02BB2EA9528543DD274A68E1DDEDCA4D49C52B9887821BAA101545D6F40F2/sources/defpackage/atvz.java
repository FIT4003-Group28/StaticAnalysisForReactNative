package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: atvz  reason: default package */
/* loaded from: classes2.dex */
public final class atvz implements cqfc {
    public static final dcqe a = dcqe.c("atvz");
    public final Handler b;
    public final Context c;
    @dzsi
    public final azz d;
    public final atvy e;
    @dzsi
    private final azz f;
    private boolean g = false;

    public atvz(Handler handler, Context context, @dzsi azz azzVar, @dzsi azz azzVar2, atvy atvyVar) {
        this.b = handler;
        this.c = context;
        this.d = azzVar;
        this.f = azzVar2;
        this.e = atvyVar;
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        if (this.g) {
            return;
        }
        this.g = true;
        TextView textView = (TextView) cqhu.a(view, atrf.c);
        if (textView == null) {
            this.e.a();
            bvoo.h("TextView not found. Cannot perform animation.", new Object[0]);
            return;
        }
        View a2 = cqhu.a(view, atrf.b);
        if (a2 == null) {
            this.e.a();
            bvoo.h("IconView not found. Cannot perform animation.", new Object[0]);
            return;
        }
        azz azzVar = this.d;
        if (azzVar == null) {
            this.e.a();
            bvoo.h("IconAnimator not found. Cannot perform animation.", new Object[0]);
            return;
        }
        ((ImageView) a2).setImageDrawable(azzVar);
        this.d.c(new atvw(this));
        azz azzVar2 = this.f;
        if (azzVar2 == null) {
            this.e.a();
            bvoo.h("BackgroundAnimator not found. Cannot perform animation.", new Object[0]);
            return;
        }
        view.setBackground(azzVar2);
        this.f.c(new atvx(this, textView, view, a2));
        this.f.start();
    }
}
