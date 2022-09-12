package defpackage;

import java.security.SecureRandom;
/* compiled from: PG */
/* renamed from: dbsv  reason: default package */
/* loaded from: classes5.dex */
final class dbsv extends ThreadLocal<SecureRandom> {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ SecureRandom initialValue() {
        return dbsy.a();
    }
}
