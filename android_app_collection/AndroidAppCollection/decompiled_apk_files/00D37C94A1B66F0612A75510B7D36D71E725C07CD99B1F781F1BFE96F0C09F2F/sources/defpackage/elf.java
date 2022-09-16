package defpackage;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: elf  reason: default package */
/* loaded from: classes3.dex */
public final class elf extends ajsl implements ajrm, ajpz {
    public final SwipeLayout a;
    public final fjy b;
    public final akbi c;
    public apsm d;
    private final TextView e;
    private final TextView f;
    private final ImageView g;
    private final View h;
    private final ImageView i;
    private final ajsm j;
    private final RecyclerView k;
    private final Context l;
    private final ajmy m;
    private final ajrp n;
    private final ajqa o;
    private final View.OnLongClickListener p;
    private final akbi q;
    private ajrs r;

    public elf(Context context, ajmy ajmyVar, azqb azqbVar, aafo aafoVar, ajqa ajqaVar, fjy fjyVar, emh emhVar, jzf jzfVar, ajsg ajsgVar, byte[] bArr) {
        this.l = context;
        ajmyVar.getClass();
        this.m = ajmyVar;
        this.b = fjyVar;
        ajqaVar.getClass();
        this.o = ajqaVar;
        SwipeLayout swipeLayout = (SwipeLayout) LayoutInflater.from(context).inflate(R.layout.channel_list_item, (ViewGroup) null);
        this.a = swipeLayout;
        this.e = (TextView) swipeLayout.findViewById(R.id.channel_name);
        this.f = (TextView) swipeLayout.findViewById(R.id.activity_count_live_status);
        this.g = (ImageView) swipeLayout.findViewById(R.id.channel_avatar);
        this.h = swipeLayout.findViewById(R.id.channel_status);
        this.i = (ImageView) swipeLayout.findViewById(R.id.channel_status_merged);
        RecyclerView recyclerView = (RecyclerView) swipeLayout.findViewById(R.id.buttons);
        this.k = recyclerView;
        recyclerView.ag(new LinearLayoutManager(0));
        ajsi ajsiVar = new ajsi();
        ajsf a = ajsgVar.a(ajsiVar);
        recyclerView.ad(a);
        ajsm ajsmVar = new ajsm();
        this.j = ajsmVar;
        a.h(ajsmVar);
        ajsiVar.f(apos.class, new ajsc(azqbVar));
        ajsiVar.f(apoj.class, new ele(this));
        ajsiVar.f(avbl.class, emhVar);
        ajsiVar.f(avbh.class, jzfVar);
        this.n = new ajrp(aafoVar, swipeLayout, this);
        this.p = new View.OnLongClickListener() { // from class: elb
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                SwipeLayout swipeLayout2 = elf.this.a;
                if (swipeLayout2.q()) {
                    swipeLayout2.i(0.0f);
                    return true;
                }
                swipeLayout2.j(0.0f);
                return true;
            }
        };
        this.q = new elc(this, 1);
        this.c = new elc(this);
    }

    private final int k(apsm apsmVar) {
        iis i = i(apsmVar);
        if (i == null) {
            return 1;
        }
        return i.c;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        this.r = ajrsVar;
        iis iisVar = new iis((apsm) obj);
        this.o.e(this);
        this.o.h(iisVar.b, this);
        this.o.c(iisVar.b, iisVar);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((apsm) obj).i.I();
    }

    public final Map f(apsm apsmVar) {
        HashMap hashMap = new HashMap();
        acti actiVar = this.r.a;
        if (actiVar != null) {
            hashMap.put("com.google.android.libraries.youtube.logging.interaction_logger", actiVar);
        }
        hashMap.putAll(actk.f(new fop(false, new eld(this, apsmVar, k(apsmVar)))));
        return hashMap;
    }

    public final void g() {
        j(this.d, 4);
    }

    @Override // defpackage.ajrm
    public final boolean h(View view) {
        apsm apsmVar = this.d;
        if ((apsmVar.b & 8) != 0) {
            if (k(apsmVar) != 2) {
                return false;
            }
            j(this.d, 1);
            return false;
        }
        return true;
    }

    public final iis i(apsm apsmVar) {
        if (apsmVar == null) {
            return null;
        }
        return (iis) this.o.b(iis.a(apsmVar));
    }

    public final void j(apsm apsmVar, int i) {
        iis i2 = i(apsmVar);
        if (i2 == null) {
            return;
        }
        ajqa ajqaVar = this.o;
        Uri uri = i2.b;
        aopa mo52toBuilder = ((aopi) i2.a).mo52toBuilder();
        iis.c(mo52toBuilder);
        ajqaVar.d(uri, new iis((apsm) mo52toBuilder.mo39build(), i));
    }

    @Override // defpackage.ajpz
    public final void kA(Uri uri, Uri uri2) {
        arag aragVar;
        avhn avhnVar;
        arag aragVar2;
        arag aragVar3;
        iis iisVar = (iis) this.o.b(uri);
        this.d = (apsm) iisVar.a;
        this.a.setAlpha(1.0f);
        apsm apsmVar = this.d;
        if ((apsmVar.b & 8) == 0) {
            this.n.c();
        } else {
            ajrp ajrpVar = this.n;
            acti actiVar = this.r.a;
            apzg apzgVar = apsmVar.h;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            ajrpVar.a(actiVar, apzgVar, this.r.e());
        }
        apsk apskVar = this.d.k;
        if (apskVar == null) {
            apskVar = apsk.a;
        }
        int E = almu.E(apskVar.b);
        int i = 1;
        if (E == 0) {
            E = 1;
        }
        apsm apsmVar2 = this.d;
        if ((apsmVar2.b & 2) != 0) {
            aragVar = apsmVar2.f;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        this.e.setText(ajgl.b(aragVar));
        apsm apsmVar3 = this.d;
        if ((apsmVar3.b & 4) != 0) {
            avhnVar = apsmVar3.g;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
        } else {
            avhnVar = null;
        }
        if (akel.A(avhnVar)) {
            this.m.h(this.g, avhnVar);
        }
        if (E != 2) {
            apsm apsmVar4 = this.d;
            int i2 = apsmVar4.c;
            if (i2 == 4) {
                this.f.setVisibility(0);
                TextView textView = this.f;
                if (apsmVar4.c == 4) {
                    aragVar3 = (arag) apsmVar4.d;
                } else {
                    aragVar3 = arag.a;
                }
                textView.setText(ajgl.b(aragVar3));
                this.f.setTextColor(this.l.getResources().getColor(R.color.yt_grey3));
            } else if (i2 != 5) {
                this.f.setVisibility(8);
            } else {
                this.f.setVisibility(0);
                TextView textView2 = this.f;
                if (apsmVar4.c == 5) {
                    aragVar2 = (arag) apsmVar4.d;
                } else {
                    aragVar2 = arag.a;
                }
                textView2.setText(ajgl.b(aragVar2));
                this.f.setTextColor(this.l.getResources().getColor(R.color.yt_medium_red));
            }
        }
        apsm apsmVar5 = this.d;
        this.j.clear();
        for (apsj apsjVar : apsmVar5.m) {
            int i3 = apsjVar.b;
            if ((i3 & 1) != 0) {
                ajsm ajsmVar = this.j;
                apos aposVar = apsjVar.c;
                if (aposVar == null) {
                    aposVar = apos.a;
                }
                ajsmVar.add(aposVar);
            } else if ((i3 & 2) != 0) {
                ajsm ajsmVar2 = this.j;
                apoj apojVar = apsjVar.d;
                if (apojVar == null) {
                    apojVar = apoj.a;
                }
                ajsmVar2.add(apojVar);
            } else if ((i3 & 4) != 0) {
                ajsm ajsmVar3 = this.j;
                avbl avblVar = apsjVar.e;
                if (avblVar == null) {
                    avblVar = avbl.a;
                }
                ajsmVar3.add(avblVar);
            } else if ((i3 & 8) != 0) {
                ajsm ajsmVar4 = this.j;
                avbh avbhVar = apsjVar.f;
                if (avbhVar == null) {
                    avbhVar = avbh.a;
                }
                ajsmVar4.add(avbhVar);
            }
        }
        this.j.l();
        this.k.setVisibility(true != this.j.isEmpty() ? 0 : 8);
        apsm apsmVar6 = this.d;
        ArrayList arrayList = new ArrayList();
        this.a.h();
        if (apsmVar6.n.size() != 0) {
            for (apsp apspVar : apsmVar6.n) {
                if ((apspVar.b & i) != 0) {
                    fjx a = this.b.a(this.q, f(apsmVar6));
                    ajrs ajrsVar = this.r;
                    apoj apojVar2 = apspVar.c;
                    if (apojVar2 == null) {
                        apojVar2 = apoj.a;
                    }
                    a.oK(ajrsVar, apojVar2);
                    TextView textView3 = a.b;
                    if (textView3 instanceof TextView) {
                        textView3.setGravity(16);
                    }
                    arrayList.add(textView3);
                    i = 1;
                }
            }
            zdb.a(this.a, arrayList);
            this.a.setOnLongClickListener(this.p);
        } else {
            zdb.a(this.a, arrayList);
            this.a.setOnLongClickListener(null);
        }
        int i4 = iisVar.c;
        int i5 = this.d.c;
        this.h.setVisibility(8);
        this.i.setVisibility(E != 2 ? 8 : 4);
        this.g.setAlpha(1.0f);
        this.e.setAlpha(1.0f);
        if (i4 == 3) {
            this.g.setAlpha(0.5f);
            this.e.setAlpha(0.5f);
        } else if (i4 == 4) {
            this.a.setAlpha(0.5f);
            this.k.setVisibility(8);
            this.a.k(null);
            SwipeLayout swipeLayout = this.a;
            swipeLayout.f = false;
            swipeLayout.h = false;
            swipeLayout.setOnLongClickListener(null);
        } else if (E != 2) {
            if (i4 != 2) {
                return;
            }
            this.h.setVisibility(0);
        } else if (i5 == 5) {
            this.i.setVisibility(0);
            this.i.setImageDrawable(this.l.getResources().getDrawable(R.drawable.channel_list_sub_item_live));
        } else if (i4 == 2) {
            this.i.setVisibility(0);
            this.i.setImageDrawable(this.l.getResources().getDrawable(R.drawable.channel_list_sub_item_new_content));
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.n.c();
        this.o.e(this);
        this.d = null;
        zdb.a(this.a, Collections.emptyList());
    }
}
