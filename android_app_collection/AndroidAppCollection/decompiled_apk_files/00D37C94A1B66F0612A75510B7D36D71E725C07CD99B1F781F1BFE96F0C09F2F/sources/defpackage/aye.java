package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aye  reason: default package */
/* loaded from: classes2.dex */
public final class aye implements asv {
    private final asv a;
    private final ayd b;
    private boolean c;

    public aye(asv asvVar, ayd aydVar) {
        this.a = asvVar;
        this.b = aydVar;
    }

    @Override // defpackage.asv
    public final Map a() {
        return this.a.a();
    }

    @Override // defpackage.asv
    public final void b(atk atkVar) {
        ptx.a(atkVar);
        this.a.b(atkVar);
    }

    @Override // defpackage.ast
    public final int g(byte[] bArr, int i, int i2) {
        return this.a.g(bArr, i, i2);
    }

    @Override // defpackage.asv
    public final long h(asy asyVar) {
        Long l;
        asy asyVar2 = asyVar;
        afew afewVar = (afew) this.b;
        PlayerConfigModel c = afewVar.c.c();
        if (c != null) {
            aqfn aqfnVar = c.c.d;
            if (aqfnVar == null) {
                aqfnVar = aqfn.a;
            }
            aqfo aqfoVar = aqfnVar.d;
            if (aqfoVar == null) {
                aqfoVar = aqfo.a;
            }
            if (aqfoVar.c) {
                if (!"/videoplayback".equals(asyVar2.a.getPath())) {
                    asyVar2 = new asy(asyVar2.a, asyVar2.b, asyVar2.c, asyVar2.d, afew.a, asyVar2.g, asyVar2.h, asyVar2.i, asyVar2.j, asyVar2.k);
                } else {
                    if (asyVar2.d != null) {
                        afus.b(2, 6, "AbrStateDataSpec: Unexpected http body.");
                    }
                    aejz aejzVar = asyVar2.k;
                    byte[] bArr = null;
                    Long l2 = null;
                    if (true != (aejzVar instanceof aejz)) {
                        aejzVar = null;
                    }
                    aqfn aqfnVar2 = c.c.d;
                    if (aqfnVar2 == null) {
                        aqfnVar2 = aqfn.a;
                    }
                    aqfo aqfoVar2 = aqfnVar2.d;
                    if (aqfoVar2 == null) {
                        aqfoVar2 = aqfo.a;
                    }
                    if (aqfoVar2.f) {
                        if (aejzVar == null) {
                            aejzVar = aejz.a().a();
                        }
                        aejy aejyVar = new aejy((aejz) aejzVar);
                        aejyVar.d(true);
                        aejzVar = aejyVar.a();
                    }
                    Object obj = aejzVar;
                    aqfn aqfnVar3 = c.c.d;
                    if (aqfnVar3 == null) {
                        aqfnVar3 = aqfn.a;
                    }
                    aqfo aqfoVar3 = aqfnVar3.d;
                    if (aqfoVar3 == null) {
                        aqfoVar3 = aqfo.a;
                    }
                    if (!aqfoVar3.e) {
                        if (obj != null) {
                            aejz aejzVar2 = (aejz) obj;
                            l2 = aejzVar2.d;
                            l = aejzVar2.a;
                        } else {
                            l = null;
                        }
                        aopa createBuilder = ork.a.createBuilder(afewVar.d.get());
                        aoob d = afewVar.c.d();
                        if (d != null) {
                            createBuilder.copyOnWrite();
                            ork orkVar = (ork) createBuilder.instance;
                            orkVar.b |= 4;
                            orkVar.e = d;
                        }
                        aopa createBuilder2 = orn.a.createBuilder();
                        oqu a = afewVar.c.a(c, ((Boolean) afewVar.b.get()).booleanValue(), l2 != null ? l2.longValue() : -9223372036854775807L, afewVar.e);
                        createBuilder2.copyOnWrite();
                        orn ornVar = (orn) createBuilder2.instance;
                        a.getClass();
                        ornVar.c = a;
                        ornVar.b |= 1;
                        ork orkVar2 = (ork) createBuilder.mo39build();
                        createBuilder2.copyOnWrite();
                        orn ornVar2 = (orn) createBuilder2.instance;
                        orkVar2.getClass();
                        ornVar2.f = orkVar2;
                        ornVar2.b |= 8;
                        if ((c.N().b & 2) != 0) {
                            aqfo aqfoVar4 = c.N().d;
                            if (aqfoVar4 == null) {
                                aqfoVar4 = aqfo.a;
                            }
                            if ((aqfoVar4.b & 4) != 0) {
                                aqfo aqfoVar5 = c.N().d;
                                if (aqfoVar5 == null) {
                                    aqfoVar5 = aqfo.a;
                                }
                                aoob aoobVar = aqfoVar5.d;
                                createBuilder2.copyOnWrite();
                                orn ornVar3 = (orn) createBuilder2.instance;
                                aoobVar.getClass();
                                ornVar3.b |= 2;
                                ornVar3.d = aoobVar;
                            }
                        }
                        if (c.ao() && l != null && l.longValue() != -9223372036854775807L) {
                            long longValue = l.longValue();
                            createBuilder2.copyOnWrite();
                            orn ornVar4 = (orn) createBuilder2.instance;
                            ornVar4.b |= 4;
                            ornVar4.e = longValue;
                        }
                        bArr = ((orn) createBuilder2.mo39build()).toByteArray();
                    }
                    asx asxVar = new asx();
                    asxVar.a = asyVar2.a;
                    asxVar.c = 2;
                    asxVar.d = bArr;
                    asxVar.b = asyVar2.b;
                    asxVar.f = asyVar2.g;
                    asxVar.g = asyVar2.h;
                    asxVar.h = asyVar2.i;
                    asxVar.i = asyVar2.j;
                    asxVar.e = afew.a;
                    asxVar.j = obj;
                    asyVar2 = asxVar.a();
                }
            }
        }
        this.c = true;
        return this.a.h(asyVar2);
    }

    @Override // defpackage.asv
    public final Uri i() {
        Uri i = this.a.i();
        if (i == null) {
            return null;
        }
        return i;
    }

    @Override // defpackage.asv
    public final void j() {
        if (this.c) {
            this.c = false;
            this.a.j();
        }
    }
}
