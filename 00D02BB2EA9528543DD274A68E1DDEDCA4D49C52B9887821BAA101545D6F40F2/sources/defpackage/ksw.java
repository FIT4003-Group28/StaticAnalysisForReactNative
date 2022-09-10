package defpackage;

import android.content.Intent;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: ksw  reason: default package */
/* loaded from: classes.dex */
public final class ksw implements btph {
    private static final SimpleDateFormat a = new SimpleDateFormat("MM-dd HH:mm:ss.SSS");
    private final Queue<ksv> b = dcba.a(100);
    private final Queue<ksv> c = dcba.a(100);
    private final cqat d;

    public ksw(cqat cqatVar) {
        dbsk.s(cqatVar);
        this.d = cqatVar;
    }

    private static String d(long j) {
        return a.format(new Date(j));
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        bvrj.UI_THREAD.c();
        String d = d(this.d.b());
        StringBuilder sb = new StringBuilder(str.length() + 14 + String.valueOf(d).length());
        sb.append(str);
        sb.append("Intent log @ ");
        sb.append(d);
        sb.append(":");
        printWriter.println(sb.toString());
        for (ksv ksvVar : this.b) {
            String d2 = d(ksvVar.b());
            String uri = ksvVar.a().toUri(0);
            int length = str.length();
            StringBuilder sb2 = new StringBuilder(length + 5 + String.valueOf(d2).length() + String.valueOf(uri).length());
            sb2.append(str);
            sb2.append("  ");
            sb2.append(d2);
            sb2.append(" : ");
            sb2.append(uri);
            printWriter.println(sb2.toString());
        }
        if (!this.c.isEmpty()) {
            String d3 = d(this.d.b());
            StringBuilder sb3 = new StringBuilder(str.length() + 19 + String.valueOf(d3).length());
            sb3.append(str);
            sb3.append("Dropped Intents @ ");
            sb3.append(d3);
            sb3.append(":");
            printWriter.println(sb3.toString());
            for (ksv ksvVar2 : this.c) {
                String d4 = d(ksvVar2.b());
                String name = ksvVar2.c().b().name();
                String uri2 = ksvVar2.a().toUri(0);
                int length2 = str.length();
                int length3 = String.valueOf(d4).length();
                StringBuilder sb4 = new StringBuilder(length2 + 21 + length3 + String.valueOf(name).length() + String.valueOf(uri2).length());
                sb4.append(str);
                sb4.append("  ");
                sb4.append(d4);
                sb4.append(" : reason=");
                sb4.append(name);
                sb4.append(", intent=");
                sb4.append(uri2);
                printWriter.println(sb4.toString());
            }
        }
    }

    public final void a(Intent intent) {
        bvrj.UI_THREAD.c();
        Queue<ksv> queue = this.b;
        long b = this.d.b();
        dbsk.s(intent);
        queue.add(new ksg(intent, b, dbpy.a));
    }

    public final void b(Intent intent, kpt kptVar) {
        bvrj.UI_THREAD.c();
        this.c.add(new ksg(intent, this.d.b(), dbsg.i(kptVar)));
    }
}
