package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.maps.R;
/* renamed from: cwgo  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cwgo implements cwqi {
    static final cwqi a = new cwgo();

    private cwgo() {
    }

    @Override // defpackage.cwqi
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.og_loading_indicator, viewGroup, false);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.og_account_menu_loading_height)));
        frameLayout.setPadding(0, 0, 0, viewGroup.getContext().getResources().getDimensionPixelOffset(R.dimen.og_dialog_header_close_button_size));
        return frameLayout;
    }
}
