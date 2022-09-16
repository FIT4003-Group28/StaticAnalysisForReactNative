package defpackage;

import android.app.AlertDialog;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.fragments.PlaylistEditorFragment$EditorState;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MetadataBadgeRendererOuterClass;
import com.google.protos.youtube.api.innertube.PlaylistEditEndpointOuterClass$PlaylistEditEndpoint;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: iqp  reason: default package */
/* loaded from: classes3.dex */
public final class iqp extends ipe implements ynl {
    public afvn a;
    private View aA;
    private TextView aB;
    private TextView aC;
    private fta aD;
    private kpm aE;
    private float aF;
    private float aG;
    private int aH;
    public ajmy ae;
    public aafo af;
    public ftb ag;
    public kpn ah;
    public String ai;
    public aueb aj;
    public LoadingFrameLayout ak;
    public YouTubeTextView al;
    public iqo am;
    public AlertDialog an;
    private PlaylistEditEndpointOuterClass$PlaylistEditEndpoint ao;
    private apzg aw;
    private ImageView ax;
    private EditText ay;
    private EditText az;
    public abaz b;
    public abbe c;
    public yzj d;
    public yni e;

    public static int aF(audw audwVar) {
        auee aueeVar;
        if (audwVar.b == 4) {
            aueeVar = (auee) audwVar.c;
        } else {
            aueeVar = auee.a;
        }
        audq audqVar = aueeVar.b;
        if (audqVar == null) {
            audqVar = audq.a;
        }
        aqre aqreVar = audqVar.b;
        if (aqreVar == null) {
            aqreVar = aqre.a;
        }
        aqrd aqrdVar = aqreVar.c;
        if (aqrdVar == null) {
            aqrdVar = aqrd.a;
        }
        for (aqra aqraVar : aqrdVar.c) {
            aqrc aqrcVar = aqraVar.c;
            if (aqrcVar == null) {
                aqrcVar = aqrc.a;
            }
            if (aqrcVar.h) {
                aqrc aqrcVar2 = aqraVar.c;
                if (aqrcVar2 == null) {
                    aqrcVar2 = aqrc.a;
                }
                int bX = awwc.bX(aqrcVar2.c == 6 ? ((Integer) aqrcVar2.d).intValue() : 0);
                if (bX == 0) {
                    throw new IllegalStateException("Unknown privacy status");
                }
                return bX;
            }
        }
        throw new IllegalStateException();
    }

    private final PlaylistEditorFragment$EditorState aG() {
        return new PlaylistEditorFragment$EditorState(this.ay.getText(), this.az.getText(), this.aE.b());
    }

    private static boolean aH(audw audwVar) {
        aunb aunbVar;
        if (audwVar.b == 6) {
            aunbVar = (aunb) audwVar.c;
        } else {
            aunbVar = aunb.a;
        }
        return aunbVar.qn(MetadataBadgeRendererOuterClass.metadataBadgeRenderer);
    }

    private static boolean aI(audw audwVar) {
        auee aueeVar;
        if (audwVar.b == 4) {
            aueeVar = (auee) audwVar.c;
        } else {
            aueeVar = auee.a;
        }
        audq audqVar = aueeVar.b;
        if (audqVar == null) {
            audqVar = audq.a;
        }
        aqre aqreVar = audqVar.b;
        if (aqreVar == null) {
            aqreVar = aqre.a;
        }
        return (aqreVar.b & 1) != 0;
    }

    private final boolean bd() {
        audw h = fyv.h(this.aj);
        if (h != null) {
            aued auedVar = h.e;
            if (auedVar == null) {
                auedVar = aued.a;
            }
            if ((auedVar.b & 1) != 0) {
                aued auedVar2 = h.f;
                if (auedVar2 == null) {
                    auedVar2 = aued.a;
                }
                if ((auedVar2.b & 1) != 0) {
                    if (aH(h)) {
                        return true;
                    }
                    if (aI(h)) {
                        try {
                            aF(h);
                            return true;
                        } catch (IllegalStateException unused) {
                            zep.b("Privacy status is not set in the PrivacyDropdown.");
                            return false;
                        }
                    }
                    zep.b("Missing privacy option in the PlaylistSettingsEditorRenderer");
                    return false;
                }
            }
        }
        zep.b("Missing name or description in the PlaylistSettingsEditorRenderer.");
        return false;
    }

