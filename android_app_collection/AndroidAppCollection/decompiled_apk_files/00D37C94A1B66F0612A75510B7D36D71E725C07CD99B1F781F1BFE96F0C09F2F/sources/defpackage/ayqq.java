package defpackage;

import com.google.android.apps.youtube.app.common.playerviewmodemonitor.DefaultPlayerViewModeMonitor;
/* compiled from: PG */
/* renamed from: ayqq  reason: default package */
/* loaded from: classes2.dex */
public final class ayqq implements ayqe {
    @Override // defpackage.ayqe
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Object[] objArr = (Object[]) obj;
        int length = objArr.length;
        if (length != 6) {
            StringBuilder sb = new StringBuilder(44);
            sb.append("Array of size 6 expected but got ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        Object obj2 = objArr[0];
        Object obj3 = objArr[1];
        Object obj4 = objArr[2];
        Object obj5 = objArr[3];
        Object obj6 = objArr[4];
        Object obj7 = objArr[5];
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        int intValue = ((Integer) obj3).intValue();
        boolean booleanValue2 = ((Boolean) obj4).booleanValue();
        boolean booleanValue3 = ((Boolean) obj5).booleanValue();
        fdq fdqVar = (fdq) obj6;
        int intValue2 = ((Integer) obj7).intValue();
        if (booleanValue3) {
            return ezx.VIRTUAL_REALITY_FULLSCREEN;
        }
        if (booleanValue) {
            return ezx.WATCH_WHILE_PICTURE_IN_PICTURE;
        }
        if (intValue == 0) {
            if (!booleanValue2 || fdqVar != fdq.WATCH_WHILE) {
                return ezx.NONE;
            }
            return ezx.INLINE_MINIMAL;
        } else if (intValue == 1) {
            return DefaultPlayerViewModeMonitor.l(intValue2, ezx.WATCH_WHILE_MAXIMIZED);
        } else {
            if (intValue == 2) {
                return DefaultPlayerViewModeMonitor.l(intValue2, ezx.WATCH_WHILE_MINIMIZED);
            }
            if (intValue == 3) {
                return DefaultPlayerViewModeMonitor.l(intValue2, ezx.WATCH_WHILE_FULLSCREEN);
            }
            if (intValue == 4) {
                return ezx.HIDDEN;
            }
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("No view mode available for layout state: ");
            sb2.append(intValue);
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
