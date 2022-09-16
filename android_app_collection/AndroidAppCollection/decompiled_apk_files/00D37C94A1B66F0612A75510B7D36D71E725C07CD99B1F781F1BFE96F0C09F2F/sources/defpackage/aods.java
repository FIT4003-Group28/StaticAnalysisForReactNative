package defpackage;

import java.nio.charset.Charset;
/* compiled from: PG */
/* renamed from: aods  reason: default package */
/* loaded from: classes.dex */
final class aods extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return Charset.forName("UTF-8");
    }
}
