package defpackage;

import android.content.Intent;
import android.os.Parcelable;
import com.google.android.apps.gsa.publicsearch.SystemParcelableWrapper;
import java.util.ArrayList;
import java.util.Collection;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cscr  reason: default package */
/* loaded from: classes5.dex */
public final class cscr extends ckyk {
    final /* synthetic */ csct a;

    public cscr(csct csctVar) {
        this.a = csctVar;
    }

    @Override // defpackage.ckyl
    public final void b(byte[] bArr, SystemParcelableWrapper systemParcelableWrapper) {
        Object b;
        try {
            claf clafVar = (claf) dsqw.cr(claf.c, bArr, dsqa.c());
            int a = clad.a(clafVar.b);
            if (a == 0) {
                a = 1;
            }
            clafVar.toString();
            if (a == 57) {
                csct csctVar = this.a;
                synchronized (csctVar.d) {
                    if (csctVar.c.isEmpty()) {
                        return;
                    }
                    Collection<ckyq> collection = csctVar.c;
                    csctVar.c = new ArrayList();
                    for (ckyq ckyqVar : collection) {
                        csctVar.b(ckyqVar);
                    }
                }
            } else if (a == 58) {
                brlc brlcVar = this.a.g;
                int i = brlh.w;
                synchronized (brlcVar.a.r) {
                    brlcVar.a.q = dbpy.a;
                    brlcVar.a.p(3);
                }
            } else if (a == 106) {
                if (systemParcelableWrapper == null) {
                    return;
                }
                Parcelable parcelable = systemParcelableWrapper.a;
                if (!(parcelable instanceof Intent)) {
                    return;
                }
                brlc brlcVar2 = this.a.g;
                Intent intent = (Intent) parcelable;
                int i2 = brlh.w;
                brlcVar2.a.j();
                brlh brlhVar = brlcVar2.a;
                brlhVar.j.b();
                intent.addFlags(268435456);
                intent.addFlags(536870912);
                brlhVar.b.startActivity(intent);
            } else if (a == 242) {
                this.a.g.a();
            } else if (a == 309) {
                dsqv<claf, ckyt> dsqvVar = ckyr.a;
                clafVar.f(dsqvVar);
                if (!clafVar.V.k(dsqvVar.d)) {
                    return;
                }
                dsqv<claf, ckyt> dsqvVar2 = ckyr.a;
                clafVar.f(dsqvVar2);
                Object l = clafVar.V.l(dsqvVar2.d);
                if (l == null) {
                    b = dsqvVar2.b;
                } else {
                    b = dsqvVar2.b(l);
                }
                this.a.g.a.k.a().a(btyx.PROJECTED_AGSA, dcdc.r(((ckyt) b).a));
            }
        } catch (dsrm e) {
            e.toString();
        }
    }
}
