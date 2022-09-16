package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: amul  reason: default package */
/* loaded from: classes2.dex */
public final class amul {
    public final String a;
    public final List<amsv> b;
    @dzsi
    public final dspd c;

    public amul(String str, List<amsv> list, @dzsi dspd dspdVar) {
        this.a = str;
        this.b = list;
        this.c = dspdVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[text: ");
        sb.append(this.a);
        sb.append(" cannedMessages(");
        for (amsv amsvVar : this.b) {
            sb.append(" ");
            sb.append(amsvVar);
        }
        sb.append(" )]");
        return sb.toString();
    }
}
