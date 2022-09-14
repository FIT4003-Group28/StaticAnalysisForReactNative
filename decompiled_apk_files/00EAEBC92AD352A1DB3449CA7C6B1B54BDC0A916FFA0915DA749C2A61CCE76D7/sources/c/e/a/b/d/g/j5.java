package c.e.a.b.d.g;

import java.io.IOException;
/* loaded from: classes.dex */
public class j5 extends IOException {
    public j5(String str) {
        super(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j5 a() {
        return new j5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j5 b() {
        return new j5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j5 c() {
        return new j5("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m5 d() {
        return new m5("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j5 e() {
        return new j5("Failed to parse the message.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j5 f() {
        return new j5("Protocol message had invalid UTF-8.");
    }
}
