package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: vcp  reason: default package */
/* loaded from: classes4.dex */
public final class vcp {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;

    public vcp(Context context, vcq vcqVar) {
        String str;
        int i = 1;
        if (vcqVar.c) {
            String str2 = vcqVar.b;
            String packageName = context.getPackageName();
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(packageName).length());
            sb.append(str2);
            sb.append("#");
            sb.append(packageName);
            str = sb.toString();
        } else {
            str = vcqVar.b;
        }
        this.a = str;
        int o = ancv.o(vcqVar.d);
        this.e = o != 0 ? o : i;
        this.b = vcqVar.g;
        this.c = vcqVar.e;
        this.d = vcqVar.f;
    }
}
