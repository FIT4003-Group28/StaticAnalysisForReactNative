package defpackage;

import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import j$.util.Collection;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: ngm  reason: default package */
/* loaded from: classes3.dex */
public class ngm extends ngj implements ynl {
    public final aafo e;
    public final luy f;
    public final lva g;
    public final acti h;
    public final lya i;
    private final yni j;
    private final BrowseResponseModel k;

    public ngm(aafo aafoVar, yni yniVar, lya lyaVar, luy luyVar, lva lvaVar, acti actiVar, BrowseResponseModel browseResponseModel, Object obj) {
        super(obj);
        this.k = browseResponseModel;
        this.e = aafoVar;
        this.j = yniVar;
        this.i = lyaVar;
        this.f = luyVar;
        this.g = lvaVar;
        this.h = actiVar;
    }

    @Override // defpackage.ngj
    public amvn a(amvn amvnVar) {
        amvn amvnVar2;
        atep atepVar;
        amvn amvnVar3 = (amvn) Collection.EL.stream(this.k.a.m).filter(lws.i).map(new ngk(this, 2)).collect(amsf.b);
        if (!amvnVar3.isEmpty()) {
            amvnVar = (amvn) Collection.EL.stream(amvnVar).filter(lws.e).collect(amsf.b);
        }
        amvl i = amvn.i();
        i.j(amvnVar3);
        i.j(amvnVar);
        arlx arlxVar = this.k.a.k;
        if (arlxVar == null) {
            arlxVar = arlx.a;
        }
        BrowseResponseModel browseResponseModel = this.k;
        if ((browseResponseModel.a.b & 131072) != 0) {
            if (arlxVar.b == 66439850) {
                atepVar = (atep) arlxVar.c;
            } else {
                atepVar = atep.a;
            }
            amvnVar2 = (amvn) Collection.EL.stream(atepVar.c).map(new ngk(this)).filter(lws.j).map(meg.e).collect(amsf.b);
        } else {
            amvnVar2 = (amvn) Collection.EL.stream(browseResponseModel.g()).filter(lws.f).flatMap(meg.g).filter(lws.d).map(meg.f).filter(lws.h).map(meg.d).flatMap(meg.c).map(meg.h).filter(lws.g).map(new ngk(this, 1)).collect(amsf.b);
        }
        i.j(amvnVar2);
        return i.g();
    }

    @Override // defpackage.ngj
    public final void e() {
        this.j.h(this, ngm.class);
    }

    @Override // defpackage.ngj
    public final void g() {
        this.j.m(this);
    }

    public final fry j(apzg apzgVar, arag aragVar, lya lyaVar) {
        return new ngl(this, apzgVar, ajgl.b(aragVar), lyaVar);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                if (!((Boolean) Optional.ofNullable(((epw) obj).a()).map(meg.i).orElse(false)).booleanValue()) {
                    return null;
                }
                Optional.ofNullable(this.c).ifPresent(khv.e);
                return null;
            } else if (i == 1) {
                if (!((Boolean) Optional.ofNullable(((epx) obj).a()).map(meg.j).orElse(false)).booleanValue()) {
                    return null;
                }
                b().ifPresent(khv.f);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{epw.class, epx.class};
    }
}
