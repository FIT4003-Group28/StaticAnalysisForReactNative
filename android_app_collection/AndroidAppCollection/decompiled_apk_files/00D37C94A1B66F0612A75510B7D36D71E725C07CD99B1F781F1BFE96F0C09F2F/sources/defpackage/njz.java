package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: njz  reason: default package */
/* loaded from: classes3.dex */
public final class njz extends njp implements AdapterView.OnItemClickListener, jyt {
    public jyu ae;
    public aiix af;
    public acth ag;
    public Context ah;
    public acti ai;
    public aacz aj;
    private ArrayList ak;
    private SubtitleTrack al;
    private aibf am;

    @Override // defpackage.dp
    public final void W() {
        super.W();
        dismiss();
    }

    @Override // defpackage.jyt
    public final void a(SubtitleTrack subtitleTrack) {
        this.al = subtitleTrack;
    }

    @Override // defpackage.vew
    protected final /* bridge */ /* synthetic */ ListAdapter aG() {
        akav akavVar = new akav(this.ah);
        InteractionLoggingScreen c = this.ag.oi().c();
        if (c != null) {
            this.ai = this.ag.oi();
            acum acumVar = new acum(c, actj.CAPTIONS_QUICK_MENU);
            this.ai.n(acumVar);
            if (this.af.u()) {
                this.ai.o(new acte(actj.CAPTIONS_QUICK_MENU_SETTINGS_DEEPLINK), acumVar);
            }
        }
        ArrayList arrayList = this.ak;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                SubtitleTrack subtitleTrack = (SubtitleTrack) arrayList.get(i);
                njl njlVar = new njl(this.ah, subtitleTrack);
                njlVar.a(subtitleTrack.equals(this.al));
                akavVar.add(njlVar);
            }
        }
        return akavVar;
    }

    @Override // defpackage.vew
    protected final AdapterView.OnItemClickListener aI() {
        return this;
    }

    @Override // defpackage.vew
    protected final String aJ() {
        return rh().getString(R.string.overflow_captions);
    }

    @Override // defpackage.jyt
    public final void b(aibf aibfVar) {
        this.am = aibfVar;
    }

    @Override // defpackage.jyt
    public final void c(List list) {
        this.ak = new ArrayList(list);
        ListAdapter listAdapter = this.aC;
        if (listAdapter != null) {
            ((akav) listAdapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.jyt
    public final void d(dt dtVar) {
        if (ap() || at()) {
            return;
        }
        qw(dtVar.getSupportFragmentManager(), "SUBTITLE_MENU_BOTTOM_SHEET_FRAGMENT");
    }

    @Override // defpackage.vew, defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View mc = super.mc(layoutInflater, viewGroup, bundle);
        if (mc != null) {
            View findViewById = mc.findViewById(R.id.bottom_sheet_title);
            if (findViewById instanceof TextView) {
                ((TextView) findViewById).setTextColor(zhn.d(layoutInflater.getContext(), R.attr.ytTextPrimary));
            }
            if (this.af.u()) {
                ListView listView = (ListView) mc.findViewById(R.id.bottom_sheet_list_view);
                View inflate = layoutInflater.inflate(R.layout.bottom_sheet_list_fragment_footer, (ViewGroup) listView, false);
                YouTubeTextView youTubeTextView = (YouTubeTextView) inflate.findViewById(R.id.bottom_sheet_footer_text);
                youTubeTextView.setText(nni.e(mJ(), R.string.subtitle_menu_settings_footer_info));
                youTubeTextView.setOnClickListener(new View.OnClickListener() { // from class: njy
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        njz njzVar = njz.this;
                        acti actiVar = njzVar.ai;
                        if (actiVar != null) {
                            actiVar.H(3, new acte(actj.CAPTIONS_QUICK_MENU_SETTINGS_DEEPLINK), null);
                        }
                        njzVar.am(new Intent("android.settings.CAPTIONING_SETTINGS"));
                    }
                });
                listView.addFooterView(inflate, null, false);
                listView.setAdapter(this.aC);
                listView.setOnItemClickListener(this);
            }
        }
        return mc;
    }

    @Override // defpackage.vew
    protected final int mv() {
        return 0;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        njl njlVar = (njl) ((akav) this.aC).getItem(i);
        this.am.pA(njlVar.a);
        if (eog.aM(this.aj)) {
            this.ae.d(njlVar.a);
        }
        dismiss();
    }

    @Override // defpackage.dp
    public final Context rb() {
        return this.ah;
    }
}
