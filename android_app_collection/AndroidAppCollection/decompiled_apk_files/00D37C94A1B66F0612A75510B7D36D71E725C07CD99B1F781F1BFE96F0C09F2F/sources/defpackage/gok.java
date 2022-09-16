package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ConnectGpgDialogCommand$ConnectGPGDialogCommand;
import com.google.protos.youtube.api.innertube.ConnectGpgDialogRenderer;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gok  reason: default package */
/* loaded from: classes3.dex */
public final class gok implements aafl {
    private final Context a;
    private final aafo b;
    private final acti c;
    private final ajxz d;
    private final ajmy e;
    private final ajgz f;

    public gok(Context context, ajmy ajmyVar, aafo aafoVar, acti actiVar, ajxz ajxzVar, ajgz ajgzVar) {
        this.a = context;
        this.b = aafoVar;
        this.c = actiVar;
        this.d = ajxzVar;
        this.e = ajmyVar;
        this.f = ajgzVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        apzgVar.getClass();
        gow gowVar = new gow(this.b, this.c, this.d, this.e, this.f);
        aunb aunbVar = ((ConnectGpgDialogCommand$ConnectGPGDialogCommand) apzgVar.qm(ConnectGpgDialogCommand$ConnectGPGDialogCommand.connectGpgDialogCommand)).b;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        aqfu aqfuVar = aunbVar.qn(ConnectGpgDialogRenderer.connectGpgDialogRenderer) ? (aqfu) aunbVar.qm(ConnectGpgDialogRenderer.connectGpgDialogRenderer) : null;
        if (aqfuVar == null) {
            zep.b("Could not get ConnectGPGDialog from command.");
            return;
        }
        ((acsx) this.c).D(new acte(actj.CONNECT_GPGDIALOG_RENDERER));
        Context context = this.a;
        View inflate = LayoutInflater.from(context).inflate(R.layout.connect_gpg_dialog, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        arag aragVar = aqfuVar.f;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        zag.m(textView, ajgl.b(aragVar));
        TextView textView2 = (TextView) inflate.findViewById(R.id.message);
        textView2.setText(gow.c(aqfuVar.g, gowVar.a));
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        Resources resources = context.getResources();
        ImageView imageView = (ImageView) inflate.findViewById(R.id.user_avatar);
        avhn avhnVar = aqfuVar.c;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        gowVar.g(resources, imageView, avhnVar);
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.play_icon);
        ajxz ajxzVar = gowVar.c;
        arhs arhsVar = aqfuVar.d;
        if (arhsVar == null) {
            arhsVar = arhs.a;
        }
        arhr b = arhr.b(arhsVar.c);
        if (b == null) {
            b = arhr.UNKNOWN;
        }
        imageView2.setImageResource(ajxzVar.a(b));
        TextView textView3 = (TextView) inflate.findViewById(R.id.gamer_tag);
        arag aragVar2 = aqfuVar.b;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        zag.m(textView3, ajgl.b(aragVar2));
        TextView textView4 = (TextView) inflate.findViewById(R.id.user_email);
        arag aragVar3 = aqfuVar.e;
        if (aragVar3 == null) {
            aragVar3 = arag.a;
        }
        zag.m(textView4, ajgl.b(aragVar3));
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setNegativeButton((CharSequence) null, gowVar);
        builder.setPositiveButton((CharSequence) null, gowVar);
        apok apokVar = aqfuVar.h;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        apoj apojVar = apokVar.c;
        if (apojVar == null) {
            apojVar = apoj.a;
        }
        gowVar.d = apojVar;
        TextView textView5 = (TextView) inflate.findViewById(R.id.link_button);
        new yzh(context).b(textView5.getBackground(), zhn.j(context, R.attr.ytCallToAction).orElse(0));
        textView5.setTextColor(zhn.j(context, R.attr.ytFilledButtonText).orElse(0));
        textView5.setText(gow.b(gowVar.d));
        inflate.findViewById(R.id.link_button_container).setOnClickListener(new gov(gowVar, 1));
        inflate.findViewById(R.id.close_button).setOnClickListener(new gov(gowVar));
        apok apokVar2 = aqfuVar.i;
        if (apokVar2 == null) {
            apokVar2 = apok.a;
        }
        apoj apojVar2 = apokVar2.c;
        if (apojVar2 == null) {
            apojVar2 = apoj.a;
        }
        gowVar.e = apojVar2;
        apoj apojVar3 = gowVar.e;
        if (apojVar3 != null && (apojVar3.b & 1048576) != 0) {
            ((acsx) gowVar.b).D(new acte(apojVar3.t));
        }
        builder.setView(inflate);
        gowVar.j(builder.create());
        gowVar.k();
    }
}
