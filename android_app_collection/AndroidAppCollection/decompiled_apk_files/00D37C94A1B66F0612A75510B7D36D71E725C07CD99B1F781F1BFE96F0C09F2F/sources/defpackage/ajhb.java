package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.text.method.LinkMovementMethod;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ajhb  reason: default package */
/* loaded from: classes.dex */
public final class ajhb extends ajgv {
    private final aqxq a;

    protected ajhb(aqxq aqxqVar, aafo aafoVar, ajgz ajgzVar, Object obj) {
        super(aafoVar, ajgzVar, obj, null);
        aqxqVar.getClass();
        this.a = aqxqVar;
    }

    public static void c(Context context, aqxq aqxqVar, aafo aafoVar, Object obj) {
        g(context, aqxqVar, aafoVar, null, obj);
    }

    public static void g(final Context context, aqxq aqxqVar, aafo aafoVar, ajgz ajgzVar, Object obj) {
        arag aragVar;
        arag aragVar2;
        ajhb ajhbVar = new ajhb(aqxqVar, aafoVar, ajgzVar, obj);
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        arag aragVar3 = null;
        if ((aqxqVar.b & 2) != 0) {
            aragVar = aqxqVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        builder.setTitle(ajgl.b(aragVar));
        if ((aqxqVar.b & 1) != 0) {
            aragVar2 = aqxqVar.c;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        builder.setMessage(aafv.a(aragVar2, aafoVar, true));
        if ((aqxqVar.b & 4) != 0 && (aragVar3 = aqxqVar.e) == null) {
            aragVar3 = arag.a;
        }
        builder.setPositiveButton(ajgl.b(aragVar3), ajhbVar);
        if (((Boolean) zew.D(context).b(aiyy.j).e(true)).booleanValue()) {
            return;
        }
        final AlertDialog create = builder.create();
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: ajha
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                AlertDialog alertDialog = create;
                Context context2 = context;
                Button button = alertDialog.getButton(-1);
                if (button != null) {
                    button.setTextColor(zhn.d(context2, R.attr.ytCallToAction));
                }
            }
        });
        ajhbVar.j(create);
        ajhbVar.k();
        TextView textView = (TextView) ajhbVar.i.findViewById(16908299);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        if (Build.VERSION.SDK_INT < 26) {
            lj.M(textView, new yzu(textView));
        }
        ampq.j(ajhbVar);
    }

    @Override // defpackage.ajgv
    protected final void f() {
        aqxq aqxqVar = this.a;
        int i = aqxqVar.b;
        if ((i & 16) != 0) {
            aafo aafoVar = this.g;
            apzg apzgVar = aqxqVar.g;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, d());
        } else if ((i & 8) == 0) {
        } else {
            aafo aafoVar2 = this.g;
            apzg apzgVar2 = aqxqVar.f;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            aafoVar2.c(apzgVar2, d());
        }
    }
}