    private static final void be(EditText editText, int i) {
        if (i <= 0) {
            return;
        }
        editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }

    @Override // defpackage.dp
    public final void W() {
        super.W();
        Optional.ofNullable(this.O).ifPresent(fyb.s);
    }

    @Override // defpackage.gbd, defpackage.dp
    public final void Y() {
        super.Y();
        if (!this.a.t()) {
            this.at.c(false);
        }
    }

    public final void aE(afzf afzfVar) {
        int i;
        PlaylistEditEndpointOuterClass$PlaylistEditEndpoint playlistEditEndpointOuterClass$PlaylistEditEndpoint = this.ao;
        if (playlistEditEndpointOuterClass$PlaylistEditEndpoint != null && bd()) {
            abbb a = this.c.a();
            a.a = playlistEditEndpointOuterClass$PlaylistEditEndpoint.b;
            a.i();
            PlaylistEditorFragment$EditorState aG = aG();
            audw h = fyv.h(this.aj);
            String trim = zgh.d(aG.a).toString().trim();
            if (!TextUtils.isEmpty(trim)) {
                aued auedVar = h.e;
                if (auedVar == null) {
                    auedVar = aued.a;
                }
                aqzs aqzsVar = auedVar.c;
                if (aqzsVar == null) {
                    aqzsVar = aqzs.a;
                }
                if (!TextUtils.equals(trim, aqzsVar.d)) {
                    aopa createBuilder = auci.a.createBuilder();
                    createBuilder.copyOnWrite();
                    auci auciVar = (auci) createBuilder.instance;
                    auciVar.c = 6;
                    auciVar.b |= 1;
                    createBuilder.copyOnWrite();
                    auci auciVar2 = (auci) createBuilder.instance;
                    trim.getClass();
                    auciVar2.b |= 256;
                    auciVar2.h = trim;
                    a.b.add((auci) createBuilder.mo39build());
                }
                String trim2 = zgh.d(aG.b).toString().trim();
                aued auedVar2 = h.f;
                if (auedVar2 == null) {
                    auedVar2 = aued.a;
                }
                aqzs aqzsVar2 = auedVar2.c;
                if (aqzsVar2 == null) {
                    aqzsVar2 = aqzs.a;
                }
                if (!TextUtils.equals(trim2, aqzsVar2.d)) {
                    aopa createBuilder2 = auci.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    auci auciVar3 = (auci) createBuilder2.instance;
                    auciVar3.c = 7;
                    auciVar3.b |= 1;
                    createBuilder2.copyOnWrite();
                    auci auciVar4 = (auci) createBuilder2.instance;
                    trim2.getClass();
                    auciVar4.b |= 512;
                    auciVar4.i = trim2;
                    a.b.add((auci) createBuilder2.mo39build());
                }
                if (aI(h) && (i = aG.c) != aF(h)) {
                    aopa createBuilder3 = auci.a.createBuilder();
                    createBuilder3.copyOnWrite();
                    auci auciVar5 = (auci) createBuilder3.instance;
                    auciVar5.c = 9;
                    auciVar5.b |= 1;
                    createBuilder3.copyOnWrite();
                    auci auciVar6 = (auci) createBuilder3.instance;
                    int i2 = i - 1;
                    if (i == 0) {
                        throw null;
                    }
                    auciVar6.j = i2;
                    auciVar6.b |= 2048;
                    a.b.add((auci) createBuilder3.mo39build());
                }
                if (a.b.size() <= 0) {
                    afzfVar.lG(null);
                    return;
                } else {
                    this.c.b(a, afzfVar);
                    return;
                }
            }
            zag.q(this.ap, R.string.edit_video_error_empty_title, 0);
        }
    }

    @Override // defpackage.gbd
    public final void aU() {
        PlaylistEditorFragment$EditorState aG = aG();
        iqm iqmVar = new iqm(this);
        iqmVar.a = aG;
        q(iqmVar);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwd afwdVar = (afwd) obj;
                this.at.c(false);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{afwd.class};
    }

