package defpackage;

import android.view.View;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* renamed from: jnt  reason: default package */
/* loaded from: classes.dex */
public final class jnt implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof iug) {
            iug iugVar = iug.ADDRESS_AUTOCOMPLETE_CONTROLLER;
            int ordinal = ((iug) cqkuVar).ordinal();
            if (ordinal == 108) {
                if (!(view instanceof WebImageView)) {
                    return false;
                }
                if (obj != null && !(obj instanceof jic)) {
                    return false;
                }
                ((WebImageView) view).o((jic) obj);
                return true;
            } else if (ordinal != 109 || !(view instanceof WebImageView)) {
                return false;
            } else {
                if (obj != null && !(obj instanceof jhp)) {
                    return false;
                }
                ((WebImageView) view).p((jhp) obj);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cqkv
    public final boolean b(cqku cqkuVar, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof iug) {
            iug iugVar = iug.ADDRESS_AUTOCOMPLETE_CONTROLLER;
            int ordinal = ((iug) cqkuVar).ordinal();
            if (ordinal == 108) {
                if (!(view instanceof WebImageView)) {
                    return false;
                }
                ((WebImageView) view).o(null);
                return true;
            } else if (ordinal != 109 || !(view instanceof WebImageView)) {
                return false;
            } else {
                ((WebImageView) view).p(null);
                return true;
            }
        }
        return false;
    }
}
