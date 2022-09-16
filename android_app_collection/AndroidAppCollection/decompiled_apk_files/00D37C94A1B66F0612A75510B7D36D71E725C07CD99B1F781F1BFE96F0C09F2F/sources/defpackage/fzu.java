package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: fzu  reason: default package */
/* loaded from: classes3.dex */
final class fzu implements View.OnClickListener {
    final /* synthetic */ fzx a;
    private final aspb b;
    private final aopc c;

    public fzu(fzx fzxVar, aopc aopcVar, aspb aspbVar) {
        this.a = fzxVar;
        this.c = aopcVar;
        this.b = aspbVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.isSelected()) {
            this.a.h(aspb.INDIFFERENT, this.c);
        } else {
            this.a.h(this.b, this.c);
        }
    }
}
