package defpackage;
/* compiled from: PG */
/* renamed from: aihy  reason: default package */
/* loaded from: classes.dex */
public final class aihy implements aimx {
    private final yve b;
    private final aadd c;
    private ampq d = amon.a;
    public ampq a = amon.a;

    public aihy(aadd aaddVar, yve yveVar) {
        this.c = aaddVar;
        this.b = yveVar;
    }

    private final synchronized void c() {
        if (!this.d.h()) {
            return;
        }
        ((aypg) this.d.c()).qr();
        this.d = amon.a;
        this.a = amon.a;
    }

    public final synchronized void b() {
        if (this.d.h()) {
            return;
        }
        this.d = ampq.j(this.b.d().I().Z(new ayqb() { // from class: aihx
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                aihy.this.a = ampq.j((awuj) obj);
            }
        }));
    }

    @Override // defpackage.aimx
    public final void rj(aina ainaVar) {
        atdy atdyVar = this.c.a().i;
        if (atdyVar == null) {
            atdyVar = atdy.a;
        }
        atdz atdzVar = atdyVar.k;
        if (atdzVar == null) {
            atdzVar = atdz.a;
        }
        if (atdzVar.g <= 0) {
            if (this.d.h()) {
                c();
            }
        } else if (!this.d.h()) {
            b();
        }
        if (!this.d.h() || !this.a.h()) {
            return;
        }
        awuj awujVar = (awuj) this.a.d(adyd.s);
        aopa createBuilder = asai.a.createBuilder();
        awan b = awan.b(awujVar.n);
        if (b == null) {
            b = awan.VIDEO_QUALITY_SETTING_UNKNOWN;
        }
        createBuilder.copyOnWrite();
        asai asaiVar = (asai) createBuilder.instance;
        asaiVar.d = b.e;
        asaiVar.b |= 2;
        awan b2 = awan.b(awujVar.m);
        if (b2 == null) {
            b2 = awan.VIDEO_QUALITY_SETTING_UNKNOWN;
        }
        createBuilder.copyOnWrite();
        asai asaiVar2 = (asai) createBuilder.instance;
        asaiVar2.c = b2.e;
        asaiVar2.b |= 1;
        long j = awujVar.o;
        createBuilder.copyOnWrite();
        asai asaiVar3 = (asai) createBuilder.instance;
        asaiVar3.b |= 4;
        asaiVar3.e = j;
        final asai asaiVar4 = (asai) createBuilder.mo39build();
        ainaVar.z = asaiVar4;
        ainaVar.t(new aimz() { // from class: aihw
            @Override // defpackage.aimz
            public final void a(afrt afrtVar) {
                afrtVar.e("videoQualitySettingParams", asai.this.toByteArray());
            }
        });
    }
}
