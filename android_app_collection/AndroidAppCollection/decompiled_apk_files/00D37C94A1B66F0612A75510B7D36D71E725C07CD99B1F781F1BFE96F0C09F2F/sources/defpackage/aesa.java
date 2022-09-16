package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aesa  reason: default package */
/* loaded from: classes.dex */
public final class aesa extends aaqs {
    private final aopa a;

    public aesa(aaqf aaqfVar, afvn afvnVar, byte[] bArr, String str, String str2, String str3, String str4, Integer num, int i, Long l) {
        super("player/get_drm_license", aaqfVar, afvnVar.c(), 1, true);
        aopa createBuilder = arqy.a.createBuilder();
        this.a = createBuilder;
        i();
        boolean z = num != null;
        createBuilder.copyOnWrite();
        arqy arqyVar = (arqy) createBuilder.instance;
        str.getClass();
        arqyVar.b |= 2;
        arqyVar.d = str;
        createBuilder.copyOnWrite();
        arqy arqyVar2 = (arqy) createBuilder.instance;
        arqyVar2.e = 1;
        arqyVar2.b |= 4;
        aoob x = aoob.x((byte[]) afms.a(bArr));
        createBuilder.copyOnWrite();
        arqy arqyVar3 = (arqy) createBuilder.instance;
        arqyVar3.b |= 8;
        arqyVar3.f = x;
        afms.a(str3);
        createBuilder.copyOnWrite();
        arqy arqyVar4 = (arqy) createBuilder.instance;
        str3.getClass();
        arqyVar4.b |= 16;
        arqyVar4.g = str3;
        afms.a(str2);
        createBuilder.copyOnWrite();
        arqy arqyVar5 = (arqy) createBuilder.instance;
        str2.getClass();
        arqyVar5.b |= 32;
        arqyVar5.h = str2;
        createBuilder.copyOnWrite();
        arqy arqyVar6 = (arqy) createBuilder.instance;
        str4.getClass();
        arqyVar6.b |= 64;
        arqyVar6.i = str4;
        createBuilder.copyOnWrite();
        arqy arqyVar7 = (arqy) createBuilder.instance;
        arqyVar7.b |= 128;
        arqyVar7.j = z;
        if (z) {
            int intValue = num.intValue();
            createBuilder.copyOnWrite();
            arqy arqyVar8 = (arqy) createBuilder.instance;
            arqyVar8.b |= 256;
            arqyVar8.k = intValue;
        }
        if (i != 0) {
            createBuilder.copyOnWrite();
            arqy arqyVar9 = (arqy) createBuilder.instance;
            arqyVar9.b |= 1024;
            arqyVar9.l = true;
            createBuilder.copyOnWrite();
            arqy arqyVar10 = (arqy) createBuilder.instance;
            arqyVar10.m = i - 1;
            arqyVar10.b |= 2048;
        }
        if (l != null) {
            long longValue = l.longValue();
            createBuilder.copyOnWrite();
            arqy arqyVar11 = (arqy) createBuilder.instance;
            arqyVar11.b |= 4096;
            arqyVar11.n = longValue;
        }
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        afms.d((((arqy) this.a.instance).b & 8) != 0);
    }
}
