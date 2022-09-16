package defpackage;

import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer.MediaFormat;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: otc  reason: default package */
/* loaded from: classes4.dex */
public final class otc extends Handler {
    final /* synthetic */ otd a;

    public otc(otd otdVar) {
        this.a = otdVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        otd otdVar = this.a;
        int i = message.what;
        if (i == 1) {
            Object obj = message.obj;
            MediaFormat[][] mediaFormatArr = otdVar.c;
            System.arraycopy(obj, 0, mediaFormatArr, 0, mediaFormatArr.length);
            otdVar.e = message.arg1;
            Iterator it = otdVar.b.iterator();
            while (it.hasNext()) {
                ((ota) it.next()).rN(otdVar.d, otdVar.e);
            }
        } else if (i == 2) {
            otdVar.e = message.arg1;
            Iterator it2 = otdVar.b.iterator();
            while (it2.hasNext()) {
                ((ota) it2.next()).rN(otdVar.d, otdVar.e);
            }
        } else if (i != 3) {
            if (i != 4) {
                return;
            }
            osx osxVar = (osx) message.obj;
            Iterator it3 = otdVar.b.iterator();
            while (it3.hasNext()) {
                ((ota) it3.next()).rM(osxVar);
            }
        } else {
            int i2 = otdVar.f - 1;
            otdVar.f = i2;
            if (i2 != 0) {
                return;
            }
            Iterator it4 = otdVar.b.iterator();
            while (it4.hasNext()) {
                ((ota) it4.next()).rL();
            }
        }
    }
}
