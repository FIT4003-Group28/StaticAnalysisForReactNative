package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kwq  reason: default package */
/* loaded from: classes3.dex */
public final class kwq {
    public final TextView a;
    public final aadd b;

    public kwq(View view, final aafo aafoVar, aadd aaddVar) {
        this.b = aaddVar;
        this.a = (TextView) view.findViewById(R.id.text);
        view.findViewById(R.id.help_button).setOnClickListener(new View.OnClickListener() { // from class: kwp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                kwq kwqVar = kwq.this;
                aafo aafoVar2 = aafoVar;
                asxp asxpVar = kwqVar.b.a().e;
                if (asxpVar == null) {
                    asxpVar = asxp.a;
                }
                String str = asxpVar.aV;
                aopc aopcVar = (aopc) apzg.a.createBuilder();
                aopg aopgVar = UrlEndpointOuterClass.urlEndpoint;
                aopa createBuilder = avvk.a.createBuilder();
                String valueOf = String.valueOf(str);
                String valueOf2 = String.valueOf(Locale.getDefault().getLanguage());
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                createBuilder.copyOnWrite();
                avvk avvkVar = (avvk) createBuilder.instance;
                concat.getClass();
                avvkVar.b |= 1;
                avvkVar.c = concat;
                aopcVar.e(aopgVar, (avvk) createBuilder.mo39build());
                aafoVar2.a((apzg) aopcVar.mo39build());
            }
        });
    }
}
