package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.AssetFileDescriptor;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dajn  reason: default package */
/* loaded from: classes5.dex */
public final class dajn implements daks {
    public final Context a;
    public final dajo b;
    private final daix c;
    private final Executor d;

    public dajn(Context context, Executor executor, dajo dajoVar, daix daixVar) {
        this.a = context;
        this.c = daixVar;
        this.b = dajoVar;
        this.d = executor;
    }

    @Override // defpackage.daks
    public final void a(List<Intent> list, dakq dakqVar) {
        if (!dajk.c()) {
            throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
        }
        this.d.execute(new dajm(this, list, dakqVar));
    }

    public final Integer b(List<Intent> list) {
        FileLock fileLock;
        dajo dajoVar;
        File c;
        Signature[] signatureArr;
        try {
            FileChannel channel = new RandomAccessFile(new File(this.c.e(), "lock.tmp"), "rw").getChannel();
            Integer num = null;
            ArrayList<X509Certificate> arrayList = null;
            try {
                fileLock = channel.tryLock();
            } catch (OverlappingFileLockException unused) {
                fileLock = null;
            }
            if (fileLock != null) {
                int i = 0;
                try {
                    for (Intent intent : list) {
                        String stringExtra = intent.getStringExtra("split_id");
                        AssetFileDescriptor openAssetFileDescriptor = this.a.getContentResolver().openAssetFileDescriptor(intent.getData(), "r");
                        File h = daix.h(this.c.c(), daix.j(stringExtra));
                        if ((!h.exists() || h.length() == openAssetFileDescriptor.getLength()) && h.exists()) {
                        }
                        if (!this.c.b(stringExtra).exists()) {
                            BufferedInputStream bufferedInputStream = new BufferedInputStream(openAssetFileDescriptor.createInputStream());
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(h);
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int read = bufferedInputStream.read(bArr);
                                    if (read <= 0) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, read);
                                }
                                fileOutputStream.close();
                                bufferedInputStream.close();
                            } finally {
                            }
                        } else {
                            continue;
                        }
                    }
                    try {
                        dajoVar = this.b;
                        c = dajoVar.a.c();
                        try {
                            signatureArr = dajoVar.b.getPackageManager().getPackageInfo(dajoVar.b.getPackageName(), 64).signatures;
                        } catch (PackageManager.NameNotFoundException unused2) {
                            signatureArr = null;
                        }
                        if (signatureArr != null) {
                            arrayList = new ArrayList();
                            for (Signature signature : signatureArr) {
                                X509Certificate a = dajo.a(signature);
                                if (a != null) {
                                    arrayList.add(a);
                                }
                            }
                        }
                    } catch (IOException | Exception unused3) {
                    }
                } catch (Exception unused4) {
                    i = -13;
                }
                if (arrayList != null && !arrayList.isEmpty()) {
                    File[] listFiles = c.listFiles();
                    Arrays.sort(listFiles);
                    loop3: for (int length = listFiles.length - 1; length >= 0; length--) {
                        File file = listFiles[length];
                        String absolutePath = file.getAbsolutePath();
                        try {
                            X509Certificate[][] a2 = bqy.a(absolutePath);
                            if (a2 != null && a2.length != 0 && a2[0].length != 0) {
                                if (!arrayList.isEmpty()) {
                                    for (X509Certificate x509Certificate : arrayList) {
                                        for (X509Certificate[] x509CertificateArr : a2) {
                                            if (!x509CertificateArr[0].equals(x509Certificate)) {
                                            }
                                        }
                                    }
                                    file.renameTo(daix.h(dajoVar.a.d(), file.getName()));
                                }
                            }
                            StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 32);
                            sb.append("Downloaded split ");
                            sb.append(absolutePath);
                            sb.append(" is not signed.");
                            sb.toString();
                        } catch (Exception unused5) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(absolutePath).length() + 32);
                            sb2.append("Downloaded split ");
                            sb2.append(absolutePath);
                            sb2.append(" is not signed.");
                            sb2.toString();
                        }
                    }
                    num = Integer.valueOf(i);
                    fileLock.release();
                }
                i = -11;
                num = Integer.valueOf(i);
                fileLock.release();
            }
            if (channel != null) {
                channel.close();
            }
            return num;
        } catch (Exception unused6) {
            return -13;
        }
    }
}
