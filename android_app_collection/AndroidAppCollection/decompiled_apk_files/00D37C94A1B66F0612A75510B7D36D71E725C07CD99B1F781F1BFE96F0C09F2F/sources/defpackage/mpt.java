package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: mpt  reason: default package */
/* loaded from: classes3.dex */
public final class mpt extends mfg implements View.OnLongClickListener, ynl {
    public final Set i;
    public String j;
    public final aacz k;
    private final yni l;
    private final yrj m;
    private final SharedPreferences n;
    private final aagi o;
    private final ayor p;
    private aypg q;

    public mpt(aafo aafoVar, ajxz ajxzVar, Context context, yni yniVar, aagi aagiVar, aacz aaczVar, ayor ayorVar, yrj yrjVar, SharedPreferences sharedPreferences, ViewGroup viewGroup, int i, mqp mqpVar) {
        super(aafoVar, ajxzVar, context, viewGroup, i, mqpVar);
        this.j = "";
        this.l = yniVar;
        this.o = aagiVar;
        this.k = aaczVar;
        this.p = ayorVar;
        this.m = yrjVar;
        this.n = sharedPreferences;
        this.i = new afy();
    }

    private final String p() {
        apzg apzgVar = ((auwx) this.g).c;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        if (apzgVar.qn(AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint.addToPlaylistEndpoint)) {
            apzg apzgVar2 = ((auwx) this.g).c;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            return ((AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint) apzgVar2.qm(AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint.addToPlaylistEndpoint)).b;
        }
        return null;
    }

    @Override // defpackage.mfg, defpackage.mpy
    public final void b() {
        super.b();
        this.l.m(this);
        k();
    }

    @Override // defpackage.mfg
    public final int c() {
        return R.color.slim_meta_data_toggle_button_nonchanging;
    }

    @Override // defpackage.mfg
    public final int d() {
        return R.color.slim_meta_data_toggle_button_selected_nonchanging;
    }

    @Override // defpackage.mfg
    protected final /* bridge */ /* synthetic */ apos e(Object obj) {
        apok apokVar = ((auwx) obj).d;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        apos aposVar = apokVar.d;
        return aposVar == null ? apos.a : aposVar;
    }

    @Override // defpackage.mfg
    public final boolean i() {
        return this.f.e;
    }

    public final argj j() {
        Object obj = this.g;
        if (obj != null) {
            apok apokVar = ((auwx) obj).d;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            apos aposVar = apokVar.d;
            if (aposVar == null) {
                aposVar = apos.a;
            }
            apor aporVar = aposVar.j;
            if (aporVar == null) {
                aporVar = apor.a;
            }
            if (aporVar.b != 102716411) {
                return null;
            }
            apok apokVar2 = ((auwx) this.g).d;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            apos aposVar2 = apokVar2.d;
            if (aposVar2 == null) {
                aposVar2 = apos.a;
            }
            apor aporVar2 = aposVar2.j;
            if (aporVar2 == null) {
                aporVar2 = apor.a;
            }
            if (aporVar2.b == 102716411) {
                return (argj) aporVar2.c;
            }
            return argj.a;
        }
        return null;
    }

    public final void k() {
        aypg aypgVar = this.q;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
            this.q = null;
        }
    }

    public final void l() {
        String f = aakj.f(231, this.j);
        aagh c = this.o.c();
        c.f(f).g(auog.class).c(new gna(c, 4)).Q();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(boolean z) {
        apos aposVar = this.f;
        if (aposVar.e == z) {
            return;
        }
        aopa mo52toBuilder = aposVar.mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        apos aposVar2 = (apos) mo52toBuilder.instance;
        aposVar2.b |= 8;
        aposVar2.e = z;
        this.f = (apos) mo52toBuilder.mo39build();
        g();
    }

    public final void n(auwx auwxVar) {
        String p;
        super.h(auwxVar);
        if (this.g != null) {
            if (o(this.j)) {
                m(!this.i.isEmpty());
            } else {
                l();
                k();
                this.i.clear();
                this.j = p();
            }
        }
        if ((auwxVar.b & 1) != 0) {
            this.c.setOnLongClickListener(this);
        }
        if (eog.aQ(this.k) && (p = p()) != null) {
            this.q = this.o.c().i(aakj.f(231, p)).I(kth.n).V(lyd.n).k(auog.class).X(this.p).as(new ayqb() { // from class: mps
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    mpt.this.m(!((auog) obj).getPlaylistIds().isEmpty());
                }
            });
        }
        this.l.g(this);
        g();
    }

    public final boolean o(String str) {
        return TextUtils.equals(p(), str);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apzg apzgVar;
        if (i()) {
            this.n.edit().putString("add_to_long_press_hint_trigger_video_id", p()).apply();
        }
        if (this.m.o() && !i() && !this.f.u) {
            m(true);
        }
        if (i()) {
            apos aposVar = this.f;
            if ((aposVar.b & 16384) != 0) {
                apzgVar = aposVar.p;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
                this.a.c(apzgVar, hashMap);
            }
        } else {
            apos aposVar2 = this.f;
            if ((aposVar2.b & 512) != 0) {
                apzgVar = aposVar2.k;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
                this.a.c(apzgVar, hashMap2);
            }
        }
        apos aposVar3 = this.f;
        if ((aposVar3.b & 1024) != 0) {
            apzg apzgVar2 = aposVar3.l;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
            this.a.c(apzgVar2, hashMap3);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if ((((auwx) this.g).b & 1) != 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
            aafo aafoVar = this.a;
            apzg apzgVar = ((auwx) this.g).c;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, hashMap);
            return true;
        }
        return false;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        switch (i) {
            case -1:
                return new Class[]{kqf.class, abbj.class, abbk.class, abbn.class, afwb.class, afwd.class};
            case 0:
                kqf kqfVar = (kqf) obj;
                if (eog.aQ(this.k) || !o(kqfVar.a)) {
                    return null;
                }
                this.i.clear();
                m(false);
                return null;
            case 1:
                abbj abbjVar = (abbj) obj;
                if (eog.aQ(this.k) || !o(abbjVar.b)) {
                    return null;
                }
                m(!this.i.isEmpty());
                return null;
            case 2:
                abbk abbkVar = (abbk) obj;
                if (eog.aQ(this.k) || !o(abbkVar.b)) {
                    return null;
                }
                this.i.add(abbkVar.a);
                m(!this.i.isEmpty());
                return null;
            case 3:
                abbn abbnVar = (abbn) obj;
                if (eog.aQ(this.k) || !o(abbnVar.d)) {
                    return null;
                }
                this.i.remove(abbnVar.a);
                m(!this.i.isEmpty());
                return null;
            case 4:
                afwb afwbVar = (afwb) obj;
                l();
                k();
                this.j = "";
                return null;
            case 5:
                afwd afwdVar = (afwd) obj;
                l();
                k();
                this.j = "";
                return null;
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }
}
