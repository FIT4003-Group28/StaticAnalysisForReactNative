package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: nkf  reason: default package */
/* loaded from: classes3.dex */
public final class nkf extends njr implements AdapterView.OnItemClickListener, jza {
    public aadd ae;
    public acth af;
    public jyz ag;
    public jzb ah;
    public acti ai;
    private aicg aj;

    private final boolean aL() {
        atdy atdyVar = this.ae.a().i;
        if (atdyVar == null) {
            atdyVar = atdy.a;
        }
        atdz atdzVar = atdyVar.k;
        if (atdzVar == null) {
            atdzVar = atdz.a;
        }
        return atdzVar.h;
    }

    private final boolean aM() {
        atdy atdyVar = this.ae.a().i;
        if (atdyVar == null) {
            atdyVar = atdy.a;
        }
        atdz atdzVar = atdyVar.k;
        if (atdzVar == null) {
            atdzVar = atdz.a;
        }
        return atdzVar.e;
    }

    @Override // defpackage.dp
    public final void W() {
        super.W();
        dismiss();
    }

    @Override // defpackage.vew
    protected final /* bridge */ /* synthetic */ ListAdapter aG() {
        njj[] d;
        akav akavVar = new akav(mJ());
        atdy atdyVar = this.ae.a().i;
        if (atdyVar == null) {
            atdyVar = atdy.a;
        }
        atdz atdzVar = atdyVar.k;
        if (atdzVar == null) {
            atdzVar = atdz.a;
        }
        InteractionLoggingScreen c = atdzVar.f ? this.af.oi().c() : null;
        if (c != null) {
            this.ai = this.af.oi();
            acum acumVar = new acum(c, actj.VIDEO_QUALITY_QUICK_MENU);
            this.ai.n(acumVar);
            if (aM()) {
                this.ai.o(new acte(actj.VIDEO_QUALITY_QUICK_MENU_SETTINGS_DEEPLINK), acumVar);
            }
            dt mJ = mJ();
            acti actiVar = this.ai;
            d = njj.d(mJ, this.ah.f, aL());
            for (njj njjVar : d) {
                awan awanVar = njjVar.a;
                if (awanVar != awan.VIDEO_QUALITY_SETTING_ADVANCED_MENU) {
                    njjVar.b = true;
                    acte acteVar = new acte(njj.c(awanVar));
                    if (njjVar.g) {
                        actiVar.E(acteVar, acumVar);
                        aopa createBuilder = asjj.a.createBuilder();
                        aopa createBuilder2 = askg.a.createBuilder();
                        createBuilder2.copyOnWrite();
                        askg.a((askg) createBuilder2.instance);
                        createBuilder.copyOnWrite();
                        asjj asjjVar = (asjj) createBuilder.instance;
                        askg askgVar = (askg) createBuilder2.mo39build();
                        askgVar.getClass();
                        asjjVar.y = askgVar;
                        asjjVar.c |= 32768;
                        actiVar.u(acteVar, (asjj) createBuilder.mo39build());
                    } else {
                        actiVar.o(acteVar, acumVar);
                    }
                }
            }
        } else {
            d = njj.d(mJ(), this.ah.f, aL());
        }
        for (njj njjVar2 : d) {
            akavVar.add(njjVar2);
        }
        return akavVar;
    }

    @Override // defpackage.vew
    protected final AdapterView.OnItemClickListener aI() {
        return this;
    }

    @Override // defpackage.vew
    protected final String aJ() {
        return null;
    }

    protected final akav aK() {
        return (akav) this.aC;
    }

    @Override // defpackage.jza
    public final void b(aicg aicgVar) {
        this.aj = aicgVar;
    }

    @Override // defpackage.jza
    public final void c(dt dtVar) {
        if (ap() || at()) {
            return;
        }
        qv(dtVar.getSupportFragmentManager(), "VIDEO_QUALITIES_QUICK_MENU_BOTTOM_SHEET_FRAGMENT");
    }

    @Override // defpackage.vew, defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mc(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.bottom_sheet_list_fragment, viewGroup, false);
        inflate.findViewById(R.id.bottom_sheet_title).setVisibility(8);
        ListView listView = (ListView) inflate.findViewById(R.id.bottom_sheet_list_view);
        View inflate2 = layoutInflater.inflate(R.layout.video_quality_bottom_sheet_list_fragment_title, (ViewGroup) listView, false);
        CharSequence charSequence = (CharSequence) this.ah.e.e("");
        if (!TextUtils.isEmpty(charSequence)) {
            ((TextView) inflate2.findViewById(R.id.bottom_sheet_title_resolution)).setText(charSequence);
        }
        listView.addHeaderView(inflate2, null, false);
        View inflate3 = layoutInflater.inflate(R.layout.bottom_sheet_list_fragment_footer, (ViewGroup) listView, false);
        YouTubeTextView youTubeTextView = (YouTubeTextView) inflate3.findViewById(R.id.bottom_sheet_footer_text);
        if (aM()) {
            youTubeTextView.setText(nni.e(mJ(), R.string.video_quality_quick_menu_settings_footer_info_2));
            youTubeTextView.setOnClickListener(new View.OnClickListener() { // from class: nke
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    nkf nkfVar = nkf.this;
                    acti actiVar = nkfVar.ai;
                    if (actiVar != null) {
                        actiVar.H(3, new acte(actj.VIDEO_QUALITY_QUICK_MENU_SETTINGS_DEEPLINK), null);
                    }
                    nkfVar.am(etk.c(nkfVar.mJ()));
                }
            });
        } else {
            youTubeTextView.setText(mJ().getString(R.string.video_quality_quick_menu_settings_footer_info_2));
            youTubeTextView.setBackground(null);
            youTubeTextView.d(false);
        }
        listView.addFooterView(inflate3, null, false);
        listView.setAdapter((ListAdapter) aK());
        listView.setOnItemClickListener(this);
        return inflate;
    }

    @Override // defpackage.vew
    protected final int mv() {
        return 0;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        String str;
        njj njjVar = (njj) aK().getItem(i - 1);
        acti actiVar = this.ai;
        if (njjVar.b) {
            actiVar.H(3, new acte(njj.c(njjVar.a)), null);
        }
        awan awanVar = njjVar.a;
        if (awanVar == awan.VIDEO_QUALITY_SETTING_ADVANCED_MENU) {
            this.ag.c(mJ());
        } else {
            if (njjVar.a == awan.VIDEO_QUALITY_SETTING_UNKNOWN) {
                str = njjVar.i.getString(R.string.video_quality_quick_menu_auto_toast);
            } else {
                str = njjVar.c;
            }
            dt mJ = mJ();
            if (mJ != null) {
                this.ah.c(mJ.getString(R.string.video_quality_menu_per_playback_duration_confirmation, new Object[]{str}));
            }
            this.aj.x(awanVar);
        }
        dismiss();
    }
}
