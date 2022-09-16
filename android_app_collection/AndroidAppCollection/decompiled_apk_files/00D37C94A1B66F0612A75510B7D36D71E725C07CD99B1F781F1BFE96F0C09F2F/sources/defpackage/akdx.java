package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: akdx  reason: default package */
/* loaded from: classes.dex */
public final class akdx extends akdj implements View.OnClickListener {
    public akdz a;
    private PermissionDescriptor[] ae;
    private acup af;
    private acup ag;
    private acup ah;
    private acup ai;
    private int aj;
    private int ak;
    private int al;
    private int am;
    private Button an;
    private TextView ao;
    private boolean ap;
    private asjj aq;
    private int ar;
    public acut b;
    public akdr c;
    public Context d;
    private PermissionDescriptor[] e;

    private final View aH(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate;
        Context context = this.d;
        if (context != null) {
            layoutInflater = layoutInflater.cloneInContext(context);
        }
        if (mJ().getResources().getConfiguration().orientation == 2) {
            if (mJ().getResources().getConfiguration().screenHeightDp >= 500) {
                inflate = layoutInflater.inflate(R.layout.permission_request_fragment_h500dp_land, viewGroup, false);
            } else {
                inflate = layoutInflater.inflate(R.layout.permission_request_fragment_land, viewGroup, false);
            }
        } else {
            inflate = layoutInflater.inflate(R.layout.permission_request_fragment, viewGroup, false);
        }
        ((Toolbar) inflate.findViewById(R.id.toolbar)).r(new View.OnClickListener() { // from class: akdw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                akdx.this.s();
            }
        });
        Button button = (Button) inflate.findViewById(R.id.permission_request_button);
        this.an = button;
        button.setOnClickListener(this);
        int i = this.al;
        if (i != 0) {
            this.an.setText(i);
        }
        TextView textView = (TextView) inflate.findViewById(R.id.permission_description);
        this.ao = textView;
        textView.setText(this.aj);
        if (this.ar != 0) {
            ((TextView) inflate.findViewById(R.id.permission_title)).setText(this.ar);
        }
        if (this.c.j(mJ(), this.e)) {
            aJ();
        } else {
            this.b.n(new acte(this.ag));
            this.b.w(new acte(this.ag), this.aq);
        }
        return inflate;
    }

    private final void aI() {
        PermissionDescriptor permissionDescriptor;
        dt mJ = mJ();
        int i = 0;
        int i2 = 0;
        while (true) {
            PermissionDescriptor[] permissionDescriptorArr = this.e;
            if (i2 >= permissionDescriptorArr.length) {
                permissionDescriptor = null;
                break;
            } else if (!akdr.h(mJ, permissionDescriptorArr[i2].a)) {
                permissionDescriptor = this.e[i2];
                break;
            } else {
                i2++;
            }
        }
        if (permissionDescriptor == null) {
            while (true) {
                PermissionDescriptor[] permissionDescriptorArr2 = this.ae;
                if (i >= permissionDescriptorArr2.length) {
                    break;
                } else if (!akdr.h(mJ, permissionDescriptorArr2[i].a)) {
                    permissionDescriptor = this.ae[i];
                    break;
                } else {
                    i++;
                }
            }
        }
        if (permissionDescriptor == null) {
            akdz akdzVar = this.a;
            if (akdzVar == null) {
                return;
            }
            akdzVar.aJ();
            return;
        }
        acup acupVar = permissionDescriptor.b;
        if (acupVar != null) {
            this.b.n(new acte(acupVar));
            this.b.w(new acte(permissionDescriptor.b), this.aq);
        }
        acup acupVar2 = permissionDescriptor.c;
        if (acupVar2 != null) {
            this.b.n(new acte(acupVar2));
            this.b.w(new acte(permissionDescriptor.c), this.aq);
        }
        String[] l = akdr.l(permissionDescriptor.a);
        this.c.d(l);
        ab(l, permissionDescriptor.a);
    }

    private final void aJ() {
        this.b.n(new acte(this.ai));
        this.b.w(new acte(this.ai), this.aq);
        this.ao.setText(this.ak);
        int i = this.am;
        if (i != 0) {
            this.an.setText(i);
        } else {
            this.an.setText(R.string.permission_open_settings_button);
        }
        this.ap = true;
    }

    @Override // defpackage.dp
    public final void X(int i, String[] strArr, int[] iArr) {
        PermissionDescriptor permissionDescriptor;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            PermissionDescriptor[] permissionDescriptorArr = this.e;
            if (i3 >= permissionDescriptorArr.length) {
                int i4 = 0;
                while (true) {
                    PermissionDescriptor[] permissionDescriptorArr2 = this.ae;
                    if (i4 >= permissionDescriptorArr2.length) {
                        permissionDescriptor = null;
                        break;
                    }
                    permissionDescriptor = permissionDescriptorArr2[i4];
                    if (i == permissionDescriptor.a) {
                        break;
                    }
                    i4++;
                }
            } else {
                permissionDescriptor = permissionDescriptorArr[i3];
                if (i == permissionDescriptor.a) {
                    break;
                }
                i3++;
            }
        }
        permissionDescriptor.getClass();
        if (akdr.e(iArr)) {
            acup acupVar = permissionDescriptor.b;
            if (acupVar != null) {
                this.b.H(3, new acte(acupVar), this.aq);
            }
            aI();
            return;
        }
        while (true) {
            PermissionDescriptor[] permissionDescriptorArr3 = this.e;
            if (i2 >= permissionDescriptorArr3.length) {
                acup acupVar2 = permissionDescriptor.c;
                if (acupVar2 != null) {
                    this.b.H(3, new acte(acupVar2), this.aq);
                }
                akdz akdzVar = this.a;
                if (akdzVar == null) {
                    return;
                }
                akdzVar.aJ();
                return;
            } else if (i == permissionDescriptorArr3[i2].a) {
                acup acupVar3 = permissionDescriptor.c;
                if (acupVar3 != null) {
                    this.b.H(3, new acte(acupVar3), this.aq);
                }
                if (this.ap || !this.c.j(mJ(), this.e)) {
                    return;
                }
                aJ();
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // defpackage.dp
    public final void Y() {
        akdz akdzVar;
        super.Y();
        if (!this.ap || akdr.f(mJ(), this.e) || (akdzVar = this.a) == null) {
            return;
        }
        akdzVar.aJ();
    }

    @Override // defpackage.akea
    public final void aE(asjj asjjVar) {
        this.aq = asjjVar;
    }

    @Override // defpackage.akea
    public final void aF(akdz akdzVar) {
        this.a = akdzVar;
    }

    @Override // defpackage.akea
    public final void aG(Context context) {
        this.d = context;
    }

    @Override // defpackage.actq
    protected final apzg kw() {
        return null;
    }

    @Override // defpackage.actq
    protected final asjj kx() {
        return this.aq;
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        Bundle bundle2 = this.m;
        Parcelable[] parcelableArray = bundle2.getParcelableArray("REQUIRED_PERMISSIONS");
        this.e = new PermissionDescriptor[parcelableArray.length];
        for (int i = 0; i < parcelableArray.length; i++) {
            this.e[i] = (PermissionDescriptor) parcelableArray[i];
        }
        Parcelable[] parcelableArray2 = bundle2.getParcelableArray("OPTIONAL_PERMISSIONS");
        this.ae = new PermissionDescriptor[parcelableArray2.length];
        for (int i2 = 0; i2 < parcelableArray2.length; i2++) {
            this.ae[i2] = (PermissionDescriptor) parcelableArray2[i2];
        }
        this.af = acuo.a(bundle2.getInt("PAGE_VE_TYPE"));
        this.ag = acuo.b(bundle2.getInt("ALLOW_ACCESS_BUTTON_VE_TYPE"));
        this.ah = acuo.b(bundle2.getInt("CANCEL_BUTTON_VE_TYPE"));
        this.ai = acuo.b(bundle2.getInt("OPEN_APP_SETTING_BUTTON_VE_TYPE"));
        this.aj = bundle2.getInt("ALLOW_ACCESS_DESCRIPTION_RES_ID");
        this.ak = bundle2.getInt("OPEN_SETTING_DESCRIPTION_RES_ID");
        this.ar = bundle2.getInt("TITLE_RES_ID_KEY");
        this.al = bundle2.getInt("ALLOW_ACCESS_BUTTON_RES_ID_KEY");
        this.am = bundle2.getInt("OPEN_SETTING_BUTTON_RES_ID_KEY");
    }

    @Override // defpackage.actq, defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mc(layoutInflater, viewGroup, bundle);
        this.b.n(new acte(this.ah));
        this.b.w(new acte(this.ah), this.aq);
        return aH(viewGroup, layoutInflater);
    }

    @Override // defpackage.actq
    protected final acti oi() {
        return this.b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.ap) {
            acup acupVar = this.ai;
            if (acupVar != null) {
                this.b.H(3, new acte(acupVar), this.aq);
            }
            akdr.c(mJ());
            return;
        }
        acup acupVar2 = this.ag;
        if (acupVar2 != null) {
            this.b.H(3, new acte(acupVar2), this.aq);
        }
        aI();
    }

    @Override // defpackage.dp, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        dt mJ = mJ();
        View view = this.O;
        if (mJ == null || view == null || !(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        View aH = aH(viewGroup, (LayoutInflater) mJ.getSystemService("layout_inflater"));
        viewGroup.removeAllViews();
        viewGroup.addView(aH);
    }

    @Override // defpackage.actq
    protected final acup p() {
        return this.af;
    }

    @Override // defpackage.akea
    public final void s() {
        acup acupVar = this.ah;
        if (acupVar != null) {
            this.b.H(3, new acte(acupVar), this.aq);
        }
        akdz akdzVar = this.a;
        if (akdzVar != null) {
            akdzVar.aI();
        }
    }
}
