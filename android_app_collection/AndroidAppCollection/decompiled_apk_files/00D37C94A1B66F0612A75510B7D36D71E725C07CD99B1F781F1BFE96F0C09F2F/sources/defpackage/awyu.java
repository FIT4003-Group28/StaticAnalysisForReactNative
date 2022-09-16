package defpackage;

import j$.util.Objects;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: awyu  reason: default package */
/* loaded from: classes2.dex */
public final class awyu {
    public final long a;
    public final MessageDigest b;
    private final long c = 0;
    private final boolean d = false;

    public awyu(awyt awytVar) {
        this.a = awytVar.a;
        this.b = awytVar.b;
    }

    public static awyt a() {
        return new awyt();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof awyu)) {
            return false;
        }
        awyu awyuVar = (awyu) obj;
        if (this.a == awyuVar.a) {
            long j = awyuVar.c;
            if (Objects.equals(this.b, awyuVar.b)) {
                boolean z = awyuVar.d;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), 0L, this.b, false});
    }

    public final String toString() {
        return String.format(Locale.US, "TransferOptions[idleTimeout %d sec, resumableTransferThreshold=%d, digest=%s, forceMultipart=%s]", Long.valueOf(this.a), 0L, this.b, false);
    }
}
