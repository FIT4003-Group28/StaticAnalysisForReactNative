package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: PG */
/* renamed from: cmlu  reason: default package */
/* loaded from: classes5.dex */
public final class cmlu {
    public cmkj a;
    public long b;
    public OutputStream c;
    public long d;
    public long e;
    private final cmls f;
    private File g;
    private cmnm h;

    public cmlu(cmls cmlsVar) {
        cmmn.d(true, "fragmentSize must be positive or C.LENGTH_UNSET.");
        cmmn.f(cmlsVar);
        this.f = cmlsVar;
    }

    public final void a() {
        if (this.a == null) {
            return;
        }
        try {
            c();
        } catch (IOException e) {
            throw new cmlt(e);
        }
    }

    public final void b(cmkj cmkjVar) {
        long j = cmkjVar.g;
        long j2 = -1;
        if (j != -1) {
            j2 = Math.min(j - this.e, this.b);
        }
        cmls cmlsVar = this.f;
        String str = cmkjVar.h;
        int i = cmny.a;
        this.g = cmlsVar.b(str, cmkjVar.f + this.e, j2);
        FileOutputStream fileOutputStream = new FileOutputStream(this.g);
        cmnm cmnmVar = this.h;
        if (cmnmVar == null) {
            this.h = new cmnm(fileOutputStream, null);
        } else {
            cmnmVar.a(fileOutputStream);
        }
        this.c = this.h;
        this.d = 0L;
    }

    public final void c() {
        OutputStream outputStream = this.c;
        if (outputStream != null) {
            try {
                outputStream.flush();
                cmny.m(this.c);
                this.c = null;
                File file = this.g;
                this.g = null;
                this.f.c(file, this.d);
            } catch (Throwable th) {
                cmny.m(this.c);
                this.c = null;
                File file2 = this.g;
                this.g = null;
                file2.delete();
                throw th;
            }
        }
    }
}
