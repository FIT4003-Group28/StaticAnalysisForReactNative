package com.google.android.libraries.parenttools.youtube;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.youtube.R;
import java.io.Serializable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ParentToolsActivity extends oa implements usq {
    private byte[] b;
    private boolean d;
    private usj e;
    private String f;
    private boolean a = false;
    private final ScheduledExecutorService c = new ScheduledThreadPoolExecutor(1);
    private int i = 1;
    private usk g = usk.UNKNOWN;
    private boolean h = false;

    public static ush a(Context context) {
        ush ushVar = new ush();
        ushVar.a = context;
        return ushVar;
    }

    private final void e(int i, int i2) {
        if (this.d) {
            usj usjVar = this.e;
            String str = i != 1 ? "NOT_ONBOARDED" : "ONBOARDED";
            String str2 = i2 != 1 ? i2 != 2 ? "CLOSED_BY_ERROR" : "CLOSED_BY_USER" : "CLOSED_BY_WEB_APP";
            int i3 = this.i;
            String a = usg.a(i3);
            if (i3 == 0) {
                throw null;
            }
            ((vpg) usjVar.d.get()).b(str, str2, a, this.f, this.g.name());
            this.h = true;
        }
    }

    @Override // defpackage.usq
    public final void b() {
        if (this.d) {
            usj usjVar = this.e;
            int i = this.i;
            String a = usg.a(i);
            if (i == 0) {
                throw null;
            }
            ((vpg) usjVar.c.get()).b(a, this.f, this.g.name());
        }
    }

    @Override // defpackage.usq
    public final void c(ParentToolsResult parentToolsResult, int i) {
        usv usvVar = new usv(parentToolsResult);
        usvVar.a = this.b;
        ParentToolsResult a = usvVar.a();
        Intent intent = new Intent();
        intent.putExtra("parent_tools_result", a);
        setResult(-1, intent);
        int i2 = 2;
        if (((AutoValue_ParentToolsResult) parentToolsResult).b - 1 == 2) {
            i2 = 1;
        }
        e(i2, i);
        finish();
        overridePendingTransition(R.anim.pt_slide_in_left, R.anim.pt_slide_out_right);
    }

    @Override // defpackage.usq
    public final void d(int i, String str) {
        if (this.d) {
            usj usjVar = this.e;
            String str2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "NETWORK_ERROR" : "WEB_PAGE_LOAD_ERROR" : "OAUTH_TOKEN_ERROR" : "ACCOUNT_ACQUISITION_ERROR" : "MISSING_REQUIRED_PARAMS";
            int i2 = this.i;
            String a = usg.a(i2);
            if (i2 == 0) {
                throw null;
            }
            ((vpg) usjVar.e.get()).b(str2, str, a, this.f, this.g.name());
        }
    }

    @Override // defpackage.abp, android.app.Activity
    public final void onBackPressed() {
        if (this.a) {
            finishAffinity();
        }
        super.onBackPressed();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.dt, defpackage.abp, defpackage.gb, android.app.Activity
    public final void onCreate(Bundle bundle) {
        char c;
        int i;
        super.onCreate(bundle);
        setContentView(R.layout.parent_tools_activity);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.a = extras.getBoolean("should_block_system_back_button", false);
            this.b = extras.getByteArray("host_client_data");
            String string = extras.getString("client_name");
            int i2 = 1;
            switch (string.hashCode()) {
                case -2142676268:
                    if (string.equals("HOST_CLIENT_NAME_ANDROID_KIDS")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1844611154:
                    if (string.equals("HOST_CLIENT_NAME_FAMILY_LINK_ANDROID")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -1653741425:
                    if (string.equals("HOST_CLIENT_NAME_WEB_KIDS")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1479166400:
                    if (string.equals("HOST_CLIENT_NAME_MAIN_ANDROID")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1285787309:
                    if (string.equals("HOST_CLIENT_NAME_UNKNOWN")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -971722658:
                    if (string.equals("HOST_CLIENT_NAME_MAIN_IOS")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -971709531:
                    if (string.equals("HOST_CLIENT_NAME_MAIN_WEB")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 554584476:
                    if (string.equals("HOST_CLIENT_NAME_MUSIC_IOS")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 554597603:
                    if (string.equals("HOST_CLIENT_NAME_MUSIC_WEB")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 1228932830:
                    if (string.equals("HOST_CLIENT_NAME_GOOGLE_HOME_ANDROID")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 1304723582:
                    if (string.equals("HOST_CLIENT_NAME_MUSIC_ANDROID")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 1364351180:
                    if (string.equals("HOST_CLIENT_NAME_FAMILY_LINK_IOS")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1364364307:
                    if (string.equals("HOST_CLIENT_NAME_FAMILY_LINK_WEB")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1493958652:
                    if (string.equals("HOST_CLIENT_NAME_GOOGLE_HOME_IOS")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 1493971779:
                    if (string.equals("HOST_CLIENT_NAME_GOOGLE_HOME_WEB")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    i = 1;
                    break;
                case 1:
                    i = 2;
                    break;
                case 2:
                    i = 9;
                    break;
                case 3:
                    i = 3;
                    break;
                case 4:
                    i = 4;
                    break;
                case 5:
                    i = 5;
                    break;
                case 6:
                    i = 6;
                    break;
                case 7:
                    i = 7;
                    break;
                case '\b':
                    i = 8;
                    break;
                case '\t':
                    i = 10;
                    break;
                case '\n':
                    i = 11;
                    break;
                case 11:
                    i = 12;
                    break;
                case '\f':
                    i = 13;
                    break;
                case '\r':
                    i = 14;
                    break;
                case 14:
                    i = 15;
                    break;
                default:
                    throw new IllegalArgumentException();
            }
            int i3 = i - 1;
            if (i3 == 1) {
                i2 = 3;
            } else if (i3 == 3) {
                i2 = 4;
            } else if (i3 == 6) {
                i2 = 2;
            }
            this.i = i2;
            this.f = extras.getString("client_version");
            Serializable serializable = extras.getSerializable("parent_tools_use_case");
            if (serializable instanceof usk) {
                this.g = (usk) serializable;
            }
            extras.getString("parent_account_name");
            this.d = extras.getBoolean("is_logging_enabled", false);
        }
        this.e = new usj(this.c, new vpb(this, "STREAMZ_YOUTUBE_PARENT_TOOLS_MOBILE"), getApplication());
        overridePendingTransition(R.anim.pt_slide_in_right, R.anim.pt_slide_out_left);
        usu usuVar = new usu();
        usuVar.ae(extras);
        ex l = getSupportFragmentManager().l();
        l.p(R.id.content_fragment, usuVar);
        l.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, android.app.Activity
    public final void onPause() {
        if (!this.h) {
            e(2, 2);
        }
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, android.app.Activity
    public final void onResume() {
        this.h = false;
        if (this.d) {
            usj usjVar = this.e;
            int i = this.i;
            String a = usg.a(i);
            if (i == 0) {
                throw null;
            }
            ((vpg) usjVar.b.get()).b(a, this.f, this.g.name());
        }
        super.onResume();
    }
}
