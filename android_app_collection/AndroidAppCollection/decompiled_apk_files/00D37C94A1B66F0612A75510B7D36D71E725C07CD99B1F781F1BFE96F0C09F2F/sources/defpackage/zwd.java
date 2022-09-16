package defpackage;

import android.widget.TextView;
/* compiled from: PG */
/* renamed from: zwd  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class zwd implements ayqb {
    public final /* synthetic */ TextView a;
    private final /* synthetic */ int b;

    public /* synthetic */ zwd(TextView textView, int i) {
        this.b = i;
        this.a = textView;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            this.a.setText(((zvu) obj).d);
        } else {
            this.a.setText(((avwg) obj).getFormattedAmount());
        }
    }
}
