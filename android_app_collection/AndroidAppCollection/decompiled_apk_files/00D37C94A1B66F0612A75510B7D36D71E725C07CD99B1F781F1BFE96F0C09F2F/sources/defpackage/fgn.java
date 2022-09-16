package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: fgn  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fgn implements ampg {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ fgn(int i) {
        this.a = i;
    }

    public /* synthetic */ fgn(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                int i = this.a;
                fgu fguVar = (fgu) obj;
                if (fguVar == null) {
                    return null;
                }
                aopa mo52toBuilder = fguVar.mo52toBuilder();
                mo52toBuilder.copyOnWrite();
                fgu fguVar2 = (fgu) mo52toBuilder.instance;
                fguVar2.b |= 32;
                fguVar2.i = i;
                return (fgu) mo52toBuilder.mo39build();
            case 1:
                int i2 = this.a;
                fgu fguVar3 = (fgu) obj;
                if (fguVar3 == null) {
                    return null;
                }
                aopa mo52toBuilder2 = fguVar3.mo52toBuilder();
                mo52toBuilder2.copyOnWrite();
                fgu fguVar4 = (fgu) mo52toBuilder2.instance;
                fguVar4.b |= 16;
                fguVar4.h = i2;
                return (fgu) mo52toBuilder2.mo39build();
            case 2:
                int i3 = this.a;
                aopa mo52toBuilder3 = ((fgu) obj).mo52toBuilder();
                mo52toBuilder3.copyOnWrite();
                fgu fguVar5 = (fgu) mo52toBuilder3.instance;
                fguVar5.b |= 4;
                fguVar5.e = i3;
                return (fgu) mo52toBuilder3.mo39build();
            case 3:
                int i4 = this.a;
                fgl fglVar = (fgl) obj;
                if (fglVar == null) {
                    return null;
                }
                aopa mo52toBuilder4 = fglVar.mo52toBuilder();
                mo52toBuilder4.copyOnWrite();
                fgl fglVar2 = (fgl) mo52toBuilder4.instance;
                fglVar2.b |= 1;
                fglVar2.c = i4;
                return (fgl) mo52toBuilder4.mo39build();
            case 4:
                int i5 = this.a;
                frz frzVar = (frz) obj;
                int i6 = lvu.l;
                frzVar.c(i5);
                return frzVar;
            case 5:
                int i7 = this.a;
                aopa mo52toBuilder5 = ((znc) obj).mo52toBuilder();
                mo52toBuilder5.copyOnWrite();
                ((znc) mo52toBuilder5.instance).b = i7;
                return (znc) mo52toBuilder5.mo39build();
            case 6:
                int i8 = this.a;
                aopa mo52toBuilder6 = ((aotz) obj).mo52toBuilder();
                mo52toBuilder6.copyOnWrite();
                aotz aotzVar = (aotz) mo52toBuilder6.instance;
                aotzVar.b |= 16;
                aotzVar.g = i8;
                return (aotz) mo52toBuilder6.mo39build();
            case 7:
                int i9 = this.a;
                aopa mo52toBuilder7 = ((awtn) obj).mo52toBuilder();
                mo52toBuilder7.copyOnWrite();
                awtn awtnVar = (awtn) mo52toBuilder7.instance;
                awtnVar.b |= 16;
                awtnVar.g = i9;
                return (awtn) mo52toBuilder7.mo39build();
            case 8:
                return new agti(obj, this.a);
            default:
                PlayerResponseModel playerResponseModel = (PlayerResponseModel) obj;
                playerResponseModel.d.b("PLAYER_RESPONSE_SOURCE_KEY", this.a);
                return playerResponseModel;
        }
    }
}
