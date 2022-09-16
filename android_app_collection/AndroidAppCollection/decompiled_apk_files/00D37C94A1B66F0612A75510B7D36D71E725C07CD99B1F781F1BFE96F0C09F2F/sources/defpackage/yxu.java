package defpackage;

import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: yxu  reason: default package */
/* loaded from: classes4.dex */
public final class yxu implements Runnable {
    final /* synthetic */ yxv a;
    private final /* synthetic */ int b;

    public yxu(yxv yxvVar) {
        this.a = yxvVar;
    }

    public yxu(yxv yxvVar, int i) {
        this.b = i;
        this.a = yxvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            yxv yxvVar = this.a;
            ylr.b();
            ArrayList<String> arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            long c = yxvVar.d.c();
            yms b = yxvVar.b.b();
            while (b.hasNext()) {
                orz orzVar = (orz) b.next();
                yxt yxtVar = (yxt) yxvVar.a.get(orzVar.c);
                if (yxtVar == null) {
                    String valueOf = String.valueOf(orzVar.c);
                    zep.l(valueOf.length() != 0 ? "Missing task factory for task type: ".concat(valueOf) : new String("Missing task factory for task type: "));
                    arrayList.add(orzVar.c);
                } else {
                    yxtVar.a();
                    throw null;
                }
            }
            b.a();
            yxvVar.b.d();
            try {
                for (String str : arrayList) {
                    String.format(Locale.US, "Removing task %s", str);
                    yxvVar.b.n(str);
                }
                for (int i = 0; i < arrayList2.size(); i++) {
                    aopa mo52toBuilder = ((orz) arrayList2.get(i)).mo52toBuilder();
                    String.format(Locale.US, "Updating task %s", ((orz) mo52toBuilder.instance).c);
                    mo52toBuilder.copyOnWrite();
                    orz orzVar2 = (orz) mo52toBuilder.instance;
                    orzVar2.b |= 2;
                    orzVar2.d = ((orz) mo52toBuilder.instance).e + c;
                    orz orzVar3 = (orz) mo52toBuilder.mo39build();
                    arrayList2.set(i, orzVar3);
                    yxvVar.b.l(((orz) mo52toBuilder.instance).c, orzVar3);
                }
                yxvVar.b.i();
                return;
            } finally {
                yxvVar.b.f();
            }
        }
        yms b2 = this.a.b.b();
        while (b2.hasNext()) {
            orz orzVar4 = (orz) b2.next();
            yxv yxvVar2 = this.a;
            long max = Math.max(orzVar4.d - yxvVar2.d.c(), 0L);
            yxu yxuVar = new yxu(yxvVar2);
            if (orzVar4.e > 0) {
                String.format(Locale.US, "Scheduling task %s with ScheduledExecutorService for repeating execution.", orzVar4.c);
                yxvVar2.c.scheduleAtFixedRate(yxuVar, max, orzVar4.e, TimeUnit.MILLISECONDS);
            } else {
                String.format(Locale.US, "Scheduling task %s with ScheduledExecutorService for one time execution.", orzVar4.c);
                yxvVar2.c.schedule(yxuVar, max, TimeUnit.MILLISECONDS);
            }
        }
        b2.a();
    }
}
