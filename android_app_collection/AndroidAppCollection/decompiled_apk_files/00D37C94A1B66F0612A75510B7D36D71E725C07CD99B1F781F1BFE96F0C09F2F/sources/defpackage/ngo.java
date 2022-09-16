package defpackage;

import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.CreationEntryEndpointOuterClass$CreationEntryEndpoint;
import com.google.protos.youtube.api.innertube.IconBadgeRendererOuterClass;
import j$.util.Collection;
import j$.util.function.Function;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ngo  reason: default package */
/* loaded from: classes3.dex */
public abstract class ngo extends ngj {
    public final luy e;
    public final lva f;
    public final acti g;
    final lvv h;
    final lvv i;
    private final BrowseResponseModel j;

    public ngo(aafo aafoVar, luy luyVar, lva lvaVar, acti actiVar, BrowseResponseModel browseResponseModel, Object obj) {
        super(obj);
        lvv lvvVar;
        this.e = luyVar;
        this.f = lvaVar;
        this.g = actiVar;
        this.j = browseResponseModel;
        avtn f = f();
        lvv lvvVar2 = null;
        if (f != null) {
            apzg apzgVar = f.c;
            if ((apzgVar == null ? apzg.a : apzgVar).qn(CreationEntryEndpointOuterClass$CreationEntryEndpoint.creationEntryEndpoint)) {
                arhs arhsVar = f.d;
                arhr b = arhr.b((arhsVar == null ? arhs.a : arhsVar).c);
                if ((b == null ? arhr.UNKNOWN : b) == arhr.CREATION_ENTRY) {
                    lvvVar = new lvv(f, aafoVar, 1);
                    this.i = lvvVar;
                    if (f != null && lvvVar == null) {
                        lvvVar2 = new lvv(f, aafoVar);
                    }
                    this.h = lvvVar2;
                }
            }
        }
        lvvVar = null;
        this.i = lvvVar;
        if (f != null) {
            lvvVar2 = new lvv(f, aafoVar);
        }
        this.h = lvvVar2;
    }

    @Override // defpackage.ngj
    public final amvn a(amvn amvnVar) {
        amvn amvnVar2 = (amvn) Collection.EL.stream(this.j.a.m).filter(lws.l).map(new Function() { // from class: ngn
            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return function.getClass();
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                ngo ngoVar = ngo.this;
                aunb aunbVar = (aunb) obj;
                if (aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
                    return ngoVar.e.a(ngoVar.g, (apoj) aunbVar.qm(ButtonRendererOuterClass.buttonRenderer), new ArrayList());
                }
                return ngoVar.f.a(ngoVar.g, (arhm) aunbVar.qm(IconBadgeRendererOuterClass.iconBadgeRenderer));
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return function.getClass();
            }
        }).collect(amsf.b);
        if (!amvnVar2.isEmpty()) {
            amvnVar = (amvn) Collection.EL.stream(amvnVar).filter(lws.k).collect(amsf.b);
        }
        amvl i = amvn.i();
        i.j(amvnVar);
        lvv lvvVar = this.h;
        if (lvvVar != null || this.i != null) {
            lvv lvvVar2 = this.i;
            if (lvvVar2 != null) {
                lvvVar = lvvVar2;
            }
            i.c(lvvVar);
        }
        i.j(amvnVar2);
        return i.g();
    }

    public abstract avtn f();
}
