package defpackage;
/* compiled from: PG */
/* renamed from: adra */
/* loaded from: classes.dex */
public final class adra {
    public static final /* synthetic */ int b = 0;
    public final yve a;

    static {
        zep.a("MDX.SessionInfoStorage");
    }

    public adra(yve yveVar) {
        this.a = yveVar;
    }

    public static /* synthetic */ void b(Throwable th) {
        zep.d("Failed to clear storage", th);
    }

    public static /* synthetic */ void c(Throwable th) {
        zep.d("Failed to save session info", th);
    }

    public final ankt a() {
        return anii.h(this.a.a(), new adch(15), anjk.a);
    }

    public final void d(final adnw adnwVar) {
        ylx.m(this.a.b(new ampg() { // from class: adqz
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                adnw adnwVar2 = adnw.this;
                awty awtyVar = (awty) obj;
                int i = adra.b;
                aopa createBuilder = awty.a.createBuilder();
                int i2 = adnwVar2.i;
                int i3 = i2 - 1;
                if (i2 != 0) {
                    createBuilder.copyOnWrite();
                    awty awtyVar2 = (awty) createBuilder.instance;
                    awtyVar2.b |= 1;
                    awtyVar2.c = i3;
                    String str = adnwVar2.e;
                    createBuilder.copyOnWrite();
                    awty awtyVar3 = (awty) createBuilder.instance;
                    str.getClass();
                    awtyVar3.b |= 128;
                    awtyVar3.h = str;
                    String str2 = adnwVar2.d;
                    createBuilder.copyOnWrite();
                    awty awtyVar4 = (awty) createBuilder.instance;
                    str2.getClass();
                    awtyVar4.b |= 32;
                    awtyVar4.g = str2;
                    String str3 = adnwVar2.g;
                    createBuilder.copyOnWrite();
                    awty awtyVar5 = (awty) createBuilder.instance;
                    str3.getClass();
                    awtyVar5.b |= 256;
                    awtyVar5.i = str3;
                    int i4 = adnwVar2.h;
                    createBuilder.copyOnWrite();
                    awty awtyVar6 = (awty) createBuilder.instance;
                    awtyVar6.b |= 512;
                    awtyVar6.j = i4;
                    long j = adnwVar2.b;
                    createBuilder.copyOnWrite();
                    awty awtyVar7 = (awty) createBuilder.instance;
                    awtyVar7.b |= 1024;
                    awtyVar7.k = j;
                    if (!adnwVar2.a.h()) {
                        createBuilder.copyOnWrite();
                        awty awtyVar8 = (awty) createBuilder.instance;
                        awtyVar8.b |= 2048;
                        awtyVar8.l = -1L;
                        createBuilder.copyOnWrite();
                        awty awtyVar9 = (awty) createBuilder.instance;
                        awtyVar9.b |= 4;
                        awtyVar9.e = -1L;
                        createBuilder.copyOnWrite();
                        awty awtyVar10 = (awty) createBuilder.instance;
                        awtyVar10.b |= 8;
                        awtyVar10.f = -1L;
                    } else {
                        admy admyVar = (admy) adnwVar2.a.c();
                        long j2 = admyVar.b;
                        createBuilder.copyOnWrite();
                        awty awtyVar11 = (awty) createBuilder.instance;
                        awtyVar11.b |= 2048;
                        awtyVar11.l = j2;
                        long j3 = admyVar.a;
                        createBuilder.copyOnWrite();
                        awty awtyVar12 = (awty) createBuilder.instance;
                        awtyVar12.b |= 4;
                        awtyVar12.e = j3;
                        long j4 = admyVar.d ? -2L : admyVar.c;
                        createBuilder.copyOnWrite();
                        awty awtyVar13 = (awty) createBuilder.instance;
                        awtyVar13.b |= 8;
                        awtyVar13.f = j4;
                    }
                    if (!adnwVar2.f.h()) {
                        createBuilder.copyOnWrite();
                        awty awtyVar14 = (awty) createBuilder.instance;
                        awtyVar14.b |= 2;
                        awtyVar14.d = -1;
                    } else {
                        int i5 = ((atcv) adnwVar2.f.c()).C;
                        createBuilder.copyOnWrite();
                        awty awtyVar15 = (awty) createBuilder.instance;
                        awtyVar15.b |= 2;
                        awtyVar15.d = i5;
                    }
                    if (adnwVar2.i == 3) {
                        adna adnaVar = adnwVar2.c;
                        adnaVar.getClass();
                        String str4 = adnaVar.a.c;
                        createBuilder.copyOnWrite();
                        awty awtyVar16 = (awty) createBuilder.instance;
                        awtyVar16.b |= 4096;
                        awtyVar16.m = str4;
                    }
                    return (awty) createBuilder.mo39build();
                }
                throw null;
            }
        }), adkd.i);
    }
}
