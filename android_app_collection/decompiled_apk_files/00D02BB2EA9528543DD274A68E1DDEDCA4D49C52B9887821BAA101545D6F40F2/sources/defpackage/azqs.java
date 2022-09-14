package defpackage;

import android.app.Application;
import android.content.Context;
import java.io.File;
/* compiled from: PG */
/* renamed from: azqs  reason: default package */
/* loaded from: classes3.dex */
public final class azqs {
    public final Context a;

    static {
        eato.b("yyyy-MM-dd_kk.mm.ss");
    }

    public azqs(Application application) {
        this.a = application;
        dbud.a(new dbty(this) { // from class: azqr
            private final azqs a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return new File(this.a.a.getExternalFilesDir(null), "syncv2-process-history.log");
            }
        });
    }
}
