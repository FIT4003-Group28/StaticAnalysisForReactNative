package defpackage;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: bzq  reason: default package */
/* loaded from: classes.dex */
final class bzq<Data> implements buj<Data> {
    private final String a;
    private Data b;

    public bzq(String str) {
        this.a = str;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.ByteArrayInputStream, Data, java.lang.Object] */
    @Override // defpackage.buj
    public final void a(bro broVar, bui<? super Data> buiVar) {
        try {
            String str = this.a;
            if (str.startsWith("data:image")) {
                int indexOf = str.indexOf(44);
                if (indexOf != -1) {
                    if (!str.substring(0, indexOf).endsWith(";base64")) {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                    ?? r0 = (Data) new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    this.b = r0;
                    buiVar.f(r0);
                    return;
                }
                throw new IllegalArgumentException("Missing comma in data URL.");
            }
            throw new IllegalArgumentException("Not a valid image data URL.");
        } catch (IllegalArgumentException e) {
            buiVar.g(e);
        }
    }

    @Override // defpackage.buj
    public final void b() {
        try {
            ((InputStream) this.b).close();
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.buj
    public final void c() {
    }

    @Override // defpackage.buj
    public final Class<Data> d() {
        return InputStream.class;
    }

    @Override // defpackage.buj
    public final int e() {
        return 1;
    }
}
