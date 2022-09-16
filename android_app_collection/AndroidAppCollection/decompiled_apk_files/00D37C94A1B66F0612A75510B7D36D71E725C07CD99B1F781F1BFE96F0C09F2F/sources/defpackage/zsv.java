package defpackage;

import android.os.AsyncTask;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: zsv  reason: default package */
/* loaded from: classes4.dex */
final class zsv extends AsyncTask {
    final /* synthetic */ byte[] a;
    final /* synthetic */ zsw b;

    public zsv(zsw zswVar, byte[] bArr) {
        this.b = zswVar;
        this.a = bArr;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        synchronized (this.b.c.d) {
            zsw zswVar = this.b;
            final zsy zsyVar = zswVar.c;
            final String str = zswVar.a;
            final String str2 = zswVar.b;
            byte[] bArr = this.a;
            ylr.b();
            zsyVar.g();
            if (zsyVar.g) {
                zte zteVar = zsyVar.h;
                if (zteVar != null) {
                    zteVar.a(zsy.c(str2), bArr, new ztd() { // from class: zst
                        @Override // defpackage.ztd
                        public final void a(boolean z) {
                            zsy zsyVar2 = zsy.this;
                            String str3 = str;
                            String str4 = str2;
                            if (!z) {
                                zep.b("Error writing data to disk cache.");
                                return;
                            }
                            synchronized (zsyVar2.d) {
                                if (!zsyVar2.e.contains(str3)) {
                                    zsyVar2.h(str4, str3);
                                }
                            }
                        }
                    });
                } else {
                    zep.b("Error save downloaded asserts, cache wrapper is null.");
                }
            } else {
                try {
                    File file = new File(zsyVar.a, str);
                    if (file.exists()) {
                        file.delete();
                    }
                    file.createNewFile();
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    fileOutputStream.write(bArr);
                    fileOutputStream.close();
                    zsyVar.h(str2, str);
                    String valueOf = String.valueOf(str);
                    if (valueOf.length() != 0) {
                        "Asset saved to file: ".concat(valueOf);
                    }
                } catch (IOException | SecurityException e) {
                    String valueOf2 = String.valueOf(str);
                    zep.d(valueOf2.length() != 0 ? "Error writing asset to file: ".concat(valueOf2) : new String("Error writing asset to file: "), e);
                }
            }
        }
        return null;
    }
}
