package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
/* compiled from: PG */
/* renamed from: acut  reason: default package */
/* loaded from: classes.dex */
public final class acut extends acsx {
    public final acuu j;

    public acut(zfq zfqVar, yni yniVar, actm actmVar, actr actrVar, acuu acuuVar, acuf acufVar, Context context, aadd aaddVar, axxb axxbVar) {
        super(zfqVar, yniVar, actmVar, actrVar, acufVar, context, aaddVar, axxbVar);
        this.j = acuuVar;
    }

    public final Bundle J() {
        return this.j.a;
    }

    public final void K(Bundle bundle, apzg apzgVar) {
        if (bundle != null) {
            if (this.j.a != null) {
                return;
            }
            L(bundle);
            return;
        }
        Bundle b = acuu.b(apzgVar);
        if (b == null) {
            return;
        }
        L(b);
    }

    public final void L(Bundle bundle) {
        this.j.a = bundle;
    }

    @Override // defpackage.acsx, defpackage.acti
    public final InteractionLoggingScreen d(acup acupVar, apzg apzgVar, asjj asjjVar) {
        if (apzgVar == null) {
            apzgVar = acuu.c(this.j.a);
        }
        InteractionLoggingScreen d = super.d(acupVar, apzgVar, asjjVar);
        this.j.a = acuu.a(this);
        return d;
    }
}
