package defpackage;

import android.net.ProxyInfo;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: badq  reason: default package */
/* loaded from: classes2.dex */
public final class badq {
    public static final badq a = new badq("", 0, "", new String[0]);
    public final String b;
    public final int c;
    public final String d;
    public final String[] e;

    public badq(String str, int i, String str2, String[] strArr) {
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = strArr;
    }

    public static badq a(ProxyInfo proxyInfo) {
        String str = null;
        if (proxyInfo == null) {
            return null;
        }
        Uri pacFileUrl = proxyInfo.getPacFileUrl();
        String host = proxyInfo.getHost();
        int port = proxyInfo.getPort();
        if (!Uri.EMPTY.equals(pacFileUrl)) {
            str = pacFileUrl.toString();
        }
        return new badq(host, port, str, proxyInfo.getExclusionList());
    }
}
