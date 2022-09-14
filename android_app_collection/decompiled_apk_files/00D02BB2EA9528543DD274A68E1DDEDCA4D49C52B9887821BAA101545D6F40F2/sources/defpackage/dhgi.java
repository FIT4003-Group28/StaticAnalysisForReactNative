package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
/* compiled from: PG */
/* renamed from: dhgi  reason: default package */
/* loaded from: classes6.dex */
final class dhgi extends ThreadLocal<CharsetDecoder> {
    final /* synthetic */ dhgj a;

    public dhgi(dhgj dhgjVar) {
        this.a = dhgjVar;
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ CharsetDecoder initialValue() {
        return Charset.forName(this.a.a).newDecoder();
    }
}
