package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AndroidApplicationEndpointOuterClass;
/* compiled from: PG */
/* renamed from: akpn  reason: default package */
/* loaded from: classes.dex */
public final class akpn implements ajru, ajrm {
    private final acti a;
    private final dh b;
    private final View c;
    private final ImageView d;
    private final TextView e;
    private final yni f;
    private final ajrp g;
    private akpl h;

    public akpn(aafo aafoVar, acti actiVar, dh dhVar, yni yniVar) {
        this.a = actiVar;
        this.b = dhVar;
        yniVar.getClass();
        this.f = yniVar;
        View inflate = View.inflate(dhVar.mJ(), R.layout.share_target, null);
        this.c = inflate;
        this.d = (ImageView) inflate.findViewById(R.id.icon);
        this.e = (TextView) inflate.findViewById(R.id.label);
        this.g = new ajrp(aafoVar, inflate, this);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajrm
    public final boolean h(View view) {
        apzg apzgVar;
        this.f.d(new akma());
        if (this.h != null) {
            aopa createBuilder = asjj.a.createBuilder();
            aopa createBuilder2 = asjo.a.createBuilder();
            akpl akplVar = this.h;
            Object[] objArr = new Object[2];
            objArr[0] = akpl.a(akplVar.d);
            if (akplVar.e == null && (apzgVar = akplVar.d) != null && apzgVar.qn(AndroidApplicationEndpointOuterClass.androidAppEndpoint)) {
                akplVar.e = ((apem) akplVar.d.qm(AndroidApplicationEndpointOuterClass.androidAppEndpoint)).d;
            }
            objArr[1] = akplVar.e;
            String format = String.format("%s/%s", objArr);
            createBuilder2.copyOnWrite();
            asjo asjoVar = (asjo) createBuilder2.instance;
            format.getClass();
            asjoVar.b = 1 | asjoVar.b;
            asjoVar.c = format;
            createBuilder.copyOnWrite();
            asjj asjjVar = (asjj) createBuilder.instance;
            asjo asjoVar2 = (asjo) createBuilder2.mo39build();
            asjoVar2.getClass();
            asjjVar.i = asjoVar2;
            asjjVar.b |= 32;
            asjj asjjVar2 = (asjj) createBuilder.mo39build();
            byte[] bArr = this.h.c;
            if (bArr != null) {
                this.a.H(3, new acte(bArr), asjjVar2);
            }
        }
        this.b.ku();
        return false;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        akpl akplVar = (akpl) obj;
        this.g.a(this.a, akplVar.d, null);
        byte[] bArr = akplVar.c;
        if (bArr != null) {
            this.a.u(new acte(bArr), null);
        }
        this.d.setImageDrawable(akplVar.a);
        this.e.setText(akplVar.b);
        this.h = akplVar;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
