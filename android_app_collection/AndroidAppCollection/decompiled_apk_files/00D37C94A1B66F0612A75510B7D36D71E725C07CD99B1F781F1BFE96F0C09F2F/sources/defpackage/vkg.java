package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: vkg  reason: default package */
/* loaded from: classes4.dex */
public final class vkg implements vja {
    private final /* synthetic */ int a;

    public vkg() {
    }

    public vkg(int i) {
        this.a = i;
    }

    public static vkg b() {
        return new vkg(5);
    }

    private static void c(vjb vjbVar, Uri uri, List list) {
        try {
            if (vjbVar.i(uri)) {
                for (Uri uri2 : vjbVar.b(uri)) {
                    c(vjbVar, uri2, list);
                }
                vjbVar.e(uri);
                return;
            }
            vjbVar.f(uri);
        } catch (IOException e) {
            list.add(e);
        }
    }

    @Override // defpackage.vja
    public final /* bridge */ /* synthetic */ Object a(viz vizVar) {
        int i = this.a;
        vix vixVar = null;
        if (i == 0) {
            OutputStream e = vizVar.b.e(vizVar.f);
            ArrayList arrayList = new ArrayList();
            arrayList.add(e);
            if (!vizVar.d.isEmpty()) {
                List<vkq> list = vizVar.d;
                Uri uri = vizVar.e;
                ArrayList arrayList2 = new ArrayList();
                for (vkq vkqVar : list) {
                    vkp a = vkqVar.a(uri);
                    if (a != null) {
                        arrayList2.add(a);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    vixVar = new vix(e, arrayList2);
                }
                if (vixVar != null) {
                    arrayList.add(vixVar);
                }
            }
            for (vkr vkrVar : vizVar.c) {
                OutputStream outputStream = (OutputStream) arey.s(arrayList);
                arrayList.add(vkrVar.d());
            }
            Collections.reverse(arrayList);
            return (OutputStream) arrayList.get(0);
        } else if (i == 1) {
            if (vizVar.a()) {
                String valueOf = String.valueOf(vizVar.e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
                sb.append("Transforms are not supported by this Opener: ");
                sb.append(valueOf);
                throw new vjw(sb.toString());
            }
            return new vkd(vizVar.a, vizVar.e);
        } else if (i == 2) {
            InputStream a2 = vkk.b().a(vizVar);
            try {
                if (!(a2 instanceof vjl)) {
                    String valueOf2 = String.valueOf(vizVar.e);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 48);
                    sb2.append("URI not convertible to FileChannel for mapping: ");
                    sb2.append(valueOf2);
                    throw new vjw(sb2.toString());
                }
                FileChannel a3 = ((vjl) a2).a();
                MappedByteBuffer map = a3.map(FileChannel.MapMode.READ_ONLY, 0L, a3.size());
                if (a2 != null) {
                    a2.close();
                }
                return map;
            } catch (Throwable th) {
                if (a2 != null) {
                    try {
                        a2.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        } else if (i == 3) {
            vkj b = vkj.b();
            b.d();
            File a4 = b.a(vizVar);
            anhe.f(a4);
            return new RandomAccessFile(a4, "rw");
        } else if (i == 4) {
            ArrayList<IOException> arrayList3 = new ArrayList();
            c(vizVar.a, vizVar.f, arrayList3);
            if (arrayList3.isEmpty()) {
                return null;
            }
            IOException iOException = new IOException("Failed to delete one or more files");
            for (IOException iOException2 : arrayList3) {
            }
            throw iOException;
        } else {
            ArrayDeque arrayDeque = new ArrayDeque();
            vjb vjbVar = vizVar.a;
            arey.u(arrayDeque, vjbVar.b(vizVar.e.buildUpon().fragment(null).build()));
            long j = 0;
            while (!arrayDeque.isEmpty()) {
                Uri uri2 = (Uri) arrayDeque.remove();
                if (vjbVar.i(uri2)) {
                    arey.u(arrayDeque, vjbVar.b(uri2));
                } else if (!vjbVar.h(uri2)) {
                    throw new FileNotFoundException(String.format("Child %s could not be opened", uri2));
                } else {
                    j += vjbVar.a(uri2);
                }
            }
            return Long.valueOf(j);
        }
    }
}
