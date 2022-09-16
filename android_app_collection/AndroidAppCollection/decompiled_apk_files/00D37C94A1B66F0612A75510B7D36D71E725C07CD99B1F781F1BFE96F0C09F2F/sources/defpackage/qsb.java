package defpackage;

import java.security.MessageDigest;
/* compiled from: PG */
/* renamed from: qsb  reason: default package */
/* loaded from: classes4.dex */
public final class qsb {
    public static final qsb a = new qsb(true);
    public final boolean b;

    public qsb() {
        this(false);
    }

    public qsb(boolean z) {
        this.b = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str, qxn qxnVar, boolean z, boolean z2) {
        String str2 = true != z2 ? "not allowed" : "debug cert rejected";
        MessageDigest a2 = qyg.a("SHA-1");
        qnm.b(a2);
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", str2, str, qyi.a(a2.digest(((qrx) qxnVar).a)), Boolean.valueOf(z), "213380000.false");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static qsb b() {
        return new qsb(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static qsb c() {
        return new qsb(false);
    }
}
