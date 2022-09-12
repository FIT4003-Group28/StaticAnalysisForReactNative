package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cukc  reason: default package */
/* loaded from: classes5.dex */
public final class cukc {
    public final cswe b;
    public final String c;
    public final dehp a = cstu.b().a;
    public final duiw d = duiw.a(new duic(300000, 300000)).a();

    public cukc(Context context, String str) {
        this.b = cswe.a(context);
        this.c = str;
    }

    public static final dyjd a(String str, String str2, dyjb dyjbVar) {
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 29 + String.valueOf(str).length());
        sb.append("Got Scotty Error: ");
        sb.append(str2);
        sb.append(" requestId=");
        sb.append(str);
        sb.toString();
        cstl.a("ScottyStub");
        return new dyjd(dyjbVar.f(new cujx(str2)));
    }

    public static final dyjd b(String str, String str2, dyjb dyjbVar, Throwable th) {
        StringBuilder sb = new StringBuilder(str2.length() + 29 + String.valueOf(str).length());
        sb.append("Got Scotty Error: ");
        sb.append(str2);
        sb.append(" requestId=");
        sb.append(str);
        sb.toString();
        cstl.a("ScottyStub");
        return new dyjd(dyjbVar.f(new cujx(str2, th)));
    }
}
