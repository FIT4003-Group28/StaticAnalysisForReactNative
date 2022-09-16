package defpackage;

import android.util.Log;
import android.util.SparseArray;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pdl  reason: default package */
/* loaded from: classes4.dex */
public final class pdl implements pdm {
    public boolean a;
    public final qzt b;
    private final boolean c;
    private final Cipher d;
    private final SecretKeySpec e;
    private final SecureRandom f;
    private pwy g;

    public pdl(File file, byte[] bArr, boolean z) {
        Cipher cipher;
        SecretKeySpec secretKeySpec;
        SecureRandom secureRandom = null;
        if (bArr != null) {
            ptx.c(bArr.length == 16);
            try {
                int i = pxi.a;
                cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                secretKeySpec = new SecretKeySpec(bArr, "AES");
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                throw new IllegalStateException(e);
            }
        } else {
            ptx.c(!z);
            cipher = null;
            secretKeySpec = null;
        }
        this.c = z;
        this.d = cipher;
        this.e = secretKeySpec;
        this.f = z ? new SecureRandom() : secureRandom;
        this.b = new qzt(file);
    }

    private static final int d(pdk pdkVar, int i) {
        int hashCode = (pdkVar.a * 31) + pdkVar.b.hashCode();
        if (i < 2) {
            long a = pdo.a(pdkVar.d);
            return (hashCode * 31) + ((int) (a ^ (a >>> 32)));
        }
        return (hashCode * 31) + pdkVar.d.hashCode();
    }

