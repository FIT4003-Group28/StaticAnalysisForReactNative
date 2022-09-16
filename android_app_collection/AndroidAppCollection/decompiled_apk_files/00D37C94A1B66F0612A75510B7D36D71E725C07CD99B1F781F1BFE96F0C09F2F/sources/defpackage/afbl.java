package defpackage;
/* compiled from: PG */
/* renamed from: afbl  reason: default package */
/* loaded from: classes.dex */
public final class afbl {
    public final afbi a;
    public final aegu b;
    public final aepk c;
    public final boolean d;
    public final int e;

    public afbl(afbi afbiVar, aegu aeguVar, int i, boolean z) {
        this(afbiVar, aeguVar, i, z && aeguVar.a.length > 0, aepk.a);
    }

    private afbl(afbi afbiVar, aegu aeguVar, int i, boolean z, aepk aepkVar) {
        this.a = afbiVar;
        this.b = aeguVar;
        this.e = i;
        this.d = z;
        this.c = aepkVar;
    }

    public final afbl a(aepk aepkVar) {
        return new afbl(this.a, this.b, this.e, this.d, aepkVar);
    }
}
