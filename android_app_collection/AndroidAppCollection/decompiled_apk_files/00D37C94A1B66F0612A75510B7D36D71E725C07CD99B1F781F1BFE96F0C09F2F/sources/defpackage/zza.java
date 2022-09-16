package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: zza  reason: default package */
/* loaded from: classes4.dex */
public final class zza {
    public final arix a;
    public final zyz b;

    public zza(arix arixVar) {
        this.a = arixVar;
        ariu ariuVar = arixVar.c;
        int i = (ariuVar == null ? ariu.a : ariuVar).b;
        if ((i & 8) != 0) {
            this.b = zyz.COLLABORATOR_CARD;
        } else if ((i & 4) != 0) {
            this.b = zyz.PLAYLIST_CARD;
        } else if ((i & 1) != 0) {
            this.b = zyz.SIMPLE_CARD;
        } else if ((i & 2) != 0) {
            this.b = zyz.VIDEO_CARD;
        } else if ((i & 128) == 0) {
            zep.b("Encountered unknown or invalid card");
            this.b = null;
        } else {
            this.b = zyz.SHOPPING_CARD;
        }
    }

    public final arip a() {
        ariu ariuVar = this.a.c;
        if (ariuVar == null) {
            ariuVar = ariu.a;
        }
        arip aripVar = ariuVar.f;
        return aripVar == null ? arip.a : aripVar;
    }

    public final arjd b() {
        ariu ariuVar = this.a.c;
        if (ariuVar == null) {
            ariuVar = ariu.a;
        }
        arjd arjdVar = ariuVar.e;
        return arjdVar == null ? arjd.a : arjdVar;
    }

    public final arjf c() {
        ariu ariuVar = this.a.c;
        if (ariuVar == null) {
            ariuVar = ariu.a;
        }
        arjf arjfVar = ariuVar.g;
        return arjfVar == null ? arjf.a : arjfVar;
    }

    public final arjh d() {
        ariu ariuVar = this.a.c;
        if (ariuVar == null) {
            ariuVar = ariu.a;
        }
        arjh arjhVar = ariuVar.c;
        return arjhVar == null ? arjh.a : arjhVar;
    }

    public final arji e() {
        ariz arizVar = this.a.b;
        if (arizVar == null) {
            arizVar = ariz.a;
        }
        arji arjiVar = arizVar.b;
        return arjiVar == null ? arji.a : arjiVar;
    }

    public final arjj f() {
        ariu ariuVar = this.a.c;
        if (ariuVar == null) {
            ariuVar = ariu.a;
        }
        arjj arjjVar = ariuVar.d;
        return arjjVar == null ? arjj.a : arjjVar;
    }

    public final List g() {
        return this.a.d;
    }

    public final byte[] h() {
        arir arirVar = this.a.e;
        if (arirVar == null) {
            arirVar = arir.a;
        }
        if ((arirVar.b & 2) != 0) {
            arir arirVar2 = this.a.e;
            if (arirVar2 == null) {
                arirVar2 = arir.a;
            }
            ariw ariwVar = arirVar2.c;
            if (ariwVar == null) {
                ariwVar = ariw.a;
            }
            return ariwVar.b.I();
        }
        return null;
    }
}
