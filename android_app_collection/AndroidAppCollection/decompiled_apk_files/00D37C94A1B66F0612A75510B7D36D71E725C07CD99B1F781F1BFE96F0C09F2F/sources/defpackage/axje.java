package defpackage;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/* compiled from: PG */
/* renamed from: axje  reason: default package */
/* loaded from: classes2.dex */
public final class axje {
    public final axlh a = axlh.a;
    public Date b = new Date();
    public Date c = new Date();
    public final List d = new LinkedList();

    public static long a(long j, long j2) {
        return j2 == 0 ? j : a(j2, j % j2);
    }

    public final void b(axjh axjhVar) {
        axjh axjhVar2;
        long j = axjhVar.j().i;
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                axjhVar2 = null;
                break;
            }
            axjhVar2 = (axjh) it.next();
            if (axjhVar2.j().i == j) {
                break;
            }
        }
        if (axjhVar2 != null) {
            axji j2 = axjhVar.j();
            long j3 = 0;
            for (axjh axjhVar3 : this.d) {
                if (j3 < axjhVar3.j().i) {
                    j3 = axjhVar3.j().i;
                }
            }
            j2.i = j3 + 1;
        }
        this.d.add(axjhVar);
    }

    public final String toString() {
        String str = "Movie{ ";
        for (axjh axjhVar : this.d) {
            String valueOf = String.valueOf(str);
            long j = axjhVar.j().i;
            String k = axjhVar.k();
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30 + String.valueOf(k).length());
            sb.append(valueOf);
            sb.append("track_");
            sb.append(j);
            sb.append(" (");
            sb.append(k);
            sb.append(") ");
            str = sb.toString();
        }
        String valueOf2 = String.valueOf(str);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 1);
        sb2.append(valueOf2);
        sb2.append("}");
        return sb2.toString();
    }
}
