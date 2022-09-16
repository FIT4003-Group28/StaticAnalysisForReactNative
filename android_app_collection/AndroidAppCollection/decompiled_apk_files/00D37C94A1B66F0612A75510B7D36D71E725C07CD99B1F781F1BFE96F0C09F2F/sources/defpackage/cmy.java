package defpackage;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: cmy  reason: default package */
/* loaded from: classes2.dex */
final class cmy implements cil {
    private final String a;
    private Object b;

    public cmy(String str) {
        this.a = str;
    }

    @Override // defpackage.cil
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.cil
    public final void b() {
    }

    @Override // defpackage.cil
    public final void c() {
        try {
            ((InputStream) this.b).close();
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.cil
    public final void d(cfv cfvVar, cik cikVar) {
        try {
            String str = this.a;
            if (!str.startsWith("data:image")) {
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
            int indexOf = str.indexOf(44);
            if (indexOf == -1) {
                throw new IllegalArgumentException("Missing comma in data URL.");
            }
            if (!str.substring(0, indexOf).endsWith(";base64")) {
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
            this.b = byteArrayInputStream;
            cikVar.f(byteArrayInputStream);
        } catch (IllegalArgumentException e) {
            cikVar.g(e);
        }
    }

    @Override // defpackage.cil
    public final int e() {
        return 1;
    }
}
