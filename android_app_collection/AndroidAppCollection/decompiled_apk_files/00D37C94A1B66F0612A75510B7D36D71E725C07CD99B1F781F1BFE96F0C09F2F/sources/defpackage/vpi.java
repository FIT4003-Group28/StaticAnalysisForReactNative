package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vpi  reason: default package */
/* loaded from: classes4.dex */
public abstract class vpi {
    public final Object a;
    public final String b;
    public final vpf[] c;
    Map d;
    public int e;
    private final vpk f;
    private boolean g = true;

    public vpi(String str, vpk vpkVar, vpf... vpfVarArr) {
        int i = 1;
        int length = vpfVarArr.length;
        i = length > 0 ? 10 : i;
        this.b = str;
        this.c = vpfVarArr;
        HashMap hashMap = new HashMap(i);
        this.d = hashMap;
        if (length == 0) {
            hashMap.put(voy.b, a());
        }
        this.e = 0;
        this.f = vpkVar;
        this.a = new Object();
    }

    public abstract voz a();

    public final void c() {
        this.g = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d(Object obj, voy voyVar) {
        synchronized (this.a) {
            voz vozVar = (voz) this.d.get(voyVar);
            if (vozVar == null) {
                vozVar = a();
                this.d.put(voyVar, vozVar);
            }
            vozVar.b(obj);
            this.e++;
        }
        vpj vpjVar = ((vpl) this.f).a;
        if (vpjVar != null) {
            vpq vpqVar = (vpq) vpjVar;
            if (!vpqVar.e) {
                return;
            }
            if (vpqVar.c > 0 && vpqVar.f.incrementAndGet() >= vpqVar.c) {
                synchronized (vpqVar.h) {
                    if (((vpq) vpjVar).f.get() >= ((vpq) vpjVar).c) {
                        synchronized (((vpq) vpjVar).h) {
                            ScheduledFuture scheduledFuture = ((vpq) vpjVar).g;
                            if (scheduledFuture != null && !scheduledFuture.isDone() && !((vpq) vpjVar).g.isCancelled()) {
                                if (((vpq) vpjVar).g.getDelay(TimeUnit.MILLISECONDS) > 100) {
                                    ((vpq) vpjVar).b();
                                    final vpq vpqVar2 = (vpq) vpjVar;
                                    ((vpq) vpjVar).g = ((vpq) vpjVar).a.schedule(new Runnable() { // from class: vpp
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            vpq.this.c();
                                        }
                                    }, 1L, TimeUnit.MILLISECONDS);
                                }
                            }
                            final vpq vpqVar3 = (vpq) vpjVar;
                            ((vpq) vpjVar).g = ((vpq) vpjVar).a.schedule(new Runnable() { // from class: vpp
                                @Override // java.lang.Runnable
                                public final void run() {
                                    vpq.this.c();
                                }
                            }, 1L, TimeUnit.MILLISECONDS);
                        }
                        return;
                    }
                }
            }
            synchronized (vpqVar.h) {
                ScheduledFuture scheduledFuture2 = ((vpq) vpjVar).g;
                if (scheduledFuture2 == null || scheduledFuture2.isDone() || ((vpq) vpjVar).g.isCancelled()) {
                    final vpq vpqVar4 = (vpq) vpjVar;
                    ((vpq) vpjVar).g = ((vpq) vpjVar).a.schedule(new Runnable() { // from class: vpp
                        @Override // java.lang.Runnable
                        public final void run() {
                            vpq.this.c();
                        }
                    }, ((vpq) vpjVar).d, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(Object... objArr) {
        aqxo.p(this.c.length == objArr.length);
        if (this.g) {
            for (int i = 0; i < objArr.length; i++) {
                Object obj = objArr[i];
                if (obj != null) {
                    if (!this.c[i].b.isInstance(obj)) {
                        String str = this.b;
                        String valueOf = String.valueOf(obj);
                        String valueOf2 = String.valueOf(obj.getClass());
                        vpf vpfVar = this.c[i];
                        String str2 = vpfVar.a;
                        String valueOf3 = String.valueOf(vpfVar.b);
                        int length = str.length();
                        int length2 = String.valueOf(valueOf).length();
                        StringBuilder sb = new StringBuilder(length + 92 + length2 + String.valueOf(valueOf2).length() + str2.length() + String.valueOf(valueOf3).length());
                        sb.append("Streamz ");
                        sb.append(str);
                        sb.append(" has parameter {index: ");
                        sb.append(i);
                        sb.append(", value: ");
                        sb.append(valueOf);
                        sb.append(", type: ");
                        sb.append(valueOf2);
                        sb.append("}, but expected: {name: ");
                        sb.append(str2);
                        sb.append(", type: ");
                        sb.append(valueOf3);
                        sb.append("}");
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else {
                    String str3 = this.b;
                    String arrays = Arrays.toString(objArr);
                    StringBuilder sb2 = new StringBuilder(str3.length() + 29 + String.valueOf(arrays).length());
                    sb2.append("Streamz ");
                    sb2.append(str3);
                    sb2.append(" has null parameter: ");
                    sb2.append(arrays);
                    throw new NullPointerException(sb2.toString());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(vpf... vpfVarArr) {
        if (Arrays.equals(this.c, vpfVarArr)) {
            return;
        }
        String str = this.b;
        String arrays = Arrays.toString(this.c);
        String arrays2 = Arrays.toString(vpfVarArr);
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 32 + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
        sb.append("Streamz ");
        sb.append(str);
        sb.append(" with field diffs: ");
        sb.append(arrays);
        sb.append(" and ");
        sb.append(arrays2);
        throw new vpo(sb.toString());
    }
}
