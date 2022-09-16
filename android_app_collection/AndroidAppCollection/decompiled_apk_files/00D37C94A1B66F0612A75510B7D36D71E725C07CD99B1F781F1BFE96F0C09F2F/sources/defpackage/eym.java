package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.rastermill.FrameSequence;
import android.support.rastermill.FrameSequenceDrawable;
/* compiled from: PG */
/* renamed from: eym  reason: default package */
/* loaded from: classes3.dex */
public final class eym extends ajmi {
    public eym(Context context) {
        super(context);
    }

    @Override // defpackage.ajmi
    public final Drawable a(byte[] bArr) {
        int length = bArr.length;
        if ((length >= 21 && bArr[0] == 82 && bArr[1] == 73 && bArr[2] == 70 && bArr[3] == 70 && bArr[8] == 87 && bArr[9] == 69 && bArr[10] == 66 && bArr[11] == 80 && bArr[12] == 86 && bArr[13] == 80 && bArr[14] == 56 && bArr[15] == 88 && (bArr[20] & 2) != 0) || (length >= 3 && bArr[0] == 71 && bArr[1] == 73 && bArr[2] == 70)) {
            FrameSequence frameSequence = null;
            try {
                frameSequence = FrameSequence.decodeByteArray(bArr);
            } catch (IllegalArgumentException e) {
                e = e;
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb.append("Error decoding GIF or WebP. ");
                sb.append(valueOf);
                zep.b(sb.toString());
            } catch (IllegalStateException e2) {
                e = e2;
                String valueOf2 = String.valueOf(e);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
                sb2.append("Error decoding GIF or WebP. ");
                sb2.append(valueOf2);
                zep.b(sb2.toString());
            } catch (UnsatisfiedLinkError unused) {
                zep.b("Error loading rastermill native library.");
            }
            if (frameSequence != null) {
                FrameSequenceDrawable frameSequenceDrawable = new FrameSequenceDrawable(frameSequence);
                frameSequenceDrawable.setLoopBehavior(2);
                return frameSequenceDrawable;
            }
        }
        return c(bArr);
    }

    @Override // defpackage.ajmi, defpackage.afts
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        return b((byte[]) obj);
    }
}