    @Override // defpackage.gbd
    public final fsx lt() {
        if (this.aq == null) {
            fsw a = this.as.a();
            a.m(new ampg() { // from class: iqh
                @Override // defpackage.ampg
                public final Object apply(Object obj) {
                    iqp iqpVar = iqp.this;
                    frz frzVar = (frz) obj;
                    frzVar.a = iqpVar.rh().getString(R.string.edit_playlist_form_title);
                    frzVar.d(amvn.r(iqpVar.am));
                    return frzVar;
                }
            });
            this.aq = a.a();
        }
        return this.aq;
    }

    @Override // defpackage.gbd, defpackage.dp
    public final void mS() {
        super.mS();
        if (!this.a.t()) {
            this.at.c(false);
        } else {
            this.e.g(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0100  */
    @Override // defpackage.dp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View mc(android.view.LayoutInflater r6, android.view.ViewGroup r7, android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqp.mc(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // defpackage.dp
    public final void my() {
        super.my();
        this.e.m(this);
    }

    @Override // defpackage.dp
    public final void oz(Bundle bundle) {
        bundle.putString("playlist_id", this.ai);
        bundle.putByteArray("navigation_endpoint", this.aw.toByteArray());
        aueb auebVar = this.aj;
        if (auebVar != null) {
            bundle.putByteArray("playlist_settings_editor", auebVar.toByteArray());
            bundle.putParcelable("editor_state", aG());
        }
    }

    public final void q(afzf afzfVar) {
        this.ak.c();
        abaw e = this.b.e();
        e.t(this.ai);
        e.k(aadi.b);
        this.b.h(e, afzfVar);
    }

    public final void r(aueb auebVar, PlaylistEditorFragment$EditorState playlistEditorFragment$EditorState) {
        avhn avhnVar;
        aunb aunbVar;
        arag aragVar;
        auee aueeVar;
        if (!bd()) {
            return;
        }
        audw h = fyv.h(auebVar);
        if (playlistEditorFragment$EditorState != null) {
            this.ay.setText(playlistEditorFragment$EditorState.a);
            this.az.setText(playlistEditorFragment$EditorState.b);
        } else {
            EditText editText = this.ay;
            aued auedVar = h.e;
            if (auedVar == null) {
                auedVar = aued.a;
            }
            aqzs aqzsVar = auedVar.c;
            if (aqzsVar == null) {
                aqzsVar = aqzs.a;
            }
            editText.setText(aqzsVar.d);
            EditText editText2 = this.az;
            aued auedVar2 = h.f;
            if (auedVar2 == null) {
                auedVar2 = aued.a;
            }
            aqzs aqzsVar2 = auedVar2.c;
            if (aqzsVar2 == null) {
                aqzsVar2 = aqzs.a;
            }
            editText2.setText(aqzsVar2.d);
        }
        EditText editText3 = this.ay;
        aued auedVar3 = h.e;
        if (auedVar3 == null) {
            auedVar3 = aued.a;
        }
        aqzs aqzsVar3 = auedVar3.c;
        if (aqzsVar3 == null) {
            aqzsVar3 = aqzs.a;
        }
        be(editText3, aqzsVar3.e);
        EditText editText4 = this.az;
        aued auedVar4 = h.f;
        if (auedVar4 == null) {
            auedVar4 = aued.a;
        }
        aqzs aqzsVar4 = auedVar4.c;
        if (aqzsVar4 == null) {
            aqzsVar4 = aqzs.a;
        }
        be(editText4, aqzsVar4.e);
        ajmy ajmyVar = this.ae;
        ImageView imageView = this.ax;
        aueo aueoVar = h.d;
        if (aueoVar == null) {
            aueoVar = aueo.a;
        }
        PlaylistEditEndpointOuterClass$PlaylistEditEndpoint playlistEditEndpointOuterClass$PlaylistEditEndpoint = null;
        if ((aueoVar.b & 2) != 0) {
            aueo aueoVar2 = h.d;
            if (aueoVar2 == null) {
                aueoVar2 = aueo.a;
            }
            auen auenVar = aueoVar2.d;
            if (auenVar == null) {
                auenVar = auen.a;
            }
            avhnVar = auenVar.b;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
        } else {
            aueo aueoVar3 = h.d;
            if (aueoVar3 == null) {
                aueoVar3 = aueo.a;
            }
            if ((aueoVar3.b & 1) != 0) {
                aueo aueoVar4 = h.d;
                if (aueoVar4 == null) {
                    aueoVar4 = aueo.a;
                }
                auep auepVar = aueoVar4.c;
                if (auepVar == null) {
                    auepVar = auep.a;
                }
                avhnVar = auepVar.c;
                if (avhnVar == null) {
                    avhnVar = avhn.a;
                }
            } else {
                avhnVar = null;
            }
        }
        ajmyVar.h(imageView, avhnVar);
        if (aI(h)) {
            kpm kpmVar = this.aE;
            if (h.b == 4) {
                aueeVar = (auee) h.c;
            } else {
                aueeVar = auee.a;
            }
            audq audqVar = aueeVar.b;
            if (audqVar == null) {
                audqVar = audq.a;
            }
            aqre aqreVar = audqVar.b;
            if (aqreVar == null) {
                aqreVar = aqre.a;
            }
            aqrd aqrdVar = aqreVar.c;
            if (aqrdVar == null) {
                aqrdVar = aqrd.a;
            }
            kpmVar.a(aqrdVar);
            if (playlistEditorFragment$EditorState != null) {
                this.aE.c(playlistEditorFragment$EditorState.c);
            } else {
                this.aE.c(aF(h));
            }
            this.aD.a();
            this.ak.findViewById(R.id.line_separator).setVisibility(0);
        } else if (aH(h)) {
            fta ftaVar = this.aD;
            if (h.b == 6) {
                aunbVar = (aunb) h.c;
            } else {
                aunbVar = aunb.a;
            }
            ftaVar.f((atfh) aunbVar.qm(MetadataBadgeRendererOuterClass.metadataBadgeRenderer));
            this.al.setVisibility(8);
            this.ak.findViewById(R.id.privacy_edit).setVisibility(8);
            this.ak.findViewById(R.id.line_separator).setVisibility(8);
        }
        final audx i = fyv.i(auebVar);
        if (i != null) {
            TextView textView = this.aB;
            if ((i.b & 1) != 0) {
                aragVar = i.c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            textView.setText(ajgl.b(aragVar));
            this.aA.setVisibility(0);
            if (i.m) {
                this.aB.setTextColor(this.aH);
                this.aC.setTextColor(this.aH);
            }
            this.aA.setOnClickListener(new View.OnClickListener() { // from class: iqg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    iqp iqpVar = iqp.this;
                    audx audxVar = i;
                    if ((audxVar.b & 32768) != 0) {
                        aafo aafoVar = iqpVar.af;
                        apzg apzgVar = audxVar.n;
                        if (apzgVar == null) {
                            apzgVar = apzg.a;
                        }
                        aafoVar.c(apzgVar, null);
                    }
                    if (audxVar.m) {
                        return;
                    }
                    if (iqp.aF(fyv.h(iqpVar.aj)) == 1) {
                        if (iqpVar.an == null) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(iqpVar.rg());
                            builder.setTitle(R.string.save_playlist_changes_dialog_title);
                            builder.setMessage(R.string.save_playlist_changes_dialog_content);
                            builder.setPositiveButton(R.string.save_playlist_menu_item_title, new iql(iqpVar));
                            builder.setNegativeButton(R.string.cancel, new gzj(3));
                            iqpVar.an = builder.create();
                        }
                        iqpVar.an.show();
                        return;
                    }
                    iqpVar.at.d(iqe.a(iqpVar.ai));
                }
            });
            this.aE.c = new iqj(this);
            s();
        } else {
            this.aA.setVisibility(8);
        }
        if ((auebVar.b & 2) == 0) {
            return;
        }
        apzg apzgVar = auebVar.c;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        if (apzgVar.qn(PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint)) {
            apzg apzgVar2 = auebVar.c;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            playlistEditEndpointOuterClass$PlaylistEditEndpoint = (PlaylistEditEndpointOuterClass$PlaylistEditEndpoint) apzgVar2.qm(PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint);
        }
        this.ao = playlistEditEndpointOuterClass$PlaylistEditEndpoint;
    }

    public final void s() {
        boolean z = true;
        if (this.aE.b() == 1) {
            z = false;
        }
        this.aA.setEnabled(z);
        this.aA.setAlpha(z ? this.aF : this.aG);
    }
}
