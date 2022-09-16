package defpackage;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: aguh  reason: default package */
/* loaded from: classes.dex */
public final class aguh implements afyf {
    private final zie a;
    private final zib b;

    public aguh(zie zieVar) {
        zieVar.getClass();
        this.a = zieVar;
        this.b = aiwv.e();
    }

    private static void b(InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.afyf
    public final /* bridge */ /* synthetic */ void a(Object obj, yiw yiwVar) {
        BufferedInputStream bufferedInputStream;
        Exception e;
        aiwi aiwiVar = (aiwi) obj;
        ylr.b();
        aiwiVar.getClass();
        String e2 = aiwiVar.a.e();
        e2.getClass();
        File file = new File(e2);
        if (file.exists()) {
            BufferedInputStream bufferedInputStream2 = null;
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 4096);
                try {
                    try {
                        yiwVar.b(aiwiVar, (aixy) ((afwf) this.a.b(bufferedInputStream, this.b)).a());
                        b(bufferedInputStream);
                    } catch (Exception e3) {
                        e = e3;
                        yiwVar.a(aiwiVar, e);
                        b(bufferedInputStream);
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream2 = bufferedInputStream;
                    b(bufferedInputStream2);
                    throw th;
                }
            } catch (Exception e4) {
                bufferedInputStream = null;
                e = e4;
            } catch (Throwable th2) {
                th = th2;
                b(bufferedInputStream2);
                throw th;
            }
        } else {
            yiwVar.a(aiwiVar, new IOException());
        }
    }
}
