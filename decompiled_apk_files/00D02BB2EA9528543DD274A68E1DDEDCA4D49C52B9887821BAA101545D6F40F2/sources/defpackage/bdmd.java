package defpackage;

import java.text.SimpleDateFormat;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bdmd  reason: default package */
/* loaded from: classes3.dex */
final class bdmd extends ThreadLocal<SimpleDateFormat> {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ SimpleDateFormat initialValue() {
        return new SimpleDateFormat("yyyyMMdd_HHmmssSSS", Locale.ROOT);
    }
}
