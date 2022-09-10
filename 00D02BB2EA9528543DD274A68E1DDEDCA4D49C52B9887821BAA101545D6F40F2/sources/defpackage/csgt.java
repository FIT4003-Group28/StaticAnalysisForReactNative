package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: csgt  reason: default package */
/* loaded from: classes5.dex */
public final class csgt {
    public static final csgq e = new csgq();
    public final csha a;
    public final cshu<csgt> b;
    public csht<csgt> c;
    public int d = -1;
    private final csgq f;

    public csgt(csha cshaVar, csgq csgqVar, cshu cshuVar) {
        this.a = cshaVar;
        this.f = csgqVar;
        this.b = cshuVar;
    }

    public final ddhj a() {
        return ((cshd) this.c).h();
    }

    public final cshb b() {
        return (cshb) this.a.bK();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(csgt csgtVar) {
        boolean z = false;
        dbsk.l(csgtVar.c == null);
        dbsk.l(!d());
        if (this.f == csgtVar.f) {
            z = true;
        }
        dbsk.l(z);
        boolean z2 = ((cshd) this.c).c;
        if (z2) {
            this.b.c(this);
        }
        csha cshaVar = this.a;
        cshaVar.b = (MessageType) cshaVar.b.cu(4);
        this.a.bC((cshb) csgtVar.a.bK());
        if (z2) {
            this.b.b(this);
        }
    }

    public final boolean d() {
        ddxx ddxxVar = ((cshb) this.a.b).c;
        if (ddxxVar == null) {
            ddxxVar = ddxx.j;
        }
        return (ddxxVar.a & 8) != 0;
    }

    public final boolean e() {
        ddxx ddxxVar = ((cshb) this.a.b).c;
        if (ddxxVar == null) {
            ddxxVar = ddxx.j;
        }
        return (ddxxVar.a & 2048) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [csht<csgt>, android.view.View$OnAttachStateChangeListener] */
    public final void f() {
        ?? r0 = this.c;
        cshd cshdVar = (cshd) r0;
        if (cshdVar.b.a()) {
            cshdVar.a.removeOnAttachStateChangeListener(r0);
            if (od.ak(cshdVar.a)) {
                cshdVar.onViewDetachedFromWindow(cshdVar.a);
            }
        }
        cshdVar.d = null;
        cshdVar.a.setTag(R.id.ve_tag, null);
        dbsk.l(!((cshd) this.c).c);
        this.c = null;
    }

    public final void g() {
        csha cshaVar = this.a;
        ddxx ddxxVar = ((cshb) cshaVar.b).c;
        if (ddxxVar == null) {
            ddxxVar = ddxx.j;
        }
        dsqp dsqpVar = (dsqp) ddxxVar.cu(5);
        dsqpVar.bC(ddxxVar);
        ddxw ddxwVar = (ddxw) dsqpVar;
        if (ddxwVar.c) {
            ddxwVar.bF();
            ddxwVar.c = false;
        }
        ddxx ddxxVar2 = (ddxx) ddxwVar.b;
        ddxxVar2.i = null;
        int i = ddxxVar2.a & (-2049);
        ddxxVar2.a = i;
        ddxxVar2.a = i & (-2);
        ddxxVar2.b = -1;
        ddxx bK = ddxwVar.bK();
        if (cshaVar.c) {
            cshaVar.bF();
            cshaVar.c = false;
        }
        cshb cshbVar = (cshb) cshaVar.b;
        bK.getClass();
        cshbVar.c = bK;
        cshbVar.a |= 1;
    }

    public final String toString() {
        String str;
        csht<csgt> cshtVar = this.c;
        if (cshtVar != null) {
            String valueOf = String.valueOf(cshtVar.getClass().getSimpleName());
            str = valueOf.length() != 0 ? ".".concat(valueOf) : new String(".");
        } else {
            str = "";
        }
        ddxx ddxxVar = ((cshb) this.a.b).c;
        if (ddxxVar == null) {
            ddxxVar = ddxx.j;
        }
        int i = ddxxVar.d;
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 18 + String.valueOf(hexString).length());
        sb.append("CVE");
        sb.append(str);
        sb.append("#");
        sb.append(i);
        sb.append(" [");
        sb.append(hexString);
        sb.append("]");
        return sb.toString();
    }
}
