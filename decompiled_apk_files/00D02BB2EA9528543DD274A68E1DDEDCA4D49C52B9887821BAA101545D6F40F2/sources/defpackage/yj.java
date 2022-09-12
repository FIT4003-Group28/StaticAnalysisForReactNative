package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: yj  reason: default package */
/* loaded from: classes7.dex */
public final class yj extends yi {
    @Override // defpackage.yi, defpackage.yk
    public final void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // defpackage.yk
    public final boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
