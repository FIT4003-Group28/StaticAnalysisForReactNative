package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.Window;
import com.facebook.litho.ComponentTree;
/* compiled from: PG */
/* renamed from: ajln  reason: default package */
/* loaded from: classes.dex */
public final class ajln implements srv {
    public final Context a;
    public int b;
    private final axnm c;
    private final axnm d;
    private final axnm e;
    private final axnm f;
    private aypf g;
    private AlertDialog h;

    public ajln(Context context, axnm axnmVar, axnm axnmVar2, axnm axnmVar3, axnm axnmVar4) {
        this.a = context;
        this.c = axnmVar;
        this.d = axnmVar2;
        this.e = axnmVar3;
        this.f = axnmVar4;
    }

    @Override // defpackage.srv
    public final void a() {
        AlertDialog alertDialog = this.h;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.h = null;
        }
        c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.srv
    public final void b(awnn awnnVar, final sru sruVar) {
        AlertDialog.Builder builder;
        aypf aypfVar = this.g;
        if (aypfVar != null) {
            aypfVar.qr();
        }
        aypf aypfVar2 = new aypf();
        this.g = aypfVar2;
        this.b = ((Activity) this.a).getRequestedOrientation();
        final tcu tcuVar = (tcu) this.c.get();
        int i = sruVar.i;
        if (i != -1) {
            ((Activity) this.a).setRequestedOrientation(i);
        }
        int i2 = sruVar.m;
        if (i2 == 2 || i2 == 3) {
            builder = new AlertDialog.Builder(this.a, 2132083898);
        } else {
            builder = new AlertDialog.Builder(this.a);
        }
        AlertDialog.Builder builder2 = builder;
        String str = sruVar.a;
        if (!TextUtils.isEmpty(str)) {
            builder2.setTitle(str);
        }
        if (!TextUtils.isEmpty(sruVar.b)) {
            builder2.setMessage(sruVar.b);
        }
        final tcs tcsVar = sruVar.g;
        acti actiVar = null;
        if (!TextUtils.isEmpty(sruVar.c)) {
            awmt awmtVar = sruVar.e;
            builder2.setPositiveButton(sruVar.c, awmtVar == null ? null : new ajll(tcuVar, awmtVar, tcsVar, 1));
        }
        final awmt awmtVar2 = sruVar.f;
        if (!TextUtils.isEmpty(sruVar.d)) {
            builder2.setNegativeButton(sruVar.d, awmtVar2 == null ? null : new ajll(tcuVar, awmtVar2, tcsVar));
        }
        if (awmtVar2 != null) {
            builder2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: ajlk
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    tcu.this.b(awmtVar2, tcsVar).Q();
                }
            });
        }
        if ((awnnVar.b & 1) != 0) {
            dci dciVar = new dci(this.a);
            cyv cyvVar = dciVar.t;
            aoob aoobVar = sruVar.l;
            if (aoobVar != null) {
                acti actiVar2 = (acti) this.f.get();
                if (!aoobVar.H()) {
                    actiVar2.d(acuo.a(46220), null, null);
                    actiVar2.D(new acte(aoobVar));
                }
            }
            Object obj = sruVar.k;
            if (obj instanceof acti) {
                actiVar = obj;
            } else if (sruVar.l != null) {
                actiVar = (acti) this.f.get();
            }
            if (actiVar == null) {
                actiVar = ((acth) this.e.get()).oi();
            }
            tcz a = tda.a();
            a.a = dciVar;
            a.f(false);
            a.l = amuk.r(ajjh.c(awnnVar.toByteArray()));
            czf c = ComponentTree.c(cyvVar, ((swq) this.d.get()).a(cyvVar, a.a(), awnnVar.toByteArray(), ajjk.v(actiVar), aypfVar2));
            c.d = false;
            dciVar.G(c.a());
            builder2.setView(dciVar);
        }
        DialogInterface.OnKeyListener onKeyListener = sruVar.h;
        if (onKeyListener != null) {
            builder2.setOnKeyListener(onKeyListener);
        }
        final srt srtVar = sruVar.j;
        builder2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ajlm
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ajln ajlnVar = ajln.this;
                sru sruVar2 = sruVar;
                srt srtVar2 = srtVar;
                ajlnVar.c();
                if (sruVar2.i != -1) {
                    ((Activity) ajlnVar.a).setRequestedOrientation(ajlnVar.b);
                }
                if (srtVar2 != null) {
                    srtVar2.e();
                }
            }
        });
        AlertDialog create = builder2.create();
        create.show();
        Window window = create.getWindow();
        if (window != null) {
            window.clearFlags(131072);
            window.setSoftInputMode(16);
        }
        if (sruVar.m == 2 && window != null) {
            window.getDecorView().setSystemUiVisibility(5894);
        }
        if (srtVar != null) {
            srtVar.f();
        }
        this.h = create;
    }

    public final void c() {
        aypf aypfVar = this.g;
        if (aypfVar != null) {
            aypfVar.qr();
            this.g = null;
        }
    }
}
