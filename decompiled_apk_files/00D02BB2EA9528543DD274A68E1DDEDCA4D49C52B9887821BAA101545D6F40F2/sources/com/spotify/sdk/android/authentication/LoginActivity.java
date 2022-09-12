package com.spotify.sdk.android.authentication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class LoginActivity extends Activity {
    private dxht a = new dxht(this);
    private AuthenticationRequest b;
    private boolean c;

    public static AuthenticationResponse a(Intent intent) {
        Bundle bundleExtra;
        if (intent == null || (bundleExtra = intent.getBundleExtra("EXTRA_AUTH_RESPONSE")) == null) {
            return null;
        }
        return (AuthenticationResponse) bundleExtra.getParcelable("response");
    }

    public final void b(AuthenticationResponse authenticationResponse) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putParcelable("response", authenticationResponse);
        intent.putExtra("EXTRA_AUTH_RESPONSE", bundle);
        setResult(-1, intent);
        finish();
    }

    public final void c() {
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1138) {
            dxhy dxhyVar = new dxhy();
            if (i2 == -2) {
                dxhyVar.a = dxhz.ERROR;
                String stringExtra = intent == null ? "Invalid message format" : intent.getStringExtra("ERROR");
                if (stringExtra == null) {
                    stringExtra = "Unknown error";
                }
                dxhyVar.e = stringExtra;
            } else {
                char c = 65535;
                if (i2 == -1) {
                    Bundle bundle = (Bundle) intent.getParcelableExtra("REPLY");
                    if (bundle == null) {
                        dxhyVar.a = dxhz.ERROR;
                        dxhyVar.e = "Missing response data";
                    } else {
                        String string = bundle.getString("RESPONSE_TYPE", "unknown");
                        if (String.valueOf(string).length() == 0) {
                            new String("Response: ");
                        }
                        int hashCode = string.hashCode();
                        if (hashCode != 3059181) {
                            if (hashCode == 110541305 && string.equals("token")) {
                                c = 0;
                            }
                        } else if (string.equals("code")) {
                            c = 1;
                        }
                        if (c == 0) {
                            String string2 = bundle.getString("ACCESS_TOKEN");
                            int i3 = bundle.getInt("EXPIRES_IN");
                            dxhyVar.a = dxhz.TOKEN;
                            dxhyVar.c = string2;
                            dxhyVar.f = i3;
                        } else if (c == 1) {
                            String string3 = bundle.getString("AUTHORIZATION_CODE");
                            dxhyVar.a = dxhz.CODE;
                            dxhyVar.b = string3;
                        } else {
                            dxhyVar.a = dxhz.UNKNOWN;
                        }
                    }
                } else {
                    dxhyVar.a = dxhz.EMPTY;
                }
            }
            dxht dxhtVar = this.a;
            dxhtVar.e = this;
            dxhtVar.a(dxhyVar.a());
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.com_spotify_sdk_login_activity);
        Bundle bundleExtra = getIntent().getBundleExtra("EXTRA_AUTH_REQUEST");
        this.b = bundleExtra == null ? null : (AuthenticationRequest) bundleExtra.getParcelable("request");
        this.a.e = this;
        if (getCallingActivity() == null) {
            finish();
            return;
        }
        AuthenticationRequest authenticationRequest = this.b;
        if (authenticationRequest == null) {
            setResult(0);
            finish();
            return;
        }
        authenticationRequest.a().toString();
        dxht dxhtVar = this.a;
        AuthenticationRequest authenticationRequest2 = this.b;
        if (dxhtVar.b) {
            return;
        }
        dxhtVar.b = true;
        for (dxhu dxhuVar : dxhtVar.d) {
            dxhuVar.c(new dxhs(dxhtVar, dxhuVar));
            if (dxhuVar.a(dxhtVar.a, authenticationRequest2)) {
                dxhtVar.c = dxhuVar;
                return;
            }
            dxht.c(dxhuVar);
        }
    }

    @Override // android.app.Activity
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.a.a(AuthenticationResponse.a(intent.getData()));
    }

    @Override // android.app.Activity
    protected final void onPause() {
        super.onPause();
        this.c = true;
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        if (this.c) {
            this.c = false;
            c();
        }
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        dxht dxhtVar = this.a;
        if (dxhtVar.b) {
            dxhtVar.b = false;
            dxht.c(dxhtVar.c);
            LoginActivity loginActivity = dxhtVar.e;
            if (loginActivity != null) {
                loginActivity.c();
                dxhtVar.e = null;
            }
        }
        this.a.e = null;
        super.onDestroy();
    }
}
