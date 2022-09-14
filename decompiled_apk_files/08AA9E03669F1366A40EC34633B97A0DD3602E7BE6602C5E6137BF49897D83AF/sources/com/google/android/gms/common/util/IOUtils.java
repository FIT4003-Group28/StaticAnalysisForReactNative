package com.google.android.gms.common.util;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class IOUtils {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class zza extends ByteArrayOutputStream {
        private zza() {
        }

        final void zza(byte[] bArr, int i) {
            System.arraycopy(this.buf, 0, bArr, i, this.count);
        }
    }

    /* loaded from: classes.dex */
    private static final class zzb {
        private final File file;

        private zzb(File file) {
            this.file = (File) Preconditions.checkNotNull(file);
        }

        public final byte[] zzdd() {
            FileInputStream fileInputStream;
            Throwable th;
            try {
                fileInputStream = new FileInputStream(this.file);
                try {
                    byte[] zza = IOUtils.zza(fileInputStream, fileInputStream.getChannel().size());
                    IOUtils.closeQuietly(fileInputStream);
                    return zza;
                } catch (Throwable th2) {
                    th = th2;
                    IOUtils.closeQuietly(fileInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                fileInputStream = null;
                th = th3;
            }
        }
    }

    private IOUtils() {
    }

    public static void close(Closeable closeable, String str, String str2) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                Log.d(str, str2, e);
            }
        }
    }

    public static void closeQuietly(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void closeQuietly(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void closeQuietly(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long copyStream(InputStream inputStream, OutputStream outputStream) {
        return copyStream(inputStream, outputStream, false);
    }

    public static long copyStream(InputStream inputStream, OutputStream outputStream, boolean z) {
        return copyStream(inputStream, outputStream, z, 1024);
    }

    public static long copyStream(InputStream inputStream, OutputStream outputStream, boolean z, int i) {
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i);
                if (read == -1) {
                    break;
                }
                j += read;
                outputStream.write(bArr, 0, read);
            } finally {
                if (z) {
                    closeQuietly(inputStream);
                    closeQuietly(outputStream);
                }
            }
        }
        return j;
    }

    public static boolean isGzipByteBuffer(byte[] bArr) {
        if (bArr.length > 1) {
            if ((((bArr[1] & 255) << 8) | (bArr[0] & 255)) == 35615) {
                return true;
            }
        }
        return false;
    }

    public static void lockAndTruncateFile(File file) {
        RandomAccessFile randomAccessFile;
        if (!file.exists()) {
            throw new FileNotFoundException();
        }
        FileLock fileLock = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                FileChannel channel = randomAccessFile.getChannel();
                FileLock lock = channel.lock();
                try {
                    channel.truncate(0L);
                    if (lock != null && lock.isValid()) {
                        try {
                            lock.release();
                        } catch (IOException unused) {
                        }
                    }
                    closeQuietly(randomAccessFile);
                } catch (Throwable th) {
                    th = th;
                    fileLock = lock;
                    if (fileLock != null && fileLock.isValid()) {
                        try {
                            fileLock.release();
                        } catch (IOException unused2) {
                        }
                    }
                    if (randomAccessFile != null) {
                        closeQuietly(randomAccessFile);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
        }
    }

    public static byte[] readInputStreamFully(InputStream inputStream) {
        return readInputStreamFully(inputStream, true);
    }

    public static byte[] readInputStreamFully(InputStream inputStream, boolean z) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copyStream(inputStream, byteArrayOutputStream, z);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] toByteArray(File file) {
        return new zzb(file).zzdd();
    }

    public static byte[] toByteArray(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zza(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    private static long zza(InputStream inputStream, OutputStream outputStream) {
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(outputStream);
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
                j += read;
            } else {
                return j;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] zza(InputStream inputStream, long j) {
        if (j > 2147483647L) {
            StringBuilder sb = new StringBuilder(68);
            sb.append("file is too large to fit in a byte array: ");
            sb.append(j);
            sb.append(" bytes");
            throw new OutOfMemoryError(sb.toString());
        } else if (j == 0) {
            return toByteArray(inputStream);
        } else {
            int i = (int) j;
            byte[] bArr = new byte[i];
            int i2 = i;
            while (i2 > 0) {
                int i3 = i - i2;
                int read = inputStream.read(bArr, i3, i2);
                if (read == -1) {
                    return Arrays.copyOf(bArr, i3);
                }
                i2 -= read;
            }
            int read2 = inputStream.read();
            if (read2 == -1) {
                return bArr;
            }
            zza zzaVar = new zza();
            zzaVar.write(read2);
            zza(inputStream, zzaVar);
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length + zzaVar.size());
            zzaVar.zza(copyOf, bArr.length);
            return copyOf;
        }
    }
}
