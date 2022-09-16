package com.google.android.apps.youtube.app.application.upgrade;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.app.application.upgrade.NewVersionAvailableActivity;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class NewVersionAvailableActivity extends egk implements View.OnClickListener {
    public acti b;
    public aacz c;
    private boolean d;
    private TextView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private View i;
    private Intent j;
    private final aafo k = new aafo() { // from class: egl
        @Override // defpackage.aafo
        public final /* synthetic */ void a(apzg apzgVar) {
            aafn.a(this, apzgVar);
        }

        @Override // defpackage.aafo
        public final /* synthetic */ void b(List list) {
            aafn.b(this, list);
        }

        @Override // defpackage.aafo
        public final void c(apzg apzgVar, Map map) {
            NewVersionAvailableActivity newVersionAvailableActivity = NewVersionAvailableActivity.this;
            if (apzgVar.qn(UrlEndpointOuterClass.urlEndpoint)) {
                yja.f(newVersionAvailableActivity, Uri.parse(((avvk) apzgVar.qm(UrlEndpointOuterClass.urlEndpoint)).c));
            }
        }

        @Override // defpackage.aafo
        public final /* synthetic */ void d(List list, Map map) {
            aafn.c(this, list, map);
        }

        @Override // defpackage.aafo
        public final /* synthetic */ void e(List list, Object obj) {
            aafn.d(this, list, obj);
        }
    };

    private final void b() {
        if (this.j != null) {
            this.b.H(3, new acte(acuo.b(24403)), null);
            startActivity(this.j);
        }
        finish();
    }

    private final void c() {
        atfw atfwVar = this.c.b().k;
        if (atfwVar == null) {
            atfwVar = atfw.a;
        }
        avtk avtkVar = atfwVar.e;
        if (avtkVar == null) {
            avtkVar = avtk.a;
        }
        if ((avtkVar.b & 64) != 0) {
            asxu asxuVar = avtkVar.d;
            if (asxuVar == null) {
                asxuVar = asxu.a;
            }
            arag aragVar = asxuVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            Spanned b = ajgl.b(aragVar);
            if (b != null) {
                this.f.setText(b);
            }
            arag aragVar2 = asxuVar.c;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            Spanned b2 = ajgl.b(aragVar2);
            if (b2 != null) {
                this.e.setText(b2);
            }
            arag aragVar3 = asxuVar.b;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
            Spanned a = aafv.a(aragVar3, this.k, false);
            if (a != null) {
                this.h.setText(a);
            }
            arag aragVar4 = asxuVar.e;
            if (aragVar4 == null) {
                aragVar4 = arag.a;
            }
            Spanned b3 = ajgl.b(aragVar4);
            if (b3 != null && b3.length() > 0) {
                this.g.setText(b3);
            }
            if (!asxuVar.f) {
                return;
            }
            this.e.setVisibility(8);
            this.i.setVisibility(8);
        }
    }

    @Override // defpackage.abp, android.app.Activity
    public final void onBackPressed() {
        if (this.f.getVisibility() == 0) {
            b();
        } else {
            finish();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.e) {
            this.b.H(3, new acte(acuo.b(24404)), null);
            yja.j(this, true != this.d ? "unknown" : "force", zfm.c(this));
            finish();
        } else if (view != this.f) {
        } else {
            b();
        }
    }

    @Override // defpackage.dt, defpackage.abp, defpackage.gb, android.app.Activity
    public final void onCreate(Bundle bundle) {
        emn.D(this);
        super.onCreate(bundle);
        setContentView(R.layout.new_version_available_activity);
        Intent intent = getIntent();
        this.j = (Intent) intent.getParcelableExtra("forward_intent");
        this.d = intent.getBooleanExtra("show_force_upgrade", false);
        TextView textView = (TextView) findViewById(R.id.install_button);
        this.e = textView;
        textView.setOnClickListener(this);
        this.i = findViewById(R.id.install_button_background);
        this.h = (TextView) findViewById(R.id.upgrade_details);
        this.g = (TextView) findViewById(R.id.title);
        this.f = (TextView) findViewById(R.id.later_button);
        c();
        if (this.d) {
            this.b.d(acuo.a(24402), null, null);
            this.b.n(new acte(acuo.b(24404)));
            this.f.setVisibility(8);
            return;
        }
        this.b.d(acuo.a(24400), null, null);
        this.b.n(new acte(acuo.b(24404)));
        this.b.n(new acte(acuo.b(24403)));
        this.f.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oa, defpackage.dt, android.app.Activity
    public final void onStart() {
        super.onStart();
        c();
    }
}
