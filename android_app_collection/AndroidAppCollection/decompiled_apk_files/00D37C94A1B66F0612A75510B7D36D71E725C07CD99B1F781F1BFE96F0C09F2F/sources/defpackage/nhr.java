package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer;
import java.util.List;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: nhr  reason: default package */
/* loaded from: classes3.dex */
public final class nhr extends ngj implements ynl {
    public final gea e;
    public final aafo f;
    public final acti g;
    public final aakn h;
    public final lya i;
    private final axxi j;
    private final gbh k;
    private final yni l;
    private final kse m;
    private final BrowseResponseModel n;

    public nhr(axxi axxiVar, gbh gbhVar, yni yniVar, gea geaVar, aafo aafoVar, acti actiVar, kse kseVar, aakn aaknVar, lya lyaVar, aucu aucuVar, BrowseResponseModel browseResponseModel) {
        super(aucuVar);
        this.j = axxiVar;
        this.k = gbhVar;
        this.l = yniVar;
        this.e = geaVar;
        this.f = aafoVar;
        this.g = actiVar;
        this.m = kseVar;
        this.n = browseResponseModel;
        this.h = aaknVar;
        this.i = lyaVar;
    }

    private final void k(asat asatVar) {
        final aucu aucuVar;
        Optional b = b();
        if ((asatVar.b & 4) == 0) {
            b.ifPresent(khv.i);
        } else if (!b.isPresent()) {
        } else {
            asau asauVar = asatVar.d;
            if (asauVar == null) {
                asauVar = asau.a;
            }
            if (asauVar.b == 53272665) {
                asau asauVar2 = asatVar.d;
                if (asauVar2 == null) {
                    asauVar2 = asau.a;
                }
                if (asauVar2.b == 53272665) {
                    aucuVar = (aucu) asauVar2.c;
                } else {
                    aucuVar = aucu.a;
                }
            } else {
                aucuVar = null;
            }
            Optional.ofNullable(this.d).ifPresent(new Consumer() { // from class: nhl
                @Override // j$.util.function.Consumer
                public final void accept(Object obj) {
                    nhr nhrVar = nhr.this;
                    ((nha) obj).bm(nhrVar.a, aucuVar);
                }

                @Override // j$.util.function.Consumer
                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return consumer.getClass();
                }
            });
            this.a = aucuVar;
        }
    }

    @Override // defpackage.ngj
    public final amvn a(amvn amvnVar) {
        atep atepVar;
        atep atepVar2;
        aucu aucuVar = (aucu) this.a;
        amvl i = amvn.i();
        i.j(amvnVar);
        aucm aucmVar = aucuVar.y;
        if (aucmVar == null) {
            aucmVar = aucm.a;
        }
        nhq nhqVar = null;
        i.j(j(aucmVar.b ? new nhn(this, aucuVar.h) : null));
        if (!aucuVar.G.isEmpty()) {
            nhqVar = new nhq(this, aucuVar.G, aucuVar.F.I());
        }
        i.j(j(nhqVar));
        arlx arlxVar = this.n.a.k;
        if (arlxVar == null) {
            arlxVar = arlx.a;
        }
        if (arlxVar.b == 66439850) {
            atepVar = (atep) arlxVar.c;
        } else {
            atepVar = atep.a;
        }
        i.j((Iterable) Collection.EL.stream(atepVar.c).map(new nhm(this)).filter(lws.m).map(meg.k).collect(amsf.a));
        aucs aucsVar = aucuVar.M;
        if (aucsVar == null) {
            aucsVar = aucs.a;
        }
        if (aucsVar.b == 66439850) {
            atepVar2 = (atep) aucsVar.c;
        } else {
            atepVar2 = atep.a;
        }
        i.j((List) Collection.EL.stream(atepVar2.c).map(new nhm(this, 1)).collect(amsf.a));
        return i.g();
    }

    @Override // defpackage.ngj
    public final CharSequence c() {
        arag aragVar = null;
        if (!this.j.b().booleanValue()) {
            aucu aucuVar = (aucu) this.a;
            if ((aucuVar.b & 2048) != 0 && (aragVar = aucuVar.n) == null) {
                aragVar = arag.a;
            }
            return ajgl.b(aragVar);
        }
        return null;
    }

    @Override // defpackage.ngj
    public final void e() {
        this.l.g(this);
    }

    @Override // defpackage.ngj
    public final void g() {
        this.m.b(((aucu) this.a).h);
        this.l.m(this);
    }

    @Override // defpackage.ngj
    public final boolean h() {
        return ((aucu) this.a).m;
    }

    @Override // defpackage.ngj
    public final boolean i() {
        aucu aucuVar = (aucu) this.a;
        if ((aucuVar.b & 256) != 0) {
            asos asosVar = aucuVar.l;
            if (asosVar == null) {
                asosVar = asos.a;
            }
            if (((asosVar.b >> 24) & PrivateKeyType.INVALID) < 255) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i != 0) {
                if (i == 1) {
                    gds gdsVar = (gds) obj;
                    this.k.c(false);
                    return null;
                } else if (i == 2) {
                    abbk abbkVar = (abbk) obj;
                    if (this.a == null || !b().isPresent() || !TextUtils.equals(((aucu) this.a).h, abbkVar.a)) {
                        return null;
                    }
                    k(abbkVar.c);
                    return null;
                } else if (i == 3) {
                    abbl abblVar = (abbl) obj;
                    if (this.a == null || !b().isPresent() || !TextUtils.equals(((aucu) this.a).h, abblVar.a)) {
                        return null;
                    }
                    asat asatVar = abblVar.d;
                    if ((asatVar.b & 4) == 0) {
                        return null;
                    }
                    k(asatVar);
                    return null;
                } else if (i == 4) {
                    abbn abbnVar = (abbn) obj;
                    if (this.a == null || !b().isPresent() || !TextUtils.equals(((aucu) this.a).h, abbnVar.a)) {
                        return null;
                    }
                    k(abbnVar.c);
                    return null;
                } else {
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("unsupported op code: ");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
                }
            }
            gae gaeVar = (gae) obj;
            aucu aucuVar = (aucu) this.a;
            if ((aucuVar.c & 4) == 0 || !TextUtils.equals(aucuVar.h, gaeVar.b())) {
                return null;
            }
            asow asowVar = ((aucu) this.a).A;
            if (asowVar == null) {
                asowVar = asow.a;
            }
            asov asovVar = asowVar.c;
            if (asovVar == null) {
                asovVar = asov.a;
            }
            aopc aopcVar = (aopc) asovVar.mo52toBuilder();
            aspb a = gaeVar.a();
            aopcVar.copyOnWrite();
            asov asovVar2 = (asov) aopcVar.instance;
            asovVar2.d = a.e;
            asovVar2.b |= 2;
            asov asovVar3 = (asov) aopcVar.mo39build();
            asow asowVar2 = ((aucu) this.a).A;
            if (asowVar2 == null) {
                asowVar2 = asow.a;
            }
            aopa mo52toBuilder = asowVar2.mo52toBuilder();
            mo52toBuilder.copyOnWrite();
            asow asowVar3 = (asow) mo52toBuilder.instance;
            asovVar3.getClass();
            asowVar3.c = asovVar3;
            asowVar3.b |= 1;
            asow asowVar4 = (asow) mo52toBuilder.mo39build();
            aopa mo52toBuilder2 = ((aucu) this.a).mo52toBuilder();
            mo52toBuilder2.copyOnWrite();
            aucu aucuVar2 = (aucu) mo52toBuilder2.instance;
            asowVar4.getClass();
            aucuVar2.A = asowVar4;
            aucuVar2.c |= 4;
            this.a = (aucu) mo52toBuilder2.mo39build();
            return null;
        }
        return new Class[]{gae.class, gds.class, abbk.class, abbl.class, abbn.class};
    }

    private static Iterable j(Object obj) {
        if (obj == null) {
            return amyg.a;
        }
        return amvn.r(obj);
    }
}
