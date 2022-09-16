package defpackage;

import com.google.protos.youtube.api.innertube.RelatedChipCloudRendererOuterClass;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: PG */
/* renamed from: odf  reason: default package */
/* loaded from: classes3.dex */
public abstract class odf extends ajwl implements odd, lsa, ynl {
    public final ghc a;
    private List b;
    private int o;
    private int p;

    public odf(ajyi ajyiVar, yni yniVar, auuf auufVar, List list, int i, ajxu ajxuVar, ampq ampqVar, CharSequence charSequence, apzg apzgVar, akad akadVar, akam akamVar) {
        super(ajyiVar, yniVar, auufVar, list, i, ajxuVar, ampqVar, null, charSequence, apzgVar, 1, false, akadVar, null, akamVar);
        this.d.mG(new ajyl(this));
        if ((auufVar.b & 8) != 0) {
            aunb aunbVar = auufVar.i;
            if ((aunbVar == null ? aunb.a : aunbVar).qn(RelatedChipCloudRendererOuterClass.relatedChipCloudRenderer)) {
                aunb aunbVar2 = auufVar.i;
                aumr aumrVar = (aumr) (aunbVar2 == null ? aunb.a : aunbVar2).qm(RelatedChipCloudRendererOuterClass.relatedChipCloudRenderer);
                if (this.e.contains(aumrVar) && (aumrVar.b & 2) != 0) {
                    ajrj ajrjVar = this.d;
                    int bv = awwc.bv(aumrVar.d);
                    ajrjVar.mG(new ode(this, bv == 0 ? 1 : bv));
                }
            }
        }
        yniVar.h(this, odf.class);
        this.a = new ghc();
    }

    private final void v(Collection collection) {
        List list = this.m;
        list.clear();
        list.addAll(collection);
        this.f.clear();
        this.f.addAll(0, collection);
    }

    @Override // defpackage.odd
    public final int b() {
        return this.o;
    }

    @Override // defpackage.odd
    public final int e() {
        return this.p;
    }

    @Override // defpackage.odd
    public final void g() {
        List list = this.b;
        if (list != null) {
            v(list);
        }
        this.o++;
    }

    @Override // defpackage.odd
    public final void h() {
        if (this.b == null) {
            this.b = new ArrayList(this.m);
        }
        ajsm ajsmVar = this.f;
        ajsmVar.h(0, ajsmVar.size());
        for (int i = 0; i < 16; i++) {
            ajsmVar.add(new ezy(i));
        }
        this.o++;
    }

    public final void i(List list) {
        if (this.b == null) {
            this.b = new ArrayList(this.m);
        }
        if (!list.isEmpty()) {
            v(this.n.a(list));
        }
        this.o++;
    }

    @Override // defpackage.odd
    public final void k(int i) {
        this.p = i;
    }

    @Override // defpackage.ajwl, defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        ampq ampqVar;
        if (cls == odf.class) {
            if (i == -1) {
                return new Class[]{isw.class, aawj.class, ajym.class};
            }
            if (i == 0) {
                isw iswVar = (isw) obj;
                if (iswVar.b().h()) {
                    r(iswVar.h(), iswVar.b().c());
                    return null;
                } else if (iswVar.f().h()) {
                    r(iswVar.h(), iswVar.f().c());
                    this.a.b(iswVar.f().c(), iswVar.h());
                    return null;
                } else if (!iswVar.e().h()) {
                    return null;
                } else {
                    r(iswVar.h(), iswVar.e().c());
                    this.a.b(iswVar.e().c(), iswVar.h());
                    return null;
                }
            } else if (i != 1) {
                if (i == 2) {
                    p(((ajym) obj).a());
                    return null;
                }
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            } else {
                ampq i2 = ampq.i(((aawj) obj).b());
                if (i2.h()) {
                    ampqVar = this.a.a(i2.c());
                } else {
                    ampqVar = amon.a;
                }
                if (!i2.h() || !ampqVar.h()) {
                    return null;
                }
                r(i2.c(), ampqVar.c());
                return null;
            }
        }
        return aolu.q(this, obj, i);
    }

    @Override // defpackage.lsa
    public final void q(Object obj, Object obj2) {
        this.a.b(obj2, obj);
        r(obj, obj2);
    }
}
