package defpackage;

import com.google.android.apps.youtube.app.offline.OfflineModeChangedMealbarController;
/* compiled from: PG */
/* renamed from: jah  reason: default package */
/* loaded from: classes3.dex */
public final class jah implements ynl {
    final /* synthetic */ OfflineModeChangedMealbarController a;

    public jah(OfflineModeChangedMealbarController offlineModeChangedMealbarController) {
        this.a = offlineModeChangedMealbarController;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                if (((ahgk) obj).a()) {
                    return null;
                }
                this.a.g = false;
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahgk.class};
    }
}
