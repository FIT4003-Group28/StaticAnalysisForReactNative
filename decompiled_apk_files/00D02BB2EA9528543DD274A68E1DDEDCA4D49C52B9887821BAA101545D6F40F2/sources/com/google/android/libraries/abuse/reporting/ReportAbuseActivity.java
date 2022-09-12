package com.google.android.libraries.abuse.reporting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.view.Menu;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.libraries.abuse.reporting.ReportAbuseActivity;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ReportAbuseActivity extends ff implements cplj, cpln {
    public String A;
    public String B;
    public String C;
    public String D;
    public HashSet<String> E;
    public String F;
    public boolean G;
    public cnmq H;
    public cmri I;
    private String J;
    public Context k;
    public cplo l;
    public cpkq<CronetEngine> m;
    public Executor n;
    public UrlRequest.Callback o;
    public UrlRequest.Callback p;
    public UrlRequest.Callback q;
    public cpki r;
    public boolean s;
    public String t;
    public String u;
    public ckf v;
    public ckb w;
    public boolean x;
    public String y;
    public cko z;

    public final void j() {
        new cpkx(this).execute(new Void[0]);
    }

    @Override // defpackage.cplj
    public final void k(int i, int i2, String str) {
        this.l.k(i, i2, str);
    }

    @Override // defpackage.cplj
    public final void l(int i, int i2) {
        this.l.l(i, i2);
    }

    @Override // defpackage.cplj
    public final void o() {
        this.l.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ff, defpackage.agi, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == 0) {
            Toast.makeText(this.k, getString(R.string.uraw_play_services_error_text), 0).show();
            finish();
        } else if (i == 1000) {
            j();
        } else if (i == 1001) {
            new cpkz(this).execute(new Void[0]);
        } else if (i == 1003) {
            r();
        } else if (i != 1002) {
        } else {
            q(this.w);
        }
    }

    @Override // defpackage.agi, android.app.Activity
    public final void onBackPressed() {
        int i;
        cplo cploVar = this.l;
        if (cploVar == null || !cploVar.b.V()) {
            this.s = true;
            p(false, -1, -1, null, null);
            return;
        }
        cplo cploVar2 = this.l;
        ReportAbuseCardConfigParcel e = cploVar2.c.e();
        if (e == null || (i = e.f) == 0) {
            cploVar2.d();
        } else {
            cploVar2.l(1, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ff, defpackage.agi, defpackage.iw, android.app.Activity
    public final void onCreate(Bundle bundle) {
        CronetEngine cronetEngine;
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(akm.c(this, R.color.quantum_googblue700));
        this.k = getApplicationContext();
        this.s = false;
        Bundle extras = getIntent().getExtras();
        String string = extras.getString("client_environment");
        this.J = string;
        if (string == null) {
            this.J = "prod";
        }
        cplx cplxVar = (cplx) czhd.b(this, cplx.class);
        if (cplxVar == null) {
            cplxVar = cply.a.b;
        }
        cmri b = cplxVar.b();
        this.I = b;
        b.getClass();
        cnmq a = cplxVar.a();
        this.H = a;
        a.getClass();
        cpmc cpmcVar = (cpmc) czhd.b(this, cpmc.class);
        ReportAbuseComponentState reportAbuseComponentState = null;
        if (cpmcVar != null) {
            cronetEngine = cpmcVar.a();
            this.n = cpmcVar.b();
        } else {
            cronetEngine = null;
        }
        if (cronetEngine != null) {
            this.m = new cpkp(cronetEngine);
        } else {
            this.m = new cpku(this);
        }
        Executor executor = this.n;
        if (executor == null) {
            executor = Executors.newSingleThreadExecutor();
        }
        this.n = executor;
        cpma cpmaVar = (cpma) czhd.b(this, cpma.class);
        if (cpmaVar != null) {
            cpkn b2 = cpmaVar.b();
            b2.a = new cpkw(this);
            this.o = b2.a();
            cpkn b3 = cpmaVar.b();
            b3.a = new cplb(this);
            this.p = b3.a();
            cpkn b4 = cpmaVar.b();
            b4.a = new cple(this);
            this.q = b4.a();
            this.r = cpmaVar.a();
        } else {
            cpkn cpknVar = new cpkn();
            cpknVar.a = new cpkw(this);
            this.o = cpknVar.a();
            cpknVar.a = new cplb(this);
            this.p = cpknVar.a();
            cpknVar.a = new cple(this);
            this.q = cpknVar.a();
            this.r = new cpki(this.I, this.k, this.n, this.m, this.J);
        }
        if (bundle != null) {
            reportAbuseComponentState = (ReportAbuseComponentState) bundle.getParcelable("component");
        }
        if (extras == null) {
            setResult(0);
            finish();
            return;
        }
        this.t = extras.getString("config_name");
        this.u = extras.getString("language");
        this.A = extras.getString("reported_item_id");
        this.B = extras.getString("reported_content");
        this.x = extras.getBoolean("no_report_mode");
        this.F = extras.getString("app_source");
        String string2 = extras.getString("reporter_account_name");
        this.D = string2;
        if (string2 == null || string2.isEmpty()) {
            this.G = true;
        } else {
            this.G = false;
        }
        cko ckoVar = (cko) getIntent().getSerializableExtra("reporter_role");
        this.z = ckoVar;
        if (ckoVar == null) {
            this.z = cko.UNSPECIFIED;
        }
        this.E = new HashSet<>();
        String[] stringArray = extras.getStringArray("fulfilled_requirements");
        if (stringArray != null) {
            for (String str : stringArray) {
                this.E.add(str);
            }
        }
        if (extras.getInt("sample_demo_theme", -1) != -1) {
            setTheme(extras.getInt("sample_demo_theme"));
        } else {
            setTheme(R.style.UrawTheme);
        }
        if (reportAbuseComponentState != null) {
            this.l = new cplo(this, g(), reportAbuseComponentState);
            this.y = bundle.getString("reporter_id");
            this.C = bundle.getString("undo_report_id");
            cplo cploVar = this.l;
            if (cploVar.c.e() == null) {
                cploVar.b();
                return;
            } else {
                cploVar.d.postDelayed(new cpll(cploVar), 100L);
                return;
            }
        }
        new cpkz(this).execute(new Void[0]);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override // defpackage.ff, android.app.Activity
    public final void onDestroy() {
        this.s = true;
        cplo cploVar = this.l;
        if (cploVar != null) {
            cploVar.d.removeCallbacksAndMessages(null);
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ff, defpackage.agi, defpackage.iw, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        cplo cploVar = this.l;
        if (cploVar != null) {
            ReportAbuseComponentState reportAbuseComponentState = cploVar.c;
            if (reportAbuseComponentState.a != null) {
                bundle.putParcelable("component", reportAbuseComponentState);
            }
        }
        bundle.putString("reporter_id", this.y);
        bundle.putString("undo_report_id", this.C);
        super.onSaveInstanceState(bundle);
    }

    @Override // defpackage.cpln
    public final void p(boolean z, int i, int i2, String str, List<Pair<String, String>> list) {
        if (this.s) {
            return;
        }
        this.s = true;
        Intent intent = getIntent();
        intent.putExtra("report_submitted", z);
        if (str != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            Uri parse = Uri.parse(str);
            if (list != null) {
                for (Pair<String, String> pair : list) {
                    String str2 = (String) pair.second;
                    if (((String) pair.second).equals("ITEM_ID")) {
                        str2 = this.A;
                    }
                    parse = parse.buildUpon().appendQueryParameter((String) pair.first, str2).build();
                }
            }
            if (parse.getScheme() == null) {
                parse = parse.buildUpon().scheme("https").build();
            }
            intent2.setData(parse);
            startActivity(intent2);
        }
        if (i >= 0) {
            intent.putExtra("reported_abuse_type", i);
        } else {
            intent.putExtra("reported_abuse_type", -1);
        }
        if (i2 >= 0) {
            intent.putExtra("additional_action", i2);
        } else {
            intent.putExtra("additional_action", -1);
        }
        setResult(-1, intent);
        finish();
    }

    @Override // defpackage.cpln
    public final void q(ckb ckbVar) {
        this.l.e();
        new cplc(this).execute(ckbVar);
    }

    @Override // defpackage.cpln
    public final void r() {
        this.l.e();
        new cplf(this).execute(new Void[0]);
    }

    public final void s(final Runnable runnable) {
        runOnUiThread(new Runnable(this, runnable) { // from class: cpkr
            private final ReportAbuseActivity a;
            private final Runnable b;

            {
                this.a = this;
                this.b = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ReportAbuseActivity reportAbuseActivity = this.a;
                Runnable runnable2 = this.b;
                if (reportAbuseActivity.s) {
                    return;
                }
                runnable2.run();
            }
        });
    }

    public final void t(final Exception exc, final int i) {
        s(new Runnable(this, exc, i) { // from class: cpks
            private final ReportAbuseActivity a;
            private final Exception b;
            private final int c;

            {
                this.a = this;
                this.b = exc;
                this.c = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final ReportAbuseActivity reportAbuseActivity = this.a;
                Exception exc2 = this.b;
                int i2 = this.c;
                if (exc2 instanceof cmrj) {
                    reportAbuseActivity.H.a(reportAbuseActivity, ((cmrj) exc2).a, i2, new DialogInterface.OnCancelListener(reportAbuseActivity) { // from class: cpkt
                        private final ReportAbuseActivity a;

                        {
                            this.a = reportAbuseActivity;
                        }

                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            this.a.finish();
                        }
                    }).show();
                } else if (exc2 instanceof UserRecoverableAuthException) {
                    reportAbuseActivity.startActivityForResult(((UserRecoverableAuthException) exc2).a(), i2);
                } else {
                    Toast.makeText(reportAbuseActivity, reportAbuseActivity.getString(R.string.uraw_network_error_text), 0).show();
                    reportAbuseActivity.finish();
                }
            }
        });
    }
}
