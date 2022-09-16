package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: dsrm  reason: default package */
/* loaded from: classes.dex */
public class dsrm extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;

    public dsrm(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dsrm a() {
        return new dsrm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dsrm b() {
        return new dsrm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dsrm c() {
        return new dsrm("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dsrm d() {
        return new dsrm("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dsrm e() {
        return new dsrm("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dsrl f() {
        return new dsrl("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dsrm g() {
        return new dsrm("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dsrm h() {
        return new dsrm("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dsrm i() {
        return new dsrm("Failed to parse the message.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dsrm j() {
        return new dsrm("Protocol message had invalid UTF-8.");
    }

    public dsrm(String str) {
        super(str);
    }
}
