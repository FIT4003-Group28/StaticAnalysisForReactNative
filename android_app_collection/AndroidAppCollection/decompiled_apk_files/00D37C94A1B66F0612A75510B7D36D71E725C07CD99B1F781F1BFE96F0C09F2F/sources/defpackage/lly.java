package defpackage;
/* compiled from: PG */
/* renamed from: lly  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lly implements ampg {
    public final /* synthetic */ awan a;
    private final /* synthetic */ int b;

    public /* synthetic */ lly(awan awanVar) {
        this.a = awanVar;
    }

    public /* synthetic */ lly(awan awanVar, int i) {
        this.b = i;
        this.a = awanVar;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        int i = this.b;
        boolean z = false;
        if (i == 0) {
            awan awanVar = this.a;
            awan b = awan.b(((awuj) obj).m);
            if (b == null) {
                b = awan.VIDEO_QUALITY_SETTING_UNKNOWN;
            }
            if (b == awanVar) {
                z = true;
            }
            return Boolean.valueOf(z);
        } else if (i == 1) {
            awan awanVar2 = this.a;
            aopa mo52toBuilder = ((ljp) obj).mo52toBuilder();
            mo52toBuilder.copyOnWrite();
            ljp ljpVar = (ljp) mo52toBuilder.instance;
            ljpVar.c = awanVar2.e;
            ljpVar.b |= 1;
            return (ljp) mo52toBuilder.mo39build();
        } else {
            awan awanVar3 = this.a;
            awan b2 = awan.b(((awuj) obj).n);
            if (b2 == null) {
                b2 = awan.VIDEO_QUALITY_SETTING_UNKNOWN;
            }
            if (b2 == awanVar3) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }
}
