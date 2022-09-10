package defpackage;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.NonWritableChannelException;
import java.nio.channels.OverlappingFileLockException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bwrw  reason: default package */
/* loaded from: classes.dex */
public final class bwrw extends bwrx implements bwsa, bwsb {
    public final Set<String> a = Collections.synchronizedSet(new HashSet());
    private final Context b;

    public bwrw(Context context) {
        this.b = context;
    }

    public static void e(FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.getMessage();
            }
        }
    }

    private static String f(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() != 0 ? "DATA_".concat(valueOf) : new String("DATA_");
    }

    @Override // defpackage.bwsa
    @dzsi
    public final byte[] a(String str) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            String f = f(str);
            fileInputStream = this.b.openFileInput(f);
            try {
                int length = (int) this.b.getFileStreamPath(f).length();
                if (length < 0) {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    return null;
                }
                byte[] bArr = new byte[length];
                int i = 0;
                while (length > 0) {
                    int read = fileInputStream.read(bArr, i, length);
                    if (read == -1) {
                        throw new IOException(String.format(Locale.US, "Read %d bytes from %s; expected %d more", Integer.valueOf(i), str, Integer.valueOf(length)));
                    }
                    length -= read;
                    i += read;
                }
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                return bArr;
            } catch (FileNotFoundException unused3) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                return null;
            } catch (IOException unused5) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused6) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused7) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused8) {
            fileInputStream = null;
        } catch (IOException unused9) {
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.bwsa
    public final void b(String str) {
        this.b.deleteFile(f(str));
    }

    @Override // defpackage.bwsb
    public final bwrv c() {
        FileOutputStream fileOutputStream;
        String f = f("savedLocationShiftCoefficients_lock");
        synchronized (this.a) {
            if (this.a.contains(f)) {
                return null;
            }
            try {
                fileOutputStream = this.b.openFileOutput(f, 0);
            } catch (IOException e) {
                e = e;
                fileOutputStream = null;
                e.getMessage();
                e(fileOutputStream);
                return null;
            } catch (NonWritableChannelException e2) {
                e = e2;
                fileOutputStream = null;
                e.getMessage();
                e(fileOutputStream);
                return null;
            } catch (OverlappingFileLockException e3) {
                e = e3;
                fileOutputStream = null;
                e.getMessage();
                e(fileOutputStream);
                return null;
            }
            try {
                return new bwrv(this, fileOutputStream, fileOutputStream.getChannel().lock(), f);
            } catch (IOException e4) {
                e = e4;
                e.getMessage();
                e(fileOutputStream);
                return null;
            } catch (NonWritableChannelException e5) {
                e = e5;
                e.getMessage();
                e(fileOutputStream);
                return null;
            } catch (OverlappingFileLockException e6) {
                e = e6;
                e.getMessage();
                e(fileOutputStream);
                return null;
            }
        }
    }

    @Override // defpackage.bwsa
    public final void d(byte[] bArr, String str) {
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (bwrz unused) {
                return;
            }
        }
        try {
            FileOutputStream openFileOutput = this.b.openFileOutput(f(str), 0);
            openFileOutput.write(bArr);
            if (openFileOutput == null) {
                return;
            }
            openFileOutput.close();
        } catch (IOException e) {
            throw new bwrz(e.getMessage());
        }
    }
}
