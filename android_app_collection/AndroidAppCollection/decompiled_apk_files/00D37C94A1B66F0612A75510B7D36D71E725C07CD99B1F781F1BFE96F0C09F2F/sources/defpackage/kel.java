package defpackage;
/* compiled from: PG */
/* renamed from: kel  reason: default package */
/* loaded from: classes3.dex */
public final class kel implements ffm {
    private final acti a;
    private long b;
    private boolean c;
    private final aacz d;

    public kel(acti actiVar, aacz aaczVar) {
        this.a = actiVar;
        this.d = aaczVar;
    }

    private final boolean c() {
        return eog.aS(this.d);
    }

    @Override // defpackage.ffm
    public final void a(long j) {
        auqn auqnVar;
        if (!c()) {
            return;
        }
        if (this.c) {
            auqnVar = auqn.SEEK_SOURCE_PICK_UP_PLAY_HEAD;
        } else {
            auqnVar = auqn.SEEK_SOURCE_SLIDE_ON_SCRUBBER_BAR;
        }
        aopa createBuilder = asjt.a.createBuilder();
        long j2 = this.b;
        createBuilder.copyOnWrite();
        asjt asjtVar = (asjt) createBuilder.instance;
        asjtVar.b |= 2;
        asjtVar.d = (int) j2;
        createBuilder.copyOnWrite();
        asjt asjtVar2 = (asjt) createBuilder.instance;
        asjtVar2.b |= 4;
        asjtVar2.e = (int) j;
        createBuilder.copyOnWrite();
        asjt asjtVar3 = (asjt) createBuilder.instance;
        asjtVar3.c = auqnVar.n;
        asjtVar3.b |= 1;
        asjt asjtVar4 = (asjt) createBuilder.mo39build();
        aopa createBuilder2 = asjj.a.createBuilder();
        createBuilder2.copyOnWrite();
        asjj asjjVar = (asjj) createBuilder2.instance;
        asjtVar4.getClass();
        asjjVar.G = asjtVar4;
        asjjVar.c |= 67108864;
        this.a.H(3, new acte(actj.PLAYER_SCRUBBER), (asjj) createBuilder2.mo39build());
    }

    @Override // defpackage.ffm
    public final void b(long j, boolean z) {
        if (!c()) {
            return;
        }
        this.b = j;
        this.c = z;
        this.a.n(new acte(actj.PLAYER_SCRUBBER));
    }
}
