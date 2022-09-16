package defpackage;
/* compiled from: PG */
/* renamed from: amhl  reason: default package */
/* loaded from: classes.dex */
public final class amhl extends l {
    private amkr c;

    public amhl(dt dtVar) {
        super(dtVar);
    }

    @Override // defpackage.l
    public final void d(aps apsVar) {
        String str;
        l.g("getObserverCount");
        if (this.a.e > 0) {
            amkr amkrVar = this.c;
            aps apsVar2 = aps.ON_CREATE;
            int ordinal = apsVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    str = "Lifecycle.Started";
                } else if (ordinal == 2) {
                    str = "Lifecycle.Resumed";
                } else if (ordinal == 3) {
                    str = "Lifecycle.Paused";
                } else if (ordinal == 4) {
                    str = "Lifecycle.Stopped";
                } else if (ordinal != 5) {
                    String valueOf = String.valueOf(apsVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                    sb.append("Unknown lifecycle: ");
                    sb.append(valueOf);
                    throw new UnsupportedOperationException(sb.toString());
                } else {
                    str = "Lifecycle.Destroyed";
                }
                amkrVar.n(str);
            } else if (amkrVar.d == null) {
                amkrVar.n("Lifecycle.Created");
                amkrVar.c = true;
            }
            try {
                super.d(apsVar);
                return;
            } finally {
                this.c.l(apsVar);
            }
        }
        super.d(apsVar);
    }

    public final void h(amkr amkrVar) {
        aqxo.z(this.c == null, "Activity was already created");
        this.c = amkrVar;
    }
}
