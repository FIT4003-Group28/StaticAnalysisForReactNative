package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aboh  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aboh implements View.OnClickListener {
    public final /* synthetic */ abop a;
    public final /* synthetic */ apoj b;
    private final /* synthetic */ int c;

    public /* synthetic */ aboh(abop abopVar, apoj apojVar) {
        this.a = abopVar;
        this.b = apojVar;
    }

    public /* synthetic */ aboh(abop abopVar, apoj apojVar, int i) {
        this.c = i;
        this.a = abopVar;
        this.b = apojVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.c == 0) {
            abop abopVar = this.a;
            abopVar.l.e(this.b);
            return;
        }
        abop abopVar2 = this.a;
        apoj apojVar = this.b;
        if ((apojVar.b & 16384) != 0) {
            abkm abkmVar = abopVar2.l;
            apzg apzgVar = apojVar.o;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            abkmVar.h(apzgVar);
        }
        if ((apojVar.b & 8192) == 0) {
            return;
        }
        abkm abkmVar2 = abopVar2.l;
        apzg apzgVar2 = apojVar.n;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        abkmVar2.h(apzgVar2);
    }
}
