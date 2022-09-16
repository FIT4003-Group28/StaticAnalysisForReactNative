package defpackage;

import android.text.TextUtils;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: agkd  reason: default package */
/* loaded from: classes.dex */
public final class agkd implements ynl {
    public final yni a;
    public final aadd b;
    public final ScheduledExecutorService c;
    public final azqb d;
    public final azqb e;
    public final azqb f;
    public final azqb g;
    boolean h;
    private final azqb i;

    public agkd(yni yniVar, aadd aaddVar, ScheduledExecutorService scheduledExecutorService, azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        this.a = yniVar;
        this.b = aaddVar;
        this.c = scheduledExecutorService;
        this.d = azqbVar;
        this.e = azqbVar2;
        this.f = azqbVar3;
        this.i = azqbVar4;
        this.g = azqbVar5;
    }

    public final void a(int i, int i2, int i3) {
        if (this.i.get() != null) {
            akvm akvmVar = (akvm) this.i.get();
            String str = i != 1 ? i != 2 ? "VERIFICATION_SUCCESS" : "VIDEO_STREAM_VERIFICATION_FAILURE" : "AUDIO_STREAM_VERIFICATION_FAILURE";
            if (i2 == 0) {
                throw null;
            }
            ((vpg) akvmVar.h.get()).b("VERIFY_ON_PLAYBACK_EXCEPTION", str, Integer.toString(i2 - 1), i3 != 1 ? i3 != 2 ? i3 != 3 ? "PLAYBACK_EXCEPTION_FMT_NONEAVAILABLE" : "PLAYBACK_EXCEPTION_OFFLINE_FMT_NONEAVAILABLE" : "PLAYBACK_EXCEPTION_NO_CONNECTION" : "PLAYBACK_EXCEPTION_UNKNOWN");
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                String str = ((agoa) obj).a;
                airr airrVar = (airr) this.d.get();
                if (airrVar == null || !airrVar.P() || !TextUtils.equals(airrVar.q(), str) || !this.h) {
                    return null;
                }
                airrVar.s();
                return null;
            } else if (i == 1) {
                apzg d = ((ahhm) obj).d();
                if (d == null) {
                    return null;
                }
                this.h = d.qn(attg.a);
                return null;
            } else if (i == 2) {
                final aikd aikdVar = (aikd) obj;
                final atqv atqvVar = this.b.a().g;
                if (atqvVar == null) {
                    atqvVar = atqv.a;
                }
                if (!atqvVar.n && !atqvVar.p) {
                    return null;
                }
                this.c.execute(new Runnable() { // from class: agkc
                    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
                    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 555
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.agkc.run():void");
                    }
                });
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{agoa.class, ahhm.class, aikd.class};
    }
}
