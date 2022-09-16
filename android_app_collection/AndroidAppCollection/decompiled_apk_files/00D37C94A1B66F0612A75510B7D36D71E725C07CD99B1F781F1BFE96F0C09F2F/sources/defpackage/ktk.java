package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ktk  reason: default package */
/* loaded from: classes3.dex */
public final class ktk implements ajru, ynl {
    public final jml a;
    public final xx b;
    public final xx c;
    public aqdd d;
    final ajzi e;
    private final View f;
    private final TextView g;
    private final agvv h;
    private final agwh i;
    private final ajyc j;
    private final View k;
    private final azqb l;
    private final Context m;
    private final fta n;
    private final gem o;
    private final aacz p;

    public ktk(Context context, ajyc ajycVar, azqb azqbVar, ajsg ajsgVar, ajyi ajyiVar, acth acthVar, ftb ftbVar, jml jmlVar, aacz aaczVar, azqb azqbVar2, gem gemVar) {
        this.m = context;
        this.a = jmlVar;
        this.j = ajycVar;
        this.p = aaczVar;
        this.l = azqbVar2;
        agvx a = ((agrf) azqbVar.get()).a();
        this.h = a.i();
        this.i = a.m();
        View inflate = LayoutInflater.from(context).inflate(R.layout.commute_shelf_layout, (ViewGroup) null);
        this.f = inflate;
        this.g = (TextView) inflate.findViewById(R.id.title);
        this.k = inflate.findViewById(R.id.contextual_menu_anchor);
        this.n = ftbVar.b(context, (ViewStub) inflate.findViewById(R.id.title_badge));
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.shelf_items);
        recyclerView.ag(new LinearLayoutManager(0));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.aC(new fqx(context.getResources().getDimensionPixelOffset(R.dimen.offline_commute_playlist_item_padding)));
        ktj ktjVar = new ktj(recyclerView, ajsgVar, ajyiVar, acthVar);
        this.e = ktjVar;
        ktjVar.b.rZ(new ajrt() { // from class: kte
            @Override // defpackage.ajrt
            public final void a(ajrs ajrsVar, ajqm ajqmVar, int i) {
                aqdd aqddVar = ktk.this.d;
                if (aqddVar != null) {
                    ajrsVar.b = aqddVar.h.I();
                }
            }
        });
        this.b = new xx(-1, -2);
        this.c = new xx(-1, 0);
        this.o = gemVar;
        gemVar.c(inflate);
    }

    private final amuk e() {
        return amuk.n(ayoi.P(this.h.i()).K(ktg.a).I(kth.b).V(new ktf(this, 1)).I(jgs.u).av());
    }

    private final amuk g() {
        int i = this.d.f;
        if (i == 0) {
            return amuk.q();
        }
        ArrayList p = amxp.p((Iterable) ayoi.P(this.i.g()).K(ktg.c).I(kth.a).ag(i + 1).V(new ktf(this)).aq().U());
        if (p.size() < this.d.g) {
            return amuk.q();
        }
        if (p.size() > i) {
            p.remove(i);
            Context context = this.m;
            aopa createBuilder = auqm.a.createBuilder();
            arag h = ajgl.h(context.getResources().getString(R.string.see_all));
            createBuilder.copyOnWrite();
            auqm auqmVar = (auqm) createBuilder.instance;
            h.getClass();
            auqmVar.c = h;
            auqmVar.b |= 1;
            apzg apzgVar = far.a;
            createBuilder.copyOnWrite();
            auqm auqmVar2 = (auqm) createBuilder.instance;
            apzgVar.getClass();
            auqmVar2.d = apzgVar;
            auqmVar2.b |= 2;
            aopa createBuilder2 = aoux.a.createBuilder();
            int i2 = actj.CONSUMPTION_SHELF_SEE_ALL_BUTTON.II;
            createBuilder2.copyOnWrite();
            aoux aouxVar = (aoux) createBuilder2.instance;
            aouxVar.b |= 1;
            aouxVar.c = i2;
            createBuilder2.copyOnWrite();
            aoux aouxVar2 = (aoux) createBuilder2.instance;
            aouxVar2.b |= 32;
            aouxVar2.d = i;
            createBuilder.copyOnWrite();
            auqm auqmVar3 = (auqm) createBuilder.instance;
            aoux aouxVar3 = (aoux) createBuilder2.mo39build();
            aouxVar3.getClass();
            auqmVar3.e = aouxVar3;
            auqmVar3.b |= 4;
            p.add((auqm) createBuilder.mo39build());
        }
        return amuk.o(p);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.f;
    }

    public final void d() {
        zgd.u(this.f, new kti(this, 1), zgd.s(this.c.width, this.c.height), ViewGroup.LayoutParams.class);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                agoa agoaVar = (agoa) obj;
                ajsm ajsmVar = this.e.a;
                if (ajsmVar.isEmpty()) {
                    return null;
                }
                String str = agoaVar.a;
                for (int i2 = 0; i2 < ajsmVar.size(); i2++) {
                    Object obj2 = ajsmVar.get(i2);
                    if (obj2 instanceof kso) {
                        kso ksoVar = (kso) obj2;
                        if (!ksoVar.a && ksoVar.b.equals(str)) {
                            ajsmVar.remove(i2);
                            if (ajsmVar.isEmpty()) {
                                d();
                                return null;
                            }
                            ajsmVar.l();
                            return null;
                        }
                    }
                }
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{agoa.class};
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    @Override // defpackage.ajru
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void oK(defpackage.ajrs r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ktk.oK(ajrs, java.lang.Object):void");
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        ((yni) this.l.get()).m(this);
        this.e.a.clear();
        this.d = null;
    }
}
