package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
/* compiled from: PG */
/* renamed from: acpi  reason: default package */
/* loaded from: classes.dex */
public final class acpi implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof acpg) {
            acpg acpgVar = acpg.IMAGE_URL;
            int ordinal = ((acpg) cqkuVar).ordinal();
            if (ordinal == 0) {
                boolean z = view instanceof acpl;
                if (!z || (obj != null && !(obj instanceof String))) {
                    if (!z || !(obj instanceof String)) {
                        return false;
                    }
                    ((acpl) view).setImageUrl((String) obj);
                    return true;
                }
                acph.d((String) obj, (acpl) view);
                return true;
            } else if (ordinal == 1) {
                if (!(view instanceof acpl) || !(obj instanceof acpj)) {
                    return false;
                }
                ((acpl) view).setImageUrlFormatter((acpj) obj);
                return true;
            } else if (ordinal == 2) {
                if (!(view instanceof acpl) || !(obj instanceof Boolean)) {
                    return false;
                }
                ((acpl) view).setLoadImage(((Boolean) obj).booleanValue());
                return true;
            } else if (ordinal != 3) {
                return false;
            } else {
                boolean z2 = view instanceof acpl;
                if (z2) {
                    if (!(obj instanceof cqtd)) {
                        if (obj == null || (obj instanceof Drawable)) {
                            ((acpl) view).setPlaceholder((Drawable) obj);
                            return true;
                        }
                    } else {
                        acpl acplVar = (acpl) view;
                        acplVar.setPlaceholder(cqlg.a.c(acplVar, (cqtd) obj));
                        return true;
                    }
                }
                if (!z2 || !(obj instanceof Integer)) {
                    return false;
                }
                ((acpl) view).setPlaceholder(((Integer) obj).intValue());
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cqkv
    public final boolean b(cqku cqkuVar, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof acpg) {
            acpg acpgVar = acpg.IMAGE_URL;
            if (((acpg) cqkuVar).ordinal() != 0 || !(view instanceof acpl)) {
                return false;
            }
            acph.d(null, (acpl) view);
            return true;
        }
        return false;
    }
}
