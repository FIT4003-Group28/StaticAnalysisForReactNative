package defpackage;

import android.content.Intent;
import android.os.Bundle;
import java.io.ByteArrayInputStream;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: ryr  reason: default package */
/* loaded from: classes4.dex */
public final class ryr extends dp {
    private ryq a;
    private ryh b;
    private amuk c;
    private amuk d;
    private String e;

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        amuk g;
        super.mQ(bundle);
        aC();
        Bundle bundle2 = this.m;
        bundle2.getClass();
        try {
            aorb parserForType = aoev.a.getParserForType();
            amuf f = amuk.f();
            byte[] byteArray = bundle2.getByteArray("android_app_flip_list");
            if (byteArray == null) {
                g = f.g();
            } else {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
                while (true) {
                    Object g2 = parserForType.g(byteArrayInputStream, aoos.b());
                    if (g2 == null) {
                        break;
                    }
                    f.h(g2);
                }
                g = f.g();
            }
            this.c = g;
            String[] stringArray = bundle2.getStringArray("SCOPE");
            stringArray.getClass();
            this.d = amuk.p(stringArray);
            String string = bundle2.getString("google_client_id");
            string.getClass();
            this.e = string;
            this.a = (ryq) bb.a(mJ()).a(ryq.class);
            ryh ryhVar = (ryh) bb.a(mJ()).a(ryh.class);
            this.b = ryhVar;
            ryhVar.i(aots.STATE_APP_FLIP);
            this.b.h(aotq.EVENT_APP_FLIP_3P_APP_SUPPORTED);
            startActivityForResult((Intent) rzv.a(rb().getPackageManager(), this.c, this.d, this.e).c(), 1);
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot parse List<AndroidAppFlip> from argument bundle", e);
        }
    }

    @Override // defpackage.dp
    public final void S(int i, int i2, Intent intent) {
        ryp b;
        if (i == 1) {
            if (i2 == -1) {
                if (intent != null) {
                    String stringExtra = intent.getStringExtra("AUTHORIZATION_CODE");
                    if (stringExtra == null) {
                        this.b.h(aotq.EVENT_APP_FLIP_3P_ERROR_RECOVERABLE);
                        this.b.l(5, 6, 0, null);
                        b = ryp.b(15);
                    } else {
                        this.b.h(aotq.EVENT_APP_FLIP_FLOW_SUCCESS);
                        this.b.l(3, 0, 0, null);
                        b = ryp.a(2, stringExtra);
                    }
                    this.a.d(b);
                }
                i2 = -1;
            }
            if (i2 == 0) {
                this.b.h(aotq.EVENT_APP_FLIP_FLOW_CANCELED);
                this.b.l(4, 0, 0, null);
                b = ryp.b(14);
            } else if (i2 != -2 || intent == null) {
                this.b.h(aotq.EVENT_APP_FLIP_3P_ERROR_RECOVERABLE);
                this.b.l(5, 6, 0, null);
                b = ryp.b(15);
            } else {
                int intExtra = intent.getIntExtra("ERROR_TYPE", 1);
                int intExtra2 = intent.getIntExtra("ERROR_CODE", 15);
                String stringExtra2 = intent.getStringExtra("ERROR_DESCRIPTION");
                if (intExtra == 2) {
                    if (intExtra2 == 13) {
                        this.b.h(aotq.EVENT_APP_FLIP_3P_CONSENT_REJECTED);
                        this.b.l(4, 4, 13, stringExtra2);
                    } else {
                        this.b.h(aotq.EVENT_APP_FLIP_3P_ERROR_UNRECOVERABLE);
                        this.b.l(5, 4, intExtra2, stringExtra2);
                    }
                    b = ryp.c(2, intExtra2);
                } else if (intExtra == 3) {
                    this.b.h(aotq.EVENT_APP_FLIP_3P_ERROR_RECOVERABLE);
                    this.b.l(5, 5, intExtra2, stringExtra2);
                    b = ryp.b(intExtra2);
                } else {
                    this.b.h(aotq.EVENT_APP_FLIP_3P_ERROR_RECOVERABLE);
                    this.b.l(4, 0, 0, null);
                    this.b.l(5, 3, intExtra2, stringExtra2);
                    b = ryp.b(intExtra2);
                }
            }
            this.a.d(b);
        }
    }
}
