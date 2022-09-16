package defpackage;
/* compiled from: PG */
/* renamed from: ajnz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ajnz implements amqo {
    public final /* synthetic */ azqb a;
    public final /* synthetic */ azqb b;
    public final /* synthetic */ azqb c;
    private final /* synthetic */ int d;

    public /* synthetic */ ajnz(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
    }

    public /* synthetic */ ajnz(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i) {
        this.d = i;
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
    }

    @Override // defpackage.amqo
    public final Object get() {
        if (this.d == 0) {
            azqb azqbVar = this.a;
            azqb azqbVar2 = this.b;
            azqb azqbVar3 = this.c;
            if (!((apfc) azqbVar.get()).h) {
                return null;
            }
            boolean z = false;
            if (((apfc) azqbVar.get()).m && ((akwp) azqbVar2.get()).b(((apfc) azqbVar.get()).o, akvj.STREAMZ_GLIDE_SAMPLING)) {
                z = true;
            }
            return new ajoc((apfc) azqbVar.get(), azqbVar3, z);
        }
        azqb azqbVar4 = this.a;
        azqb azqbVar5 = this.b;
        azqb azqbVar6 = this.c;
        if (((apfc) azqbVar4.get()).m && ((akwp) azqbVar5.get()).b(((apfc) azqbVar4.get()).o, akvj.STREAMZ_GLIDE_SAMPLING)) {
            return new ajnv((akvm) azqbVar6.get());
        }
        return null;
    }
}
