package defpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: arpm  reason: default package */
/* loaded from: classes2.dex */
public final class arpm implements btzi<dwbq, dwbs> {
    private static final long a = TimeUnit.MINUTES.toMillis(5);
    private static final long b = TimeUnit.SECONDS.toMillis(30);
    private final ckcw c;
    private final cqat d;
    @dzsi
    private final pez e;
    private final vxa f;
    private final btwd g;
    @dzsi
    private arpj h;
    @dzsi
    private arpk i = null;
    private long j;
    private final bumt k;

    public arpm(cqat cqatVar, ckcw ckcwVar, pez pezVar, bumt bumtVar, vxa vxaVar, btwd btwdVar) {
        dcdc.e();
        this.d = cqatVar;
        this.k = bumtVar;
        this.e = pezVar;
        this.c = ckcwVar;
        this.f = vxaVar;
        this.g = btwdVar;
    }

    private final synchronized void i(@dzsi dwbs dwbsVar, @dzsi bttq bttqVar) {
        arpj arpjVar = this.h;
        if (arpjVar == null) {
            return;
        }
        arpk arpkVar = this.i;
        this.i = null;
        if (arpkVar == null) {
            return;
        }
        arpjVar.b.c();
        if (dwbsVar == null) {
            dwbsVar = dwbs.d;
        }
        dwbs dwbsVar2 = dwbsVar;
        ckcq ckcqVar = arpkVar.b;
        if (bttqVar == null) {
            ckcqVar.b();
        }
        arpjVar.a.a(arpkVar.a, dwbsVar2, this.j, bttqVar);
    }

    @Override // defpackage.btzi
    public final synchronized void QY(btzr<dwbq> btzrVar, btzy btzyVar) {
        if (btzyVar.equals(btzy.d)) {
            return;
        }
        i(null, btzyVar.p);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwbq> btzrVar, dwbs dwbsVar) {
        f(dwbsVar);
    }

    public final synchronized void c(arpl arplVar, bvrj bvrjVar) {
        this.h = new arpj(arplVar, bvrjVar);
    }

    public final synchronized void d() {
        e();
        this.h = null;
    }

    public final synchronized void e() {
        btzc btzcVar;
        if (this.h != null) {
            arpk arpkVar = this.i;
            if (arpkVar != null && (btzcVar = arpkVar.c) != null) {
                btzcVar.a();
            }
            this.i = null;
        }
    }

