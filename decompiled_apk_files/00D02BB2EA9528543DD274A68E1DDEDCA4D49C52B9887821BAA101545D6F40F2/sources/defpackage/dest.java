package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
/* compiled from: PG */
/* renamed from: dest  reason: default package */
/* loaded from: classes6.dex */
final class dest {
    private final FileChannel a;
    private final FileLock b;

    private dest(FileChannel fileChannel, FileLock fileLock) {
        this.a = fileChannel;
        this.b = fileLock;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dest b(Context context) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
            } catch (IOException | Error | OverlappingFileLockException unused) {
                fileLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException unused2) {
            fileChannel = null;
            fileLock = null;
        }
        try {
            return new dest(fileChannel, fileLock);
        } catch (IOException | Error | OverlappingFileLockException unused3) {
            if (fileLock != null) {
                try {
                    fileLock.release();
                } catch (IOException unused4) {
                }
            }
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException unused5) {
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        try {
            this.b.release();
            this.a.close();
        } catch (IOException unused) {
        }
    }
}
