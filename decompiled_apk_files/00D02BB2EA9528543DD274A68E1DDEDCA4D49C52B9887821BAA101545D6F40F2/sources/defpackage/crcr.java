package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.media.MediaPlayer;
import java.io.File;
import java.io.FileInputStream;
/* compiled from: PG */
/* renamed from: crcr  reason: default package */
/* loaded from: classes5.dex */
public final class crcr implements crco {
    public static final MediaPlayer.OnErrorListener a = new crcp();
    public static final MediaPlayer.OnInfoListener b = new crcq();
    private static final String c = "crcr";
    private final bvrb d;

    public crcr(bvrb bvrbVar) {
        this.d = bvrbVar;
    }

    @Override // defpackage.crco
    @dzsi
    public final crbc a(Resources resources, int i, cres cresVar) {
        bvrj.UI_THREAD.d();
        AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(i);
        if (openRawResourceFd == null) {
            return null;
        }
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnErrorListener(a);
        mediaPlayer.setOnInfoListener(b);
        try {
            openRawResourceFd.getFileDescriptor();
            openRawResourceFd.getStartOffset();
            openRawResourceFd.getLength();
            mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
            openRawResourceFd.close();
            mediaPlayer.setAudioStreamType(3);
            resources.getResourceName(i);
            return c(mediaPlayer, cresVar, 3);
        } catch (Exception e) {
            bvoo.j(e);
            mediaPlayer.release();
            return null;
        }
    }

    @Override // defpackage.crco
    @dzsi
    public final crbc b(File file, cres cresVar, int i) {
        bvrj.UI_THREAD.d();
        if (!file.exists()) {
            bvoo.j(new Exception("MediaAlert file doesn't exist"));
            return null;
        } else if (!file.canRead()) {
            bvoo.j(new Exception("MediaAlert file doesn't have read permissions"));
            return null;
        } else {
            MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setOnErrorListener(a);
            mediaPlayer.setOnInfoListener(b);
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                mediaPlayer.setDataSource(fileInputStream.getFD());
                mediaPlayer.setAudioStreamType(3);
                file.getPath();
                crbc c2 = c(mediaPlayer, cresVar, i);
                fileInputStream.close();
                return c2;
            } catch (Exception e) {
                bvoo.j(e);
                mediaPlayer.release();
                return null;
            }
        }
    }

    public final crbc c(MediaPlayer mediaPlayer, cres cresVar, int i) {
        return new crcn(mediaPlayer, cresVar, this.d, i);
    }
}
