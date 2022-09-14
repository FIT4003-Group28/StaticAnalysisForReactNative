package defpackage;

import android.net.UrlQuerySanitizer;
/* compiled from: PG */
/* renamed from: afio  reason: default package */
/* loaded from: classes2.dex */
public final class afio extends cjxq {
    public afio() {
        registerParameters(new String[]{"q", "hq", "hnear", "saddr", "daddr", "myl", "ptp"}, UrlQuerySanitizer.getAllButNulAndAngleBracketsLegal());
        registerParameters(new String[]{"ll", "spn", "z", "layer", "t", "sll", "sspn", "gmmview", "dirflg", "geocode", "nav", "cid", "ftid", "cbll", "panoid", "cbp", "entry", "gmm", "notts"}, UrlQuerySanitizer.getAllIllegal());
    }
}
