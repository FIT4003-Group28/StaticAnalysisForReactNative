package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Map;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gme  reason: default package */
/* loaded from: classes3.dex */
public abstract class gme implements aafl {
    protected final Context a;
    protected final yni b;
    protected final yzj c;
    protected final azqb d;
    protected final gmd e;
    public final Executor f;
    protected AlertDialog g;

    public gme(Context context, yni yniVar, aaxb aaxbVar, yzj yzjVar, azqb azqbVar, gmd gmdVar, Executor executor) {
        this.a = context;
        yniVar.getClass();
        this.b = yniVar;
        aaxbVar.getClass();
        yzjVar.getClass();
        this.c = yzjVar;
        azqbVar.getClass();
        this.d = azqbVar;
        gmdVar.getClass();
        this.e = gmdVar;
        this.f = executor;
    }

    protected abstract int b();

    protected abstract int c();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int d();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract aarv e(apzg apzgVar, Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(apzg apzgVar) {
    }

    @Override // defpackage.aafl
    public final void kD(final apzg apzgVar, Map map) {
        this.g = new AlertDialog.Builder(this.a).setMessage(new SpannableString(this.a.getText(c()))).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create();
        final Object I = zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        this.g.setButton(-1, this.a.getText(b()), new DialogInterface.OnClickListener() { // from class: gma
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                final gme gmeVar = gme.this;
                final apzg apzgVar2 = apzgVar;
                final Object obj = I;
                aaqs aaqsVar = (aaqs) gmeVar.d.get();
                aaqsVar.j(aafx.a(apzgVar2));
                ylx.l(gmeVar.e.a(aaqsVar), gmeVar.f, new gmb(gmeVar.c), new ylw() { // from class: gmc
                    @Override // defpackage.ylw, defpackage.zdt
                    public final void a(Object obj2) {
                        gme gmeVar2 = gme.this;
                        apzg apzgVar3 = apzgVar2;
                        Object obj3 = obj;
                        aoqu aoquVar = (aoqu) obj2;
                        zag.q(gmeVar2.a, gmeVar2.d(), 1);
                        gmeVar2.b.f(gmeVar2.e(apzgVar3, obj3));
                        gmeVar2.f(apzgVar3);
                    }
                }, anlf.a);
            }
        });
        this.g.show();
        TextView textView = (TextView) this.g.findViewById(16908299);
        Linkify.addLinks(textView, 1);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
