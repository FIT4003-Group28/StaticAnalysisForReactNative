package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: nkd  reason: default package */
/* loaded from: classes3.dex */
public final class nkd extends njq implements AdapterView.OnItemClickListener, jyz {
    public acth ae;
    public aadd af;
    public jzb ag;
    public VideoQuality[] ah;
    public int ai;
    public int aj;
    public boolean ak;
    public aicg al;
    public acti am;
    public int an;
    private final List ao = new ArrayList();
    private nkc ap = new nkb(this, 1);

    @Override // defpackage.dp
    public final void W() {
        super.W();
        dismiss();
    }

    @Override // defpackage.vew
    protected final /* bridge */ /* synthetic */ ListAdapter aG() {
        akav b = this.ap.b();
        atdy atdyVar = this.af.a().i;
        if (atdyVar == null) {
            atdyVar = atdy.a;
        }
        atdz atdzVar = atdyVar.k;
        if (atdzVar == null) {
            atdzVar = atdz.a;
        }
        if (atdzVar.f) {
            acti oi = this.ae.oi();
            this.am = oi;
            InteractionLoggingScreen c = oi.c();
            if (c == null) {
                this.am = null;
            } else {
                acum acumVar = new acum(c, actj.VIDEO_QUALITY_ADVANCED_MENU);
                this.am.n(acumVar);
                this.ao.clear();
                for (int i = 0; i < b.getCount(); i++) {
                    njk njkVar = (njk) b.getItem(i);
                    acum acumVar2 = new acum(c, actj.VIDEO_QUALITY_ADVANCED_MENU_ITEM);
                    aopa createBuilder = askg.a.createBuilder();
                    String d = njkVar.d();
                    createBuilder.copyOnWrite();
                    askg askgVar = (askg) createBuilder.instance;
                    d.getClass();
                    askgVar.b |= 1;
                    askgVar.c = d;
                    if (njkVar.g) {
                        createBuilder.copyOnWrite();
                        askg.a((askg) createBuilder.instance);
                    }
                    this.am.E(acumVar2, acumVar);
                    acti actiVar = this.am;
                    aopa createBuilder2 = asjj.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    asjj asjjVar = (asjj) createBuilder2.instance;
                    askg askgVar2 = (askg) createBuilder.mo39build();
                    askgVar2.getClass();
                    asjjVar.y = askgVar2;
                    asjjVar.c |= 32768;
                    actiVar.u(acumVar2, (asjj) createBuilder2.mo39build());
                    this.ao.add(acumVar2);
                }
            }
        } else {
            this.am = null;
        }
        return b;
    }

    @Override // defpackage.vew
    protected final AdapterView.OnItemClickListener aI() {
        return this;
    }

    @Override // defpackage.vew
    protected final String aJ() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final akav aL() {
        return (akav) this.aC;
    }

    public final void aM(String str, int i) {
        if (this.am == null || i >= this.ao.size()) {
            return;
        }
        aopa createBuilder = asjj.a.createBuilder();
        aopa createBuilder2 = askg.a.createBuilder();
        createBuilder2.copyOnWrite();
        askg askgVar = (askg) createBuilder2.instance;
        str.getClass();
        askgVar.b |= 1;
        askgVar.c = str;
        createBuilder.copyOnWrite();
        asjj asjjVar = (asjj) createBuilder.instance;
        askg askgVar2 = (askg) createBuilder2.mo39build();
        askgVar2.getClass();
        asjjVar.y = askgVar2;
        asjjVar.c |= 32768;
        this.am.H(3, (acum) this.ao.get(i), (asjj) createBuilder.mo39build());
    }

    @Override // defpackage.jza
    public final void b(aicg aicgVar) {
        this.al = aicgVar;
    }

    @Override // defpackage.jza
    public final void c(dt dtVar) {
        if (ap() || at()) {
            return;
        }
        qw(dtVar.getSupportFragmentManager(), "VIDEO_QUALITIES_MENU_BOTTOM_SHEET_FRAGMENT");
    }

    @Override // defpackage.vew, defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.ap.a(layoutInflater, viewGroup, bundle);
    }

    @Override // defpackage.vew
    protected final int mv() {
        return 0;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.ap.onItemClick(adapterView, view, i, j);
    }

    @Override // defpackage.jyz
    public final void a(VideoQuality[] videoQualityArr, int i, int i2, boolean z, int i3) {
        if (this.ah != videoQualityArr && this.an != i3) {
            this.an = i3;
            if (i3 == 3) {
                this.ap = new nkb(this);
            } else {
                this.ap = new nkb(this, 1);
            }
        }
        if (this.ah != videoQualityArr || this.ai != i) {
            this.ah = videoQualityArr;
            this.ai = i;
            this.aj = i2;
            if (aL() != null) {
                aL().notifyDataSetChanged();
            }
        }
        this.ak = z;
    }
}
