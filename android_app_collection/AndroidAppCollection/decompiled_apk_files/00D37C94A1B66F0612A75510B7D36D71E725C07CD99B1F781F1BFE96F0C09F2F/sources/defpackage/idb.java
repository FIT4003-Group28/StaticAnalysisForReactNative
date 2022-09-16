package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: idb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class idb implements View.OnClickListener {
    public final /* synthetic */ idj a;
    public final /* synthetic */ apoj b;
    private final /* synthetic */ int c;

    public /* synthetic */ idb(idj idjVar, apoj apojVar) {
        this.a = idjVar;
        this.b = apojVar;
    }

    public /* synthetic */ idb(idj idjVar, apoj apojVar, int i) {
        this.c = i;
        this.a = idjVar;
        this.b = apojVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        if (i == 0) {
            idj idjVar = this.a;
            apoj apojVar = this.b;
            aafo aafoVar = idjVar.g;
            apzg apzgVar = apojVar.p;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.a(apzgVar);
        } else if (i == 1) {
            idj idjVar2 = this.a;
            apoj apojVar2 = this.b;
            aafo aafoVar2 = idjVar2.g;
            apzg apzgVar2 = apojVar2.p;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            aafoVar2.a(apzgVar2);
        } else {
            idj idjVar3 = this.a;
            apoj apojVar3 = this.b;
            if ((apojVar3.b & 1048576) != 0) {
                idjVar3.i.oi().H(3, new acte(apojVar3.t), null);
            }
            aafo aafoVar3 = idjVar3.g;
            apzg apzgVar3 = apojVar3.p;
            if (apzgVar3 == null) {
                apzgVar3 = apzg.a;
            }
            aafoVar3.a(apzgVar3);
        }
    }
}