    public final void a(HashMap hashMap) {
        pvp pvpVar;
        DataOutputStream dataOutputStream;
        DataOutputStream dataOutputStream2 = null;
        try {
            qzt qztVar = this.b;
            if (qztVar.a.exists()) {
                if (!qztVar.b.exists()) {
                    if (!qztVar.a.renameTo(qztVar.b)) {
                        String valueOf = String.valueOf(qztVar.a);
                        String valueOf2 = String.valueOf(qztVar.b);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37 + String.valueOf(valueOf2).length());
                        sb.append("Couldn't rename file ");
                        sb.append(valueOf);
                        sb.append(" to backup file ");
                        sb.append(valueOf2);
                        Log.w("AtomicFile", sb.toString());
                    }
                } else {
                    qztVar.a.delete();
                }
            }
            try {
                pvpVar = new pvp(qztVar.a);
            } catch (FileNotFoundException e) {
                File parentFile = qztVar.a.getParentFile();
                if (parentFile == null || !parentFile.mkdirs()) {
                    String valueOf3 = String.valueOf(qztVar.a);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 16);
                    sb2.append("Couldn't create ");
                    sb2.append(valueOf3);
                    throw new IOException(sb2.toString(), e);
                }
                try {
                    pvpVar = new pvp(qztVar.a);
                } catch (FileNotFoundException e2) {
                    String valueOf4 = String.valueOf(qztVar.a);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 16);
                    sb3.append("Couldn't create ");
                    sb3.append(valueOf4);
                    throw new IOException(sb3.toString(), e2);
                }
            }
            pwy pwyVar = this.g;
            if (pwyVar != null) {
                pwyVar.a(pvpVar);
            } else {
                this.g = new pwy(pvpVar);
            }
            dataOutputStream = new DataOutputStream(this.g);
        } catch (Throwable th) {
            th = th;
            pxi.J(dataOutputStream2);
            throw th;
        }
        try {
            dataOutputStream.writeInt(2);
            dataOutputStream.writeInt(this.c ? 1 : 0);
            if (this.c) {
                byte[] bArr = new byte[16];
                this.f.nextBytes(bArr);
                dataOutputStream.write(bArr);
                try {
                    this.d.init(1, this.e, new IvParameterSpec(bArr));
                    dataOutputStream.flush();
                    dataOutputStream = new DataOutputStream(new CipherOutputStream(this.g, this.d));
                } catch (InvalidAlgorithmParameterException e3) {
                    e = e3;
                    throw new IllegalStateException(e);
                } catch (InvalidKeyException e4) {
                    e = e4;
                    throw new IllegalStateException(e);
                }
            }
            dataOutputStream.writeInt(hashMap.size());
            int i = 0;
            for (pdk pdkVar : hashMap.values()) {
                dataOutputStream.writeInt(pdkVar.a);
                dataOutputStream.writeUTF(pdkVar.b);
                Set<Map.Entry> entrySet = pdkVar.d.b.entrySet();
                dataOutputStream.writeInt(entrySet.size());
                for (Map.Entry entry : entrySet) {
                    dataOutputStream.writeUTF((String) entry.getKey());
                    byte[] bArr2 = (byte[]) entry.getValue();
                    dataOutputStream.writeInt(bArr2.length);
                    dataOutputStream.write(bArr2);
                }
                i += d(pdkVar, 2);
            }
            dataOutputStream.writeInt(i);
            qzt qztVar2 = this.b;
            dataOutputStream.close();
            qztVar2.b.delete();
            pxi.J(null);
        } catch (Throwable th2) {
            th = th2;
            dataOutputStream2 = dataOutputStream;
            pxi.J(dataOutputStream2);
            throw th;
        }
    }

    public final boolean b(HashMap hashMap, SparseArray sparseArray) {
        int i;
        pdr pdrVar;
        qzt qztVar = this.b;
        if (qztVar.a.exists() || qztVar.b.exists()) {
            DataInputStream dataInputStream = null;
            try {
                qzt qztVar2 = this.b;
                if (qztVar2.b.exists()) {
                    qztVar2.a.delete();
                    qztVar2.b.renameTo(qztVar2.a);
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(qztVar2.a));
                DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                try {
                    int readInt = dataInputStream2.readInt();
                    if (readInt >= 0) {
                        int i2 = 2;
                        if (readInt <= 2) {
                            if ((dataInputStream2.readInt() & 1) != 0) {
                                if (this.d == null) {
                                    pxi.J(dataInputStream2);
                                    return false;
                                }
                                byte[] bArr = new byte[16];
                                dataInputStream2.readFully(bArr);
                                try {
                                    this.d.init(2, this.e, new IvParameterSpec(bArr));
                                    dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, this.d));
                                } catch (InvalidAlgorithmParameterException e) {
                                    e = e;
                                    throw new IllegalStateException(e);
                                } catch (InvalidKeyException e2) {
                                    e = e2;
                                    throw new IllegalStateException(e);
                                }
                            } else if (this.c) {
                                this.a = true;
                            }
                            int readInt2 = dataInputStream2.readInt();
                            int i3 = 0;
                            int i4 = 0;
                            while (i3 < readInt2) {
                                int readInt3 = dataInputStream2.readInt();
                                String readUTF = dataInputStream2.readUTF();
                                if (readInt < i2) {
                                    long readLong = dataInputStream2.readLong();
                                    pdq pdqVar = new pdq();
                                    pdq.b(pdqVar, readLong);
                                    pdrVar = pdr.a.a(pdqVar);
                                    i = readInt2;
                                } else {
                                    int readInt4 = dataInputStream2.readInt();
                                    HashMap hashMap2 = new HashMap();
                                    int i5 = 0;
                                    while (i5 < readInt4) {
                                        String readUTF2 = dataInputStream2.readUTF();
                                        int readInt5 = dataInputStream2.readInt();
                                        if (readInt5 < 0) {
                                            StringBuilder sb = new StringBuilder(31);
                                            sb.append("Invalid value size: ");
                                            sb.append(readInt5);
                                            throw new IOException(sb.toString());
                                        }
                                        int min = Math.min(readInt5, 10485760);
                                        byte[] bArr2 = pxi.f;
                                        int i6 = 0;
                                        while (i6 != readInt5) {
                                            int i7 = readInt2;
                                            int i8 = i6 + min;
                                            bArr2 = Arrays.copyOf(bArr2, i8);
                                            dataInputStream2.readFully(bArr2, i6, min);
                                            min = Math.min(readInt5 - i8, 10485760);
                                            i6 = i8;
                                            readInt2 = i7;
                                        }
                                        hashMap2.put(readUTF2, bArr2);
                                        i5++;
                                        readInt2 = readInt2;
                                    }
                                    i = readInt2;
                                    pdrVar = new pdr(hashMap2);
                                }
                                pdk pdkVar = new pdk(readInt3, readUTF, pdrVar);
                                hashMap.put(pdkVar.b, pdkVar);
                                sparseArray.put(pdkVar.a, pdkVar.b);
                                i4 += d(pdkVar, readInt);
                                i3++;
                                readInt2 = i;
                                i2 = 2;
                            }
                            int readInt6 = dataInputStream2.readInt();
                            int read = dataInputStream2.read();
                            if (readInt6 == i4 && read == -1) {
                                pxi.J(dataInputStream2);
                                return true;
                            }
                        }
                    }
                    pxi.J(dataInputStream2);
                    return false;
                } catch (IOException unused) {
                    dataInputStream = dataInputStream2;
                    if (dataInputStream == null) {
                        return false;
                    }
                    pxi.J(dataInputStream);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        pxi.J(dataInputStream);
                    }
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            return true;
        }
    }

    @Override // defpackage.pdm
    public final void c() {
        this.a = true;
    }
}
