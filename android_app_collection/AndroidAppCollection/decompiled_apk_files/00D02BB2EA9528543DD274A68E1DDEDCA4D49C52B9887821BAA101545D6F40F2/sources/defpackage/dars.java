package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: PG */
/* renamed from: dars  reason: default package */
/* loaded from: classes5.dex */
public abstract class dars implements darx {
    public final String b = "image/*";

    public abstract InputStream c();

    @Override // defpackage.darx
    public final String d() {
        return this.b;
    }

    @Override // defpackage.dauw
    public final void e(OutputStream outputStream) {
        daum.b(c(), outputStream);
        outputStream.flush();
    }
}
