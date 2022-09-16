package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: emc  reason: default package */
/* loaded from: classes3.dex */
final class emc extends ekl {
    public emc(emd emdVar) {
        super(emdVar.a, emdVar.b, emdVar.c, emdVar.d, emdVar.e, emdVar.f, emdVar.g);
    }

    @Override // defpackage.ekl
    public final /* bridge */ /* synthetic */ apzg d(Object obj) {
        apzg apzgVar = ((arej) obj).i;
        return apzgVar == null ? apzg.a : apzgVar;
    }

    @Override // defpackage.ekl
    public final /* bridge */ /* synthetic */ ates e(Object obj) {
        arej arejVar = (arej) obj;
        if ((arejVar.b & 512) != 0) {
            ates atesVar = arejVar.l;
            return atesVar == null ? ates.a : atesVar;
        }
        return null;
    }

    @Override // defpackage.ekl
    public final /* bridge */ /* synthetic */ avaq f(Object obj) {
        arej arejVar = (arej) obj;
        arek arekVar = arejVar.j;
        if (arekVar == null) {
            arekVar = arek.a;
        }
        if (arekVar.b == 55419609) {
            arek arekVar2 = arejVar.j;
            if (arekVar2 == null) {
                arekVar2 = arek.a;
            }
            if (arekVar2.b == 55419609) {
                return (avaq) arekVar2.c;
            }
            return avaq.a;
        }
        return null;
    }

    @Override // defpackage.ekl
    public final /* bridge */ /* synthetic */ avhn g(Object obj) {
        arej arejVar = (arej) obj;
        if ((arejVar.b & 2) != 0) {
            avhn avhnVar = arejVar.c;
            return avhnVar == null ? avhn.a : avhnVar;
        }
        return null;
    }

    @Override // defpackage.ekl
    public final /* bridge */ /* synthetic */ CharSequence h(Object obj) {
        arag aragVar;
        arej arejVar = (arej) obj;
        if ((arejVar.b & 64) != 0) {
            aragVar = arejVar.h;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        return ajgl.b(aragVar);
    }

    @Override // defpackage.ekl
    public final /* bridge */ /* synthetic */ CharSequence i(Object obj) {
        arag aragVar;
        arej arejVar = (arej) obj;
        if ((arejVar.b & 32) != 0) {
            aragVar = arejVar.g;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        return ajgl.b(aragVar);
    }

    @Override // defpackage.ekl
    public final /* bridge */ /* synthetic */ CharSequence j(Object obj) {
        arag aragVar;
        arej arejVar = (arej) obj;
        if ((arejVar.b & 16) != 0) {
            aragVar = arejVar.f;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        return ajgl.b(aragVar);
    }

    @Override // defpackage.ekl
    public final /* bridge */ /* synthetic */ CharSequence k(Object obj) {
        arag aragVar;
        arej arejVar = (arej) obj;
        if ((arejVar.b & 4) != 0) {
            aragVar = arejVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        return ajgl.b(aragVar);
    }

    @Override // defpackage.ekl
    public final /* bridge */ /* synthetic */ CharSequence l(Object obj) {
        arag aragVar;
        arej arejVar = (arej) obj;
        if ((arejVar.b & 8) != 0) {
            aragVar = arejVar.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        return ajgl.b(aragVar);
    }

    @Override // defpackage.ekl
    public final /* bridge */ /* synthetic */ Object m(Object obj, avaq avaqVar) {
        arej arejVar = (arej) obj;
        if ((arejVar.b & 256) != 0) {
            aopa mo52toBuilder = arejVar.mo52toBuilder();
            arek arekVar = arejVar.j;
            if (arekVar == null) {
                arekVar = arek.a;
            }
            aopa mo52toBuilder2 = arekVar.mo52toBuilder();
            mo52toBuilder2.copyOnWrite();
            arek arekVar2 = (arek) mo52toBuilder2.instance;
            avaqVar.getClass();
            arekVar2.c = avaqVar;
            arekVar2.b = 55419609;
            mo52toBuilder.copyOnWrite();
            arej arejVar2 = (arej) mo52toBuilder.instance;
            arek arekVar3 = (arek) mo52toBuilder2.mo39build();
            arekVar3.getClass();
            arejVar2.j = arekVar3;
            arejVar2.b |= 256;
            return (arej) mo52toBuilder.mo39build();
        }
        return arejVar;
    }

    @Override // defpackage.ekl
    public final /* bridge */ /* synthetic */ List n(Object obj) {
        return ((arej) obj).k;
    }

    @Override // defpackage.ekl
    public final /* bridge */ /* synthetic */ byte[] o(Object obj) {
        return ((arej) obj).m.I();
    }
}
