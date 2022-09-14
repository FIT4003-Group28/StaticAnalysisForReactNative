package defpackage;

import java.io.InputStream;
import java.util.zip.GZIPInputStream;
/* compiled from: PG */
/* renamed from: dyff  reason: default package */
/* loaded from: classes6.dex */
public final class dyff implements dyfh {
    @Override // defpackage.dyfi, defpackage.dyfs
    public final String a() {
        return "gzip";
    }

    @Override // defpackage.dyfs
    public final InputStream b(InputStream inputStream) {
        return new GZIPInputStream(inputStream);
    }
}
