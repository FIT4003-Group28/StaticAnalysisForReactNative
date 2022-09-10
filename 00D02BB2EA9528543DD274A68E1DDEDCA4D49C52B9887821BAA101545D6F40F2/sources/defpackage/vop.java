package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: vop  reason: default package */
/* loaded from: classes7.dex */
public final class vop {
    public final vol a;
    public final Map<dqvj, vok> b = new dzqd();
    public vnk c;
    @dzsi
    public zdv d;

    public vop(vol volVar) {
        this.a = volVar;
    }

    public final void a(voo vooVar) {
        dzrn it = ((dzrl) ((dznt) this.b).values()).iterator();
        while (it.hasNext()) {
            vooVar.a((vok) it.next());
        }
    }
}
