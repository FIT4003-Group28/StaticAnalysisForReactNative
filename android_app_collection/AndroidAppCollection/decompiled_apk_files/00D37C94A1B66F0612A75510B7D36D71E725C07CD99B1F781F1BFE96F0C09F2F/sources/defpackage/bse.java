package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bse  reason: default package */
/* loaded from: classes2.dex */
public final class bse implements Runnable {
    final /* synthetic */ bsi a;

    public bse(bsi bsiVar) {
        this.a = bsiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bsi bsiVar;
        bsh bshVar;
        synchronized (this.a.g) {
            bsi bsiVar2 = this.a;
            bsiVar2.h = (Intent) bsiVar2.g.get(0);
        }
        Intent intent = this.a.h;
        if (intent != null) {
            String action = intent.getAction();
            int intExtra = this.a.h.getIntExtra("KEY_START_ID", 0);
            bqf a = bqf.a();
            Integer valueOf = Integer.valueOf(intExtra);
            String.format("Processing command %s, %s", this.a.h, valueOf);
            a.d(new Throwable[0]);
            PowerManager.WakeLock a2 = bvq.a(this.a.b, String.format("%s (%s)", action, valueOf));
            try {
                bqf a3 = bqf.a();
                String.format("Acquiring operation wake lock (%s) %s", action, a2);
                a3.d(new Throwable[0]);
                a2.acquire();
                bsi bsiVar3 = this.a;
                brz brzVar = bsiVar3.f;
                Intent intent2 = bsiVar3.h;
                String action2 = intent2.getAction();
                if ("ACTION_CONSTRAINTS_CHANGED".equals(action2)) {
                    bqf a4 = bqf.a();
                    String.format("Handling constraints changed %s", intent2);
                    a4.d(new Throwable[0]);
                    int i = bsc.a;
                    Context context = brzVar.b;
                    bsp bspVar = new bsp(context, bsiVar3.j, null);
                    List<bum> c = bsiVar3.e.d.n().c();
                    bsa.a(context, c);
                    bspVar.a(c);
                    ArrayList arrayList = new ArrayList(c.size());
                    long currentTimeMillis = System.currentTimeMillis();
                    for (bum bumVar : c) {
                        String str = bumVar.c;
                        if (currentTimeMillis >= bumVar.a() && (!bumVar.c() || bspVar.c(str))) {
                            arrayList.add(bumVar);
                        }
                    }
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        String str2 = ((bum) arrayList.get(i2)).c;
                        Intent c2 = brz.c(context, str2);
                        bqf a5 = bqf.a();
                        String.format("Creating a delay_met command for workSpec with id (%s)", str2);
                        a5.d(new Throwable[0]);
                        bsiVar3.d(new bsf(bsiVar3, c2, intExtra));
                    }
                    bspVar.b();
                } else if (!"ACTION_RESCHEDULE".equals(action2)) {
                    Bundle extras = intent2.getExtras();
                    String[] strArr = {"KEY_WORKSPEC_ID"};
                    if (extras != null && !extras.isEmpty()) {
                        for (int i3 = 0; i3 <= 0; i3++) {
                            if (extras.get(strArr[i3]) != null) {
                            }
                        }
                        if ("ACTION_SCHEDULE_WORK".equals(action2)) {
                            String string = intent2.getExtras().getString("KEY_WORKSPEC_ID");
                            bqf a6 = bqf.a();
                            String.format("Handling schedule work for %s", string);
                            a6.d(new Throwable[0]);
                            WorkDatabase workDatabase = bsiVar3.e.d;
                            workDatabase.f();
                            bum a7 = workDatabase.n().a(string);
                            if (a7 == null) {
                                bqf.a();
                                String str3 = brz.a;
                                bqf.g(str3, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                            } else if (adz.e(a7.r)) {
                                bqf.a();
                                String str4 = brz.a;
                                bqf.g(str4, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                            } else {
                                long a8 = a7.a();
                                if (!a7.c()) {
                                    bqf a9 = bqf.a();
                                    String.format("Setting up Alarms for %s at %s", string, Long.valueOf(a8));
                                    a9.d(new Throwable[0]);
                                    bry.b(brzVar.b, bsiVar3.e, string, a8);
                                } else {
                                    bqf a10 = bqf.a();
                                    String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(a8));
                                    a10.d(new Throwable[0]);
                                    bry.b(brzVar.b, bsiVar3.e, string, a8);
                                    bsiVar3.d(new bsf(bsiVar3, brz.b(brzVar.b), intExtra));
                                }
                                workDatabase.h();
                            }
                            workDatabase.g();
                        } else if ("ACTION_DELAY_MET".equals(action2)) {
                            Bundle extras2 = intent2.getExtras();
                            synchronized (brzVar.d) {
                                String string2 = extras2.getString("KEY_WORKSPEC_ID");
                                bqf a11 = bqf.a();
                                String.format("Handing delay met for %s", string2);
                                a11.d(new Throwable[0]);
                                if (!brzVar.c.containsKey(string2)) {
                                    bsd bsdVar = new bsd(brzVar.b, intExtra, string2, bsiVar3);
                                    brzVar.c.put(string2, bsdVar);
                                    bsdVar.f = bvq.a(bsdVar.a, String.format("%s (%s)", bsdVar.c, Integer.valueOf(bsdVar.b)));
                                    bqf a12 = bqf.a();
                                    String.format("Acquiring wakelock %s for WorkSpec %s", bsdVar.f, bsdVar.c);
                                    a12.d(new Throwable[0]);
                                    bsdVar.f.acquire();
                                    bum a13 = bsdVar.d.e.d.n().a(bsdVar.c);
                                    if (a13 == null) {
                                        bsdVar.c();
                                    } else {
                                        boolean c3 = a13.c();
                                        bsdVar.g = c3;
                                        if (!c3) {
                                            bqf a14 = bqf.a();
                                            String.format("No constraints for %s", bsdVar.c);
                                            a14.d(new Throwable[0]);
                                            bsdVar.e(Collections.singletonList(bsdVar.c));
                                        } else {
                                            bsdVar.e.a(Collections.singletonList(a13));
                                        }
                                    }
                                } else {
                                    bqf a15 = bqf.a();
                                    String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string2);
                                    a15.d(new Throwable[0]);
                                }
                            }
                        } else if ("ACTION_STOP_WORK".equals(action2)) {
                            String string3 = intent2.getExtras().getString("KEY_WORKSPEC_ID");
                            bqf a16 = bqf.a();
                            String.format("Handing stopWork work for %s", string3);
                            a16.d(new Throwable[0]);
                            bsiVar3.e.l(string3);
                            bry.a(brzVar.b, bsiVar3.e, string3);
                            bsiVar3.a(string3, false);
                        } else if ("ACTION_EXECUTION_COMPLETED".equals(action2)) {
                            Bundle extras3 = intent2.getExtras();
                            String string4 = extras3.getString("KEY_WORKSPEC_ID");
                            boolean z = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
                            bqf a17 = bqf.a();
                            String.format("Handling onExecutionCompleted %s, %s", intent2, Integer.valueOf(intExtra));
                            a17.d(new Throwable[0]);
                            brzVar.a(string4, z);
                        } else {
                            bqf.a();
                            bqf.g(brz.a, String.format("Ignoring intent %s", intent2), new Throwable[0]);
                        }
                    }
                    bqf.a();
                    bqf.e(brz.a, String.format("Invalid request for %s, requires %s.", action2, "KEY_WORKSPEC_ID"), new Throwable[0]);
                    break;
                } else {
                    bqf a18 = bqf.a();
                    String.format("Handling reschedule %s, %s", intent2, valueOf);
                    a18.d(new Throwable[0]);
                    bsiVar3.e.j();
                }
                bqf a19 = bqf.a();
                String.format("Releasing operation wake lock (%s) %s", action, a2);
                a19.d(new Throwable[0]);
                a2.release();
                bsiVar = this.a;
                bshVar = new bsh(bsiVar);
            } catch (Throwable th) {
                try {
                    bqf.a();
                    bqf.e(bsi.a, "Unexpected error in onHandleIntent", th);
                    bqf a20 = bqf.a();
                    String.format("Releasing operation wake lock (%s) %s", action, a2);
                    a20.d(new Throwable[0]);
                    a2.release();
                    bsiVar = this.a;
                    bshVar = new bsh(bsiVar);
                } catch (Throwable th2) {
                    bqf a21 = bqf.a();
                    String.format("Releasing operation wake lock (%s) %s", action, a2);
                    a21.d(new Throwable[0]);
                    a2.release();
                    bsi bsiVar4 = this.a;
                    bsiVar4.d(new bsh(bsiVar4));
                    throw th2;
                }
            }
            bsiVar.d(bshVar);
        }
    }
}
