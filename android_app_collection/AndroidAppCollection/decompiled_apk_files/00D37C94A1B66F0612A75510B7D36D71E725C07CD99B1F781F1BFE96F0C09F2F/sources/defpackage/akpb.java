package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareExternallyEndpoint;
import java.util.HashMap;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: akpb  reason: default package */
/* loaded from: classes.dex */
public final class akpb implements View.OnClickListener, ajru {
    private final akpa a;
    private final View b;
    private final ImageView c;
    private final TextView d;
    private final ajnj e;
    private final float f;
    private final float g;
    private autf h;

    public akpb(Context context, akpa akpaVar, ajmy ajmyVar) {
        this.a = akpaVar;
        View inflate = View.inflate(context, R.layout.share_target_service_update, null);
        this.b = inflate;
        ImageView imageView = (ImageView) inflate.findViewById(R.id.icon);
        this.c = imageView;
        this.d = (TextView) inflate.findViewById(R.id.title);
        this.e = new ajnj(ajmyVar, imageView);
        this.f = inflate.getAlpha();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        this.g = typedValue.getFloat();
        inflate.setOnClickListener(this);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    public final void d(autf autfVar, CharSequence charSequence, Drawable drawable) {
        if (!akzj.f(this.h, autfVar)) {
            return;
        }
        this.d.setText(charSequence);
        this.c.setImageDrawable(drawable);
        if (((akls) this.a).j) {
            this.b.animate().alpha(this.f).start();
        } else {
            this.b.setAlpha(this.g);
        }
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        arag aragVar;
        final autf autfVar = (autf) obj;
        this.h = autfVar;
        this.b.setTag(autfVar);
        this.b.setAlpha(0.0f);
        final akls aklsVar = (akls) this.a;
        jj jjVar = (jj) aklsVar.g.get(autfVar);
        if (jjVar != null) {
            d(autfVar, (CharSequence) jjVar.a, (Drawable) jjVar.b);
        } else {
            final ResolveInfo resolveInfo = (ResolveInfo) aklsVar.f.get(autfVar);
            if (resolveInfo == null) {
                this.b.setAlpha(((akls) this.a).j ? this.f : this.g);
                if ((autfVar.b & 8) != 0) {
                    ajnj ajnjVar = this.e;
                    avhn avhnVar = autfVar.e;
                    if (avhnVar == null) {
                        avhnVar = avhn.a;
                    }
                    ajnjVar.k(avhnVar);
                }
                TextView textView = this.d;
                if ((autfVar.b & 4) != 0) {
                    aragVar = autfVar.d;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                } else {
                    aragVar = null;
                }
                textView.setText(ajgl.b(aragVar));
            } else {
                ylx.k(aklsVar.i.qp(new Callable() { // from class: aklq
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        akls aklsVar2 = akls.this;
                        ResolveInfo resolveInfo2 = resolveInfo;
                        PackageManager packageManager = aklsVar2.a;
                        return new jj(resolveInfo2.loadLabel(packageManager), resolveInfo2.loadIcon(packageManager));
                    }
                }), aklsVar.h, aiuv.g, new ylw() { // from class: aklp
                    @Override // defpackage.ylw, defpackage.zdt
                    public final void a(Object obj2) {
                        akls aklsVar2 = akls.this;
                        autf autfVar2 = autfVar;
                        akpb akpbVar = this;
                        jj jjVar2 = (jj) obj2;
                        aklsVar2.g.put(autfVar2, jjVar2);
                        akpbVar.d(autfVar2, (CharSequence) jjVar2.a, (Drawable) jjVar2.b);
                    }
                });
            }
        }
        ((akls) this.a).e.u(new acte(autfVar.g), akls.k(autfVar));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        akpa akpaVar = this.a;
        akls aklsVar = (akls) akpaVar;
        if (aklsVar.j) {
            autf autfVar = (autf) view.getTag();
            aklsVar.d.d(new aklz());
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", akpaVar);
            hashMap.put("endpoint_resolver_override", aklsVar.b);
            hashMap.put("interaction_logger_override", aklsVar.e);
            hashMap.put("click_tracking_params", autfVar.g.I());
            asjj k = akls.k(autfVar);
            if (k != null) {
                hashMap.put("client_data_override", k);
            }
            aafo aafoVar = aklsVar.b;
            String str = aklsVar.k;
            apzg apzgVar = autfVar.f;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aopc aopcVar = (aopc) apzgVar.mo52toBuilder();
            if (aopcVar.qn(SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint)) {
                aopa mo52toBuilder = ((SendShareEndpoint$SendShareExternallyEndpoint) aopcVar.qm(SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint)).mo52toBuilder();
                SendShareEndpoint$SendShareExternallyEndpoint sendShareEndpoint$SendShareExternallyEndpoint = (SendShareEndpoint$SendShareExternallyEndpoint) mo52toBuilder.instance;
                if ((sendShareEndpoint$SendShareExternallyEndpoint.b & 1) != 0) {
                    arnf arnfVar = sendShareEndpoint$SendShareExternallyEndpoint.c;
                    if (arnfVar == null) {
                        arnfVar = arnf.a;
                    }
                    aopa mo52toBuilder2 = arnfVar.mo52toBuilder();
                    String h = zgh.h(str);
                    mo52toBuilder2.copyOnWrite();
                    arnf arnfVar2 = (arnf) mo52toBuilder2.instance;
                    arnfVar2.b |= 4;
                    arnfVar2.c = h;
                    mo52toBuilder.copyOnWrite();
                    SendShareEndpoint$SendShareExternallyEndpoint sendShareEndpoint$SendShareExternallyEndpoint2 = (SendShareEndpoint$SendShareExternallyEndpoint) mo52toBuilder.instance;
                    arnf arnfVar3 = (arnf) mo52toBuilder2.mo39build();
                    arnfVar3.getClass();
                    sendShareEndpoint$SendShareExternallyEndpoint2.c = arnfVar3;
                    sendShareEndpoint$SendShareExternallyEndpoint2.b |= 1;
                }
                SendShareEndpoint$SendShareExternallyEndpoint sendShareEndpoint$SendShareExternallyEndpoint3 = (SendShareEndpoint$SendShareExternallyEndpoint) mo52toBuilder.instance;
                if ((sendShareEndpoint$SendShareExternallyEndpoint3.b & 2) != 0) {
                    arnd arndVar = sendShareEndpoint$SendShareExternallyEndpoint3.d;
                    if (arndVar == null) {
                        arndVar = arnd.a;
                    }
                    aopa mo52toBuilder3 = arndVar.mo52toBuilder();
                    mo52toBuilder3.copyOnWrite();
                    arnd arndVar2 = (arnd) mo52toBuilder3.instance;
                    arndVar2.b |= 2;
                    arndVar2.d = false;
                    mo52toBuilder.copyOnWrite();
                    SendShareEndpoint$SendShareExternallyEndpoint sendShareEndpoint$SendShareExternallyEndpoint4 = (SendShareEndpoint$SendShareExternallyEndpoint) mo52toBuilder.instance;
                    arnd arndVar3 = (arnd) mo52toBuilder3.mo39build();
                    arndVar3.getClass();
                    sendShareEndpoint$SendShareExternallyEndpoint4.d = arndVar3;
                    sendShareEndpoint$SendShareExternallyEndpoint4.b |= 2;
                }
                aopcVar.e(SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint, (SendShareEndpoint$SendShareExternallyEndpoint) mo52toBuilder.mo39build());
            }
            aafoVar.c((apzg) aopcVar.mo39build(), hashMap);
            aklsVar.c.b(true);
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.h = null;
        this.c.setImageDrawable(null);
        this.e.a();
        this.d.setText((CharSequence) null);
    }
}
