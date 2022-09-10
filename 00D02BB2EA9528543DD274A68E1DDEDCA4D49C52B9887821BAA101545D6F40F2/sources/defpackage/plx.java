package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: plx  reason: default package */
/* loaded from: classes7.dex */
public class plx implements plm {
    public final pmk a;
    private final String b;

    public plx(String str, pmk pmkVar) {
        this.b = str;
        this.a = pmkVar;
    }

    @Override // defpackage.igw
    public Boolean a() {
        return true;
    }

    @Override // defpackage.plm
    public plr b() {
        return this.a;
    }

    @Override // defpackage.plm
    public View.OnClickListener c() {
        return new View.OnClickListener(this) { // from class: plw
            private final plx a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                plq c = this.a.a.c();
                if (c == null) {
                    return;
                }
                c.e().onClick(view);
            }
        };
    }

    @Override // defpackage.plm
    public cjtd d() {
        cjta b = cjtd.b();
        b.d = dtxl.ii;
        b.g(this.b);
        return b.a();
    }
}
