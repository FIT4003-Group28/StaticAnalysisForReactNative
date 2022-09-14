package defpackage;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: PG */
/* renamed from: dczm  reason: default package */
/* loaded from: classes5.dex */
final class dczm extends dcyp implements Serializable {
    private final MessageDigest a;
    private final int b;
    private final boolean c;
    private final String d;

    public dczm(String str, int i, String str2) {
        this.d = str2;
        MessageDigest h = h(str);
        this.a = h;
        int digestLength = h.getDigestLength();
        boolean z = false;
        if (i >= 4 && i <= digestLength) {
            z = true;
        }
        dbsk.h(z, "bytes (%s) must be >= 4 and < %s", i, digestLength);
        this.b = i;
        this.c = g(h);
    }

    private static boolean g(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    private static MessageDigest h(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.dcza
    public final dczb f() {
        if (this.c) {
            try {
                return new dczk((MessageDigest) this.a.clone(), this.b);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new dczk(h(this.a.getAlgorithm()), this.b);
    }

    public final String toString() {
        return this.d;
    }

    Object writeReplace() {
        return new dczl(this.a.getAlgorithm(), this.b, this.d);
    }

    public dczm(String str, String str2) {
        MessageDigest h = h(str);
        this.a = h;
        this.b = h.getDigestLength();
        this.d = str2;
        this.c = g(h);
    }
}
