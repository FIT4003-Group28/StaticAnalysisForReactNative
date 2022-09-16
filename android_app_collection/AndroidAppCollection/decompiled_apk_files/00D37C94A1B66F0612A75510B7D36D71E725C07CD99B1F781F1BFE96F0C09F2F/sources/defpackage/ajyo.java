package defpackage;
/* compiled from: PG */
/* renamed from: ajyo  reason: default package */
/* loaded from: classes.dex */
public final class ajyo implements akad {
    private static final ampt a = new ajyn();
    private final ampq b;

    public ajyo() {
        this(amon.a);
    }

    public ajyo(ampq ampqVar) {
        this.b = ampqVar;
    }

    @Override // defpackage.akad
    public final /* bridge */ /* synthetic */ void b(Object obj, akac akacVar) {
        aslt asltVar = (aslt) obj;
        if ((asltVar.c & 268435456) == 0) {
            aoqu b = aakx.b(asltVar);
            if (b == null) {
                return;
            }
            akacVar.a(aolu.p(this.b, b));
            return;
        }
        auuf auufVar = asltVar.W;
        if (auufVar == null) {
            auufVar = auuf.a;
        }
        auuh auuhVar = auufVar.r;
        if (auuhVar == null) {
            auuhVar = auuh.a;
        }
        if ((auuhVar.b & 4) != 0) {
            akacVar.a(new aakp(auufVar));
            return;
        }
        auuh auuhVar2 = auufVar.r;
        if (auuhVar2 == null) {
            auuhVar2 = auuh.a;
        }
        if ((auuhVar2.b & 8) == 0) {
            return;
        }
        akacVar.a(new aald(auufVar));
    }

    @Override // defpackage.akad
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.akad
    public final ampt e() {
        return a;
    }
}
