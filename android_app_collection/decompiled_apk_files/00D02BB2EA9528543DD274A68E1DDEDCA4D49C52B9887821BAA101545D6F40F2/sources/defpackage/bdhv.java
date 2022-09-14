package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* renamed from: bdhv  reason: default package */
/* loaded from: classes3.dex */
final class bdhv implements acb {
    @Override // defpackage.acb
    public final void a(acl aclVar) {
        View view = aclVar.a;
        if (!(view instanceof bcdd)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof WebImageView) {
                ((WebImageView) childAt).t();
                if (childAt.getTag() != null) {
                    childAt.setTag(null);
                }
            }
        }
    }
}
