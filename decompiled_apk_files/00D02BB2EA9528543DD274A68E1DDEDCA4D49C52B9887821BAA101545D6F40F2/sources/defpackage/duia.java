package defpackage;

import com.google.ar.core.ImageMetadata;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: duia  reason: default package */
/* loaded from: classes6.dex */
final class duia implements Callable<duir> {
    final /* synthetic */ duib a;

    public duia(duib duibVar) {
        this.a = duibVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ duir call() {
        duhy b;
        try {
            duib duibVar = this.a;
            synchronized (duibVar) {
            }
            duibVar.d();
            try {
                try {
                    OutputStream outputStream = duibVar.a.getOutputStream();
                    duibVar.a.connect();
                    loop0: while (true) {
                        int i = 0;
                        while (duibVar.c()) {
                            duibVar.d();
                            int i2 = 0;
                            while (i2 < 65536 && duibVar.c()) {
                                try {
                                    int a = duibVar.b.a(duibVar.c, i2, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE - i2);
                                    duibVar.d += a;
                                    i2 += a;
                                    try {
                                        outputStream.write(duibVar.c, i2 - a, a);
                                    } catch (IOException unused) {
                                    }
                                } catch (IOException e) {
                                    throw new duiq(duip.REQUEST_BODY_READ_ERROR, e);
                                }
                            }
                            i += i2;
                            if (i >= duibVar.f) {
                                synchronized (duibVar) {
                                    duis duisVar = duibVar.e;
                                    if (duisVar != null) {
                                        duisVar.a(duibVar);
                                    }
                                }
                            }
                        }
                        break loop0;
                    }
                    b = duibVar.b();
                } catch (IOException e2) {
                    try {
                        b = duibVar.b();
                    } catch (duiq unused2) {
                        throw new duiq(duip.CONNECTION_ERROR, e2);
                    }
                }
                synchronized (this.a) {
                }
                return new duir(b);
            } catch (FileNotFoundException e3) {
                throw new duiq(duip.BAD_URL, e3);
            }
        } catch (duiq e4) {
            synchronized (this.a) {
                return new duir(e4);
            }
        }
    }
}
