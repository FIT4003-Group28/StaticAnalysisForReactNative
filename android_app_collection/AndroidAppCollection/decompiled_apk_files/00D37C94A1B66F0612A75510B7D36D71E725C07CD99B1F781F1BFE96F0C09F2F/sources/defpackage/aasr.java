package defpackage;
/* compiled from: PG */
/* renamed from: aasr  reason: default package */
/* loaded from: classes.dex */
public final class aasr extends aaqs {
    public String A;
    public String a;
    public String b;
    public String c;
    public long d;
    public long s;
    public int t;
    public long u;
    public long v;
    public int w;
    public int x;
    public int y;
    public int z;

    public aasr(aaqf aaqfVar, afvm afvmVar) {
        super("player/ad_break", aaqfVar, afvmVar, 3);
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = -2L;
        this.s = -1L;
        this.t = -1;
        this.u = -1L;
        this.v = -1L;
        this.w = -1;
        this.x = -1;
        this.y = 0;
        this.z = 0;
        this.A = "";
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arkp.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        arkp arkpVar = (arkp) createBuilder.instance;
        str.getClass();
        arkpVar.b |= 4;
        arkpVar.d = str;
        long j = this.d;
        createBuilder.copyOnWrite();
        arkp arkpVar2 = (arkp) createBuilder.instance;
        arkpVar2.b |= 8;
        arkpVar2.e = j;
        int i = this.t;
        createBuilder.copyOnWrite();
        arkp arkpVar3 = (arkp) createBuilder.instance;
        arkpVar3.b |= 16;
        arkpVar3.f = i;
        String str2 = this.b;
        createBuilder.copyOnWrite();
        arkp arkpVar4 = (arkp) createBuilder.instance;
        str2.getClass();
        arkpVar4.b |= 64;
        arkpVar4.h = str2;
        long j2 = this.u;
        if (j2 >= 0) {
            createBuilder.copyOnWrite();
            arkp arkpVar5 = (arkp) createBuilder.instance;
            arkpVar5.b |= 2097152;
            arkpVar5.k = j2;
        }
        if (!this.c.equals("")) {
            String str3 = this.c;
            createBuilder.copyOnWrite();
            arkp arkpVar6 = (arkp) createBuilder.instance;
            str3.getClass();
            arkpVar6.b |= 32768;
            arkpVar6.i = str3;
        }
        long j3 = this.s;
        if (j3 >= 0) {
            createBuilder.copyOnWrite();
            arkp arkpVar7 = (arkp) createBuilder.instance;
            arkpVar7.b |= 65536;
            arkpVar7.j = j3;
        }
        aopa createBuilder2 = atyg.a.createBuilder();
        String str4 = this.A;
        createBuilder2.copyOnWrite();
        atyg atygVar = (atyg) createBuilder2.instance;
        str4.getClass();
        atygVar.b |= 16384;
        atygVar.o = str4;
        long j4 = this.v;
        createBuilder2.copyOnWrite();
        atyg atygVar2 = (atyg) createBuilder2.instance;
        atygVar2.b |= 8;
        atygVar2.e = j4;
        int i2 = this.w;
        createBuilder2.copyOnWrite();
        atyg atygVar3 = (atyg) createBuilder2.instance;
        atygVar3.b |= 4;
        atygVar3.d = i2;
        int i3 = this.x;
        if (i3 != -1) {
            createBuilder2.copyOnWrite();
            atyg atygVar4 = (atyg) createBuilder2.instance;
            atygVar4.b |= 64;
            atygVar4.h = i3;
        }
        int i4 = this.y;
        createBuilder2.copyOnWrite();
        atyg atygVar5 = (atyg) createBuilder2.instance;
        atygVar5.b |= 32;
        atygVar5.g = i4;
        int i5 = this.z;
        createBuilder2.copyOnWrite();
        atyg atygVar6 = (atyg) createBuilder2.instance;
        atygVar6.b |= 16;
        atygVar6.f = i5;
        aopa createBuilder3 = atyj.a.createBuilder();
        createBuilder3.copyOnWrite();
        atyj atyjVar = (atyj) createBuilder3.instance;
        atyg atygVar7 = (atyg) createBuilder2.mo39build();
        atygVar7.getClass();
        atyjVar.c = atygVar7;
        atyjVar.b |= 1;
        createBuilder.copyOnWrite();
        arkp arkpVar8 = (arkp) createBuilder.instance;
        atyj atyjVar2 = (atyj) createBuilder3.mo39build();
        atyjVar2.getClass();
        arkpVar8.g = atyjVar2;
        arkpVar8.b |= 32;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        aqxo.y(!"".equals(this.a));
        aqxo.y(!"".equals(this.b));
        boolean z = false;
        aqxo.y(this.t != -1);
        aqxo.y(this.w != -1);
        aqxo.y(this.x != -1);
        aqxo.y(true);
        if (this.z != -1) {
            z = true;
        }
        aqxo.y(z);
        aqxo.y(!"".equals(this.A));
    }
}
