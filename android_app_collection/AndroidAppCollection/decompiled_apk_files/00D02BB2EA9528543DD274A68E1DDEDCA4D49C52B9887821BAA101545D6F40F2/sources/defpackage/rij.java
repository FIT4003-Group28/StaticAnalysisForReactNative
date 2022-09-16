package defpackage;
/* compiled from: PG */
/* renamed from: rij  reason: default package */
/* loaded from: classes7.dex */
public final class rij {
    public final rih a;
    private final dnli b;

    public rij(dnli dnliVar) {
        dngu dnguVar = dnliVar.b;
        dnguVar = dnguVar == null ? dngu.e : dnguVar;
        if (dnguVar != null) {
            this.a = new rih(dnguVar);
            dnlh ca = dnli.c.ca(dnliVar);
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dnli dnliVar2 = (dnli) ca.b;
            dnliVar2.b = null;
            dnliVar2.a &= -2;
            this.b = ca.bK();
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }

    public final dnli a() {
        dnlh ca = dnli.c.ca(this.b);
        dngu dnguVar = this.a.a;
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        dnli dnliVar = (dnli) ca.b;
        dnguVar.getClass();
        dnliVar.b = dnguVar;
        dnliVar.a |= 1;
        return ca.bK();
    }
}
