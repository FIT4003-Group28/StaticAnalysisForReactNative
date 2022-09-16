package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteFullException;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: agjk  reason: default package */
/* loaded from: classes.dex */
public final class agjk implements agwd {
    public long a;
    public final snc b;
    public final String c;
    public final azqb d;
    public final azqb e;
    public final azqb f;
    public final agis g;
    public final azqb h;
    public final azqb i;
    public final Set j;
    public final ahdf k;
    private final azqb m;
    private final aghc n;
    private final azqb o;
    private final azqb p;
    private final azqb q;
    private final aaqp r;
    private final amvn s;

    public agjk(snc sncVar, String str, azqb azqbVar, azqb azqbVar2, azqb azqbVar3, aghc aghcVar, azqb azqbVar4, agis agisVar, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, Set set, ahdf ahdfVar, aaqp aaqpVar, Set set2) {
        this.b = sncVar;
        this.c = str;
        this.m = azqbVar;
        this.d = azqbVar2;
        this.e = azqbVar3;
        this.n = aghcVar;
        this.f = azqbVar4;
        this.g = agisVar;
        this.h = azqbVar5;
        this.i = azqbVar6;
        this.o = azqbVar7;
        this.p = azqbVar8;
        this.q = azqbVar9;
        this.j = set;
        this.k = ahdfVar;
        this.r = aaqpVar;
        this.s = amvn.p(set2);
    }

    @Override // defpackage.agwd
    public final PlayerResponseModel a(agpu agpuVar) {
        agqv agqvVar = agpuVar instanceof agqv ? (agqv) agpuVar : null;
        if (agqvVar != null) {
            if (agqvVar.w()) {
                throw new agon();
            }
            if (agqvVar.x()) {
                agqu agquVar = agqvVar.j;
                if (agquVar == null || !agquVar.e()) {
                    throw new agoq();
                }
                throw new agor();
            }
            String m = agqvVar.m();
            PlayerResponseModel m2 = ((aglj) this.f.get()).m(m);
            if (m2 == null || m2.c == null) {
                throw new agon();
            }
            amzs it = this.s.iterator();
            PlayerResponseModel playerResponseModel = m2;
            while (it.hasNext()) {
                asaj a = ((agvu) it.next()).a(playerResponseModel.a, m);
                if (a != null) {
                    playerResponseModel = new PlayerResponseModel(a, this.b.d(), (aanz) this.p.get());
                }
            }
            long j = agkt.b;
            long j2 = 18000000;
            agqm b = ((agiw) this.o.get()).b(m, new agke((aipk) this.m.get(), this.b.d() + 18000000));
            if (b != null) {
                playerResponseModel = playerResponseModel.h((aanz) this.p.get(), b.c(), b.a(), this.b.d(), j, false);
                if (playerResponseModel.a.F.size() > 0) {
                    asaj asajVar = playerResponseModel.a;
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = asajVar.F.iterator();
                    while (it2.hasNext()) {
                        askq askqVar = (askq) it2.next();
                        if (askqVar.d.size() != 0) {
                            aopa mo52toBuilder = askqVar.mo52toBuilder();
                            mo52toBuilder.copyOnWrite();
                            ((askq) mo52toBuilder.instance).d = askq.emptyProtobufList();
                            Iterator it3 = askqVar.d.iterator();
                            while (it3.hasNext()) {
                                asaj asajVar2 = (asaj) this.r.a(((askp) it3.next()).c.I(), asaj.a);
                                if (asajVar2 != null) {
                                    aopc aopcVar = (aopc) asajVar2.mo52toBuilder();
                                    asan asanVar = ((asaj) aopcVar.instance).h;
                                    if (asanVar == null) {
                                        asanVar = asan.a;
                                    }
                                    aopa mo52toBuilder2 = asanVar.mo52toBuilder();
                                    mo52toBuilder2.copyOnWrite();
                                    ((asan) mo52toBuilder2.instance).e = asan.emptyProtobufList();
                                    mo52toBuilder2.copyOnWrite();
                                    ((asan) mo52toBuilder2.instance).d = asan.emptyProtobufList();
                                    agiw agiwVar = (agiw) this.o.get();
                                    asap asapVar = asajVar2.g;
                                    if (asapVar == null) {
                                        asapVar = asap.a;
                                    }
                                    Iterator it4 = it2;
                                    Iterator it5 = it3;
                                    agqm b2 = agiwVar.b(asapVar.c, new agke((aipk) this.m.get(), this.b.d() + 18000000));
                                    if (b2 != null) {
                                        FormatStreamModel d = b2.d(this.n.g());
                                        FormatStreamModel b3 = b2.b(this.n.g());
                                        if (d != null && (!d.A() || b3 != null)) {
                                            long max = Math.max(0L, j);
                                            mo52toBuilder2.copyOnWrite();
                                            asan asanVar2 = (asan) mo52toBuilder2.instance;
                                            asanVar2.b |= 1;
                                            asanVar2.c = max;
                                            if (!d.A()) {
                                                mo52toBuilder2.an(d.a);
                                            } else {
                                                mo52toBuilder2.ak(d.a);
                                            }
                                            if (b3 != null) {
                                                mo52toBuilder2.ak(b3.a);
                                            }
                                            asan asanVar3 = (asan) mo52toBuilder2.mo39build();
                                            aopcVar.copyOnWrite();
                                            asaj asajVar3 = (asaj) aopcVar.instance;
                                            asanVar3.getClass();
                                            asajVar3.h = asanVar3;
                                            asajVar3.b |= 16;
                                            asajVar2 = (asaj) aopcVar.mo39build();
                                        }
                                    }
                                    aopc aopcVar2 = (aopc) askp.a.createBuilder();
                                    aoob byteString = asajVar2.toByteString();
                                    aopcVar2.copyOnWrite();
                                    askp askpVar = (askp) aopcVar2.instance;
                                    askpVar.b |= 1;
                                    askpVar.c = byteString;
                                    mo52toBuilder.ar(aopcVar2);
                                    it2 = it4;
                                    it3 = it5;
                                    j2 = 18000000;
                                }
                            }
                            arrayList.add((askq) mo52toBuilder.mo39build());
                            it2 = it2;
                        }
                    }
                    aopc aopcVar3 = (aopc) asajVar.mo52toBuilder();
                    aopcVar3.copyOnWrite();
                    ((asaj) aopcVar3.instance).F = asaj.emptyProtobufList();
                    aopcVar3.ci(arrayList);
                    return new PlayerResponseModel((asaj) aopcVar3.mo39build(), this.b.d(), (aanz) this.p.get());
                }
            }
            return playerResponseModel;
        }
        throw new agoo();
    }

