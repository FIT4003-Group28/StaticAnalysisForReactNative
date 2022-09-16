package defpackage;

import android.content.Intent;
import java.util.List;
/* compiled from: PG */
/* renamed from: uea  reason: default package */
/* loaded from: classes4.dex */
public final class uea {
    public String a;
    public ucp b;
    public List c;
    public Intent d;
    public aols e;
    private uec f;
    private Integer g;
    private aomr h;
    private aojl i;
    private uip j;
    private Boolean k;

    public final void c(boolean z) {
        this.k = Boolean.valueOf(z);
    }

    public final void d(uip uipVar) {
        if (uipVar != null) {
            this.j = uipVar;
            return;
        }
        throw new NullPointerException("Null localThreadState");
    }

    public final void e(aojl aojlVar) {
        if (aojlVar != null) {
            this.i = aojlVar;
            return;
        }
        throw new NullPointerException("Null removeReason");
    }

    public final void f(uec uecVar) {
        if (uecVar != null) {
            this.f = uecVar;
            return;
        }
        throw new NullPointerException("Null source");
    }

    public final void g(aomr aomrVar) {
        if (aomrVar != null) {
            this.h = aomrVar;
            return;
        }
        throw new NullPointerException("Null threadStateUpdate");
    }

    public final void h(int i) {
        this.g = Integer.valueOf(i);
    }

    public final void b(List list) {
        List list2 = this.c;
        if (list2 == null) {
            throw new IllegalStateException("Property \"threads\" has not been set");
        }
        list2.addAll(list);
    }

    public final ueb a() {
        Integer num;
        uec uecVar = this.f;
        if (uecVar == null || (num = this.g) == null || this.c == null || this.h == null || this.i == null || this.j == null || this.k == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f == null) {
                sb.append(" source");
            }
            if (this.g == null) {
                sb.append(" type");
            }
            if (this.c == null) {
                sb.append(" threads");
            }
            if (this.h == null) {
                sb.append(" threadStateUpdate");
            }
            if (this.i == null) {
                sb.append(" removeReason");
            }
            if (this.j == null) {
                sb.append(" localThreadState");
            }
            if (this.k == null) {
                sb.append(" activityLaunched");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new udz(uecVar, num.intValue(), this.a, this.b, this.c, this.h, this.i, this.d, this.j, this.e, this.k.booleanValue(), null);
    }
}
