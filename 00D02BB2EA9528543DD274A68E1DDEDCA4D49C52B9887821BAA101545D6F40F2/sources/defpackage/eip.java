package defpackage;

import android.content.res.Resources;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
/* compiled from: PG */
/* renamed from: eip  reason: default package */
/* loaded from: classes6.dex */
public final class eip implements eik {
    private final String a;
    private final amfi c;
    private boolean d = false;
    private volatile String e = "";
    private final String b = "";

    public eip(String str, amfi amfiVar) {
        this.a = str;
        this.c = amfiVar;
    }

    private final String f() {
        return (!iva.a().booleanValue() || dbsj.d(this.b)) ? this.a : this.b;
    }

    @Override // defpackage.eik
    public final void a(final Runnable runnable, Resources resources) {
        bvrj.UI_THREAD.c();
        final String f = f();
        amfu a = this.c.a(f, getClass().getName(), new amfq(this, f, runnable) { // from class: eio
            private final eip a;
            private final String b;
            private final Runnable c;

            {
                this.a = this;
                this.b = f;
                this.c = runnable;
            }

            @Override // defpackage.amfq
            public final void a(amfu amfuVar) {
                this.a.e(amfuVar, this.c);
            }
        });
        if (a.a()) {
            e(a, runnable);
        }
    }

    @Override // defpackage.eik
    public final String b() {
        return this.e;
    }

    @Override // defpackage.eik
    public final boolean c() {
        return this.d;
    }

    @Override // defpackage.eik
    public final String d() {
        return f();
    }

    public final synchronized void e(amfu amfuVar, Runnable runnable) {
        if (this.e.isEmpty()) {
            byte[] bArr = amfuVar.d;
            if (amfuVar.b() == 4 && bArr != null) {
                try {
                    ZipInputStream zipInputStream = new ZipInputStream(new ByteArrayInputStream(bArr));
                    while (true) {
                        ZipEntry nextEntry = zipInputStream.getNextEntry();
                        if (nextEntry == null) {
                            zipInputStream = null;
                            break;
                        } else if (!nextEntry.isDirectory() && nextEntry.getName().toLowerCase(Locale.US).endsWith(".json")) {
                            break;
                        }
                    }
                    if (zipInputStream != null) {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(zipInputStream, "UTF-8"));
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb.append(readLine);
                        }
                        this.e = sb.toString();
                        this.d = true;
                        zipInputStream.close();
                    }
                } catch (IOException unused) {
                    runnable.run();
                }
            }
            runnable.run();
            return;
        }
        runnable.run();
    }
}
