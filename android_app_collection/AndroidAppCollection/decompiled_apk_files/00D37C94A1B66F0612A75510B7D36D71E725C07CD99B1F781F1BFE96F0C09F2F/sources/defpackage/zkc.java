package defpackage;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import com.google.android.libraries.youtube.edit.audioswap.model.FeaturedTrackSelection;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.android.youtube.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: zkc  reason: default package */
/* loaded from: classes4.dex */
public final class zkc extends zkk {
    public ajmr a;
    public zkr ae;
    public String af;
    public nj ag;
    public zkb ah;
    private Button ai;
    public View b;
    public ProgressBar c;
    public View d;
    public ListView e;

    public final void a() {
        dt mJ = mJ();
        zjl zjlVar = ((zjm) mJ).a().a;
        String str = this.af;
        final zka zkaVar = new zka(this, mJ);
        aatf f = zjlVar.a.f();
        f.i();
        f.t("FEaudio_tracks");
        zgh.n(str, "Params for browse request cannot be empty.");
        f.v(str);
        ylx.n(this, zjlVar.a.h(f, anjk.a), new zdt() { // from class: zji
            @Override // defpackage.zdt
            public final void a(Object obj) {
                zka zkaVar2 = zka.this;
                zep.d("Audio tracks browse request failed.", (Throwable) obj);
                zkaVar2.a();
            }
        }, new zdt() { // from class: zjh
            @Override // defpackage.zdt
            public final void a(Object obj) {
                FeaturedTrackSelection featuredTrackSelection;
                aqye aqyeVar;
                aqye aqyeVar2;
                zka zkaVar2 = zka.this;
                BrowseResponseModel browseResponseModel = (BrowseResponseModel) obj;
                zjk zjkVar = null;
                arag aragVar = null;
                Spanned spanned = null;
                zjkVar = null;
                if (browseResponseModel == null || browseResponseModel.j()) {
                    zep.b("Browse response is empty!");
                } else {
                    aakw f2 = browseResponseModel.f();
                    if (f2 != null) {
                        arlt arltVar = browseResponseModel.a;
                        if ((arltVar.b & 2) != 0) {
                            arlo arloVar = arltVar.d;
                            if (arloVar == null) {
                                arloVar = arlo.a;
                            }
                            if (arloVar.b == 50236216) {
                                aqyeVar = (aqye) arloVar.c;
                            } else {
                                aqyeVar = aqye.a;
                            }
                            if ((aqyeVar.b & 1) != 0) {
                                arlo arloVar2 = arltVar.d;
                                if (arloVar2 == null) {
                                    arloVar2 = arlo.a;
                                }
                                if (arloVar2.b == 50236216) {
                                    aqyeVar2 = (aqye) arloVar2.c;
                                } else {
                                    aqyeVar2 = aqye.a;
                                }
                                aragVar = aqyeVar2.c;
                                if (aragVar == null) {
                                    aragVar = arag.a;
                                }
                            }
                            spanned = ajgl.b(aragVar);
                        }
                        ArrayList arrayList = new ArrayList();
                        amuk a = f2.a();
                        int size = a.size();
                        int i = 0;
                        for (int i2 = 0; i2 < size; i2++) {
                            Object obj2 = a.get(i2);
                            if (obj2 instanceof aakq) {
                                aakq aakqVar = (aakq) obj2;
                                aslq aslqVar = aakqVar.a;
                                aslm aslmVar = aslqVar.g;
                                if (aslmVar == null) {
                                    aslmVar = aslm.a;
                                }
                                if ((aslmVar.b & 1) != 0) {
                                    aslm aslmVar2 = aslqVar.g;
                                    if (aslmVar2 == null) {
                                        aslmVar2 = aslm.a;
                                    }
                                    asll asllVar = aslmVar2.c;
                                    if (asllVar == null) {
                                        asllVar = asll.a;
                                    }
                                    if ((asllVar.b & 1) != 0) {
                                        try {
                                            i = Color.parseColor(asllVar.c);
                                        } catch (IllegalArgumentException e) {
                                            zep.d("Cannot parse color; defaulting to Color.TRANSPARENT.", e);
                                        }
                                    }
                                    i = 0;
                                }
                                for (Object obj3 : aakqVar.b()) {
                                    if (obj3 instanceof apiq) {
                                        arrayList.add(zjl.a((apiq) obj3));
                                    }
                                }
                            }
                        }
                        zjk zjkVar2 = new zjk();
                        if (spanned != null && !arrayList.isEmpty()) {
                            zjkVar2.a = new FeaturedTrackSelection(spanned, arrayList, i);
                        }
                        zjkVar = zjkVar2;
                    }
                }
                if (zjkVar == null || (featuredTrackSelection = zjkVar.a) == null) {
                    zep.b("Audio tracks browse request error.");
                    zkaVar2.a();
                    return;
                }
                zjy b = ((zjx) zkaVar2.a).b();
                zkaVar2.b.ag.p(featuredTrackSelection.b);
                zkc zkcVar = zkaVar2.b;
                dt dtVar = zkaVar2.a;
                zkcVar.ae = new zkr(dtVar, featuredTrackSelection.a(dtVar), b, zkaVar2.b.a, false);
                zkc zkcVar2 = zkaVar2.b;
                ListView listView = zkcVar2.e;
                zkr zkrVar = zkcVar2.ae;
                zkrVar.getClass();
                listView.setAdapter((ListAdapter) zkrVar);
                zkaVar2.b.b.setVisibility(8);
                zkaVar2.b.e.setBackgroundColor(featuredTrackSelection.c);
                zkaVar2.b.e.setVisibility(0);
            }
        });
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        if (bundle != null) {
            this.af = bundle.getString("browse_params");
        }
        this.af.getClass();
        nj supportActionBar = ((oa) mJ()).getSupportActionBar();
        this.ag = supportActionBar;
        supportActionBar.getClass();
        zkb zkbVar = this.ah;
        if (zkbVar != null) {
            zkbVar.h();
        }
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.audio_swap_category_contents_selection, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.audio_swap_loading_view);
        this.b = findViewById;
        this.d = findViewById.findViewById(R.id.audio_swap_error_indicator);
        this.c = (ProgressBar) this.b.findViewById(R.id.audio_swap_loading_indicator);
        Button button = (Button) this.b.findViewById(R.id.audio_swap_retry_button);
        this.ai = button;
        button.setOnClickListener(new zjz(this));
        this.e = (ListView) inflate.findViewById(R.id.audio_swap_category_contents_selection_contents);
        this.b.getClass();
        this.d.getClass();
        this.c.getClass();
        this.e.getClass();
        n();
        a();
        return inflate;
    }

    @Override // defpackage.dp
    public final void my() {
        super.my();
        zkb zkbVar = this.ah;
        if (zkbVar != null) {
            zkbVar.g();
        }
    }

    public final void n() {
        this.b.setVisibility(0);
        this.c.setVisibility(0);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
    }

    @Override // defpackage.dp
    public final void oz(Bundle bundle) {
        bundle.putString("browse_params", this.af);
    }
}
