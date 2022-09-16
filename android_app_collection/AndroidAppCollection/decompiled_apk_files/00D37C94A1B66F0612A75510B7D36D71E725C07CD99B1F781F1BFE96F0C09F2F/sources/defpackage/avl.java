package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
/* compiled from: PG */
/* renamed from: avl  reason: default package */
/* loaded from: classes2.dex */
public final class avl implements avw {
    private final amqo b;
    private final amqo c;
    private final boolean d;
    private final boolean e;

    public avl(int i, boolean z, boolean z2) {
        avk avkVar = new avk(i, 1);
        avk avkVar2 = new avk(i);
        this.b = avkVar;
        this.c = avkVar2;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.avw
    /* renamed from: a */
    public final avm b(avv avvVar) {
        MediaCodec mediaCodec;
        avm avmVar;
        String str = avvVar.a.a;
        avm avmVar2 = null;
        try {
            if (str.length() != 0) {
                "createCodec:".concat(str);
            }
            int i = pxi.a;
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                avmVar = new avm(mediaCodec, (HandlerThread) this.b.get(), (HandlerThread) this.c.get(), this.d, this.e);
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            mediaCodec = null;
        }
        try {
            MediaFormat mediaFormat = avvVar.b;
            Surface surface = avvVar.d;
            MediaCrypto mediaCrypto = avvVar.e;
            avr avrVar = avmVar.b;
            MediaCodec mediaCodec2 = avmVar.a;
            ptx.e(avrVar.c == null);
            avrVar.b.start();
            Handler handler = new Handler(avrVar.b.getLooper());
            mediaCodec2.setCallback(avrVar, handler);
            avrVar.c = handler;
            avmVar.a.configure(mediaFormat, surface, mediaCrypto, 0);
            avp avpVar = avmVar.c;
            if (!avpVar.h) {
                avpVar.d.start();
                avpVar.e = new avn(avpVar, avpVar.d.getLooper());
                avpVar.h = true;
            }
            avmVar.a.start();
            avmVar.d = 1;
            return avmVar;
        } catch (Exception e3) {
            e = e3;
            avmVar2 = avmVar;
            if (avmVar2 != null) {
                avmVar2.h();
            } else if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
    }
}
