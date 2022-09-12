package defpackage;

import android.net.UrlQuerySanitizer;
/* compiled from: PG */
/* renamed from: afiv  reason: default package */
/* loaded from: classes2.dex */
public final class afiv extends cjxq {
    public afiv() {
        registerParameters(new String[]{"act", "entry", "notts"}, UrlQuerySanitizer.getAllIllegal());
        for (afif afifVar : afif.values()) {
            registerParameter(afifVar.f, UrlQuerySanitizer.getAllIllegal());
        }
    }
}
