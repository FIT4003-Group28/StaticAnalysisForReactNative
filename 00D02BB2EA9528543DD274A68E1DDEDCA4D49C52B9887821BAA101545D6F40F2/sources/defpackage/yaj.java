package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: yaj  reason: default package */
/* loaded from: classes7.dex */
abstract class yaj implements xyx {
    @dzsi
    public xyy d;
    public final yae e;

    public yaj(yae yaeVar) {
        this.e = yaeVar;
    }

    @Override // defpackage.xyx
    public void f(xyy xyyVar) {
        this.d = xyyVar;
    }

    @Override // defpackage.xyx
    public View.OnClickListener g() {
        return new View.OnClickListener(this) { // from class: yai
            private final yaj a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yaj yajVar = this.a;
                xyy xyyVar = yajVar.d;
                if (xyyVar != null) {
                    xyyVar.c();
                }
                yae yaeVar = yajVar.e;
                yaeVar.a.u(yaeVar.b, yaeVar.c, yaeVar.d.e);
            }
        };
    }

    @Override // defpackage.xyx
    public cjtd h() {
        throw null;
    }
}
