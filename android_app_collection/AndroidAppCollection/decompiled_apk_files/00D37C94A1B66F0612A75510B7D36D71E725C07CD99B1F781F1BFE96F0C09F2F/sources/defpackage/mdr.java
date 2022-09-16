package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mdr  reason: default package */
/* loaded from: classes3.dex */
public final class mdr extends mdm {
    @Override // defpackage.dp
    public final void Y() {
        super.Y();
        Dialog dialog = this.d;
        if (dialog != null) {
            dialog.setOnKeyListener(new mdq(this));
        }
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        Dialog dialog = this.d;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setGravity(80);
        }
        return layoutInflater.inflate(R.layout.keyboard_shortcuts_dialog, viewGroup, false);
    }
}
