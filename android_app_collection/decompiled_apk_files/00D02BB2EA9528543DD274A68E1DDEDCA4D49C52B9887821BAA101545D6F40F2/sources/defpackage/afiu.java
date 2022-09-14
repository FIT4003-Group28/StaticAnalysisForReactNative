package defpackage;

import android.net.UrlQuerySanitizer;
/* compiled from: PG */
/* renamed from: afiu  reason: default package */
/* loaded from: classes2.dex */
public final class afiu extends cjxq {
    public afiu() {
        registerParameters(new String[]{"title"}, UrlQuerySanitizer.getAllButNulAndAngleBracketsLegal());
        registerParameters(new String[]{"cbll", "panoid", "cbp"}, UrlQuerySanitizer.getAllIllegal());
    }
}
