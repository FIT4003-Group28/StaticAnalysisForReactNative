package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ajdb  reason: default package */
/* loaded from: classes2.dex */
public final class ajdb implements ajcw {
    private final ajda a;
    private final CharSequence b;
    private final Context c;
    private final boolean d;
    private boolean e;
    private jib f;

    public ajdb(ajda ajdaVar, CharSequence charSequence, cqhn cqhnVar, Context context, boolean z, boolean z2) {
        this.a = ajdaVar;
        this.b = charSequence;
        this.c = context;
        this.e = z;
        this.d = z2;
        this.f = d(ajdaVar, context, z, charSequence, z2);
    }

    static jib d(final ajda ajdaVar, Context context, boolean z, CharSequence charSequence, boolean z2) {
        jhz a = jhz.a();
        a.q = z ? ibm.b() : ibm.a();
        a.f(new View.OnClickListener(ajdaVar) { // from class: ajcy
            private final ajda a;

            {
                this.a = ajdaVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ((ajcj) this.a).a.aU();
            }
        });
        a.x = false;
        a.A = false;
        a.d = gdj.b();
        a.j = cqrt.l(R.string.BACK_BUTTON);
        a.o = cjtd.a(z2 ? dtxu.fC : dtxu.dy);
        if (z) {
            a.a = charSequence;
            jhm jhmVar = new jhm();
            jhmVar.c = cqrt.f(2131232289);
            jhmVar.d = ibm.p();
            jhmVar.h = 2;
            jhmVar.n = true;
            jhmVar.d(new View.OnClickListener(ajdaVar) { // from class: ajcz
                private final ajda a;

                {
                    this.a = ajdaVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ((ajcj) this.a).a.q();
                }
            });
            jhmVar.b = context.getString(R.string.LEARN_MORE_SHARING_LINK_TITLE);
            jhmVar.f = cjtd.a(dtxu.dz);
            a.c(jhmVar.c());
        } else {
            a.g = ibl.b();
            a.e = cqrt.f(R.drawable.toolbar_action_background);
        }
        return a.b();
    }

    @Override // defpackage.ajcw
    public jib a() {
        return this.f;
    }

    @Override // defpackage.ajcw
    public Boolean b() {
        return Boolean.valueOf(this.e);
    }

    public void c(boolean z) {
        if (this.e != z) {
            this.e = z;
            this.f = d(this.a, this.c, z, this.b, this.d);
            cqkx.p(this);
        }
    }
}
