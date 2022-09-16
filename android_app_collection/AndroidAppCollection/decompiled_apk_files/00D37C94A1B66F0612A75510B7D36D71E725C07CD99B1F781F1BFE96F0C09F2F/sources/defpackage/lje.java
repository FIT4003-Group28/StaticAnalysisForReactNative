package defpackage;
/* compiled from: PG */
/* renamed from: lje  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lje implements anir {
    public final /* synthetic */ yve a;
    private final /* synthetic */ int b;

    public /* synthetic */ lje(yve yveVar, int i) {
        this.b = i;
        this.a = yveVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        int i = this.b;
        boolean z = false;
        if (i == 0) {
            yve yveVar = this.a;
            if (((fgu) obj).e == 1) {
                z = true;
            }
            return anii.h(yveVar.b(new ehf(z, 18)), new ehf(z, 19), anjk.a);
        } else if (i == 1) {
            yve yveVar2 = this.a;
            awan b = awan.b(((awuj) obj).m);
            if (b == null) {
                b = awan.VIDEO_QUALITY_SETTING_UNKNOWN;
            }
            if (b == awan.VIDEO_QUALITY_SETTING_DATA_SAVER) {
                z = true;
            }
            return anii.h(yveVar2.b(new ehf(z, 10)), new ehf(z, 11), anjk.a);
        } else if (i == 2) {
            yve yveVar3 = this.a;
            final ljp ljpVar = (ljp) obj;
            if ((ljpVar.b & 4) == 0) {
                return ankq.a;
            }
            if (ljpVar.e == -1) {
                return yveVar3.b(lhh.g);
            }
            return yveVar3.b(new ampg() { // from class: ljd
                @Override // defpackage.ampg
                public final Object apply(Object obj2) {
                    ljp ljpVar2 = ljp.this;
                    aopa mo52toBuilder = ((fgu) obj2).mo52toBuilder();
                    int i2 = ljpVar2.e;
                    mo52toBuilder.copyOnWrite();
                    fgu fguVar = (fgu) mo52toBuilder.instance;
                    fguVar.b |= 4;
                    fguVar.e = i2;
                    return (fgu) mo52toBuilder.mo39build();
                }
            });
        } else {
            Void r5 = (Void) obj;
            return this.a.b(lhh.f);
        }
    }
}
