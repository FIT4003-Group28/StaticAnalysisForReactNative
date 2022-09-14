package defpackage;

import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: altc  reason: default package */
/* loaded from: classes.dex */
public final class altc {
    @dzsi
    public alts a;
    public final Collection<altt> c = new CopyOnWriteArrayList();
    public final btnc<akqh, altb> b = new btnc<>(50, btmz.INDOOR_ACTIVE_LEVELS, null);

    @dzsi
    public final altu a(@dzsi alts altsVar) {
        if (altsVar == null) {
            return null;
        }
        altb a = this.b.a(altsVar.a);
        if (a == null) {
            return altsVar.c();
        }
        int i = a.a;
        if (i != -1) {
            return altsVar.b(i);
        }
        return null;
    }

    public final boolean b(akqh akqhVar) {
        for (altt alttVar : this.c) {
            altu a = a(alttVar.a);
            if (a != null && dbsd.a(akqhVar, a.b())) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format("[focused: %s]", this.a);
    }
}
