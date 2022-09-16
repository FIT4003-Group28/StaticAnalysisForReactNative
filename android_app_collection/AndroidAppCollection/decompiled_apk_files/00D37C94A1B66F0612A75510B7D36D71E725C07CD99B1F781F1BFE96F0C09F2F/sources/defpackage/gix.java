package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.apps.youtube.app.common.ui.playlist.PrivacySpinner;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CreatePlaylistDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gix  reason: default package */
/* loaded from: classes3.dex */
public final class gix implements aafl {
    public final yzj a;
    private final aagi b;
    private final Activity c;
    private final afvn d;
    private final afwc e;
    private final gea f;
    private final kql g;

    public gix(Activity activity, afvn afvnVar, afwc afwcVar, yzj yzjVar, gea geaVar, aagi aagiVar, kql kqlVar) {
        this.c = activity;
        this.b = aagiVar;
        this.d = afvnVar;
        this.e = afwcVar;
        this.a = yzjVar;
        this.f = geaVar;
        this.g = kqlVar;
    }

    public final void b(final List list, CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, final ampq ampqVar) {
        aunb aunbVar;
        int i;
        list.getClass();
        if (createPlaylistEndpointOuterClass$CreatePlaylistEndpoint.c == 9) {
            aunbVar = (aunb) createPlaylistEndpointOuterClass$CreatePlaylistEndpoint.d;
        } else {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(CreatePlaylistDialogRendererOuterClass.createPlaylistDialogRenderer)) {
            dt dtVar = this.g.a;
            kqk kqkVar = new kqk();
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("SelectedVideoIds", new ArrayList<>(list));
            bundle.putByteArray("CreatePlaylistDialogEndpoint", createPlaylistEndpointOuterClass$CreatePlaylistEndpoint.toByteArray());
            kqkVar.ae(bundle);
            kqkVar.qv(dtVar.getSupportFragmentManager(), "CreatePlaylistDialogFragment");
            return;
        }
        final gea geaVar = this.f;
        final String str = createPlaylistEndpointOuterClass$CreatePlaylistEndpoint.f;
        final String str2 = createPlaylistEndpointOuterClass$CreatePlaylistEndpoint.g;
        str.getClass();
        str2.getClass();
        View inflate = geaVar.a.getLayoutInflater().inflate(R.layout.create_playlist_dialog, (ViewGroup) null, false);
        final TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.name_text_input_layout);
        textInputLayout.C(false);
        final EditText editText = (EditText) inflate.findViewById(R.id.name);
        final PrivacySpinner privacySpinner = (PrivacySpinner) inflate.findViewById(R.id.privacy_select);
        privacySpinner.c(3);
        asxp asxpVar = geaVar.g.a().e;
        if (asxpVar == null) {
            asxpVar = asxp.a;
        }
        if ((asxpVar.d & 8388608) != 0) {
            i = awwc.bX(asxpVar.V);
            if (i == 0) {
                i = 1;
            }
        } else {
            i = 2;
        }
        privacySpinner.e(i);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: gdt
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                gea geaVar2 = gea.this;
                EditText editText2 = editText;
                PrivacySpinner privacySpinner2 = privacySpinner;
                List<String> list2 = list;
                String str3 = str;
                String str4 = str2;
                ampq ampqVar2 = ampqVar;
                zag.i(editText2);
                if (i2 != -1) {
                    return;
                }
                String trim = editText2.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    return;
                }
                int d = privacySpinner2.d();
                abat d2 = geaVar2.b.d();
                d2.u(trim);
                d2.c = d;
                d2.i();
                for (String str5 : list2) {
                    d2.t(str5);
                }
                if (!TextUtils.isEmpty(str3)) {
                    d2.a = str3;
                }
                if (!TextUtils.isEmpty(str4)) {
                    d2.b = str4;
                }
                geaVar2.b.g(d2, new gdz(geaVar2, 1));
                if (!ampqVar2.h()) {
                    return;
                }
                ((kqr) ((kpt) ampqVar2.c()).a.m).dismiss();
            }
        };
        AlertDialog create = new AlertDialog.Builder(geaVar.a).setTitle(R.string.create_playlist_dialog_title).setView(inflate).setPositiveButton(geaVar.a.getString(R.string.create_button_text), onClickListener).setNegativeButton(geaVar.a.getString(17039360), onClickListener).create();
        privacySpinner.c = create;
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: gdw
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                gea geaVar2 = gea.this;
                TextInputLayout textInputLayout2 = textInputLayout;
                EditText editText2 = editText;
                Button button = ((AlertDialog) dialogInterface).getButton(-1);
                gdx gdxVar = new gdx(geaVar2, textInputLayout2, button);
                geaVar2.b(button, false);
                editText2.addTextChangedListener(gdxVar);
            }
        });
        create.getWindow().setSoftInputMode(4);
        create.show();
    }

    public final void c(List list, CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, Map map) {
        ampq ampqVar;
        if (map == null || !(map.get("PLAYLIST_CREATION_LISTENER_KEY") instanceof kpt)) {
            ampqVar = amon.a;
        } else {
            ampqVar = ampq.j((kpt) map.get("PLAYLIST_CREATION_LISTENER_KEY"));
        }
        if (this.d.t()) {
            b(list, createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, ampqVar);
        } else {
            this.e.c(this.c, null, new giw(this, list, createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, ampqVar));
        }
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, final Map map) {
        final CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint createPlaylistEndpointOuterClass$CreatePlaylistEndpoint = (CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint) apzgVar.qm(CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.createPlaylistEndpoint);
        if ((createPlaylistEndpointOuterClass$CreatePlaylistEndpoint.b & 8) == 0) {
            c(createPlaylistEndpointOuterClass$CreatePlaylistEndpoint.e, createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, map);
        } else {
            this.b.a(this.d.c()).f(createPlaylistEndpointOuterClass$CreatePlaylistEndpoint.h).y(aypa.a()).o(new giv(this, createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, map, 1)).m(new giv(this, createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, map)).l(new aypv() { // from class: giu
                @Override // defpackage.aypv
                public final void a() {
                    gix.this.c(amuk.q(), createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, map);
                }
            }).S();
        }
    }
}
