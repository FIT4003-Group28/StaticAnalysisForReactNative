package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
/* compiled from: PG */
/* renamed from: abne  reason: default package */
/* loaded from: classes.dex */
public abstract class abne extends abnb {
    private astc j;

    public abne(Context context, acth acthVar, aafo aafoVar) {
        super(context, acthVar, aafoVar);
    }

    @Override // defpackage.abnb, defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.abnb
    protected final /* bridge */ /* synthetic */ int f(Object obj) {
        return ((astc) obj).e;
    }

    @Override // defpackage.abnb
    protected final /* bridge */ /* synthetic */ int g(Object obj) {
        return ((astc) obj).g;
    }

    @Override // defpackage.abnb
    protected final /* bridge */ /* synthetic */ int h(Object obj) {
        return ((astc) obj).f;
    }

    @Override // defpackage.abnb
    protected final /* bridge */ /* synthetic */ long i(Object obj) {
        return ((astc) obj).i * 1000;
    }

    @Override // defpackage.abnb
    protected final /* bridge */ /* synthetic */ long j(Object obj) {
        return ((astc) obj).j * 1000;
    }

    @Override // defpackage.abnb
    protected final /* bridge */ /* synthetic */ Spanned k(Object obj) {
        arag aragVar;
        astc astcVar = (astc) obj;
        if ((astcVar.b & 2) != 0) {
            aragVar = astcVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        return ajgl.b(aragVar);
    }

    @Override // defpackage.abnb
    protected final acte l() {
        astc astcVar = this.j;
        if (astcVar != null) {
            return new acte(astcVar.m);
        }
        return null;
    }

    @Override // defpackage.abnb
    protected final /* bridge */ /* synthetic */ apzg m(Object obj) {
        apzg apzgVar = ((astc) obj).k;
        return apzgVar == null ? apzg.a : apzgVar;
    }

    @Override // defpackage.abnb
    protected final /* bridge */ /* synthetic */ avhn n(Object obj) {
        avhn avhnVar = ((astc) obj).h;
        return avhnVar == null ? avhn.a : avhnVar;
    }

    @Override // defpackage.abnb
    protected final /* bridge */ /* synthetic */ void o(Object obj) {
        this.j = (astc) obj;
    }
}
