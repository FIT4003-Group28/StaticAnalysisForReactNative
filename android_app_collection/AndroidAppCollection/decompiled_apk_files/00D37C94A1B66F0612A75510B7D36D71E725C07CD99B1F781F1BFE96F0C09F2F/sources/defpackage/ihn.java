package defpackage;
/* compiled from: PG */
/* renamed from: ihn  reason: default package */
/* loaded from: classes3.dex */
public final class ihn extends aaqs {
    public String a;
    public boolean b;
    public int c;
    public aopa d;

    public ihn(aaqf aaqfVar, afvm afvmVar) {
        super("reel/reel_item_watch", aaqfVar, afvmVar, 1);
        this.c = 1;
        this.b = false;
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = artu.a.createBuilder();
        asag asagVar = (asag) this.d.mo39build();
        createBuilder.copyOnWrite();
        artu artuVar = (artu) createBuilder.instance;
        asagVar.getClass();
        artuVar.e = asagVar;
        artuVar.b |= 4;
        int i = this.c;
        createBuilder.copyOnWrite();
        artu artuVar2 = (artu) createBuilder.instance;
        int i2 = i - 1;
        if (i != 0) {
            artuVar2.d = i2;
            artuVar2.b |= 2;
            String str = this.a;
            if (str != null) {
                createBuilder.copyOnWrite();
                artu artuVar3 = (artu) createBuilder.instance;
                artuVar3.b |= 8;
                artuVar3.f = str;
            }
            boolean z = this.b;
            createBuilder.copyOnWrite();
            artu artuVar4 = (artu) createBuilder.instance;
            artuVar4.b |= 16;
            artuVar4.g = z;
            return createBuilder;
        }
        throw null;
    }

    @Override // defpackage.aapd
    public final String b() {
        afrt afrtVar = new afrt();
        afrtVar.c("serviceName", this.m);
        afrtVar.c("identity", this.n.d());
        int i = this.c;
        int i2 = i - 1;
        if (i != 0) {
            afrtVar.b("inputType", i2);
            afrtVar.c("videoId", ((asag) this.d.instance).d);
            afrtVar.c("playlistId", g(((asag) this.d.instance).i));
            afrtVar.b("playlistIndex", d(((asag) this.d.instance).j));
            afrtVar.c("playerParams", g(((asag) this.d.instance).k));
            afrtVar.c("reelWatchEndpointParams", g(this.a));
            return afrtVar.a();
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        aopa aopaVar = this.d;
        aopaVar.getClass();
        if (this.c == 3) {
            return;
        }
        boolean z = true;
        if (((asag) aopaVar.instance).i.isEmpty()) {
            aqxo.y(!((asag) this.d.instance).d.isEmpty());
            return;
        }
        if (((asag) this.d.instance).d.isEmpty() && ((asag) this.d.instance).j <= 0) {
            z = false;
        }
        aqxo.y(z);
    }
}