    @Override // defpackage.agwd
    public final agqu b(String str) {
        ylr.b();
        if (!this.g.z()) {
            return null;
        }
        zgh.m(str);
        agmx p = ((aglj) this.f.get()).l.p(str);
        if (p == null) {
            return null;
        }
        return p.d();
    }

    @Override // defpackage.agwd
    public final void c(String str) {
        ((aglj) this.f.get()).K(str);
        agmc agmcVar = (agmc) this.o.get();
        agqm b = agmcVar.b(str, null);
        if (b == null) {
            return;
        }
        agql agqlVar = b.b;
        if (agqlVar != null) {
            agmcVar.c(str, agqlVar.a());
        }
        agql agqlVar2 = b.a;
        if (agqlVar2 == null) {
            return;
        }
        agmcVar.c(str, agqlVar2.a());
    }

    public final void d(String str) {
        aglj agljVar = (aglj) this.f.get();
        agqv p = agljVar.p(str);
        if (p == null) {
            zep.b(str.length() != 0 ? "[Offline] Refresh video failed because snapshot invalid for ".concat(str) : new String("[Offline] Refresh video failed because snapshot invalid for "));
            return;
        }
        attl e = agljVar.e(str);
        ((agkg) this.h.get()).h(str, null, null, e, null, ((agvq) this.d.get()).U(e), p.m, 1, true, true, false);
    }

    public final void e(String str) {
        if (((agjz) this.i.get()).e(str) == null) {
            return;
        }
        aglj agljVar = (aglj) this.f.get();
        ((ahdl) this.q.get()).b(str);
        try {
            agljVar.G(str, ((ahdl) this.q.get()).l(str, 2, agljVar.i(str)), this.b.c(), true, (aanz) this.p.get());
        } catch (aart | SQLiteFullException unused) {
        }
    }

    @Override // defpackage.agwd
    public final void f(String str) {
        this.g.s(new agjj(this, str, 1));
    }

    @Override // defpackage.agwd
    public final void g(String str) {
        this.g.s(new agjj(this, str));
    }

