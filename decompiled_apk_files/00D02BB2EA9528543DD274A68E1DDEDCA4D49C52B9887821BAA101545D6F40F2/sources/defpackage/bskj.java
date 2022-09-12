package defpackage;

import android.view.View;
/* renamed from: bskj  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class bskj {
    @dzsi
    public static View.OnClickListener a(final bskm bskmVar) {
        if (bskmVar.d().booleanValue()) {
            return new View.OnClickListener(bskmVar) { // from class: bskk
                private final bskm a;

                {
                    this.a = bskmVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.e(cjqm.a);
                }
            };
        }
        return null;
    }

    public static Boolean b() {
        return true;
    }
}
