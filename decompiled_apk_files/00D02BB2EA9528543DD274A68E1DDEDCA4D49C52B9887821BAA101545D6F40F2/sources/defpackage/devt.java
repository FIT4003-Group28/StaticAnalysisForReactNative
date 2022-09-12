package defpackage;

import java.nio.charset.Charset;
/* compiled from: PG */
/* renamed from: devt  reason: default package */
/* loaded from: classes6.dex */
final class devt extends ThreadLocal<Charset> {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Charset initialValue() {
        return Charset.forName("UTF-8");
    }
}
