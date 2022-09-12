package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: bzj  reason: default package */
/* loaded from: classes4.dex */
final class bzj implements bzh<InputStream> {
    @Override // defpackage.bzh
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // defpackage.bzh
    public final /* bridge */ /* synthetic */ InputStream b(byte[] bArr) {
        return new ByteArrayInputStream(bArr);
    }
}
