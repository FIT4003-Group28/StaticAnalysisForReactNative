package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.SwitchCompat;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.libraries.youtube.edit.ui.ViewAnimatorHelper;
import com.google.android.libraries.youtube.livecreation.innertube.StreamMetadata;
import com.google.android.libraries.youtube.livecreation.ui.view.EditTextTitle;
import com.google.android.libraries.youtube.livecreation.ui.view.LiveCreationSettingView;
import com.google.android.libraries.youtube.livecreation.ui.view.NetworkOperationView;
import com.google.android.libraries.youtube.metadataeditor.geo.EditLocation;
import com.google.android.libraries.youtube.metadataeditor.geo.Place;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint;
import com.google.protos.youtube.api.innertube.MobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint;
import com.google.protos.youtube.api.innertube.ShowTooltipCommandOuterClass;
import com.google.protos.youtube.api.innertube.TooltipRendererOuterClass;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: acll  reason: default package */
/* loaded from: classes.dex */
public final class acll extends acjj implements View.OnClickListener, TextWatcher, AdapterView.OnItemSelectedListener, CompoundButton.OnCheckedChangeListener, aclu, abzm, abwl, achl, abzj, abzh, aclw, afqo {
    public abzn aA;
    public aclk aB;
    public afre aC;
    public achm aD;
    public snc aE;
    public afqw aF;
    public abzc aG;
    public akfo aH;
    public achk aI;
    public aciy aJ;
    public SharedPreferences aK;
    public akbn aL;
    public acgf aM;
    public abzb aN;
    public abhy aO;
    public acti aP;
    private View aU;
    private ImageButton aV;
    private byte[] aW;
    private ImageButton aX;
    private byte[] aY;
    private TextView aZ;
    public aclv ae;
    public aclx af;
    public EditTextTitle ag;
    public EditText ah;
    public EditLocation ai;
    public EditLocation aj;
    public Button ak;
    public NetworkOperationView al;
    public String am;
    public boolean an;
    public Boolean ao;
    public Boolean ap;
    public arpk aq;
    public atha ar;
    public acix as;
    public arbt at;
    public Handler au;
    public aafo av;
    public ajmy aw;
    public wal ax;
    public ajhr ay;
    public ache az;
    private boolean bA;
    private String bB;
    private String bC;
    private Date bD;
    private boolean bE;
    private CharSequence bF;
    private Place bG;
    private Boolean bH;
    private Boolean bI;
    private Boolean bJ;
    private arpl bK;
    private int bL;
    private boolean bM;
    private apzg bO;
    private apzg bP;
    private int bQ;
    private int bR;
    private FrameLayout ba;
    private ImageButton bb;
    private ImageButton bc;
    private ImageButton bd;
    private ViewGroup be;
    private ImageView bf;
    private apzg bg;
    private TextInputLayout bh;
    private Spinner bi;
    private ViewGroup bj;
    private ViewGroup bk;
    private TextView bl;
    private TextView bm;
    private View bn;
    private TextView bo;
    private SwitchCompat bp;
    private View bq;
    private TextView br;
    private View bs;
    private TextView bt;
    private aclz bu;
    private acjn bv;
    private acmb bw;
    private LiveCreationSettingView bx;
    private boolean by;
    private boolean bz;
    public ViewAnimatorHelper c;
    public afqv e;
    public static final long a = TimeUnit.MINUTES.toMillis(30);
    public static final Date b = new Date(0);
    private static final PermissionDescriptor aT = new PermissionDescriptor(3, actj.MOBILE_LIVE_APPROVE_LOCATION_BUTTON, actj.MOBILE_LIVE_DENY_LOCATION_BUTTON);
    public int d = -1;
    private boolean bN = true;

    public static final boolean aN(CharSequence charSequence) {
        return charSequence.length() > 0 && charSequence.length() <= 60;
    }

    private final void aQ(byte[] bArr) {
        if (bArr != null) {
            this.aP.D(new acte(bArr));
        }
    }

    private final void aR() {
        this.aB.y(false);
        this.bd.setVisibility(this.bL > 1 ? 0 : 8);
        abxa.b().h = false;
        if (aZ()) {
            this.bJ = false;
            this.bb.setSelected(false);
            if (this.bL > 1) {
                this.bc.setVisibility(8);
            } else {
                this.bc.setSelected(true);
            }
        }
        this.bx.setVisibility(8);
        aX(this.ai, this.aj);
    }

    private final void aS() {
        this.aB.y(true);
        this.bJ = true;
        abxa.b().h = true;
        this.bb.setSelected(true);
        this.bc.setSelected(false);
        this.bd.setVisibility(8);
        this.bc.setVisibility(0);
        this.bx.setVisibility(0);
        aX(this.aj, this.ai);
    }

