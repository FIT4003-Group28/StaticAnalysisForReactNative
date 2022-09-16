package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: actq  reason: default package */
/* loaded from: classes.dex */
public abstract class actq extends dp {
    private String a;

    protected apzg kw() {
        Bundle bundle = this.m;
        if (bundle != null) {
            return aafr.b(bundle.getByteArray("navigation_endpoint"));
        }
        return null;
    }

    protected asjj kx() {
        return null;
    }

    @Override // defpackage.dp
    public View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        acti oi = oi();
        if (oi == null || p() == null) {
            zep.b("InteractionLogger or pageVeType is null in InteractionLoggingFragment!");
        } else {
            apzg kw = kw();
            if (kw == null) {
                kw = null;
            } else if (!TextUtils.isEmpty(this.a)) {
                aopa createBuilder = atnp.a.createBuilder();
                if (kw.qn(atno.b)) {
                    createBuilder = ((atnp) kw.qm(atno.b)).mo52toBuilder();
                }
                String str = this.a;
                createBuilder.copyOnWrite();
                atnp atnpVar = (atnp) createBuilder.instance;
                str.getClass();
                atnpVar.b |= 32;
                atnpVar.f = str;
                aopc aopcVar = (aopc) kw.mo52toBuilder();
                aopcVar.e(atno.b, (atnp) createBuilder.mo39build());
                kw = (apzg) aopcVar.mo39build();
            }
            oi.d(p(), kw, kx());
            if (oi.c() != null) {
                this.a = oi().c().a;
            }
        }
        return super.mc(layoutInflater, viewGroup, bundle);
    }

    protected acti oi() {
        throw null;
    }

    protected abstract acup p();
}
