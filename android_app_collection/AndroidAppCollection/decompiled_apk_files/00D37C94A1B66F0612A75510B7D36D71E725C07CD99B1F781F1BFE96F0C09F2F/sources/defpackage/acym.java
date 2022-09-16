package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
/* compiled from: PG */
/* renamed from: acym  reason: default package */
/* loaded from: classes.dex */
final class acym extends acyk {
    private final acyc c;

    public acym(acyc acycVar) {
        this.c = acycVar;
    }

    @Override // defpackage.acyk, defpackage.adwb
    public final void i(yrb yrbVar) {
        super.i(yrbVar);
        yqz yqzVar = yrbVar.d;
        if (yqzVar == null) {
            zep.c(acyo.a, "Hanging get's response body is null");
            return;
        }
        try {
            InputStream b = yqzVar.b();
            byte[] bArr = new byte[2048];
            while (true) {
                try {
                    int read = b.read(bArr);
                    if (read > 0) {
                        try {
                            this.c.b(new String(bArr, 0, read, "UTF-8").toCharArray());
                        } catch (UnsupportedEncodingException unused) {
                            throw new IllegalStateException("This application needs UTF-8 support in order to run");
                        }
                    } else {
                        String str = acyo.a;
                        return;
                    }
                } catch (IOException e) {
                    this.b = e;
                    return;
                }
            }
        } catch (IOException e2) {
            this.b = e2;
        }
    }
}
