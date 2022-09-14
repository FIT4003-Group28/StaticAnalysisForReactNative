package com.google.protobuf;

import java.io.IOException;
/* compiled from: InvalidProtocolBufferException.java */
/* loaded from: classes.dex */
public class u extends IOException {

    /* renamed from: a  reason: collision with root package name */
    private ac f4758a;

    public u(String str) {
        super(str);
        this.f4758a = null;
    }

    public u(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f4758a = null;
    }

    public u a(ac acVar) {
        this.f4758a = acVar;
        return this;
    }

    public ac a() {
        return this.f4758a;
    }

    public IOException b() {
        return getCause() instanceof IOException ? (IOException) getCause() : this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u c() {
        return new u("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u d() {
        return new u("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u e() {
        return new u("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u f() {
        return new u("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u g() {
        return new u("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a h() {
        return new a("Protocol message tag had invalid wire type.");
    }

    /* compiled from: InvalidProtocolBufferException.java */
    /* loaded from: classes.dex */
    public static class a extends u {
        public a(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u i() {
        return new u("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u j() {
        return new u("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u k() {
        return new u("Protocol message had invalid UTF-8.");
    }
}
