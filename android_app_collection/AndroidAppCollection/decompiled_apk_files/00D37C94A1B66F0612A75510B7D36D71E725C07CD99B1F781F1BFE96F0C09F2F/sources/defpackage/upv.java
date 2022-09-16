package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: upv  reason: default package */
/* loaded from: classes4.dex */
final class upv {
    public final upq a;
    public final toq b;

    public upv(upq upqVar, toq toqVar) {
        this.a = upqVar;
        this.b = toqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(upq upqVar, View view) {
        if (view instanceof upw) {
            ((upw) view).a(upqVar);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                a(upqVar, viewGroup.getChildAt(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(upq upqVar, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                b(upqVar, viewGroup.getChildAt(i));
            }
        }
        if (view instanceof upw) {
            ((upw) view).b(upqVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final upj c(View view) {
        return (upj) view.getTag(R.id.view_bound_account_tag);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void d(View view, upj upjVar) {
        view.setTag(R.id.view_bound_account_tag, upjVar);
    }
}
