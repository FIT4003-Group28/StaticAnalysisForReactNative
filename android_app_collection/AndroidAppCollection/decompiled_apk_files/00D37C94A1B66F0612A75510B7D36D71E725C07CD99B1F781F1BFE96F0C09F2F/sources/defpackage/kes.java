package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: kes  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kes implements ayqb {
    public final /* synthetic */ ket a;
    private final /* synthetic */ int b;

    public /* synthetic */ kes(ket ketVar, int i) {
        this.b = i;
        this.a = ketVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            this.a.d.setText((CharSequence) obj);
        } else if (i == 1) {
            this.a.d.setOnClickListener((View.OnClickListener) obj);
        } else {
            this.a.d.setVisibility(((Integer) obj).intValue());
        }
    }
}
