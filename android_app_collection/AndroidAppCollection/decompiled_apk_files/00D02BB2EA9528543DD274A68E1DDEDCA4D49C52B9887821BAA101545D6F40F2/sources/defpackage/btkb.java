package defpackage;

import android.content.Context;
import android.view.View;
import androidx.preference.Preference;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: btkb  reason: default package */
/* loaded from: classes4.dex */
public final class btkb extends Preference {
    public final cjqy a;
    public WeakReference<View> b;
    private final Context c;
    private final ite d;

    public btkb(Context context, cjqy cjqyVar, ite iteVar) {
        super(context);
        this.c = context;
        this.a = cjqyVar;
        this.d = iteVar;
        this.b = new WeakReference<>(null);
    }

    @Override // androidx.preference.Preference
    public final void Rk(ave aveVar) {
        super.Rk(aveVar);
        View C = aveVar.C(16908304);
        this.b = new WeakReference<>(C);
        cjqg.h(C, cjtd.a(dtxy.V));
        this.d.c(C);
        aveVar.a.setBackgroundColor(ibm.g().b(this.c));
    }
}
