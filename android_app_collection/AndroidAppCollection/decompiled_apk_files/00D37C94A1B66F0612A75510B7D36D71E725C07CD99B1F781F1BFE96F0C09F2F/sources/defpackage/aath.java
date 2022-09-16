package defpackage;

import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aath  reason: default package */
/* loaded from: classes.dex */
public final class aath extends aars implements aari {
    public static final /* synthetic */ int b = 0;
    public final Set a;
    private final afvn c;
    private final aate g;
    private final aadd h;
    private final Set i;
    private final boolean j;
    private final yni k;
    private final aarl l;
    private final zdz m;

    static {
        Collections.emptySet();
    }

    public aath(aaqj aaqjVar, aaqf aaqfVar, afvn afvnVar, yqw yqwVar, aacz aaczVar, aadd aaddVar, Set set, aate aateVar, yni yniVar, zdz zdzVar, Set set2) {
        super(aaqfVar, yqwVar);
        this.c = afvnVar;
        this.j = aadf.b(aaczVar);
        this.h = aaddVar;
        set.getClass();
        this.i = set;
        this.g = aateVar;
        yniVar.getClass();
        this.k = yniVar;
        this.m = zdzVar;
        this.a = set2;
        this.l = c(arlt.a, aaqjVar, aass.f, iho.n);
    }

    private static aaqr i(aadd aaddVar, zdz zdzVar) {
        if (zdzVar == null) {
            return null;
        }
        aaqq a = aaqr.a(zdzVar);
        a.a = zbx.e;
        athe atheVar = aaddVar.a().f;
        if (atheVar == null) {
            atheVar = athe.a;
        }
        final apob apobVar = atheVar.h;
        if (apobVar == null) {
            apobVar = apob.a;
        }
        if (apobVar.b) {
            a.b = zdzVar.b(new zea(apobVar.d, apobVar.e, apobVar.f, apobVar.c, apobVar.g));
            a.b(new ampt() { // from class: aatd
                @Override // defpackage.ampt
                public final boolean a(Object obj) {
                    apob apobVar2 = apob.this;
                    cff cffVar = (cff) obj;
                    if (yhq.a(cffVar)) {
                        return true;
                    }
                    return apobVar2.h.contains(Integer.valueOf(cffVar.b.a));
                }
            });
        }
        return a.a();
    }

    @Override // defpackage.aari
    public final void b(aaqs aaqsVar, aarh aarhVar, afzf afzfVar) {
        this.g.k((aatf) aaqsVar, aarhVar, afzfVar, i(this.h, this.m));
    }

    @Override // defpackage.aari
    /* renamed from: d */
    public final aatf a(ajfz ajfzVar) {
        aatf f = f();
        f.u(ajfzVar);
        return f;
    }

    public final aatf e() {
        return g(new yph(this.k, new aado(), new aadn(), new aadm(), new aadl()));
    }

    public final aatf f() {
        return g(null);
    }

    public final aatf g(yre yreVar) {
        aatf aatfVar = new aatf(this.e, this.c.c(), this.j);
        aatfVar.p = yreVar;
        for (aatg aatgVar : this.i) {
            aatgVar.a(aatfVar);
        }
        return aatfVar;
    }

    public final ankt h(aatf aatfVar, Executor executor) {
        return anii.h(this.l.c(aatfVar, executor, i(this.h, this.m)), new ampg() { // from class: aatc
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                arlt arltVar = (arlt) obj;
                for (aaoq aaoqVar : aath.this.a) {
                    aaoqVar.a(arltVar);
                }
                return new BrowseResponseModel(arltVar);
            }
        }, anjk.a);
    }
}
