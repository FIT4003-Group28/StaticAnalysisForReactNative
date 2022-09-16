package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
/* compiled from: PG */
/* renamed from: axoh  reason: default package */
/* loaded from: classes2.dex */
public class axoh extends ContextWrapper {
    public dp a;
    public LayoutInflater b;
    public LayoutInflater c;
    private final j d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axoh(Context context, dp dpVar) {
        super(context);
        awwc.o(context);
        j jVar = new j() { // from class: dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1
            @Override // defpackage.j
            public final void a(apy apyVar, aps apsVar) {
                if (apsVar == aps.ON_DESTROY) {
                    axoh axohVar = axoh.this;
                    axohVar.a = null;
                    axohVar.b = null;
                    axohVar.c = null;
                }
            }
        };
        this.d = jVar;
        this.b = null;
        this.a = dpVar;
        dpVar.X.c(jVar);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.c == null) {
            if (this.b == null) {
                this.b = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            }
            this.c = this.b.cloneInContext(this);
        }
        return this.c;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public axoh(android.view.LayoutInflater r2, defpackage.dp r3) {
        /*
            r1 = this;
            defpackage.awwc.o(r2)
            android.content.Context r0 = r2.getContext()
            defpackage.awwc.o(r0)
            r1.<init>(r0)
            dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1 r0 = new dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1
            r0.<init>()
            r1.d = r0
            r1.b = r2
            r1.a = r3
            l r2 = r3.X
            r2.c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axoh.<init>(android.view.LayoutInflater, dp):void");
    }
}
