package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: agyp  reason: default package */
/* loaded from: classes.dex */
public final class agyp {
    public final Context a;
    private final aynx b;
    private String c = null;
    private aypg d = null;

    public agyp(Context context, aynx aynxVar) {
        this.a = context;
        this.b = aynxVar;
    }

    public final synchronized String a() {
        String str;
        str = this.c;
        aypg aypgVar = this.d;
        if (aypgVar != null) {
            azof.f((AtomicReference) aypgVar);
            this.d = null;
            this.c = null;
        }
        return str;
    }

    public final synchronized void b(String str) {
        if (this.d == null) {
            this.c = str;
            this.d = this.b.Z(new ayqb() { // from class: agyo
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    String a;
                    agyp agypVar = agyp.this;
                    if (!((Boolean) obj).booleanValue() || (a = agypVar.a()) == null) {
                        return;
                    }
                    Intent intent = new Intent();
                    intent.setClassName(agypVar.a, a);
                    intent.setAction("com.google.android.libraries.youtube.offline.transfer.service.ActionWakeup");
                    ahdm.a(agypVar.a, intent);
                }
            });
        }
    }
}
