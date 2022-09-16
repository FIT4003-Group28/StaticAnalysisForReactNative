package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.zip.GZIPInputStream;
/* compiled from: PG */
/* renamed from: aenq  reason: default package */
/* loaded from: classes.dex */
public final class aenq {
    public final aenm a;
    public orm b;
    public ByteBuffer d;
    public ByteBuffer e;
    public org c = null;
    public final LinkedHashMap f = new LinkedHashMap();
    public final LinkedHashMap g = new LinkedHashMap();

    public aenq(aenm aenmVar) {
        this.a = aenmVar;
    }

    public static void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int min = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        if (min == 0) {
            return;
        }
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(min);
        byteBuffer2.put(slice);
        byteBuffer.position(byteBuffer.position() + min);
    }

    public final void b(byte[] bArr, Integer num, boolean z, boolean z2) {
        byte[] c;
        int i;
        orc orcVar = (orc) this.f.get(num);
        if (orcVar != null) {
            if (orcVar.j && z) {
                return;
            }
            int b = ord.b(orcVar.i);
            if (b != 0 && b == 3) {
                try {
                    c = anek.c(new GZIPInputStream(new ByteArrayInputStream(bArr)));
                } catch (IOException unused) {
                    throw new aenn(107, "info.gzip");
                }
            } else {
                c = bArr;
            }
            Long l = (Long) this.g.get(num);
            if (l == null) {
                throw new aenn(107, "info.null-byterange");
            }
            aens a = aens.a(l.longValue(), l.longValue() + c.length);
            this.g.put(num, Long.valueOf(a.b));
            aent aentVar = new aent(c, orcVar.d, orcVar.e, orcVar.f, (orcVar.b & 512) != 0 ? orcVar.k : -1L, z2, z, orcVar.g, orcVar.l, a);
            if (orcVar.j) {
                aenm aenmVar = this.a;
                synchronized (aenmVar) {
                    ((aeks) aenmVar).f(aentVar.c);
                    ((aeks) aenmVar).a.c(aentVar);
                    if (aentVar.g) {
                        aeny.g("Encrypted init segment.");
                        return;
                    }
                    if (aank.c().contains(Integer.valueOf(aentVar.d))) {
                        ((aeks) aenmVar).n.aj();
                        i = 2;
                    } else if (aank.b().contains(Integer.valueOf(aentVar.d))) {
                        ((aeks) aenmVar).n.J();
                        i = 1;
                    } else {
                        int i2 = aentVar.d;
                        StringBuilder sb = new StringBuilder(42);
                        sb.append("Invalid init segment received: ");
                        sb.append(i2);
                        aeny.g(sb.toString());
                        return;
                    }
                    aems aemsVar = ((aeks) aenmVar).a;
                    aemd aemdVar = new aemd(aentVar, i);
                    if (aemdVar.b - 1 != 0) {
                        aemsVar.j.b(aemdVar);
                        return;
                    } else {
                        aemsVar.i.b(aemdVar);
                        return;
                    }
                }
            }
            this.a.k(aentVar);
            return;
        }
        throw new aenn(101, "info.null-media-header");
    }

    public final void c(org orgVar, byte[] bArr) {
        attt atttVar;
        ayny aynyVar;
        orm ormVar = orm.UNKNOWN;
        int a = ord.a(orgVar.c);
        if (a == 0) {
            a = 9;
        }
        int i = a - 1;
        boolean z = false;
        int i2 = 1;
        if (i == 0) {
            ore oreVar = orgVar.i;
            if (oreVar == null) {
                oreVar = ore.a;
            }
            if ((oreVar.b & 1) != 0) {
                ore oreVar2 = orgVar.i;
                if (oreVar2 == null) {
                    oreVar2 = ore.a;
                }
                if ((oreVar2.b & 2) != 0) {
                    ore oreVar3 = orgVar.i;
                    if (oreVar3 == null) {
                        oreVar3 = ore.a;
                    }
                    if (oreVar3.c.d() != 0) {
                        aenm aenmVar = this.a;
                        aoob x = aoob.x(bArr);
                        ore oreVar4 = orgVar.i;
                        if (oreVar4 == null) {
                            oreVar4 = ore.a;
                        }
                        aoob aoobVar = oreVar4.c;
                        ore oreVar5 = orgVar.i;
                        if (oreVar5 == null) {
                            oreVar5 = ore.a;
                        }
                        aoob aoobVar2 = oreVar5.d;
                        ore oreVar6 = orgVar.i;
                        if (oreVar6 == null) {
                            oreVar6 = ore.a;
                        }
                        int b = aqgn.b(oreVar6.e);
                        if (b == 0) {
                            b = 1;
                        }
                        synchronized (aenmVar) {
                            if (!((aeks) aenmVar).j) {
                                ((aeks) aenmVar).n.Y();
                                ((aeks) aenmVar).j = true;
                                z = true;
                            } else {
                                aeny.g("Multiple player responses received.");
                            }
                        }
                        if (!z) {
                            return;
                        }
                        aeks aeksVar = (aeks) aenmVar;
                        if (aeksVar.g == null) {
                            aeksVar.m.c("response", new IllegalStateException("Received PlayerResponse for a media-only Onesie request."));
                            return;
                        }
                        anko q = anko.q(anlz.q(aekp.a(x, aoobVar, aoobVar2, b)));
                        aela aelaVar = aeksVar.g;
                        aelaVar.getClass();
                        ankt i3 = anii.i(q, new aekl(aelaVar, 1), aeksVar.d.r ? anjk.a : aeksVar.b);
                        aela aelaVar2 = aeksVar.g;
                        aelaVar2.getClass();
                        anlz.A(anii.i(i3, new aekl(aelaVar2), aeksVar.d.r ? anjk.a : aeksVar.b), aeksVar.e, anjk.a);
                        return;
                    }
                }
            }
            throw new aenn(103, "Missing crypto params");
        } else if (i == 2) {
            this.a.c(bArr);
        } else if (i == 6) {
            String str = new String(bArr);
            aeks aeksVar2 = (aeks) this.a;
            zgp b2 = zgp.b(aeksVar2.l);
            b2.a = str;
            if (!aeksVar2.a().isEmpty()) {
                for (String str2 : aeksVar2.a()) {
                    b2.j(str2);
                }
                b2.g("ompr", "1");
            }
            aeksVar2.m(b2.a(), 0L);
        } else if (i != 11) {
            switch (i) {
                case 14:
                    Set hashSet = new HashSet();
                    for (String str3 : orgVar.k) {
                        try {
                            hashSet.add(Integer.valueOf(Integer.parseInt(str3)));
                        } catch (NumberFormatException unused) {
                            hashSet = Collections.emptySet();
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        this.a.e(orgVar.d, hashSet);
                        return;
                    } else {
                        afus.e(1, 8, "RESTRICTED_FORMATS_HINT header with no itags. Ignored.", 1.0E-4d);
                        return;
                    }
                case 15:
                    aenm aenmVar2 = this.a;
                    aent aentVar = new aent(new byte[0], orgVar.d, Integer.parseInt(orgVar.e), orgVar.g, (orgVar.b & 32768) != 0 ? orgVar.m : -1L, false, false, orgVar.f, orgVar.h, aens.a(0L, 0L));
                    aeks aeksVar3 = (aeks) aenmVar2;
                    aeksVar3.f(aentVar.c);
                    aeksVar3.a.i(aentVar.c, aentVar.d, aentVar.e, aentVar.f, aentVar.j);
                    return;
                case 16:
                    try {
                        int parseInt = Integer.parseInt(orgVar.e);
                        ampq ampqVar = amon.a;
                        long j = orgVar.j;
                        if (j > 0) {
                            ampqVar = ampq.j(Long.valueOf(j));
                        }
                        ampq ampqVar2 = ampqVar;
                        ampq ampqVar3 = amon.a;
                        if ((orgVar.b & 4096) != 0) {
                            orf orfVar = orgVar.l;
                            if (orfVar == null) {
                                orfVar = orf.a;
                            }
                            if (orfVar.b >= 0) {
                                orf orfVar2 = orgVar.l;
                                if (orfVar2 == null) {
                                    orfVar2 = orf.a;
                                }
                                if (orfVar2.c > 0) {
                                    orf orfVar3 = orgVar.l;
                                    if (orfVar3 == null) {
                                        orfVar3 = orf.a;
                                    }
                                    long j2 = orfVar3.b;
                                    orf orfVar4 = orgVar.l;
                                    if (orfVar4 == null) {
                                        orfVar4 = orf.a;
                                    }
                                    long j3 = orfVar4.c;
                                    if (j3 < j2) {
                                        afus.b(1, 8, "end_timestamp_less_than_start_timestamp");
                                        j3 = j2;
                                    }
                                    ampqVar3 = ampq.j(new aeno(j2, j3));
                                }
                            }
                        }
                        aenp aenpVar = new aenp(orgVar.d, parseInt, orgVar.g, (orgVar.b & 32768) != 0 ? orgVar.m : -1L, orgVar.f, ampqVar2, ampqVar3);
                        aeks aeksVar4 = (aeks) this.a;
                        aeksVar4.f(aenpVar.a);
                        aeksVar4.a.h(aenpVar);
                        return;
                    } catch (NumberFormatException unused2) {
                        afus.b(1, 8, "STREAM_METADATA invalid itag received.");
                        return;
                    }
                default:
                    switch (i) {
                        case 23:
                            aenm aenmVar3 = this.a;
                            ajfx ajfxVar = orgVar.n;
                            if (ajfxVar == null) {
                                ajfxVar = ajfx.a;
                            }
                            aeks aeksVar5 = (aeks) aenmVar3;
                            aeksVar5.f(ajfxVar.b);
                            aeksVar5.a.g(ajfxVar);
                            return;
                        case 24:
                            aenm aenmVar4 = this.a;
                            ajfx ajfxVar2 = orgVar.n;
                            if (ajfxVar2 == null) {
                                ajfxVar2 = ajfx.a;
                            }
                            ((aeks) aenmVar4).a.j(ajfxVar2);
                            return;
                        case 25:
                            try {
                                oqv oqvVar = (oqv) aopi.parseFrom(oqv.a, bArr, aoos.b());
                                aenm aenmVar5 = this.a;
                                arhd a2 = ((aeks) aenmVar5).c.a();
                                if (a2 != null) {
                                    atdy atdyVar = a2.i;
                                    if (atdyVar == null) {
                                        atdyVar = atdy.a;
                                    }
                                    attv attvVar = atdyVar.d;
                                    if (attvVar == null) {
                                        attvVar = attv.a;
                                    }
                                    atttVar = attvVar.g;
                                    if (atttVar == null) {
                                        atttVar = attt.b;
                                    }
                                } else {
                                    atttVar = attt.b;
                                }
                                if (atttVar.B || (aynyVar = ((aeks) aenmVar5).k) == null) {
                                    return;
                                }
                                aoob aoobVar3 = oqvVar.b;
                                aoob aoobVar4 = oqvVar.c;
                                aoob aoobVar5 = oqvVar.d;
                                int b3 = aqgn.b(oqvVar.e);
                                if (b3 != 0) {
                                    i2 = b3;
                                }
                                aynyVar.a(aekp.a(aoobVar3, aoobVar4, aoobVar5, i2));
                                return;
                            } catch (aopx unused3) {
                                throw new aenn(110, "unparseable_encrypted_innertube_response_part");
                            }
                        case 26:
                            aenm aenmVar6 = this.a;
                            aooo aoooVar = orgVar.o;
                            if (aoooVar == null) {
                                aoooVar = aooo.a;
                            }
                            aeks aeksVar6 = (aeks) aenmVar6;
                            aeksVar6.i.set(aeksVar6.h.d() + aost.a(aoooVar));
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.a.j(new String(bArr));
        }
    }

    public final void d(org orgVar) {
        c(orgVar, new byte[0]);
    }
}
