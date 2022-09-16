package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: bzz  reason: default package */
/* loaded from: classes.dex */
final class bzz implements bzy<InputStream> {
    @Override // defpackage.bzy
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // defpackage.bzy
    public final /* bridge */ /* synthetic */ void b(InputStream inputStream) {
        inputStream.close();
    }

    @Override // defpackage.bzy
    public final /* bridge */ /* synthetic */ InputStream c(File file) {
        return new FileInputStream(file);
    }
}
