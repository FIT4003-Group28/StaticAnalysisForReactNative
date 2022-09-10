package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: dark  reason: default package */
/* loaded from: classes5.dex */
public class dark {
    private static final Logger f = Logger.getLogger(dark.class.getName());
    public final dasd a;
    public final String b;
    public final String c;
    public final String d;
    public final dauu e;

    /* JADX INFO: Access modifiers changed from: protected */
    public dark(darj darjVar) {
        this.b = b(darjVar.d);
        this.c = c(darjVar.e);
        if (dbsj.d(darjVar.f)) {
            f.logp(Level.WARNING, "com.google.api.client.googleapis.services.AbstractGoogleClient", "<init>", "Application name is not set. Call Builder#setApplicationName.");
        }
        this.d = darjVar.f;
        this.a = darjVar.a.a(darjVar.b);
        this.e = darjVar.c;
    }

    public static String b(String str) {
        dbsk.t(str, "root URL cannot be null.");
        return !str.endsWith("/") ? String.valueOf(str).concat("/") : str;
    }

    public static String c(String str) {
        dbsk.t(str, "service path cannot be null");
        if (str.length() == 1) {
            dbsk.b("/".equals(str), "service path must equal \"/\" if it is of length 1.");
            return "";
        } else if (str.length() <= 0) {
            return str;
        } else {
            if (!str.endsWith("/")) {
                str = String.valueOf(str).concat("/");
            }
            return str.startsWith("/") ? str.substring(1) : str;
        }
    }

    public dauu a() {
        throw null;
    }
}
