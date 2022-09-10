package defpackage;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: geb  reason: default package */
/* loaded from: classes.dex */
public abstract class geb extends gen {
    public View a;
    public ExpandingScrollView b;

    @Override // defpackage.fd
    public View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(J());
        frameLayout.setLayoutParams(new WindowManager.LayoutParams(-1, -1));
        frameLayout.setOnClickListener(g());
        frameLayout.setImportantForAccessibility(2);
        ExpandingScrollView expandingScrollView = new ExpandingScrollView(J());
        expandingScrollView.setExpandingStateTransition(jkc.m, jkc.l);
        expandingScrollView.H(new gea(this));
        frameLayout.addView(expandingScrollView);
        this.b = expandingScrollView;
        View q = q(bundle);
        this.a = q;
        this.b.setContent(q);
        return frameLayout;
    }

    protected View.OnClickListener g() {
        return new gdz(this);
    }

    @Override // defpackage.gen
    public Dialog i(Bundle bundle) {
        Dialog dialog = new Dialog(J(), R.style.BottomsheetDialog);
        Window window = dialog.getWindow();
        window.setGravity(80);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setLayout(-1, -1);
        return dialog;
    }

    protected abstract View q(Bundle bundle);

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public void s() {
        int ordinal;
        super.s();
        if (btpf.c(J()) == btpf.TABLET_LANDSCAPE) {
            ordinal = jjn.COLLAPSED.ordinal();
        } else {
            ordinal = jjn.EXPANDED.ordinal();
        }
        Bundle bundle = this.o;
        if (bundle != null) {
            ordinal = bundle.getInt("expandedState", ordinal);
        }
        this.b.setExpandingState(jjn.values()[ordinal], false);
        this.b.onConfigurationChanged(J().getResources().getConfiguration());
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public void t(Bundle bundle) {
        super.t(bundle);
        this.o.putInt("expandedState", this.b.f.ordinal());
    }
}
