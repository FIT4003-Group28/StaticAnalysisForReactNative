package defpackage;

import android.widget.TextView;
/* compiled from: PG */
/* renamed from: meh  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class meh implements ayqb {
    public final /* synthetic */ mej a;
    private final /* synthetic */ int b;

    public /* synthetic */ meh(mej mejVar, int i) {
        this.b = i;
        this.a = mejVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            mej mejVar = this.a;
            Boolean bool = (Boolean) obj;
            if (!bool.booleanValue() && !mejVar.c.c()) {
                return;
            }
            zag.o(mejVar.c.a(), bool.booleanValue());
        } else if (i == 1) {
            mej mejVar2 = this.a;
            Boolean bool2 = (Boolean) obj;
            if (bool2.booleanValue() || mejVar2.d.c()) {
                zag.o(mejVar2.d.a(), bool2.booleanValue());
            }
            if (!bool2.booleanValue()) {
                return;
            }
            ((TextView) mejVar2.d.a()).setLayoutDirection(((TextView) mejVar2.d.a()).getParent().getLayoutDirection());
        } else {
            ((TextView) this.a.d.a()).setText((String) obj);
        }
    }
}
