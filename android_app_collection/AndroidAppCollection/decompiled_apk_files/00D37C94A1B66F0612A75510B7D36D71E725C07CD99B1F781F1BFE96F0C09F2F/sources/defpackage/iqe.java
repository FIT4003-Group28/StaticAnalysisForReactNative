package defpackage;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: iqe */
/* loaded from: classes3.dex */
public final class iqe {
    public static final PaneDescriptor a(String str) {
        Bundle a = PaneDescriptor.a();
        a.putString("playlist_id", str);
        return new PaneDescriptor(iqf.class, a);
    }

    public static String b(arpa arpaVar) {
        if (arpaVar != null && arpaVar.d.size() != 0) {
            for (arpb arpbVar : arpaVar.d) {
                int G = akpq.G(arpbVar.b);
                if (G != 0 && G == 5) {
                    for (asmc asmcVar : arpbVar.c) {
                        if (TextUtils.equals(asmcVar.e, "context")) {
                            return asmcVar.c == 2 ? (String) asmcVar.d : "";
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    public static /* synthetic */ String c(int i) {
        switch (i) {
            case 1:
                return "INIT";
            case 2:
                return "WAIT_FOR_MEDIALIST";
            case 3:
                return "PREPARE_UPLOADS";
            case 4:
                return "LOAD_PREVIEW_VIDEO";
            case 5:
                return "VIDEO_THUMBNAIL";
            case 6:
                return "WAITING_ON_CALLBACK";
            case 7:
                return "IDLE";
            case 8:
                return "UPLOADING";
            default:
                return "null";
        }
    }

    private static void e(Spannable spannable, Object obj) {
        spannable.setSpan(obj, 0, spannable.length(), 33);
    }

    public static final void d(TextView textView, arab arabVar) {
        int a;
        if (textView == null) {
            return;
        }
        if (arabVar == null || (arabVar.b & 1) == 0 || (a = araa.a(arabVar.d)) == 0 || a != 3) {
            textView.setPadding(0, 0, 0, 0);
            textView.setBackground(null);
            textView.setText(textView.getText().toString());
            return;
        }
        apmy apmyVar = arabVar.c;
        if (apmyVar == null) {
            apmyVar = apmy.a;
        }
        SpannableString spannableString = new SpannableString(textView.getText().toString());
        e(spannableString, new StyleSpan(1));
        e(spannableString, new ForegroundColorSpan(apmyVar.d));
        textView.setText(spannableString);
        Drawable a2 = akf.a(textView.getContext(), R.drawable.badge_decorator_pill);
        a2.setColorFilter(apmyVar.c, PorterDuff.Mode.SRC_IN);
        textView.setBackground(a2);
    }
}
