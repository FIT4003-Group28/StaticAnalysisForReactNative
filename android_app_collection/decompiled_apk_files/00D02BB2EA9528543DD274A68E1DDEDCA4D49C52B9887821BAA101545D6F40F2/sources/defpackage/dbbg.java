package defpackage;

import android.os.Bundle;
import com.google.ar.core.exceptions.FatalException;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: dbbg  reason: default package */
/* loaded from: classes5.dex */
final class dbbg extends daid {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ dbbi b;

    public dbbg(dbbi dbbiVar, AtomicBoolean atomicBoolean) {
        this.b = dbbiVar;
        this.a = atomicBoolean;
    }

    @Override // defpackage.daie
    public final void b(Bundle bundle) {
        if (this.a.getAndSet(true)) {
            return;
        }
        int i = bundle.getInt("error.code", -100);
        int i2 = bundle.getInt("install.status", 0);
        if (i2 == 4) {
            this.b.c.a(dbaz.COMPLETED);
        } else if (i != 0) {
            StringBuilder sb = new StringBuilder(51);
            sb.append("requestInstall = ");
            sb.append(i);
            sb.append(", launching fullscreen.");
            sb.toString();
            dbbi dbbiVar = this.b;
            dbbk.g(dbbiVar.a, dbbiVar.c);
        } else if (bundle.containsKey("resolution.intent")) {
            dbbi dbbiVar2 = this.b;
            dbbk.i(dbbiVar2.a, bundle, dbbiVar2.c);
        } else if (i2 == 10) {
            this.b.c.b(new FatalException("Unexpected REQUIRES_UI_INTENT install status without an intent."));
        } else {
            switch (i2) {
                case 1:
                case 2:
                case 3:
                    this.b.c.a(dbaz.ACCEPTED);
                    return;
                case 4:
                    this.b.c.a(dbaz.COMPLETED);
                    return;
                case 5:
                    this.b.c.b(new FatalException("Unexpected FAILED install status without error."));
                    return;
                case 6:
                    this.b.c.a(dbaz.CANCELLED);
                    return;
                default:
                    dbay dbayVar = this.b.c;
                    StringBuilder sb2 = new StringBuilder(38);
                    sb2.append("Unexpected install status: ");
                    sb2.append(i2);
                    dbayVar.b(new FatalException(sb2.toString()));
                    return;
            }
        }
    }

    @Override // defpackage.daie
    public final void c(Bundle bundle) {
    }
}
