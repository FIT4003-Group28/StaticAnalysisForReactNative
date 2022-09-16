package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jit  reason: default package */
/* loaded from: classes3.dex */
public final class jit implements jic {
    private final Context a;
    private final aagi b;
    private final jie c;
    private final snc d;
    private final fbw e;

    public jit(Context context, aagi aagiVar, jie jieVar, snc sncVar, fbw fbwVar) {
        this.a = context;
        this.b = aagiVar;
        this.c = jieVar;
        this.d = sncVar;
        this.e = fbwVar;
    }

    private static void i(aqph aqphVar, amuk amukVar) {
        int size = amukVar.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            awkx b = ((awkp) amukVar.get(i2)).b();
            if (b != null && b.g() && b.getThumbnail() != null) {
                avhn[] avhnVarArr = {b.getThumbnail()};
                for (int i3 = 0; i3 <= 0; i3++) {
                    avhn avhnVar = avhnVarArr[i3];
                    aopa aopaVar = aqphVar.a;
                    aopaVar.copyOnWrite();
                    aqpm aqpmVar = (aqpm) aopaVar.instance;
                    aqpm aqpmVar2 = aqpm.a;
                    avhnVar.getClass();
                    aopu aopuVar = aqpmVar.d;
                    if (!aopuVar.c()) {
                        aqpmVar.d = aopi.mutableCopy(aopuVar);
                    }
                    aqpmVar.d.add(avhnVar);
                }
                i++;
                if (i >= 2) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.jic
    public final int a() {
        return 156;
    }

    @Override // defpackage.jic
    public final int b() {
        return 192;
    }

    @Override // defpackage.jic
    public final /* bridge */ /* synthetic */ jia c(aajj aajjVar, String str, jib jibVar) {
        awkj awkjVar;
        avhn avhnVar;
        awjm awjmVar = (awjm) aajjVar;
        aagh c = this.b.c();
        str.getClass();
        aqxo.z(!str.isEmpty(), "key cannot be empty");
        aopa createBuilder = aqpn.a.createBuilder();
        createBuilder.copyOnWrite();
        aqpn aqpnVar = (aqpn) createBuilder.instance;
        aqpnVar.c |= 1;
        aqpnVar.f = str;
        aqpj aqpjVar = new aqpj(createBuilder);
        if (awjmVar == null) {
            return jia.a(aqpjVar.a(c));
        }
        awkg b = awjmVar.b();
        if (b == null) {
            return jia.a(aqpjVar.a(c));
        }
        aajj b2 = b.b.b(b.c.f);
        aqxo.z(b2 == null || (b2 instanceof awji), "entityFromStore is not instance of YtMainChannelEntityModel, key=channelOwner");
        awji awjiVar = (awji) b2;
        String playlistId = b.getPlaylistId();
        int size = b.f().size();
        String title = b.getTitle();
        aopa aopaVar = aqpjVar.a;
        aopaVar.copyOnWrite();
        aqpn aqpnVar2 = (aqpn) aopaVar.instance;
        title.getClass();
        aqpnVar2.c |= 4;
        aqpnVar2.h = title;
        String title2 = awjiVar == null ? "" : awjiVar.getTitle();
        aopa aopaVar2 = aqpjVar.a;
        aopaVar2.copyOnWrite();
        aqpn aqpnVar3 = (aqpn) aopaVar2.instance;
        title2.getClass();
        aqpnVar3.c |= 8;
        aqpnVar3.i = title2;
        aopc aopcVar = (aopc) awbp.a.createBuilder();
        String playlistId2 = b.getPlaylistId();
        aopcVar.copyOnWrite();
        awbp awbpVar = (awbp) aopcVar.instance;
        playlistId2.getClass();
        awbpVar.b |= 1;
        awbpVar.c = playlistId2;
        aopcVar.copyOnWrite();
        awbp awbpVar2 = (awbp) aopcVar.instance;
        awbpVar2.b |= 2;
        awbpVar2.d = 156;
        String f = emn.f((awbp) aopcVar.mo39build());
        aopa aopaVar3 = aqpjVar.a;
        aopaVar3.copyOnWrite();
        aqpn aqpnVar4 = (aqpn) aopaVar3.instance;
        f.getClass();
        aqpnVar4.c |= 256;
        aqpnVar4.l = f;
        aopa aopaVar4 = aqpjVar.a;
        aopaVar4.copyOnWrite();
        aqpn aqpnVar5 = (aqpn) aopaVar4.instance;
        playlistId.getClass();
        aqpnVar5.c |= 2;
        aqpnVar5.g = playlistId;
        Integer valueOf = Integer.valueOf(size);
        aopa aopaVar5 = aqpjVar.a;
        int intValue = valueOf.intValue();
        aopaVar5.copyOnWrite();
        aqpn aqpnVar6 = (aqpn) aopaVar5.instance;
        aqpnVar6.c |= 32;
        aqpnVar6.k = intValue;
        String quantityString = this.a.getResources().getQuantityString(R.plurals.video_count, size, valueOf);
        aopa aopaVar6 = aqpjVar.a;
        aopaVar6.copyOnWrite();
        aqpn aqpnVar7 = (aqpn) aopaVar6.instance;
        quantityString.getClass();
        aqpnVar7.c |= 16;
        aqpnVar7.j = quantityString;
        awbp k = hhw.k(str, this.e);
        if (k == null || !k.qn(aqpo.b)) {
            awkjVar = awkj.PLAYLIST_THUMBNAIL_STYLE_UNKNOWN;
        } else {
            awkjVar = awkj.b(((aqpo) k.qm(aqpo.b)).d);
            if (awkjVar == null) {
                awkjVar = awkj.PLAYLIST_THUMBNAIL_STYLE_UNKNOWN;
            }
        }
        aagh c2 = this.b.c();
        amuk amukVar = (amuk) c2.f(emn.t(playlistId)).g(awkg.class).w(iyw.o).N(iyw.q).u(new gna(c2, 2)).I(jgs.e).aq().E(iyw.p).U();
        aueh auehVar = (aueh) b.getThumbnailStyleDataMap().get(Integer.valueOf(awkjVar.f));
        int ordinal = awkjVar.ordinal();
        if (ordinal == 2) {
            aqph a = aqpi.a();
            a.c(awkjVar);
            int size2 = amukVar.size();
            int i = 0;
            for (int i2 = 0; i2 < size2; i2++) {
                awkx b3 = ((awkp) amukVar.get(i2)).b();
                if (b3 != null && b3.g() && b3.getThumbnail() != null) {
                    a.b(b3.getThumbnail());
                    i++;
                    if (i >= 2) {
                        break;
                    }
                }
            }
            int size3 = amukVar.size();
            if (size3 > 2) {
                i(a, amukVar.subList(2, size3));
            }
            aqpjVar.c(a.a(this.b.c()).b);
        } else if (ordinal == 3 || ordinal == 4) {
            aqph a2 = aqpi.a();
            a2.c(awkjVar);
            if (auehVar != null) {
                auei aueiVar = auehVar.a().b;
                if ((aueiVar.b & 1) != 0) {
                    avhn[] avhnVarArr = new avhn[1];
                    avhn avhnVar2 = aueiVar.c;
                    if (avhnVar2 == null) {
                        avhnVar2 = avhn.a;
                    }
                    avhnVarArr[0] = avhnVar2;
                    a2.b(avhnVarArr);
                }
            }
            i(a2, amukVar);
            aqpjVar.c(a2.a(this.b.c()).b);
        } else {
            if (auehVar != null) {
                auej auejVar = auehVar.b;
                if (auejVar.b == 1) {
                    avhnVar = (avhn) auejVar.c;
                } else {
                    avhnVar = avhn.a;
                }
                aopa aopaVar7 = aqpjVar.a;
                aopaVar7.copyOnWrite();
                aqpn aqpnVar8 = (aqpn) aopaVar7.instance;
                avhnVar.getClass();
                aqpnVar8.e = avhnVar;
                aqpnVar8.d = 6;
            }
            aqpjVar.d(Integer.valueOf(actj.DOWNLOADS_PAGE_PLAYLIST.II));
            return jia.a(aqpjVar.a(c));
        }
        String n = nni.n(this.a.getResources(), this.d, awjmVar.getLastSyncedTimestampMillis().longValue());
        aopa aopaVar8 = aqpjVar.a;
        aopaVar8.copyOnWrite();
        aqpn aqpnVar9 = (aqpn) aopaVar8.instance;
        n.getClass();
        aqpnVar9.c |= 2048;
        aqpnVar9.o = n;
        aqpjVar.d(Integer.valueOf(actj.OFFLINE_BUNDLE_ITEM_RENDERER.II));
        return jia.a(aqpjVar.a(c));
    }

    @Override // defpackage.jic
    public final ampq d(String str) {
        awbp k = hhw.k(str, this.e);
        return k == null ? amon.a : ampq.j(emn.g(k.c));
    }

    @Override // defpackage.jic
    public final amvn e(String str) {
        awbp k = hhw.k(str, this.e);
        if (k == null) {
            return amyg.a;
        }
        String str2 = k.c;
        String g = emn.g(str2);
        String t = emn.t(str2);
        awkg awkgVar = (awkg) this.b.c().f(t).g(awkg.class).W();
        amvl i = amvn.i();
        i.i(this.c.a(g), this.c.a(t));
        if (awkgVar != null) {
            i.c(this.c.a(awkgVar.c.f));
        }
        return i.g();
    }

    @Override // defpackage.jic
    public final Class f() {
        return awjm.class;
    }

    @Override // defpackage.jic
    public final Class g() {
        return aqpl.class;
    }

    @Override // defpackage.jic
    public final mhk h(String str) {
        return new mhk(2, str);
    }
}
