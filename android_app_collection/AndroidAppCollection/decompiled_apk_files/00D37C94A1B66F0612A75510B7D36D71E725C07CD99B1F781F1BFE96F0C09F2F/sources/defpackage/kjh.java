package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: kjh  reason: default package */
/* loaded from: classes3.dex */
final class kjh implements ynl {
    final /* synthetic */ kjk a;

    public kjh(kjk kjkVar) {
        this.a = kjkVar;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                feq feqVar = (feq) obj;
                kjf kjfVar = this.a.d;
                if (kjfVar == null || !TextUtils.equals(kjfVar.a, feqVar.a())) {
                    return null;
                }
                this.a.a.X();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{feq.class};
    }
}
