package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.maps.R;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: cuwg  reason: default package */
/* loaded from: classes5.dex */
public final class cuwg {
    public static int a(Context context, float f) {
        return (int) (f * context.getResources().getDisplayMetrics().density);
    }

    public static String b(Context context, cufp cufpVar, List<cufj> list) {
        if (!cufpVar.b().a() || TextUtils.isEmpty(cufpVar.b().b())) {
            if (cufpVar.a().c() == ConversationId.IdType.GROUP) {
                return context.getString(R.string.default_group_conversation_title);
            }
            if (cufpVar.a().c() == ConversationId.IdType.ONE_TO_ONE) {
                ContactId e = cufpVar.a().e();
                Iterator<cufj> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    cufj next = it.next();
                    if (next.a().equals(e)) {
                        if (next.b().a()) {
                            return next.b().b();
                        }
                    }
                }
            }
            return "";
        }
        return cufpVar.b().b();
    }

    public static void c(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static int d(int i) {
        return (i & 16777215) | 1073741824;
    }
}
