package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: lac  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lac implements View.OnClickListener {
    public final /* synthetic */ lad a;
    public final /* synthetic */ apzg b;
    private final /* synthetic */ int c;

    public /* synthetic */ lac(lad ladVar, apzg apzgVar) {
        this.a = ladVar;
        this.b = apzgVar;
    }

    public /* synthetic */ lac(lad ladVar, apzg apzgVar, int i) {
        this.c = i;
        this.a = ladVar;
        this.b = apzgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        if (i == 0) {
            lad ladVar = this.a;
            ladVar.a.c(this.b, null);
        } else if (i == 1) {
            lad ladVar2 = this.a;
            ladVar2.a.c(this.b, null);
        } else if (i == 2) {
            lad ladVar3 = this.a;
            ladVar3.a.c(this.b, null);
        } else {
            lad ladVar4 = this.a;
            ladVar4.a.c(this.b, null);
        }
    }
}
