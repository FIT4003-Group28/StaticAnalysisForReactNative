package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cxlc  reason: default package */
/* loaded from: classes5.dex */
public final class cxlc {
    public final String a;
    public final boolean b;
    public final int c;

    public cxlc(Context context, cxle cxleVar) {
        String str;
        int i = 1;
        if (cxleVar.b) {
            String str2 = cxleVar.a;
            String packageName = context.getPackageName();
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(packageName).length());
            sb.append(str2);
            sb.append("#");
            sb.append(packageName);
            str = sb.toString();
        } else {
            str = cxleVar.a;
        }
        this.a = str;
        int a = dekq.a(cxleVar.c);
        this.c = a != 0 ? a : i;
        this.b = cxleVar.d;
    }
}
