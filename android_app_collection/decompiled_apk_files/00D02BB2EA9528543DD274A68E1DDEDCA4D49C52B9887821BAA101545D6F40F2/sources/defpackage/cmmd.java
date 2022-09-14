package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cmmd  reason: default package */
/* loaded from: classes5.dex */
final class cmmd {
    public final HashMap<String, cmma> a;
    public final SparseArray<String> b;
    public final cmmc c;
    private final SparseBooleanArray d;
    private final SparseBooleanArray e;

    public cmmd(File file) {
        cmmn.c(true);
        this.a = new HashMap<>();
        this.b = new SparseArray<>();
        this.d = new SparseBooleanArray();
        this.e = new SparseBooleanArray();
        cmmb cmmbVar = new cmmb(new File(file, "cached_content_index.exi"));
        int i = cmny.a;
        this.c = cmmbVar;
    }

    public final cmma b(String str) {
        cmma cmmaVar = this.a.get(str);
        if (cmmaVar == null) {
            SparseArray<String> sparseArray = this.b;
            int size = sparseArray.size();
            int i = 0;
            int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
            if (keyAt < 0) {
                while (i < size && i == sparseArray.keyAt(i)) {
                    i++;
                }
                keyAt = i;
            }
            cmma cmmaVar2 = new cmma(keyAt, str, cmmh.a);
            this.a.put(str, cmmaVar2);
            this.b.put(keyAt, str);
            this.e.put(keyAt, true);
            this.c.b();
            return cmmaVar2;
        }
        return cmmaVar;
    }

    public final cmma c(String str) {
        return this.a.get(str);
    }

    public final void d(String str) {
        cmma cmmaVar = this.a.get(str);
        if (cmmaVar == null || !cmmaVar.c.isEmpty() || !cmmaVar.d.isEmpty()) {
            return;
        }
        this.a.remove(str);
        int i = cmmaVar.a;
        boolean z = this.e.get(i);
        ((cmmb) this.c).b = true;
        if (z) {
            this.b.remove(i);
            this.e.delete(i);
            return;
        }
        this.b.put(i, null);
        this.d.put(i, true);
    }

    public final void a() {
        cmmo cmmoVar;
        DataOutputStream dataOutputStream;
        cmmc cmmcVar = this.c;
        HashMap<String, cmma> hashMap = this.a;
        cmmb cmmbVar = (cmmb) cmmcVar;
        if (cmmbVar.b) {
            DataOutputStream dataOutputStream2 = null;
            try {
                cmmp cmmpVar = ((cmmb) cmmcVar).a;
                if (cmmpVar.a.exists()) {
                    if (!cmmpVar.b.exists()) {
                        if (!cmmpVar.a.renameTo(cmmpVar.b)) {
                            String valueOf = String.valueOf(cmmpVar.a);
                            String valueOf2 = String.valueOf(cmmpVar.b);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37 + String.valueOf(valueOf2).length());
                            sb.append("Couldn't rename file ");
                            sb.append(valueOf);
                            sb.append(" to backup file ");
                            sb.append(valueOf2);
                            sb.toString();
                        }
                    } else {
                        cmmpVar.a.delete();
                    }
                }
                try {
                    cmmoVar = new cmmo(cmmpVar.a);
                } catch (FileNotFoundException e) {
                    File parentFile = cmmpVar.a.getParentFile();
                    if (parentFile == null || !parentFile.mkdirs()) {
                        String valueOf3 = String.valueOf(cmmpVar.a);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 16);
                        sb2.append("Couldn't create ");
                        sb2.append(valueOf3);
                        throw new IOException(sb2.toString(), e);
                    }
                    try {
                        cmmoVar = new cmmo(cmmpVar.a);
                    } catch (FileNotFoundException e2) {
                        String valueOf4 = String.valueOf(cmmpVar.a);
                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 16);
                        sb3.append("Couldn't create ");
                        sb3.append(valueOf4);
                        throw new IOException(sb3.toString(), e2);
                    }
                }
                cmnm cmnmVar = ((cmmb) cmmcVar).c;
                if (cmnmVar == null) {
                    ((cmmb) cmmcVar).c = new cmnm(cmmoVar);
                } else {
                    cmnmVar.a(cmmoVar);
                }
                dataOutputStream = new DataOutputStream(((cmmb) cmmcVar).c);
            } catch (Throwable th) {
                th = th;
            }
            try {
                dataOutputStream.writeInt(2);
                dataOutputStream.writeInt(0);
                dataOutputStream.writeInt(hashMap.size());
                int i = 0;
                for (cmma cmmaVar : hashMap.values()) {
                    dataOutputStream.writeInt(cmmaVar.a);
                    dataOutputStream.writeUTF(cmmaVar.b);
                    Set<Map.Entry<String, byte[]>> entrySet = cmmaVar.e.b.entrySet();
                    dataOutputStream.writeInt(entrySet.size());
                    for (Map.Entry<String, byte[]> entry : entrySet) {
                        dataOutputStream.writeUTF(entry.getKey());
                        byte[] value = entry.getValue();
                        dataOutputStream.writeInt(value.length);
                        dataOutputStream.write(value);
                    }
                    i += cmmb.a(cmmaVar, 2);
                }
                dataOutputStream.writeInt(i);
                cmmp cmmpVar2 = ((cmmb) cmmcVar).a;
                dataOutputStream.close();
                cmmpVar2.b.delete();
                cmny.m(null);
                cmmbVar.b = false;
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream2 = dataOutputStream;
                cmny.m(dataOutputStream2);
                throw th;
            }
        }
        int size = this.d.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.b.remove(this.d.keyAt(i2));
        }
        this.d.clear();
        this.e.clear();
    }
}
