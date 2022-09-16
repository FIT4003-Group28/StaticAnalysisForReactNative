package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.common.loading.SpecificNetworkErrorViewLoadingFrameLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ezn  reason: default package */
/* loaded from: classes3.dex */
public final class ezn extends ezo {
    final /* synthetic */ SpecificNetworkErrorViewLoadingFrameLayout a;
    public ios b;
    private ImageView d;
    private View e;
    private View f;
    private boolean g;
    private int h;
    private boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezn(SpecificNetworkErrorViewLoadingFrameLayout specificNetworkErrorViewLoadingFrameLayout, int i) {
        super(specificNetworkErrorViewLoadingFrameLayout, 3, i, R.id.error_message_text);
        this.a = specificNetworkErrorViewLoadingFrameLayout;
    }

    @Override // defpackage.ezo
    protected final View a() {
        View a = super.a();
        this.d = (ImageView) a.findViewById(R.id.error_icon);
        this.e = a.findViewById(R.id.error_retry_button);
        this.f = a.findViewById(R.id.account_instructions_button);
        View view = this.e;
        if (view != null) {
            view.setOnClickListener(new ezm(this, 1));
        }
        View view2 = this.f;
        if (view2 != null) {
            view2.setOnClickListener(new ezm(this));
        }
        d(this.g);
        b(this.i);
        c(this.h);
        return a;
    }

    public final void b(boolean z) {
        View view = this.f;
        if (view != null) {
            view.setVisibility(true != z ? 8 : 0);
        } else {
            this.i = z;
        }
    }

    public final void c(int i) {
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setImageResource(i);
        } else {
            this.h = i;
        }
    }

    public final void d(boolean z) {
        View view = this.e;
        if (view != null) {
            view.setVisibility(true != z ? 8 : 0);
        } else {
            this.g = z;
        }
    }
}
