package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vb  reason: default package */
/* loaded from: classes4.dex */
public final class vb extends va {
    @Override // defpackage.va, defpackage.lf
    public final void c(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // defpackage.lf
    public final boolean d(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
