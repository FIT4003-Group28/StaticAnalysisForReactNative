package defpackage;

import android.content.res.Resources;
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
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nkb  reason: default package */
/* loaded from: classes3.dex */
public final class nkb implements nkc {
    final /* synthetic */ nkd a;
    private final /* synthetic */ int b;

    public nkb(nkd nkdVar) {
        this.a = nkdVar;
    }

    public nkb(nkd nkdVar, int i) {
        this.b = i;
        this.a = nkdVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (this.b == 0) {
            int i2 = i - 1;
            njk njkVar = (njk) this.a.aL().getItem(i2);
            this.a.aM(njkVar.d(), i2);
            String str = njkVar.c;
            dt mJ = this.a.mJ();
            if (mJ != null) {
                this.a.ag.c(mJ.getString(R.string.video_quality_menu_per_playback_duration_confirmation, new Object[]{str}));
            }
            this.a.al.w(njkVar.c());
            this.a.dismiss();
            return;
        }
        njk njkVar2 = (njk) this.a.aL().getItem(i);
        this.a.aM(njkVar2.d(), i);
        this.a.al.w(njkVar2.c());
        this.a.dismiss();
    }

    @Override // defpackage.nkc
    public final akav b() {
        nkd nkdVar;
        int i;
        String str;
        int i2 = 0;
        if (this.b == 0) {
            akav akavVar = new akav(this.a.mJ());
            nkd nkdVar2 = this.a;
            VideoQuality[] videoQualityArr = nkdVar2.ah;
            if (videoQualityArr != null && videoQualityArr.length > 0) {
                awan awanVar = nkdVar2.ag.f;
                while (true) {
                    nkd nkdVar3 = this.a;
                    VideoQuality[] videoQualityArr2 = nkdVar3.ah;
                    if (i2 >= videoQualityArr2.length) {
                        break;
                    }
                    njk njkVar = new njk(nkdVar3.mJ(), videoQualityArr2[i2]);
                    if (njkVar.c() != -2) {
                        if (awanVar == awan.VIDEO_QUALITY_SETTING_ADVANCED_MENU && (i2 == (i = (nkdVar = this.a).ai) || (i == 0 && i2 == nkdVar.aj))) {
                            njkVar.a(true);
                        }
                        akavVar.add(njkVar);
                    }
                    i2++;
                }
            }
            return akavVar;
        }
        akav akavVar2 = new akav(this.a.mJ());
        VideoQuality[] videoQualityArr3 = this.a.ah;
        if (videoQualityArr3 != null && videoQualityArr3.length > 0) {
            int i3 = 0;
            while (true) {
                nkd nkdVar4 = this.a;
                VideoQuality[] videoQualityArr4 = nkdVar4.ah;
                if (i3 >= videoQualityArr4.length) {
                    break;
                }
                njk njkVar2 = new njk(nkdVar4.mJ(), videoQualityArr4[i3]);
                njkVar2.h = null;
                nkd nkdVar5 = this.a;
                int i4 = nkdVar5.ai;
                if (i3 == i4 && nkdVar5.an == 1) {
                    njkVar2.a(true);
                } else if (i3 != i4 || nkdVar5.ak || nkdVar5.an != 2) {
                    if (nkdVar5.an == 2 && nkdVar5.ak && njkVar2.c() == -2) {
                        nkd nkdVar6 = this.a;
                        int i5 = nkdVar6.ai;
                        if (i5 <= 0 || i5 >= nkdVar6.ah.length) {
                            int i6 = nkdVar6.aj;
                            if (i6 <= 0 || i6 >= nkdVar6.ah.length) {
                                str = "";
                            } else {
                                Resources rh = nkdVar6.rh();
                                nkd nkdVar7 = this.a;
                                String valueOf = String.valueOf(rh.getString(R.string.quality_label, nkdVar7.ah[nkdVar7.aj].b));
                                str = valueOf.length() != 0 ? " ".concat(valueOf) : new String(" ");
                            }
                        } else {
                            Resources rh2 = nkdVar6.rh();
                            nkd nkdVar8 = this.a;
                            String valueOf2 = String.valueOf(rh2.getString(R.string.quality_label, nkdVar8.ah[nkdVar8.ai].b));
                            str = valueOf2.length() != 0 ? " ".concat(valueOf2) : new String(" ");
                        }
                        njkVar2.h = str;
                        njkVar2.a(true);
                    }
                } else {
                    njkVar2.a(true);
                }
                akavVar2.add(njkVar2);
                i3++;
            }
        }
        return akavVar2;
    }

    @Override // defpackage.nkc
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View mc;
        if (this.b != 0) {
            mc = super/*njq*/.mc(layoutInflater, viewGroup, bundle);
            return mc;
        }
        super/*njq*/.mc(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.bottom_sheet_list_fragment, viewGroup, false);
        inflate.findViewById(R.id.bottom_sheet_title).setVisibility(8);
        ListView listView = (ListView) inflate.findViewById(R.id.bottom_sheet_list_view);
        View inflate2 = layoutInflater.inflate(R.layout.video_quality_bottom_sheet_list_fragment_title, (ViewGroup) listView, false);
        CharSequence charSequence = (CharSequence) this.a.ag.e.e("");
        if (!TextUtils.isEmpty(charSequence)) {
            ((TextView) inflate2.findViewById(R.id.bottom_sheet_title_resolution)).setText(charSequence);
        }
        listView.addHeaderView(inflate2, null, false);
        atdy atdyVar = this.a.af.a().i;
        if (atdyVar == null) {
            atdyVar = atdy.a;
        }
        atdz atdzVar = atdyVar.k;
        if (atdzVar == null) {
            atdzVar = atdz.a;
        }
        if (atdzVar.j) {
            View inflate3 = layoutInflater.inflate(R.layout.bottom_sheet_list_fragment_footer, (ViewGroup) listView, false);
            YouTubeTextView youTubeTextView = (YouTubeTextView) inflate3.findViewById(R.id.bottom_sheet_footer_text);
            youTubeTextView.setText(nni.e(this.a.mJ(), R.string.video_quality_quick_menu_settings_footer_info_2));
            youTubeTextView.setOnClickListener(new View.OnClickListener() { // from class: nka
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    nkb nkbVar = nkb.this;
                    acti actiVar = nkbVar.a.am;
                    if (actiVar != null) {
                        actiVar.H(3, new acte(actj.VIDEO_QUALITY_QUICK_MENU_SETTINGS_DEEPLINK), null);
                    }
                    nkd nkdVar = nkbVar.a;
                    nkdVar.am(etk.c(nkdVar.mJ()));
                }
            });
            listView.addFooterView(inflate3, null, false);
        }
        listView.setAdapter((ListAdapter) this.a.aL());
        listView.setOnItemClickListener(this.a);
        return inflate;
    }
}
