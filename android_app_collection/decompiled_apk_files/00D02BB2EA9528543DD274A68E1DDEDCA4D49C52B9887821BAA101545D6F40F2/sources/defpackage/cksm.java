package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: cksm  reason: default package */
/* loaded from: classes4.dex */
final class cksm implements Runnable {
    final /* synthetic */ cksn a;

    public cksm(cksn cksnVar) {
        this.a = cksnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cksn cksnVar = this.a;
        File[] listFiles = cksnVar.b.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isDirectory() && !file.equals(cksnVar.c)) {
                    File[] listFiles2 = file.listFiles();
                    if (listFiles2 != null) {
                        for (File file2 : listFiles2) {
                            file2.delete();
                        }
                    }
                    if (file.delete()) {
                        file.getAbsolutePath();
                    } else {
                        file.getAbsolutePath();
                    }
                }
            }
        }
    }
}
