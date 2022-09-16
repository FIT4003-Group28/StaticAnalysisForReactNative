package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: akjq  reason: default package */
/* loaded from: classes.dex */
public final class akjq implements akjt {
    public final Context a;
    public final aafo b;
    public final DialogInterface c;
    public final ajrt d = new ajrt() { // from class: akjo
        @Override // defpackage.ajrt
        public final void a(ajrs ajrsVar, ajqm ajqmVar, int i) {
            ajrsVar.f(akjt.o, akjq.this);
        }
    };
    public final ajsg e;
    public akjs f;
    public View g;
    public ajsf h;
    public ajsm i;
    public ajsm j;
    public View k;
    public RecyclerView l;
    public final kxz m;
    public final krb n;

    public akjq(Context context, aafo aafoVar, kxz kxzVar, krb krbVar, ajsg ajsgVar, DialogInterface dialogInterface, akjs akjsVar, byte[] bArr) {
        this.a = context;
        this.b = aafoVar;
        this.c = dialogInterface;
        this.f = akjsVar;
        this.m = kxzVar;
        this.n = krbVar;
        this.e = ajsgVar;
    }

    @Override // defpackage.akjt
    public final void a(String str, boolean z) {
        if (z) {
            this.f.e.add(str);
        } else {
            this.f.e.remove(str);
        }
    }

    public final void b() {
        View view = this.g;
        view.setMinimumWidth(view.getResources().getDimensionPixelSize(R.dimen.subscription_notification_dialog_min_width));
    }

    @Override // defpackage.akjt
    public final boolean d() {
        avbp avbpVar = this.f.d;
        if (avbpVar == null) {
            return false;
        }
        return avbpVar.g;
    }

    @Override // defpackage.akjt
    public final boolean e(String str) {
        return this.f.e.contains(str);
    }

    @Override // defpackage.akjt
    public final boolean f(avbp avbpVar) {
        avbp avbpVar2 = this.f.d;
        if (avbpVar2 == null) {
            return false;
        }
        return avbpVar2.equals(avbpVar);
    }

    @Override // defpackage.akjt
    public final void c(avbp avbpVar, boolean z) {
        if (z) {
            akjs akjsVar = this.f;
            akjsVar.d = avbpVar;
            ajsf ajsfVar = this.h;
            avbl avblVar = akjsVar.a;
            ajsfVar.oo(0, avblVar == null ? 0 : avblVar.c.size());
            this.j.l();
        }
    }
}
