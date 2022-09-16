package defpackage;

import android.util.Base64;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: aujp  reason: default package */
/* loaded from: classes.dex */
public final class aujp {
    private final long a;

    public aujp(long j) {
        this.a = j;
    }

    public final String a(akqi akqiVar) {
        return Base64.encodeToString(dczd.a.c(ByteBuffer.allocate(16).putLong(this.a).putLong(akqiVar.c).array()).b(), 2);
    }
}
