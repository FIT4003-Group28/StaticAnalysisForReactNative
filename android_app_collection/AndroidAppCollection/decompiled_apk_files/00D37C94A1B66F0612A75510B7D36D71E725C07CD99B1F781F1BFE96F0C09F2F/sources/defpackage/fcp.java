package defpackage;
/* compiled from: PG */
/* renamed from: fcp  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fcp implements ampg {
    public final /* synthetic */ long a;
    private final /* synthetic */ int b;

    public /* synthetic */ fcp(long j, int i) {
        this.b = i;
        this.a = j;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                long j = this.a;
                aopa mo52toBuilder = ((fda) obj).mo52toBuilder();
                mo52toBuilder.copyOnWrite();
                fda fdaVar = (fda) mo52toBuilder.instance;
                fdaVar.b |= 512;
                fdaVar.m = j;
                return (fda) mo52toBuilder.mo39build();
            case 1:
                long j2 = this.a;
                aopa mo52toBuilder2 = ((fcy) obj).mo52toBuilder();
                mo52toBuilder2.copyOnWrite();
                fcy fcyVar = (fcy) mo52toBuilder2.instance;
                fcyVar.b |= 8;
                fcyVar.f = j2;
                return (fcy) mo52toBuilder2.mo39build();
            case 2:
                long j3 = this.a;
                aopa mo52toBuilder3 = ((fda) obj).mo52toBuilder();
                mo52toBuilder3.copyOnWrite();
                fda fdaVar2 = (fda) mo52toBuilder3.instance;
                fdaVar2.b |= 256;
                fdaVar2.l = j3;
                return (fda) mo52toBuilder3.mo39build();
            case 3:
                long j4 = this.a;
                fda fdaVar3 = (fda) obj;
                aopa mo52toBuilder4 = fdaVar3.mo52toBuilder();
                long j5 = fdaVar3.h;
                mo52toBuilder4.copyOnWrite();
                fda fdaVar4 = (fda) mo52toBuilder4.instance;
                fdaVar4.b = 32 | fdaVar4.b;
                fdaVar4.h = j5 + 1;
                mo52toBuilder4.copyOnWrite();
                fda fdaVar5 = (fda) mo52toBuilder4.instance;
                fdaVar5.b |= 64;
                fdaVar5.i = j4;
                return (fda) mo52toBuilder4.mo39build();
            case 4:
                long j6 = this.a;
                aopa mo52toBuilder5 = ((llq) obj).mo52toBuilder();
                mo52toBuilder5.copyOnWrite();
                llq llqVar = (llq) mo52toBuilder5.instance;
                llqVar.b |= 2;
                llqVar.d = j6;
                return (llq) mo52toBuilder5.mo39build();
            case 5:
                long j7 = this.a;
                aopa mo52toBuilder6 = ((mbn) obj).mo52toBuilder();
                mo52toBuilder6.copyOnWrite();
                mbn mbnVar = (mbn) mo52toBuilder6.instance;
                mbnVar.b |= 1;
                mbnVar.c = j7;
                return (mbn) mo52toBuilder6.mo39build();
            case 6:
                long j8 = this.a;
                nwo nwoVar = (nwo) obj;
                if (nwoVar == null) {
                    return null;
                }
                aopa createBuilder = nwo.a.createBuilder(nwoVar);
                int i = nwoVar.d;
                createBuilder.copyOnWrite();
                nwo nwoVar2 = (nwo) createBuilder.instance;
                nwoVar2.b |= 2;
                nwoVar2.d = i + 1;
                createBuilder.copyOnWrite();
                nwo nwoVar3 = (nwo) createBuilder.instance;
                nwoVar3.b |= 1;
                nwoVar3.c = j8;
                return (nwo) createBuilder.mo39build();
            case 7:
                long j9 = this.a;
                aopa mo52toBuilder7 = ((awte) obj).mo52toBuilder();
                mo52toBuilder7.copyOnWrite();
                awte awteVar = (awte) mo52toBuilder7.instance;
                awteVar.b |= 1;
                awteVar.c = j9;
                return (awte) mo52toBuilder7.mo39build();
            case 8:
                long j10 = this.a;
                aopa mo52toBuilder8 = ((aotz) obj).mo52toBuilder();
                mo52toBuilder8.copyOnWrite();
                aotz aotzVar = (aotz) mo52toBuilder8.instance;
                aotzVar.b = 32 | aotzVar.b;
                aotzVar.h = j10;
                return (aotz) mo52toBuilder8.mo39build();
            case 9:
                long j11 = this.a;
                int i2 = acss.m;
                aopa mo52toBuilder9 = ((awtn) obj).mo52toBuilder();
                mo52toBuilder9.copyOnWrite();
                awtn awtnVar = (awtn) mo52toBuilder9.instance;
                awtnVar.b |= 1;
                awtnVar.c = j11;
                return (awtn) mo52toBuilder9.mo39build();
            case 10:
                long j12 = this.a;
                aflo afloVar = (aflo) obj;
                long j13 = afloVar.b;
                long j14 = afloVar.a;
                StringBuilder sb = new StringBuilder(32);
                sb.append((int) j13);
                sb.append("t");
                sb.append(j14 - j12);
                return sb.toString();
            case 11:
                long j15 = this.a;
                aopa mo52toBuilder10 = ((awuj) obj).mo52toBuilder();
                mo52toBuilder10.bf("last_playback_start_timestamp", j15);
                return (awuj) mo52toBuilder10.mo39build();
            case 12:
                long j16 = this.a;
                aopa mo52toBuilder11 = ((awux) obj).mo52toBuilder();
                mo52toBuilder11.copyOnWrite();
                awux awuxVar = (awux) mo52toBuilder11.instance;
                awuxVar.b |= 8;
                awuxVar.f = j16;
                return (awux) mo52toBuilder11.mo39build();
            case 13:
                long j17 = this.a;
                aopa mo52toBuilder12 = ((awux) obj).mo52toBuilder();
                mo52toBuilder12.copyOnWrite();
                awux awuxVar2 = (awux) mo52toBuilder12.instance;
                awuxVar2.b = 32 | awuxVar2.b;
                awuxVar2.h = j17;
                return (awux) mo52toBuilder12.mo39build();
            default:
                long j18 = this.a;
                aopa mo52toBuilder13 = ((awvb) obj).mo52toBuilder();
                mo52toBuilder13.copyOnWrite();
                awvb awvbVar = (awvb) mo52toBuilder13.instance;
                awvbVar.b |= 2;
                awvbVar.e = j18;
                return (awvb) mo52toBuilder13.mo39build();
        }
    }
}
