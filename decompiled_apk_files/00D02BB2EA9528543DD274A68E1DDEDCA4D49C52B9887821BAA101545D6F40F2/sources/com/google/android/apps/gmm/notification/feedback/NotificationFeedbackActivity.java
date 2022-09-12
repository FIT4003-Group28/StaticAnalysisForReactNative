package com.google.android.apps.gmm.notification.feedback;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class NotificationFeedbackActivity extends gga implements btss {
    public gdo k;
    public efc l;
    public aunp m;
    private aulz n;

    public final void o() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            finish();
            return;
        }
        byte[] byteArray = extras.getByteArray("survey_key");
        if (byteArray != null) {
            try {
                dkps dkpsVar = (dkps) dsqw.cq(dkps.k, byteArray);
                auni auniVar = (auni) bvrs.b(extras.getByteArray("notification_instance_key"), (dssr) auni.e.cu(7));
                if (auniVar == null) {
                    finish();
                    return;
                }
                boolean z = true;
                if (!this.m.b(auniVar, 3)) {
                    if (!dbsj.d(dkpsVar.e)) {
                        if ((dkpsVar.a & 32) == 0) {
                            z = false;
                        }
                        dbsk.a(z);
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("survey", dkpsVar.bS());
                        bundle.putByteArray("notification_instance", auniVar.bS());
                        aumh aumhVar = new aumh();
                        aumhVar.B(bundle);
                        D(aumhVar);
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putByteArray("survey", dkpsVar.bS());
                    bundle2.putByteArray("notification_instance", auniVar.bS());
                    auma aumaVar = new auma();
                    aumaVar.B(bundle2);
                    D(aumaVar);
                    return;
                }
                Toast.makeText(this, (int) R.string.NOTIFICATION_FEEDBACK_ALREADY_RATED_TOAST, 1).show();
                finish();
                return;
            } catch (dsrm unused) {
                finish();
                return;
            }
        }
        finish();
    }

    @Override // defpackage.gga, defpackage.ff, defpackage.agi, defpackage.iw, android.app.Activity
    public final void onCreate(@dzsi Bundle bundle) {
        aulz aulzVar = (aulz) btsq.a(aulz.class, this);
        this.n = aulzVar;
        aulzVar.xd(this);
        super.onCreate(bundle);
        if (bundle == null) {
            o();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ff, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        B(new auly(this));
    }

    @Override // defpackage.gga, defpackage.rb, defpackage.ff, android.app.Activity
    public final void onStart() {
        super.onStart();
        this.k.a();
    }

    @Override // defpackage.gga, defpackage.rb, defpackage.ff, android.app.Activity
    public final void onStop() {
        this.k.d();
        super.onStop();
    }

    @Override // defpackage.gga
    protected final void q() {
    }

    @Override // defpackage.gga
    public final efc r() {
        return this.l;
    }

    @Override // defpackage.gga
    public final void s() {
    }

    @Override // defpackage.btss
    public final <T extends btsy> T t(Class<T> cls) {
        return cls.cast(this.n);
    }
}
