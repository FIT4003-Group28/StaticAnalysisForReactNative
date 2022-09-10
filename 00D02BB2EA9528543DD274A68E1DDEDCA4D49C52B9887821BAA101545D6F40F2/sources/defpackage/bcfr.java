package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bcfr  reason: default package */
/* loaded from: classes3.dex */
final class bcfr implements acb {
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
                if (childAt.getTag(R.id.photo_gallery_photo_tag) != null) {
                    childAt.setTag(R.id.photo_gallery_photo_tag, null);
                }
            }
        }
    }
}
