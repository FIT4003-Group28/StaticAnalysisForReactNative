package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: ajte  reason: default package */
/* loaded from: classes.dex */
public final class ajte extends zn {
    public final Handler a;
    public final ajtb b;
    public final ajtb c;
    public final ajtb d;
    public final ajtb e;
    public final ajtb f;
    private final List g;
    private final ajst l;

    public ajte() {
        this(new ajst());
    }

    private static ajru y(yo yoVar) {
        if (yoVar instanceof ajrz) {
            return ((ajrz) yoVar).t;
        }
        return akel.g(yoVar.a);
    }

    private final void z(ajtb ajtbVar) {
        ArrayList arrayList = new ArrayList(ajtbVar.a);
        ajtbVar.b.addAll(ajtbVar.a);
        ajtbVar.a.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ajsr ajsrVar = (ajsr) arrayList.get(i);
            if (ajsrVar instanceof ajso) {
                long j = ((ajso) ajsrVar).j();
                if (j > 0) {
                    Handler handler = this.a;
                    handler.sendMessageDelayed(handler.obtainMessage(ajtbVar.d, ajsrVar), j);
                }
            }
            ajsrVar.b();
        }
    }

    public final void a() {
        if (!j()) {
            m();
        }
    }

    @Override // defpackage.xs
    public final void b(yo yoVar) {
        for (ajtb ajtbVar : this.g) {
            ajtc ajtcVar = (ajtc) ajtbVar.c.get(yoVar);
            if (ajtcVar != null) {
                ajtbVar.a.remove(ajtcVar.a);
                ajtbVar.b.remove(ajtcVar.a);
                for (yo yoVar2 : ajtcVar.b) {
                    ajtbVar.c.remove(yoVar2);
                }
                this.a.removeMessages(ajtbVar.d, ajtcVar.a);
                if (!ajtcVar.c) {
                    ajtcVar.c = true;
                    ajtcVar.a.a();
                }
            }
        }
    }

    @Override // defpackage.xs
    public final void c() {
        for (ajtb ajtbVar : this.g) {
            ArrayDeque<ajsr> arrayDeque = new ArrayDeque();
            arrayDeque.addAll(ajtbVar.a);
            arrayDeque.addAll(ajtbVar.b);
            ajtbVar.a.clear();
            ajtbVar.b.clear();
            ajtbVar.c.clear();
            for (ajsr ajsrVar : arrayDeque) {
                ajsrVar.a();
            }
            this.a.removeMessages(ajtbVar.d);
        }
    }

    @Override // defpackage.xs
    public final void d() {
        z(this.c);
        z(this.e);
        if (k(this.c) || k(this.e)) {
            return;
        }
        z(this.d);
        if (k(this.d)) {
            return;
        }
        z(this.b);
        z(this.f);
    }

    @Override // defpackage.zn
    public final boolean e(final yo yoVar) {
        ajru y;
        Long l;
        final ajtr ajtrVar = (ajtr) ajst.a(this.l.a, yoVar);
        if (ajtrVar == null || (y = y(yoVar)) == null) {
            l(yoVar);
            return false;
        }
        ajsp ajspVar = new ajsp();
        ajspVar.a = y;
        ajspVar.b = Long.valueOf(this.h);
        ajspVar.c = new ajsy(3);
        ajspVar.d = new Runnable() { // from class: ajsv
            @Override // java.lang.Runnable
            public final void run() {
                ajte ajteVar = ajte.this;
                ajtr ajtrVar2 = ajtrVar;
                yo yoVar2 = yoVar;
                ajteVar.b.a.remove(ajtrVar2);
                ajteVar.b.b.remove(ajtrVar2);
                ajteVar.b.c.remove(yoVar2);
                ajteVar.l(yoVar2);
                ajteVar.a();
            }
        };
        ajru ajruVar = ajspVar.a;
        if (ajruVar == null || (l = ajspVar.b) == null || ajspVar.c == null || ajspVar.d == null) {
            StringBuilder sb = new StringBuilder();
            if (ajspVar.a == null) {
                sb.append(" presenter");
            }
            if (ajspVar.b == null) {
                sb.append(" duration");
            }
            if (ajspVar.c == null) {
                sb.append(" onStart");
            }
            if (ajspVar.d == null) {
                sb.append(" onEnd");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        ajtrVar.a = new ajsq(ajruVar, l.longValue(), ajspVar.c, ajspVar.d);
        ajtrVar.a.a.a().setAlpha(0.0f);
        b(yoVar);
        this.b.a.add(ajtrVar);
        this.b.c.put(yoVar, new ajtc(ajtrVar, yoVar));
        return true;
    }

    @Override // defpackage.zn
    public final boolean f(yo yoVar, yo yoVar2, int i, int i2, int i3, int i4) {
        ajtb ajtbVar;
        if (yoVar == yoVar2) {
            l(yoVar);
            return false;
        }
        ajst ajstVar = this.l;
        Class b = ajst.b(yoVar);
        Class b2 = ajst.b(yoVar2);
        ajtp ajtpVar = null;
        if (b != null && b2 != null) {
            ajtpVar = (ajtp) ajstVar.d.a(new jj(b, b2));
        }
        ajtp ajtpVar2 = ajtpVar;
        if (ajtpVar2 != null) {
            ajru y = y(yoVar);
            ajru y2 = y(yoVar2);
            if (y != null && y2 != null) {
                if (yoVar.a.getWidth() > yoVar2.a.getWidth() || yoVar.a.getHeight() > yoVar2.a.getHeight()) {
                    ajtbVar = this.f;
                } else {
                    ajtbVar = this.e;
                }
                ajtb ajtbVar2 = ajtbVar;
                ajtd ajtdVar = new ajtd(this, yoVar, yoVar2, ajtpVar2, ajtbVar2);
                ajtn a = ajto.a();
                a.j(y);
                a.g(y2);
                a.b(250L);
                a.i(new ajsy());
                a.h(new ajsz(ajtdVar, yoVar, 1));
                a.f(new ajsy(2));
                a.e(new ajsz(ajtdVar, yoVar2));
                a.c(i);
                a.d(i2);
                a.k(i3);
                a.l(i4);
                if (ajtpVar2.d(a.a())) {
                    b(yoVar);
                    b(yoVar2);
                    ajtbVar2.a.add(ajtpVar2);
                    ajtc ajtcVar = new ajtc(ajtpVar2, yoVar, yoVar2);
                    ajtbVar2.c.put(yoVar, ajtcVar);
                    ajtbVar2.c.put(yoVar2, ajtcVar);
                    return true;
                }
            }
        }
        l(yoVar);
        l(yoVar2);
        return false;
    }

    @Override // defpackage.zn
    public final boolean g(final yo yoVar, int i, int i2, int i3, int i4) {
        ajru y;
        ajtc ajtcVar = (ajtc) this.d.c.get(yoVar);
        if (ajtcVar != null) {
            ajtj ajtjVar = (ajtj) ajtcVar.a;
            ajtf ajtfVar = new ajtf();
            ajtfVar.a = Long.valueOf(this.i);
            ajtfVar.b = Integer.valueOf(i);
            ajtfVar.c = Integer.valueOf(i2);
            ajtfVar.d = Integer.valueOf(i3);
            ajtfVar.e = Integer.valueOf(i4);
            Long l = ajtfVar.a;
            if (l == null || ajtfVar.b == null || ajtfVar.c == null || ajtfVar.d == null || ajtfVar.e == null) {
                StringBuilder sb = new StringBuilder();
                if (ajtfVar.a == null) {
                    sb.append(" duration");
                }
                if (ajtfVar.b == null) {
                    sb.append(" fromX");
                }
                if (ajtfVar.c == null) {
                    sb.append(" fromY");
                }
                if (ajtfVar.d == null) {
                    sb.append(" toX");
                }
                if (ajtfVar.e == null) {
                    sb.append(" toY");
                }
                String valueOf = String.valueOf(sb);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb2.append("Missing required properties:");
                sb2.append(valueOf);
                throw new IllegalStateException(sb2.toString());
            } else if (ajtjVar.f(new ajtg(l.longValue(), ajtfVar.b.intValue(), ajtfVar.c.intValue(), ajtfVar.d.intValue(), ajtfVar.e.intValue()))) {
                l(yoVar);
                if (!this.d.a.contains(ajtjVar)) {
                    this.d.a.add(ajtjVar);
                }
                this.d.b.remove(ajtjVar);
                return true;
            }
        }
        final ajtj ajtjVar2 = (ajtj) ajst.a(this.l.c, yoVar);
        if (ajtjVar2 != null && (y = y(yoVar)) != null) {
            ajth a = ajti.a();
            a.g(y);
            a.b(this.i);
            a.f(new ajsy(4));
            a.e(new Runnable() { // from class: ajsw
                @Override // java.lang.Runnable
                public final void run() {
                    ajte ajteVar = ajte.this;
                    ajtj ajtjVar3 = ajtjVar2;
                    yo yoVar2 = yoVar;
                    ajteVar.d.a.remove(ajtjVar3);
                    ajteVar.d.b.remove(ajtjVar3);
                    ajteVar.d.c.remove(yoVar2);
                    ajteVar.l(yoVar2);
                    ajteVar.a();
                }
            });
            a.c(i);
            a.d(i2);
            a.h(i3);
            a.i(i4);
            if (ajtjVar2.e(a.a())) {
                b(yoVar);
                this.d.a.add(ajtjVar2);
                this.d.c.put(yoVar, new ajtc(ajtjVar2, yoVar));
                return true;
            }
        }
        l(yoVar);
        return false;
    }

    @Override // defpackage.zn
    public final boolean h(final yo yoVar) {
        ajru y;
        final ajtm ajtmVar = (ajtm) ajst.a(this.l.b, yoVar);
        if (ajtmVar == null || (y = y(yoVar)) == null) {
            l(yoVar);
            return false;
        }
        ajtk a = ajtl.a();
        a.e(y);
        a.b(120L);
        a.d(new ajsy(5));
        a.c(new Runnable() { // from class: ajsx
            @Override // java.lang.Runnable
            public final void run() {
                ajte ajteVar = ajte.this;
                ajtm ajtmVar2 = ajtmVar;
                yo yoVar2 = yoVar;
                ajteVar.c.a.remove(ajtmVar2);
                ajteVar.c.b.remove(ajtmVar2);
                ajteVar.c.c.remove(yoVar2);
                ajteVar.l(yoVar2);
                ajteVar.a();
            }
        });
        ajtmVar.e(a.a());
        b(yoVar);
        this.c.a.add(ajtmVar);
        this.c.c.put(yoVar, new ajtc(ajtmVar, yoVar));
        return true;
    }

    @Override // defpackage.xs
    public final boolean j() {
        return arey.v(this.g, zto.s);
    }

    public final boolean k(ajtb ajtbVar) {
        return this.a.hasMessages(ajtbVar.d);
    }

    @Override // defpackage.xs
    public final void n(yo yoVar) {
        for (ajtb ajtbVar : this.g) {
            ajtc ajtcVar = (ajtc) ajtbVar.c.get(yoVar);
            if (ajtcVar != null && this.a.hasMessages(ajtbVar.d, ajtcVar.a)) {
                this.a.removeMessages(ajtbVar.d, ajtcVar.a);
                if (!k(ajtbVar)) {
                    this.a.post(new ajta(this));
                }
            }
        }
    }

    public ajte(ajst ajstVar) {
        this.a = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: ajsu
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                ajtb ajtbVar;
                ajte ajteVar = ajte.this;
                int i = message.what;
                if (i == 1) {
                    ajtbVar = ajteVar.b;
                } else if (i == 2) {
                    ajtbVar = ajteVar.c;
                } else if (i == 3) {
                    ajtbVar = ajteVar.d;
                } else if (i == 4) {
                    ajtbVar = ajteVar.e;
                } else if (i != 5) {
                    return false;
                } else {
                    ajtbVar = ajteVar.f;
                }
                if (ajteVar.k(ajtbVar)) {
                    return true;
                }
                ajteVar.a.post(new ajta(ajteVar));
                return true;
            }
        });
        ajtb ajtbVar = new ajtb(1);
        this.b = ajtbVar;
        ajtb ajtbVar2 = new ajtb(2);
        this.c = ajtbVar2;
        ajtb ajtbVar3 = new ajtb(3);
        this.d = ajtbVar3;
        ajtb ajtbVar4 = new ajtb(4);
        this.e = ajtbVar4;
        ajtb ajtbVar5 = new ajtb(5);
        this.f = ajtbVar5;
        this.g = Arrays.asList(ajtbVar, ajtbVar2, ajtbVar3, ajtbVar4, ajtbVar5);
        ajstVar.getClass();
        this.l = ajstVar;
    }
}
