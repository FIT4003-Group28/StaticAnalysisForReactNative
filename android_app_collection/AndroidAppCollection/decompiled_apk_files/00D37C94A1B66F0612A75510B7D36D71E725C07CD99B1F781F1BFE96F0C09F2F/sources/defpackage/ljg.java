package defpackage;
/* compiled from: PG */
/* renamed from: ljg  reason: default package */
/* loaded from: classes3.dex */
public final class ljg implements zbu {
    final /* synthetic */ yve a;
    final /* synthetic */ yve b;
    private final /* synthetic */ int c;

    public ljg(yve yveVar, yve yveVar2) {
        this.a = yveVar;
        this.b = yveVar2;
    }

    public ljg(yve yveVar, yve yveVar2, int i) {
        this.c = i;
        this.a = yveVar;
        this.b = yveVar2;
    }

    @Override // defpackage.zbu
    public final ankt a() {
        if (this.c == 0) {
            return anii.i(this.b.a(), new lje(this.a), anjk.a);
        }
        return anii.i(this.b.a(), new lje(this.a, 1), anjk.a);
    }

    @Override // defpackage.zbu
    public final /* bridge */ /* synthetic */ ankt b(Object obj) {
        if (this.c == 0) {
            Boolean bool = (Boolean) obj;
            ankt b = this.a.b(new liw(bool, 5));
            if (bool.booleanValue()) {
                return anii.i(b, new lje(this.b, 3), anjk.a);
            }
            final yve yveVar = this.a;
            final yve yveVar2 = this.b;
            return anii.i(b, new anir() { // from class: ljf
                @Override // defpackage.anir
                public final ankt a(Object obj2) {
                    Void r4 = (Void) obj2;
                    return anii.i(yve.this.a(), new lje(yveVar2, 2), anjk.a);
                }
            }, anjk.a);
        }
        final Boolean bool2 = (Boolean) obj;
        ankt b2 = this.a.b(new liw(bool2));
        final yve yveVar3 = this.b;
        final yve yveVar4 = this.a;
        return anii.i(b2, new anir() { // from class: liy
            @Override // defpackage.anir
            public final ankt a(Object obj2) {
                yve yveVar5 = yve.this;
                final Boolean bool3 = bool2;
                final yve yveVar6 = yveVar4;
                Void r4 = (Void) obj2;
                return yveVar5.b(new ampg() { // from class: lix
                    @Override // defpackage.ampg
                    public final Object apply(Object obj3) {
                        awan b3;
                        Boolean bool4 = bool3;
                        yve yveVar7 = yveVar6;
                        aopa mo52toBuilder = ((awuj) obj3).mo52toBuilder();
                        if (bool4.booleanValue()) {
                            b3 = awan.VIDEO_QUALITY_SETTING_DATA_SAVER;
                        } else {
                            b3 = awan.b(((ljp) yveVar7.c()).c);
                            if (b3 == null) {
                                b3 = awan.VIDEO_QUALITY_SETTING_UNKNOWN;
                            }
                        }
                        mo52toBuilder.copyOnWrite();
                        awuj awujVar = (awuj) mo52toBuilder.instance;
                        awujVar.m = b3.e;
                        awujVar.b |= 16;
                        return (awuj) mo52toBuilder.mo39build();
                    }
                });
            }
        }, anjk.a);
    }
}
