package defpackage;

import android.app.Application;
import java.io.File;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cksj  reason: default package */
/* loaded from: classes4.dex */
public final class cksj {
    public final ckrx a;

    public cksj(Application application, bvrb bvrbVar, cqat cqatVar, btvo btvoVar) {
        ckrx ckrxVar = new ckrx(bvrbVar, cqatVar, btvoVar, application.getDir("tts-cache", 0).getAbsolutePath(), btvoVar.getTextToSpeechParameters().j > 0 ? btvoVar.getTextToSpeechParameters().j : 52428800L, btvoVar.getTextToSpeechParameters().k > 0 ? btvoVar.getTextToSpeechParameters().k : 1000);
        bvrbVar.b(new ckru(ckrxVar), bvrj.BACKGROUND_THREADPOOL);
        this.a = ckrxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(cksi cksiVar) {
        int hashCode;
        if (cksiVar.e.isEmpty()) {
            hashCode = Arrays.hashCode(new Object[]{cksiVar.a, cksiVar.b, Integer.valueOf(cksiVar.c), cksiVar.d.toString()});
        } else {
            hashCode = Arrays.hashCode(new Object[]{cksiVar.a, cksiVar.b, Integer.valueOf(cksiVar.c), cksiVar.d.toString(), cksiVar.e});
        }
        return Integer.toString(hashCode);
    }

    @dzsi
    public final File a(cksi cksiVar) {
        String a;
        String b = b(cksiVar);
        if (!this.a.d(b) || (a = this.a.a(b)) == null) {
            return null;
        }
        return new File(a);
    }
}
