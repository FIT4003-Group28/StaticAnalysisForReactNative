package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: beb  reason: default package */
/* loaded from: classes3.dex */
public final class beb implements Runnable {
    final /* synthetic */ bef a;

    public beb(bef befVar) {
        this.a = befVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bef befVar;
        bee beeVar;
        synchronized (this.a.f) {
            bef befVar2 = this.a;
            befVar2.g = befVar2.f.get(0);
        }
        Intent intent = this.a.g;
        if (intent != null) {
            String action = intent.getAction();
            int intExtra = this.a.g.getIntExtra("KEY_START_ID", 0);
            bbz e = bbz.e();
            Integer valueOf = Integer.valueOf(intExtra);
            e.a(new Throwable[0]);
            PowerManager.WakeLock a = bhl.a(this.a.a, String.format("%s (%s)", action, valueOf));
            try {
                bbz.e().a(new Throwable[0]);
                a.acquire();
                bef befVar3 = this.a;
                bdw bdwVar = befVar3.e;
                Intent intent2 = befVar3.g;
                String action2 = intent2.getAction();
                if ("ACTION_CONSTRAINTS_CHANGED".equals(action2)) {
                    bbz.e().a(new Throwable[0]);
                    bdz bdzVar = new bdz(bdwVar.a, intExtra, befVar3);
                    List<bgh> l = bdzVar.c.d.c.t().l();
                    bdx.a(bdzVar.a, l);
                    bdzVar.d.a(l);
                    ArrayList arrayList = new ArrayList(l.size());
                    long currentTimeMillis = System.currentTimeMillis();
                    for (bgh bghVar : l) {
                        String str = bghVar.a;
                        if (currentTimeMillis >= bghVar.d() && (!bghVar.e() || bdzVar.d.c(str))) {
                            arrayList.add(bghVar);
                        }
                    }
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        Intent c = bdw.c(bdzVar.a, ((bgh) arrayList.get(i)).a);
                        bbz.e().a(new Throwable[0]);
                        bef befVar4 = bdzVar.c;
                        befVar4.c(new bec(befVar4, c, bdzVar.b));
                    }
                    bdzVar.d.b();
                } else if ("ACTION_RESCHEDULE".equals(action2)) {
                    bbz.e().a(new Throwable[0]);
                    befVar3.d.l();
                } else {
                    Bundle extras = intent2.getExtras();
                    String[] strArr = {"KEY_WORKSPEC_ID"};
                    if (extras != null && !extras.isEmpty() && extras.get(strArr[0]) != null) {
                        if ("ACTION_SCHEDULE_WORK".equals(action2)) {
                            String string = intent2.getExtras().getString("KEY_WORKSPEC_ID");
                            bbz.e().a(new Throwable[0]);
                            WorkDatabase workDatabase = befVar3.d.c;
                            workDatabase.F();
                            bgh c2 = workDatabase.t().c(string);
                            if (c2 == null) {
                                bbz.e();
                                String str2 = "Skipping scheduling " + string + " because it's no longer in the DB";
                            } else if (bck.b(c2.p)) {
                                bbz.e();
                                String str3 = "Skipping scheduling " + string + "because it is finished.";
                            } else {
                                long d = c2.d();
                                if (!c2.e()) {
                                    bbz.e().a(new Throwable[0]);
                                    bdv.a(bdwVar.a, befVar3.d, string, d);
                                } else {
                                    bbz.e().a(new Throwable[0]);
                                    bdv.a(bdwVar.a, befVar3.d, string, d);
                                    befVar3.c(new bec(befVar3, bdw.e(bdwVar.a), intExtra));
                                }
                                workDatabase.l();
                            }
                            workDatabase.k();
                        } else if ("ACTION_DELAY_MET".equals(action2)) {
                            Bundle extras2 = intent2.getExtras();
                            synchronized (bdwVar.c) {
                                String string2 = extras2.getString("KEY_WORKSPEC_ID");
                                bbz.e().a(new Throwable[0]);
                                if (!bdwVar.b.containsKey(string2)) {
                                    bea beaVar = new bea(bdwVar.a, intExtra, string2, befVar3);
                                    bdwVar.b.put(string2, beaVar);
                                    beaVar.f = bhl.a(beaVar.a, String.format("%s (%s)", beaVar.c, Integer.valueOf(beaVar.b)));
                                    bbz.e().a(new Throwable[0]);
                                    beaVar.f.acquire();
                                    bgh c3 = beaVar.d.d.c.t().c(beaVar.c);
                                    if (c3 == null) {
                                        beaVar.b();
                                    } else {
                                        boolean e2 = c3.e();
                                        beaVar.g = e2;
                                        if (!e2) {
                                            bbz.e().a(new Throwable[0]);
                                            beaVar.Ni(Collections.singletonList(beaVar.c));
                                        } else {
                                            beaVar.e.a(Collections.singletonList(c3));
                                        }
                                    }
                                } else {
                                    bbz.e().a(new Throwable[0]);
                                }
                            }
                        } else if ("ACTION_STOP_WORK".equals(action2)) {
                            String string3 = intent2.getExtras().getString("KEY_WORKSPEC_ID");
                            bbz.e().a(new Throwable[0]);
                            befVar3.d.k(string3);
                            bdv.b(bdwVar.a, befVar3.d, string3);
                            befVar3.a(string3, false);
                        } else if ("ACTION_EXECUTION_COMPLETED".equals(action2)) {
                            Bundle extras3 = intent2.getExtras();
                            String string4 = extras3.getString("KEY_WORKSPEC_ID");
                            boolean z = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
                            bbz.e().a(new Throwable[0]);
                            bdwVar.a(string4, z);
                        } else {
                            bbz.e();
                        }
                    }
                    bbz.e().b(new Throwable[0]);
                }
                bbz.e().a(new Throwable[0]);
                a.release();
                befVar = this.a;
                beeVar = new bee(befVar);
            } catch (Throwable th) {
                try {
                    bbz.e().b(th);
                    bbz.e().a(new Throwable[0]);
                    a.release();
                    befVar = this.a;
                    beeVar = new bee(befVar);
                } catch (Throwable th2) {
                    bbz.e().a(new Throwable[0]);
                    a.release();
                    bef befVar5 = this.a;
                    befVar5.c(new bee(befVar5));
                    throw th2;
                }
            }
            befVar.c(beeVar);
        }
    }
}
