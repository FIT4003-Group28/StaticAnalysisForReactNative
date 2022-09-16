package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: aopx  reason: default package */
/* loaded from: classes.dex */
public class aopx extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    public boolean a;

    public aopx(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public static aopw a() {
        return new aopw("Protocol message tag had invalid wire type.");
    }

    public static aopx b() {
        return new aopx("Protocol message end-group tag did not match expected tag.");
    }

    public static aopx c() {
        return new aopx("Protocol message contained an invalid tag (zero).");
    }

    public static aopx d() {
        return new aopx("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aopx e() {
        return new aopx("CodedInputStream encountered a malformed varint.");
    }

    public static aopx f() {
        return new aopx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static aopx g() {
        return new aopx("Failed to parse the message.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aopx h() {
        return new aopx("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aopx i() {
        return new aopx("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static aopx j() {
        return new aopx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k() {
        this.a = true;
    }

    public aopx(String str) {
        super(str);
    }

    public aopx(String str, IOException iOException) {
        super(str, iOException);
    }
}
