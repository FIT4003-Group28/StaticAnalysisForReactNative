package defpackage;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* renamed from: cwhr  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cwhr implements cwqi {
    static final cwqi a = new cwhr();

    private cwhr() {
    }

    @Override // defpackage.cwqi
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        TextView textView = new TextView(layoutInflater.getContext());
        textView.setText(R.string.og_choose_an_account_);
        qf.a(textView, 2132018139);
        textView.setGravity(1);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        return textView;
    }
}