    private final void aT(View view, boolean z) {
        View findViewById = view.findViewById(R.id.pre_stream_toolbar);
        if (findViewById != null) {
            findViewById.setVisibility(0);
            return;
        }
        View findViewById2 = view.findViewById(R.id.pre_stream_screencast_toolbar);
        if (findViewById2 != null) {
            findViewById2.setVisibility(0);
            return;
        }
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.lc_pre_stream_stub_actions);
        if (z) {
            viewStub.setLayoutResource(R.layout.lc_pre_stream_screencast_toolbar);
            viewStub.inflate();
            ImageButton imageButton = (ImageButton) view.findViewById(R.id.screen_capture_button);
            this.bb = imageButton;
            imageButton.setOnClickListener(this);
            ImageButton imageButton2 = (ImageButton) view.findViewById(R.id.camera_capture_button);
            this.bc = imageButton2;
            imageButton2.setOnClickListener(this);
        } else {
            viewStub.setLayoutResource(R.layout.lc_pre_stream_toolbar);
            viewStub.inflate();
        }
        this.aX = (ImageButton) view.findViewById(R.id.scheduled_events_button);
        this.aZ = (TextView) view.findViewById(R.id.scheduled_events_count);
        ImageButton imageButton3 = (ImageButton) view.findViewById(R.id.switch_camera_button);
        this.bd = imageButton3;
        imageButton3.setOnClickListener(this);
        aU();
    }

    private final void aU() {
        if (this.bd == null || TextUtils.isEmpty(this.bF)) {
            return;
        }
        this.bd.setContentDescription(this.bF);
    }

    private final void aV() {
        this.al.a(1);
        this.c.b(R.id.pre_stream_network_operation);
    }

    private final void aW() {
        this.al.a(0);
        this.c.b(R.id.pre_stream_network_operation);
    }

    private final void aX(EditLocation editLocation, EditLocation editLocation2) {
        if (this.bM) {
            Place place = editLocation2.d;
            if (place != null || editLocation.d != null) {
                editLocation.c(place);
            }
            editLocation2.setVisibility(8);
            editLocation.setVisibility(0);
        }
    }

    private final void aY(aunb aunbVar, ImageView imageView) {
        apoj apojVar = (apoj) ajjh.l(aunbVar, ButtonRendererOuterClass.buttonRenderer);
        if (apojVar == null || imageView == null) {
            return;
        }
        if ((apojVar.b & 65536) != 0) {
            aovr aovrVar = apojVar.r;
            if (aovrVar == null) {
                aovrVar = aovr.a;
            }
            imageView.setContentDescription(aovrVar.c);
        }
        if ((apojVar.b & 32) == 0) {
            return;
        }
        ache acheVar = this.az;
        arhs arhsVar = apojVar.g;
        if (arhsVar == null) {
            arhsVar = arhs.a;
        }
        arhr b2 = arhr.b(arhsVar.c);
        if (b2 == null) {
            b2 = arhr.UNKNOWN;
        }
        int a2 = acheVar.a(b2);
        if (a2 == 0) {
            return;
        }
        imageView.setImageResource(a2);
    }

    private final boolean aZ() {
        return (this.bb == null || this.bc == null) ? false : true;
    }

    @Override // defpackage.dp
    public final void Y() {
        super.Y();
        q();
        achk.a(mJ());
    }

    @Override // defpackage.abze
    public final void a(int i, String str, aqft aqftVar) {
        this.bA = false;
        StringBuilder sb = new StringBuilder(47);
        sb.append("Create broadcast failed statusCode: ");
        sb.append(i);
        zep.l(sb.toString());
        this.c.b(R.id.pre_stream_content);
        if (aqftVar != null) {
            ajgx.h(mJ(), aqftVar, this.av, this.aP, null, false, false, null, null, null, null);
        } else if (!achk.b(this)) {
        } else {
            Toast.makeText(mJ(), str != null ? str : N(R.string.lc_error_create_broadcast), 0).show();
        }
    }

    public final void aE(arbt arbtVar) {
        if (arbtVar != null) {
            aopa createBuilder = arbt.a.createBuilder();
            String str = arbtVar.c;
            createBuilder.copyOnWrite();
            arbt arbtVar2 = (arbt) createBuilder.instance;
            str.getClass();
            arbtVar2.b |= 1;
            arbtVar2.c = str;
            String str2 = arbtVar.e;
            createBuilder.copyOnWrite();
            arbt arbtVar3 = (arbt) createBuilder.instance;
            str2.getClass();
            arbtVar3.b |= 4;
            arbtVar3.e = str2;
            this.at = (arbt) createBuilder.mo39build();
            this.bx.a(arbtVar.c);
        } else {
            this.at = null;
        }
        this.c.b(R.id.pre_stream_content);
    }

    public final void aF() {
        aW();
        o(5);
    }

    public final void aG() {
        acjn acjnVar;
        String str;
        boolean z;
        Pair pair;
        if (this.ag.getVisibility() == 0) {
            this.bB = this.ag.mo589getText().toString().trim();
        }
        int i = 3;
        boolean z2 = false;
        if (this.bi.getVisibility() == 0) {
            ashy ashyVar = (ashy) this.bi.getSelectedItem();
            i = awwc.bX(ashyVar.c == 3 ? ((Integer) ashyVar.d).intValue() : 0);
            if (i == 0) {
                i = 1;
            }
        }
        this.bR = i;
        Boolean bool = this.bJ;
        if (bool == null || !bool.booleanValue()) {
            this.bG = this.ai.d;
        } else {
            this.bG = this.aj.d;
        }
        aclx aclxVar = this.af;
        if (aclxVar != null) {
            this.bQ = aclxVar.f();
        }
        aclv aclvVar = this.ae;
        if (aclvVar != null) {
            aclz aclzVar = aclvVar.d;
            this.ao = aclzVar == null ? null : Boolean.valueOf(aclzVar.c());
            aclz aclzVar2 = this.ae.i;
            this.ap = aclzVar2 == null ? null : Boolean.valueOf(aclzVar2.c());
            this.bH = null;
            aclv aclvVar2 = this.ae;
            aopa createBuilder = arpl.a.createBuilder();
            aclz aclzVar3 = aclvVar2.e;
            Boolean valueOf = aclzVar3 == null ? null : Boolean.valueOf(aclzVar3.c());
            aclz aclzVar4 = aclvVar2.f;
            Boolean valueOf2 = aclzVar4 == null ? null : Boolean.valueOf(aclzVar4.c());
            aclz aclzVar5 = aclvVar2.g;
            Boolean valueOf3 = aclzVar5 == null ? null : Boolean.valueOf(aclzVar5.c());
            Spinner spinner = aclvVar2.b;
            String str2 = "";
            if (spinner == null || spinner.getVisibility() != 0) {
                str = null;
            } else {
                ashy ashyVar2 = (ashy) aclvVar2.b.getSelectedItem();
                str = ashyVar2.c == 2 ? (String) ashyVar2.d : str2;
            }
            aclz aclzVar6 = aclvVar2.h;
            Boolean valueOf4 = aclzVar6 == null ? null : Boolean.valueOf(aclzVar6.c());
            Spinner spinner2 = aclvVar2.c;
            if (spinner2 == null || spinner2.getVisibility() != 0) {
                str2 = null;
            } else {
                ashy ashyVar3 = (ashy) aclvVar2.c.getSelectedItem();
                if (ashyVar3.c == 2) {
                    str2 = (String) ashyVar3.d;
                }
            }
            aopa createBuilder2 = arpk.a.createBuilder();
            if (valueOf != null) {
                boolean booleanValue = valueOf.booleanValue();
                createBuilder2.copyOnWrite();
                arpk arpkVar = (arpk) createBuilder2.instance;
                arpkVar.b |= 1;
                arpkVar.c = booleanValue;
                createBuilder.copyOnWrite();
                arpl.a((arpl) createBuilder.instance);
                if (valueOf.booleanValue() && valueOf2 != null) {
                    boolean booleanValue2 = valueOf2.booleanValue();
                    createBuilder2.copyOnWrite();
                    arpk arpkVar2 = (arpk) createBuilder2.instance;
                    arpkVar2.b = 2 | arpkVar2.b;
                    arpkVar2.d = booleanValue2;
                    createBuilder.copyOnWrite();
                    arpl.b((arpl) createBuilder.instance);
                }
                z = true;
            } else {
                z = false;
            }
            if (valueOf3 != null) {
                boolean booleanValue3 = valueOf3.booleanValue();
                createBuilder2.copyOnWrite();
                arpk arpkVar3 = (arpk) createBuilder2.instance;
                arpkVar3.b |= 4;
                arpkVar3.e = booleanValue3;
                createBuilder.copyOnWrite();
                arpl.c((arpl) createBuilder.instance);
                z = true;
            }
            if (str != null) {
                createBuilder2.copyOnWrite();
                arpk arpkVar4 = (arpk) createBuilder2.instance;
                arpkVar4.b |= 8;
                arpkVar4.f = str;
                createBuilder.copyOnWrite();
                arpl.d((arpl) createBuilder.instance);
                z = true;
            }
            if (valueOf4 != null) {
                boolean booleanValue4 = valueOf4.booleanValue();
                createBuilder2.copyOnWrite();
                arpk arpkVar5 = (arpk) createBuilder2.instance;
                arpkVar5.b |= 16;
                arpkVar5.g = booleanValue4;
                createBuilder.copyOnWrite();
                arpl.e((arpl) createBuilder.instance);
                if (valueOf4.booleanValue() && str2 != null) {
                    createBuilder2.copyOnWrite();
                    arpk arpkVar6 = (arpk) createBuilder2.instance;
                    arpkVar6.b |= 32;
                    arpkVar6.h = str2;
                    createBuilder.copyOnWrite();
                    arpl.f((arpl) createBuilder.instance);
                }
            } else if (!z) {
                pair = null;
                this.aq = (arpk) pair.first;
                this.bK = (arpl) pair.second;
            }
            pair = new Pair((arpk) createBuilder2.mo39build(), (arpl) createBuilder.mo39build());
            this.aq = (arpk) pair.first;
            this.bK = (arpl) pair.second;
        }
        if (this.bh.getVisibility() == 0) {
            this.bC = this.ah.getText().toString().trim();
        }
        aclz aclzVar7 = this.bu;
        if (aclzVar7 == null) {
            this.bD = null;
        } else if (!aclzVar7.c() || (acjnVar = this.bv) == null) {
            this.bD = b;
        } else {
            this.bD = acjnVar.a();
        }
        abxa b2 = abxa.b();
        Date date = this.bD;
        if (date != null && date.getTime() > 0) {
            z2 = true;
        }
        b2.g = z2;
    }

    public final void aH(CharSequence charSequence) {
        this.bF = charSequence;
        aU();
    }

    public final void aI() {
        int i = this.d;
        if (i == -1) {
            this.c.b(R.id.pre_stream_content);
        } else {
            this.c.b(i);
        }
    }

    public final void aJ() {
        ImageButton imageButton;
        apzg apzgVar = this.bP;
        if (apzgVar == null || !apzgVar.qn(GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint.getScheduledBroadcastsEndpoint) || (imageButton = this.aX) == null || imageButton.getVisibility() != 0) {
            return;
        }
        this.av.c(this.bP, amup.k("com.google.android.libraries.youtube.innertube.endpoint.tag", this));
    }

    public final boolean aK() {
        int f;
        aclx aclxVar = this.af;
        return (aclxVar == null || (f = aclxVar.f()) == 1 || f == 4 || f == 2) ? false : true;
    }

    public final boolean aL() {
        if (this.aG.i()) {
            aotz a2 = this.aM.a();
            if (a2 != null) {
                return a2.e;
            }
            return true;
        }
        return this.aK.getBoolean("IS_FIRST_STREAM", true);
    }

    public final boolean aM() {
        return Boolean.TRUE.equals(this.bJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x080b  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:467:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aO(android.view.View r19, defpackage.aopa r20) {
        /*
            Method dump skipped, instructions count: 2162
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acll.aO(android.view.View, aopa):void");
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // defpackage.abze
    public final void b(String str, athc athcVar) {
        apzg apzgVar;
        this.bA = false;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "Created broadcast with videoId: ".concat(valueOf);
        }
        if ((athcVar.b & 2) != 0) {
            apzgVar = athcVar.c;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        this.bO = apzgVar;
        this.aB.al(str, apzgVar);
        aW();
        this.av.c(this.bO, amup.k("com.google.android.libraries.youtube.innertube.endpoint.tag", this));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // defpackage.abzh
    public final void c() {
        zep.l("GetBroadcastsSchedule failed");
    }

    @Override // defpackage.abzh
    public final void d(atgr atgrVar) {
        if (!achk.b(this) || atgrVar == null || this.aX == null || this.aZ == null) {
            return;
        }
        TypedValue typedValue = new TypedValue();
        if (atgrVar.f > 0) {
            rh().getValue(R.dimen.lc_button_active_opacity, typedValue, true);
            this.aX.setOnClickListener(this);
            this.aX.setClickable(true);
            this.aZ.setVisibility(0);
        } else {
            rh().getValue(R.dimen.lc_button_inactive_opacity, typedValue, true);
            this.aX.setOnClickListener(null);
            this.aX.setClickable(false);
            this.aZ.setVisibility(8);
        }
        this.aX.setAlpha(typedValue.getFloat());
        this.aZ.setText(String.format("%d", Integer.valueOf(atgrVar.f)));
    }

    @Override // defpackage.abzj
    public final void e() {
        this.bA = false;
        zep.l("Get confirm broadcast failed");
        if (achk.b(this)) {
            Toast.makeText(mJ(), (int) R.string.lc_error_update_broadcast, 0).show();
            this.c.b(R.id.pre_stream_content);
        }
    }

    @Override // defpackage.abzj
    public final void h(artf artfVar) {
        atgl atglVar;
        this.bA = false;
        if (achk.b(this)) {
            artd artdVar = artfVar.c;
            if (artdVar == null) {
                artdVar = artd.a;
            }
            if (artdVar.b != 126007832) {
                e();
                return;
            }
            artd artdVar2 = artfVar.c;
            if (artdVar2 == null) {
                artdVar2 = artd.a;
            }
            if (artdVar2.b == 126007832) {
                atglVar = (atgl) artdVar2.c;
            } else {
                atglVar = atgl.a;
            }
            if (this.bz) {
                this.aB.G(atglVar);
                this.al.a(2);
            } else {
                this.aB.I(atglVar);
                this.aB.W(l());
                this.al.a(2);
            }
            aclk aclkVar = this.aB;
            avyp avypVar = artfVar.d;
            if (avypVar == null) {
                avypVar = avyp.a;
            }
            aclkVar.am(avypVar);
        }
    }

    @Override // defpackage.abzm
    public final void j() {
        aV();
    }

    @Override // defpackage.abzm
    public final void k() {
        if (this.bO == null) {
            this.aB.W(l());
            this.al.a(2);
            return;
        }
        aW();
        this.av.c(this.bO, amup.k("com.google.android.libraries.youtube.innertube.endpoint.tag", this));
    }

    @Override // defpackage.acba
    public final StreamMetadata l() {
        aG();
        StreamMetadata streamMetadata = new StreamMetadata();
        streamMetadata.a = this.bB;
        streamMetadata.b = this.bC;
        streamMetadata.c = this.ao;
        streamMetadata.d = this.ap;
        streamMetadata.e = this.bH;
        streamMetadata.l = this.bQ;
        streamMetadata.f = this.bJ;
        streamMetadata.g = this.aq;
        streamMetadata.h = this.bK;
        streamMetadata.m = this.bR;
        streamMetadata.i = this.bG;
        streamMetadata.j = this.bD;
        Boolean bool = this.bJ;
        arbt arbtVar = null;
        if (bool != null && bool.booleanValue()) {
            arbtVar = this.at;
        }
        streamMetadata.k = arbtVar;
        return streamMetadata;
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        ParcelableMessageLite parcelableMessageLite;
        ParcelableMessageLite parcelableMessageLite2;
        ParcelableMessageLite parcelableMessageLite3;
        ParcelableMessageLite parcelableMessageLite4;
        super.mQ(bundle);
        this.aD.a = this;
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            if (bundle2.containsKey("ARG_TITLE")) {
                this.bB = bundle2.getString("ARG_TITLE");
            }
            apzg apzgVar = null;
            if (bundle2.containsKey("ARG_DESCRIPTION")) {
                String string = bundle2.getString("ARG_DESCRIPTION");
                this.bC = TextUtils.isEmpty(string) ? null : string.trim();
            }
            if (bundle2.containsKey("ARG_STREAM_PRIVACY")) {
                this.bR = awwc.bX(bundle2.getInt("ARG_STREAM_PRIVACY", 0));
            }
            if (bundle2.containsKey("ARG_AUDIENCE_TYPE")) {
                this.bQ = akzj.E(bundle2.getInt("ARG_AUDIENCE_TYPE", 0));
            }
            if (bundle2.containsKey("ARG_PLACE")) {
                this.bG = (Place) bundle2.getParcelable("ARG_PLACE");
            }
            if (bundle2.containsKey("ARG_ENABLE_CHAT")) {
                this.ao = Boolean.valueOf(bundle2.getBoolean("ARG_ENABLE_CHAT"));
            }
            if (bundle2.containsKey("ARG_ENABLE_SPONSORS_ONLY_LIVE_CHAT_MODE")) {
                this.ap = Boolean.valueOf(bundle2.getBoolean("ARG_ENABLE_SPONSORS_ONLY_LIVE_CHAT_MODE"));
            }
            if (bundle2.containsKey("ARG_ENABLE_AGE_RESTRICTION")) {
                this.bH = Boolean.valueOf(bundle2.getBoolean("ARG_ENABLE_AGE_RESTRICTION"));
            }
            if (bundle2.containsKey("ARG_IS_LAUNCHED_FROM_INTENT")) {
                this.bI = Boolean.valueOf(bundle2.getBoolean("ARG_IS_LAUNCHED_FROM_INTENT"));
            }
            if (bundle2.containsKey("ARG_IS_SCREENCAST")) {
                this.bJ = Boolean.valueOf(bundle2.getBoolean("ARG_IS_SCREENCAST"));
            }
            if (bundle2.containsKey("ARG_MONETIZATION_METADATA") && (parcelableMessageLite4 = (ParcelableMessageLite) bundle2.getParcelable("ARG_MONETIZATION_METADATA")) != null) {
                this.aq = (arpk) parcelableMessageLite4.a(arpk.a);
            }
            if (bundle2.containsKey("ARG_CAMERA_COUNT")) {
                this.bL = bundle2.getInt("ARG_CAMERA_COUNT");
            }
            if (bundle2.containsKey("ARG_BROADCAST_CREATED_ENDPOINT") && (parcelableMessageLite3 = (ParcelableMessageLite) bundle2.getParcelable("ARG_BROADCAST_CREATED_ENDPOINT")) != null) {
                this.bO = (apzg) parcelableMessageLite3.a(apzg.a);
            }
            if (bundle2.containsKey("ARG_SCHEDULED_DATE")) {
                this.bD = (Date) bundle2.getSerializable("ARG_SCHEDULED_DATE");
            }
            if (bundle2.containsKey("ARG_GAME_TITLE") && (parcelableMessageLite2 = (ParcelableMessageLite) bundle2.getParcelable("ARG_GAME_TITLE")) != null) {
                this.at = (arbt) parcelableMessageLite2.a(arbt.a);
            }
            if (bundle2.containsKey("ARG_GAME_PACKAGE_NAME")) {
                this.am = bundle2.getString("ARG_GAME_PACKAGE_NAME");
            }
            if (bundle2.containsKey("ARG_AADC_WARNING_ACK")) {
                this.an = bundle2.getBoolean("ARG_AADC_WARNING_ACK");
            }
            if (!bundle2.containsKey("ARG_GET_BROADCAST_RESPONSE") || (parcelableMessageLite = (ParcelableMessageLite) bundle2.getParcelable("ARG_GET_BROADCAST_RESPONSE")) == null) {
                return;
            }
            arsm arsmVar = ((arsp) parcelableMessageLite.a(arsp.a)).e;
            if (arsmVar == null) {
                arsmVar = arsm.a;
            }
            atgp atgpVar = arsmVar.b;
            if (atgpVar == null) {
                atgpVar = atgp.a;
            }
            atgq atgqVar = atgpVar.c;
            if (atgqVar == null) {
                atgqVar = atgq.a;
            }
            atha athaVar = atgqVar.c;
            if (athaVar == null) {
                athaVar = atha.a;
            }
            this.ar = athaVar;
            this.bz = true;
            atgv atgvVar = athaVar.g;
            if (atgvVar == null) {
                atgvVar = atgv.a;
            }
            apoj apojVar = atgvVar.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
            if ((apojVar.b & 8192) != 0) {
                atgv atgvVar2 = this.ar.g;
                if (atgvVar2 == null) {
                    atgvVar2 = atgv.a;
                }
                apoj apojVar2 = atgvVar2.c;
                if (apojVar2 == null) {
                    apojVar2 = apoj.a;
                }
                apzgVar = apojVar2.n;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
            }
            this.bO = apzgVar;
            this.bJ = Boolean.valueOf(this.ar.p);
        }
    }

    @Override // defpackage.dp
    public final void mR() {
        super.mR();
        if (this.ag.isFocused()) {
            zag.i(this.ag);
        }
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        String path;
        String trim;
        ParcelableMessageLite parcelableMessageLite;
        ParcelableMessageLite parcelableMessageLite2;
        ParcelableMessageLite parcelableMessageLite3;
        ParcelableMessageLite parcelableMessageLite4;
        ParcelableMessageLite parcelableMessageLite5;
        if (bundle != null) {
            this.by = bundle.getBoolean("STATE_INTENT_ACTION_LOGGED", false);
            if (bundle.containsKey("STREAM_TITLE")) {
                this.bB = bundle.getString("STREAM_TITLE");
            }
            if (bundle.containsKey("STATE_MORE_OPTIONS_SHOWN")) {
                this.bE = bundle.getBoolean("STATE_MORE_OPTIONS_SHOWN");
            }
            if (bundle.containsKey("STATE_STREAM_DESCRIPTION")) {
                this.bC = bundle.getString("STATE_STREAM_DESCRIPTION");
            }
            if (bundle.containsKey("STATE_ENABLE_CHAT")) {
                this.ao = Boolean.valueOf(bundle.getBoolean("STATE_ENABLE_CHAT"));
            }
            if (bundle.containsKey("STATE_ENABLE_SPONSORS_ONLY_LIVE_CHAT_MODE")) {
                this.ap = Boolean.valueOf(bundle.getBoolean("STATE_ENABLE_SPONSORS_ONLY_LIVE_CHAT_MODE"));
            }
            if (bundle.containsKey("STATE_STREAM_PRIVACY")) {
                this.bR = awwc.bX(bundle.getInt("STATE_STREAM_PRIVACY", 0));
            }
            if (bundle.containsKey("STATE_AUDIENCE_TYPE")) {
                this.bQ = akzj.E(bundle.getInt("STATE_AUDIENCE_TYPE", 0));
            }
            if (bundle.containsKey("STATE_PLACE")) {
                this.bG = (Place) bundle.getParcelable("STATE_PLACE");
            }
            if (bundle.containsKey("STATE_ENABLE_AGE_RESTRICTION")) {
                this.bH = Boolean.valueOf(bundle.getBoolean("STATE_ENABLE_AGE_RESTRICTION"));
            }
            if (bundle.containsKey("STATE_IS_SCREENCAST")) {
                this.bJ = Boolean.valueOf(bundle.getBoolean("STATE_IS_SCREENCAST"));
            }
            if (bundle.containsKey("STATE_MONETIZATION_METADATA") && (parcelableMessageLite5 = (ParcelableMessageLite) bundle.getParcelable("STATE_MONETIZATION_METADATA")) != null) {
                this.aq = (arpk) parcelableMessageLite5.a(arpk.a);
            }
            if (bundle.containsKey("STATE_SCHEDULED_DATE")) {
                this.bD = (Date) bundle.getSerializable("STATE_SCHEDULED_DATE");
            }
            if (bundle.containsKey("STATE_TITLE_SCREEN_RENDERER") && (parcelableMessageLite4 = (ParcelableMessageLite) bundle.getParcelable("STATE_TITLE_SCREEN_RENDERER")) != null) {
                this.ar = (atha) parcelableMessageLite4.a(atha.a);
            }
            if (bundle.containsKey("STATE_BROADCAST_CREATED_ENDPOINT") && (parcelableMessageLite3 = (ParcelableMessageLite) bundle.getParcelable("STATE_BROADCAST_CREATED_ENDPOINT")) != null) {
                this.bO = (apzg) parcelableMessageLite3.a(apzg.a);
            }
            if (bundle.containsKey("STATE_SCHEDULED_EVENTS_ENDPOINT") && (parcelableMessageLite2 = (ParcelableMessageLite) bundle.getParcelable("STATE_BROADCAST_CREATED_ENDPOINT")) != null) {
                this.bP = (apzg) parcelableMessageLite2.a(apzg.a);
            }
            if (bundle.containsKey("STATE_GAME_TITLE") && (parcelableMessageLite = (ParcelableMessageLite) bundle.getParcelable("STATE_GAME_TITLE")) != null) {
                this.at = (arbt) parcelableMessageLite.a(arbt.a);
            }
            if (bundle.containsKey("STATE_AADC_WARNING_ACK")) {
                this.an = bundle.getBoolean("STATE_AADC_WARNING_ACK");
            }
        }
        View inflate = layoutInflater.inflate(R.layout.lc_pre_stream_fragment, viewGroup, false);
        ViewAnimatorHelper viewAnimatorHelper = (ViewAnimatorHelper) inflate.findViewById(R.id.lc_pre_stream_view_animator);
        this.c = viewAnimatorHelper;
        acla aclaVar = new acla(this, 1);
        int i2 = R.id.pre_stream_content;
        viewAnimatorHelper.c(R.id.pre_stream_content, aclaVar);
        this.c.c(R.id.pre_stream_advanced_settings, new zdt() { // from class: ackz
            /* JADX WARN: Removed duplicated region for block: B:33:0x0064 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
            @Override // defpackage.zdt
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(java.lang.Object r11) {
                /*
                    Method dump skipped, instructions count: 396
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ackz.a(java.lang.Object):void");
            }
        });
        this.c.c(R.id.pre_stream_location_search, new acla(this));
        this.c.c(R.id.game_title_search, new acla(this, 2));
        this.aU = inflate.findViewById(R.id.pre_stream_content);
        this.aV = (ImageButton) inflate.findViewById(R.id.navigate_back_button);
        this.be = (ViewGroup) inflate.findViewById(R.id.title_container);
        this.bf = (ImageView) inflate.findViewById(R.id.profile_image);
        this.ag = (EditTextTitle) inflate.findViewById(R.id.stream_title);
        this.ah = (EditText) inflate.findViewById(R.id.stream_description);
        this.bh = (TextInputLayout) inflate.findViewById(R.id.stream_description_wrapper);
        this.bi = (Spinner) inflate.findViewById(R.id.privacy_spinner);
        this.ai = (EditLocation) inflate.findViewById(R.id.camera_location_editor);
        this.bn = inflate.findViewById(R.id.schedule_setting);
        this.bo = (TextView) inflate.findViewById(R.id.schedule_setting_text);
        this.bp = (SwitchCompat) inflate.findViewById(R.id.schedule_setting_toggle);
        this.bq = inflate.findViewById(R.id.advanced_setting);
        this.br = (TextView) inflate.findViewById(R.id.advanced_setting_text);
        this.bj = (ViewGroup) inflate.findViewById(R.id.more_options);
        this.bk = (ViewGroup) inflate.findViewById(R.id.scheduled_date_time);
        this.bl = (TextView) inflate.findViewById(R.id.scheduled_date);
        this.bm = (TextView) inflate.findViewById(R.id.scheduled_time);
        this.bs = inflate.findViewById(R.id.options_setting);
        this.bt = (TextView) inflate.findViewById(R.id.options_setting_text);
        this.ak = (Button) inflate.findViewById(R.id.start_stream_button);
        this.al = (NetworkOperationView) inflate.findViewById(R.id.pre_stream_network_operation);
        this.ba = (FrameLayout) inflate.findViewById(R.id.pre_stream_audience_settings_option);
        this.bx = (LiveCreationSettingView) inflate.findViewById(R.id.game_title);
        this.aj = (EditLocation) inflate.findViewById(R.id.screencast_location_editor);
        inflate.setOnClickListener(this);
        this.aU.setOnClickListener(this);
        this.aV.setOnClickListener(this);
        this.ak.setOnClickListener(this);
        this.bx.a = new acld(this);
        this.al.b(new aclg(this, 1));
        this.ag.addTextChangedListener(this);
        aopa createBuilder = asjj.a.createBuilder();
        Intent intent = mJ().getIntent();
        if (intent != null && !this.by) {
            aopa createBuilder2 = asjh.a.createBuilder();
            this.by = true;
            Uri a2 = achj.a(intent);
            if (a2 == null || (path = a2.getPath()) == null) {
                trim = null;
            } else {
                while (path.length() > 1 && path.startsWith("/")) {
                    path = path.substring(1);
                }
                trim = path.trim();
            }
            if (trim != null) {
                createBuilder2.copyOnWrite();
                asjh asjhVar = (asjh) createBuilder2.instance;
                asjhVar.b = 2 | asjhVar.b;
                asjhVar.d = trim;
            }
            if (!TextUtils.isEmpty(intent.getAction())) {
                String action = intent.getAction();
                createBuilder2.copyOnWrite();
                asjh asjhVar2 = (asjh) createBuilder2.instance;
                action.getClass();
                asjhVar2.b = 1 | asjhVar2.b;
                asjhVar2.c = action;
            }
            createBuilder.copyOnWrite();
            asjj asjjVar = (asjj) createBuilder.instance;
            asjh asjhVar3 = (asjh) createBuilder2.mo39build();
            asjhVar3.getClass();
            asjjVar.k = asjhVar3;
            asjjVar.b |= 8192;
            zgh.h(intent.getAction()).length();
            zgh.h(trim).length();
        }
        this.aP.d(acuo.a(26107), null, (asjj) createBuilder.mo39build());
        atha athaVar = this.ar;
        if (athaVar != null) {
            aopa mo52toBuilder = athaVar.mo52toBuilder();
            aO(inflate, mo52toBuilder);
            this.ar = (atha) mo52toBuilder.mo39build();
        }
        if (bundle != null && (i = bundle.getInt("STATE_DISPLAYED_VIEW_ID", -1)) != -1) {
            i2 = i;
        }
        this.c.b(i2);
        return inflate;
    }

    public final void o(final int i) {
        if (this.bz) {
            this.al.a(2);
            aI();
            return;
        }
        this.al.c(new aclg(this));
        if (i <= 0) {
            aV();
            return;
        }
        Context rb = rb();
        if (!this.aG.k() || rb == null || !akdr.g(rb)) {
            p(null, i);
        } else {
            this.aC.b(new afrd() { // from class: ackw
                @Override // defpackage.afrd
                public final void a(asvk asvkVar) {
                    acll.this.p(asvkVar, i);
                }
            });
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton == this.bp) {
            if (z) {
                this.bv.b();
            } else {
                this.bv.a.setVisibility(8);
            }
            this.ag.clearFocus();
        }
    }

    @Override // defpackage.dp, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View view = this.O;
        if (view != null) {
            zgd.t(this.be, zgd.p(view.getResources().getDimensionPixelOffset(R.dimen.lc_pre_stream_first_input_field_top_margin)), ViewGroup.MarginLayoutParams.class);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (!this.an) {
            atgy atgyVar = this.ar.f;
            if (atgyVar == null) {
                atgyVar = atgy.a;
            }
            ashz ashzVar = atgyVar.c;
            if (ashzVar == null) {
                ashzVar = ashz.a;
            }
            apzg apzgVar = ((ashy) ashzVar.c.get(i)).i;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            if (apzgVar.qn(auvj.b)) {
                atgy atgyVar2 = this.ar.f;
                if (atgyVar2 == null) {
                    atgyVar2 = atgy.a;
                }
                ashz ashzVar2 = atgyVar2.c;
                if (ashzVar2 == null) {
                    ashzVar2 = ashz.a;
                }
                apzg apzgVar2 = ((ashy) ashzVar2.c.get(i)).i;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
                aunb aunbVar = ((auvj) apzgVar2.qm(auvj.b)).c;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                byte[] bArr = ajhh.a((aqtb) aunbVar.qm(ElementRendererOuterClass.elementRenderer)).b;
                if (bArr != null) {
                    try {
                        aoos b2 = aoos.b();
                        srp a2 = srq.a();
                        a2.a = this.aP;
                        srq a3 = a2.a();
                        this.ay.g((awnn) aopi.parseFrom(awnn.a, bArr, b2), 1, a3);
                    } catch (aopx e) {
                        zep.d("Failed to show bottom sheet for aadc warning.", e);
                    }
                }
            }
            atgy atgyVar3 = this.ar.f;
            if (atgyVar3 == null) {
                atgyVar3 = atgy.a;
            }
            ashz ashzVar3 = atgyVar3.c;
            if (ashzVar3 == null) {
                ashzVar3 = ashz.a;
            }
            if ((ashzVar3.b & 16) != 0 && this.bN) {
                this.bN = false;
                atgy atgyVar4 = this.ar.f;
                if (atgyVar4 == null) {
                    atgyVar4 = atgy.a;
                }
                ashz ashzVar4 = atgyVar4.c;
                if (ashzVar4 == null) {
                    ashzVar4 = ashz.a;
                }
                apzg apzgVar3 = ashzVar4.e;
                if (apzgVar3 == null) {
                    apzgVar3 = apzg.a;
                }
                auvv auvvVar = (auvv) apzgVar3.qm(ShowTooltipCommandOuterClass.showTooltipCommand);
                if ((auvvVar.b & 1) != 0) {
                    TypedValue typedValue = new TypedValue();
                    rh().getValue(R.dimen.privacy_spinner_tooltip_width, typedValue, true);
                    aunb aunbVar2 = auvvVar.c;
                    if (aunbVar2 == null) {
                        aunbVar2 = aunb.a;
                    }
                    arag aragVar = ((avjf) aunbVar2.qm(TooltipRendererOuterClass.tooltipRenderer)).f;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                    String valueOf = String.valueOf(ajgl.b(aragVar));
                    akfo akfoVar = this.aH;
                    akfp a4 = akfoVar.a();
                    a4.c = valueOf;
                    a4.h(2);
                    a4.c(1);
                    a4.g(typedValue.getFloat());
                    a4.a = this.bi;
                    a4.l();
                    a4.f = new aclf();
                    akfoVar.c(a4.a());
                }
            }
        }
        acmb acmbVar = this.bw;
        if (acmbVar != null) {
            acmbVar.e = i;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        acmb acmbVar = this.bw;
        if (acmbVar != null) {
            acmbVar.e = -1;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        View view = this.O;
        dt mJ = mJ();
        if (view == null || mJ == null) {
            return;
        }
        String trim = charSequence.toString().trim();
        TextView textView = (TextView) view.findViewById(R.id.char_count);
        if (this.af == null) {
            this.ak.setEnabled(aN(trim));
        } else {
            Button button = this.ak;
            if (aN(trim)) {
                int f = this.af.f();
                if (f == 0) {
                    throw null;
                }
                if (f != 1) {
                    z = true;
                    button.setEnabled(z);
                }
            }
            z = false;
            button.setEnabled(z);
        }
        if (trim.length() >= 50) {
            textView.setVisibility(0);
            textView.setText(rh().getString(R.string.lc_character_counter_text, Integer.toString(trim.length()), Integer.toString(60)));
        } else {
            textView.setVisibility(4);
        }
        if (trim.length() > 60) {
            this.ag.getBackground().setColorFilter(ake.d(mJ, R.color.lc_red), PorterDuff.Mode.SRC_ATOP);
            textView.setTextColor(ake.d(mJ, R.color.lc_red));
            return;
        }
        this.ag.getBackground().setColorFilter(ake.d(mJ, R.color.lc_white), PorterDuff.Mode.SRC_ATOP);
        textView.setTextColor(ake.d(mJ, R.color.lc_white_70));
    }

    @Override // defpackage.dp
    public final void oz(Bundle bundle) {
        bundle.putBoolean("STATE_INTENT_ACTION_LOGGED", this.by);
        atha athaVar = this.ar;
        if (athaVar != null) {
            bundle.putParcelable("STATE_TITLE_SCREEN_RENDERER", new ParcelableMessageLite(athaVar));
        }
        bundle.putInt("STATE_DISPLAYED_VIEW_ID", this.c.a());
        apzg apzgVar = this.bO;
        if (apzgVar != null) {
            bundle.putParcelable("STATE_BROADCAST_CREATED_ENDPOINT", new ParcelableMessageLite(apzgVar));
        }
        apzg apzgVar2 = this.bP;
        if (apzgVar2 != null) {
            bundle.putParcelable("STATE_SCHEDULED_EVENTS_ENDPOINT", new ParcelableMessageLite(apzgVar2));
        }
        bundle.putBoolean("STATE_MORE_OPTIONS_SHOWN", this.bE);
        aG();
        String str = this.bB;
        if (str != null) {
            bundle.putString("STREAM_TITLE", str);
        }
        String str2 = this.bC;
        if (str2 != null) {
            bundle.putString("STATE_STREAM_DESCRIPTION", str2);
        }
        int i = this.bR;
        if (i != 0) {
            bundle.putInt("STATE_STREAM_PRIVACY", i - 1);
        }
        int i2 = this.bQ;
        if (i2 != 0) {
            bundle.putInt("STATE_AUDIENCE_TYPE", i2 - 1);
        }
        Place place = this.bG;
        if (place != null) {
            bundle.putParcelable("STATE_PLACE", place);
        }
        Boolean bool = this.ao;
        if (bool != null) {
            bundle.putBoolean("STATE_ENABLE_CHAT", bool.booleanValue());
        }
        Boolean bool2 = this.ap;
        if (bool2 != null) {
            bundle.putBoolean("STATE_ENABLE_SPONSORS_ONLY_LIVE_CHAT_MODE", bool2.booleanValue());
        }
        Boolean bool3 = this.bH;
        if (bool3 != null) {
            bundle.putBoolean("STATE_ENABLE_AGE_RESTRICTION", bool3.booleanValue());
        }
        Boolean bool4 = this.bJ;
        if (bool4 != null) {
            bundle.putBoolean("STATE_IS_SCREENCAST", bool4.booleanValue());
        }
        arpk arpkVar = this.aq;
        if (arpkVar != null) {
            bundle.putParcelable("STATE_MONETIZATION_METADATA", new ParcelableMessageLite(arpkVar));
        }
        Date date = this.bD;
        if (date != null) {
            bundle.putSerializable("STATE_SCHEDULED_DATE", date);
        }
        arbt arbtVar = this.at;
        if (arbtVar != null) {
            bundle.putParcelable("STATE_GAME_TITLE", new ParcelableMessageLite(arbtVar));
        }
        bundle.putBoolean("STATE_AADC_WARNING_ACK", this.an);
    }

    public final void p(asvk asvkVar, int i) {
        Boolean bool = this.bI;
        int i2 = 2;
        if (bool == null || !bool.booleanValue()) {
            i2 = 0;
        } else {
            Boolean bool2 = this.bJ;
            if (bool2 != null && bool2.booleanValue()) {
                i2 = 3;
            }
        }
        this.aA.k(asvkVar, null, i2, new acli(this, i));
    }

    @Override // defpackage.afqo
    public final void r() {
        if (!this.aG.k() || akdr.g(rb())) {
            this.c.b(R.id.pre_stream_location_search);
            return;
        }
        PermissionDescriptor permissionDescriptor = aT;
        this.aS = new akdv(akdu.e(this), this.aQ, Arrays.asList(permissionDescriptor), R.string.lc_permission_open_settings_location_description, R.string.lc_permissions_missing_location, new Runnable() { // from class: ackx
            @Override // java.lang.Runnable
            public final void run() {
                acll.this.c.b(R.id.pre_stream_location_search);
            }
        }, qvl.i, this.aR);
        this.aS.a();
    }

    @Override // defpackage.aclu
    public final void s() {
        if (this.c.a() == R.id.pre_stream_content || this.c.a() == R.id.pre_stream_network_operation) {
            this.aB.V();
            return;
        }
        this.c.b(R.id.pre_stream_content);
        aG();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final aopa aO;
        View view2 = this.O;
        if (view2 == null) {
            return;
        }
        if (view == view2 || view == this.aU) {
            if (!this.ag.isFocused()) {
                return;
            }
            zag.i(this.ag);
        } else if (view == this.aV) {
            s();
        } else if (view == this.bq) {
            zag.i(this.ag);
            byte[] bArr = this.aW;
            if (bArr != null) {
                this.aP.H(3, new acte(bArr), null);
            }
            this.c.b(R.id.pre_stream_advanced_settings);
        } else if (view == this.aX) {
            zag.i(this.ag);
            byte[] bArr2 = this.aY;
            if (bArr2 != null) {
                this.aP.H(3, new acte(bArr2), null);
            }
            this.aB.Z();
        } else if (view == this.bb) {
            aS();
        } else if (view == this.bc) {
            aR();
        } else {
            ImageButton imageButton = this.bd;
            if (view == imageButton) {
                this.aB.ab(imageButton);
            } else if (view != this.ak) {
                if (view == this.bf) {
                    this.av.c(this.bg, null);
                    return;
                }
                View view3 = this.bs;
                if (view != view3) {
                    return;
                }
                Object tag = view3.getTag();
                this.ag.clearFocus();
                if (!(tag instanceof ashv)) {
                    return;
                }
                ashv ashvVar = (ashv) tag;
                if (this.bj.getVisibility() == 8) {
                    TextView textView = this.bt;
                    arag aragVar = ashvVar.c;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                    textView.setText(ajgl.b(aragVar));
                    this.bj.setVisibility(0);
                    this.bE = true;
                    this.bh.setVisibility(0);
                    return;
                }
                TextView textView2 = this.bt;
                arag aragVar2 = ashvVar.d;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
                textView2.setText(ajgl.b(aragVar2));
                this.bj.setVisibility(8);
                this.bE = false;
                this.bh.setVisibility(8);
            } else {
                Editable mo589getText = this.ag.mo589getText();
                zag.i(this.ag);
                if (!aN(mo589getText)) {
                    if (mo589getText.length() == 0) {
                        Toast.makeText(mJ(), (int) R.string.lc_must_add_title, 0).show();
                        return;
                    } else {
                        Toast.makeText(mJ(), (int) R.string.lc_title_too_long, 0).show();
                        return;
                    }
                }
                aclz aclzVar = this.bu;
                if (aclzVar != null && aclzVar.c() && this.bv.a().before(new Date(this.aE.c() - a))) {
                    Toast.makeText(mJ(), (int) R.string.lc_error_scheduled_date_in_past, 1).show();
                    return;
                }
                if (aL()) {
                    if (this.aG.i()) {
                        ylx.n(this, this.aM.a.b(new aapz(14), anjk.a), aclb.c, zbx.s);
                    } else {
                        this.aK.edit().putBoolean("IS_FIRST_STREAM", false).apply();
                    }
                }
                if (this.bA) {
                    return;
                }
                if (this.bO == null) {
                    Object tag2 = this.ak.getTag();
                    if (!(tag2 instanceof apzg)) {
                        return;
                    }
                    apzg apzgVar = (apzg) tag2;
                    this.bA = true;
                    this.aP.D(new acte(apzgVar.c.I()));
                    if ((1 & apzgVar.b) != 0) {
                        this.aP.H(3, new acte(apzgVar.c.I()), null);
                    }
                    this.av.c(apzgVar, amup.k("com.google.android.libraries.youtube.innertube.endpoint.tag", this));
                    aW();
                    return;
                }
                StreamMetadata l = l();
                if (this.bz) {
                    abzd abzdVar = abzd.a;
                    if (Boolean.TRUE.equals(this.bJ)) {
                        arbt arbtVar = l.k;
                        abzdVar = (arbtVar == null || (arbtVar.b & 4) == 0) ? abzd.b : abzd.a(arbtVar.e);
                    }
                    abzd abzdVar2 = abzdVar;
                    abzn abznVar = this.aA;
                    String str = ((MobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint) this.bO.qm(MobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint.mobileBroadcastSetupShowGoLiveScreenEndpoint)).b;
                    String str2 = l.a;
                    String str3 = l.b;
                    Boolean bool = l.c;
                    Boolean bool2 = l.d;
                    Boolean bool3 = l.e;
                    Boolean bool4 = l.f;
                    arpk arpkVar = l.g;
                    arpl arplVar = l.h;
                    int i = l.m;
                    int i2 = l.l;
                    Place place = l.i;
                    aO = abznVar.m(str, str2, str3, bool, bool2, bool3, bool4, arpkVar, arplVar, i, i2, place == null ? abzd.b : abzd.a(place), l.j, abzdVar2, null);
                } else {
                    aO = this.aB.aO(l);
                }
                if (aO == null) {
                    aW();
                    this.av.c(this.bO, amup.k("com.google.android.libraries.youtube.innertube.endpoint.tag", this));
                    return;
                }
                aW();
                this.al.c(new View.OnClickListener() { // from class: acku
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        acll acllVar = acll.this;
                        acllVar.aA.l(aO, acllVar);
                    }
                });
                this.aA.l(aO, this);
            }
        }
    }

    public final void q() {
        int i = this.al.c;
        if (i == 1) {
            this.c.b(R.id.pre_stream_network_operation);
        } else if (i == 2) {
            aQ(this.aW);
            aQ(this.aY);
            aI();
            aJ();
        } else {
            this.c.b(R.id.pre_stream_network_operation);
            o(5);
            this.aB.y(Boolean.TRUE.equals(this.bJ));
        }
    }
}
