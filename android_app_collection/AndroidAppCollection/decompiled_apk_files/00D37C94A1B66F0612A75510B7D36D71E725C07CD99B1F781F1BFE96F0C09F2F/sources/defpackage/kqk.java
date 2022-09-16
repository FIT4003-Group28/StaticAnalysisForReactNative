package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.playlist.PrivacySpinner;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.CreatePlaylistDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint;
import com.google.protos.youtube.api.innertube.DropdownRendererOuterClass;
import com.google.protos.youtube.api.innertube.MetadataBadgeRendererOuterClass;
import java.util.List;
/* compiled from: PG */
/* renamed from: kqk  reason: default package */
/* loaded from: classes3.dex */
public final class kqk extends kqm {
    public aafo ae;
    public akbn af;
    public ftb ag;
    public kpn ah;
    public abaz ai;
    public yzj aj;
    public yni ak;
    public CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint al;
    public List am;
    public aqiw an;
    public EditText ao;
    public akbm ap;
    public kpm aq;
    private View ar;

    public static boolean aE(aqiw aqiwVar) {
        aunb aunbVar = aqiwVar.d;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        return aunbVar.qn(MetadataBadgeRendererOuterClass.metadataBadgeRenderer);
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        amuk q;
        CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint createPlaylistEndpointOuterClass$CreatePlaylistEndpoint;
        aunb aunbVar;
        aunb aunbVar2;
        super.mQ(bundle);
        mN(0, 0);
        Bundle bundle2 = this.m;
        if (bundle2 == null || !bundle2.containsKey("SelectedVideoIds")) {
            q = amuk.q();
        } else {
            q = amuk.o(bundle2.getStringArrayList("SelectedVideoIds"));
        }
        this.am = q;
        if (bundle2 == null || !bundle2.containsKey("CreatePlaylistDialogEndpoint")) {
            createPlaylistEndpointOuterClass$CreatePlaylistEndpoint = CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.a;
        } else {
            byte[] byteArray = bundle2.getByteArray("CreatePlaylistDialogEndpoint");
            if (byteArray != null) {
                try {
                    createPlaylistEndpointOuterClass$CreatePlaylistEndpoint = (CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint) aopi.parseFrom(CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.a, byteArray, aoos.b());
                } catch (aopx e) {
                    zep.d("Unable to decode create playlist endpoint", e);
                }
            }
            createPlaylistEndpointOuterClass$CreatePlaylistEndpoint = CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.a;
        }
        this.al = createPlaylistEndpointOuterClass$CreatePlaylistEndpoint;
        if (createPlaylistEndpointOuterClass$CreatePlaylistEndpoint.c == 9) {
            aunbVar = (aunb) createPlaylistEndpointOuterClass$CreatePlaylistEndpoint.d;
        } else {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(CreatePlaylistDialogRendererOuterClass.createPlaylistDialogRenderer)) {
            CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint createPlaylistEndpointOuterClass$CreatePlaylistEndpoint2 = this.al;
            if (createPlaylistEndpointOuterClass$CreatePlaylistEndpoint2.c == 9) {
                aunbVar2 = (aunb) createPlaylistEndpointOuterClass$CreatePlaylistEndpoint2.d;
            } else {
                aunbVar2 = aunb.a;
            }
            this.an = (aqiw) aunbVar2.qm(CreatePlaylistDialogRendererOuterClass.createPlaylistDialogRenderer);
            return;
        }
        this.an = aqiw.a;
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mc(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.create_playlist_dialog, viewGroup, false);
        this.ar = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.dialog_title);
        arag aragVar = this.an.b;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        zag.m(textView, ajgl.b(aragVar));
        TextInputLayout textInputLayout = (TextInputLayout) this.ar.findViewById(R.id.name_text_input_layout);
        textInputLayout.C(false);
        EditText editText = (EditText) this.ar.findViewById(R.id.name);
        this.ao = editText;
        editText.setHint(this.an.c);
        this.ao.addTextChangedListener(new kqi(this, textInputLayout));
        PrivacySpinner privacySpinner = (PrivacySpinner) this.ar.findViewById(R.id.privacy_select);
        this.aq = this.ah.a(privacySpinner);
        fta b = this.ag.b(rb(), (ViewStub) this.ar.findViewById(R.id.privacy_badge));
        if (aE(this.an)) {
            aunb aunbVar = this.an.d;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            b.f((atfh) aunbVar.qm(MetadataBadgeRendererOuterClass.metadataBadgeRenderer));
            this.ar.findViewById(R.id.privacy_dropdown_container).setVisibility(8);
        } else {
            aunb aunbVar2 = this.an.d;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            if (aunbVar2.qn(DropdownRendererOuterClass.dropdownRenderer)) {
                kpm kpmVar = this.aq;
                aunb aunbVar3 = this.an.d;
                if (aunbVar3 == null) {
                    aunbVar3 = aunb.a;
                }
                kpmVar.a((aqrd) aunbVar3.qm(DropdownRendererOuterClass.dropdownRenderer));
                this.aq.c = new kqh(this);
            } else {
                this.aq.a(null);
                this.aq.c(1);
            }
            privacySpinner.c = this.d;
            this.ar.findViewById(R.id.privacy_dropdown_container).setVisibility(0);
            b.f(null);
        }
        akbm a = this.af.a((TextView) this.ar.findViewById(R.id.cancel_button));
        aunb aunbVar4 = this.an.f;
        if (aunbVar4 == null) {
            aunbVar4 = aunb.a;
        }
        a.b((apoj) aunbVar4.qm(ButtonRendererOuterClass.buttonRenderer), null);
        a.d = new kqg(this, 1);
        akbm a2 = this.af.a((TextView) this.ar.findViewById(R.id.create_button));
        this.ap = a2;
        aunb aunbVar5 = this.an.g;
        if (aunbVar5 == null) {
            aunbVar5 = aunb.a;
        }
        a2.b((apoj) aunbVar5.qm(ButtonRendererOuterClass.buttonRenderer), null);
        this.ap.d(false);
        this.ap.d = new kqg(this);
        this.ar.findViewById(R.id.cancel_and_create_button).setVisibility(0);
        return this.ar;
    }

    @Override // defpackage.dh
    public final Dialog oy(Bundle bundle) {
        Dialog oy = super.oy(bundle);
        oy.getWindow().setSoftInputMode(4);
        return oy;
    }
}
