package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: abcg  reason: default package */
/* loaded from: classes.dex */
public final class abcg extends aars implements aari {
    public final abcd a;
    private final afvn b;
    private final boolean c;
    private final Set g;
    private final yni h;

    public abcg(aaqf aaqfVar, afvn afvnVar, yqw yqwVar, aacz aaczVar, Set set, abcd abcdVar, yni yniVar) {
        super(aaqfVar, yqwVar);
        this.b = afvnVar;
        set.getClass();
        this.g = set;
        this.a = abcdVar;
        this.c = aadf.b(aaczVar);
        yniVar.getClass();
        this.h = yniVar;
    }

    @Override // defpackage.aari
    public final /* bridge */ /* synthetic */ aaqs a(ajfz ajfzVar) {
        abce d = d();
        d.a = abce.g(ajfzVar.b());
        d.k(ajfzVar.d());
        return d;
    }

    @Override // defpackage.aari
    public final void b(aaqs aaqsVar, aarh aarhVar, afzf afzfVar) {
        this.a.j((abce) aaqsVar, aarhVar, afzfVar);
    }

    public final abce d() {
        abce abceVar = new abce(this.e, this.b.c(), this.c);
        abceVar.p = new yph(this.h, new aadw(), new aadv(), null, null);
        for (abcf abcfVar : this.g) {
            abcfVar.b(abceVar);
        }
        return abceVar;
    }
}
