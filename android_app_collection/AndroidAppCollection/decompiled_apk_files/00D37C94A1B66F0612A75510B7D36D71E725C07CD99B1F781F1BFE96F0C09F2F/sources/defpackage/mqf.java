package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: mqf  reason: default package */
/* loaded from: classes3.dex */
public final class mqf extends mqq implements fro, ynl {
    public gaf i;
    private final yni j;
    private final aagi k;
    private aypg l;
    private final frr m;

    public mqf(aafo aafoVar, ajxz ajxzVar, Context context, frr frrVar, yni yniVar, aagi aagiVar, ViewGroup viewGroup) {
        super(aafoVar, ajxzVar, context, viewGroup);
        this.j = yniVar;
        this.k = aagiVar;
        this.m = frrVar;
    }

    public static boolean l(auxb auxbVar, aspb aspbVar) {
        if (!auxbVar.c || aspbVar != aspb.LIKE) {
            return auxbVar.d && aspbVar == aspb.DISLIKE;
        }
        return true;
    }

    private final void n() {
        aypg aypgVar = this.l;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
            this.l = null;
        }
    }

    @Override // defpackage.fro
    public final void a(String str, int i, arag aragVar, arag aragVar2) {
        if (str == null || j() == null) {
            return;
        }
        aspc aspcVar = j().e;
        if (aspcVar == null) {
            aspcVar = aspc.a;
        }
        if (!str.equals(aspcVar.c)) {
            return;
        }
        if (i != 2) {
            if (i == 3 && !j().d) {
                return;
            }
        } else if (!j().c) {
            return;
        }
        aopa mo52toBuilder = this.f.mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        apos aposVar = (apos) mo52toBuilder.instance;
        aragVar.getClass();
        aposVar.h = aragVar;
        aposVar.b |= 64;
        mo52toBuilder.copyOnWrite();
        apos aposVar2 = (apos) mo52toBuilder.instance;
        aragVar2.getClass();
        aposVar2.n = aragVar2;
        aposVar2.b |= 4096;
        this.f = (apos) mo52toBuilder.mo39build();
        g();
    }

    @Override // defpackage.mfg, defpackage.mpy
    public final void b() {
        super.b();
        this.j.m(this);
        n();
    }

    public final auxb j() {
        return (auxb) this.g;
    }

    @Override // defpackage.mqq
    public final void k(auxb auxbVar) {
        super.k(auxbVar);
        gaf gafVar = this.i;
        String str = null;
        if (gafVar != null && this.g != null) {
            String b = gafVar.b();
            aspc aspcVar = ((auxb) this.g).e;
            if (aspcVar == null) {
                aspcVar = aspc.a;
            }
            if (TextUtils.equals(b, aspcVar.c)) {
                m(l((auxb) this.g, this.i.a()));
            } else {
                this.i = null;
            }
        }
        n();
        String str2 = auxbVar.f;
        if (!TextUtils.isEmpty(str2)) {
            if (aakj.j(str2)) {
                str = str2;
            } else if (aakj.i(str2)) {
                str = aakj.e(aakj.a(str2), aakj.b(str2));
            }
        }
        if (str == null) {
            this.j.g(this);
        } else {
            this.l = this.k.c().i(str).I(kth.o).V(lyd.o).k(asoz.class).X(aypa.a()).as(new ayqb() { // from class: mqe
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    mqf mqfVar = mqf.this;
                    mqfVar.m(mqf.l((auxb) mqfVar.g, ((asoz) obj).getLikeStatus()));
                    mqfVar.g();
                }
            });
        }
        auxb auxbVar2 = (auxb) this.g;
        if (auxbVar2.c) {
            this.c.setId(R.id.like_button);
        } else if (auxbVar2.d) {
            this.c.setId(R.id.dislike_button);
        }
        g();
        if (this.e == null) {
            return;
        }
        frr frrVar = this.m;
        aspc aspcVar2 = j().e;
        if (aspcVar2 == null) {
            aspcVar2 = aspc.a;
        }
        frm a = frrVar.a(aspcVar2.c);
        WeakReference weakReference = new WeakReference(this);
        a.e.add(weakReference);
        List list = a.h;
        if (list == null) {
            return;
        }
        frm.d(list, amuk.q(), amuk.q(), amuk.r(weakReference), amuk.q(), a.b);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                gaf gafVar = (gaf) obj;
                aspc aspcVar = ((auxb) this.g).e;
                if (aspcVar == null) {
                    aspcVar = aspc.a;
                }
                if (!TextUtils.equals(aspcVar.c, gafVar.b())) {
                    this.i = null;
                    return null;
                }
                m(l((auxb) this.g, gafVar.a()));
                g();
                this.i = gafVar;
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{gaf.class};
    }

    @Override // defpackage.mqq, android.view.View.OnClickListener
    public final void onClick(View view) {
        apzg apzgVar;
        if (i()) {
            apos aposVar = this.f;
            if ((aposVar.b & 16384) == 0) {
                return;
            }
            apzgVar = aposVar.p;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apos aposVar2 = this.f;
            if ((aposVar2.b & 512) == 0) {
                return;
            }
            apzgVar = aposVar2.k;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
        this.a.c(apzgVar, hashMap);
    }

    public mqf(aafo aafoVar, ajxz ajxzVar, Context context, frr frrVar, yni yniVar, aagi aagiVar, ViewGroup viewGroup, int i, mqp mqpVar) {
        super(aafoVar, ajxzVar, context, viewGroup, i, mqpVar);
        this.j = yniVar;
        this.k = aagiVar;
        this.m = frrVar;
    }
}
