package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* renamed from: bkkt  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bkkt implements cqjb {
    static final cqjb a = new bkkt();

    private bkkt() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        bklf bklfVar = (bklf) cqkpVar;
        StringBuilder sb = new StringBuilder();
        if (bklfVar.f().intValue() > 0) {
            sb.append(context.getResources().getQuantityString(R.plurals.MENU_ITEM_PHOTO_STATS, bklfVar.f().intValue(), bklfVar.f()));
        }
        if (bklfVar.g().intValue() > 0) {
            if (sb.length() > 0) {
                sb.append(" · ");
            }
            sb.append(context.getResources().getQuantityString(R.plurals.MENU_ITEM_REVIEW_STATS, bklfVar.g().intValue(), bklfVar.g()));
        }
        return sb;
    }
}