    public final synchronized void f(dwbs dwbsVar) {
        i(dwbsVar, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad A[Catch: all -> 0x01ff, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000b, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x003b, B:16:0x0041, B:17:0x0046, B:19:0x004b, B:21:0x004f, B:26:0x0057, B:44:0x00cd, B:48:0x00df, B:50:0x00e3, B:51:0x00e5, B:53:0x00f4, B:54:0x00f6, B:56:0x00fa, B:57:0x00fc, B:59:0x010b, B:60:0x0110, B:62:0x012d, B:63:0x0132, B:65:0x014b, B:66:0x0150, B:67:0x016b, B:69:0x0180, B:70:0x0185, B:72:0x0197, B:74:0x01ac, B:75:0x01b1, B:76:0x01c0, B:32:0x006a, B:34:0x006e, B:35:0x0073, B:36:0x008c, B:38:0x0090, B:39:0x0095, B:40:0x00ad, B:42:0x00b1, B:43:0x00b6), top: B:84:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e3 A[Catch: all -> 0x01ff, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000b, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x003b, B:16:0x0041, B:17:0x0046, B:19:0x004b, B:21:0x004f, B:26:0x0057, B:44:0x00cd, B:48:0x00df, B:50:0x00e3, B:51:0x00e5, B:53:0x00f4, B:54:0x00f6, B:56:0x00fa, B:57:0x00fc, B:59:0x010b, B:60:0x0110, B:62:0x012d, B:63:0x0132, B:65:0x014b, B:66:0x0150, B:67:0x016b, B:69:0x0180, B:70:0x0185, B:72:0x0197, B:74:0x01ac, B:75:0x01b1, B:76:0x01c0, B:32:0x006a, B:34:0x006e, B:35:0x0073, B:36:0x008c, B:38:0x0090, B:39:0x0095, B:40:0x00ad, B:42:0x00b1, B:43:0x00b6), top: B:84:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f4 A[Catch: all -> 0x01ff, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000b, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x003b, B:16:0x0041, B:17:0x0046, B:19:0x004b, B:21:0x004f, B:26:0x0057, B:44:0x00cd, B:48:0x00df, B:50:0x00e3, B:51:0x00e5, B:53:0x00f4, B:54:0x00f6, B:56:0x00fa, B:57:0x00fc, B:59:0x010b, B:60:0x0110, B:62:0x012d, B:63:0x0132, B:65:0x014b, B:66:0x0150, B:67:0x016b, B:69:0x0180, B:70:0x0185, B:72:0x0197, B:74:0x01ac, B:75:0x01b1, B:76:0x01c0, B:32:0x006a, B:34:0x006e, B:35:0x0073, B:36:0x008c, B:38:0x0090, B:39:0x0095, B:40:0x00ad, B:42:0x00b1, B:43:0x00b6), top: B:84:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fa A[Catch: all -> 0x01ff, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000b, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x003b, B:16:0x0041, B:17:0x0046, B:19:0x004b, B:21:0x004f, B:26:0x0057, B:44:0x00cd, B:48:0x00df, B:50:0x00e3, B:51:0x00e5, B:53:0x00f4, B:54:0x00f6, B:56:0x00fa, B:57:0x00fc, B:59:0x010b, B:60:0x0110, B:62:0x012d, B:63:0x0132, B:65:0x014b, B:66:0x0150, B:67:0x016b, B:69:0x0180, B:70:0x0185, B:72:0x0197, B:74:0x01ac, B:75:0x01b1, B:76:0x01c0, B:32:0x006a, B:34:0x006e, B:35:0x0073, B:36:0x008c, B:38:0x0090, B:39:0x0095, B:40:0x00ad, B:42:0x00b1, B:43:0x00b6), top: B:84:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010b A[Catch: all -> 0x01ff, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000b, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x003b, B:16:0x0041, B:17:0x0046, B:19:0x004b, B:21:0x004f, B:26:0x0057, B:44:0x00cd, B:48:0x00df, B:50:0x00e3, B:51:0x00e5, B:53:0x00f4, B:54:0x00f6, B:56:0x00fa, B:57:0x00fc, B:59:0x010b, B:60:0x0110, B:62:0x012d, B:63:0x0132, B:65:0x014b, B:66:0x0150, B:67:0x016b, B:69:0x0180, B:70:0x0185, B:72:0x0197, B:74:0x01ac, B:75:0x01b1, B:76:0x01c0, B:32:0x006a, B:34:0x006e, B:35:0x0073, B:36:0x008c, B:38:0x0090, B:39:0x0095, B:40:0x00ad, B:42:0x00b1, B:43:0x00b6), top: B:84:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012d A[Catch: all -> 0x01ff, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000b, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x003b, B:16:0x0041, B:17:0x0046, B:19:0x004b, B:21:0x004f, B:26:0x0057, B:44:0x00cd, B:48:0x00df, B:50:0x00e3, B:51:0x00e5, B:53:0x00f4, B:54:0x00f6, B:56:0x00fa, B:57:0x00fc, B:59:0x010b, B:60:0x0110, B:62:0x012d, B:63:0x0132, B:65:0x014b, B:66:0x0150, B:67:0x016b, B:69:0x0180, B:70:0x0185, B:72:0x0197, B:74:0x01ac, B:75:0x01b1, B:76:0x01c0, B:32:0x006a, B:34:0x006e, B:35:0x0073, B:36:0x008c, B:38:0x0090, B:39:0x0095, B:40:0x00ad, B:42:0x00b1, B:43:0x00b6), top: B:84:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014b A[Catch: all -> 0x01ff, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000b, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x003b, B:16:0x0041, B:17:0x0046, B:19:0x004b, B:21:0x004f, B:26:0x0057, B:44:0x00cd, B:48:0x00df, B:50:0x00e3, B:51:0x00e5, B:53:0x00f4, B:54:0x00f6, B:56:0x00fa, B:57:0x00fc, B:59:0x010b, B:60:0x0110, B:62:0x012d, B:63:0x0132, B:65:0x014b, B:66:0x0150, B:67:0x016b, B:69:0x0180, B:70:0x0185, B:72:0x0197, B:74:0x01ac, B:75:0x01b1, B:76:0x01c0, B:32:0x006a, B:34:0x006e, B:35:0x0073, B:36:0x008c, B:38:0x0090, B:39:0x0095, B:40:0x00ad, B:42:0x00b1, B:43:0x00b6), top: B:84:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0180 A[Catch: all -> 0x01ff, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000b, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x003b, B:16:0x0041, B:17:0x0046, B:19:0x004b, B:21:0x004f, B:26:0x0057, B:44:0x00cd, B:48:0x00df, B:50:0x00e3, B:51:0x00e5, B:53:0x00f4, B:54:0x00f6, B:56:0x00fa, B:57:0x00fc, B:59:0x010b, B:60:0x0110, B:62:0x012d, B:63:0x0132, B:65:0x014b, B:66:0x0150, B:67:0x016b, B:69:0x0180, B:70:0x0185, B:72:0x0197, B:74:0x01ac, B:75:0x01b1, B:76:0x01c0, B:32:0x006a, B:34:0x006e, B:35:0x0073, B:36:0x008c, B:38:0x0090, B:39:0x0095, B:40:0x00ad, B:42:0x00b1, B:43:0x00b6), top: B:84:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0197 A[Catch: all -> 0x01ff, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000b, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x003b, B:16:0x0041, B:17:0x0046, B:19:0x004b, B:21:0x004f, B:26:0x0057, B:44:0x00cd, B:48:0x00df, B:50:0x00e3, B:51:0x00e5, B:53:0x00f4, B:54:0x00f6, B:56:0x00fa, B:57:0x00fc, B:59:0x010b, B:60:0x0110, B:62:0x012d, B:63:0x0132, B:65:0x014b, B:66:0x0150, B:67:0x016b, B:69:0x0180, B:70:0x0185, B:72:0x0197, B:74:0x01ac, B:75:0x01b1, B:76:0x01c0, B:32:0x006a, B:34:0x006e, B:35:0x0073, B:36:0x008c, B:38:0x0090, B:39:0x0095, B:40:0x00ad, B:42:0x00b1, B:43:0x00b6), top: B:84:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void g(defpackage.vul r10, defpackage.dqvj r11, @defpackage.dzsi defpackage.dspd r12, @defpackage.dzsi java.util.List<defpackage.dpjx> r13) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arpm.g(vul, dqvj, dspd, java.util.List):void");
    }

    public final synchronized void h(vul vulVar, dqvj dqvjVar, @dzsi List<dpjx> list) {
        g(vulVar, dqvjVar, null, list);
    }
}
