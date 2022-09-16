package defpackage;

import android.view.View;
import com.google.android.libraries.social.sendkit.api.SendKitPickerResult;
/* compiled from: PG */
/* renamed from: ajyc  reason: default package */
/* loaded from: classes2.dex */
public final class ajyc implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof ajyb) {
            ajyb ajybVar = ajyb.ACCOUNT_NAME;
            switch (((ajyb) cqkuVar).ordinal()) {
                case 0:
                    if (!(view instanceof ajya)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof String)) {
                        return false;
                    }
                    ajya ajyaVar = (ajya) view;
                    String str = (String) obj;
                    if (str != null) {
                        ajyaVar.g = str;
                        ajyaVar.a();
                        ajyaVar.requestLayout();
                    }
                    return true;
                case 1:
                    if (!(view instanceof ajya)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof ajxw)) {
                        return false;
                    }
                    ajya ajyaVar2 = (ajya) view;
                    ajxw ajxwVar = (ajxw) obj;
                    if (ajxwVar != null) {
                        ajyaVar2.c = ajxwVar;
                        ajyaVar2.requestLayout();
                    }
                    return true;
                case 2:
                    if (!(view instanceof ajya)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof ajxz)) {
                        return false;
                    }
                    ajya ajyaVar3 = (ajya) view;
                    ajxz ajxzVar = (ajxz) obj;
                    if (ajxzVar != null) {
                        ajyaVar3.f = ajxzVar;
                        ajyaVar3.a();
                        ajyaVar3.requestLayout();
                    }
                    return true;
                case 3:
                    if (!(view instanceof ajya)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof dbsz)) {
                        return false;
                    }
                    ajya ajyaVar4 = (ajya) view;
                    dbsz<SendKitPickerResult> dbszVar = (dbsz) obj;
                    if (dbszVar != null) {
                        ajyaVar4.d = dbszVar;
                        ajyaVar4.requestLayout();
                    }
                    return true;
                case 4:
                    if (!(view instanceof ajya)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof ajxx)) {
                        return false;
                    }
                    ajya ajyaVar5 = (ajya) view;
                    ajxx ajxxVar = (ajxx) obj;
                    if (ajxxVar != null) {
                        ajyaVar5.i = ajxxVar;
                        ajyaVar5.a();
                        ajyaVar5.requestLayout();
                    }
                    return true;
                case 5:
                    if (!(view instanceof ajya)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof dbsl)) {
                        return false;
                    }
                    ajya ajyaVar6 = (ajya) view;
                    dbsl<String> dbslVar = (dbsl) obj;
                    if (dbslVar != null) {
                        ajyaVar6.h = dbslVar;
                        ajyaVar6.a();
                        ajyaVar6.requestLayout();
                    }
                    return true;
                case 6:
                    if (!(view instanceof ajya)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof dbsz)) {
                        return false;
                    }
                    ajya ajyaVar7 = (ajya) view;
                    dbsz<cxsx> dbszVar2 = (dbsz) obj;
                    if (dbszVar2 != null) {
                        ajyaVar7.e = dbszVar2;
                        ajyaVar7.a();
                        ajyaVar7.requestLayout();
                    }
                    return true;
                default:
                    return false;
            }
        }
        return false;
    }

    @Override // defpackage.cqkv
    public final boolean b(cqku cqkuVar, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        return false;
    }
}