    @Override // defpackage.agwd
    public final void h(String str) {
        this.g.s(new agjj(this, str, 2));
    }

    @Override // defpackage.agwd
    public final void i(String str) {
        zgh.m(str);
        this.g.s(new agjj(this, str, 3));
    }

    @Override // defpackage.agwd
    public final void j() {
        this.g.s(new Runnable() { // from class: agji
            @Override // java.lang.Runnable
            public final void run() {
                long j;
                long j2;
                agjk agjkVar = agjk.this;
                if (!agjkVar.g.z()) {
                    return;
                }
                long d = agjkVar.b.d();
                long j3 = agjkVar.a;
                if (j3 != 0 && d - j3 < agjk.l) {
                    return;
                }
                agjkVar.a = d;
                long r = ((agvq) agjkVar.d.get()).r(agjkVar.c);
                if (r <= 0) {
                    return;
                }
                atqv atqvVar = agjkVar.k.a.a().g;
                if (atqvVar == null) {
                    atqvVar = atqv.a;
                }
                if (atqvVar.A) {
                    Cursor query = ((aglj) agjkVar.f.get()).d.a.a().query("videosV2", new String[]{"last_refresh_timestamp", "player_response_proto"}, "media_status != ? AND media_status != ?", new String[]{Integer.toString(agqe.DELETED.q), Integer.toString(agqe.CANNOT_OFFLINE.q)}, null, null, null, null);
                    try {
                        query.getClass();
                        int columnIndexOrThrow = query.getColumnIndexOrThrow("player_response_proto");
                        j2 = Long.MAX_VALUE;
                        while (query.moveToNext()) {
                            PlayerResponseModel d2 = agpr.d(query, columnIndexOrThrow);
                            if (d2 != null) {
                                long j4 = query.getLong(query.getColumnIndexOrThrow("last_refresh_timestamp"));
                                atse u = d2.u();
                                if (j4 < j2 && u != null) {
                                    j2 = j4;
                                }
                            }
                        }
                        if (query != null) {
                            query.close();
                        }
                    } catch (Throwable th) {
                        if (query != null) {
                            try {
                                query.close();
                            } catch (Throwable unused) {
                            }
                        }
                        throw th;
                    }
                } else {
                    Cursor rawQuery = ((aglj) agjkVar.f.get()).d.a.a().rawQuery("SELECT min(last_refresh_timestamp) FROM videosV2", null);
                    try {
                        if (rawQuery.moveToFirst()) {
                            j = rawQuery.getLong(0);
                            if (rawQuery != null) {
                                rawQuery.close();
                            }
                        } else {
                            if (rawQuery != null) {
                                rawQuery.close();
                            }
                            j = Long.MAX_VALUE;
                        }
                        j2 = j;
                    } catch (Throwable th2) {
                        if (rawQuery != null) {
                            try {
                                rawQuery.close();
                            } catch (Throwable unused2) {
                            }
                        }
                        throw th2;
                    }
                }
                if (agjkVar.b.c() <= j2 + TimeUnit.SECONDS.toMillis(r)) {
                    return;
                }
                ((aguv) agjkVar.e.get()).c(agjkVar.c);
            }
        });
    }

    @Override // defpackage.agwd
    public final boolean k(agqu agquVar) {
        ylr.b();
        boolean z = false;
        if (this.g.z()) {
            String str = agquVar.a;
            aglj agljVar = (aglj) this.f.get();
            PlayerResponseModel m = agljVar.m(str);
            if (m != null) {
                atse atseVar = agquVar.b;
                aopc aopcVar = (aopc) m.a.mo52toBuilder();
                aopcVar.copyOnWrite();
                asaj asajVar = (asaj) aopcVar.instance;
                asajVar.k = atseVar;
                asajVar.b |= 128;
                z = agljVar.G(str, new PlayerResponseModel((asaj) aopcVar.mo39build(), m.b, PlayerResponseModel.d((aanz) this.p.get(), (asaj) aopcVar.mo39build(), m.b)), agquVar.d, false, (aanz) this.p.get());
                if (z) {
                    ((agjz) this.i.get()).t(agquVar.a);
                    return true;
                }
            } else {
                zep.b(str.length() != 0 ? "[Offline] No player response found for video: ".concat(str) : new String("[Offline] No player response found for video: "));
            }
        }
        return z;
    }
}
