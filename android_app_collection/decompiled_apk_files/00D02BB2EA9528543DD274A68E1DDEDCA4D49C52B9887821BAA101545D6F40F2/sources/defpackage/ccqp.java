package defpackage;

import android.view.View;
import android.view.ViewGroup;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ccqp  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class ccqp implements cqfc {
    static final cqfc a = new ccqp();

    private ccqp() {
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        cqjg cqjgVar = ccra.a;
        ViewGroup viewGroup = (ViewGroup) view;
        View findViewById = viewGroup.findViewById(ccra.d);
        View findViewById2 = viewGroup.findViewById(ccra.c);
        if (findViewById == null || findViewById2 == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById2.getLayoutParams();
        marginLayoutParams.leftMargin = findViewById.getWidth();
        marginLayoutParams.rightMargin = findViewById.getWidth();
        findViewById2.setLayoutParams(marginLayoutParams);
    }
}
