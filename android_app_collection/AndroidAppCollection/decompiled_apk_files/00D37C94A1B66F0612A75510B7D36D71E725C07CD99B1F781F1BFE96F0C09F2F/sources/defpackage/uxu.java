package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: uxu  reason: default package */
/* loaded from: classes4.dex */
public final class uxu implements uvo, uxj {
    public final Application a;
    public final axnm b;
    public final uvm c;
    public final uxy d;
    private final ankx e;
    private final uto f;
    private final boolean g;
    private final uxt h;

    public uxu() {
    }

    public uxu(uvn uvnVar, Context context, uxt uxtVar, ankx ankxVar, axnm axnmVar, uxy uxyVar, uto utoVar, azqb azqbVar, Executor executor) {
        this();
        new AtomicReference(uxm.a);
        new ConcurrentHashMap();
        this.h = uxtVar;
        this.f = utoVar;
        this.c = uvnVar.a(executor, axnmVar, azqbVar);
        this.a = (Application) context;
        this.e = ankxVar;
        this.b = axnmVar;
        this.d = uxyVar;
        Boolean bool = Boolean.FALSE;
        bool.getClass();
        this.g = bool.booleanValue();
    }

    public static boolean d(int i) {
        return i != 1;
    }

    @Override // defpackage.uvo, defpackage.ver
    public final void a() {
        if (this.g) {
            c();
        }
    }

    @Override // defpackage.uxj
    public final synchronized void b(String str) {
        aqxo.p(true);
        e(str, false, 1, null);
    }

    public final void c() {
        this.h.a = new uxs() { // from class: uxv
            @Override // defpackage.uxs
            public final void a(int i, String str) {
                uxu.this.e(null, true, i, str);
            }
        };
    }

    public final void e(final String str, final boolean z, final int i, final String str2) {
        if (this.f.b) {
            anlz.o();
        } else {
            anlz.v(new aniq() { // from class: uxw
                @Override // defpackage.aniq
                public final ankt a() {
                    long a;
                    uxu uxuVar = uxu.this;
                    int i2 = i;
                    String str3 = str;
                    boolean z2 = z;
                    String str4 = str2;
                    uxl uxlVar = (uxl) uxuVar.b.get();
                    if (uxu.d(i2)) {
                        int i3 = uxlVar.f;
                        a = -1;
                    } else {
                        a = uxuVar.c.a(str3);
                    }
                    if (a == -1) {
                        return ankq.a;
                    }
                    if (uxlVar.c) {
                        System.gc();
                        System.runFinalization();
                        System.gc();
                    }
                    ampq ampqVar = uxlVar.b;
                    if (!uxlVar.a) {
                        aopa createBuilder = baax.a.createBuilder();
                        azzq b = uxuVar.d.b(i2, Process.myPid(), null, str4);
                        createBuilder.copyOnWrite();
                        baax baaxVar = (baax) createBuilder.instance;
                        b.getClass();
                        baaxVar.c = b;
                        baaxVar.b |= 1;
                        uvi a2 = uvj.a();
                        a2.a = str3;
                        a2.b(z2);
                        a2.d = Long.valueOf(a);
                        a2.d((baax) createBuilder.mo39build());
                        a2.b = null;
                        if (uxu.d(i2)) {
                            a2.c(true);
                        }
                        return uxuVar.c.b(a2.a());
                    }
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = uul.a(uxuVar.a).getRunningAppProcesses();
                    if (runningAppProcesses == null) {
                        return ankq.a;
                    }
                    ArrayList arrayList = new ArrayList(runningAppProcesses.size());
                    String packageName = uxuVar.a.getPackageName();
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        if (Build.VERSION.SDK_INT > 22 || runningAppProcessInfo.processName.contains(packageName)) {
                            aopa createBuilder2 = baax.a.createBuilder();
                            azzq b2 = uxuVar.d.b(i2, runningAppProcessInfo.pid, runningAppProcessInfo.processName, str4);
                            createBuilder2.copyOnWrite();
                            baax baaxVar2 = (baax) createBuilder2.instance;
                            b2.getClass();
                            baaxVar2.c = b2;
                            baaxVar2.b |= 1;
                            uvi a3 = uvj.a();
                            a3.a = str3;
                            a3.b(z2);
                            a3.d = Long.valueOf(a);
                            a3.d((baax) createBuilder2.mo39build());
                            a3.b = null;
                            if (uxu.d(i2)) {
                                a3.c(true);
                            }
                            arrayList.add(uxuVar.c.b(a3.a()));
                        }
                    }
                    return anlz.l(arrayList).a(almu.o(), anjk.a);
                }
            }, this.e);
        }
    }
}
