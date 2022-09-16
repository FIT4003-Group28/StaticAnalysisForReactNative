package defpackage;

import java.util.Arrays;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: dasj  reason: default package */
/* loaded from: classes5.dex */
public abstract class dasj {
    static final Logger a = Logger.getLogger(dasj.class.getName());
    private static final String[] b;

    static {
        String[] strArr = {"DELETE", "GET", "POST", "PUT"};
        b = strArr;
        Arrays.sort(strArr);
    }

    public final dasd a(dase daseVar) {
        return new dasd(this, daseVar);
    }

    public boolean b(String str) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract dasl c(String str, String str2);
}
