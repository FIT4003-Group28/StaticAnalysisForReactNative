package defpackage;

import java.util.Iterator;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: acwj  reason: default package */
/* loaded from: classes.dex */
public final class acwj {
    public static final String[] a = {"app_l", "shell_OnCreate", "uiwwa_c", "uiwwa_s", "uiwwa_r", "critical", "intentCritical", "nonCritical", "th0", "brn", "ebrn", "brp"};

    public static asnr a(String str, yxj yxjVar, Queue queue) {
        String str2;
        Throwable th = yxjVar.g;
        String b = b(yxjVar);
        if (th != null) {
            afus.c(2, 18, String.format("SS %s %s", str, b), th);
        }
        long j = yxjVar.b - yxjVar.a;
        long j2 = yxjVar.c;
        long j3 = yxjVar.d;
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                yxj yxjVar2 = (yxj) it.next();
                if (yxjVar2.h == 2 && yxjVar2.g == null) {
                    str2 = b;
                    j += yxjVar2.b - yxjVar2.a;
                    j2 += yxjVar2.c;
                    j3 += yxjVar2.d;
                } else {
                    str2 = b;
                }
                b = str2;
            }
        }
        String str3 = b;
        aopa createBuilder = asnr.a.createBuilder();
        createBuilder.copyOnWrite();
        asnr asnrVar = (asnr) createBuilder.instance;
        str.getClass();
        asnrVar.b |= 1;
        asnrVar.c = str;
        long j4 = yxjVar.a;
        createBuilder.copyOnWrite();
        asnr asnrVar2 = (asnr) createBuilder.instance;
        asnrVar2.b |= 8;
        asnrVar2.f = j4;
        createBuilder.copyOnWrite();
        asnr asnrVar3 = (asnr) createBuilder.instance;
        asnrVar3.b |= 4;
        asnrVar3.e = j;
        createBuilder.copyOnWrite();
        asnr asnrVar4 = (asnr) createBuilder.instance;
        asnrVar4.b |= 128;
        asnrVar4.j = j2;
        if (j3 > 0) {
            createBuilder.copyOnWrite();
            asnr asnrVar5 = (asnr) createBuilder.instance;
            asnrVar5.b |= 256;
            asnrVar5.k = j3;
        }
        if (th != null) {
            createBuilder.copyOnWrite();
            asnr asnrVar6 = (asnr) createBuilder.instance;
            asnrVar6.l = 1;
            asnrVar6.b |= 512;
            Object[] objArr = new Object[3];
            int i = yxjVar.h;
            objArr[0] = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "ACTION" : "SPAN" : "DEPENDENCY" : "SPAWN" : "TASK";
            objArr[1] = str;
            objArr[2] = str3;
            afus.c(2, 18, String.format("SS task %s error %s %s", objArr), th);
        }
        return (asnr) createBuilder.mo39build();
    }

    public static String b(yxj yxjVar) {
        return yxjVar.f != -1 ? a[yxjVar.f] : yxjVar.e;
    }
}
