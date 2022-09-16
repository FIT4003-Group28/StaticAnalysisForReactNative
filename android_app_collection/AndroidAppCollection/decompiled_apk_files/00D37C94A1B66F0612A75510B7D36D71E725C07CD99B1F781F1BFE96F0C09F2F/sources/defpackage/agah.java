package defpackage;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: agah  reason: default package */
/* loaded from: classes.dex */
public final class agah implements yjo {
    public final agaj a;
    private final agfc b;

    public agah(agaj agajVar, agfc agfcVar) {
        this.a = agajVar;
        this.b = agfcVar;
    }

    @Override // defpackage.yjo
    public final int a(Bundle bundle) {
        final String string = bundle.getString("renderer_class_name");
        if (string == null) {
            return 1;
        }
        final String string2 = bundle.getString("unique_payload_id");
        byte[] byteArray = bundle.getByteArray("com.google.android.libraries.youtube.notification.pref.notification_renderer");
        if (byteArray != null) {
            this.a.a(byteArray, string);
            return 0;
        } else if (string2 == null) {
            return 1;
        } else {
            final agfc agfcVar = this.b;
            return ((Integer) ylx.g(anii.h(anii.i(anii.h(agfcVar.a.a(), new wdx(string2, 20), anjk.a), new anir() { // from class: agfb
                @Override // defpackage.anir
                public final ankt a(Object obj) {
                    final aoob aoobVar = (aoob) obj;
                    return anii.h(agfc.this.a.b(new aiov(string2, 1), anjk.a), new ampg() { // from class: agez
                        @Override // defpackage.ampg
                        public final Object apply(Object obj2) {
                            Void r2 = (Void) obj2;
                            return aoob.this;
                        }
                    }, anjk.a);
                }
            }, anjk.a), new ampg() { // from class: agag
                @Override // defpackage.ampg
                public final Object apply(Object obj) {
                    agah agahVar = agah.this;
                    agahVar.a.a(((aoob) obj).I(), string);
                    return 0;
                }
            }, anjk.a), 1L, TimeUnit.HOURS, 1)).intValue();
        }
    }
}
