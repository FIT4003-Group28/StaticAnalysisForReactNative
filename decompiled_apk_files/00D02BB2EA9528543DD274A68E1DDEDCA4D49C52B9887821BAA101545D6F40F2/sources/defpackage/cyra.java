package defpackage;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cyra  reason: default package */
/* loaded from: classes5.dex */
public final class cyra implements cyqx {
    public final File a;
    public final cyph b;
    private final dcdc<FileFilter> c;
    private final FilenameFilter d;
    private final cqat e;
    private final dehp f;

    public cyra(File file, dcdc<FileFilter> dcdcVar, FilenameFilter filenameFilter, cqat cqatVar, dehp dehpVar, cyph cyphVar) {
        this.a = file;
        this.c = dcdcVar;
        this.d = filenameFilter;
        this.e = cqatVar;
        this.f = dehpVar;
        this.b = cyphVar;
    }

    @Override // defpackage.cyqx
    public final void a(long j, TimeUnit timeUnit) {
        final long millis = timeUnit.toMillis(j);
        final long b = this.e.b();
        if (b <= 0) {
            this.b.c(60, cyor.a);
            return;
        }
        deha.q(this.f.a(new Runnable(this, b, millis) { // from class: cyqy
            private final cyra a;
            private final long b;
            private final long c;

            {
                this.a = this;
                this.b = b;
                this.c = millis;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cyra cyraVar = this.a;
                long j2 = this.b;
                long j3 = this.c;
                ArrayList arrayList = new ArrayList();
                cyraVar.b(arrayList, cyraVar.a, 0);
                for (File file : arrayList) {
                    if (file.lastModified() > 0 && j2 - file.lastModified() > j3) {
                        cyph cyphVar = cyraVar.b;
                        try {
                            file.delete();
                            cyphVar.c(58, cyor.a);
                        } catch (Exception unused) {
                            cypg.c(cyphVar, 25, 2, cyor.a);
                        }
                    }
                }
            }
        }), new cyqz(this, this.b.b()), this.f);
    }

    public final void b(List<File> list, File file, int i) {
        if (i < this.c.size()) {
            for (File file2 : file.listFiles(this.c.get(i))) {
                b(list, file2, i + 1);
            }
            return;
        }
        Collections.addAll(list, file.listFiles(this.d));
    }
}
