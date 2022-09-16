package defpackage;

import android.os.SystemClock;
import androidx.media3.decoder.vp9.VpxLibrary;
import com.google.android.exoplayer.ext.opus.OpusDecoder;
import com.google.android.exoplayer.youtube.libvpx.VpxDecoder;
import j$.util.Optional;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: adyd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class adyd implements amqo {
    private final /* synthetic */ int v;
    public static final /* synthetic */ adyd u = new adyd(20);
    public static final /* synthetic */ adyd t = new adyd(19);
    public static final /* synthetic */ adyd s = new adyd(18);
    public static final /* synthetic */ adyd r = new adyd(17);
    public static final /* synthetic */ adyd q = new adyd(16);
    public static final /* synthetic */ adyd p = new adyd(15);
    public static final /* synthetic */ adyd o = new adyd(14);
    public static final /* synthetic */ adyd n = new adyd(13);
    public static final /* synthetic */ adyd m = new adyd(12);
    public static final /* synthetic */ adyd l = new adyd(11);
    public static final /* synthetic */ adyd k = new adyd(10);
    public static final /* synthetic */ adyd j = new adyd(9);
    public static final /* synthetic */ adyd i = new adyd(8);
    public static final /* synthetic */ adyd h = new adyd(7);
    public static final /* synthetic */ adyd g = new adyd(6);
    public static final /* synthetic */ adyd f = new adyd(5);
    public static final /* synthetic */ adyd e = new adyd(4);
    public static final /* synthetic */ adyd d = new adyd(3);
    public static final /* synthetic */ adyd c = new adyd(2);
    public static final /* synthetic */ adyd b = new adyd(1);
    public static final /* synthetic */ adyd a = new adyd();

    private /* synthetic */ adyd() {
    }

    private /* synthetic */ adyd(int i2) {
        this.v = i2;
    }

    @Override // defpackage.amqo
    public final Object get() {
        switch (this.v) {
            case 0:
            case 1:
            case 2:
                return false;
            case 3:
                return Collections.emptyList();
            case 4:
                return ork.a;
            case 5:
                return 128000;
            case 6:
                return Long.MAX_VALUE;
            case 7:
                int i2 = aerd.f;
                return null;
            case 8:
                int i3 = aerd.f;
                return null;
            case 9:
                return false;
            case 10:
                return Long.valueOf(SystemClock.elapsedRealtime());
            case 11:
                return false;
            case 12:
                return Boolean.valueOf(ats.a());
            case 13:
                return Boolean.valueOf(VpxLibrary.a());
            case 14:
                return Boolean.valueOf(OpusDecoder.a);
            case 15:
                return Boolean.valueOf(VpxDecoder.a);
            case 16:
                return null;
            case 17:
                return Optional.empty();
            case 18:
                return awuj.a;
            case 19:
                return alj.a();
            default:
                cgh cghVar = new cgh();
                cghVar.c(cue.b);
                return cghVar;
        }
    }
}
