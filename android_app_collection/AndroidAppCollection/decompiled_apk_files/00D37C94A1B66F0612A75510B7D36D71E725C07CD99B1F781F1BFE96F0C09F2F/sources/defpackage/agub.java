package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: agub  reason: default package */
/* loaded from: classes.dex */
public final class agub {
    private static final long a = TimeUnit.SECONDS.toMillis(5);
    private final azqb b;
    private final agua c;
    private final Executor d;
    private final yzj e;
    private final aadd f;
    private final axwu g;
    private final jjt h;

    public agub(ScheduledExecutorService scheduledExecutorService, azqb azqbVar, agua aguaVar, yzj yzjVar, jjt jjtVar, aadd aaddVar, axwu axwuVar) {
        this.d = scheduledExecutorService;
        this.b = azqbVar;
        this.c = aguaVar;
        this.e = yzjVar;
        this.h = jjtVar;
        this.f = aaddVar;
        this.g = axwuVar;
    }

    private final agpu d(String str) {
        try {
            ampq ampqVar = (ampq) e().m().h(str).get(a, TimeUnit.MILLISECONDS);
            if (!ampqVar.h()) {
                return null;
            }
            return (agpu) ampqVar.c();
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return null;
        }
    }

    private final agvx e() {
        return ((agrf) this.b.get()).a();
    }

    public final ankt a(final PlaybackStartDescriptor playbackStartDescriptor) {
        final yix c = yix.c();
        this.d.execute(new Runnable() { // from class: agtz
            @Override // java.lang.Runnable
            public final void run() {
                agub.this.c(playbackStartDescriptor, c);
            }
        });
        return c;
    }

    public final ankt b(final PlaybackStartDescriptor playbackStartDescriptor) {
        final yix c = yix.c();
        this.d.execute(new Runnable() { // from class: agty
            @Override // java.lang.Runnable
            public final void run() {
                agub.this.c(playbackStartDescriptor, c);
            }
        });
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019e A[Catch: agop -> 0x026a, agos -> 0x026c, Exception -> 0x026e, TryCatch #1 {Exception -> 0x026e, blocks: (B:14:0x0021, B:16:0x004b, B:19:0x0053, B:21:0x005b, B:23:0x0063, B:25:0x0071, B:29:0x0098, B:31:0x009e, B:33:0x00a6, B:35:0x00b6, B:37:0x00bc, B:38:0x00c9, B:40:0x00cf, B:42:0x00dd, B:43:0x00f4, B:45:0x00fa, B:47:0x010e, B:50:0x0115, B:51:0x0135, B:52:0x013f, B:69:0x019e, B:71:0x01a8, B:81:0x01e8, B:110:0x0253, B:85:0x01f1, B:86:0x01f6, B:88:0x01f9, B:90:0x01ff, B:92:0x020b, B:93:0x020d, B:95:0x0216, B:97:0x0222, B:99:0x022c, B:101:0x0236, B:105:0x0246, B:108:0x024d, B:109:0x0252, B:102:0x023b, B:103:0x0240, B:104:0x0241, B:111:0x0260, B:112:0x0265, B:72:0x01b1, B:74:0x01c5, B:76:0x01cb, B:78:0x01de, B:113:0x0266, B:55:0x0146, B:56:0x0179, B:57:0x017e, B:58:0x017f, B:59:0x0184, B:60:0x0185, B:61:0x018a, B:62:0x018b, B:63:0x0190, B:65:0x0193, B:66:0x0198), top: B:134:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor r18, defpackage.yiw r19) {
        /*
            Method dump skipped, instructions count: 851
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agub.c(com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor, yiw):void");
    }
}
