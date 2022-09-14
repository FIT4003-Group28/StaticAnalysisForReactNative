package defpackage;

import android.net.UrlQuerySanitizer;
/* compiled from: PG */
/* renamed from: afim  reason: default package */
/* loaded from: classes2.dex */
public final class afim extends cjxq {
    public afim() {
        registerParameters(new String[]{"q"}, new cjxp());
        registerParameters(new String[]{"z", "c"}, UrlQuerySanitizer.getAllIllegal());
    }
}
