package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
/* compiled from: PG */
/* renamed from: axoe  reason: default package */
/* loaded from: classes2.dex */
public final class axoe implements axon {
    private volatile Object a;
    private final Object b = new Object();
    private final dp c;

    public axoe(dp dpVar) {
        this.c = dpVar;
    }

    public static final Context a(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public static ContextWrapper b(Context context, dp dpVar) {
        return new axoh(context, dpVar);
    }

    public static ContextWrapper c(LayoutInflater layoutInflater, dp dpVar) {
        return new axoh(layoutInflater, dpVar);
    }

    @Override // defpackage.axon
    public final Object lI() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    awwc.p(this.c.M(), "Sting Fragments must be attached before creating the component.");
                    awwc.n(this.c.M() instanceof axon, "Sting Fragments must be attached to an @Sting Activity. Found: %s", this.c.M().getClass());
                    dxa ku = ((axod) awwc.u(this.c.M(), axod.class)).ku();
                    ku.c = this.c;
                    axzl.n(ku.c, dp.class);
                    this.a = new eao(ku.a, ku.d, ku.b, ku.c);
                }
            }
        }
        return this.a;
    }
}
