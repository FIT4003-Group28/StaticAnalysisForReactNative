package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
/* compiled from: PG */
/* renamed from: dhgh  reason: default package */
/* loaded from: classes6.dex */
final class dhgh extends ThreadLocal<CharsetEncoder> {
    final /* synthetic */ dhgj a;

    public dhgh(dhgj dhgjVar) {
        this.a = dhgjVar;
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ CharsetEncoder initialValue() {
        return Charset.forName(this.a.a).newEncoder();
    }
}
