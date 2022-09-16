package defpackage;

import android.os.ConditionVariable;
import android.util.Log;
import android.util.SparseArray;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pdw  reason: default package */
/* loaded from: classes4.dex */
public final class pdw extends Thread {
    final /* synthetic */ ConditionVariable a;
    final /* synthetic */ pdx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pdw(pdx pdxVar, ConditionVariable conditionVariable) {
        super("SimpleCache.initialize()");
        this.b = pdxVar;
        this.a = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j;
        synchronized (this.b) {
            this.a.open();
            pdx pdxVar = this.b;
            if (pdxVar.a.exists() || pdxVar.a.mkdirs()) {
                File[] listFiles = pdxVar.a.listFiles();
                if (listFiles == null) {
                    String valueOf = String.valueOf(pdxVar.a);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
                    sb.append("Failed to list cache directory files: ");
                    sb.append(valueOf);
                    String sb2 = sb.toString();
                    Log.e("SimpleCache", sb2);
                    pdxVar.d = new pdc(sb2);
                } else {
                    int length = listFiles.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            j = -1;
                            break;
                        }
                        File file = listFiles[i];
                        String name = file.getName();
                        if (name.endsWith(".uid")) {
                            try {
                                j = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                                break;
                            } catch (NumberFormatException unused) {
                                String valueOf2 = String.valueOf(file);
                                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 20);
                                sb3.append("Malformed UID file: ");
                                sb3.append(valueOf2);
                                Log.e("SimpleCache", sb3.toString());
                                file.delete();
                            }
                        }
                        i++;
                    }
                    if (j == -1) {
                        try {
                            File file2 = pdxVar.a;
                            long nextLong = new SecureRandom().nextLong();
                            File file3 = new File(file2, String.valueOf(Long.toString(nextLong == Long.MIN_VALUE ? 0L : Math.abs(nextLong), 16)).concat(".uid"));
                            if (!file3.createNewFile()) {
                                String valueOf3 = String.valueOf(file3);
                                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 27);
                                sb4.append("Failed to create UID file: ");
                                sb4.append(valueOf3);
                                throw new IOException(sb4.toString());
                            }
                        } catch (IOException e) {
                            String valueOf4 = String.valueOf(pdxVar.a);
                            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf4).length() + 28);
                            sb5.append("Failed to create cache UID: ");
                            sb5.append(valueOf4);
                            String sb6 = sb5.toString();
                            pns.e("SimpleCache", sb6, e);
                            pdxVar.d = new pdc(sb6, e);
                        }
                    }
                    try {
                        pdn pdnVar = pdxVar.c;
                        pdm pdmVar = pdnVar.c;
                        HashMap hashMap = pdnVar.a;
                        SparseArray sparseArray = pdnVar.b;
                        ptx.e(!((pdl) pdmVar).a);
                        if (!((pdl) pdmVar).b(hashMap, sparseArray)) {
                            hashMap.clear();
                            sparseArray.clear();
                            qzt qztVar = ((pdl) pdmVar).b;
                            qztVar.a.delete();
                            qztVar.b.delete();
                        }
                        pdxVar.q(pdxVar.a, true, listFiles);
                        pdn pdnVar2 = pdxVar.c;
                        int size = pdnVar2.a.size();
                        String[] strArr = new String[size];
                        pdnVar2.a.keySet().toArray(strArr);
                        for (int i2 = 0; i2 < size; i2++) {
                            pdnVar2.c(strArr[i2]);
                        }
                        try {
                            pdxVar.c.d();
                        } catch (IOException e2) {
                            pns.e("SimpleCache", "Storing index file failed", e2);
                        }
                    } catch (IOException e3) {
                        String valueOf5 = String.valueOf(pdxVar.a);
                        StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf5).length() + 36);
                        sb7.append("Failed to initialize cache indices: ");
                        sb7.append(valueOf5);
                        String sb8 = sb7.toString();
                        pns.e("SimpleCache", sb8, e3);
                        pdxVar.d = new pdc(sb8, e3);
                    }
                }
            } else {
                String valueOf6 = String.valueOf(pdxVar.a);
                StringBuilder sb9 = new StringBuilder(String.valueOf(valueOf6).length() + 34);
                sb9.append("Failed to create cache directory: ");
                sb9.append(valueOf6);
                String sb10 = sb9.toString();
                Log.e("SimpleCache", sb10);
                pdxVar.d = new pdc(sb10);
            }
            this.b.b.f();
        }
    }
}
