package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: anfe  reason: default package */
/* loaded from: classes2.dex */
public class anfe implements jbk {
    public final aneg a;
    private final String b;
    private final String c;

    public anfe(String str, String str2, aneg anegVar) {
        this.b = str;
        this.c = str2;
        this.a = anegVar;
    }

    @Override // defpackage.jbk
    public jib NC() {
        jhz a = jhz.a();
        a.a = this.b;
        a.b = this.c;
        a.f(new View.OnClickListener(this) { // from class: anfd
            private final anfe a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ((andg) this.a.a).a.w();
            }
        });
        a.h = true;
        return a.b();
    }
}
