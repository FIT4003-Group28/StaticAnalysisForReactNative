package com.google.android.apps.gmm.locationsharing.ui.sendkit;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.gmm.locationsharing.ui.sendkit.JourneySharingSendKitActivity;
import com.google.android.libraries.social.sendkit.api.SendKitPickerResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class JourneySharingSendKitActivity extends affm implements cxov, cxvq, dxiw, ajyk {
    private static final dcqe u = dcqe.c("com.google.android.apps.gmm.locationsharing.ui.sendkit.JourneySharingSendKitActivity");
    private int A = 0;
    public bvrb k;
    public akfa l;
    public bvjj m;
    public ajus n;
    public dxiu<Object> o;
    public ajup p;
    public cqkj q;
    public dehn<btlu> r;
    public String s;
    public ajym t;
    private cxvr v;
    @dzsi
    private ajyl w;
    private ViewGroup x;
    private boolean y;
    @dzsi
    private czha z;

    public static Intent o(Context context, String str, String str2, boolean z, boolean z2, int i, dbsg<SendKitPickerResult> dbsgVar) {
        Intent intent = new Intent(context, JourneySharingSendKitActivity.class);
        intent.putExtra("account_id", str);
        intent.putExtra("account_name", str2);
        intent.putExtra("night_mode", z);
        intent.putExtra("keep_screen_on", z2);
        intent.putExtra("config_mode", i);
        if (dbsgVar.a()) {
            intent.putExtra("preselected_targets", dbsgVar.b());
        }
        return intent;
    }

    private final void t(boolean z, czha czhaVar) {
        if (!z) {
            return;
        }
        boolean z2 = false;
        if (czhaVar == null) {
            bvoo.h("Unexpected null SendTarget.", new Object[0]);
        } else if (this.A != 0) {
            this.r.isDone();
            this.v.b(czhaVar);
        } else if (!this.n.a(czhaVar, (btlu) deha.s(this.r))) {
        } else {
            this.A = 1;
            this.z = czhaVar;
            if (this.w == null) {
                z2 = true;
            }
            dbsk.l(z2);
            this.w = u();
        }
    }

    private final ajyl u() {
        ajym ajymVar = this.t;
        cqkj cqkjVar = this.q;
        cjqy cjqyVar = ajymVar.a;
        cjqq cjqqVar = ajymVar.b;
        btvo btvoVar = ajymVar.c;
        cqhn cqhnVar = ajymVar.d;
        final ajza ajzaVar = new ajza(this, cjqyVar, cjqqVar, this, cqkjVar);
        qy b = new qx(ajzaVar.b, 2132018255).b();
        cqkf c = ajzaVar.f.c(new ajzd(), null);
        c.e(new ajyz(ajzaVar, b));
        View c2 = c.c();
        final cjql d = ajzaVar.e.f(c2).d(cjtd.a(dtxu.ec));
        b.c(c2);
        b.setCancelable(true);
        b.setOnCancelListener(new DialogInterface.OnCancelListener(ajzaVar, d) { // from class: ajyy
            private final ajza a;
            private final cjql b;

            {
                this.a = ajzaVar;
                this.b = d;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ajza ajzaVar2 = this.a;
                ajzaVar2.d.j(this.b, cjtd.a(dtxu.ee));
                ajzaVar2.c.aJ();
            }
        });
        if (b.getWindow() != null) {
            Window window = b.getWindow();
            dbsk.s(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        ajzaVar.a = b;
        ajzaVar.a.show();
        return ajzaVar;
    }

    @Override // defpackage.dxiw
    public final dxis<Object> NK() {
        return this.o;
    }

    @Override // defpackage.ajyk
    public final void aJ() {
        if (!this.y || this.A != 1) {
            return;
        }
        cxvr cxvrVar = this.v;
        czha czhaVar = this.z;
        dbsk.s(czhaVar);
        cxvrVar.b(czhaVar);
        this.A = 0;
        this.z = null;
        this.w = null;
    }

    @Override // defpackage.ajyk
    public final void aR() {
        if (!this.y || this.A != 1) {
            return;
        }
        this.A = 0;
        this.z = null;
        this.w = null;
    }

    @Override // defpackage.ajyk
    public final void aS() {
        if (!this.y || this.A != 1) {
            return;
        }
        this.A = 0;
        this.z = null;
        this.w = null;
        this.r.Pk(new Runnable(this) { // from class: ajul
            private final JourneySharingSendKitActivity a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                JourneySharingSendKitActivity journeySharingSendKitActivity = this.a;
                journeySharingSendKitActivity.m.T(bvjk.gz, (btlu) deha.s(journeySharingSendKitActivity.r), true);
            }
        }, this.k.h());
    }

    @Override // defpackage.ff, android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        String name = JourneySharingSendKitActivity.class.getName();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(name).length());
        sb.append(str);
        sb.append(name);
        sb.append(":");
        printWriter.println(sb.toString());
        boolean z = this.y;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 17);
        sb2.append(str);
        sb2.append("  isStarted=");
        sb2.append(z);
        printWriter.println(sb2.toString());
        int i = this.A;
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 19);
        sb3.append(str);
        sb3.append("  state=");
        sb3.append(i);
        printWriter.println(sb3.toString());
        String hexString = Integer.toHexString(System.identityHashCode(this.w));
        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(hexString).length());
        sb4.append(str);
        sb4.append("  showingLinkWarningDialog=");
        sb4.append(hexString);
        printWriter.println(sb4.toString());
        String valueOf = String.valueOf(this.r);
        StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 10 + String.valueOf(valueOf).length());
        sb5.append(str);
        sb5.append("  account=");
        sb5.append(valueOf);
        printWriter.println(sb5.toString());
    }

    @Override // defpackage.rb, defpackage.ff, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        cxvr cxvrVar = this.v;
        if (cxvrVar.c != null) {
            ((InputMethodManager) cxvrVar.b.getSystemService("input_method")).hideSoftInputFromWindow(cxvrVar.a.getWindowToken(), 0);
        }
        cxwe cxweVar = cxvrVar.c;
        if (cxweVar != null) {
            cxweVar.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01a0, code lost:
        if ((r10.a & 32) == 0) goto L67;
     */
    @Override // defpackage.ff, defpackage.agi, defpackage.iw, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(@defpackage.dzsi android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gmm.locationsharing.ui.sendkit.JourneySharingSendKitActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.rb, defpackage.ff, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        cxvr cxvrVar = this.v;
        if (!cxvrVar.i) {
            cxvrVar.f.j(3, cxvrVar.e.b());
        }
        cxvrVar.f.e();
        cxvrVar.e.j();
    }

    @Override // defpackage.ff, defpackage.agi, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        cxwe cxweVar = this.v.c;
        if (cxweVar != null) {
            cxweVar.v(i, iArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ff, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.v.i = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ff, defpackage.agi, defpackage.iw, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("state", this.A);
        if (this.A == 1) {
            dbsk.s(this.z);
            bundle.putByteArray("last_selected", this.z.bS());
        }
        cxvr cxvrVar = this.v;
        bundle.putParcelable("PeopleKitSelectionModel", cxvrVar.e);
        bundle.putParcelable("PeopleKitDataLayer", cxvrVar.f);
        bundle.putParcelableArrayList("PeopleKitChipInfos", cxvrVar.c.h.k());
        cxvrVar.i = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.rb, defpackage.ff, android.app.Activity
    public final void onStart() {
        super.onStart();
        boolean z = true;
        this.y = true;
        if (this.A == 1) {
            if (this.w != null) {
                z = false;
            }
            dbsk.l(z);
            this.w = u();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.rb, defpackage.ff, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.y = false;
        ajyl ajylVar = this.w;
        if (ajylVar != null) {
            ajza ajzaVar = (ajza) ajylVar;
            qy qyVar = ajzaVar.a;
            if (qyVar != null) {
                qyVar.dismiss();
                ajzaVar.a = null;
            }
            this.w = null;
        }
    }

    @Override // defpackage.cxvq
    public final void p() {
        setResult(0);
        finishAfterTransition();
    }

    @Override // defpackage.cxov
    public final void q(SendKitPickerResult sendKitPickerResult) {
        if (this.r.isDone() && this.A == 0) {
            Intent intent = new Intent();
            intent.putExtra("sendkit_result", sendKitPickerResult);
            setResult(-1, intent);
            finish();
        }
    }

    @Override // defpackage.cxov
    public final void r(czha czhaVar) {
        t(true, czhaVar);
    }

    @Override // defpackage.cxov
    public final void s(czha czhaVar, boolean z) {
        t(false, czhaVar);
    }
}
