package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: ajom  reason: default package */
/* loaded from: classes.dex */
abstract class ajom implements ykg {
    final cmc a;
    final agc b;

    public ajom(cmc cmcVar, agc agcVar) {
        this.a = cmcVar;
        this.b = agcVar;
    }

    @Override // defpackage.ykg
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Uri uri = (Uri) obj;
        if (uri == null) {
            return null;
        }
        return g((cku) this.a.f((chy) this.b.c(uri)));
    }

    @Override // defpackage.ykg
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        throw null;
    }

    @Override // defpackage.ykg
    public final void c() {
        throw null;
    }

    @Override // defpackage.ykg
    public final /* bridge */ /* synthetic */ void d(Object obj, Object obj2) {
        cku f;
        Uri uri = (Uri) obj;
        if (uri == null || obj2 == null || (f = f((afsk) obj2)) == null) {
            return;
        }
        this.a.g((chy) this.b.c(uri), f);
    }

    @Override // defpackage.ykg
    public final /* bridge */ /* synthetic */ boolean e(Object obj) {
        throw null;
    }

    protected abstract cku f(afsk afskVar);

    public final afsk g(cku ckuVar) {
        ajor ajorVar = (ckuVar == null || !h(ckuVar)) ? null : (ajor) ckuVar;
        if (ajorVar != null) {
            return ajorVar.g();
        }
        return null;
    }

    protected abstract boolean h(cku ckuVar);
}
