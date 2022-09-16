package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsContainer;
/* compiled from: PG */
/* renamed from: fug  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fug implements View.OnClickListener {
    public final /* synthetic */ HatsContainer a;
    private final /* synthetic */ int b;

    public /* synthetic */ fug(HatsContainer hatsContainer, int i) {
        this.b = i;
        this.a = hatsContainer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            this.a.b();
        } else {
            this.a.b();
        }
    }
}
