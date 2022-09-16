package com.google.android.libraries.accountlinking.activity;

import android.accounts.Account;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.libraries.accountlinking.activity.AccountLinkingActivity;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.youtube.R;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccountLinkingActivity extends dt {
    public static final anay a = sbs.e();
    public ryl b;
    public CircularProgressIndicator c;
    public ryq d;
    public ryh e;

    public final void a(dp dpVar, boolean z) {
        dp f = getSupportFragmentManager().f("flow_fragment");
        ex l = getSupportFragmentManager().l();
        if (f != null) {
            l.m(f);
        }
        if (z) {
            l.q(R.id.base_fragment_container_view, dpVar, "flow_fragment");
            l.a();
            return;
        }
        l.r(dpVar, "flow_fragment");
        l.a();
    }

    public final void b() {
        if (!isTaskRoot()) {
            finish();
        } else {
            finishAndRemoveTask();
        }
    }

    @Override // defpackage.abp, android.app.Activity
    public final void onBackPressed() {
        ((anav) a.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "onBackPressed", 173, "AccountLinkingActivity.java")).q("accountlinkingactivity: onBackPressed");
        dp f = getSupportFragmentManager().f("flow_fragment");
        if (f instanceof ryo) {
            ((ryo) f).a();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, defpackage.abp, defpackage.gb, android.app.Activity
    public final void onCreate(Bundle bundle) {
        anay anayVar = a;
        ((anav) anayVar.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "onCreate", 52, "AccountLinkingActivity.java")).q("AccountLinkingActivity onCreate()");
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            try {
                aqxo.p(extras.containsKey("session_id"));
                aqxo.p(extras.containsKey("scopes"));
                aqxo.p(extras.containsKey("capabilities"));
                ryk rykVar = new ryk();
                rykVar.f(amvn.p(extras.getStringArrayList("scopes")));
                rykVar.b(amvn.p(extras.getStringArrayList("capabilities")));
                rykVar.c = (Account) extras.getParcelable("account");
                if (extras.getBoolean("using_custom_dependency_supplier")) {
                    rykVar.d = true;
                }
                rykVar.e = extras.getInt("session_id");
                rykVar.f = extras.getString("bucket");
                rykVar.g = extras.getString("service_host");
                rykVar.h = extras.getInt("service_port");
                rykVar.i = extras.getString("service_id");
                rykVar.d(amtf.d(extras.getStringArrayList("flows")).f(ryj.c).g());
                rykVar.k = (aoft) aoft.a.getParserForType().j(extras.getByteArray("linking_session"));
                rykVar.e(amvn.p(extras.getStringArrayList("google_scopes")));
                rykVar.m = extras.getBoolean("two_way_account_linking");
                rykVar.n = extras.getInt("account_linking_entry_point", 0);
                rykVar.c(amtf.d(extras.getStringArrayList("data_usage_notices")).f(ryj.a).g());
                rykVar.p = amuk.o(extras.getStringArrayList("experiment_server_tokens"));
                this.b = rykVar.a();
                rzs rzsVar = ((rzu) bb.b(this, new rzt(getApplication(), this.b)).a(rzu.class)).d;
                if (rzsVar == null) {
                    ((anav) ((anav) anayVar.g()).i("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "onCreate", 81, "AccountLinkingActivity.java")).q("Unable to create ManagedDependencySupplier. Shutting down AccountLinkingActivity.");
                    ryi g = rwd.g(1, "Unable to create ManagedDependencySupplier.");
                    setResult(g.a, g.b);
                    b();
                    return;
                }
                setContentView(R.layout.account_linking_client);
                this.c = (CircularProgressIndicator) findViewById(R.id.Progress);
                ryh ryhVar = (ryh) bb.b(this, new ryg(getApplication(), this.b, rzsVar)).a(ryh.class);
                this.e = ryhVar;
                ryhVar.g.e(this, new u() { // from class: rxy
                    @Override // defpackage.u
                    public final void a(Object obj) {
                        dp dpVar;
                        AccountLinkingActivity accountLinkingActivity = AccountLinkingActivity.this;
                        rxx rxxVar = (rxx) obj;
                        try {
                            ryl rylVar = accountLinkingActivity.b;
                            rxx rxxVar2 = rxx.APP_FLIP;
                            int ordinal = rxxVar.ordinal();
                            if (ordinal == 0) {
                                aofk aofkVar = rylVar.k.f;
                                if (aofkVar == null) {
                                    aofkVar = aofk.a;
                                }
                                aoew aoewVar = aofkVar.b;
                                if (aoewVar == null) {
                                    aoewVar = aoew.a;
                                }
                                aopu<aoqu> aopuVar = aoewVar.b;
                                amvn amvnVar = rylVar.a;
                                aofk aofkVar2 = rylVar.k.f;
                                if (aofkVar2 == null) {
                                    aofkVar2 = aofk.a;
                                }
                                String str = aofkVar2.c;
                                aopuVar.getClass();
                                amvnVar.getClass();
                                str.getClass();
                                ryr ryrVar = new ryr();
                                Bundle bundle2 = new Bundle();
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                for (aoqu aoquVar : aopuVar) {
                                    aoquVar.writeDelimitedTo(byteArrayOutputStream);
                                }
                                bundle2.putByteArray("android_app_flip_list", byteArrayOutputStream.toByteArray());
                                bundle2.putStringArray("SCOPE", (String[]) amvnVar.toArray(new String[0]));
                                bundle2.putString("google_client_id", str);
                                ryrVar.ae(bundle2);
                                dpVar = ryrVar;
                            } else if (ordinal == 1 || ordinal == 2) {
                                Account account = rylVar.c;
                                aofp aofpVar = rylVar.k.e;
                                if (aofpVar == null) {
                                    aofpVar = aofp.a;
                                }
                                String str2 = aofpVar.b;
                                ryx ryxVar = new ryx();
                                Bundle bundle3 = new Bundle();
                                bundle3.putParcelable("account", account);
                                bundle3.putString("flow_url", str2);
                                ryxVar.ae(bundle3);
                                dpVar = ryxVar;
                            } else if (ordinal == 3) {
                                aofq aofqVar = rylVar.k.b;
                                if (aofqVar == null) {
                                    aofqVar = aofq.a;
                                }
                                String str3 = aofqVar.b;
                                aofq aofqVar2 = rylVar.k.b;
                                if (aofqVar2 == null) {
                                    aofqVar2 = aofq.a;
                                }
                                dpVar = rza.a(str3, aofqVar2.c);
                            } else {
                                ((anav) ((anav) AccountLinkingActivity.a.g()).i("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "createFragment", 204, "AccountLinkingActivity.java")).s("Unrecognized flow: %s", rxxVar);
                                String valueOf = String.valueOf(rxxVar);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                                sb.append("Unrecognized flow: ");
                                sb.append(valueOf);
                                throw new IllegalArgumentException(sb.toString());
                            }
                            if (!rxxVar.equals(rxx.STREAMLINED_LINK_ACCOUNT) && !rxxVar.equals(rxx.STREAMLINED_CREATE_ACCOUNT)) {
                                accountLinkingActivity.a(dpVar, false);
                                ((anav) AccountLinkingActivity.a.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "lambda$onCreate$0", 114, "AccountLinkingActivity.java")).s("Starting flow \"%s\"", rxxVar);
                            }
                            accountLinkingActivity.a(dpVar, true);
                            ((anav) AccountLinkingActivity.a.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "lambda$onCreate$0", 114, "AccountLinkingActivity.java")).s("Starting flow \"%s\"", rxxVar);
                        } catch (IOException e) {
                            ((anav) ((anav) ((anav) AccountLinkingActivity.a.g()).h(e)).i("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "lambda$onCreate$0", 116, "AccountLinkingActivity.java")).s("Failed to create a fragment for flow \"%s\"", rxxVar);
                            accountLinkingActivity.d.d(ryp.b(301));
                        }
                    }
                });
                this.e.h.e(this, new rya(this, 2));
                this.e.i.e(this, new rya(this, 1));
                this.e.j.e(this, new rya(this));
                ryq ryqVar = (ryq) bb.a(this).a(ryq.class);
                this.d = ryqVar;
                ryqVar.a.e(this, new u() { // from class: rxz
                    @Override // defpackage.u
                    public final void a(Object obj) {
                        ryp rypVar = (ryp) obj;
                        ryh ryhVar2 = AccountLinkingActivity.this.e;
                        int i = rypVar.f;
                        if (i == 1 && rypVar.e == 1) {
                            ((anav) ryh.d.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingViewModel", "onFlowResponse", 248, "AccountLinkingViewModel.java")).s("Data Usage Notice finished successfully: \"%s\"", ryhVar2.h.a());
                            if (!rypVar.c.equals("continue_linking")) {
                                ryhVar2.n = rypVar.c;
                            }
                            ryhVar2.g.i((rxx) ryhVar2.e.j.get(ryhVar2.f));
                        } else if (i == 1 && rypVar.e == 3) {
                            ((anav) ryh.d.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingViewModel", "onFlowResponse", 261, "AccountLinkingViewModel.java")).t("Data Usage Notice received unrecoverable error (%s) during flow: \"%s\"", rypVar.d, ryhVar2.h.a());
                            ryhVar2.j(rypVar, "Linking failed: Received unrecoverable error during linking.");
                        } else if (i != 2 || rypVar.e != 1) {
                            if (i == 2 && rypVar.e == 3) {
                                ((anav) ryh.d.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingViewModel", "onFlowResponse", 278, "AccountLinkingViewModel.java")).t("Received unrecoverable error (%s) during flow \"%s\"", rypVar.d, ryhVar2.g.a());
                                ryhVar2.j(rypVar, "Linking failed: Received unrecoverable error during linking.");
                            } else if (i != 2 || rypVar.e != 2) {
                            } else {
                                ((anav) ryh.d.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingViewModel", "onFlowResponse", 287, "AccountLinkingViewModel.java")).t("Received recoverable error (%s) during flow \"%s\"", rypVar.d, ryhVar2.g.a());
                                int i2 = ryhVar2.f + 1;
                                ryhVar2.f = i2;
                                if (i2 >= ryhVar2.e.j.size()) {
                                    ((anav) ryh.d.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingViewModel", "onFlowResponse", 292, "AccountLinkingViewModel.java")).q("Attempted all flows but failed");
                                    ryhVar2.j(rypVar, "Linking failed: All account linking flows were attempted");
                                } else if (ryhVar2.g.a() == rxx.STREAMLINED_LINK_ACCOUNT && ryhVar2.m && ryhVar2.l == aots.STATE_ACCOUNT_SELECTION && ryhVar2.e.o.contains(rxw.CAPABILITY_CONSENT)) {
                                    ((anav) ryh.d.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingViewModel", "onFlowResponse", 301, "AccountLinkingViewModel.java")).q("Streamlined screen failed to load and trying to load Data Usage Notice consent screen.");
                                    ryhVar2.h.k(amuk.r(rxw.CAPABILITY_CONSENT));
                                } else {
                                    rxx rxxVar = (rxx) ryhVar2.e.j.get(ryhVar2.f);
                                    ((anav) ryh.d.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingViewModel", "onFlowResponse", 312, "AccountLinkingViewModel.java")).s("Attempting next flow: \"%s\"", rxxVar);
                                    ryhVar2.g.i(rxxVar);
                                }
                            }
                        } else {
                            ((anav) ryh.d.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingViewModel", "onFlowResponse", 269, "AccountLinkingViewModel.java")).s("Flow \"%s\" received successful response; finishing flow...", ryhVar2.g.a());
                            rzo rzoVar = ryhVar2.k;
                            String str = rypVar.c;
                            rxx rxxVar2 = rxx.APP_FLIP;
                            int ordinal = ((rxx) ryhVar2.g.a()).ordinal();
                            if (ordinal != 0) {
                                if (ordinal == 1 || ordinal == 2) {
                                    if (ryhVar2.e.m) {
                                        ryhVar2.d(str);
                                        return;
                                    }
                                    ryhVar2.i(aots.STATE_COMPLETE);
                                    ryhVar2.k(rwd.h(str));
                                    return;
                                } else if (ordinal != 3) {
                                    return;
                                } else {
                                    ryhVar2.j.i(true);
                                    ryl rylVar = ryhVar2.e;
                                    int i3 = rylVar.e;
                                    Account account = rylVar.c;
                                    String str2 = rylVar.i;
                                    String str3 = ryhVar2.n;
                                    aopa createBuilder = aoff.a.createBuilder();
                                    if (str3 != null) {
                                        createBuilder.copyOnWrite();
                                        ((aoff) createBuilder.instance).e = str3;
                                    }
                                    aofx d = rzoVar.d(i3);
                                    createBuilder.copyOnWrite();
                                    d.getClass();
                                    ((aoff) createBuilder.instance).b = d;
                                    createBuilder.copyOnWrite();
                                    str2.getClass();
                                    ((aoff) createBuilder.instance).c = str2;
                                    createBuilder.copyOnWrite();
                                    str.getClass();
                                    ((aoff) createBuilder.instance).d = str;
                                    final aoff aoffVar = (aoff) createBuilder.mo39build();
                                    anlz.A(rzoVar.b(account, new rzn() { // from class: rzj
                                        @Override // defpackage.rzn
                                        public final ankt a(aymy aymyVar) {
                                            aoff aoffVar2 = aoff.this;
                                            axye axyeVar = aymyVar.a;
                                            ayax ayaxVar = aoex.d;
                                            if (ayaxVar == null) {
                                                synchronized (aoex.class) {
                                                    ayaxVar = aoex.d;
                                                    if (ayaxVar == null) {
                                                        ayau a2 = ayax.a();
                                                        a2.c = ayaw.UNARY;
                                                        a2.d = ayax.c("google.internal.identity.accountlinking.v1.AccountLinkingService", "FinishOAuth");
                                                        a2.b();
                                                        a2.a = aymw.b(aoff.a);
                                                        a2.b = aymw.b(aofg.a);
                                                        ayaxVar = a2.a();
                                                        aoex.d = ayaxVar;
                                                    }
                                                }
                                            }
                                            return aynh.a(axyeVar.a(ayaxVar, aymyVar.b), aoffVar2);
                                        }
                                    }), new ryd(ryhVar2), anjk.a);
                                    return;
                                }
                            }
                            ryhVar2.j.i(true);
                            ryl rylVar2 = ryhVar2.e;
                            int i4 = rylVar2.e;
                            Account account2 = rylVar2.c;
                            String str4 = rylVar2.i;
                            amuk g2 = rylVar2.a.g();
                            String str5 = ryhVar2.n;
                            aopa createBuilder2 = aofa.a.createBuilder();
                            aofx d2 = rzoVar.d(i4);
                            createBuilder2.copyOnWrite();
                            d2.getClass();
                            ((aofa) createBuilder2.instance).b = d2;
                            aopa createBuilder3 = aofi.a.createBuilder();
                            createBuilder3.copyOnWrite();
                            str4.getClass();
                            ((aofi) createBuilder3.instance).b = str4;
                            createBuilder2.copyOnWrite();
                            aofi aofiVar = (aofi) createBuilder3.mo39build();
                            aofiVar.getClass();
                            ((aofa) createBuilder2.instance).c = aofiVar;
                            aopa createBuilder4 = aoez.a.createBuilder();
                            createBuilder4.copyOnWrite();
                            str.getClass();
                            ((aoez) createBuilder4.instance).b = str;
                            createBuilder2.copyOnWrite();
                            aoez aoezVar = (aoez) createBuilder4.mo39build();
                            aoezVar.getClass();
                            ((aofa) createBuilder2.instance).d = aoezVar;
                            if (str5 != null) {
                                createBuilder2.copyOnWrite();
                                ((aofa) createBuilder2.instance).e = str5;
                            } else {
                                aopa createBuilder5 = aoez.a.createBuilder();
                                createBuilder5.copyOnWrite();
                                str.getClass();
                                ((aoez) createBuilder5.instance).b = str;
                                createBuilder5.copyOnWrite();
                                aoez aoezVar2 = (aoez) createBuilder5.instance;
                                aopu aopuVar = aoezVar2.c;
                                if (!aopuVar.c()) {
                                    aoezVar2.c = aopi.mutableCopy(aopuVar);
                                }
                                aonk.addAll((Iterable) g2, (List) aoezVar2.c);
                                createBuilder2.copyOnWrite();
                                aoez aoezVar3 = (aoez) createBuilder5.mo39build();
                                aoezVar3.getClass();
                                ((aofa) createBuilder2.instance).d = aoezVar3;
                            }
                            anlz.A(rzoVar.b(account2, new rzm(createBuilder2, 1)), new ryc(ryhVar2), anjk.a);
                        }
                    }
                });
                ryh ryhVar2 = this.e;
                if (ryhVar2.g.a() != null) {
                    ((anav) ryh.d.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingViewModel", "startIfNotStarted", 172, "AccountLinkingViewModel.java")).q("Account linking flows are already started");
                    return;
                } else if (ryhVar2.e.o.isEmpty() || ryhVar2.h.a() == null) {
                    if (ryhVar2.e.j.isEmpty()) {
                        ((anav) ((anav) ryh.d.g()).i("com/google/android/libraries/accountlinking/activity/AccountLinkingViewModel", "startIfNotStarted", 183, "AccountLinkingViewModel.java")).q("No account linking flow is enabled by server");
                        ryhVar2.k(rwd.g(1, "Linking failed; No account linking flow is enabled by server"));
                        return;
                    }
                    rxx rxxVar = (rxx) ryhVar2.e.j.get(0);
                    if (rxxVar == rxx.APP_FLIP) {
                        PackageManager packageManager = ryhVar2.a.getPackageManager();
                        aofk aofkVar = ryhVar2.e.k.f;
                        if (aofkVar == null) {
                            aofkVar = aofk.a;
                        }
                        aoew aoewVar = aofkVar.b;
                        if (aoewVar == null) {
                            aoewVar = aoew.a;
                        }
                        aopu aopuVar = aoewVar.b;
                        amuk g2 = ryhVar2.e.a.g();
                        aofk aofkVar2 = ryhVar2.e.k.f;
                        if (aofkVar2 == null) {
                            aofkVar2 = aofk.a;
                        }
                        if (!rzv.a(packageManager, aopuVar, g2, aofkVar2.c).h()) {
                            ((anav) ryh.d.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingViewModel", "startIfNotStarted", 203, "AccountLinkingViewModel.java")).q("3p app not installed");
                            ryhVar2.h(aotq.EVENT_APP_FLIP_3P_APP_NOT_SUPPORTED);
                            int i = ryhVar2.f + 1;
                            ryhVar2.f = i;
                            if (i >= ryhVar2.e.j.size()) {
                                ((anav) ryh.d.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingViewModel", "startIfNotStarted", 207, "AccountLinkingViewModel.java")).q("Attempted all flows but failed");
                                ryhVar2.k(rwd.g(1, "Linking failed; All account linking flows were attempted"));
                                return;
                            }
                            rxxVar = (rxx) ryhVar2.e.j.get(ryhVar2.f);
                            ((anav) ryh.d.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingViewModel", "startIfNotStarted", 216, "AccountLinkingViewModel.java")).s("3p app not installed, move to next flow, %s ", rxxVar);
                        }
                    }
                    if (rxxVar == rxx.STREAMLINED_LINK_ACCOUNT) {
                        ryhVar2.m = true;
                    }
                    if ((rxxVar != rxx.APP_FLIP && rxxVar != rxx.WEB_OAUTH) || ryhVar2.e.o.isEmpty()) {
                        if (rxxVar != rxx.STREAMLINED_LINK_ACCOUNT || !ryhVar2.e.o.contains(rxw.LINKING_INFO)) {
                            ryhVar2.g.i(rxxVar);
                            return;
                        } else {
                            ryhVar2.h.i(amuk.r(rxw.LINKING_INFO));
                            return;
                        }
                    }
                    ryhVar2.h.i(ryhVar2.e.o);
                    return;
                } else {
                    ((anav) ryh.d.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingViewModel", "startIfNotStarted", 178, "AccountLinkingViewModel.java")).q("Account linking data usage notice is already started");
                    return;
                }
            } catch (Exception unused) {
                ((anav) ((anav) a.g()).i("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "onCreate", 66, "AccountLinkingActivity.java")).q("Unable to parse arguments from bundle.");
                ryi g3 = rwd.g(1, "Unable to parse arguments from bundle.");
                setResult(g3.a, g3.b);
                b();
                return;
            }
        }
        ((anav) ((anav) anayVar.g()).i("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "onCreate", 56, "AccountLinkingActivity.java")).q("bundle cannot be null.");
        ryi g4 = rwd.g(1, "bundle cannot be null.");
        setResult(g4.a, g4.b);
        b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, android.app.Activity
    public final void onNewIntent(Intent intent) {
        ryp a2;
        ryp rypVar;
        super.onNewIntent(intent);
        this.e.h(aotq.EVENT_APP_AUTH_RECEIVE_NEW_INTENT);
        anay anayVar = a;
        ((anav) anayVar.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "onNewIntent", 160, "AccountLinkingActivity.java")).q("AccountLinkingActivity received onNewIntent()");
        dp f = getSupportFragmentManager().f("flow_fragment");
        if (f instanceof rza) {
            rza rzaVar = (rza) f;
            rzaVar.af.h(aotq.EVENT_APP_AUTH_FRAGMENT_HANDLE_INTENT);
            ((anav) rza.a.k().i("com/google/android/libraries/accountlinking/flows/weboauth/WebOAuthFragment", "handleNewIntent", 195, "WebOAuthFragment.java")).q("WebOAuthFragment received handleNewIntent()");
            intent.getClass();
            rzaVar.ag = true;
            Uri data = intent.getData();
            if (data == null) {
                ((anav) rza.a.k().i("com/google/android/libraries/accountlinking/flows/weboauth/WebOAuthFragment", "handleNewIntent", 201, "WebOAuthFragment.java")).q("Uri in new intent is null");
                a2 = rza.c;
                rzaVar.af.h(aotq.EVENT_APP_AUTH_NULL_RESPONSE_URI);
            } else if (data.getQueryParameterNames().contains("error")) {
                String queryParameter = data.getQueryParameter("error");
                ((anav) rza.a.k().i("com/google/android/libraries/accountlinking/flows/weboauth/WebOAuthFragment", "handleNewIntent", 206, "WebOAuthFragment.java")).s("WebOAuth received parameter error: %s", queryParameter);
                if (rza.d.containsKey(queryParameter)) {
                    rypVar = (ryp) rza.d.get(queryParameter);
                } else {
                    rypVar = rza.b;
                }
                rzaVar.af.h((aotq) rza.e.getOrDefault(queryParameter, aotq.EVENT_APP_AUTH_OTHER));
                a2 = rypVar;
            } else {
                String queryParameter2 = data.getQueryParameter("redirect_state");
                ((anav) rza.a.k().i("com/google/android/libraries/accountlinking/flows/weboauth/WebOAuthFragment", "handleNewIntent", 217, "WebOAuthFragment.java")).s("WebOAuth received parameter state [hidden (isEmpty=%s)]", Boolean.valueOf(TextUtils.isEmpty(queryParameter2)));
                if (TextUtils.isEmpty(queryParameter2)) {
                    a2 = rza.b;
                    rzaVar.af.h(aotq.EVENT_APP_AUTH_NO_REDIRECT_STATE);
                } else {
                    a2 = ryp.a(2, queryParameter2);
                    rzaVar.af.h(aotq.EVENT_APP_AUTH_SUCCESS);
                }
            }
            rzaVar.ae.d(a2);
            return;
        }
        ((anav) ((anav) anayVar.g()).i("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "onNewIntent", 166, "AccountLinkingActivity.java")).q("Illegal state: there is no WebOAuthFragment when onNewIntent() is called");
    }
}
